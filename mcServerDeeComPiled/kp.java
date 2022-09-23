import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class kp {
   public static final kp.a a = a(kn::a, km.c);
   public static final kp.a b = a(kn::a, km.d);
   public static final kp.a c = a(kn::j, km.f);
   public static final kp.a d = a(kn::j, km.g);
   public static final kp.a e = a(kn::m, km.j);
   public static final kp.a f = a(kn::k, km.i);
   public static final kp.a g = a(kn::x, km.k);
   public static final kp.a h = a(kn::w, km.l);
   public static final kp.a i = a(kn::f, km.ah);
   public static final kp.a j = a(kn::h, km.ak);
   public static final kp.a k = a(kn::i, km.ai);
   public static final kp.a l = a(kn::q, km.L);
   public static final kp.a m = a(kn::z, km.at);
   public static final kp.a n = a(kn::a, km.O);
   public static final kp.a o = a(kn::t, km.aE);
   public static final kp.a p = a(kn::t, km.aF);
   public static final kp.a q = a(kn::b, km.aL);
   public static final kp.a r = a(kn::l, km.f);
   public static final kp.a s = a(kn::l, km.g);
   public static final kp.a t = a(kn::n, km.j);
   public static final kp.a u = a(kn::o, km.f);
   private final kn v;
   private final kl w;

   private kp(kn $$0, kl $$1) {
      this.v = $$0;
      this.w = $$1;
   }

   public kl a() {
      return this.w;
   }

   public kn b() {
      return this.v;
   }

   public kp a(Consumer<kn> $$0) {
      $$0.accept(this.v);
      return this;
   }

   public abb a(cjt $$0, BiConsumer<abb, Supplier<JsonElement>> $$1) {
      return this.w.a($$0, this.v, $$1);
   }

   public abb a(cjt $$0, String $$1, BiConsumer<abb, Supplier<JsonElement>> $$2) {
      return this.w.a($$0, $$1, this.v, $$2);
   }

   private static kp.a a(Function<cjt, kn> $$0, kl $$1) {
      return $$2 -> new kp((kn)$$0.apply($$2), $$1);
   }

   public static kp a(abb $$0) {
      return new kp(kn.b($$0), km.c);
   }

   @FunctionalInterface
   public interface a {
      kp get(cjt var1);

      default abb create(cjt $$0, BiConsumer<abb, Supplier<JsonElement>> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default abb createWithSuffix(cjt $$0, String $$1, BiConsumer<abb, Supplier<JsonElement>> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default kp.a updateTexture(Consumer<kn> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
