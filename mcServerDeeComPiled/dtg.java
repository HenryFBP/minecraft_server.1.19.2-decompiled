import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class dtg extends dtn {
   final dvl a;
   final List<dtg.b> b;

   dtg(dux[] $$0, dvl $$1, List<dtg.b> $$2) {
      super($$0);
      this.a = $$1;
      this.b = ImmutableList.copyOf($$2);
   }

   @Override
   public dtp a() {
      return dtq.v;
   }

   static eh.g a(String $$0) {
      try {
         return new eh().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         throw new IllegalArgumentException("Failed to parse path " + $$0, var2);
      }
   }

   @Override
   public Set<dui<?>> b() {
      return this.a.b();
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      qc $$2 = this.a.a($$1);
      if ($$2 != null) {
         this.b.forEach($$2x -> $$2x.a($$0::v, $$2));
      }

      return $$0;
   }

   public static dtg.a a(dvl $$0) {
      return new dtg.a($$0);
   }

   public static dtg.a a(dsd.c $$0) {
      return new dtg.a(dvj.a($$0));
   }

   public static class a extends dtn.a<dtg.a> {
      private final dvl a;
      private final List<dtg.b> b = Lists.newArrayList();

      a(dvl $$0) {
         this.a = $$0;
      }

      public dtg.a a(String $$0, String $$1, dtg.c $$2) {
         this.b.add(new dtg.b($$0, $$1, $$2));
         return this;
      }

      public dtg.a a(String $$0, String $$1) {
         return this.a($$0, $$1, dtg.c.a);
      }

      protected dtg.a a() {
         return this;
      }

      @Override
      public dto b() {
         return new dtg(this.g(), this.a, this.b);
      }
   }

   static class b {
      private final String a;
      private final eh.g b;
      private final String c;
      private final eh.g d;
      private final dtg.c e;

      b(String $$0, String $$1, dtg.c $$2) {
         this.a = $$0;
         this.b = dtg.a($$0);
         this.c = $$1;
         this.d = dtg.a($$1);
         this.e = $$2;
      }

      public void a(Supplier<qc> $$0, qc $$1) {
         try {
            List<qc> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.e.a((qc)$$0.get(), this.d, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }

      }

      public JsonObject a() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("source", this.a);
         $$0.addProperty("target", this.c);
         $$0.addProperty("op", this.e.d);
         return $$0;
      }

      public static dtg.b a(JsonObject $$0) {
         String $$1 = alz.h($$0, "source");
         String $$2 = alz.h($$0, "target");
         dtg.c $$3 = dtg.c.a(alz.h($$0, "op"));
         return new dtg.b($$1, $$2, $$3);
      }
   }

   public static enum c {
      a("replace") {
         @Override
         public void a(qc $$0, eh.g $$1, List<qc> $$2) throws CommandSyntaxException {
            $$1.b($$0, ((qc)Iterables.getLast($$2))::c);
         }
      },
      b("append") {
         @Override
         public void a(qc $$0, eh.g $$1, List<qc> $$2) throws CommandSyntaxException {
            List<qc> $$3 = $$1.a($$0, pp::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof pp) {
                  $$2.forEach($$1xx -> ((pp)$$1x).add($$1xx.c()));
               }

            });
         }
      },
      c("merge") {
         @Override
         public void a(qc $$0, eh.g $$1, List<qc> $$2) throws CommandSyntaxException {
            List<qc> $$3 = $$1.a($$0, pj::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof pj) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof pj) {
                        ((pj)$$1x).a((pj)$$1xx);
                     }

                  });
               }

            });
         }
      };

      final String d;

      public abstract void a(qc var1, eh.g var2, List<qc> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.d = $$0;
      }

      public static dtg.c a(String $$0) {
         for(dtg.c $$1 : values()) {
            if ($$1.d.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid merge strategy" + $$0);
      }
   }

   public static class d extends dtn.c<dtg> {
      public void a(JsonObject $$0, dtg $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("source", $$2.serialize($$1.a));
         JsonArray $$3 = new JsonArray();
         $$1.b.stream().map(dtg.b::a).forEach($$3::add);
         $$0.add("ops", $$3);
      }

      public dtg a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         dvl $$3 = alz.a($$0, "source", $$1, dvl.class);
         List<dtg.b> $$4 = Lists.newArrayList();

         for(JsonElement $$6 : alz.u($$0, "ops")) {
            JsonObject $$7 = alz.m($$6, "op");
            $$4.add(dtg.b.a($$7));
         }

         return new dtg($$2, $$3, $$4);
      }
   }
}
