import java.util.Arrays;

public class rx {
   private final rw.a[] a;
   private int b;
   private rw c = rw.a;

   public rx(int $$0) {
      this.a = new rw.a[$$0];
   }

   public void a(rw.a $$0) {
      rw.a $$1 = $$0;

      for(int $$2 = 0; $$2 < this.b; ++$$2) {
         rw.a $$3 = this.a[$$2];
         this.a[$$2] = $$1;
         $$1 = $$3;
         if ($$3.a().equals($$0.a())) {
            $$1 = null;
            break;
         }
      }

      if ($$1 != null && this.b < this.a.length) {
         this.a[this.b++] = $$1;
      }

      this.c = new rw(Arrays.asList((rw.a[])Arrays.copyOf(this.a, this.b)));
   }

   public rw a() {
      return this.c;
   }
}
