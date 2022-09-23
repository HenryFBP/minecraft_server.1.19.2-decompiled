import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class dua extends dtn {
   final boolean a;
   final List<rq> b;
   @Nullable
   final dsd.c c;

   public dua(dux[] $$0, boolean $$1, List<rq> $$2, @Nullable dsd.c $$3) {
      super($$0);
      this.a = $$1;
      this.b = ImmutableList.copyOf($$2);
      this.c = $$3;
   }

   @Override
   public dtp a() {
      return dtq.t;
   }

   @Override
   public Set<dui<?>> b() {
      return this.c != null ? ImmutableSet.of(this.c.a()) : ImmutableSet.of();
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      pp $$2 = this.a($$0, !this.b.isEmpty());
      if ($$2 != null) {
         if (this.a) {
            $$2.clear();
         }

         UnaryOperator<rq> $$3 = dub.a($$1, this.c);
         this.b.stream().map($$3).map(rq.a::a).map(qa::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private pp a(cax $$0, boolean $$1) {
      pj $$2;
      if ($$0.t()) {
         $$2 = $$0.u();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new pj();
         $$0.c($$2);
      }

      pj $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new pj();
         $$2.a("display", (qc)$$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         pp $$8 = new pp();
         $$5.a("Lore", (qc)$$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static dua.a c() {
      return new dua.a();
   }

   public static class a extends dtn.a<dua.a> {
      private boolean a;
      private dsd.c b;
      private final List<rq> c = Lists.newArrayList();

      public dua.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dua.a a(dsd.c $$0) {
         this.b = $$0;
         return this;
      }

      public dua.a a(rq $$0) {
         this.c.add($$0);
         return this;
      }

      protected dua.a a() {
         return this;
      }

      @Override
      public dto b() {
         return new dua(this.g(), this.a, this.c, this.b);
      }
   }

   public static class b extends dtn.c<dua> {
      public void a(JsonObject $$0, dua $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("replace", $$1.a);
         JsonArray $$3 = new JsonArray();

         for(rq $$4 : $$1.b) {
            $$3.add(rq.a.c($$4));
         }

         $$0.add("lore", $$3);
         if ($$1.c != null) {
            $$0.add("entity", $$2.serialize($$1.c));
         }

      }

      public dua a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         boolean $$3 = alz.a($$0, "replace", false);
         List<rq> $$4 = (List)Streams.stream(alz.u($$0, "lore")).map(rq.a::a).collect(ImmutableList.toImmutableList());
         dsd.c $$5 = alz.a($$0, "entity", null, $$1, dsd.c.class);
         return new dua($$2, $$3, $$4, $$5);
      }
   }
}
