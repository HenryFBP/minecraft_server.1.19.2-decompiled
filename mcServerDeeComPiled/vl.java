import java.util.EnumSet;
import java.util.Set;

public class vl implements tc<tf> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;
   private final Set<vl.a> f;
   private final int g;
   private final boolean h;

   public vl(double $$0, double $$1, double $$2, float $$3, float $$4, Set<vl.a> $$5, int $$6, boolean $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   public vl(qx $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = vl.a.a($$0.readUnsignedByte());
      this.g = $$0.k();
      this.h = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeFloat(this.d);
      $$0.writeFloat(this.e);
      $$0.writeByte(vl.a.a(this.f));
      $$0.d(this.g);
      $$0.writeBoolean(this.h);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.a;
   }

   public double c() {
      return this.b;
   }

   public double d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }

   public float f() {
      return this.e;
   }

   public int g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public Set<vl.a> i() {
      return this.f;
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4);

      private final int f;

      private a(int $$0) {
         this.f = $$0;
      }

      private int a() {
         return 1 << this.f;
      }

      private boolean b(int $$0) {
         return ($$0 & this.a()) == this.a();
      }

      public static Set<vl.a> a(int $$0) {
         Set<vl.a> $$1 = EnumSet.noneOf(vl.a.class);

         for(vl.a $$2 : values()) {
            if ($$2.b($$0)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }

      public static int a(Set<vl.a> $$0) {
         int $$1 = 0;

         for(vl.a $$2 : $$0) {
            $$1 |= $$2.a();
         }

         return $$1;
      }
   }
}
