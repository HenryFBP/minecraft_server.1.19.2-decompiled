import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class kz implements ku {
   private final cat b;
   private final cdm c;
   private final int d;
   private final af.a e = af.a.a();
   @Nullable
   private String f;
   private final cdr<?> g;

   public kz(cdr<?> $$0, cdm $$1, cgw $$2, int $$3) {
      this.g = $$0;
      this.b = $$2.l();
      this.c = $$1;
      this.d = $$3;
   }

   public static kz a(cdm $$0, cgw $$1) {
      return new kz(cdr.t, $$0, $$1, 1);
   }

   public static kz a(cdm $$0, cgw $$1, int $$2) {
      return new kz(cdr.t, $$0, $$1, $$2);
   }

   public kz b(String $$0, an $$1) {
      this.e.a($$0, $$1);
      return this;
   }

   public kz b(@Nullable String $$0) {
      this.f = $$0;
      return this;
   }

   @Override
   public cat a() {
      return this.b;
   }

   @Override
   public void a(Consumer<kt> $$0, abb $$1) {
      this.a($$1);
      this.e.a(a).a("has_the_recipe", cs.a($$1)).a(ai.a.c($$1)).a(aq.b);
      $$0.accept(
         new kz.a($$1, this.g, this.f == null ? "" : this.f, this.c, this.b, this.d, this.e, new abb($$1.b(), "recipes/" + this.b.u().b() + "/" + $$1.a()))
      );
   }

   private void a(abb $$0) {
      if (this.e.c().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a implements kt {
      private final abb a;
      private final String b;
      private final cdm c;
      private final cat d;
      private final int e;
      private final af.a f;
      private final abb g;
      private final cdr<?> h;

      public a(abb $$0, cdr<?> $$1, String $$2, cdm $$3, cat $$4, int $$5, af.a $$6, abb $$7) {
         this.a = $$0;
         this.h = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
         this.e = $$5;
         this.f = $$6;
         this.g = $$7;
      }

      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.add("ingredient", this.c.c());
         $$0.addProperty("result", hm.Y.b(this.d).toString());
         $$0.addProperty("count", this.e);
      }

      @Override
      public abb b() {
         return this.a;
      }

      @Override
      public cdr<?> c() {
         return this.h;
      }

      @Nullable
      @Override
      public JsonObject d() {
         return this.f.b();
      }

      @Nullable
      @Override
      public abb e() {
         return this.g;
      }
   }
}
