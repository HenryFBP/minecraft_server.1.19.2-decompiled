import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class azx {
   private static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private final dbm c;
   private final boolean d;
   private final drq.c e;
   private final Thread f;
   private final DataFixer g;
   private volatile boolean h = true;
   private volatile boolean i;
   private volatile float j;
   private volatile int k;
   private volatile int l;
   private volatile int m;
   private final Object2FloatMap<aba<cgx>> n = Object2FloatMaps.synchronize(new Object2FloatOpenCustomHashMap(ad.l()));
   private volatile rq o = rq.c("optimizeWorld.stage.counting");
   private static final Pattern p = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   private final drm q;

   public azx(drq.c $$0, DataFixer $$1, dbm $$2, boolean $$3) {
      this.c = $$2;
      this.d = $$3;
      this.g = $$1;
      this.e = $$0;
      this.q = new drm(this.e.a(cgx.e).resolve("data").toFile(), $$1);
      this.f = b.newThread(this::i);
      this.f.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.o = rq.c("optimizeWorld.stage.failed");
         this.i = true;
      });
      this.f.start();
   }

   public void a() {
      this.h = false;

      try {
         this.f.join();
      } catch (InterruptedException var2) {
      }

   }

   private void i() {
      this.k = 0;
      Builder<aba<cgx>, ListIterator<cge>> $$0 = ImmutableMap.builder();
      ImmutableSet<aba<cgx>> $$1 = this.c.f();

      List<cge> $$3;
      for(UnmodifiableIterator $$4 = $$1.iterator(); $$4.hasNext(); this.k += $$3.size()) {
         aba<cgx> $$2 = (aba)$$4.next();
         $$3 = this.b($$2);
         $$0.put($$2, $$3.listIterator());
      }

      if (this.k == 0) {
         this.i = true;
      } else {
         float $$4 = (float)this.k;
         ImmutableMap<aba<cgx>, ListIterator<cge>> $$5 = $$0.build();
         Builder<aba<cgx>, cyj> $$6 = ImmutableMap.builder();
         UnmodifiableIterator $$9 = $$1.iterator();

         while($$9.hasNext()) {
            aba<cgx> $$7 = (aba)$$9.next();
            Path $$8 = this.e.a($$7);
            $$6.put($$7, new cyj($$8.resolve("region"), this.g, true));
         }

         ImmutableMap<aba<cgx>, cyj> $$9 = $$6.build();
         long $$10 = ad.b();
         this.o = rq.c("optimizeWorld.stage.upgrading");

         while(this.h) {
            boolean $$11 = false;
            float $$12 = 0.0F;

            float $$29;
            for(UnmodifiableIterator $$31 = $$1.iterator(); $$31.hasNext(); $$12 += $$29) {
               aba<cgx> $$13 = (aba)$$31.next();
               ListIterator<cge> $$14 = (ListIterator)$$5.get($$13);
               cyj $$15 = (cyj)$$9.get($$13);
               if ($$14.hasNext()) {
                  cge $$16 = (cge)$$14.next();
                  boolean $$17 = false;

                  try {
                     pj $$18 = (pj)((Optional)$$15.f($$16).join()).orElse(null);
                     if ($$18 != null) {
                        int $$19 = cyj.a($$18);
                        cxk $$20 = this.c.d().a(dbm.b($$13)).b();
                        pj $$21 = $$15.a($$13, () -> this.q, $$18, $$20.c());
                        cge $$22 = new cge($$21.h("xPos"), $$21.h("zPos"));
                        if (!$$22.equals($$16)) {
                           a.warn("Chunk {} has invalid position {}", $$16, $$22);
                        }

                        boolean $$23 = $$19 < ab.b().getWorldVersion();
                        if (this.d) {
                           $$23 = $$23 || $$21.e("Heightmaps");
                           $$21.r("Heightmaps");
                           $$23 = $$23 || $$21.e("isLightOn");
                           $$21.r("isLightOn");
                           pp $$24 = $$21.c("sections", 10);

                           for(int $$25 = 0; $$25 < $$24.size(); ++$$25) {
                              pj $$26 = $$24.a($$25);
                              $$23 = $$23 || $$26.e("BlockLight");
                              $$26.r("BlockLight");
                              $$23 = $$23 || $$26.e("SkyLight");
                              $$26.r("SkyLight");
                           }
                        }

                        if ($$23) {
                           $$15.a($$16, $$21);
                           $$17 = true;
                        }
                     }
                  } catch (CompletionException | z var27) {
                     Throwable $$28 = var27.getCause();
                     if (!($$28 instanceof IOException)) {
                        throw var27;
                     }

                     a.error("Error upgrading chunk {}", $$16, $$28);
                  }

                  if ($$17) {
                     ++this.l;
                  } else {
                     ++this.m;
                  }

                  $$11 = true;
               }

               $$29 = (float)$$14.nextIndex() / $$4;
               this.n.put($$13, $$29);
            }

            this.j = $$12;
            if (!$$11) {
               this.h = false;
            }
         }

         this.o = rq.c("optimizeWorld.stage.finished");
         UnmodifiableIterator var34 = $$9.values().iterator();

         while(var34.hasNext()) {
            cyj $$30 = (cyj)var34.next();

            try {
               $$30.close();
            } catch (IOException var26) {
               a.error("Error upgrading chunk", var26);
            }
         }

         this.q.a();
         $$10 = ad.b() - $$10;
         a.info("World optimizaton finished after {} ms", $$10);
         this.i = true;
      }
   }

   private List<cge> b(aba<cgx> $$0) {
      File $$1 = this.e.a($$0).toFile();
      File $$2 = new File($$1, "region");
      File[] $$3 = $$2.listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
      if ($$3 == null) {
         return ImmutableList.of();
      } else {
         List<cge> $$4 = Lists.newArrayList();

         for(File $$5 : $$3) {
            Matcher $$6 = p.matcher($$5.getName());
            if ($$6.matches()) {
               int $$7 = Integer.parseInt($$6.group(1)) << 5;
               int $$8 = Integer.parseInt($$6.group(2)) << 5;

               try (cyn $$9 = new cyn($$5.toPath(), $$2.toPath(), true)) {
                  for(int $$10 = 0; $$10 < 32; ++$$10) {
                     for(int $$11 = 0; $$11 < 32; ++$$11) {
                        cge $$12 = new cge($$10 + $$7, $$11 + $$8);
                        if ($$9.b($$12)) {
                           $$4.add($$12);
                        }
                     }
                  }
               } catch (Throwable var19) {
               }
            }
         }

         return $$4;
      }
   }

   public boolean b() {
      return this.i;
   }

   public ImmutableSet<aba<cgx>> c() {
      return this.c.f();
   }

   public float a(aba<cgx> $$0) {
      return this.n.getFloat($$0);
   }

   public float d() {
      return this.j;
   }

   public int e() {
      return this.k;
   }

   public int f() {
      return this.l;
   }

   public int g() {
      return this.m;
   }

   public rq h() {
      return this.o;
   }
}
