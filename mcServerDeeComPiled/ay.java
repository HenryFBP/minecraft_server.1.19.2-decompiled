import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ay extends cv<ay.a> {
   static final abb a = new abb("channeled_lightning");

   @Override
   public abb a() {
      return a;
   }

   public ay.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bo.b[] $$3 = bo.b.b($$0, "victims", $$2);
      return new ay.a($$1, $$3);
   }

   public void a(agh $$0, Collection<? extends bbn> $$1) {
      List<dsd> $$2 = (List)$$1.stream().map($$1x -> bo.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static class a extends as {
      private final bo.b[] a;

      public a(bo.b $$0, bo.b[] $$1) {
         super(ay.a, $$0);
         this.a = $$1;
      }

      public static ay.a a(bo... $$0) {
         return new ay.a(bo.b.a, (bo.b[])Stream.of($$0).map(bo.b::a).toArray($$0x -> new bo.b[$$0x]));
      }

      public boolean a(Collection<? extends dsd> $$0) {
         for(bo.b $$1 : this.a) {
            boolean $$2 = false;

            for(dsd $$3 : $$0) {
               if ($$1.a($$3)) {
                  $$2 = true;
                  break;
               }
            }

            if (!$$2) {
               return false;
            }
         }

         return true;
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("victims", bo.b.a(this.a, $$0));
         return $$1;
      }
   }
}
