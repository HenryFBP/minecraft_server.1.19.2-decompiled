import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.Nullable;

public enum bag {
   a(0, "peaceful"),
   b(1, "easy"),
   c(2, "normal"),
   d(3, "hard");

   private static final bag[] e = (bag[])Arrays.stream(values()).sorted(Comparator.comparingInt(bag::a)).toArray($$0 -> new bag[$$0]);
   private final int f;
   private final String g;

   private bag(int $$0, String $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public int a() {
      return this.f;
   }

   public rq b() {
      return rq.c("options.difficulty." + this.g);
   }

   public static bag a(int $$0) {
      return e[$$0 % e.length];
   }

   @Nullable
   public static bag a(String $$0) {
      for(bag $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public String c() {
      return this.g;
   }
}
