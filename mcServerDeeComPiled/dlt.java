import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dlt implements dlg {
   private final List<dlf> a = Lists.newArrayList();

   @Override
   public void a(dlf $$0) {
      this.a.add($$0);
   }

   @Nullable
   @Override
   public dlf a(dkt $$0) {
      return dlf.a(this.a, $$0);
   }

   @Deprecated
   public void a(int $$0) {
      for(dlf $$1 : this.a) {
         $$1.a(0, $$0, 0);
      }

   }

   @Deprecated
   public int a(int $$0, int $$1, amn $$2, int $$3) {
      int $$4 = $$0 - $$3;
      dkt $$5 = this.d();
      int $$6 = $$5.d() + $$1 + 1;
      if ($$6 < $$4) {
         $$6 += $$2.a($$4 - $$6);
      }

      int $$7 = $$6 - $$5.k();
      this.a($$7);
      return $$7;
   }

   /** @deprecated */
   public void a(amn $$0, int $$1, int $$2) {
      dkt $$3 = this.d();
      int $$4 = $$2 - $$1 + 1 - $$3.d();
      int $$5;
      if ($$4 > 1) {
         $$5 = $$1 + $$0.a($$4);
      } else {
         $$5 = $$1;
      }

      int $$7 = $$5 - $$3.h();
      this.a($$7);
   }

   public dlq a() {
      return new dlq(this.a);
   }

   public void b() {
      this.a.clear();
   }

   public boolean c() {
      return this.a.isEmpty();
   }

   public dkt d() {
      return dlf.a(this.a.stream());
   }
}
