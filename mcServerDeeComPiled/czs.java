import java.util.function.Consumer;
import javax.annotation.Nullable;

public class czs<T extends czx> {
   private T a;
   @Nullable
   private hq b;

   public czs(T $$0) {
      this.a = $$0;
   }

   public void a(agg $$0) {
      this.c($$0);
   }

   public void a(T $$0, @Nullable cgx $$1) {
      T $$2 = this.a;
      if ($$2 != $$0) {
         if ($$1 instanceof agg $$3) {
            a($$3, this.b, $$1x -> $$1x.b($$2));
            a($$3, this.b, $$1x -> $$1x.a($$0));
         }

         this.a = $$0;
      }
   }

   public T a() {
      return this.a;
   }

   public void b(agg $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(agg $$0) {
      this.a.a().a($$0).map(hq::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }

      });
   }

   private static void a(cha $$0, @Nullable hq $$1, Consumer<czw> $$2) {
      if ($$1 != null) {
         cxj $$3 = $$0.a($$1.a(), $$1.c(), cxn.o, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }

      }
   }
}
