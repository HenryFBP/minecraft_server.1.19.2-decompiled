import javax.annotation.Nullable;

public interface si {
   static si a(@Nullable buf $$0, boolean $$1) {
      return (si)($$0 != null ? new si.a($$0.a()) : new si.c($$1));
   }

   si.b a(sh var1, rz var2, byte[] var3);

   si.b a(sd var1);

   public static class a implements si {
      private final amp a;
      @Nullable
      private rz b;
      private boolean c = true;

      public a(amp $$0) {
         this.a = $$0;
      }

      private boolean a(sh $$0, rz $$1, boolean $$2) {
         if ($$1.a()) {
            return false;
         } else if ($$2 && $$1.equals(this.b)) {
            return true;
         } else {
            return this.b == null || this.b.equals($$0.a());
         }
      }

      private boolean a(sh $$0, rz $$1, byte[] $$2, boolean $$3) {
         return this.a($$0, $$1, $$3) && $$1.a(this.a, $$0, $$2);
      }

      private si.b b(sh $$0, rz $$1, byte[] $$2, boolean $$3) {
         this.c = this.c && this.a($$0, $$1, $$2, $$3);
         if (!this.c) {
            return si.b.c;
         } else {
            this.b = $$1;
            return si.b.a;
         }
      }

      @Override
      public si.b a(sh $$0, rz $$1, byte[] $$2) {
         return this.b($$0, $$1, $$2, false);
      }

      @Override
      public si.b a(sd $$0) {
         byte[] $$1 = $$0.k().a().asBytes();
         return this.b($$0.i(), $$0.j(), $$1, true);
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static class c implements si {
      private final boolean a;

      public c(boolean $$0) {
         this.a = $$0;
      }

      private si.b a(rz $$0) {
         if (!$$0.a()) {
            return si.b.c;
         } else {
            return this.a ? si.b.c : si.b.b;
         }
      }

      @Override
      public si.b a(sh $$0, rz $$1, byte[] $$2) {
         return this.a($$1);
      }

      @Override
      public si.b a(sd $$0) {
         return this.a($$0.j());
      }
   }
}
