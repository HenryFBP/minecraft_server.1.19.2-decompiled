import java.util.Objects;
import javax.annotation.Nullable;

public class drc {
   private final gt a;
   private final bzq b;
   @Nullable
   private final rq c;

   public drc(gt $$0, bzq $$1, @Nullable rq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static drc a(pj $$0) {
      gt $$1 = pv.b($$0.p("Pos"));
      bzq $$2 = bzq.a($$0.l("Color"), bzq.a);
      rq $$3 = $$0.e("Name") ? rq.a.a($$0.l("Name")) : null;
      return new drc($$1, $$2, $$3);
   }

   @Nullable
   public static drc a(cgd $$0, gt $$1) {
      cti $$2 = $$0.c_($$1);
      if ($$2 instanceof csy $$3) {
         bzq $$4 = $$3.g();
         rq $$5 = $$3.Y() ? $$3.Z() : null;
         return new drc($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public gt a() {
      return this.a;
   }

   public bzq b() {
      return this.b;
   }

   public drd.a c() {
      switch(this.b) {
         case a:
            return drd.a.k;
         case b:
            return drd.a.l;
         case c:
            return drd.a.m;
         case d:
            return drd.a.n;
         case e:
            return drd.a.o;
         case f:
            return drd.a.p;
         case g:
            return drd.a.q;
         case h:
            return drd.a.r;
         case i:
            return drd.a.s;
         case j:
            return drd.a.t;
         case k:
            return drd.a.u;
         case l:
            return drd.a.v;
         case m:
            return drd.a.w;
         case n:
            return drd.a.x;
         case o:
            return drd.a.y;
         case p:
         default:
            return drd.a.z;
      }
   }

   @Nullable
   public rq d() {
      return this.c;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         drc $$1 = (drc)$$0;
         return Objects.equals(this.a, $$1.a) && this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.a, this.b, this.c});
   }

   public pj e() {
      pj $$0 = new pj();
      $$0.a("Pos", (qc)pv.a(this.a));
      $$0.a("Color", this.b.b());
      if (this.c != null) {
         $$0.a("Name", rq.a.a(this.c));
      }

      return $$0;
   }

   public String f() {
      return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
   }
}
