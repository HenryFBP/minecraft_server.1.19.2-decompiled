import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;

public class bx extends cv<bx.a> {
   static final abb a = new abb("inventory_changed");

   @Override
   public abb a() {
      return a;
   }

   public bx.a a(JsonObject $$0, bo.b $$1, be $$2) {
      JsonObject $$3 = alz.a($$0, "slots", new JsonObject());
      cj.d $$4 = cj.d.a($$3.get("occupied"));
      cj.d $$5 = cj.d.a($$3.get("full"));
      cj.d $$6 = cj.d.a($$3.get("empty"));
      ca[] $$7 = ca.b($$0.get("items"));
      return new bx.a($$1, $$4, $$5, $$6, $$7);
   }

   public void a(agh $$0, bub $$1, cax $$2) {
      int $$3 = 0;
      int $$4 = 0;
      int $$5 = 0;

      for(int $$6 = 0; $$6 < $$1.b(); ++$$6) {
         cax $$7 = $$1.a($$6);
         if ($$7.b()) {
            ++$$4;
         } else {
            ++$$5;
            if ($$7.K() >= $$7.f()) {
               ++$$3;
            }
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(agh $$0, bub $$1, cax $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$5x -> $$5x.a($$1, $$2, $$3, $$4, $$5));
   }

   public static class a extends as {
      private final cj.d a;
      private final cj.d b;
      private final cj.d c;
      private final ca[] d;

      public a(bo.b $$0, cj.d $$1, cj.d $$2, cj.d $$3, ca[] $$4) {
         super(bx.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
         this.d = $$4;
      }

      public static bx.a a(ca... $$0) {
         return new bx.a(bo.b.a, cj.d.e, cj.d.e, cj.d.e, $$0);
      }

      public static bx.a a(cgw... $$0) {
         ca[] $$1 = new ca[$$0.length];

         for(int $$2 = 0; $$2 < $$0.length; ++$$2) {
            $$1[$$2] = new ca(null, ImmutableSet.of($$0[$$2].l()), cj.d.e, cj.d.e, bj.b, bj.b, null, cl.a);
         }

         return a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (!this.a.c() || !this.b.c() || !this.c.c()) {
            JsonObject $$2 = new JsonObject();
            $$2.add("occupied", this.a.d());
            $$2.add("full", this.b.d());
            $$2.add("empty", this.c.d());
            $$1.add("slots", $$2);
         }

         if (this.d.length > 0) {
            JsonArray $$3 = new JsonArray();

            for(ca $$4 : this.d) {
               $$3.add($$4.a());
            }

            $$1.add("items", $$3);
         }

         return $$1;
      }

      public boolean a(bub $$0, cax $$1, int $$2, int $$3, int $$4) {
         if (!this.b.d($$2)) {
            return false;
         } else if (!this.c.d($$3)) {
            return false;
         } else if (!this.a.d($$4)) {
            return false;
         } else {
            int $$5 = this.d.length;
            if ($$5 == 0) {
               return true;
            } else if ($$5 != 1) {
               List<ca> $$6 = new ObjectArrayList(this.d);
               int $$7 = $$0.b();

               for(int $$8 = 0; $$8 < $$7; ++$$8) {
                  if ($$6.isEmpty()) {
                     return true;
                  }

                  cax $$9 = $$0.a($$8);
                  if (!$$9.b()) {
                     $$6.removeIf($$1x -> $$1x.a($$9));
                  }
               }

               return $$6.isEmpty();
            } else {
               return !$$1.b() && this.d[0].a($$1);
            }
         }
      }
   }
}
