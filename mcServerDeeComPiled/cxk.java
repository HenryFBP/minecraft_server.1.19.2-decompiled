import com.google.common.base.Stopwatch;
import com.google.common.base.Suppliers;
import com.mojang.datafixers.Products.P1;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public abstract class cxk {
   private static final Logger e = LogUtils.getLogger();
   public static final Codec<cxk> a = hm.bC.p().dispatchStable(cxk::b, Function.identity());
   protected final hm<dlh> b;
   protected final chx c;
   private final Supplier<List<cid.b>> f;
   protected final Optional<he<dlh>> d;
   private final Function<hc<cht>, chu> g;
   private final Map<dlb, List<dly>> h = new Object2ObjectOpenHashMap();
   private final Map<dlv, CompletableFuture<List<cge>>> i = new Object2ObjectArrayMap();
   private boolean j;

   protected static <T extends cxk> P1<Mu<T>, hm<dlh>> a(Instance<T> $$0) {
      return $$0.group(aay.b(hm.aO).forGetter($$0x -> $$0x.b));
   }

   public cxk(hm<dlh> $$0, Optional<he<dlh>> $$1, chx $$2) {
      this($$0, $$1, $$2, $$0x -> ((cht)$$0x.a()).e());
   }

   public cxk(hm<dlh> $$0, Optional<he<dlh>> $$1, chx $$2, Function<hc<cht>, chu> $$3) {
      this.b = $$0;
      this.c = $$2;
      this.g = $$3;
      this.d = $$1;
      this.f = Suppliers.memoize(() -> cid.a(List.copyOf($$2.b()), $$1xx -> ((chu)$$3.apply($$1xx)).b(), true));
   }

   public Stream<hc<dlh>> a() {
      return this.d.isPresent() ? ((he)this.d.get()).a() : this.b.g().map(hc::a);
   }

   private void b(dbf $$0) {
      Set<hc<cht>> $$1 = this.c.b();
      this.a().forEach($$2 -> {
         dlh $$3 = (dlh)$$2.a();
         boolean $$4 = false;

         for(dlh.a $$5 : $$3.a()) {
            dlb $$6 = $$5.a().a();
            if ($$6.a().a().anyMatch($$1::contains)) {
               ((List)this.h.computeIfAbsent($$6, $$0xx -> new ArrayList())).add($$3.b());
               $$4 = true;
            }
         }

         if ($$4) {
            dly $$7 = $$3.b();
            if ($$7 instanceof dlv $$8) {
               this.i.put($$8, this.a($$2, $$0, $$8));
            }
         }

      });
   }

   private CompletableFuture<List<cge>> a(hc<dlh> $$0, dbf $$1, dlv $$2) {
      return $$2.c() == 0 ? CompletableFuture.completedFuture(List.of()) : CompletableFuture.supplyAsync(ad.a("placement calculation", (Supplier)(() -> {
         Stopwatch $$3 = Stopwatch.createStarted(ad.b);
         List<cge> $$4 = new ArrayList();
         int $$5 = $$2.a();
         int $$6 = $$2.c();
         int $$7 = $$2.b();
         he<cht> $$8 = $$2.d();
         amn $$9 = amn.a();
         $$9.b(this instanceof dam ? 0L : $$1.a());
         double $$10 = $$9.j() * Math.PI * 2.0;
         int $$11 = 0;
         int $$12 = 0;

         for(int $$13 = 0; $$13 < $$6; ++$$13) {
            double $$14 = (double)(4 * $$5 + $$5 * $$12 * 6) + ($$9.j() - 0.5) * (double)$$5 * 2.5;
            int $$15 = (int)Math.round(Math.cos($$10) * $$14);
            int $$16 = (int)Math.round(Math.sin($$10) * $$14);
            Pair<gt, hc<cht>> $$17 = this.c.a(hq.a($$15, 8), 0, hq.a($$16, 8), 112, $$8::a, $$9, $$1.c());
            if ($$17 != null) {
               gt $$18 = (gt)$$17.getFirst();
               $$15 = hq.a($$18.u());
               $$16 = hq.a($$18.w());
            }

            $$4.add(new cge($$15, $$16));
            $$10 += Math.PI * 2 / (double)$$7;
            if (++$$11 == $$7) {
               ++$$12;
               $$11 = 0;
               $$7 += 2 * $$7 / ($$12 + 1);
               $$7 = Math.min($$7, $$6 - $$13);
               $$10 += $$9.j() * Math.PI * 2.0;
            }
         }

         double $$19 = (double)$$3.stop().elapsed(TimeUnit.MILLISECONDS) / 1000.0;
         e.debug("Calculation for {} took {}s", $$0, $$19);
         return $$4;
      })), ad.g());
   }

   protected abstract Codec<? extends cxk> b();

   public Optional<aba<Codec<? extends cxk>>> c() {
      return hm.bC.c(this.b());
   }

   public CompletableFuture<cxj> a(hm<cht> $$0, Executor $$1, dbf $$2, dbr $$3, cho $$4, cxj $$5) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", (Supplier)(() -> {
         $$5.a(this.c, $$2.c());
         return $$5;
      })), ad.g());
   }

   public abstract void a(agn var1, long var2, dbf var4, chv var5, cho var6, cxj var7, dan.a var8);

   @Nullable
   public Pair<gt, hc<dlb>> a(agg $$0, he<dlb> $$1, gt $$2, int $$3, boolean $$4) {
      Map<dly, Set<hc<dlb>>> $$5 = new Object2ObjectArrayMap();

      for(hc<dlb> $$6 : $$1) {
         for(dly $$7 : this.a($$6, $$0.k().h())) {
            ((Set)$$5.computeIfAbsent($$7, $$0x -> new ObjectArraySet())).add($$6);
         }
      }

      if ($$5.isEmpty()) {
         return null;
      } else {
         Pair<gt, hc<dlb>> $$8 = null;
         double $$9 = Double.MAX_VALUE;
         cho $$10 = $$0.a();
         List<Entry<dly, Set<hc<dlb>>>> $$11 = new ArrayList($$5.size());

         for(Entry<dly, Set<hc<dlb>>> $$12 : $$5.entrySet()) {
            dly $$13 = (dly)$$12.getKey();
            if ($$13 instanceof dlv $$14) {
               Pair<gt, hc<dlb>> $$15 = this.a((Set<hc<dlb>>)$$12.getValue(), $$0, $$10, $$2, $$4, $$14);
               if ($$15 != null) {
                  gt $$16 = (gt)$$15.getFirst();
                  double $$17 = $$2.j($$16);
                  if ($$17 < $$9) {
                     $$9 = $$17;
                     $$8 = $$15;
                  }
               }
            } else if ($$13 instanceof dlw) {
               $$11.add($$12);
            }
         }

         if (!$$11.isEmpty()) {
            int $$18 = hq.a($$2.u());
            int $$19 = hq.a($$2.w());

            for(int $$20 = 0; $$20 <= $$3; ++$$20) {
               boolean $$21 = false;

               for(Entry<dly, Set<hc<dlb>>> $$22 : $$11) {
                  dlw $$23 = (dlw)$$22.getKey();
                  Pair<gt, hc<dlb>> $$24 = a((Set<hc<dlb>>)$$22.getValue(), $$0, $$10, $$18, $$19, $$20, $$4, $$0.B(), $$23);
                  if ($$24 != null) {
                     $$21 = true;
                     double $$25 = $$2.j((hs)$$24.getFirst());
                     if ($$25 < $$9) {
                        $$9 = $$25;
                        $$8 = $$24;
                     }
                  }
               }

               if ($$21) {
                  return $$8;
               }
            }
         }

         return $$8;
      }
   }

   @Nullable
   private Pair<gt, hc<dlb>> a(Set<hc<dlb>> $$0, agg $$1, cho $$2, gt $$3, boolean $$4, dlv $$5) {
      List<cge> $$6 = this.a($$5, $$1.k().h());
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<gt, hc<dlb>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         gt.a $$9 = new gt.a();

         for(cge $$10 : $$6) {
            $$9.d(hq.a($$10.e, 8), 32, hq.a($$10.f, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<gt, hc<dlb>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
               if ($$13 != null) {
                  $$7 = $$13;
                  $$8 = $$11;
               }
            }
         }

         return $$7;
      }
   }

   @Nullable
   private static Pair<gt, hc<dlb>> a(Set<hc<dlb>> $$0, cha $$1, cho $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, dlw $$8) {
      int $$9 = $$8.a();

      for(int $$10 = -$$5; $$10 <= $$5; ++$$10) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for(int $$12 = -$$5; $$12 <= $$5; ++$$12) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               cge $$16 = $$8.a($$7, $$14, $$15);
               Pair<gt, hc<dlb>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<gt, hc<dlb>> a(Set<hc<dlb>> $$0, cha $$1, cho $$2, boolean $$3, dly $$4, cge $$5) {
      for(hc<dlb> $$6 : $$0) {
         dld $$7 = $$2.a($$5, $$6.a(), $$3);
         if ($$7 != dld.b) {
            if (!$$3 && $$7 == dld.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            cxj $$8 = $$1.a($$5.e, $$5.f, cxn.d);
            dlj $$9 = $$2.a(hq.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(cho $$0, dlj $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(chp $$0, cxj $$1, cho $$2) {
      cge $$3 = $$1.f();
      if (!ab.a($$3)) {
         hq $$4 = hq.a($$3, $$0.aj());
         gt $$5 = $$4.p();
         hm<dlb> $$6 = $$0.s().d(hm.aN);
         Map<Integer, List<dlb>> $$7 = (Map)$$6.r().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<cid.b> $$8 = (List)this.f.get();
         dbo $$9 = new dbo(new dbq(dbg.a()));
         long $$10 = $$9.a($$0.B(), $$5.u(), $$5.w());
         Set<hc<cht>> $$11 = new ObjectArraySet();
         cge.a($$4.r(), 1).forEach($$2x -> {
            cxj $$3x = $$0.a($$2x.e, $$2x.f);

            for(cxu $$4x : $$3x.d()) {
               $$4x.j().a($$11::add);
            }

         });
         $$11.retainAll(this.c.b());
         int $$12 = $$8.size();

         try {
            hm<dkg> $$13 = $$0.s().d(hm.aM);
            int $$14 = Math.max(dan.b.values().length, $$12);

            for(int $$15 = 0; $$15 < $$14; ++$$15) {
               int $$16 = 0;
               if ($$2.a()) {
                  for(dlb $$18 : (List)$$7.getOrDefault($$15, Collections.emptyList())) {
                     $$9.b($$10, $$16, $$15);
                     Supplier<String> $$19 = () -> (String)$$6.c($$18).map(Object::toString).orElseGet($$18::toString);

                     try {
                        $$0.a($$19);
                        $$2.a($$4, $$18).forEach($$5x -> $$5x.a($$0, $$2, this, $$9, a($$1), $$3));
                     } catch (Exception var29) {
                        q $$21 = q.a(var29, "Feature placement");
                        $$21.a("Feature").a("Description", $$19::get);
                        throw new z($$21);
                     }

                     ++$$16;
                  }
               }

               if ($$15 < $$12) {
                  IntSet $$22 = new IntArraySet();

                  for(hc<cht> $$23 : $$11) {
                     List<he<dkg>> $$24 = ((chu)this.g.apply($$23)).b();
                     if ($$15 < $$24.size()) {
                        he<dkg> $$25 = (he)$$24.get($$15);
                        cid.b $$26 = (cid.b)$$8.get($$15);
                        $$25.a().map(hc::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  cid.b $$29 = (cid.b)$$8.get($$15);

                  for(int $$30 = 0; $$30 < $$27; ++$$30) {
                     int $$31 = $$28[$$30];
                     dkg $$32 = (dkg)$$29.a().get($$31);
                     Supplier<String> $$33 = () -> (String)$$13.c($$32).map(Object::toString).orElseGet($$32::toString);
                     $$9.b($$10, $$31, $$15);

                     try {
                        $$0.a($$33);
                        $$32.b($$0, this, $$9, $$5);
                     } catch (Exception var30) {
                        q $$35 = q.a(var30, "Feature placement");
                        $$35.a("Feature").a("Description", $$33::get);
                        throw new z($$35);
                     }
                  }
               }
            }

            $$0.a(null);
         } catch (Exception var31) {
            q $$37 = q.a(var31, "Biome decoration");
            $$37.a("Generation").a("CenterX", $$3.e).a("CenterZ", $$3.f).a("Seed", $$10);
            throw new z($$37);
         }
      }
   }

   public boolean a(hc<dlh> $$0, dbf $$1, long $$2, int $$3, int $$4, int $$5) {
      dlh $$6 = (dlh)$$0.a();
      if ($$6 == null) {
         return false;
      } else {
         dly $$7 = $$6.b();

         for(int $$8 = $$3 - $$5; $$8 <= $$3 + $$5; ++$$8) {
            for(int $$9 = $$4 - $$5; $$9 <= $$4 + $$5; ++$$9) {
               if ($$7.b(this, $$1, $$2, $$8, $$9)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static dkt a(cxj $$0) {
      cge $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      cgz $$4 = $$0.z();
      int $$5 = $$4.u_() + 1;
      int $$6 = $$4.ah() - 1;
      return new dkt($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(agn var1, cho var2, dbf var3, cxj var4);

   public abstract void a(agn var1);

   public int a(cgz $$0) {
      return 64;
   }

   public chx d() {
      return this.c;
   }

   public abstract int e();

   public ayx<cif.c> a(hc<cht> $$0, cho $$1, bcf $$2, gt $$3) {
      Map<dlb, LongSet> $$4 = $$1.b($$3);

      for(Entry<dlb, LongSet> $$5 : $$4.entrySet()) {
         dlb $$6 = (dlb)$$5.getKey();
         dli $$7 = (dli)$$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<dlj> $$9 = $$7.a() == dli.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
            $$1.a($$6, (LongSet)$$5.getValue(), $$2x -> {
               if ($$8.isFalse() && $$9.test($$2x)) {
                  $$8.setTrue();
               }

            });
            if ($$8.isTrue()) {
               return $$7.b();
            }
         }
      }

      return $$0.a().b().a($$2);
   }

   public void a(hn $$0, dbf $$1, cho $$2, cxj $$3, dou $$4, long $$5) {
      cge $$6 = $$3.f();
      hq $$7 = hq.a($$3);
      this.a().forEach($$8 -> {
         dly $$9 = ((dlh)$$8.a()).b();
         List<dlh.a> $$10 = ((dlh)$$8.a()).a();

         for(dlh.a $$11 : $$10) {
            dlj $$12 = $$2.a($$7, $$11.a().a(), $$3);
            if ($$12 != null && $$12.b()) {
               return;
            }
         }

         if ($$9.b(this, $$1, $$5, $$6.e, $$6.f)) {
            if ($$10.size() == 1) {
               this.a((dlh.a)$$10.get(0), $$2, $$0, $$1, $$4, $$5, $$3, $$6, $$7);
            } else {
               ArrayList<dlh.a> $$13 = new ArrayList($$10.size());
               $$13.addAll($$10);
               dbo $$14 = new dbo(new das(0L));
               $$14.c($$5, $$6.e, $$6.f);
               int $$15 = 0;

               for(dlh.a $$16 : $$13) {
                  $$15 += $$16.b();
               }

               while(!$$13.isEmpty()) {
                  int $$17 = $$14.a($$15);
                  int $$18 = 0;

                  for(dlh.a $$19 : $$13) {
                     $$17 -= $$19.b();
                     if ($$17 < 0) {
                        break;
                     }

                     ++$$18;
                  }

                  dlh.a $$20 = (dlh.a)$$13.get($$18);
                  if (this.a($$20, $$2, $$0, $$1, $$4, $$5, $$3, $$6, $$7)) {
                     return;
                  }

                  $$13.remove($$18);
                  $$15 -= $$20.b();
               }

            }
         }
      });
   }

   private boolean a(dlh.a $$0, cho $$1, hn $$2, dbf $$3, dou $$4, long $$5, cxj $$6, cge $$7, hq $$8) {
      dlb $$9 = $$0.a().a();
      int $$10 = a($$1, $$6, $$8, $$9);
      he<cht> $$11 = $$9.a();
      Predicate<hc<cht>> $$12 = $$11::a;
      dlj $$13 = $$9.a($$2, this, this.c, $$3, $$4, $$5, $$7, $$10, $$6, $$12);
      if ($$13.b()) {
         $$1.a($$8, $$9, $$13, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(cho $$0, cxj $$1, hq $$2, dlb $$3) {
      dlj $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(chp $$0, cho $$1, cxj $$2) {
      int $$3 = 8;
      cge $$4 = $$2.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      hq $$9 = hq.a($$2);

      for(int $$10 = $$5 - 8; $$10 <= $$5 + 8; ++$$10) {
         for(int $$11 = $$6 - 8; $$11 <= $$6 + 8; ++$$11) {
            long $$12 = cge.c($$10, $$11);

            for(dlj $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     xl.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  q $$15 = q.a(var21, "Generating structure reference");
                  r $$16 = $$15.a("Structure");
                  Optional<? extends hm<dlb>> $$17 = $$0.s().c(hm.aN);
                  $$16.a("Id", (s<String>)(() -> (String)$$17.map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN")));
                  $$16.a("Name", (s<String>)(() -> hm.bf.b($$13.h().e()).toString()));
                  $$16.a("Class", (s<String>)(() -> $$13.h().getClass().getCanonicalName()));
                  throw new z($$15);
               }
            }
         }
      }

   }

   public abstract CompletableFuture<cxj> a(Executor var1, dbr var2, dbf var3, cho var4, cxj var5);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, dar.a var3, cgz var4, dbf var5);

   public abstract chj a(int var1, int var2, cgz var3, dbf var4);

   public int b(int $$0, int $$1, dar.a $$2, cgz $$3, dbf $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, dar.a $$2, cgz $$3, dbf $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public void a(dbf $$0) {
      if (!this.j) {
         this.b($$0);
         this.j = true;
      }

   }

   @Nullable
   public List<cge> a(dlv $$0, dbf $$1) {
      this.a($$1);
      CompletableFuture<List<cge>> $$2 = (CompletableFuture)this.i.get($$0);
      return $$2 != null ? (List)$$2.join() : null;
   }

   private List<dly> a(hc<dlb> $$0, dbf $$1) {
      this.a($$1);
      return (List<dly>)this.h.getOrDefault($$0.a(), List.of());
   }

   public abstract void a(List<String> var1, dbf var2, gt var3);

   @Deprecated
   public chu a(hc<cht> $$0) {
      return (chu)this.g.apply($$0);
   }
}
