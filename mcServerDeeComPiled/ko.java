import javax.annotation.Nullable;

public final class ko {
   public static final ko a = a("all");
   public static final ko b = a("texture", a);
   public static final ko c = a("particle", b);
   public static final ko d = a("end", a);
   public static final ko e = a("bottom", d);
   public static final ko f = a("top", d);
   public static final ko g = a("front", a);
   public static final ko h = a("back", a);
   public static final ko i = a("side", a);
   public static final ko j = a("north", i);
   public static final ko k = a("south", i);
   public static final ko l = a("east", i);
   public static final ko m = a("west", i);
   public static final ko n = a("up");
   public static final ko o = a("down");
   public static final ko p = a("cross");
   public static final ko q = a("plant");
   public static final ko r = a("wall", a);
   public static final ko s = a("rail");
   public static final ko t = a("wool");
   public static final ko u = a("pattern");
   public static final ko v = a("pane");
   public static final ko w = a("edge");
   public static final ko x = a("fan");
   public static final ko y = a("stem");
   public static final ko z = a("upperstem");
   public static final ko A = a("crop");
   public static final ko B = a("dirt");
   public static final ko C = a("fire");
   public static final ko D = a("lantern");
   public static final ko E = a("platform");
   public static final ko F = a("unsticky");
   public static final ko G = a("torch");
   public static final ko H = a("layer0");
   public static final ko I = a("lit_log");
   public static final ko J = a("candle");
   public static final ko K = a("inside");
   public static final ko L = a("content");
   public static final ko M = a("inner_top");
   private final String N;
   @Nullable
   private final ko O;

   private static ko a(String $$0) {
      return new ko($$0, null);
   }

   private static ko a(String $$0, ko $$1) {
      return new ko($$0, $$1);
   }

   private ko(String $$0, @Nullable ko $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public String a() {
      return this.N;
   }

   @Nullable
   public ko b() {
      return this.O;
   }

   public String toString() {
      return "#" + this.N;
   }
}
