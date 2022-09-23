import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cgh extends cgd {
   cxe p_();

   @Nullable
   cgd c(int var1, int var2);

   default boolean a(@Nullable bbn $$0, dxj $$1) {
      return true;
   }

   default boolean a(cvo $$0, gt $$1, dwv $$2) {
      dxj $$3 = $$0.b(this, $$1, $$2);
      return $$3.b() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bbn $$0) {
      return this.a($$0, dxg.a($$0.cy()));
   }

   default boolean b(dwl $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bbn $$0) {
      return this.a($$0, $$0.cy());
   }

   default boolean a(@Nullable bbn $$0, dwl $$1) {
      for(dxj $$2 : this.d($$0, $$1)) {
         if (!$$2.b()) {
            return false;
         }
      }

      if (!this.b($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         dxj $$3 = this.f($$0, $$1);
         return $$3 == null || !dxg.c($$3, dxg.a($$1), dwu.i);
      }
   }

   List<dxj> b(@Nullable bbn var1, dwl var2);

   default Iterable<dxj> c(@Nullable bbn $$0, dwl $$1) {
      List<dxj> $$2 = this.b($$0, $$1);
      Iterable<dxj> $$3 = this.d($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<dxj> d(@Nullable bbn $$0, dwl $$1) {
      return () -> new cgb(this, $$0, $$1);
   }

   @Nullable
   private dxj f(bbn $$0, dwl $$1) {
      cxe $$2 = this.p_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean e(@Nullable bbn $$0, dwl $$1) {
      cgb $$2 = new cgb(this, $$0, $$1, true);

      while($$2.hasNext()) {
         if (!((dxj)$$2.next()).b()) {
            return true;
         }
      }

      return false;
   }

   default Optional<dwq> a(@Nullable bbn $$0, dxj $$1, dwq $$2, double $$3, double $$4, double $$5) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         dwl $$6 = $$1.a().c($$3, $$4, $$5);
         dxj $$7 = (dxj)StreamSupport.stream(this.d($$0, $$6).spliterator(), false)
            .filter($$0x -> this.p_() == null || this.p_().a($$0x.a()))
            .flatMap($$0x -> $$0x.d().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(dxg::a)
            .reduce(dxg.a(), dxg::a);
         dxj $$8 = dxg.a($$1, $$7, dwu.e);
         return $$8.a($$2);
      }
   }
}
