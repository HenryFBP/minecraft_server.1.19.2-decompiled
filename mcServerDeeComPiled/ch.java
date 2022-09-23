import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ch {
   private static final Logger b = LogUtils.getLogger();
   public static final ch a = new ch(cj.c.e, cj.c.e, cj.c.e, null, null, null, null, ce.a, au.a, bv.a);
   private final cj.c c;
   private final cj.c d;
   private final cj.c e;
   @Nullable
   private final aba<cht> f;
   @Nullable
   private final aba<dlb> g;
   @Nullable
   private final aba<cgx> h;
   @Nullable
   private final Boolean i;
   private final ce j;
   private final au k;
   private final bv l;

   public ch(
      cj.c $$0, cj.c $$1, cj.c $$2, @Nullable aba<cht> $$3, @Nullable aba<dlb> $$4, @Nullable aba<cgx> $$5, @Nullable Boolean $$6, ce $$7, au $$8, bv $$9
   ) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
      this.k = $$8;
      this.l = $$9;
   }

   public static ch a(aba<cht> $$0) {
      return new ch(cj.c.e, cj.c.e, cj.c.e, $$0, null, null, null, ce.a, au.a, bv.a);
   }

   public static ch b(aba<cgx> $$0) {
      return new ch(cj.c.e, cj.c.e, cj.c.e, null, null, $$0, null, ce.a, au.a, bv.a);
   }

   public static ch c(aba<dlb> $$0) {
      return new ch(cj.c.e, cj.c.e, cj.c.e, null, $$0, null, null, ce.a, au.a, bv.a);
   }

   public static ch a(cj.c $$0) {
      return new ch(cj.c.e, $$0, cj.c.e, null, null, null, null, ce.a, au.a, bv.a);
   }

   public boolean a(agg $$0, double $$1, double $$2, double $$3) {
      if (!this.c.d($$1)) {
         return false;
      } else if (!this.d.d($$2)) {
         return false;
      } else if (!this.e.d($$3)) {
         return false;
      } else if (this.h != null && this.h != $$0.ab()) {
         return false;
      } else {
         gt $$4 = new gt($$1, $$2, $$3);
         boolean $$5 = $$0.o($$4);
         if (this.f == null || $$5 && $$0.w($$4).a(this.f)) {
            if (this.g == null || $$5 && $$0.a().a($$4, this.g).b()) {
               if (this.i == null || $$5 && this.i == cke.a($$0, $$4)) {
                  if (!this.j.a($$0, $$4)) {
                     return false;
                  } else if (!this.k.a($$0, $$4)) {
                     return false;
                  } else {
                     return this.l.a($$0, $$4);
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (!this.c.c() || !this.d.c() || !this.e.c()) {
            JsonObject $$1 = new JsonObject();
            $$1.add("x", this.c.d());
            $$1.add("y", this.d.d());
            $$1.add("z", this.e.d());
            $$0.add("position", $$1);
         }

         if (this.h != null) {
            cgx.d.encodeStart(JsonOps.INSTANCE, this.h).resultOrPartial(b::error).ifPresent($$1x -> $$0.add("dimension", $$1x));
         }

         if (this.g != null) {
            $$0.addProperty("structure", this.g.a().toString());
         }

         if (this.f != null) {
            $$0.addProperty("biome", this.f.a().toString());
         }

         if (this.i != null) {
            $$0.addProperty("smokey", this.i);
         }

         $$0.add("light", this.j.a());
         $$0.add("block", this.k.a());
         $$0.add("fluid", this.l.a());
         return $$0;
      }
   }

   public static ch a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = alz.m($$0, "location");
         JsonObject $$2 = alz.a($$1, "position", new JsonObject());
         cj.c $$3 = cj.c.a($$2.get("x"));
         cj.c $$4 = cj.c.a($$2.get("y"));
         cj.c $$5 = cj.c.a($$2.get("z"));
         aba<cgx> $$6 = $$1.has("dimension")
            ? (aba)abb.a.parse(JsonOps.INSTANCE, $$1.get("dimension")).resultOrPartial(b::error).map($$0x -> aba.a(hm.P, $$0x)).orElse(null)
            : null;
         aba<dlb> $$7 = $$1.has("structure")
            ? (aba)abb.a.parse(JsonOps.INSTANCE, $$1.get("structure")).resultOrPartial(b::error).map($$0x -> aba.a(hm.aN, $$0x)).orElse(null)
            : null;
         aba<cht> $$8 = null;
         if ($$1.has("biome")) {
            abb $$9 = new abb(alz.h($$1, "biome"));
            $$8 = aba.a(hm.aR, $$9);
         }

         Boolean $$10 = $$1.has("smokey") ? $$1.get("smokey").getAsBoolean() : null;
         ce $$11 = ce.a($$1.get("light"));
         au $$12 = au.a($$1.get("block"));
         bv $$13 = bv.a($$1.get("fluid"));
         return new ch($$3, $$4, $$5, $$8, $$7, $$6, $$10, $$11, $$12, $$13);
      } else {
         return a;
      }
   }

   public static class a {
      private cj.c a = cj.c.e;
      private cj.c b = cj.c.e;
      private cj.c c = cj.c.e;
      @Nullable
      private aba<cht> d;
      @Nullable
      private aba<dlb> e;
      @Nullable
      private aba<cgx> f;
      @Nullable
      private Boolean g;
      private ce h = ce.a;
      private au i = au.a;
      private bv j = bv.a;

      public static ch.a a() {
         return new ch.a();
      }

      public ch.a a(cj.c $$0) {
         this.a = $$0;
         return this;
      }

      public ch.a b(cj.c $$0) {
         this.b = $$0;
         return this;
      }

      public ch.a c(cj.c $$0) {
         this.c = $$0;
         return this;
      }

      public ch.a a(@Nullable aba<cht> $$0) {
         this.d = $$0;
         return this;
      }

      public ch.a b(@Nullable aba<dlb> $$0) {
         this.e = $$0;
         return this;
      }

      public ch.a c(@Nullable aba<cgx> $$0) {
         this.f = $$0;
         return this;
      }

      public ch.a a(ce $$0) {
         this.h = $$0;
         return this;
      }

      public ch.a a(au $$0) {
         this.i = $$0;
         return this;
      }

      public ch.a a(bv $$0) {
         this.j = $$0;
         return this;
      }

      public ch.a a(Boolean $$0) {
         this.g = $$0;
         return this;
      }

      public ch b() {
         return new ch(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
