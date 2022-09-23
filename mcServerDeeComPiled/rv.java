import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class rv {
   static final Logger a = LogUtils.getLogger();
   private final rv.a<?> b;
   private final Object c;

   public <T> rv(rv.a<T> $$0, T $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public rv.a<?> a() {
      return this.b;
   }

   @Nullable
   public <T> T a(rv.a<T> $$0) {
      return this.b == $$0 ? $$0.b(this.c) : null;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         rv $$1 = (rv)$$0;
         return this.b == $$1.b && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   public String toString() {
      return "HoverEvent{action=" + this.b + ", value='" + this.c + "'}";
   }

   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + (this.c != null ? this.c.hashCode() : 0);
   }

   @Nullable
   public static rv a(JsonObject $$0) {
      String $$1 = alz.a($$0, "action", null);
      if ($$1 == null) {
         return null;
      } else {
         rv.a<?> $$2 = rv.a.a($$1);
         if ($$2 == null) {
            return null;
         } else {
            JsonElement $$3 = $$0.get("contents");
            if ($$3 != null) {
               return $$2.a($$3);
            } else {
               rq $$4 = rq.a.a($$0.get("value"));
               return $$4 != null ? $$2.a($$4) : null;
            }
         }
      }
   }

   public JsonObject b() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("action", this.b.b());
      $$0.add("contents", this.b.a(this.c));
      return $$0;
   }

   public static class a<T> {
      public static final rv.a<rq> a = new rv.a<>("show_text", true, rq.a::a, rq.a::c, Function.identity());
      public static final rv.a<rv.c> b = new rv.a<>("show_item", true, rv.c::a, rv.c::b, rv.c::a);
      public static final rv.a<rv.b> c = new rv.a<>("show_entity", true, rv.b::a, rv.b::a, rv.b::a);
      private static final Map<String, rv.a<?>> d = (Map<String, rv.a<?>>)Stream.of(a, b, c).collect(ImmutableMap.toImmutableMap(rv.a::b, $$0 -> $$0));
      private final String e;
      private final boolean f;
      private final Function<JsonElement, T> g;
      private final Function<T, JsonElement> h;
      private final Function<rq, T> i;

      public a(String $$0, boolean $$1, Function<JsonElement, T> $$2, Function<T, JsonElement> $$3, Function<rq, T> $$4) {
         this.e = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
         this.i = $$4;
      }

      public boolean a() {
         return this.f;
      }

      public String b() {
         return this.e;
      }

      @Nullable
      public static rv.a<?> a(String $$0) {
         return (rv.a<?>)d.get($$0);
      }

      T b(Object $$0) {
         return (T)$$0;
      }

      @Nullable
      public rv a(JsonElement $$0) {
         T $$1 = (T)this.g.apply($$0);
         return $$1 == null ? null : new rv(this, $$1);
      }

      @Nullable
      public rv a(rq $$0) {
         T $$1 = (T)this.i.apply($$0);
         return $$1 == null ? null : new rv(this, $$1);
      }

      public JsonElement a(Object $$0) {
         return (JsonElement)this.h.apply(this.b($$0));
      }

      public String toString() {
         return "<action " + this.e + ">";
      }
   }

   public static class b {
      public final bbr<?> a;
      public final UUID b;
      @Nullable
      public final rq c;
      @Nullable
      private List<rq> d;

      public b(bbr<?> $$0, UUID $$1, @Nullable rq $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Nullable
      public static rv.b a(JsonElement $$0) {
         if (!$$0.isJsonObject()) {
            return null;
         } else {
            JsonObject $$1 = $$0.getAsJsonObject();
            bbr<?> $$2 = hm.X.a(new abb(alz.h($$1, "type")));
            UUID $$3 = UUID.fromString(alz.h($$1, "id"));
            rq $$4 = rq.a.a($$1.get("name"));
            return new rv.b($$2, $$3, $$4);
         }
      }

      @Nullable
      public static rv.b a(rq $$0) {
         try {
            pj $$1 = qd.a($$0.getString());
            rq $$2 = rq.a.a($$1.l("name"));
            bbr<?> $$3 = hm.X.a(new abb($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return new rv.b($$3, $$4, $$2);
         } catch (Exception var5) {
            return null;
         }
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("type", hm.X.b(this.a).toString());
         $$0.addProperty("id", this.b.toString());
         if (this.c != null) {
            $$0.add("name", rq.a.c(this.c));
         }

         return $$0;
      }

      public List<rq> b() {
         if (this.d == null) {
            this.d = Lists.newArrayList();
            if (this.c != null) {
               this.d.add(this.c);
            }

            this.d.add(rq.a("gui.entity_tooltip.type", this.a.h()));
            this.d.add(rq.b(this.b.toString()));
         }

         return this.d;
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            rv.b $$1 = (rv.b)$$0;
            return this.a.equals($$1.a) && this.b.equals($$1.b) && Objects.equals(this.c, $$1.c);
         } else {
            return false;
         }
      }

      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + (this.c != null ? this.c.hashCode() : 0);
      }
   }

   public static class c {
      private final cat a;
      private final int b;
      @Nullable
      private final pj c;
      @Nullable
      private cax d;

      c(cat $$0, int $$1, @Nullable pj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public c(cax $$0) {
         this($$0.c(), $$0.K(), $$0.u() != null ? $$0.u().g() : null);
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            rv.c $$1 = (rv.c)$$0;
            return this.b == $$1.b && this.a.equals($$1.a) && Objects.equals(this.c, $$1.c);
         } else {
            return false;
         }
      }

      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b;
         return 31 * $$0 + (this.c != null ? this.c.hashCode() : 0);
      }

      public cax a() {
         if (this.d == null) {
            this.d = new cax(this.a, this.b);
            if (this.c != null) {
               this.d.c(this.c);
            }
         }

         return this.d;
      }

      private static rv.c a(JsonElement $$0) {
         if ($$0.isJsonPrimitive()) {
            return new rv.c(hm.Y.a(new abb($$0.getAsString())), 1, null);
         } else {
            JsonObject $$1 = alz.m($$0, "item");
            cat $$2 = hm.Y.a(new abb(alz.h($$1, "id")));
            int $$3 = alz.a($$1, "count", 1);
            if ($$1.has("tag")) {
               String $$4 = alz.h($$1, "tag");

               try {
                  pj $$5 = qd.a($$4);
                  return new rv.c($$2, $$3, $$5);
               } catch (CommandSyntaxException var6) {
                  rv.a.warn("Failed to parse tag: {}", $$4, var6);
               }
            }

            return new rv.c($$2, $$3, null);
         }
      }

      @Nullable
      private static rv.c a(rq $$0) {
         try {
            pj $$1 = qd.a($$0.getString());
            return new rv.c(cax.a($$1));
         } catch (CommandSyntaxException var2) {
            rv.a.warn("Failed to parse item tag: {}", $$0, var2);
            return null;
         }
      }

      private JsonElement b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("id", hm.Y.b(this.a).toString());
         if (this.b != 1) {
            $$0.addProperty("count", this.b);
         }

         if (this.c != null) {
            $$0.addProperty("tag", this.c.toString());
         }

         return $$0;
      }
   }
}
