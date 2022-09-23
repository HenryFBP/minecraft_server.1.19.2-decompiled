import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class duk {
   private static final BiMap<abb, duj> m = HashBiMap.create();
   public static final duj a = a("empty", $$0 -> {
   });
   public static final duj b = a("chest", $$0 -> $$0.a(dul.f).b(dul.a));
   public static final duj c = a("command", $$0 -> $$0.a(dul.f).b(dul.a));
   public static final duj d = a("selector", $$0 -> $$0.a(dul.f).a(dul.a));
   public static final duj e = a("fishing", $$0 -> $$0.a(dul.f).a(dul.i).b(dul.a));
   public static final duj f = a("entity", $$0 -> $$0.a(dul.a).a(dul.f).a(dul.c).b(dul.d).b(dul.e).b(dul.b));
   public static final duj g = a("gift", $$0 -> $$0.a(dul.f).a(dul.a));
   public static final duj h = a("barter", $$0 -> $$0.a(dul.a));
   public static final duj i = a("advancement_reward", $$0 -> $$0.a(dul.a).a(dul.f));
   public static final duj j = a("advancement_entity", $$0 -> $$0.a(dul.a).a(dul.f));
   public static final duj k = a("generic", $$0 -> $$0.a(dul.a).a(dul.b).a(dul.c).a(dul.d).a(dul.e).a(dul.f).a(dul.g).a(dul.h).a(dul.i).a(dul.j));
   public static final duj l = a("block", $$0 -> $$0.a(dul.g).a(dul.f).a(dul.i).b(dul.a).b(dul.h).b(dul.j));

   private static duj a(String $$0, Consumer<duj.a> $$1) {
      duj.a $$2 = new duj.a();
      $$1.accept($$2);
      duj $$3 = $$2.a();
      abb $$4 = new abb($$0);
      duj $$5 = (duj)m.put($$4, $$3);
      if ($$5 != null) {
         throw new IllegalStateException("Loot table parameter set " + $$4 + " is already registered");
      } else {
         return $$3;
      }
   }

   @Nullable
   public static duj a(abb $$0) {
      return (duj)m.get($$0);
   }

   @Nullable
   public static abb a(duj $$0) {
      return (abb)m.inverse().get($$0);
   }
}
