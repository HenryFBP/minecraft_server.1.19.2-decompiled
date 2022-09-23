import java.util.Objects;
import javax.annotation.Nullable;

public class wh implements tc<tf> {
   private final int a;
   private final String b;

   public wh(int $$0, @Nullable dxl $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }

   }

   public wh(qx $$0) {
      this.a = $$0.readByte();
      this.b = $$0.q();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a);
      $$0.a(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   @Nullable
   public String c() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
