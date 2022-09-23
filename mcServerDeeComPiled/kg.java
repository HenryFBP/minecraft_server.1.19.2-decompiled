import com.google.gson.JsonPrimitive;

public class kg {
   public static final kh<kg.a> a = new kh("x", $$0 -> new JsonPrimitive($$0.e));
   public static final kh<kg.a> b = new kh("y", $$0 -> new JsonPrimitive($$0.e));
   public static final kh<abb> c = new kh<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final kh<Boolean> d = new kh("uvlock", JsonPrimitive::new);
   public static final kh<Integer> e = new kh("weight", JsonPrimitive::new);

   public static enum a {
      a(0),
      b(90),
      c(180),
      d(270);

      final int e;

      private a(int $$0) {
         this.e = $$0;
      }
   }
}
