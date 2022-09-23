import javax.annotation.Nullable;

public class vk implements tc<tf> {
   private final double a;
   private final double b;
   private final double c;
   private final int d;
   private final ea.a e;
   private final ea.a f;
   private final boolean g;

   public vk(ea.a $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = 0;
      this.g = false;
      this.f = null;
   }

   public vk(ea.a $$0, bbn $$1, ea.a $$2) {
      this.e = $$0;
      this.d = $$1.ae();
      this.f = $$2;
      dwq $$3 = $$2.a($$1);
      this.a = $$3.c;
      this.b = $$3.d;
      this.c = $$3.e;
      this.g = true;
   }

   public vk(qx $$0) {
      this.e = $$0.a(ea.a.class);
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.g = $$0.readBoolean();
      if (this.g) {
         this.d = $$0.k();
         this.f = $$0.a(ea.a.class);
      } else {
         this.d = 0;
         this.f = null;
      }

   }

   @Override
   public void a(qx $$0) {
      $$0.a((Enum<?>)this.e);
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeBoolean(this.g);
      if (this.g) {
         $$0.d(this.d);
         $$0.a((Enum<?>)this.f);
      }

   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public ea.a b() {
      return this.e;
   }

   @Nullable
   public dwq a(cgx $$0) {
      if (this.g) {
         bbn $$1 = $$0.a(this.d);
         return $$1 == null ? new dwq(this.a, this.b, this.c) : this.f.a($$1);
      } else {
         return new dwq(this.a, this.b, this.c);
      }
   }
}
