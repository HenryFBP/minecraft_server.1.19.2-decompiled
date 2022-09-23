import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;

public record dv(List<dv.a> b) {
   public static final dv a = new dv(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public dv(qx $$0) {
      this($$0.a(qx.a(ArrayList::new, 8), dv.a::new));
   }

   public rz a(String $$0) {
      for(dv.a $$1 : this.b) {
         if ($$1.a.equals($$0)) {
            return $$1.b;
         }
      }

      return rz.a;
   }

   public void a(qx $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static boolean a(se<?> $$0) {
      return $$0.a().stream().anyMatch($$0x -> $$0x.d() instanceof eu);
   }

   public static dv a(se<?> $$0, dv.b $$1) {
      List<dv.a> $$2 = b($$0).stream().map($$1x -> {
         rz $$2x = $$1.sign((String)$$1x.getFirst(), (String)$$1x.getSecond());
         return new dv.a((String)$$1x.getFirst(), $$2x);
      }).toList();
      return new dv($$2);
   }

   public static List<Pair<String, String>> b(se<?> $$0) {
      List<Pair<String, String>> $$1 = new ArrayList();

      for(se.a<?> $$2 : $$0.a()) {
         en $$4 = $$2.d();
         if ($$4 instanceof eu $$3) {
            String $$4 = a($$3, $$2.c());
            $$1.add(Pair.of($$2.a(), $$4));
         }
      }

      return $$1;
   }

   private static <T> String a(eu<T> $$0, ParsedArgument<?, ?> $$1) {
      return $$0.a((T)$$1.getResult());
   }

   public List<dv.a> a() {
      return this.b;
   }

   public static record a(String a, rz b) {
      final String a;
      final rz b;

      public a(qx $$0) {
         this($$0.e(16), new rz($$0));
      }

      public void a(qx $$0) {
         $$0.a(this.a, 16);
         this.b.a($$0);
      }
   }

   @FunctionalInterface
   public interface b {
      rz sign(String var1, String var2);
   }
}
