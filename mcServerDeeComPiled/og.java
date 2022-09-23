import javax.annotation.Nullable;

class og {
   @Nullable
   public final Long a;
   public final Runnable b;

   private og(@Nullable Long $$0, Runnable $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static og a(Runnable $$0) {
      return new og(null, $$0);
   }

   static og a(long $$0, Runnable $$1) {
      return new og($$0, $$1);
   }
}
