import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class kw implements ku {
   private final cat b;
   private final int c;
   private final List<String> d = Lists.newArrayList();
   private final Map<Character, cdm> e = Maps.newLinkedHashMap();
   private final af.a f = af.a.a();
   @Nullable
   private String g;

   public kw(cgw $$0, int $$1) {
      this.b = $$0.l();
      this.c = $$1;
   }

   public static kw b(cgw $$0) {
      return a($$0, 1);
   }

   public static kw a(cgw $$0, int $$1) {
      return new kw($$0, $$1);
   }

   public kw a(Character $$0, akz<cat> $$1) {
      return this.a($$0, cdm.a($$1));
   }

   public kw a(Character $$0, cgw $$1) {
      return this.a($$0, cdm.a($$1));
   }

   public kw a(Character $$0, cdm $$1) {
      if (this.e.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.e.put($$0, $$1);
         return this;
      }
   }

   public kw b(String $$0) {
      if (!this.d.isEmpty() && $$0.length() != ((String)this.d.get(0)).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.d.add($$0);
         return this;
      }
   }

   public kw b(String $$0, an $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public kw c(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public cat a() {
      return this.b;
   }

   @Override
   public void a(Consumer<kt> $$0, abb $$1) {
      this.a($$1);
      this.f.a(a).a("has_the_recipe", cs.a($$1)).a(ai.a.c($$1)).a(aq.b);
      $$0.accept(
         new kw.a($$1, this.b, this.c, this.g == null ? "" : this.g, this.d, this.e, this.f, new abb($$1.b(), "recipes/" + this.b.u().b() + "/" + $$1.a()))
      );
   }

   private void a(abb $$0) {
      if (this.d.isEmpty()) {
         throw new IllegalStateException("No pattern is defined for shaped recipe " + $$0 + "!");
      } else {
         Set<Character> $$1 = Sets.newHashSet(this.e.keySet());
         $$1.remove(' ');

         for(String $$2 : this.d) {
            for(int $$3 = 0; $$3 < $$2.length(); ++$$3) {
               char $$4 = $$2.charAt($$3);
               if (!this.e.containsKey($$4) && $$4 != ' ') {
                  throw new IllegalStateException("Pattern in recipe " + $$0 + " uses undefined symbol '" + $$4 + "'");
               }

               $$1.remove($$4);
            }
         }

         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + $$0);
         } else if (this.d.size() == 1 && ((String)this.d.get(0)).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + $$0 + " only takes in a single item - should it be a shapeless recipe instead?");
         } else if (this.f.c().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + $$0);
         }
      }
   }

   static class a implements kt {
      private final abb a;
      private final cat b;
      private final int c;
      private final String d;
      private final List<String> e;
      private final Map<Character, cdm> f;
      private final af.a g;
      private final abb h;

      public a(abb $$0, cat $$1, int $$2, String $$3, List<String> $$4, Map<Character, cdm> $$5, af.a $$6, abb $$7) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = $$7;
      }

      @Override
      public void a(JsonObject $$0) {
         if (!this.d.isEmpty()) {
            $$0.addProperty("group", this.d);
         }

         JsonArray $$1 = new JsonArray();

         for(String $$2 : this.e) {
            $$1.add($$2);
         }

         $$0.add("pattern", $$1);
         JsonObject $$3 = new JsonObject();

         for(Entry<Character, cdm> $$4 : this.f.entrySet()) {
            $$3.add(String.valueOf($$4.getKey()), ((cdm)$$4.getValue()).c());
         }

         $$0.add("key", $$3);
         JsonObject $$5 = new JsonObject();
         $$5.addProperty("item", hm.Y.b(this.b).toString());
         if (this.c > 1) {
            $$5.addProperty("count", this.c);
         }

         $$0.add("result", $$5);
      }

      @Override
      public cdr<?> c() {
         return cdr.a;
      }

      @Override
      public abb b() {
         return this.a;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.g.b();
      }

      @Nullable
      @Override
      public abb e() {
         return this.h;
      }
   }
}
