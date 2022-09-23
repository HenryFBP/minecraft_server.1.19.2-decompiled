import javax.annotation.Nullable;

public enum cgu {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final cgu e = a;
   private static final int f = -1;
   private final int g;
   private final String h;
   private final rq i;
   private final rq j;

   private cgu(int $$0, String $$1) {
      this.g = $$0;
      this.h = $$1;
      this.i = rq.c("selectWorld.gameMode." + $$1);
      this.j = rq.c("gameMode." + $$1);
   }

   public int a() {
      return this.g;
   }

   public String b() {
      return this.h;
   }

   public rq c() {
      return this.j;
   }

   public rq d() {
      return this.i;
   }

   public void a(btz $$0) {
      if (this == b) {
         $$0.c = true;
         $$0.d = true;
         $$0.a = true;
      } else if (this == d) {
         $$0.c = true;
         $$0.d = false;
         $$0.a = true;
         $$0.b = true;
      } else {
         $$0.c = false;
         $$0.d = false;
         $$0.a = false;
         $$0.b = false;
      }

      $$0.e = !this.e();
   }

   public boolean e() {
      return this == c || this == d;
   }

   public boolean f() {
      return this == b;
   }

   public boolean g() {
      return this == a || this == c;
   }

   public static cgu a(int $$0) {
      return a($$0, e);
   }

   public static cgu a(int $$0, cgu $$1) {
      for(cgu $$2 : values()) {
         if ($$2.g == $$0) {
            return $$2;
         }
      }

      return $$1;
   }

   public static cgu a(String $$0) {
      return a($$0, a);
   }

   public static cgu a(String $$0, cgu $$1) {
      for(cgu $$2 : values()) {
         if ($$2.h.equals($$0)) {
            return $$2;
         }
      }

      return $$1;
   }

   public static int a(@Nullable cgu $$0) {
      return $$0 != null ? $$0.g : -1;
   }

   @Nullable
   public static cgu b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }
}
