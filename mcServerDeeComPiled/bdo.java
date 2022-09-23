import java.util.Map;
import java.util.Map.Entry;

public abstract class bdo<E extends bcc> {
   public static final int b = 60;
   protected final Map<bku<?>, bkv> c;
   private bdo.a a;
   private long d;
   private final int e;
   private final int f;

   public bdo(Map<bku<?>, bkv> $$0) {
      this($$0, 60);
   }

   public bdo(Map<bku<?>, bkv> $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public bdo(Map<bku<?>, bkv> $$0, int $$1, int $$2) {
      this.a = bdo.a.a;
      this.e = $$1;
      this.f = $$2;
      this.c = $$0;
   }

   public bdo.a a() {
      return this.a;
   }

   public final boolean e(agg $$0, E $$1, long $$2) {
      if (this.a($$1) && this.a($$0, $$1)) {
         this.a = bdo.a.b;
         int $$3 = this.e + $$0.r_().a(this.f + 1 - this.e);
         this.d = $$2 + (long)$$3;
         this.a($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   protected void a(agg $$0, E $$1, long $$2) {
   }

   public final void f(agg $$0, E $$1, long $$2) {
      if (!this.a($$2) && this.b($$0, $$1, $$2)) {
         this.d($$0, $$1, $$2);
      } else {
         this.g($$0, $$1, $$2);
      }

   }

   protected void d(agg $$0, E $$1, long $$2) {
   }

   public final void g(agg $$0, E $$1, long $$2) {
      this.a = bdo.a.a;
      this.c($$0, $$1, $$2);
   }

   protected void c(agg $$0, E $$1, long $$2) {
   }

   protected boolean b(agg $$0, E $$1, long $$2) {
      return false;
   }

   protected boolean a(long $$0) {
      return $$0 > this.d;
   }

   protected boolean a(agg $$0, E $$1) {
      return true;
   }

   public String toString() {
      return this.getClass().getSimpleName();
   }

   private boolean a(E $$0) {
      for(Entry<bku<?>, bkv> $$1 : this.c.entrySet()) {
         bku<?> $$2 = (bku)$$1.getKey();
         bkv $$3 = (bkv)$$1.getValue();
         if (!$$0.dy().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   public static enum a {
      a,
      b;
   }
}
