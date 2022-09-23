import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class cb extends cv<cb.a> {
   static final abb a = new abb("killed_by_crossbow");

   @Override
   public abb a() {
      return a;
   }

   public cb.a a(JsonObject $$0, bo.b $$1, be $$2) {
      bo.b[] $$3 = bo.b.b($$0, "victims", $$2);
      cj.d $$4 = cj.d.a($$0.get("unique_entity_types"));
      return new cb.a($$1, $$3, $$4);
   }

   public void a(agh $$0, Collection<bbn> $$1) {
      List<dsd> $$2 = Lists.newArrayList();
      Set<bbr<?>> $$3 = Sets.newHashSet();

      for(bbn $$4 : $$1) {
         $$3.add($$4.ad());
         $$2.add(bo.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static class a extends as {
      private final bo.b[] a;
      private final cj.d b;

      public a(bo.b $$0, bo.b[] $$1, cj.d $$2) {
         super(cb.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cb.a a(bo.a... $$0) {
         bo.b[] $$1 = new bo.b[$$0.length];

         for(int $$2 = 0; $$2 < $$0.length; ++$$2) {
            bo.a $$3 = $$0[$$2];
            $$1[$$2] = bo.b.a($$3.b());
         }

         return new cb.a(bo.b.a, $$1, cj.d.e);
      }

      public static cb.a a(cj.d $$0) {
         bo.b[] $$1 = new bo.b[0];
         return new cb.a(bo.b.a, $$1, $$0);
      }

      public boolean a(Collection<dsd> $$0, int $$1) {
         if (this.a.length > 0) {
            List<dsd> $$2 = Lists.newArrayList($$0);

            for(bo.b $$3 : this.a) {
               boolean $$4 = false;
               Iterator<dsd> $$5 = $$2.iterator();

               while($$5.hasNext()) {
                  dsd $$6 = (dsd)$$5.next();
                  if ($$3.a($$6)) {
                     $$5.remove();
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  return false;
               }
            }
         }

         return this.b.d($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("victims", bo.b.a(this.a, $$0));
         $$1.add("unique_entity_types", this.b.d());
         return $$1;
      }
   }
}
