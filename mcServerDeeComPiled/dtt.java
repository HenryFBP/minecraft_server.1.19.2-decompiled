import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class dtt extends dtn {
   final List<Pair<hc<csz>, bzq>> a;
   final boolean b;

   dtt(dux[] $$0, List<Pair<hc<csz>, bzq>> $$1, boolean $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   protected cax a(cax $$0, dsd $$1) {
      pj $$2 = byx.a($$0);
      if ($$2 == null) {
         $$2 = new pj();
      }

      csz.a $$3 = new csz.a();
      this.a.forEach($$3::a);
      pp $$4 = $$3.a();
      pp $$5;
      if (this.b) {
         $$5 = $$2.c("Patterns", 10).d();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", (qc)$$5);
      byx.a($$0, ctk.s, $$2);
      return $$0;
   }

   @Override
   public dtp a() {
      return dtq.x;
   }

   public static dtt.a a(boolean $$0) {
      return new dtt.a($$0);
   }

   public static class a extends dtn.a<dtt.a> {
      private final Builder<Pair<hc<csz>, bzq>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected dtt.a a() {
         return this;
      }

      @Override
      public dto b() {
         return new dtt(this.g(), this.a.build(), this.b);
      }

      public dtt.a a(aba<csz> $$0, bzq $$1) {
         return this.a(hm.bO.h($$0), $$1);
      }

      public dtt.a a(hc<csz> $$0, bzq $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }

   public static class b extends dtn.c<dtt> {
      public void a(JsonObject $$0, dtt $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonArray $$3 = new JsonArray();
         $$1.a
            .forEach(
               $$1x -> {
                  JsonObject $$2x = new JsonObject();
                  $$2x.addProperty(
                     "pattern",
                     ((aba)((hc)$$1x.getFirst()).e().orElseThrow(() -> new JsonSyntaxException("Unknown pattern: " + $$1x.getFirst()))).a().toString()
                  );
                  $$2x.addProperty("color", ((bzq)$$1x.getSecond()).b());
                  $$3.add($$2x);
               }
            );
         $$0.add("patterns", $$3);
         $$0.addProperty("append", $$1.b);
      }

      public dtt a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         Builder<Pair<hc<csz>, bzq>> $$3 = ImmutableList.builder();
         JsonArray $$4 = alz.u($$0, "patterns");

         for(int $$5 = 0; $$5 < $$4.size(); ++$$5) {
            JsonObject $$6 = alz.m($$4.get($$5), "pattern[" + $$5 + "]");
            String $$7 = alz.h($$6, "pattern");
            Optional<hc<csz>> $$8 = hm.bO.b(aba.a(hm.bN, new abb($$7)));
            if ($$8.isEmpty()) {
               throw new JsonSyntaxException("Unknown pattern: " + $$7);
            }

            String $$9 = alz.h($$6, "color");
            bzq $$10 = bzq.a($$9, null);
            if ($$10 == null) {
               throw new JsonSyntaxException("Unknown color: " + $$9);
            }

            $$3.add(Pair.of((hc)$$8.get(), $$10));
         }

         boolean $$11 = alz.j($$0, "append");
         return new dtt($$2, $$3.build(), $$11);
      }
   }
}
