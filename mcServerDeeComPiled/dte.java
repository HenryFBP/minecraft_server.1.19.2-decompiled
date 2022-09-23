import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dte extends dtn {
   final cjt a;
   final Set<cwr<?>> b;

   dte(dux[] $$0, cjt $$1, Set<cwr<?>> $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public dtp a() {
      return dtq.w;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.g);
   }

   @Override
   protected cax a(cax $$0, dsd $$1) {
      cvo $$2 = $$1.c(dul.g);
      if ($$2 != null) {
         pj $$3 = $$0.v();
         pj $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new pj();
            $$3.a("BlockStateTag", (qc)$$4);
         }

         this.b.stream().filter($$2::b).forEach($$2x -> $$4.a($$2x.f(), a($$2, $$2x)));
      }

      return $$0;
   }

   public static dte.a a(cjt $$0) {
      return new dte.a($$0);
   }

   private static <T extends Comparable<T>> String a(cvo $$0, cwr<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends dtn.a<dte.a> {
      private final cjt a;
      private final Set<cwr<?>> b = Sets.newHashSet();

      a(cjt $$0) {
         this.a = $$0;
      }

      public dte.a a(cwr<?> $$0) {
         if (!this.a.k().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected dte.a a() {
         return this;
      }

      @Override
      public dto b() {
         return new dte(this.g(), this.a, this.b);
      }
   }

   public static class b extends dtn.c<dte> {
      public void a(JsonObject $$0, dte $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("block", hm.V.b($$1.a).toString());
         JsonArray $$3 = new JsonArray();
         $$1.b.forEach($$1x -> $$3.add($$1x.f()));
         $$0.add("properties", $$3);
      }

      public dte a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         abb $$3 = new abb(alz.h($$0, "block"));
         cjt $$4 = (cjt)hm.V.b($$3).orElseThrow(() -> new IllegalArgumentException("Can't find block " + $$3));
         cvp<cjt, cvo> $$5 = $$4.k();
         Set<cwr<?>> $$6 = Sets.newHashSet();
         JsonArray $$7 = alz.a($$0, "properties", null);
         if ($$7 != null) {
            $$7.forEach($$2x -> $$6.add($$5.a(alz.a($$2x, "property"))));
         }

         return new dte($$2, $$4, $$6);
      }
   }
}
