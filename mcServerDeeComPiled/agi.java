import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class agi {
   private static final Logger a = LogUtils.getLogger();
   protected agg c;
   protected final agh d;
   private cgu b;
   @Nullable
   private cgu e;
   private boolean f;
   private int g;
   private gt h;
   private int i;
   private boolean j;
   private gt k;
   private int l;
   private int m;

   public agi(agh $$0) {
      this.b = cgu.e;
      this.h = gt.b;
      this.k = gt.b;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.x();
   }

   public boolean a(cgu $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.b);
         return true;
      }
   }

   protected void a(cgu $$0, @Nullable cgu $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.fB());
      this.d.w();
      this.d.c.ac().a(new vj(vj.a.b, this.d));
      this.c.e();
   }

   public cgu b() {
      return this.b;
   }

   @Nullable
   public cgu c() {
      return this.e;
   }

   public boolean d() {
      return this.b.g();
   }

   public boolean e() {
      return this.b.f();
   }

   public void a() {
      ++this.i;
      if (this.j) {
         cvo $$0 = this.c.a_(this.k);
         if ($$0.h()) {
            this.j = false;
         } else {
            float $$1 = this.a($$0, this.k, this.l);
            if ($$1 >= 1.0F) {
               this.j = false;
               this.a(this.k);
            }
         }
      } else if (this.f) {
         cvo $$2 = this.c.a_(this.h);
         if ($$2.h()) {
            this.c.a(this.d.ae(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }

   }

   private float a(cvo $$0, gt $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.s, $$1) * (float)($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ae(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(gt $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(gt $$0, yo.a $$1, gy $$2, int $$3, int $$4) {
      if (this.d.bj().g(dwq.a($$0)) > agz.a) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() >= $$3) {
         this.d.b.a(new tp($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == yo.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.b.a(new tp($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.e()) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.b.a(new tp($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            cvo $$6 = this.c.a_($$0);
            if (!$$6.h()) {
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.s, $$0);
            }

            if (!$$6.h() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.b.a(new tp(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.h();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ae(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == yo.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               cvo $$9 = this.c.a_($$0);
               if (!$$9.h()) {
                  float $$10 = $$9.a(this.d, this.d.s, $$0) * (float)($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.ae(), $$0, -1);
                     this.a($$0, $$4, "destroyed");
                     return;
                  }

                  if (!this.j) {
                     this.f = false;
                     this.j = true;
                     this.k = $$0;
                     this.l = this.g;
                  }
               }
            }

            this.a($$0, true, $$4, "stopped destroying");
         } else if ($$1 == yo.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.ae(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.ae(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }

      }
   }

   public void a(gt $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.b.a(new tp($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }

   }

   public boolean a(gt $$0) {
      cvo $$1 = this.c.a_($$0);
      if (!this.d.ez().c().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         cti $$2 = this.c.c_($$0);
         cjt $$3 = $$1.b();
         if ($$3 instanceof cmq && !this.d.fY()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            $$3.a(this.c, $$0, $$1, (buc)this.d);
            boolean $$4 = this.c.a($$0, false);
            if ($$4) {
               $$3.a((cgy)this.c, $$0, $$1);
            }

            if (this.e()) {
               return true;
            } else {
               cax $$5 = this.d.ez();
               cax $$6 = $$5.o();
               boolean $$7 = this.d.d($$1);
               $$5.a(this.c, $$1, $$0, this.d);
               if ($$4 && $$7) {
                  $$3.a(this.c, this.d, $$0, $$1, $$2, $$6);
               }

               return true;
            }
         }
      }
   }

   public baj a(agh $$0, cgx $$1, cax $$2, bai $$3) {
      if (this.b == cgu.d) {
         return baj.d;
      } else if ($$0.fW().a($$2.c())) {
         return baj.d;
      } else {
         int $$4 = $$2.K();
         int $$5 = $$2.j();
         bak<cax> $$6 = $$2.a($$1, $$0, $$3);
         cax $$7 = $$6.b();
         if ($$7 == $$2 && $$7.K() == $$4 && $$7.q() <= 0 && $$7.j() == $$5) {
            return $$6.a();
         } else if ($$6.a() == baj.e && $$7.q() > 0 && !$$0.eT()) {
            return $$6.a();
         } else {
            if ($$2 != $$7) {
               $$0.a($$3, $$7);
            }

            if (this.e()) {
               $$7.e($$4);
               if ($$7.h() && $$7.j() != $$5) {
                  $$7.b($$5);
               }
            }

            if ($$7.b()) {
               $$0.a($$3, cax.b);
            }

            if (!$$0.eT()) {
               $$0.bT.b();
            }

            return $$6.a();
         }
      }
   }

   public baj a(agh $$0, cgx $$1, cax $$2, bai $$3, dwm $$4) {
      gt $$5 = $$4.a();
      cvo $$6 = $$1.a_($$5);
      if (this.b == cgu.d) {
         bam $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return baj.a;
         } else {
            return baj.d;
         }
      } else {
         boolean $$8 = !$$0.ez().b() || !$$0.eA().b();
         boolean $$9 = $$0.fo() && $$8;
         cax $$10 = $$2.o();
         if (!$$9) {
            baj $$11 = $$6.a($$1, $$0, $$3, $$4);
            if ($$11.a()) {
               aj.M.a($$0, $$5, $$10);
               return $$11;
            }
         }

         if (!$$2.b() && !$$0.fW().a($$2.c())) {
            ccz $$12 = new ccz($$0, $$3, $$4);
            baj $$14;
            if (this.e()) {
               int $$13 = $$2.K();
               $$14 = $$2.a($$12);
               $$2.e($$13);
            } else {
               $$14 = $$2.a($$12);
            }

            if ($$14.a()) {
               aj.M.a($$0, $$5, $$10);
            }

            return $$14;
         } else {
            return baj.d;
         }
      }
   }

   public void a(agg $$0) {
      this.c = $$0;
   }
}
