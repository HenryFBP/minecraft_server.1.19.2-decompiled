import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lb {
   private final cdm a;
   private final cdm b;
   private final cat c;
   private final af.a d = af.a.a();
   private final cdr<?> e;

   public lb(cdr<?> $$0, cdm $$1, cdm $$2, cat $$3) {
      this.e = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public static lb a(cdm $$0, cdm $$1, cat $$2) {
      return new lb(cdr.u, $$0, $$1, $$2);
   }

   public lb a(String $$0, an $$1) {
      this.d.a($$0, $$1);
      return this;
   }

   public void a(Consumer<kt> $$0, String $$1) {
      this.a($$0, new abb($$1));
   }

   public void a(Consumer<kt> $$0, abb $$1) {
      this.a($$1);
      this.d.a(ku.a).a("has_the_recipe", cs.a($$1)).a(ai.a.c($$1)).a(aq.b);
      $$0.accept(new lb.a($$1, this.e, this.a, this.b, this.c, this.d, new abb($$1.b(), "recipes/" + this.c.u().b() + "/" + $$1.a())));
   }

   private void a(abb $$0) {
      if (this.d.c().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a implements kt {
      private final abb a;
      private final cdm b;
      private final cdm c;
      private final cat d;
      private final af.a e;
      private final abb f;
      private final cdr<?> g;

      public a(abb $$0, cdr<?> $$1, cdm $$2, cdm $$3, cat $$4, af.a $$5, abb $$6) {
         this.a = $$0;
         this.g = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.add("base", this.b.c());
         $$0.add("addition", this.c.c());
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("item", hm.Y.b(this.d).toString());
         $$0.add("result", $$1);
      }

      @Override
      public abb b() {
         return this.a;
      }

      @Override
      public cdr<?> c() {
         return this.g;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.e.b();
      }

      @Nullable
      @Override
      public abb e() {
         return this.f;
      }
   }
}
