import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dbl {
   Codec<dbl> a = alq.a(dbl.b.d, alq.a(dbl.a.d, dbl.c.d)).xmap(dbl::a, dbl::a);
   dbl b = b(0);
   dbl c = c(0);

   static dbl a(int $$0) {
      return new dbl.b($$0);
   }

   static dbl b(int $$0) {
      return new dbl.a($$0);
   }

   static dbl c(int $$0) {
      return new dbl.c($$0);
   }

   static dbl a() {
      return b;
   }

   static dbl b() {
      return c;
   }

   private static dbl a(Either<dbl.b, Either<dbl.a, dbl.c>> $$0) {
      return (dbl)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dbl.b, Either<dbl.a, dbl.c>> a(dbl $$0) {
      return $$0 instanceof dbl.b ? Either.left((dbl.b)$$0) : Either.right($$0 instanceof dbl.a ? Either.left((dbl.a)$$0) : Either.right((dbl.c)$$0));
   }

   int a(dbn var1);

   public static record a(int e) implements dbl {
      public static final Codec<dbl.a> d = Codec.intRange(cyu.e, cyu.d).fieldOf("above_bottom").xmap(dbl.a::new, dbl.a::c).codec();

      @Override
      public int a(dbn $$0) {
         return $$0.a() + this.e;
      }

      public String toString() {
         return this.e + " above bottom";
      }

      public int c() {
         return this.e;
      }
   }

   public static record b(int e) implements dbl {
      public static final Codec<dbl.b> d = Codec.intRange(cyu.e, cyu.d).fieldOf("absolute").xmap(dbl.b::new, dbl.b::c).codec();

      @Override
      public int a(dbn $$0) {
         return this.e;
      }

      public String toString() {
         return this.e + " absolute";
      }

      public int c() {
         return this.e;
      }
   }

   public static record c(int e) implements dbl {
      public static final Codec<dbl.c> d = Codec.intRange(cyu.e, cyu.d).fieldOf("below_top").xmap(dbl.c::new, dbl.c::c).codec();

      @Override
      public int a(dbn $$0) {
         return $$0.b() - 1 + $$0.a() - this.e;
      }

      public String toString() {
         return this.e + " below top";
      }

      public int c() {
         return this.e;
      }
   }
}
