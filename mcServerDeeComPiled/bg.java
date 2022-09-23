import com.google.gson.JsonObject;

public class bg extends cv<bg.a> {
   final abb a;

   public bg(abb $$0) {
      this.a = $$0;
   }

   @Override
   public abb a() {
      return this.a;
   }

   public bg.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ch $$3 = ch.a($$0.get("start_position"));
      bf $$4 = bf.a($$0.get("distance"));
      return new bg.a(this.a, $$1, $$3, $$4);
   }

   public void a(agh $$0, dwq $$1) {
      dwq $$2 = $$0.cY();
      this.a($$0, $$3 -> $$3.a($$0.x(), $$1, $$2));
   }

   public static class a extends as {
      private final ch a;
      private final bf b;

      public a(abb $$0, bo.b $$1, ch $$2, bf $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static bg.a a(bo.a $$0, bf $$1, ch $$2) {
         return new bg.a(aj.U.a, bo.b.a($$0.b()), $$2, $$1);
      }

      public static bg.a a(bo.a $$0, bf $$1) {
         return new bg.a(aj.V.a, bo.b.a($$0.b()), ch.a, $$1);
      }

      public static bg.a a(bf $$0) {
         return new bg.a(aj.C.a, bo.b.a, ch.a, $$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("start_position", this.a.a());
         $$1.add("distance", this.b.a());
         return $$1;
      }

      public boolean a(agg $$0, dwq $$1, dwq $$2) {
         if (!this.a.a($$0, $$1.c, $$1.d, $$1.e)) {
            return false;
         } else {
            return this.b.a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
         }
      }
   }
}
