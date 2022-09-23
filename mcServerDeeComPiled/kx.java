import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class kx implements ku {
   private final cat b;
   private final int c;
   private final List<cdm> d = Lists.newArrayList();
   private final af.a e = af.a.a();
   @Nullable
   private String f;

   public kx(cgw $$0, int $$1) {
      this.b = $$0.l();
      this.c = $$1;
   }

   public static kx b(cgw $$0) {
      return new kx($$0, 1);
   }

   public static kx a(cgw $$0, int $$1) {
      return new kx($$0, $$1);
   }

   public kx a(akz<cat> $$0) {
      return this.a(cdm.a($$0));
   }

   public kx c(cgw $$0) {
      return this.b($$0, 1);
   }

   public kx b(cgw $$0, int $$1) {
      for(int $$2 = 0; $$2 < $$1; ++$$2) {
         this.a(cdm.a($$0));
      }

      return this;
   }

   public kx a(cdm $$0) {
      return this.a($$0, 1);
   }

   public kx a(cdm $$0, int $$1) {
      for(int $$2 = 0; $$2 < $$1; ++$$2) {
         this.d.add($$0);
      }

      return this;
   }

   public kx b(String $$0, an $$1) {
      this.e.a($$0, $$1);
      return this;
   }

   public kx b(@Nullable String $$0) {
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
      $$0.accept(new kx.a($$1, this.b, this.c, this.f == null ? "" : this.f, this.d, this.e, new abb($$1.b(), "recipes/" + this.b.u().b() + "/" + $$1.a())));
   }

   private void a(abb $$0) {
      if (this.e.c().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a implements kt {
      private final abb a;
      private final cat b;
      private final int c;
      private final String d;
      private final List<cdm> e;
      private final af.a f;
      private final abb g;

      public a(abb $$0, cat $$1, int $$2, String $$3, List<cdm> $$4, af.a $$5, abb $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }

      @Override
      public void a(JsonObject $$0) {
         if (!this.d.isEmpty()) {
            $$0.addProperty("group", this.d);
         }

         JsonArray $$1 = new JsonArray();

         for(cdm $$2 : this.e) {
            $$1.add($$2.c());
         }

         $$0.add("ingredients", $$1);
         JsonObject $$3 = new JsonObject();
         $$3.addProperty("item", hm.Y.b(this.b).toString());
         if (this.c > 1) {
            $$3.addProperty("count", this.c);
         }

         $$0.add("result", $$3);
      }

      @Override
      public cdr<?> c() {
         return cdr.b;
      }

      @Override
      public abb b() {
         return this.a;
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
