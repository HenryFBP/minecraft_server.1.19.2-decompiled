import java.util.Locale;
import javax.annotation.Nullable;

public class boe extends bnd {
   public static final String b = "BucketVariantTag";
   private static final aaj<Integer> bX = aam.a(boe.class, aal.b);
   public static final int c = 0;
   public static final int d = 1;
   private static final int bY = 2;
   private static final abb[] bZ = new abb[]{new abb("textures/entity/fish/tropical_a.png"), new abb("textures/entity/fish/tropical_b.png")};
   private static final abb[] ca = new abb[]{
      new abb("textures/entity/fish/tropical_a_pattern_1.png"),
      new abb("textures/entity/fish/tropical_a_pattern_2.png"),
      new abb("textures/entity/fish/tropical_a_pattern_3.png"),
      new abb("textures/entity/fish/tropical_a_pattern_4.png"),
      new abb("textures/entity/fish/tropical_a_pattern_5.png"),
      new abb("textures/entity/fish/tropical_a_pattern_6.png")
   };
   private static final abb[] cb = new abb[]{
      new abb("textures/entity/fish/tropical_b_pattern_1.png"),
      new abb("textures/entity/fish/tropical_b_pattern_2.png"),
      new abb("textures/entity/fish/tropical_b_pattern_3.png"),
      new abb("textures/entity/fish/tropical_b_pattern_4.png"),
      new abb("textures/entity/fish/tropical_b_pattern_5.png"),
      new abb("textures/entity/fish/tropical_b_pattern_6.png")
   };
   private static final int cc = 6;
   private static final int cd = 15;
   public static final int[] e = new int[]{
      a(boe.a.h, bzq.b, bzq.h),
      a(boe.a.g, bzq.h, bzq.h),
      a(boe.a.g, bzq.h, bzq.l),
      a(boe.a.l, bzq.a, bzq.h),
      a(boe.a.b, bzq.l, bzq.h),
      a(boe.a.a, bzq.b, bzq.a),
      a(boe.a.f, bzq.g, bzq.d),
      a(boe.a.j, bzq.k, bzq.e),
      a(boe.a.l, bzq.a, bzq.o),
      a(boe.a.f, bzq.a, bzq.e),
      a(boe.a.i, bzq.a, bzq.h),
      a(boe.a.l, bzq.a, bzq.b),
      a(boe.a.d, bzq.j, bzq.g),
      a(boe.a.e, bzq.f, bzq.d),
      a(boe.a.k, bzq.o, bzq.a),
      a(boe.a.c, bzq.h, bzq.o),
      a(boe.a.j, bzq.o, bzq.a),
      a(boe.a.g, bzq.a, bzq.e),
      a(boe.a.a, bzq.o, bzq.a),
      a(boe.a.b, bzq.h, bzq.a),
      a(boe.a.d, bzq.j, bzq.e),
      a(boe.a.g, bzq.e, bzq.e)
   };
   private boolean ce = true;

   private static int a(boe.a $$0, bzq $$1, bzq $$2) {
      return $$0.a() & 0xFF | ($$0.b() & 0xFF) << 8 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public boe(bbr<? extends boe> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   public static bzq c(int $$0) {
      return bzq.a(w($$0));
   }

   public static bzq s(int $$0) {
      return bzq.a(x($$0));
   }

   public static String t(int $$0) {
      int $$1 = v($$0);
      int $$2 = y($$0);
      return "entity.minecraft.tropical_fish.type." + boe.a.a($$1, $$2);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bX, 0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Variant", this.fS());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.u($$0.h("Variant"));
   }

   public void u(int $$0) {
      this.Y.b(bX, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.ce;
   }

   public int fS() {
      return this.Y.a(bX);
   }

   @Override
   public void m(cax $$0) {
      super.m($$0);
      pj $$1 = $$0.v();
      $$1.a("BucketVariantTag", this.fS());
   }

   @Override
   public cax b() {
      return new cax(caz.oR);
   }

   @Override
   protected ajv r() {
      return ajw.uX;
   }

   @Override
   protected ajv x_() {
      return ajw.uY;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.va;
   }

   @Override
   protected ajv fK() {
      return ajw.uZ;
   }

   private static int w(int $$0) {
      return ($$0 & 0xFF0000) >> 16;
   }

   public float[] fT() {
      return bzq.a(w(this.fS())).d();
   }

   private static int x(int $$0) {
      return ($$0 & 0xFF000000) >> 24;
   }

   public float[] fU() {
      return bzq.a(x(this.fS())).d();
   }

   public static int v(int $$0) {
      return Math.min($$0 & 0xFF, 1);
   }

   public int fV() {
      return v(this.fS());
   }

   private static int y(int $$0) {
      return Math.min(($$0 & 0xFF00) >> 8, 5);
   }

   public abb fW() {
      return v(this.fS()) == 0 ? ca[y(this.fS())] : cb[y(this.fS())];
   }

   public abb fX() {
      return bZ[v(this.fS())];
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bcg.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.u($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         amn $$5 = $$0.r_();
         int $$7;
         int $$8;
         int $$9;
         int $$10;
         if ($$3 instanceof boe.b $$6) {
            $$7 = $$6.b;
            $$8 = $$6.c;
            $$9 = $$6.d;
            $$10 = $$6.e;
         } else if ((double)$$5.i() < 0.9) {
            int $$11 = ad.a(e, $$5);
            $$7 = $$11 & 0xFF;
            $$8 = ($$11 & 0xFF00) >> 8;
            $$9 = ($$11 & 0xFF0000) >> 16;
            $$10 = ($$11 & 0xFF000000) >> 24;
            $$3 = new boe.b(this, $$7, $$8, $$9, $$10);
         } else {
            this.ce = false;
            $$7 = $$5.a(2);
            $$8 = $$5.a(6);
            $$9 = $$5.a(15);
            $$10 = $$5.a(15);
         }

         this.u($$7 | $$8 << 8 | $$9 << 16 | $$10 << 24);
         return $$3;
      }
   }

   public static boolean b(bbr<boe> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.b_($$3.c()).a(akp.a) && $$1.a_($$3.b()).a(cju.C) && ($$1.w($$3).a(akk.ai) || bog.c($$0, $$1, $$2, $$3, $$4));
   }

   static enum a {
      a(0, 0),
      b(0, 1),
      c(0, 2),
      d(0, 3),
      e(0, 4),
      f(0, 5),
      g(1, 0),
      h(1, 1),
      i(1, 2),
      j(1, 3),
      k(1, 4),
      l(1, 5);

      private final int m;
      private final int n;
      private static final boe.a[] o = values();

      private a(int $$0, int $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      public int a() {
         return this.m;
      }

      public int b() {
         return this.n;
      }

      public static String a(int $$0, int $$1) {
         return o[$$1 + 6 * $$0].c();
      }

      public String c() {
         return this.name().toLowerCase(Locale.ROOT);
      }
   }

   static class b extends bnd.a {
      final int b;
      final int c;
      final int d;
      final int e;

      b(boe $$0, int $$1, int $$2, int $$3, int $$4) {
         super($$0);
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }
   }
}
