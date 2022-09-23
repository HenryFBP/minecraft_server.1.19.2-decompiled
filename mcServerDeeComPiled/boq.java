import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class boq extends bne {
   public static final cdm bX = cdm.a(caz.oZ);
   protected static final ImmutableList<blz<? extends bly<? super boq>>> bY = ImmutableList.of(blz.c, blz.f, blz.s, blz.r, blz.t);
   protected static final ImmutableList<bku<?>> ca = ImmutableList.of(
      bku.n, bku.g, bku.h, bku.m, bku.E, bku.t, bku.r, bku.Q, bku.R, bku.o, bku.N, bku.O, new bku[]{bku.P, bku.x, bku.y, bku.B, bku.V, bku.W, bku.X, bku.Y}
   );
   private static final aaj<bnp> ci = aam.a(boq.class, aal.v);
   private static final aaj<OptionalInt> cj = aam.a(boq.class, aal.s);
   private static final int ck = 5;
   public static final String cb = "variant";
   public final bbl cc = new bbl();
   public final bbl cd = new bbl();
   public final bbl ce = new bbl();
   public final bbl cf = new bbl();
   public final bbl cg = new bbl();
   public final bbl ch = new bbl();

   public boq(bbr<? extends bne> $$0, cgx $$1) {
      super($$0, $$1);
      this.bO = new boq.a(this);
      this.a(dqh.j, 4.0F);
      this.a(dqh.e, -1.0F);
      this.bP = new bhu(this, 85, 10, 0.02F, 0.1F, true);
      this.P = 1.0F;
   }

   @Override
   protected bcx.b<boq> dz() {
      return bcx.a(ca, bY);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return bor.a(this.dz().a($$0));
   }

   @Override
   public bcx<boq> dy() {
      return super.dy();
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ci, bnp.a);
      this.Y.a(cj, OptionalInt.empty());
   }

   public void q() {
      this.Y.b(cj, OptionalInt.empty());
   }

   public Optional<bbn> t() {
      return ((OptionalInt)this.Y.a(cj)).stream().mapToObj(this.s::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bbn $$0) {
      this.Y.b(cj, OptionalInt.of($$0.ae()));
   }

   @Override
   public int fn() {
      return 35;
   }

   @Override
   public int V() {
      return 5;
   }

   public bnp fJ() {
      return this.Y.a(ci);
   }

   public void a(bnp $$0) {
      this.Y.b(ci, $$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("variant", hm.bM.b(this.fJ()).toString());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      bnp $$1 = (bnp)hm.bM.a(abb.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

   }

   @Override
   public boolean dB() {
      return true;
   }

   private boolean fL() {
      return this.y && this.dd().i() > 1.0E-6 && !this.aU();
   }

   private boolean fR() {
      return this.dd().i() > 1.0E-6 && this.aU();
   }

   @Override
   protected void T() {
      this.s.ac().a("frogBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      this.s.ac().a("frogActivityUpdate");
      bor.a(this);
      this.s.ac().c();
      super.T();
   }

   @Override
   public void k() {
      if (this.s.k_()) {
         if (this.fL()) {
            this.cf.b(this.S);
         } else {
            this.cf.a();
         }

         if (this.fR()) {
            this.ch.a();
            this.cg.b(this.S);
         } else if (this.aU()) {
            this.cg.a();
            this.ch.b(this.S);
         } else {
            this.cg.a();
            this.ch.a();
         }
      }

      super.k();
   }

   @Override
   public void a(aaj<?> $$0) {
      if (ad.equals($$0)) {
         bco $$1 = this.ak();
         if ($$1 == bco.g) {
            this.cc.a(this.S);
         } else {
            this.cc.a();
         }

         if ($$1 == bco.i) {
            this.cd.a(this.S);
         } else {
            this.cd.a();
         }

         if ($$1 == bco.j) {
            this.ce.a(this.S);
         } else {
            this.ce.a();
         }
      }

      super.a($$0);
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      boq $$2 = bbr.H.a((cgx)$$0);
      if ($$2 != null) {
         bor.a($$2, $$0.r_());
      }

      return $$2;
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(agg $$0, bne $$1) {
      agh $$2 = this.fO();
      if ($$2 == null) {
         $$2 = $$1.fO();
      }

      if ($$2 != null) {
         $$2.a(akg.P);
         aj.o.a($$2, this, $$1, null);
      }

      this.b_(6000);
      $$1.b_(6000);
      this.fQ();
      $$1.fQ();
      this.dy().a(bku.W, anf.a);
      $$0.a(this, (byte)18);
      if ($$0.W().b(cgt.f)) {
         $$0.b(new bbt($$0, this.df(), this.dh(), this.dl(), this.dQ().a(7) + 1));
      }

   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      hc<cht> $$5 = $$0.w(this.da());
      if ($$5.a(akk.ae)) {
         this.a(bnp.c);
      } else if ($$5.a(akk.af)) {
         this.a(bnp.b);
      } else {
         this.a(bnp.a);
      }

      bor.a(this, $$0.r_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bdc.a fK() {
      return bce.w().a(bdd.d, 1.0).a(bdd.a, 10.0).a(bdd.f, 10.0);
   }

   @Nullable
   @Override
   protected ajv r() {
      return ajw.gV;
   }

   @Nullable
   @Override
   protected ajv c(baw $$0) {
      return ajw.gY;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return ajw.gW;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.hb, 0.15F, 1.0F);
   }

   @Override
   public boolean cr() {
      return false;
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() && this.aR()) {
         this.a(this.eK(), $$0);
         this.a(bci.a, this.dd());
         this.f(this.dd().a(0.9));
      } else {
         super.g($$0);
      }

   }

   @Override
   public boolean b(dqh $$0) {
      return super.b($$0) && $$0 != dqh.k;
   }

   public static boolean k(bcc $$0) {
      if ($$0 instanceof brz $$1 && $$1.fL() != 1) {
         return false;
      }

      return $$0.ad().a(akn.k);
   }

   @Override
   protected blc a(cgx $$0) {
      return new boq.c(this, $$0);
   }

   @Override
   public boolean n(cax $$0) {
      return bX.a($$0);
   }

   public static boolean c(bbr<? extends bne> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bM) && a($$1, $$3);
   }

   class a extends bhr {
      a(bce $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return boq.this.t().isEmpty();
      }
   }

   static class b extends dqf {
      private final gt.a l = new gt.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Nullable
      @Override
      public dqj a() {
         return this.c(new gt(ami.b(this.b.cy().a), ami.b(this.b.cy().b), ami.b(this.b.cy().c)));
      }

      @Override
      public dqh a(cgd $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         cvo $$4 = $$0.a_(this.l);
         return $$4.a(akl.bz) ? dqh.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bkz {
      c(boq $$0, cgx $$1) {
         super($$0, $$1);
      }

      @Override
      protected dqn a(int $$0) {
         this.o = new boq.b(true);
         this.o.a(true);
         return new dqn(this.o, $$0);
      }
   }
}
