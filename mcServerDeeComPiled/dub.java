import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dub extends dtn {
   private static final Logger a = LogUtils.getLogger();
   final rq b;
   @Nullable
   final dsd.c c;

   dub(dux[] $$0, @Nullable rq $$1, @Nullable dsd.c $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public dtp a() {
      return dtq.k;
   }

   @Override
   public Set<dui<?>> b() {
      return this.c != null ? ImmutableSet.of(this.c.a()) : ImmutableSet.of();
   }

   public static UnaryOperator<rq> a(dsd $$0, @Nullable dsd.c $$1) {
      if ($$1 != null) {
         bbn $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            dr $$3 = $$2.cT().a(2);
            return $$2x -> {
               try {
                  return rs.a($$3, $$2x, $$2, 0);
               } catch (CommandSyntaxException var4) {
                  a.warn("Failed to resolve text component", var4);
                  return $$2x;
               }
            };
         }
      }

      return $$0x -> $$0x;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      if (this.b != null) {
         $$0.a((rq)a($$1, this.c).apply(this.b));
      }

      return $$0;
   }

   public static dtn.a<?> a(rq $$0) {
      return a($$1 -> new dub($$1, $$0, null));
   }

   public static dtn.a<?> a(rq $$0, dsd.c $$1) {
      return a($$2 -> new dub($$2, $$0, $$1));
   }

   public static class a extends dtn.c<dub> {
      public void a(JsonObject $$0, dub $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if ($$1.b != null) {
            $$0.add("name", rq.a.c($$1.b));
         }

         if ($$1.c != null) {
            $$0.add("entity", $$2.serialize($$1.c));
         }

      }

      public dub a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         rq $$3 = rq.a.a($$0.get("name"));
         dsd.c $$4 = alz.a($$0, "entity", null, $$1, dsd.c.class);
         return new dub($$2, $$3, $$4);
      }
   }
}
