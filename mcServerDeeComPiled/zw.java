import javax.annotation.Nullable;

public class zw implements tc<zv> {
   private static final int a = 1048576;
   private final int b;
   @Nullable
   private final qx c;

   public zw(int $$0, @Nullable qx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public zw(qx $$0) {
      this.b = $$0.k();
      this.c = $$0.c($$0x -> {
         int $$1 = $$0x.readableBytes();
         if ($$1 >= 0 && $$1 <= 1048576) {
            return new qx($$0x.readBytes($$1));
         } else {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
         }
      });
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.b);
      $$0.a(this.c, ($$0x, $$1) -> $$0x.writeBytes($$1.slice()));
   }

   public void a(zv $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public qx c() {
      return this.c;
   }
}
