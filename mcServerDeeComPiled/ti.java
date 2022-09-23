import java.util.UUID;

public class ti implements tc<tf> {
   private final int a;
   private final UUID b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;

   public ti(buc $$0) {
      this.a = $$0.ae();
      this.b = $$0.fy().getId();
      this.c = $$0.df();
      this.d = $$0.dh();
      this.e = $$0.dl();
      this.f = (byte)((int)($$0.dq() * 256.0F / 360.0F));
      this.g = (byte)((int)($$0.ds() * 256.0F / 360.0F));
   }

   public ti(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.m();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
      $$0.writeDouble(this.c);
      $$0.writeDouble(this.d);
      $$0.writeDouble(this.e);
      $$0.writeByte(this.f);
      $$0.writeByte(this.g);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public UUID c() {
      return this.b;
   }

   public double d() {
      return this.c;
   }

   public double e() {
      return this.d;
   }

   public double f() {
      return this.e;
   }

   public byte g() {
      return this.f;
   }

   public byte h() {
      return this.g;
   }
}
