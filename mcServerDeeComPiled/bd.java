import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class bd {
   public static final bd a = bd.a.a().b();
   @Nullable
   private final Boolean b;
   @Nullable
   private final Boolean c;
   @Nullable
   private final Boolean d;
   @Nullable
   private final Boolean e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final Boolean g;
   @Nullable
   private final Boolean h;
   @Nullable
   private final Boolean i;
   private final bo j;
   private final bo k;

   public bd(
      @Nullable Boolean $$0,
      @Nullable Boolean $$1,
      @Nullable Boolean $$2,
      @Nullable Boolean $$3,
      @Nullable Boolean $$4,
      @Nullable Boolean $$5,
      @Nullable Boolean $$6,
      @Nullable Boolean $$7,
      bo $$8,
      bo $$9
   ) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }

   public boolean a(agh $$0, baw $$1) {
      return this.a($$0.x(), $$0.cY(), $$1);
   }

   public boolean a(agg $$0, dwq $$1, baw $$2) {
      if (this == a) {
         return true;
      } else if (this.b != null && this.b != $$2.b()) {
         return false;
      } else if (this.c != null && this.c != $$2.d()) {
         return false;
      } else if (this.d != null && this.d != $$2.f()) {
         return false;
      } else if (this.e != null && this.e != $$2.i()) {
         return false;
      } else if (this.f != null && this.f != $$2.j()) {
         return false;
      } else if (this.g != null && this.g != $$2.u()) {
         return false;
      } else if (this.h != null && this.h != $$2.z()) {
         return false;
      } else if (this.i != null && this.i != ($$2 == baw.b)) {
         return false;
      } else if (!this.j.a($$0, $$1, $$2.l())) {
         return false;
      } else {
         return this.k.a($$0, $$1, $$2.m());
      }
   }

   public static bd a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = alz.m($$0, "damage type");
         Boolean $$2 = a($$1, "is_projectile");
         Boolean $$3 = a($$1, "is_explosion");
         Boolean $$4 = a($$1, "bypasses_armor");
         Boolean $$5 = a($$1, "bypasses_invulnerability");
         Boolean $$6 = a($$1, "bypasses_magic");
         Boolean $$7 = a($$1, "is_fire");
         Boolean $$8 = a($$1, "is_magic");
         Boolean $$9 = a($$1, "is_lightning");
         bo $$10 = bo.a($$1.get("direct_entity"));
         bo $$11 = bo.a($$1.get("source_entity"));
         return new bd($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
      } else {
         return a;
      }
   }

   @Nullable
   private static Boolean a(JsonObject $$0, String $$1) {
      return $$0.has($$1) ? alz.j($$0, $$1) : null;
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         this.a($$0, "is_projectile", this.b);
         this.a($$0, "is_explosion", this.c);
         this.a($$0, "bypasses_armor", this.d);
         this.a($$0, "bypasses_invulnerability", this.e);
         this.a($$0, "bypasses_magic", this.f);
         this.a($$0, "is_fire", this.g);
         this.a($$0, "is_magic", this.h);
         this.a($$0, "is_lightning", this.i);
         $$0.add("direct_entity", this.j.a());
         $$0.add("source_entity", this.k.a());
         return $$0;
      }
   }

   private void a(JsonObject $$0, String $$1, @Nullable Boolean $$2) {
      if ($$2 != null) {
         $$0.addProperty($$1, $$2);
      }

   }

   public static class a {
      @Nullable
      private Boolean a;
      @Nullable
      private Boolean b;
      @Nullable
      private Boolean c;
      @Nullable
      private Boolean d;
      @Nullable
      private Boolean e;
      @Nullable
      private Boolean f;
      @Nullable
      private Boolean g;
      @Nullable
      private Boolean h;
      private bo i = bo.a;
      private bo j = bo.a;

      public static bd.a a() {
         return new bd.a();
      }

      public bd.a a(Boolean $$0) {
         this.a = $$0;
         return this;
      }

      public bd.a b(Boolean $$0) {
         this.b = $$0;
         return this;
      }

      public bd.a c(Boolean $$0) {
         this.c = $$0;
         return this;
      }

      public bd.a d(Boolean $$0) {
         this.d = $$0;
         return this;
      }

      public bd.a e(Boolean $$0) {
         this.e = $$0;
         return this;
      }

      public bd.a f(Boolean $$0) {
         this.f = $$0;
         return this;
      }

      public bd.a g(Boolean $$0) {
         this.g = $$0;
         return this;
      }

      public bd.a h(Boolean $$0) {
         this.h = $$0;
         return this;
      }

      public bd.a a(bo $$0) {
         this.i = $$0;
         return this;
      }

      public bd.a a(bo.a $$0) {
         this.i = $$0.b();
         return this;
      }

      public bd.a b(bo $$0) {
         this.j = $$0;
         return this;
      }

      public bd.a b(bo.a $$0) {
         this.j = $$0.b();
         return this;
      }

      public bd b() {
         return new bd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
