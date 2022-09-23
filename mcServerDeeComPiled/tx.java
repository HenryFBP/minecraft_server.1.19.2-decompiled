import java.util.List;

public class tx implements tc<tf> {
   private final int a;
   private final int b;
   private final List<cax> c;
   private final cax d;

   public tx(int $$0, int $$1, hi<cax> $$2, cax $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = hi.<cax>a($$2.size(), cax.b);

      for(int $$4 = 0; $$4 < $$2.size(); ++$$4) {
         this.c.set($$4, $$2.get($$4).o());
      }

      this.d = $$3.o();
   }

   public tx(qx $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.k();
      this.c = $$0.a(hi::a, qx::p);
      this.d = $$0.p();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a);
      $$0.d(this.b);
      $$0.a(this.c, qx::a);
      $$0.a(this.d);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public List<cax> c() {
      return this.c;
   }

   public cax d() {
      return this.d;
   }

   public int e() {
      return this.b;
   }
}
