public class tt implements tc<tf> {
   private final boolean a;

   public tt(boolean $$0) {
      this.a = $$0;
   }

   public tt(qx $$0) {
      this.a = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeBoolean(this.a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.a;
   }
}
