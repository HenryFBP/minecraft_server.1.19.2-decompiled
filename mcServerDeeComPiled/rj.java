import javax.annotation.Nullable;

public class rj {
   @Nullable
   private rj.a a;

   public void a(String $$0, rq $$1) {
      this.a = new rj.a($$0, $$1);
   }

   @Nullable
   public rq a(String $$0) {
      rj.a $$1 = this.a;
      if ($$1 != null && $$1.a($$0)) {
         this.a = null;
         return $$1.b();
      } else {
         return null;
      }
   }

   static record a(String a, rq b) {
      public boolean a(String $$0) {
         return this.a.equals($$0);
      }
   }
}
