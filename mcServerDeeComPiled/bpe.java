import java.util.Arrays;
import java.util.Comparator;

public enum bpe {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final bpe[] f = (bpe[])Arrays.stream(values()).sorted(Comparator.comparingInt(bpe::a)).toArray($$0 -> new bpe[$$0]);
   private final int g;

   private bpe(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bpe a(int $$0) {
      return f[$$0 % f.length];
   }
}
