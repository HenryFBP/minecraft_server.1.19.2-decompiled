import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class bl {
   public static final bl a = new bl(ca.a, ca.a, ca.a, ca.a, ca.a, ca.a);
   public static final bl b = new bl(ca.a.a().a(caz.sL).a(bvj.s().u()).b(), ca.a, ca.a, ca.a, ca.a, ca.a);
   private final ca c;
   private final ca d;
   private final ca e;
   private final ca f;
   private final ca g;
   private final ca h;

   public bl(ca $$0, ca $$1, ca $$2, ca $$3, ca $$4, ca $$5) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
   }

   public boolean a(@Nullable bbn $$0) {
      if (this == a) {
         return true;
      } else if (!($$0 instanceof bcc)) {
         return false;
      } else {
         bcc $$1 = (bcc)$$0;
         if (!this.c.a($$1.c(bbs.f))) {
            return false;
         } else if (!this.d.a($$1.c(bbs.e))) {
            return false;
         } else if (!this.e.a($$1.c(bbs.d))) {
            return false;
         } else if (!this.f.a($$1.c(bbs.c))) {
            return false;
         } else if (!this.g.a($$1.c(bbs.a))) {
            return false;
         } else {
            return this.h.a($$1.c(bbs.b));
         }
      }
   }

   public static bl a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = alz.m($$0, "equipment");
         ca $$2 = ca.a($$1.get("head"));
         ca $$3 = ca.a($$1.get("chest"));
         ca $$4 = ca.a($$1.get("legs"));
         ca $$5 = ca.a($$1.get("feet"));
         ca $$6 = ca.a($$1.get("mainhand"));
         ca $$7 = ca.a($$1.get("offhand"));
         return new bl($$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         $$0.add("head", this.c.a());
         $$0.add("chest", this.d.a());
         $$0.add("legs", this.e.a());
         $$0.add("feet", this.f.a());
         $$0.add("mainhand", this.g.a());
         $$0.add("offhand", this.h.a());
         return $$0;
      }
   }

   public static class a {
      private ca a;
      private ca b;
      private ca c;
      private ca d;
      private ca e;
      private ca f;

      public a() {
         this.a = ca.a;
         this.b = ca.a;
         this.c = ca.a;
         this.d = ca.a;
         this.e = ca.a;
         this.f = ca.a;
      }

      public static bl.a a() {
         return new bl.a();
      }

      public bl.a a(ca $$0) {
         this.a = $$0;
         return this;
      }

      public bl.a b(ca $$0) {
         this.b = $$0;
         return this;
      }

      public bl.a c(ca $$0) {
         this.c = $$0;
         return this;
      }

      public bl.a d(ca $$0) {
         this.d = $$0;
         return this;
      }

      public bl.a e(ca $$0) {
         this.e = $$0;
         return this;
      }

      public bl.a f(ca $$0) {
         this.f = $$0;
         return this;
      }

      public bl b() {
         return new bl(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
