import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class czo<T extends czc> {
   static final Logger a = LogUtils.getLogger();
   final czk<T> b;
   final cze<T> c;
   final czh<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final czl<T> f;

   public czo(Class<T> $$0, czk<T> $$1) {
      this.c = new cze<>();
      this.d = new czh<>($$0, $$0x -> this.e.contains($$0x) ? czp.c : czp.b);
      this.b = $$1;
      this.f = new czm<>(this.c, this.d);
   }

   public void a(cge $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         czp $$1x = $$0x.a(czp.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dx()).forEach(this.b::e);
         }

      });
   }

   public void b(cge $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         czp $$1x = $$0x.a(czp.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dx()).forEach(this.b::d);
         }

      });
   }

   public czl<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = hq.c($$0.da());
      czg<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new czo.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dx() || $$2.c().a()) {
         this.b.e($$0);
      }

   }

   @ang
   public int b() {
      return this.c.b();
   }

   void a(long $$0, czg<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }

   }

   @ang
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
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
               czo.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hq.a(this.d), $$1});
            }

            czo.this.a(this.d, this.e);
            czg<T> $$3 = czo.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            czo.this.b.a(this.c);
            if (!this.c.dx()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  czo.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  czo.this.b.e(this.c);
               }
            }
         }

      }

      @Override
      public void a(bbn.c $$0) {
         if (!this.e.b(this.c)) {
            czo.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hq.a(this.d), $$0});
         }

         czp $$1 = this.e.c();
         if ($$1.a() || this.c.dx()) {
            czo.this.b.d(this.c);
         }

         czo.this.b.b(this.c);
         czo.this.b.f(this.c);
         czo.this.c.b(this.c);
         this.c.a(a);
         czo.this.a(this.d, this.e);
      }
   }
}
