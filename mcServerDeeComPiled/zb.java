import javax.annotation.Nullable;

public class zb implements tc<xm> {
   private final int a;
   private final String b;
   private final boolean c;

   public zb(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zb(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.q();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
      $$0.writeBoolean(this.c);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   @Nullable
   public cfy a(cgx $$0) {
      bbn $$1 = $$0.a(this.a);
      return $$1 instanceof bwb ? ((bwb)$$1).y() : null;
   }

   public String b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
