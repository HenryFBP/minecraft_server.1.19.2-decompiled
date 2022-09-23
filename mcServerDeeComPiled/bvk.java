import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bvk extends brr {
   protected static final aaj<Boolean> c = aam.a(bvk.class, aal.i);
   static final Predicate<bqv> b = $$0 -> !$$0.s() && $$0.bo() && cax.b($$0.i(), bvj.s());
   @Nullable
   protected bvj d;
   private int e;
   private boolean bX;
   private int bY;

   protected bvk(bbr<? extends bvk> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(1, new bvk.b<>(this));
      this.bS.a(3, new bjj<>(this));
      this.bS.a(4, new bvk.d(this, 1.05F, 1));
      this.bS.a(5, new bvk.c(this));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean fW() {
      return this.bX;
   }

   public void y(boolean $$0) {
      this.bX = $$0;
   }

   @Override
   public void w_() {
      if (this.s instanceof agg && this.bo()) {
         bvj $$0 = this.fX();
         if (this.fW()) {
            if ($$0 == null) {
               if (this.s.U() % 20L == 0L) {
                  bvj $$1 = ((agg)this.s).c(this.da());
                  if ($$1 != null && bvl.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bcc $$2 = this.G();
               if ($$2 != null && ($$2.ad() == bbr.bn || $$2.ad() == bbr.S)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.w_();
   }

   @Override
   protected void fN() {
      this.bf += 2;
   }

   @Override
   public void a(baw $$0) {
      if (this.s instanceof agg) {
         bbn $$1 = $$0.m();
         bvj $$2 = this.fX();
         if ($$2 != null) {
            if (this.fP()) {
               $$2.c(this.fZ());
            }

            if ($$1 != null && $$1.ad() == bbr.bn) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.fP() && $$2 == null && ((agg)this.s).c(this.da()) == null) {
            cax $$3 = this.c(bbs.f);
            buc $$4 = null;
            if ($$1 instanceof buc) {
               $$4 = (buc)$$1;
            } else if ($$1 instanceof boh $$6) {
               bcc $$7 = $$6.fK();
               if ($$6.q() && $$7 instanceof buc) {
                  $$4 = (buc)$$7;
               }
            }

            if (!$$3.b() && cax.b($$3, bvj.s()) && $$4 != null) {
               bbg $$8 = $$4.b(bbi.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.d();
                  $$4.c(bbi.E);
               } else {
                  --$$9;
               }

               $$9 = ami.a($$9, 0, 4);
               bbg $$10 = new bbg(bbi.E, 120000, $$9, false, false, true);
               if (!this.s.W().b(cgt.y)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean fQ() {
      return !this.fY();
   }

   public void a(@Nullable bvj $$0) {
      this.d = $$0;
   }

   @Nullable
   public bvj fX() {
      return this.d;
   }

   public boolean fY() {
      return this.fX() != null && this.fX().v();
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public int fZ() {
      return this.e;
   }

   public boolean ga() {
      return this.Y.a(c);
   }

   public void z(boolean $$0) {
      this.Y.b(c, $$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bX);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bX = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.s instanceof agg) {
            this.d = ((agg)this.s).y().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.fP()) {
               this.d.a(this.e, this);
            }
         }
      }

   }

   @Override
   protected void b(bqv $$0) {
      cax $$1 = $$0.i();
      boolean $$2 = this.fY() && this.fX().b(this.fZ()) != null;
      if (this.fY() && !$$2 && cax.b($$1, bvj.s())) {
         bbs $$3 = bbs.f;
         cax $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.R.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.K());
         $$0.ah();
         this.fX().a(this.fZ(), this);
         this.v(true);
      } else {
         super.b($$0);
      }

   }

   @Override
   public boolean h(double $$0) {
      return this.fX() == null ? super.h($$0) : false;
   }

   @Override
   public boolean P() {
      return super.P() || this.fX() != null;
   }

   public int gb() {
      return this.bY;
   }

   public void b(int $$0) {
      this.bY = $$0;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.fY()) {
         this.fX().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.y(this.ad() != bbr.bd || $$2 != bcg.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract ajv L_();

   protected class a extends bip {
      private final bvk c;
      private final float d;
      public final bmf a = bmf.b().a(8.0).d().e();

      public a(bqy $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean a() {
         bcc $$0 = this.c.dR();
         return this.c.fX() == null && this.c.fS() && this.c.G() != null && !this.c.fC() && ($$0 == null || $$0.ad() != bbr.bn);
      }

      @Override
      public void c() {
         super.c();
         this.c.D().n();

         for(bvk $$1 : this.c.s.a(bvk.class, this.a, this.c, this.c.cy().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.G());
         }

      }

      @Override
      public void d() {
         super.d();
         bcc $$0 = this.c.G();
         if ($$0 != null) {
            for(bvk $$2 : this.c.s.a(bvk.class, this.a, this.c, this.c.cy().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.u(true);
            }

            this.c.u(true);
         }

      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         bcc $$0 = this.c.G();
         if ($$0 != null) {
            if (this.c.f($$0) > (double)this.d) {
               this.c.z().a($$0, 30.0F, 30.0F);
               if (this.c.R.a(50) == 0) {
                  this.c.K();
               }
            } else {
               this.c.u(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends bvk> extends bip {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         bvj $$0 = this.b.fX();
         if (this.b.fY() && !this.b.fX().a() && this.b.fK() && !cax.b(this.b.c(bbs.f), bvj.s())) {
            bvk $$1 = $$0.b(this.b.fZ());
            if ($$1 == null || !$$1.bo()) {
               List<bqv> $$2 = this.b.s.a(bqv.class, this.b.cy().c(16.0, 8.0, 16.0), bvk.b);
               if (!$$2.isEmpty()) {
                  return this.b.D().a((bbn)$$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.D().h().a(this.b.cY(), 1.414)) {
            List<bqv> $$0 = this.b.s.a(bqv.class, this.b.cy().c(4.0, 4.0, 4.0), bvk.b);
            if (!$$0.isEmpty()) {
               this.b.b((bqv)$$0.get(0));
            }
         }

      }
   }

   public class c extends bip {
      private final bvk b;

      c(bvk $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         bvj $$0 = this.b.fX();
         return this.b.bo() && this.b.G() == null && $$0 != null && $$0.f();
      }

      @Override
      public void c() {
         this.b.z(true);
         super.c();
      }

      @Override
      public void d() {
         this.b.z(false);
         super.d();
      }

      @Override
      public void e() {
         if (!this.b.aM() && this.b.R.a(this.a(100)) == 0) {
            bvk.this.a(bvk.this.L_(), bvk.this.eC(), bvk.this.eD());
         }

         if (!this.b.bI() && this.b.R.a(this.a(50)) == 0) {
            this.b.C().a();
         }

         super.e();
      }
   }

   static class d extends bip {
      private final bvk a;
      private final double b;
      private gt c;
      private final List<gt> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(bvk $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.G() == null;
      }

      private boolean h() {
         return this.a.fY() && !this.a.fX().a();
      }

      private boolean i() {
         agg $$0 = (agg)this.a.s;
         gt $$1 = this.a.da();
         Optional<gt> $$2 = $$0.x().a($$0x -> $$0x.a(bmw.n), this::a, bms.b.c, $$1, 48, this.a.R);
         if (!$$2.isPresent()) {
            return false;
         } else {
            this.c = ((gt)$$2.get()).h();
            return true;
         }
      }

      @Override
      public boolean b() {
         if (this.a.D().l()) {
            return false;
         } else {
            return this.a.G() == null && !this.c.a(this.a.cY(), (double)(this.a.cW() + (float)this.e)) && !this.f;
         }
      }

      @Override
      public void d() {
         if (this.c.a(this.a.cY(), (double)this.e)) {
            this.d.add(this.c);
         }

      }

      @Override
      public void c() {
         super.c();
         this.a.o(0);
         this.a.D().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.D().l()) {
            dwq $$0 = dwq.c(this.c);
            dwq $$1 = bmj.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bmj.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.D().a($$1.c, $$1.d, $$1.e, this.b);
         }

      }

      private boolean a(gt $$0) {
         for(gt $$1 : this.d) {
            if (Objects.equals($$0, $$1)) {
               return false;
            }
         }

         return true;
      }

      private void k() {
         if (this.d.size() > 2) {
            this.d.remove(0);
         }

      }
   }
}
