import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class czn<T extends czc> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final czk<T> c;
   private final czf<T> d;
   private final cze<T> e;
   final czh<T> f;
   private final czl<T> g;
   private final Long2ObjectMap<czp> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<czn.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<cza<T>> k = Queues.newConcurrentLinkedQueue();

   public czn(Class<T> $$0, czk<T> $$1, czf<T> $$2) {
      this.e = new cze<>();
      this.f = new czh<>($$0, this.h);
      this.h.defaultReturnValue(czp.a);
      this.i.defaultReturnValue(czn.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new czm<>(this.e, this.f);
   }

   void a(long $$0, czg<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }

   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.co())) {
         a.warn("UUID of added entity already exists: {}", $$0);
         return false;
      } else {
         return true;
      }
   }

   public boolean a(T $$0) {
      return this.a($$0, false);
   }

   private boolean a(T $$0, boolean $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         long $$2 = hq.c($$0.da());
         czg<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new czn.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         czp $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends czc> czp a(T $$0, czp $$1) {
      return $$0.dx() ? czp.c : $$1;
   }

   public void a(Stream<T> $$0) {
      $$0.forEach($$0x -> this.a((T)$$0x, true));
   }

   public void b(Stream<T> $$0) {
      $$0.forEach($$0x -> this.a((T)$$0x, false));
   }

   void c(T $$0) {
      this.c.e($$0);
   }

   void d(T $$0) {
      this.c.d($$0);
   }

   void e(T $$0) {
      this.e.a($$0);
      this.c.c($$0);
   }

   void f(T $$0) {
      this.c.b($$0);
      this.e.b($$0);
   }

   public void a(cge $$0, afs.c $$1) {
      czp $$2 = czp.a($$1);
      this.a($$0, $$2);
   }

   public void a(cge $$0, czp $$1) {
      long $$2 = $$0.a();
      if ($$1 == czp.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         czp $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dx()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dx()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dx()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dx()).forEach(this::c);
         }

      });
   }

   private void b(long $$0) {
      czn.b $$1 = (czn.b)this.i.get($$0);
      if ($$1 == czn.b.a) {
         this.c($$0);
      }

   }

   private boolean a(long $$0, Consumer<T> $$1) {
      czn.b $$2 = (czn.b)this.i.get($$0);
      if ($$2 == czn.b.b) {
         return false;
      } else {
         List<T> $$3 = (List)this.f.b($$0).flatMap($$0x -> $$0x.b().filter(czc::dw)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == czn.b.c) {
               this.d.a(new cza<>(new cge($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == czn.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new cza<>(new cge($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, czn.b.b);
      cge $$1 = new cge($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.cL().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(czc $$0) {
      $$0.b(bbn.c.c);
      $$0.a(czd.a);
   }

   private void f() {
      this.j.removeIf($$0 -> this.h.get($$0) != czp.a ? true : this.d($$0));
   }

   private void g() {
      cza<T> $$0;
      while(($$0 = (cza)this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), czn.b.c);
      }

   }

   public void a() {
      this.g();
      this.f();
   }

   private LongSet h() {
      LongSet $$0 = this.f.a();
      ObjectIterator var2 = Long2ObjectMaps.fastIterable(this.i).iterator();

      while(var2.hasNext()) {
         Entry<czn.b> $$1 = (Entry)var2.next();
         if ($$1.getValue() == czn.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.h().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == czp.a;
         if ($$1) {
            this.d($$0);
         } else {
            this.a($$0, $$0x -> {
            });
         }

      });
   }

   public void c() {
      LongSet $$0 = this.h();

      while(!$$0.isEmpty()) {
         this.d.a(false);
         this.g();
         $$0.removeIf($$0x -> {
            boolean $$1 = this.h.get($$0x) == czp.a;
            return $$1 ? this.d($$0x) : this.a($$0x, $$0xx -> {
            });
         });
      }

      this.d.a(true);
   }

   public void close() throws IOException {
      this.c();
      this.d.close();
   }

   public boolean a(UUID $$0) {
      return this.b.contains($$0);
   }

   public czl<T> d() {
      return this.g;
   }

   public boolean a(gt $$0) {
      return ((czp)this.h.get(cge.a($$0))).a();
   }

   public boolean a(cge $$0) {
      return ((czp)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == czn.b.c;
   }

   public void a(Writer $$0) throws IOException {
      alk $$1 = alk.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         czn.b $$2 = (czn.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            czg<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(hq.b($$2x), hq.c($$2x), hq.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }

         });
      });
   }

   @ang
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   class a implements czd {
      private final T c;
      private long d;
      private czg<T> e;

      a(T $$0, long $$1, czg<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gt $$0 = this.c.da();
         long $$1 = hq.c($$0);
         if ($$1 != this.d) {
            czp $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               czn.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hq.a(this.d), $$1});
            }

            czn.this.a(this.d, this.e);
            czg<T> $$3 = czn.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }

      }

      private void a(czp $$0, czp $$1) {
         czp $$2 = czn.a(this.c, $$0);
         czp $$3 = czn.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               czn.this.c.a(this.c);
            }

         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               czn.this.f(this.c);
            } else if (!$$4 && $$5) {
               czn.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               czn.this.d(this.c);
            } else if (!$$6 && $$7) {
               czn.this.c(this.c);
            }

            if ($$5) {
               czn.this.c.a(this.c);
            }

         }
      }

      @Override
      public void a(bbn.c $$0) {
         if (!this.e.b(this.c)) {
            czn.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hq.a(this.d), $$0});
         }

         czp $$1 = czn.a(this.c, this.e.c());
         if ($$1.a()) {
            czn.this.d(this.c);
         }

         if ($$1.b()) {
            czn.this.f(this.c);
         }

         if ($$0.a()) {
            czn.this.c.f(this.c);
         }

         czn.this.b.remove(this.c.co());
         this.c.a(a);
         czn.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
