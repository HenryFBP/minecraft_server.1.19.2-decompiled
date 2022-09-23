import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class akb extends ajz {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cdp<?>> $$0, agh $$1) {
      List<abb> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for(cdp<?> $$4 : $$0) {
         abb $$5 = $$4.f();
         if (!this.a.contains($$5) && !$$4.T_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            aj.f.a($$1, $$4);
            ++$$3;
         }
      }

      this.a(vm.a.b, $$1, $$2);
      return $$3;
   }

   public int b(Collection<cdp<?>> $$0, agh $$1) {
      List<abb> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for(cdp<?> $$4 : $$0) {
         abb $$5 = $$4.f();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            ++$$3;
         }
      }

      this.a(vm.a.c, $$1, $$2);
      return $$3;
   }

   private void a(vm.a $$0, agh $$1, List<abb> $$2) {
      $$1.b.a(new vm($$0, $$2, Collections.emptyList(), this.a()));
   }

   public pj b() {
      pj $$0 = new pj();
      this.a().b($$0);
      pp $$1 = new pp();

      for(abb $$2 : this.a) {
         $$1.add(qa.a($$2.toString()));
      }

      $$0.a("recipes", (qc)$$1);
      pp $$3 = new pp();

      for(abb $$4 : this.b) {
         $$3.add(qa.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", (qc)$$3);
      return $$0;
   }

   public void a(pj $$0, cdq $$1) {
      this.a(aka.a($$0));
      pp $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      pp $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(pp $$0, Consumer<cdp<?>> $$1, cdq $$2) {
      for(int $$3 = 0; $$3 < $$0.size(); ++$$3) {
         String $$4 = $$0.j($$3);

         try {
            abb $$5 = new abb($$4);
            Optional<? extends cdp<?>> $$6 = $$2.a($$5);
            if (!$$6.isPresent()) {
               d.error("Tried to load unrecognized recipe: {} removed now.", $$5);
            } else {
               $$1.accept((cdp)$$6.get());
            }
         } catch (aa var8) {
            d.error("Tried to load improperly formatted recipe: {} removed now.", $$4);
         }
      }

   }

   public void a(agh $$0) {
      $$0.b.a(new vm(vm.a.a, this.a, this.b, this.a()));
   }
}
