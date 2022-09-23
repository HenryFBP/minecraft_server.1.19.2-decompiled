import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.List;

public class dtu extends dtn {
   final List<dsv> a;
   final ctk<?> b;

   dtu(dux[] $$0, ctk<?> $$1, List<dsv> $$2) {
      super($$0);
      this.b = $$1;
      this.a = ImmutableList.copyOf($$2);
   }

   @Override
   public dtp a() {
      return dtq.o;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         hi<cax> $$2 = hi.a();
         this.a.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(dsg.a($$2::add), $$1)));
         pj $$3 = new pj();
         bad.a($$3, $$2);
         pj $$4 = byx.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         byx.a($$0, this.b, $$4);
         return $$0;
      }
   }

   @Override
   public void a(dsl $$0) {
      super.a($$0);

      for(int $$1 = 0; $$1 < this.a.size(); ++$$1) {
         ((dsv)this.a.get($$1)).a($$0.b(".entry[" + $$1 + "]"));
      }

   }

   public static dtu.a a(ctk<?> $$0) {
      return new dtu.a($$0);
   }

   public static class a extends dtn.a<dtu.a> {
      private final List<dsv> a = Lists.newArrayList();
      private final ctk<?> b;

      public a(ctk<?> $$0) {
         this.b = $$0;
      }

      protected dtu.a a() {
         return this;
      }

      public dtu.a a(dsv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public dto b() {
         return new dtu(this.g(), this.b, this.a);
      }
   }

   public static class b extends dtn.c<dtu> {
      public void a(JsonObject $$0, dtu $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("type", hm.ab.b($$1.b).toString());
         $$0.add("entries", $$2.serialize($$1.a));
      }

      public dtu a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         dsv[] $$3 = alz.a($$0, "entries", $$1, dsv[].class);
         abb $$4 = new abb(alz.h($$0, "type"));
         ctk<?> $$5 = (ctk)hm.ab.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown block entity type id '" + $$4 + "'"));
         return new dtu($$2, $$5, Arrays.asList($$3));
      }
   }
}
