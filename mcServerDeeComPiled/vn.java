import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class vn implements tc<tf> {
   private final IntList a;

   public vn(IntList $$0) {
      this.a = new IntArrayList($$0);
   }

   public vn(int... $$0) {
      this.a = new IntArrayList($$0);
   }

   public vn(qx $$0) {
      this.a = $$0.a();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.a;
   }
}
