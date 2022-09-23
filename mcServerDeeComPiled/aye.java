import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import it.unimi.dsi.fastutil.ints.Int2DoubleMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class aye {
   private final String b;
   private final ayd c;
   private final DoubleSupplier d;
   private final ByteBuf e;
   private final ByteBuf f;
   private volatile boolean g;
   @Nullable
   private final Runnable h;
   @Nullable
   final aye.c a;
   private double i;

   protected aye(String $$0, ayd $$1, DoubleSupplier $$2, @Nullable Runnable $$3, @Nullable aye.c $$4) {
      this.b = $$0;
      this.c = $$1;
      this.h = $$3;
      this.d = $$2;
      this.a = $$4;
      this.f = ByteBufAllocator.DEFAULT.buffer();
      this.e = ByteBufAllocator.DEFAULT.buffer();
      this.g = true;
   }

   public static aye a(String $$0, ayd $$1, DoubleSupplier $$2) {
      return new aye($$0, $$1, $$2, null, null);
   }

   public static <T> aye a(String $$0, ayd $$1, T $$2, ToDoubleFunction<T> $$3) {
      return a($$0, $$1, $$3, $$2).a();
   }

   public static <T> aye.a<T> a(String $$0, ayd $$1, ToDoubleFunction<T> $$2, T $$3) {
      return new aye.a<>($$0, $$1, $$2, $$3);
   }

   public void a() {
      if (!this.g) {
         throw new IllegalStateException("Not running");
      } else {
         if (this.h != null) {
            this.h.run();
         }

      }
   }

   public void a(int $$0) {
      this.h();
      this.i = this.d.getAsDouble();
      this.f.writeDouble(this.i);
      this.e.writeInt($$0);
   }

   public void b() {
      this.h();
      this.f.release();
      this.e.release();
      this.g = false;
   }

   private void h() {
      if (!this.g) {
         throw new IllegalStateException(String.format(Locale.ROOT, "Sampler for metric %s not started!", this.b));
      }
   }

   DoubleSupplier c() {
      return this.d;
   }

   public String d() {
      return this.b;
   }

   public ayd e() {
      return this.c;
   }

   public aye.b f() {
      Int2DoubleMap $$0 = new Int2DoubleOpenHashMap();
      int $$1 = Integer.MIN_VALUE;

      int $$2;
      int $$3;
      for($$2 = Integer.MIN_VALUE; this.f.isReadable(8); $$2 = $$3) {
         $$3 = this.e.readInt();
         if ($$1 == Integer.MIN_VALUE) {
            $$1 = $$3;
         }

         $$0.put($$3, this.f.readDouble());
      }

      return new aye.b($$1, $$2, $$0);
   }

   public boolean g() {
      return this.a != null && this.a.test(this.i);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         aye $$1 = (aye)$$0;
         return this.b.equals($$1.b) && this.c.equals($$1.c);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.b.hashCode();
   }

   public static class a<T> {
      private final String a;
      private final ayd b;
      private final DoubleSupplier c;
      private final T d;
      @Nullable
      private Runnable e;
      @Nullable
      private aye.c f;

      public a(String $$0, ayd $$1, ToDoubleFunction<T> $$2, T $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = () -> $$2.applyAsDouble($$3);
         this.d = $$3;
      }

      public aye.a<T> a(Consumer<T> $$0) {
         this.e = () -> $$0.accept(this.d);
         return this;
      }

      public aye.a<T> a(aye.c $$0) {
         this.f = $$0;
         return this;
      }

      public aye a() {
         return new aye(this.a, this.b, this.c, this.e, this.f);
      }
   }

   public static class b {
      private final Int2DoubleMap a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, Int2DoubleMap $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      public double a(int $$0) {
         return this.a.get($$0);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }

   public interface c {
      boolean test(double var1);
   }

   public static class d implements aye.c {
      private final float a;
      private double b = Double.MIN_VALUE;

      public d(float $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(double $$0) {
         boolean $$2;
         if (this.b != Double.MIN_VALUE && !($$0 <= this.b)) {
            $$2 = ($$0 - this.b) / this.b >= (double)this.a;
         } else {
            $$2 = false;
         }

         this.b = $$0;
         return $$2;
      }
   }
}
