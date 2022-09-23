import java.util.function.Function;
import javax.annotation.Nullable;

public class ye implements tc<xm> {
   private final int a;
   private final ye.a b;
   private final boolean c;
   static final ye.a d = new ye.a() {
      @Override
      public ye.b a() {
         return ye.b.b;
      }

      @Override
      public void a(ye.c $$0) {
         $$0.a();
      }

      @Override
      public void a(qx $$0) {
      }
   };

   private ye(int $$0, boolean $$1, ye.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static ye a(bbn $$0, boolean $$1) {
      return new ye($$0.ae(), $$1, d);
   }

   public static ye a(bbn $$0, boolean $$1, bai $$2) {
      return new ye($$0.ae(), $$1, new ye.d($$2));
   }

   public static ye a(bbn $$0, boolean $$1, bai $$2, dwq $$3) {
      return new ye($$0.ae(), $$1, new ye.e($$2, $$3));
   }

   public ye(qx $$0) {
      this.a = $$0.k();
      ye.b $$1 = $$0.a(ye.b.class);
      this.b = (ye.a)$$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a((Enum<?>)this.b.a());
      this.b.a($$0);
      $$0.writeBoolean(this.c);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   @Nullable
   public bbn a(agg $$0) {
      return $$0.b(this.a);
   }

   public boolean b() {
      return this.c;
   }

   public void a(ye.c $$0) {
      this.b.a($$0);
   }

   interface a {
      ye.b a();

      void a(ye.c var1);

      void a(qx var1);
   }

   static enum b {
      a(ye.d::new),
      b($$0 -> ye.d),
      c(ye.e::new);

      final Function<qx, ye.a> d;

      private b(Function<qx, ye.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bai var1);

      void a(bai var1, dwq var2);

      void a();
   }

   static class d implements ye.a {
      private final bai a;

      d(bai $$0) {
         this.a = $$0;
      }

      private d(qx $$0) {
         this.a = $$0.a(bai.class);
      }

      @Override
      public ye.b a() {
         return ye.b.a;
      }

      @Override
      public void a(ye.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(qx $$0) {
         $$0.a((Enum<?>)this.a);
      }
   }

   static class e implements ye.a {
      private final bai a;
      private final dwq b;

      e(bai $$0, dwq $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(qx $$0) {
         this.b = new dwq((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.a(bai.class);
      }

      @Override
      public ye.b a() {
         return ye.b.c;
      }

      @Override
      public void a(ye.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(qx $$0) {
         $$0.writeFloat((float)this.b.c);
         $$0.writeFloat((float)this.b.d);
         $$0.writeFloat((float)this.b.e);
         $$0.a((Enum<?>)this.a);
      }
   }
}
