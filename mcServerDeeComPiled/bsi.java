import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bsi extends brq implements bri, bso {
   private static final aaj<Boolean> d = aam.a(bsi.class, aal.i);
   private static final int e = 40;
   private static final int bX = 1;
   private static final float bY = 0.6F;
   private static final int bZ = 6;
   private static final float ca = 0.5F;
   private static final int cb = 40;
   private static final int cc = 15;
   private static final int cd = 200;
   private static final float ce = 0.3F;
   private static final float cf = 0.4F;
   private int cg;
   protected static final ImmutableList<? extends blz<? extends bly<? super bsi>>> b = ImmutableList.of(blz.c, blz.d);
   protected static final ImmutableList<? extends bku<?>> c = ImmutableList.of(bku.g, bku.h, bku.k, bku.l, bku.n, bku.m, bku.E, bku.t, bku.o, bku.p);

   public bsi(bbr<? extends bsi> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bcx.b<bsi> dz() {
      return bcx.a(c, b);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      bcx<bsi> $$1 = this.dz().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(bvn.a));
      $$1.b(bvn.b);
      $$1.e();
      return $$1;
   }

   private static void a(bcx<bsi> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bev(45, 90), new bez()));
   }

   private static void b(bcx<bsi> $$0) {
      $$0.a(
         bvn.b,
         10,
         ImmutableList.of(
            new bgb(bsi::fL),
            new bfn<>(new bfp(8.0F), azu.a(30, 60)),
            new bfm(ImmutableList.of(Pair.of(new bff(0.4F), 2), Pair.of(new bfw(0.4F, 3), 2), Pair.of(new bdx(30, 60), 1)))
         )
      );
   }

   private static void c(bcx<bsi> $$0) {
      $$0.a(bvn.k, 10, ImmutableList.of(new bfu(1.0F), new bfl<>(bsi::q, new bew(40)), new bfl<>(bsi::y_, new bew(15)), new bge()), bku.o);
   }

   private Optional<? extends bcc> fL() {
      return ((bkw)this.dy().c(bku.h).orElse(bkw.a())).a(this::k);
   }

   private boolean k(bcc $$0) {
      bbr<?> $$1 = $$0.ad();
      return $$1 != bbr.bi && $$1 != bbr.q && bly.c(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(d, false);
   }

   @Override
   public void a(aaj<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.z_();
      }

   }

   public static bdc.a n() {
      return brq.fO().a(bdd.a, 40.0).a(bdd.d, 0.3F).a(bdd.c, 0.6F).a(bdd.g, 1.0).a(bdd.f, 6.0);
   }

   public boolean q() {
      return !this.y_();
   }

   @Override
   public boolean z(bbn $$0) {
      if (!($$0 instanceof bcc)) {
         return false;
      } else {
         this.cg = 10;
         this.s.a(this, (byte)4);
         this.a(ajw.xO, 1.0F, this.eD());
         return bso.a(this, (bcc)$$0);
      }
   }

   @Override
   public boolean a(buc $$0) {
      return !this.fy();
   }

   @Override
   protected void e(bcc $$0) {
      if (!this.y_()) {
         bso.b(this, $$0);
      }

   }

   @Override
   public double bt() {
      return (double)this.cX() - (this.y_() ? 0.2 : 0.15);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.s.y) {
         return false;
      } else if ($$2 && $$0.m() instanceof bcc $$3) {
         if (this.c($$3) && !bdp.a(this, $$3, 4.0)) {
            this.l($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void l(bcc $$0) {
      this.bD.b(bku.E);
      this.bD.a(bku.o, $$0, 200L);
   }

   @Override
   public bcx<bsi> dy() {
      return super.dy();
   }

   protected void t() {
      bvn $$0 = (bvn)this.bD.f().orElse(null);
      this.bD.a(ImmutableList.of(bvn.k, bvn.b));
      bvn $$1 = (bvn)this.bD.f().orElse(null);
      if ($$1 == bvn.k && $$0 != bvn.k) {
         this.fK();
      }

      this.u(this.bD.a(bku.o));
   }

   @Override
   protected void T() {
      this.s.ac().a("zoglinBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.ai().b(d, $$0);
      if (!this.s.y && $$0) {
         this.a(bdd.f).a(0.5);
      }

   }

   @Override
   public boolean y_() {
      return this.ai().a(d);
   }

   @Override
   public void w_() {
      if (this.cg > 0) {
         --this.cg;
      }

      super.w_();
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 4) {
         this.cg = 10;
         this.a(ajw.xO, 1.0F, this.eD());
      } else {
         super.a($$0);
      }

   }

   @Override
   public int fJ() {
      return this.cg;
   }

   @Override
   protected ajv r() {
      if (this.s.y) {
         return null;
      } else {
         return this.bD.a(bku.o) ? ajw.xN : ajw.xM;
      }
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.xQ;
   }

   @Override
   protected ajv x_() {
      return ajw.xP;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.xR, 0.15F, 1.0F);
   }

   protected void fK() {
      this.a(ajw.xN, 1.0F, this.eD());
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   @Override
   public bch ey() {
      return bch.b;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.y_()) {
         $$0.a("IsBaby", true);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }

   }
}
