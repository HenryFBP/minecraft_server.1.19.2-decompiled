import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aie implements aim {
   static final Logger b = LogUtils.getLogger();
   protected final List<aie.c> a = Lists.newArrayList();
   final ahm c;
   private final String d;

   public aie(ahm $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(ahl $$0) {
      this.a($$0.a(), $$0, null);
   }

   public void a(ahl $$0, Predicate<abb> $$1) {
      this.a($$0.a(), $$0, $$1);
   }

   public void a(String $$0, Predicate<abb> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable ahl $$1, @Nullable Predicate<abb> $$2) {
      this.a.add(new aie.c($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.d);
   }

   @Override
   public Optional<aik> getResource(abb $$0) {
      if (!this.c($$0)) {
         return Optional.empty();
      } else {
         for(int $$1 = this.a.size() - 1; $$1 >= 0; --$$1) {
            aie.c $$2 = (aie.c)this.a.get($$1);
            ahl $$3 = $$2.b;
            if ($$3 != null && $$3.b(this.c, $$0)) {
               return Optional.of(new aik($$3.a(), this.a($$0, $$3), this.a($$0, $$1)));
            }

            if ($$2.a($$0)) {
               b.warn("Resource {} not found, but was filtered by pack {}", $$0, $$2.a);
               return Optional.empty();
            }
         }

         return Optional.empty();
      }
   }

   aik.a<InputStream> a(abb $$0, ahl $$1) {
      return b.isDebugEnabled() ? () -> {
         InputStream $$2 = $$1.a(this.c, $$0);
         return new aie.b($$2, $$0, $$1.a());
      } : () -> $$1.a(this.c, $$0);
   }

   private boolean c(abb $$0) {
      return !$$0.a().contains("..");
   }

   @Override
   public List<aik> a(abb $$0) {
      if (!this.c($$0)) {
         return List.of();
      } else {
         List<aie.d> $$1 = Lists.newArrayList();
         abb $$2 = b($$0);
         String $$3 = null;

         for(aie.c $$4 : this.a) {
            if ($$4.a($$0)) {
               if (!$$1.isEmpty()) {
                  $$3 = $$4.a;
               }

               $$1.clear();
            } else if ($$4.a($$2)) {
               $$1.forEach(aie.d::a);
            }

            ahl $$5 = $$4.b;
            if ($$5 != null && $$5.b(this.c, $$0)) {
               $$1.add(new aie.d($$0, $$2, $$5));
            }
         }

         if ($$1.isEmpty() && $$3 != null) {
            b.info("Resource {} was filtered by pack {}", $$0, $$3);
         }

         return $$1.stream().map(aie.d::b).toList();
      }
   }

   @Override
   public Map<abb, aik> b(String $$0, Predicate<abb> $$1) {
      Object2IntMap<abb> $$2 = new Object2IntOpenHashMap();
      int $$3 = this.a.size();

      for(int $$4 = 0; $$4 < $$3; ++$$4) {
         aie.c $$5 = (aie.c)this.a.get($$4);
         $$5.a($$2.keySet());
         if ($$5.b != null) {
            for(abb $$6 : $$5.b.a(this.c, this.d, $$0, $$1)) {
               $$2.put($$6, $$4);
            }
         }
      }

      Map<abb, aik> $$7 = Maps.newTreeMap();
      ObjectIterator var12 = Object2IntMaps.fastIterable($$2).iterator();

      while(var12.hasNext()) {
         Entry<abb> $$8 = (Entry)var12.next();
         int $$9 = $$8.getIntValue();
         abb $$10 = (abb)$$8.getKey();
         ahl $$11 = ((aie.c)this.a.get($$9)).b;
         $$7.put($$10, new aik($$11.a(), this.a($$10, $$11), this.a($$10, $$9)));
      }

      return $$7;
   }

   private aik.a<aio> a(abb $$0, int $$1) {
      return () -> {
         abb $$2 = b($$0);

         for(int $$3 = this.a.size() - 1; $$3 >= $$1; --$$3) {
            aie.c $$4 = (aie.c)this.a.get($$3);
            ahl $$5 = $$4.b;
            if ($$5 != null && $$5.b(this.c, $$2)) {
               InputStream $$6 = $$5.a(this.c, $$2);

               aio var8;
               try {
                  var8 = aio.a($$6);
               } catch (Throwable var11) {
                  if ($$6 != null) {
                     try {
                        $$6.close();
                     } catch (Throwable var10) {
                        var11.addSuppressed(var10);
                     }
                  }

                  throw var11;
               }

               if ($$6 != null) {
                  $$6.close();
               }

               return var8;
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return aio.a;
      };
   }

   private static void a(aie.c $$0, Map<abb, aie.a> $$1) {
      Iterator<java.util.Map.Entry<abb, aie.a>> $$2 = $$1.entrySet().iterator();

      while($$2.hasNext()) {
         java.util.Map.Entry<abb, aie.a> $$3 = (java.util.Map.Entry)$$2.next();
         abb $$4 = (abb)$$3.getKey();
         aie.a $$5 = (aie.a)$$3.getValue();
         if ($$0.a($$4)) {
            $$2.remove();
         } else if ($$0.a($$5.a())) {
            $$5.b.forEach(aie.d::a);
         }
      }

   }

   private void a(aie.c $$0, String $$1, Predicate<abb> $$2, Map<abb, aie.a> $$3) {
      ahl $$4 = $$0.b;
      if ($$4 != null) {
         for(abb $$5 : $$4.a(this.c, this.d, $$1, $$2)) {
            abb $$6 = b($$5);
            ((aie.a)$$3.computeIfAbsent($$5, $$1x -> new aie.a($$6, Lists.newArrayList()))).b().add(new aie.d($$5, $$6, $$4));
         }

      }
   }

   @Override
   public Map<abb, List<aik>> c(String $$0, Predicate<abb> $$1) {
      Map<abb, aie.a> $$2 = Maps.newHashMap();

      for(aie.c $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<abb, List<aik>> $$4 = Maps.newTreeMap();
      $$2.forEach(($$1x, $$2x) -> $$4.put($$1x, $$2x.c()));
      return $$4;
   }

   @Override
   public Stream<ahl> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static abb b(abb $$0) {
      return new abb($$0.b(), $$0.a() + ".mcmeta");
   }

   static record a(abb a, List<aie.d> b) {
      final List<aie.d> b;

      List<aik> c() {
         return this.b().stream().map(aie.d::b).toList();
      }
   }

   static class b extends FilterInputStream {
      private final String a;
      private boolean b;

      public b(InputStream $$0, abb $$1, String $$2) {
         super($$0);
         ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
         new Exception().printStackTrace(new PrintStream($$3));
         this.a = "Leaked resource: '" + $$1 + "' loaded from pack: '" + $$2 + "'\n" + $$3;
      }

      public void close() throws IOException {
         super.close();
         this.b = true;
      }

      protected void finalize() throws Throwable {
         if (!this.b) {
            aie.b.warn(this.a);
         }

         super.finalize();
      }
   }

   static record c(String a, @Nullable ahl b, @Nullable Predicate<abb> c) {
      final String a;
      @Nullable
      final ahl b;

      public void a(Collection<abb> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }

      }

      public boolean a(abb $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   class d {
      private final abb b;
      private final abb c;
      private final ahl d;
      private boolean e = true;

      d(abb $$0, abb $$1, ahl $$2) {
         this.d = $$2;
         this.b = $$0;
         this.c = $$1;
      }

      public void a() {
         this.e = false;
      }

      public aik b() {
         String $$0 = this.d.a();
         return this.e ? new aik($$0, aie.this.a(this.b, this.d), () -> {
            if (this.d.b(aie.this.c, this.c)) {
               InputStream $$0x = this.d.a(aie.this.c, this.c);

               aio var2;
               try {
                  var2 = aio.a($$0x);
               } catch (Throwable var5) {
                  if ($$0x != null) {
                     try {
                        $$0x.close();
                     } catch (Throwable var4) {
                        var5.addSuppressed(var4);
                     }
                  }

                  throw var5;
               }

               if ($$0x != null) {
                  $$0x.close();
               }

               return var2;
            } else {
               return aio.a;
            }
         }) : new aik($$0, aie.this.a(this.b, this.d));
      }
   }
}
