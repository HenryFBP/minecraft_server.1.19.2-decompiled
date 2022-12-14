import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class af {
   @Nullable
   private final af a;
   @Nullable
   private final ao b;
   private final ai c;
   private final abb d;
   private final Map<String, ak> e;
   private final String[][] f;
   private final Set<af> g = Sets.newLinkedHashSet();
   private final rq h;

   public af(abb $$0, @Nullable af $$1, @Nullable ao $$2, ai $$3, Map<String, ak> $$4, String[][] $$5) {
      this.d = $$0;
      this.b = $$2;
      this.e = ImmutableMap.copyOf($$4);
      this.a = $$1;
      this.c = $$3;
      this.f = $$5;
      if ($$1 != null) {
         $$1.a(this);
      }

      if ($$2 == null) {
         this.h = rq.b($$0.toString());
      } else {
         rq $$6 = $$2.a();
         p $$7 = $$2.e().c();
         rq $$8 = rs.a($$6.e(), sj.a.a($$7)).f("\n").b($$2.b());
         rq $$9 = $$6.e().a($$1x -> $$1x.a(new rv(rv.a.a, $$8)));
         this.h = rs.a($$9).a($$7);
      }

   }

   public af.a a() {
      return new af.a(this.a == null ? null : this.a.h(), this.b, this.c, this.e, this.f);
   }

   @Nullable
   public af b() {
      return this.a;
   }

   @Nullable
   public ao c() {
      return this.b;
   }

   public ai d() {
      return this.c;
   }

   public String toString() {
      return "SimpleAdvancement{id="
         + this.h()
         + ", parent="
         + (this.a == null ? "null" : this.a.h())
         + ", display="
         + this.b
         + ", rewards="
         + this.c
         + ", criteria="
         + this.e
         + ", requirements="
         + Arrays.deepToString(this.f)
         + "}";
   }

   public Iterable<af> e() {
      return this.g;
   }

   public Map<String, ak> f() {
      return this.e;
   }

   public int g() {
      return this.f.length;
   }

   public void a(af $$0) {
      this.g.add($$0);
   }

   public abb h() {
      return this.d;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof af)) {
         return false;
      } else {
         af $$1 = (af)$$0;
         return this.d.equals($$1.d);
      }
   }

   public int hashCode() {
      return this.d.hashCode();
   }

   public String[][] i() {
      return this.f;
   }

   public rq j() {
      return this.h;
   }

   public static class a {
      @Nullable
      private abb a;
      @Nullable
      private af b;
      @Nullable
      private ao c;
      private ai d = ai.a;
      private Map<String, ak> e = Maps.newLinkedHashMap();
      @Nullable
      private String[][] f;
      private aq g = aq.a;

      a(@Nullable abb $$0, @Nullable ao $$1, ai $$2, Map<String, ak> $$3, String[][] $$4) {
         this.a = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
      }

      private a() {
      }

      public static af.a a() {
         return new af.a();
      }

      public af.a a(af $$0) {
         this.b = $$0;
         return this;
      }

      public af.a a(abb $$0) {
         this.a = $$0;
         return this;
      }

      public af.a a(cax $$0, rq $$1, rq $$2, @Nullable abb $$3, ap $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new ao($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      }

      public af.a a(cgw $$0, rq $$1, rq $$2, @Nullable abb $$3, ap $$4, boolean $$5, boolean $$6, boolean $$7) {
         return this.a(new ao(new cax($$0.l()), $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      }

      public af.a a(ao $$0) {
         this.c = $$0;
         return this;
      }

      public af.a a(ai.a $$0) {
         return this.a($$0.a());
      }

      public af.a a(ai $$0) {
         this.d = $$0;
         return this;
      }

      public af.a a(String $$0, an $$1) {
         return this.a($$0, new ak($$1));
      }

      public af.a a(String $$0, ak $$1) {
         if (this.e.containsKey($$0)) {
            throw new IllegalArgumentException("Duplicate criterion " + $$0);
         } else {
            this.e.put($$0, $$1);
            return this;
         }
      }

      public af.a a(aq $$0) {
         this.g = $$0;
         return this;
      }

      public af.a a(String[][] $$0) {
         this.f = $$0;
         return this;
      }

      public boolean a(Function<abb, af> $$0) {
         if (this.a == null) {
            return true;
         } else {
            if (this.b == null) {
               this.b = (af)$$0.apply(this.a);
            }

            return this.b != null;
         }
      }

      public af b(abb $$0) {
         if (!this.a((Function<abb, af>)($$0x -> null))) {
            throw new IllegalStateException("Tried to build incomplete advancement!");
         } else {
            if (this.f == null) {
               this.f = this.g.createRequirements(this.e.keySet());
            }

            return new af($$0, this.b, this.c, this.d, this.e, this.f);
         }
      }

      public af a(Consumer<af> $$0, String $$1) {
         af $$2 = this.b(new abb($$1));
         $$0.accept($$2);
         return $$2;
      }

      public JsonObject b() {
         if (this.f == null) {
            this.f = this.g.createRequirements(this.e.keySet());
         }

         JsonObject $$0 = new JsonObject();
         if (this.b != null) {
            $$0.addProperty("parent", this.b.h().toString());
         } else if (this.a != null) {
            $$0.addProperty("parent", this.a.toString());
         }

         if (this.c != null) {
            $$0.add("display", this.c.k());
         }

         $$0.add("rewards", this.d.b());
         JsonObject $$1 = new JsonObject();

         for(Entry<String, ak> $$2 : this.e.entrySet()) {
            $$1.add((String)$$2.getKey(), ((ak)$$2.getValue()).b());
         }

         $$0.add("criteria", $$1);
         JsonArray $$3 = new JsonArray();

         for(String[] $$4 : this.f) {
            JsonArray $$5 = new JsonArray();

            for(String $$6 : $$4) {
               $$5.add($$6);
            }

            $$3.add($$5);
         }

         $$0.add("requirements", $$3);
         return $$0;
      }

      public void a(qx $$0) {
         if (this.f == null) {
            this.f = this.g.createRequirements(this.e.keySet());
         }

         $$0.a(this.a, qx::a);
         $$0.a(this.c, ($$0x, $$1x) -> $$1x.a($$0x));
         ak.a(this.e, $$0);
         $$0.d(this.f.length);

         for(String[] $$1 : this.f) {
            $$0.d($$1.length);

            for(String $$2 : $$1) {
               $$0.a($$2);
            }
         }

      }

      public String toString() {
         return "Task Advancement{parentId="
            + this.a
            + ", display="
            + this.c
            + ", rewards="
            + this.d
            + ", criteria="
            + this.e
            + ", requirements="
            + Arrays.deepToString(this.f)
            + "}";
      }

      public static af.a a(JsonObject $$0, be $$1) {
         abb $$2 = $$0.has("parent") ? new abb(alz.h($$0, "parent")) : null;
         ao $$3 = $$0.has("display") ? ao.a(alz.t($$0, "display")) : null;
         ai $$4 = $$0.has("rewards") ? ai.a(alz.t($$0, "rewards")) : ai.a;
         Map<String, ak> $$5 = ak.b(alz.t($$0, "criteria"), $$1);
         if ($$5.isEmpty()) {
            throw new JsonSyntaxException("Advancement criteria cannot be empty");
         } else {
            JsonArray $$6 = alz.a($$0, "requirements", new JsonArray());
            String[][] $$7 = new String[$$6.size()][];

            for(int $$8 = 0; $$8 < $$6.size(); ++$$8) {
               JsonArray $$9 = alz.n($$6.get($$8), "requirements[" + $$8 + "]");
               $$7[$$8] = new String[$$9.size()];

               for(int $$10 = 0; $$10 < $$9.size(); ++$$10) {
                  $$7[$$8][$$10] = alz.a($$9.get($$10), "requirements[" + $$8 + "][" + $$10 + "]");
               }
            }

            if ($$7.length == 0) {
               $$7 = new String[$$5.size()][];
               int $$11 = 0;

               for(String $$12 : $$5.keySet()) {
                  $$7[$$11++] = new String[]{$$12};
               }
            }

            for(String[] $$13 : $$7) {
               if ($$13.length == 0 && $$5.isEmpty()) {
                  throw new JsonSyntaxException("Requirement entry cannot be empty");
               }

               for(String $$14 : $$13) {
                  if (!$$5.containsKey($$14)) {
                     throw new JsonSyntaxException("Unknown required criterion '" + $$14 + "'");
                  }
               }
            }

            for(String $$15 : $$5.keySet()) {
               boolean $$16 = false;

               for(String[] $$17 : $$7) {
                  if (ArrayUtils.contains($$17, $$15)) {
                     $$16 = true;
                     break;
                  }
               }

               if (!$$16) {
                  throw new JsonSyntaxException(
                     "Criterion '" + $$15 + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required."
                  );
               }
            }

            return new af.a($$2, $$3, $$4, $$5, $$7);
         }
      }

      public static af.a b(qx $$0) {
         abb $$1 = $$0.c(qx::r);
         ao $$2 = $$0.c(ao::b);
         Map<String, ak> $$3 = ak.c($$0);
         String[][] $$4 = new String[$$0.k()][];

         for(int $$5 = 0; $$5 < $$4.length; ++$$5) {
            $$4[$$5] = new String[$$0.k()];

            for(int $$6 = 0; $$6 < $$4[$$5].length; ++$$6) {
               $$4[$$5][$$6] = $$0.q();
            }
         }

         return new af.a($$1, $$2, ai.a, $$3, $$4);
      }

      public Map<String, ak> c() {
         return this.e;
      }
   }
}
