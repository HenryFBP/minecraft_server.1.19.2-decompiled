public class bfn<E extends bcc> extends bdo<E> {
   private boolean a;
   private boolean d;
   private final azu e;
   private final bdo<? super E> f;
   private int g;

   public bfn(bdo<? super E> $$0, azu $$1) {
      this($$0, false, $$1);
   }

   public bfn(bdo<? super E> $$0, boolean $$1, azu $$2) {
      super($$0.c);
      this.f = $$0;
      this.a = !$$1;
      this.e = $$2;
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      if (!this.f.a($$0, $$1)) {
         return false;
      } else {
         if (this.a) {
            this.a($$0);
            this.a = false;
         }

         if (this.g > 0) {
            --this.g;
         }

         return !this.d && this.g == 0;
      }
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      this.f.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(agg $$0, E $$1, long $$2) {
      return this.f.b($$0, $$1, $$2);
   }

   @Override
   protected void d(agg $$0, E $$1, long $$2) {
      this.f.d($$0, $$1, $$2);
      this.d = this.f.a() == bdo.a.b;
   }

   @Override
   protected void c(agg $$0, E $$1, long $$2) {
      this.a($$0);
      this.f.c($$0, $$1, $$2);
   }

   private void a(agg $$0) {
      this.g = this.e.a($$0.w);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   public String toString() {
      return "RunSometimes: " + this.f;
   }
}
