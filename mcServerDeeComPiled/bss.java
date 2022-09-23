import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class bss extends bsr implements brd, btn {
   private static final aaj<Boolean> bY = aam.a(bss.class, aal.i);
   private static final aaj<Boolean> bZ = aam.a(bss.class, aal.i);
   private static final aaj<Boolean> ca = aam.a(bss.class, aal.i);
   private static final UUID cb = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bdb cc = new bdb(cb, "Baby speed boost", 0.2F, bdb.a.b);
   private static final int cd = 16;
   private static final float ce = 0.35F;
   private static final int cf = 5;
   private static final float cg = 1.6F;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final float ck = 0.81F;
   private static final double cl = 0.5;
   private final bao cm = new bao(8);
   private boolean cn;
   protected static final ImmutableList<blz<? extends bly<? super bss>>> e = ImmutableList.of(blz.c, blz.d, blz.b, blz.f, blz.k);
   protected static final ImmutableList<bku<?>> bX = ImmutableList.of(
      bku.n,
      bku.v,
      bku.g,
      bku.h,
      bku.k,
      bku.l,
      bku.am,
      bku.al,
      bku.K,
      bku.x,
      bku.y,
      bku.m,
      new bku[]{
         bku.E,
         bku.o,
         bku.p,
         bku.q,
         bku.t,
         bku.Z,
         bku.aa,
         bku.z,
         bku.ab,
         bku.ac,
         bku.ae,
         bku.ad,
         bku.ag,
         bku.ah,
         bku.af,
         bku.aj,
         bku.L,
         bku.ap,
         bku.s,
         bku.aq,
         bku.ar,
         bku.ai,
         bku.ak,
         bku.as,
         bku.at,
         bku.au
      }
   );

   public bss(bbr<? extends bsr> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.y_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      $$0.a("Inventory", (qc)this.cm.g());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.x($$0.q("CannotHunt"));
      this.cm.a($$0.c("Inventory", 10));
   }

   @ang
   @Override
   public bao t() {
      return this.cm;
   }

   @Override
   protected void a(baw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      this.cm.f().forEach(this::b);
   }

   protected cax m(cax $$0) {
      return this.cm.a($$0);
   }

   protected boolean n(cax $$0) {
      return this.cm.b($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bY, false);
      this.Y.a(bZ, false);
      this.Y.a(ca, false);
   }

   @Override
   public void a(aaj<?> $$0) {
      super.a($$0);
      if (bY.equals($$0)) {
         this.z_();
      }

   }

   public static bdc.a fQ() {
      return brq.fO().a(bdd.a, 16.0).a(bdd.d, 0.35F).a(bdd.f, 5.0);
   }

   public static boolean b(bbr<bss> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return !$$1.a_($$3.c()).a(cju.jw);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      if ($$2 != bcg.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.fK()) {
            this.a(bbs.a, this.fS());
         }
      }

      bst.a(this, $$0.r_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean Q() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fr();
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      if (this.fK()) {
         this.a(bbs.f, new cax(caz.ok), $$0);
         this.a(bbs.e, new cax(caz.ol), $$0);
         this.a(bbs.d, new cax(caz.om), $$0);
         this.a(bbs.c, new cax(caz.on), $$0);
      }

   }

   private void a(bbs $$0, cax $$1, amn $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }

   }

   @Override
   protected bcx.b<bss> dz() {
      return bcx.a(bX, e);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return bst.a(this, this.dz().a($$0));
   }

   @Override
   public bcx<bss> dy() {
      return super.dy();
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      baj $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.s.y) {
         return bst.a(this, $$0, $$1);
      } else {
         boolean $$3 = bst.b(this, $$0.b($$1)) && this.fL() != bsu.d;
         return $$3 ? baj.a : baj.d;
      }
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return this.y_() ? 0.93F : 1.74F;
   }

   @Override
   public double bt() {
      return (double)this.cX() * 0.92;
   }

   @Override
   public void a(boolean $$0) {
      this.ai().b(bY, $$0);
      if (!this.s.y) {
         bcz $$1 = this.a(bdd.d);
         $$1.d(cc);
         if ($$0) {
            $$1.b(cc);
         }
      }

   }

   @Override
   public boolean y_() {
      return this.ai().a(bY);
   }

   private void x(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean n() {
      return !this.cn;
   }

   @Override
   protected void T() {
      this.s.ac().a("piglinBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      bst.a(this);
      super.T();
   }

   @Override
   public int dO() {
      return this.bN;
   }

   @Override
   protected void c(agg $$0) {
      bst.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cax fS() {
      return (double)this.R.i() < 0.5 ? new cax(caz.tM) : new cax(caz.nr);
   }

   private boolean fT() {
      return this.Y.a(bZ);
   }

   @Override
   public void b(boolean $$0) {
      this.Y.b(bZ, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public bsu fL() {
      if (this.fR()) {
         return bsu.e;
      } else if (bst.a(this.eA())) {
         return bsu.d;
      } else if (this.fC() && this.fM()) {
         return bsu.a;
      } else if (this.fT()) {
         return bsu.c;
      } else {
         return this.fC() && this.b(caz.tM) ? bsu.b : bsu.f;
      }
   }

   public boolean fR() {
      return this.Y.a(ca);
   }

   public void w(boolean $$0) {
      this.Y.b(ca, $$0);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.s.y) {
         return false;
      } else {
         if ($$2 && $$0.m() instanceof bcc) {
            bst.a(this, (bcc)$$0.m());
         }

         return $$2;
      }
   }

   @Override
   public void a(bcc $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bcc $$0, cax $$1, buu $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cbm $$0) {
      return $$0 == caz.tM;
   }

   protected void o(cax $$0) {
      this.b(bbs.a, $$0);
   }

   protected void p(cax $$0) {
      if ($$0.a(bst.c)) {
         this.a(bbs.b, $$0);
         this.e(bbs.b);
      } else {
         this.b(bbs.b, $$0);
      }

   }

   @Override
   public boolean l(cax $$0) {
      return this.s.W().b(cgt.c) && this.fq() && bst.a(this, $$0);
   }

   protected boolean q(cax $$0) {
      bbs $$1 = bce.i($$0);
      cax $$2 = this.c($$1);
      return this.a($$0, $$2);
   }

   @Override
   protected boolean a(cax $$0, cax $$1) {
      if (cet.d($$1)) {
         return false;
      } else {
         boolean $$2 = bst.a($$0) || $$0.a(caz.tM);
         boolean $$3 = bst.a($$1) || $$1.a(caz.tM);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.fK() && !$$0.a(caz.tM) && $$1.a(caz.tM) ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void b(bqv $$0) {
      this.a($$0);
      bst.a(this, $$0);
   }

   @Override
   public boolean a(bbn $$0, boolean $$1) {
      if (this.y_() && $$0.ad() == bbr.O) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bbn b(bbn $$0, int $$1) {
      List<bbn> $$2 = $$0.cI();
      return $$1 != 1 && !$$2.isEmpty() ? this.b((bbn)$$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected ajv r() {
      return this.s.y ? null : (ajv)bst.c(this).orElse(null);
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.ps;
   }

   @Override
   protected ajv x_() {
      return ajw.pq;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.pu, 0.15F, 1.0F);
   }

   protected void b(ajv $$0) {
      this.a($$0, this.eC(), this.eD());
   }

   @Override
   protected void fP() {
      this.b(ajw.pv);
   }
}
