import javax.annotation.Nullable;

public class bat {
   private final baw a;
   private final int b;
   private final float c;
   private final float d;
   @Nullable
   private final String e;
   private final float f;

   public bat(baw $$0, int $$1, float $$2, float $$3, @Nullable String $$4, float $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$3;
      this.d = $$2;
      this.e = $$4;
      this.f = $$5;
   }

   public baw a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public float c() {
      return this.c;
   }

   public float d() {
      return this.d;
   }

   public float e() {
      return this.d - this.c;
   }

   public boolean f() {
      return this.a.m() instanceof bcc;
   }

   @Nullable
   public String g() {
      return this.e;
   }

   @Nullable
   public rq h() {
      return this.a().m() == null ? null : this.a().m().C_();
   }

   @Nullable
   public bbn i() {
      return this.a().m();
   }

   public float j() {
      return this.a == baw.m ? Float.MAX_VALUE : this.f;
   }
}
