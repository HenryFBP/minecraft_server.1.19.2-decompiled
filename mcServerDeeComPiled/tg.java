import java.util.UUID;

public class tg implements tc<tf> {
   private static final double a = 8000.0;
   private static final double b = 3.9;
   private final int c;
   private final UUID d;
   private final bbr<?> e;
   private final double f;
   private final double g;
   private final double h;
   private final int i;
   private final int j;
   private final int k;
   private final byte l;
   private final byte m;
   private final byte n;
   private final int o;

   public tg(bcc $$0) {
      this($$0, 0);
   }

   public tg(bcc $$0, int $$1) {
      this($$0.ae(), $$0.co(), $$0.df(), $$0.dh(), $$0.dl(), $$0.ds(), $$0.dq(), $$0.ad(), $$1, $$0.dd(), (double)$$0.aZ);
   }

   public tg(bbn $$0) {
      this($$0, 0);
   }

   public tg(bbn $$0, int $$1) {
      this($$0.ae(), $$0.co(), $$0.df(), $$0.dh(), $$0.dl(), $$0.ds(), $$0.dq(), $$0.ad(), $$1, $$0.dd(), 0.0);
   }

   public tg(bbn $$0, int $$1, gt $$2) {
      this($$0.ae(), $$0.co(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.ds(), $$0.dq(), $$0.ad(), $$1, $$0.dd(), 0.0);
   }

   public tg(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bbr<?> $$7, int $$8, dwq $$9, double $$10) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.l = (byte)ami.d($$5 * 256.0F / 360.0F);
      this.m = (byte)ami.d($$6 * 256.0F / 360.0F);
      this.n = (byte)ami.b($$10 * 256.0 / 360.0);
      this.e = $$7;
      this.o = $$8;
      this.i = (int)(ami.a($$9.c, -3.9, 3.9) * 8000.0);
      this.j = (int)(ami.a($$9.d, -3.9, 3.9) * 8000.0);
      this.k = (int)(ami.a($$9.e, -3.9, 3.9) * 8000.0);
   }

   public tg(qx $$0) {
      this.c = $$0.k();
      this.d = $$0.m();
      this.e = $$0.a(hm.X);
      this.f = $$0.readDouble();
      this.g = $$0.readDouble();
      this.h = $$0.readDouble();
      this.l = $$0.readByte();
      this.m = $$0.readByte();
      this.n = $$0.readByte();
      this.o = $$0.k();
      this.i = $$0.readShort();
      this.j = $$0.readShort();
      this.k = $$0.readShort();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.c);
      $$0.a(this.d);
      $$0.a(hm.X, this.e);
      $$0.writeDouble(this.f);
      $$0.writeDouble(this.g);
      $$0.writeDouble(this.h);
      $$0.writeByte(this.l);
      $$0.writeByte(this.m);
      $$0.writeByte(this.n);
      $$0.d(this.o);
      $$0.writeShort(this.i);
      $$0.writeShort(this.j);
      $$0.writeShort(this.k);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public UUID c() {
      return this.d;
   }

   public bbr<?> d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public double f() {
      return this.g;
   }

   public double g() {
      return this.h;
   }

   public double h() {
      return (double)this.i / 8000.0;
   }

   public double i() {
      return (double)this.j / 8000.0;
   }

   public double j() {
      return (double)this.k / 8000.0;
   }

   public float k() {
      return (float)(this.l * 360) / 256.0F;
   }

   public float l() {
      return (float)(this.m * 360) / 256.0F;
   }

   public float m() {
      return (float)(this.n * 360) / 256.0F;
   }

   public int n() {
      return this.o;
   }
}
