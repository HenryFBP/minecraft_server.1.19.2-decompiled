import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class dth extends dtn {
   private static final Logger a = LogUtils.getLogger();
   final List<cer> b;

   dth(dux[] $$0, Collection<cer> $$1) {
      super($$0);
      this.b = ImmutableList.copyOf($$1);
   }

   @Override
   public dtp a() {
      return dtq.d;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      amn $$2 = $$1.a();
      cer $$5;
      if (this.b.isEmpty()) {
         boolean $$3 = $$0.a(caz.oY);
         List<cer> $$4 = (List)hm.W.r().filter(cer::i).filter($$2x -> $$3 || $$2x.a($$0)).collect(Collectors.toList());
         if ($$4.isEmpty()) {
            a.warn("Couldn't find a compatible enchantment for {}", $$0);
            return $$0;
         }

         $$5 = (cer)$$4.get($$2.a($$4.size()));
      } else {
         $$5 = (cer)this.b.get($$2.a(this.b.size()));
      }

      return a($$0, $$5, $$2);
   }

   private static cax a(cax $$0, cer $$1, amn $$2) {
      int $$3 = ami.a($$2, $$1.e(), $$1.a());
      if ($$0.a(caz.oY)) {
         $$0 = new cax(caz.ss);
         bzy.a($$0, new ceu($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static dth.a c() {
      return new dth.a();
   }

   public static dtn.a<?> d() {
      return a($$0 -> new dth($$0, ImmutableList.of()));
   }

   public static class a extends dtn.a<dth.a> {
      private final Set<cer> a = Sets.newHashSet();

      protected dth.a a() {
         return this;
      }

      public dth.a a(cer $$0) {
         this.a.add($$0);
         return this;
      }

      @Override
      public dto b() {
         return new dth(this.g(), this.a);
      }
   }

   public static class b extends dtn.c<dth> {
      public void a(JsonObject $$0, dth $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.b.isEmpty()) {
            JsonArray $$3 = new JsonArray();

            for(cer $$4 : $$1.b) {
               abb $$5 = hm.W.b($$4);
               if ($$5 == null) {
                  throw new IllegalArgumentException("Don't know how to serialize enchantment " + $$4);
               }

               $$3.add(new JsonPrimitive($$5.toString()));
            }

            $$0.add("enchantments", $$3);
         }

      }

      public dth a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         List<cer> $$3 = Lists.newArrayList();
         if ($$0.has("enchantments")) {
            for(JsonElement $$5 : alz.u($$0, "enchantments")) {
               String $$6 = alz.a($$5, "enchantment");
               cer $$7 = (cer)hm.W.b(new abb($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$6 + "'"));
               $$3.add($$7);
            }
         }

         return new dth($$2, $$3);
      }
   }
}
