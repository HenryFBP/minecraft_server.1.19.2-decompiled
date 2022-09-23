import java.util.UUID;
import javax.annotation.Nullable;

public class bsl extends bsj implements bcj {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bdb d = new bdb(c, "Attacking speed boost", 0.05, bdb.a.a);
   private static final azu ca = anc.a(0, 1);
   private int cb;
   private static final azu cc = anc.a(20, 39);
   private int cd;
   @Nullable
   private UUID ce;
   private static final int cf = 10;
   private static final azu cg = anc.a(4, 6);
   private int ch;

   public bsl(bbr<? extends bsl> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ce = $$0;
   }

   @Override
   public double bs() {
      return this.y_() ? -0.05 : -0.45;
   }

   @Override
   protected void n() {
      this.bS.a(2, new bkd(this, 1.0, false));
      this.bS.a(7, new bkb(this, 1.0));
      this.bT.a(1, new bkg(this).a());
      this.bT.a(2, new bkh(this, buc.class, 10, true, false, this::a_));
      this.bT.a(3, new bkn<>(this, true));
   }

   public static bdc.a fT() {
      return bsj.fP().a(bdd.l, 0.0).a(bdd.d, 0.23F).a(bdd.f, 5.0);
   }

   @Override
   protected boolean fK() {
      return false;
   }

   @Override
   protected void T() {
      bcz $$0 = this.a(bdd.d);
      if (this.I_()) {
         if (!this.y_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.fU();
      } else if ($$0.a(d)) {
         $$0.d(d);
      }

      this.a((agg)this.s, true);
      if (this.G() != null) {
         this.fV();
      }

      if (this.I_()) {
         this.bd = this.S;
      }

      super.T();
   }

   private void fU() {
      if (this.cb > 0) {
         --this.cb;
         if (this.cb == 0) {
            this.fX();
         }
      }

   }

   private void fV() {
      if (this.ch > 0) {
         --this.ch;
      } else {
         if (this.E().a(this.G())) {
            this.fW();
         }

         this.ch = cg.a(this.R);
      }
   }

   private void fW() {
      double $$0 = this.b(bdd.b);
      dwl $$1 = dwl.a(this.cY()).c($$0, 10.0, $$0);
      this.s
         .a(bsl.class, $$1, bbq.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.G() == null)
         .filter($$0x -> !$$0x.p(this.G()))
         .forEach($$0x -> $$0x.h(this.G()));
   }

   private void fX() {
      this.a(ajw.yf, this.eC() * 2.0F, this.eD() * 1.8F);
   }

   @Override
   public void h(@Nullable bcc $$0) {
      if (this.G() == null && $$0 != null) {
         this.cb = ca.a(this.R);
         this.ch = cg.a(this.R);
      }

      if ($$0 instanceof buc) {
         this.d((buc)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cc.a(this.R));
   }

   public static boolean b(bbr<bsl> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.ag() != bag.a && !$$1.a_($$3.c()).a(cju.jw);
   }

   @Override
   public boolean a(cha $$0) {
      return $$0.f(this) && !$$0.d(this.cy());
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a(this.s, $$0);
   }

   @Override
   public void a(int $$0) {
      this.cd = $$0;
   }

   @Override
   public int a() {
      return this.cd;
   }

   @Override
   protected ajv r() {
      return this.I_() ? ajw.yf : ajw.ye;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.yh;
   }

   @Override
   protected ajv x_() {
      return ajw.yg;
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      this.a(bbs.a, new cax(caz.nr));
   }

   @Override
   protected cax fJ() {
      return cax.b;
   }

   @Override
   protected void fS() {
      this.a(bdd.l).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ce;
   }

   @Override
   public boolean e(buc $$0) {
      return this.a_((bcc)$$0);
   }

   @Override
   public boolean l(cax $$0) {
      return this.k($$0);
   }
}
