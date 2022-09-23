import com.google.gson.JsonObject;
import java.util.List;
import java.util.stream.Collectors;

public class cg extends cv<cg.a> {
   static final abb a = new abb("lightning_strike");

   @Override
   public abb a() {
      return a;
   }

   public cg.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bo.b $$3 = bo.b.a($$0, "lightning", $$2);
      bo.b $$4 = bo.b.a($$0, "bystander", $$2);
      return new cg.a($$1, $$3, $$4);
   }

   public void a(agh $$0, bcb $$1, List<bbn> $$2) {
      List<dsd> $$3 = (List)$$2.stream().map($$1x -> bo.b($$0, $$1x)).collect(Collectors.toList());
      dsd $$4 = bo.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static class a extends as {
      private final bo.b a;
      private final bo.b b;

      public a(bo.b $$0, bo.b $$1, bo.b $$2) {
         super(cg.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cg.a a(bo $$0, bo $$1) {
         return new cg.a(bo.b.a, bo.b.a($$0), bo.b.a($$1));
      }

      public boolean a(dsd $$0, List<dsd> $$1) {
         if (!this.a.a($$0)) {
            return false;
         } else {
            return this.b == bo.b.a || !$$1.stream().noneMatch(this.b::a);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("lightning", this.a.a($$0));
         $$1.add("bystander", this.b.a($$0));
         return $$1;
      }
   }
}
