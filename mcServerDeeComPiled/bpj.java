import java.util.Arrays;
import java.util.Comparator;

public enum bpj {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6);

   private static final bpj[] h = (bpj[])Arrays.stream(values()).sorted(Comparator.comparingInt(bpj::a)).toArray($$0 -> new bpj[$$0]);
   private final int i;

   private bpj(int $$0) {
      this.i = $$0;
   }

   public int a() {
      return this.i;
   }

   public static bpj a(int $$0) {
      return h[$$0 % h.length];
   }
}
