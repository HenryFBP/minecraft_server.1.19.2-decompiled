import io.netty.buffer.ByteBuf;

public class yb implements tc<xm> {
   private static final int b = 32767;
   public static final abb a = new abb("brand");
   private final abb c;
   private final qx d;

   public yb(abb $$0, qx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public yb(qx $$0) {
      this.c = $$0.r();
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 32767) {
         this.d = new qx($$0.readBytes($$1));
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.c);
      $$0.writeBytes((ByteBuf)this.d);
   }

   public void a(xm $$0) {
      $$0.a(this);
      this.d.release();
   }

   public abb b() {
      return this.c;
   }

   public qx c() {
      return this.d;
   }
}
