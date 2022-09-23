import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class oj {
   private final pa a;
   @Nullable
   private gt b;
   private final agg c;
   private final Collection<ok> d = Lists.newArrayList();
   private final int e;
   private final Collection<on> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private long h;
   private long i;
   private boolean j;
   private final Stopwatch k = Stopwatch.createUnstarted();
   private boolean l;
   private final cpw m;
   @Nullable
   private Throwable n;
   @Nullable
   private cuo o;

   public oj(pa $$0, cpw $$1, agg $$2) {
      this.a = $$0;
      this.c = $$2;
      this.e = $$0.c();
      this.m = $$0.g().a($$1);
   }

   void a(gt $$0) {
      this.b = $$0;
   }

   void a() {
      this.h = this.c.U() + 1L + this.a.f();
      this.k.start();
   }

   public void b() {
      if (!this.k()) {
         this.A();
         if (this.k()) {
            if (this.n != null) {
               this.d.forEach($$0 -> $$0.c(this));
            } else {
               this.d.forEach($$0 -> $$0.b(this));
            }
         }

      }
   }

   private void A() {
      this.i = this.c.U() - this.h;
      if (this.i >= 0L) {
         if (this.i == 0L) {
            this.B();
         }

         ObjectIterator<Entry<Runnable>> $$0 = this.g.object2LongEntrySet().iterator();

         while($$0.hasNext()) {
            Entry<Runnable> $$1 = (Entry)$$0.next();
            if ($$1.getLongValue() <= this.i) {
               try {
                  ((Runnable)$$1.getKey()).run();
               } catch (Exception var4) {
                  this.a(var4);
               }

               $$0.remove();
            }
         }

         if (this.i > (long)this.e) {
            if (this.f.isEmpty()) {
               this.a(new oq("Didn't succeed or fail within " + this.a.c() + " ticks"));
            } else {
               this.f.forEach($$0x -> $$0x.b(this.i));
               if (this.n == null) {
                  this.a(new oq("No sequences finished"));
               }
            }
         } else {
            this.f.forEach($$0x -> $$0x.a(this.i));
         }

      }
   }

   private void B() {
      if (this.j) {
         throw new IllegalStateException("Test already started");
      } else {
         this.j = true;

         try {
            this.a.a(new oi(this));
         } catch (Exception var2) {
            this.a(var2);
         }

      }
   }

   public void a(long $$0, Runnable $$1) {
      this.g.put($$1, $$0);
   }

   public String c() {
      return this.a.a();
   }

   public gt d() {
      return this.b;
   }

   @Nullable
   public hs e() {
      cuo $$0 = this.C();
      return $$0 == null ? null : $$0.j();
   }

   @Nullable
   public dwl f() {
      cuo $$0 = this.C();
      return $$0 == null ? null : ow.a($$0);
   }

   @Nullable
   private cuo C() {
      return (cuo)this.c.c_(this.b);
   }

   public agg g() {
      return this.c;
   }

   public boolean h() {
      return this.l && this.n == null;
   }

   public boolean i() {
      return this.n != null;
   }

   public boolean j() {
      return this.j;
   }

   public boolean k() {
      return this.l;
   }

   public long l() {
      return this.k.elapsed(TimeUnit.MILLISECONDS);
   }

   private void D() {
      if (!this.l) {
         this.l = true;
         this.k.stop();
      }

   }

   public void m() {
      if (this.n == null) {
         this.D();
      }

   }

   public void a(Throwable $$0) {
      this.n = $$0;
      this.D();
   }

   @Nullable
   public Throwable n() {
      return this.n;
   }

   public String toString() {
      return this.c();
   }

   public void a(ok $$0) {
      this.d.add($$0);
   }

   public void a(gt $$0, int $$1) {
      this.o = ow.a(this.t(), $$0, this.u(), $$1, this.c, false);
      this.b = this.o.p();
      this.o.a(this.c());
      ow.a(this.b, new gt(1, 0, -1), this.u(), this.c);
      this.d.forEach($$0x -> $$0x.a(this));
   }

   public void o() {
      if (this.o == null) {
         throw new IllegalStateException("Expected structure to be initialized, but it was null");
      } else {
         dkt $$0 = ow.b(this.o);
         ow.a($$0, this.b.v(), this.c);
      }
   }

   long p() {
      return this.i;
   }

   on q() {
      on $$0 = new on(this);
      this.f.add($$0);
      return $$0;
   }

   public boolean r() {
      return this.a.d();
   }

   public boolean s() {
      return !this.a.d();
   }

   public String t() {
      return this.a.b();
   }

   public cpw u() {
      return this.m;
   }

   public pa v() {
      return this.a;
   }

   public int w() {
      return this.e;
   }

   public boolean x() {
      return this.a.h();
   }

   public int y() {
      return this.a.i();
   }

   public int z() {
      return this.a.j();
   }
}
