import javax.annotation.Nullable;

public class wj implements tc<tf> {
   private final int a;
   private final int b;

   public wj(bbn $$0, @Nullable bbn $$1) {
      this.a = $$0.ae();
      this.b = $$1 != null ? $$1.ae() : 0;
   }

   public wj(qx $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.writeInt(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
