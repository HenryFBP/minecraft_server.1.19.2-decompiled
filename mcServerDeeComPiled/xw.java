public record xw(String b, int c, bua d, boolean e, int f, bbx g, boolean h, boolean i) implements tc<xm> {
   public static final int a = 16;

   public xw(qx $$0) {
      this($$0.e(16), $$0.readByte(), $$0.a(bua.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.a(bbx.class), $$0.readBoolean(), $$0.readBoolean());
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.b);
      $$0.writeByte(this.c);
      $$0.a((Enum<?>)this.d);
      $$0.writeBoolean(this.e);
      $$0.writeByte(this.f);
      $$0.a((Enum<?>)this.g);
      $$0.writeBoolean(this.h);
      $$0.writeBoolean(this.i);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }
}
