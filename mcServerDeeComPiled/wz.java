import javax.annotation.Nullable;

public class wz implements tc<tf> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final abb c;
   @Nullable
   private final ajx d;

   public wz(@Nullable abb $$0, @Nullable ajx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public wz(qx $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.a(ajx.class);
      } else {
         this.d = null;
      }

      if (($$1 & 2) > 0) {
         this.c = $$0.r();
      } else {
         this.c = null;
      }

   }

   @Override
   public void a(qx $$0) {
      if (this.d != null) {
         if (this.c != null) {
            $$0.writeByte(3);
            $$0.a((Enum<?>)this.d);
            $$0.a(this.c);
         } else {
            $$0.writeByte(1);
            $$0.a((Enum<?>)this.d);
         }
      } else if (this.c != null) {
         $$0.writeByte(2);
         $$0.a(this.c);
      } else {
         $$0.writeByte(0);
      }

   }

   @Nullable
   public abb b() {
      return this.c;
   }

   @Nullable
   public ajx c() {
      return this.d;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }
}
