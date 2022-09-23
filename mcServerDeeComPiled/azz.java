import java.util.UUID;

public abstract class azz {
   private final UUID h;
   protected rq a;
   protected float b;
   protected azz.a c;
   protected azz.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public azz(UUID $$0, rq $$1, azz.a $$2, azz.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID i() {
      return this.h;
   }

   public rq j() {
      return this.a;
   }

   public void a(rq $$0) {
      this.a = $$0;
   }

   public float k() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public azz.a l() {
      return this.c;
   }

   public void a(azz.a $$0) {
      this.c = $$0;
   }

   public azz.b m() {
      return this.d;
   }

   public void a(azz.b $$0) {
      this.d = $$0;
   }

   public boolean n() {
      return this.e;
   }

   public azz a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean o() {
      return this.f;
   }

   public azz b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public azz c(boolean $$0) {
      this.g = $$0;
      return this;
   }

   public boolean p() {
      return this.g;
   }

   public static enum a {
      a("pink", p.m),
      b("blue", p.j),
      c("red", p.e),
      d("green", p.k),
      e("yellow", p.o),
      f("purple", p.b),
      g("white", p.p);

      private final String h;
      private final p i;

      private a(String $$0, p $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public p a() {
         return this.i;
      }

      public String b() {
         return this.h;
      }

      public static azz.a a(String $$0) {
         for(azz.a $$1 : values()) {
            if ($$1.h.equals($$0)) {
               return $$1;
            }
         }

         return g;
      }
   }

   public static enum b {
      a("progress"),
      b("notched_6"),
      c("notched_10"),
      d("notched_12"),
      e("notched_20");

      private final String f;

      private b(String $$0) {
         this.f = $$0;
      }

      public String a() {
         return this.f;
      }

      public static azz.b a(String $$0) {
         for(azz.b $$1 : values()) {
            if ($$1.f.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
