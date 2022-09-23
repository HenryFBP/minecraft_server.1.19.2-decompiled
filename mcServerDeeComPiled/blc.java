import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class blc {
   private static final int p = 20;
   protected final bce a;
   protected final cgx b;
   @Nullable
   protected dql c;
   protected double d;
   protected int e;
   protected int f;
   protected dwq g = dwq.b;
   protected hs h = hs.g;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected dqk o;
   @Nullable
   private gt q;
   private int r;
   private float s = 1.0F;
   private final dqn t;
   private boolean u;

   public blc(bce $$0, cgx $$1) {
      this.a = $$0;
      this.b = $$1;
      int $$2 = ami.b($$0.b(bdd.b) * 16.0);
      this.t = this.a($$2);
   }

   public void g() {
      this.s = 1.0F;
   }

   public void a(float $$0) {
      this.s = $$0;
   }

   @Nullable
   public gt h() {
      return this.q;
   }

   protected abstract dqn a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.U() - this.n > 20L) {
         if (this.q != null) {
            this.c = null;
            this.c = this.a(this.q, this.r);
            this.n = this.b.U();
            this.m = false;
         }
      } else {
         this.m = true;
      }

   }

   @Nullable
   public final dql a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(new gt($$0, $$1, $$2), $$3);
   }

   @Nullable
   public dql a(Stream<gt> $$0, int $$1) {
      return this.a((Set<gt>)$$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public dql a(Set<gt> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public dql a(gt $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public dql a(gt $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, (float)$$2);
   }

   @Nullable
   public dql a(bbn $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.da()), 16, true, $$1);
   }

   @Nullable
   protected dql a(Set<gt> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, (float)this.a.b(bdd.b));
   }

   @Nullable
   protected dql a(Set<gt> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dh() < (double)this.b.u_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.q)) {
         return this.c;
      } else {
         this.b.ac().a("pathfind");
         gt $$5 = $$2 ? this.a.da().b() : this.a.da();
         int $$6 = (int)($$4 + (float)$$1);
         chk $$7 = new chk(this.b, $$5.b(-$$6, -$$6, -$$6), $$5.b($$6, $$6, $$6));
         dql $$8 = this.t.a($$7, this.a, $$0, $$4, $$3, this.s);
         this.b.ac().c();
         if ($$8 != null && $$8.m() != null) {
            this.q = $$8.m();
            this.r = $$3;
            this.f();
         }

         return $$8;
      }
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.a(this.a($$0, $$1, $$2, 1), $$3);
   }

   public boolean a(bbn $$0, double $$1) {
      dql $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable dql $$0, double $$1) {
      if ($$0 == null) {
         this.c = null;
         return false;
      } else {
         if (!$$0.a(this.c)) {
            this.c = $$0;
         }

         if (this.l()) {
            return false;
         } else {
            this.F_();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               dwq $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public dql j() {
      return this.c;
   }

   public void c() {
      ++this.e;
      if (this.m) {
         this.i();
      }

      if (!this.l()) {
         if (this.a()) {
            this.k();
         } else if (this.c != null && !this.c.c()) {
            dwq $$0 = this.b();
            dwq $$1 = this.c.a(this.a);
            if ($$0.d > $$1.d && !this.a.aw() && ami.b($$0.c) == ami.b($$1.c) && ami.b($$0.e) == ami.b($$1.e)) {
               this.c.a();
            }
         }

         xl.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            dwq $$2 = this.c.a(this.a);
            this.a.A().a($$2.c, this.a($$2), $$2.e, this.d);
         }
      }
   }

   protected double a(dwq $$0) {
      gt $$1 = new gt($$0);
      return this.b.a_($$1.c()).h() ? $$0.d : dqq.a(this.b, $$1);
   }

   protected void k() {
      dwq $$0 = this.b();
      this.l = this.a.cW() > 0.75F ? this.a.cW() / 2.0F : 0.75F - this.a.cW() / 2.0F;
      hs $$1 = this.c.g();
      double $$2 = Math.abs(this.a.df() - ((double)$$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dh() - (double)$$1.v());
      double $$4 = Math.abs(this.a.dl() - ((double)$$1.w() + 0.5));
      boolean $$5 = $$2 < (double)this.l && $$4 < (double)this.l && $$3 < 1.0;
      if ($$5 || this.a.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(dwq $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         dwq $$1 = dwq.c(this.c.g());
         if (!$$0.a((hj)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            dwq $$2 = dwq.c(this.c.d(this.c.f() + 1));
            dwq $$3 = $$2.d($$1);
            dwq $$4 = $$0.d($$1);
            return $$3.b($$4) > 0.0;
         }
      }
   }

   protected void b(dwq $$0) {
      if (this.e - this.f > 100) {
         if ($$0.g(this.g) < 2.25) {
            this.u = true;
            this.n();
         } else {
            this.u = false;
         }

         this.f = this.e;
         this.g = $$0;
      }

      if (this.c != null && !this.c.c()) {
         hs $$1 = this.c.g();
         if ($$1.equals(this.h)) {
            this.i += ad.b() - this.j;
         } else {
            this.h = $$1;
            double $$2 = $$0.f(dwq.c(this.h));
            this.k = this.a.eK() > 0.0F ? $$2 / (double)this.a.eK() * 1000.0 : 0.0;
         }

         if (this.k > 0.0 && (double)this.i > this.k * 3.0) {
            this.e();
         }

         this.j = ad.b();
      }

   }

   private void e() {
      this.f();
      this.n();
   }

   private void f() {
      this.h = hs.g;
      this.i = 0L;
      this.k = 0.0;
      this.u = false;
   }

   public boolean l() {
      return this.c == null || this.c.c();
   }

   public boolean m() {
      return !this.l();
   }

   public void n() {
      this.c = null;
   }

   protected abstract dwq b();

   protected abstract boolean a();

   protected boolean o() {
      return this.a.aU() || this.a.bf();
   }

   protected void F_() {
      if (this.c != null) {
         for(int $$0 = 0; $$0 < this.c.e(); ++$$0) {
            dqj $$1 = this.c.a($$0);
            dqj $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            cvo $$3 = this.b.a_(new gt($$1.a, $$1.b, $$1.c));
            if ($$3.a(akl.bc)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }

      }
   }

   protected boolean a(dwq $$0, dwq $$1) {
      return false;
   }

   protected static boolean a(bce $$0, dwq $$1, dwq $$2) {
      dwq $$3 = new dwq($$2.c, $$2.d + (double)$$0.cX() * 0.5, $$2.e);
      return $$0.s.a(new cgg($$1, $$3, cgg.a.a, cgg.b.a, $$0)).c() == dwo.a.a;
   }

   public boolean a(gt $$0) {
      gt $$1 = $$0.c();
      return this.b.a_($$1).i(this.b, $$1);
   }

   public dqk p() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean q() {
      return this.o.f();
   }

   public boolean b(gt $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         dqj $$1 = this.c.d();
         dwq $$2 = new dwq(((double)$$1.a + this.a.df()) / 2.0, ((double)$$1.b + this.a.dh()) / 2.0, ((double)$$1.c + this.a.dl()) / 2.0);
         return $$0.a($$2, (double)(this.c.e() - this.c.f()));
      } else {
         return false;
      }
   }

   public float r() {
      return this.l;
   }

   public boolean s() {
      return this.u;
   }
}
