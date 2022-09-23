import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class kc implements jz {
   private final cjt a;
   private final List<kf> b;
   private final Set<cwr<?>> c = Sets.newHashSet();
   private final List<kd> d = Lists.newArrayList();

   private kc(cjt $$0, List<kf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public kc a(kd $$0) {
      $$0.b().forEach($$0x -> {
         if (this.a.k().a($$0x.f()) != $$0x) {
            throw new IllegalStateException("Property " + $$0x + " is not defined for block " + this.a);
         } else if (!this.c.add($$0x)) {
            throw new IllegalStateException("Values of property " + $$0x + " already defined for block " + this.a);
         }
      });
      this.d.add($$0);
      return this;
   }

   public JsonElement b() {
      Stream<Pair<ke, List<kf>>> $$0 = Stream.of(Pair.of(ke.a(), this.b));

      for(kd $$1 : this.d) {
         Map<ke, List<kf>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1 -> $$2.entrySet().stream().map($$1x -> {
               ke $$2x = ((ke)$$1.getFirst()).a((ke)$$1x.getKey());
               List<kf> $$3 = a((List<kf>)$$1.getSecond(), (List<kf>)$$1x.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap();
      $$0.forEach($$1 -> $$3.put(((ke)$$1.getFirst()).b(), kf.a((List<kf>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ad.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<kf> a(List<kf> $$0, List<kf> $$1) {
      Builder<kf> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(kf.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public cjt a() {
      return this.a;
   }

   public static kc a(cjt $$0) {
      return new kc($$0, ImmutableList.of(kf.a()));
   }

   public static kc a(cjt $$0, kf $$1) {
      return new kc($$0, ImmutableList.of($$1));
   }

   public static kc a(cjt $$0, kf... $$1) {
      return new kc($$0, ImmutableList.copyOf($$1));
   }
}
