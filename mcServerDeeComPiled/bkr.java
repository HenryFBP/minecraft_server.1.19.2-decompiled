import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum bkr {
   a("major_negative", -5, 100, 10, 10),
   b("minor_negative", -1, 200, 20, 20),
   c("minor_positive", 1, 200, 1, 5),
   d("major_positive", 5, 100, 0, 100),
   e("trading", 1, 25, 2, 20);

   public static final int f = 25;
   public static final int g = 20;
   public static final int h = 2;
   public final String i;
   public final int j;
   public final int k;
   public final int l;
   public final int m;
   private static final Map<String, bkr> n = (Map<String, bkr>)Stream.of(values()).collect(ImmutableMap.toImmutableMap($$0 -> $$0.i, Function.identity()));

   private bkr(String $$0, int $$1, int $$2, int $$3, int $$4) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Nullable
   public static bkr a(String $$0) {
      return (bkr)n.get($$0);
   }
}
