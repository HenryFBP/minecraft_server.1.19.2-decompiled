import java.util.function.Supplier;

public enum byq implements byp {
   a("leather", 5, new int[]{1, 2, 3, 1}, 15, ajw.ah, 0.0F, 0.0F, () -> cdm.a(caz.oM)),
   b("chainmail", 15, new int[]{1, 4, 5, 2}, 12, ajw.ab, 0.0F, 0.0F, () -> cdm.a(caz.na)),
   c("iron", 15, new int[]{2, 5, 6, 2}, 9, ajw.ag, 0.0F, 0.0F, () -> cdm.a(caz.na)),
   d("gold", 7, new int[]{1, 3, 5, 2}, 25, ajw.af, 0.0F, 0.0F, () -> cdm.a(caz.ne)),
   e("diamond", 33, new int[]{3, 6, 8, 3}, 10, ajw.ac, 2.0F, 0.0F, () -> cdm.a(caz.mU)),
   f("turtle", 25, new int[]{2, 5, 6, 2}, 9, ajw.aj, 0.0F, 0.0F, () -> cdm.a(caz.mN)),
   g("netherite", 37, new int[]{3, 6, 8, 3}, 15, ajw.ai, 3.0F, 0.1F, () -> cdm.a(caz.nf));

   private static final int[] h = new int[]{13, 15, 16, 11};
   private final String i;
   private final int j;
   private final int[] k;
   private final int l;
   private final ajv m;
   private final float n;
   private final float o;
   private final amd<cdm> p;

   private byq(String $$0, int $$1, int[] $$2, int $$3, ajv $$4, float $$5, float $$6, Supplier<cdm> $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
      this.m = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = new amd<>($$7);
   }

   @Override
   public int a(bbs $$0) {
      return h[$$0.b()] * this.j;
   }

   @Override
   public int b(bbs $$0) {
      return this.k[$$0.b()];
   }

   @Override
   public int a() {
      return this.l;
   }

   @Override
   public ajv b() {
      return this.m;
   }

   @Override
   public cdm c() {
      return this.p.a();
   }

   @Override
   public String d() {
      return this.i;
   }

   @Override
   public float e() {
      return this.n;
   }

   @Override
   public float f() {
      return this.o;
   }
}
