import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class on {
   final oj a;
   private final List<og> b = Lists.newArrayList();
   private long c;

   on(oj $$0) {
      this.a = $$0;
      this.c = $$0.p();
   }

   public on a(Runnable $$0) {
      this.b.add(og.a($$0));
      return this;
   }

   public on a(long $$0, Runnable $$1) {
      this.b.add(og.a($$0, $$1));
      return this;
   }

   public on a(int $$0) {
      return this.a($$0, () -> {
      });
   }

   public on b(Runnable $$0) {
      this.b.add(og.a(() -> this.c($$0)));
      return this;
   }

   public on a(int $$0, Runnable $$1) {
      this.b.add(og.a(() -> {
         if (this.a.p() < this.c + (long)$$0) {
            throw new oc("Waiting");
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public on b(int $$0, Runnable $$1) {
      this.b.add(og.a(() -> {
         if (this.a.p() < this.c + (long)$$0) {
            this.c($$1);
            throw new oc("Waiting");
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(og.a(this.a::m));
   }

   public void a(Supplier<Exception> $$0) {
      this.b.add(og.a(() -> this.a.a((Throwable)$$0.get())));
   }

   public on.a b() {
      on.a $$0 = new on.a();
      this.b.add(og.a(() -> $$0.a(this.a.p())));
      return $$0;
   }

   public void a(long $$0) {
      try {
         this.c($$0);
      } catch (oc var4) {
      }

   }

   public void b(long $$0) {
      try {
         this.c($$0);
      } catch (oc var4) {
         this.a.a(var4);
      }

   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (oc var3) {
         this.a.a(var3);
      }

   }

   private void c(long $$0) {
      Iterator<og> $$1 = this.b.iterator();

      while($$1.hasNext()) {
         og $$2 = (og)$$1.next();
         $$2.b.run();
         $$1.remove();
         long $$3 = $$0 - this.c;
         long $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new oc("Succeeded in invalid tick: expected " + ($$4 + $$2.a) + ", but current tick is " + $$0));
            break;
         }
      }

   }

   public class a {
      private static final long b = -1L;
      private long c = -1L;

      void a(long $$0) {
         if (this.c != -1L) {
            throw new IllegalStateException("Condition already triggered at " + this.c);
         } else {
            this.c = $$0;
         }
      }

      public void a() {
         long $$0 = on.this.a.p();
         if (this.c != $$0) {
            if (this.c == -1L) {
               throw new oc("Condition not triggered (t=" + $$0 + ")");
            } else {
               throw new oc("Condition triggered at " + this.c + ", (t=" + $$0 + ")");
            }
         }
      }
   }
}
