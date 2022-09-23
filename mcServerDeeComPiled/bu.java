import com.google.gson.JsonObject;
import java.util.Collection;

public class bu extends cv<bu.a> {
   static final abb a = new abb("fishing_rod_hooked");

   @Override
   public abb a() {
      return a;
   }

   public bu.a a(JsonObject $$0, bo.b $$1, be $$2) {
      ca $$3 = ca.a($$0.get("rod"));
      bo.b $$4 = bo.b.a($$0, "entity", $$2);
      ca $$5 = ca.a($$0.get("item"));
      return new bu.a($$1, $$3, $$4, $$5);
   }

   public void a(agh $$0, cax $$1, buq $$2, Collection<cax> $$3) {
      dsd $$4 = bo.b($$0, (bbn)($$2.j() != null ? $$2.j() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static class a extends as {
      private final ca a;
      private final bo.b b;
      private final ca c;

      public a(bo.b $$0, ca $$1, bo.b $$2, ca $$3) {
         super(bu.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static bu.a a(ca $$0, bo $$1, ca $$2) {
         return new bu.a(bo.b.a, $$0, bo.b.a($$1), $$2);
      }

      public boolean a(cax $$0, dsd $$1, Collection<cax> $$2) {
         if (!this.a.a($$0)) {
            return false;
         } else if (!this.b.a($$1)) {
            return false;
         } else {
            if (this.c != ca.a) {
               boolean $$3 = false;
               bbn $$4 = $$1.c(dul.a);
               if ($$4 instanceof bqv $$5 && this.c.a($$5.i())) {
                  $$3 = true;
               }

               for(cax $$6 : $$2) {
                  if (this.c.a($$6)) {
                     $$3 = true;
                     break;
                  }
               }

               if (!$$3) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("rod", this.a.a());
         $$1.add("entity", this.b.a($$0));
         $$1.add("item", this.c.a());
         return $$1;
      }
   }
}
