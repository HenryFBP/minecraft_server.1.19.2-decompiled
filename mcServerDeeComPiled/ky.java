import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ky implements ku {
   private final cat b;
   private final cdm c;
   private final float d;
   private final int e;
   private final af.a f = af.a.a();
   @Nullable
   private String g;
   private final cdy<?> h;

   private ky(cgw $$0, cdm $$1, float $$2, int $$3, cdy<?> $$4) {
      this.b = $$0.l();
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.h = $$4;
   }

   public static ky a(cdm $$0, cgw $$1, float $$2, int $$3, cdy<?> $$4) {
      return new ky($$1, $$0, $$2, $$3, $$4);
   }

   public static ky a(cdm $$0, cgw $$1, float $$2, int $$3) {
      return a($$0, $$1, $$2, $$3, cdr.s);
   }

   public static ky b(cdm $$0, cgw $$1, float $$2, int $$3) {
      return a($$0, $$1, $$2, $$3, cdr.q);
   }

   public static ky c(cdm $$0, cgw $$1, float $$2, int $$3) {
      return a($$0, $$1, $$2, $$3, cdr.p);
   }

   public static ky d(cdm $$0, cgw $$1, float $$2, int $$3) {
      return a($$0, $$1, $$2, $$3, cdr.r);
   }

   public ky b(String $$0, an $$1) {
      this.f.a($$0, $$1);
      return this;
   }

   public ky b(@Nullable String $$0) {
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
         new ky.a(
            $$1, this.g == null ? "" : this.g, this.c, this.b, this.d, this.e, this.f, new abb($$1.b(), "recipes/" + this.b.u().b() + "/" + $$1.a()), this.h
         )
      );
   }

   private void a(abb $$0) {
      if (this.f.c().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0);
      }
   }

   public static class a implements kt {
      private final abb a;
      private final String b;
      private final cdm c;
      private final cat d;
      private final float e;
      private final int f;
      private final af.a g;
      private final abb h;
      private final cdr<? extends cdb> i;

      public a(abb $$0, String $$1, cdm $$2, cat $$3, float $$4, int $$5, af.a $$6, abb $$7, cdr<? extends cdb> $$8) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = $$7;
         this.i = $$8;
      }

      @Override
      public void a(JsonObject $$0) {
         if (!this.b.isEmpty()) {
            $$0.addProperty("group", this.b);
         }

         $$0.add("ingredient", this.c.c());
         $$0.addProperty("result", hm.Y.b(this.d).toString());
         $$0.addProperty("experience", this.e);
         $$0.addProperty("cookingtime", this.f);
      }

      @Override
      public cdr<?> c() {
         return this.i;
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
