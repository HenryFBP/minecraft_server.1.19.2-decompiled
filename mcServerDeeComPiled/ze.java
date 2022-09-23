public class ze implements tc<xm> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final gt d;
   private final cuo.a e;
   private final cwx f;
   private final String g;
   private final gt h;
   private final hs i;
   private final coh j;
   private final cpw k;
   private final String l;
   private final boolean m;
   private final boolean n;
   private final boolean o;
   private final float p;
   private final long q;

   public ze(
      gt $$0, cuo.a $$1, cwx $$2, String $$3, gt $$4, hs $$5, coh $$6, cpw $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
   ) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$8;
      this.m = $$9;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
      this.q = $$13;
   }

   public ze(qx $$0) {
      this.d = $$0.f();
      this.e = $$0.a(cuo.a.class);
      this.f = $$0.a(cwx.class);
      this.g = $$0.q();
      int $$1 = 48;
      this.h = new gt(ami.a($$0.readByte(), -48, 48), ami.a($$0.readByte(), -48, 48), ami.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.i = new hs(ami.a($$0.readByte(), 0, 48), ami.a($$0.readByte(), 0, 48), ami.a($$0.readByte(), 0, 48));
      this.j = $$0.a(coh.class);
      this.k = $$0.a(cpw.class);
      this.l = $$0.e(128);
      this.p = ami.a($$0.readFloat(), 0.0F, 1.0F);
      this.q = $$0.l();
      int $$3 = $$0.readByte();
      this.m = ($$3 & 1) != 0;
      this.n = ($$3 & 2) != 0;
      this.o = ($$3 & 4) != 0;
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.d);
      $$0.a((Enum<?>)this.e);
      $$0.a((Enum<?>)this.f);
      $$0.a(this.g);
      $$0.writeByte(this.h.u());
      $$0.writeByte(this.h.v());
      $$0.writeByte(this.h.w());
      $$0.writeByte(this.i.u());
      $$0.writeByte(this.i.v());
      $$0.writeByte(this.i.w());
      $$0.a((Enum<?>)this.j);
      $$0.a((Enum<?>)this.k);
      $$0.a(this.l);
      $$0.writeFloat(this.p);
      $$0.b(this.q);
      int $$1 = 0;
      if (this.m) {
         $$1 |= 1;
      }

      if (this.n) {
         $$1 |= 2;
      }

      if (this.o) {
         $$1 |= 4;
      }

      $$0.writeByte($$1);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public gt b() {
      return this.d;
   }

   public cuo.a c() {
      return this.e;
   }

   public cwx d() {
      return this.f;
   }

   public String e() {
      return this.g;
   }

   public gt f() {
      return this.h;
   }

   public hs g() {
      return this.i;
   }

   public coh h() {
      return this.j;
   }

   public cpw i() {
      return this.k;
   }

   public String j() {
      return this.l;
   }

   public boolean k() {
      return this.m;
   }

   public boolean l() {
      return this.n;
   }

   public boolean m() {
      return this.o;
   }

   public float n() {
      return this.p;
   }

   public long o() {
      return this.q;
   }
}
