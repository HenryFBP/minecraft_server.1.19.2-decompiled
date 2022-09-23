import java.util.List;

public class wp implements tc<tf> {
   private final int a;
   private final int[] b;

   public wp(bbn $$0) {
      this.a = $$0.ae();
      List<bbn> $$1 = $$0.cI();
      this.b = new int[$$1.size()];

      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         this.b[$$2] = ((bbn)$$1.get($$2)).ae();
      }

   }

   public wp(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.c();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.b;
   }

   public int c() {
      return this.a;
   }
}
