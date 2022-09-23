import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface ayv {
   ayu a();

   static <T> ayv.b<T> a(T $$0, int $$1) {
      return new ayv.b<>($$0, ayu.a($$1));
   }

   public static class a implements ayv {
      private final ayu a;

      public a(int $$0) {
         this.a = ayu.a($$0);
      }

      public a(ayu $$0) {
         this.a = $$0;
      }

      @Override
      public ayu a() {
         return this.a;
      }
   }

   public static class b<T> implements ayv {
      private final T a;
      private final ayu b;

      b(T $$0, ayu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public ayu a() {
         return this.b;
      }

      public static <E> Codec<ayv.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(ayv.b::b), ayu.a.fieldOf("weight").forGetter(ayv.b::a)).apply($$1, ayv.b::new)
         );
      }
   }
}
