public abstract class cdb implements cdp<bac> {
   protected final cds<?> a;
   protected final abb b;
   protected final String c;
   protected final cdm d;
   protected final cax e;
   protected final float f;
   protected final int g;

   public cdb(cds<?> $$0, abb $$1, String $$2, cdm $$3, cax $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bac $$0, cgx $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cax a(bac $$0) {
      return this.e.o();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public hi<cdm> a() {
      hi<cdm> $$0 = hi.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cax c() {
      return this.e;
   }

   @Override
   public String d() {
      return this.c;
   }

   public int e() {
      return this.g;
   }

   @Override
   public abb f() {
      return this.b;
   }

   @Override
   public cds<?> g() {
      return this.a;
   }
}
