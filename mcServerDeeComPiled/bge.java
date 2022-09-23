import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class bge<E extends bce> extends bdo<E> {
   private static final int a = 200;
   private final Predicate<bcc> d;
   private final BiConsumer<E, bcc> e;
   private final boolean f;

   public bge(Predicate<bcc> $$0, BiConsumer<E, bcc> $$1, boolean $$2) {
      super(ImmutableMap.of(bku.o, bkv.a, bku.E, bkv.c));
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public bge(Predicate<bcc> $$0, BiConsumer<E, bcc> $$1) {
      this($$0, $$1, true);
   }

   public bge(Predicate<bcc> $$0) {
      this($$0, ($$0x, $$1) -> {
      });
   }

   public bge(BiConsumer<E, bcc> $$0) {
      this($$0x -> false, $$0);
   }

   public bge() {
      this($$0 -> false, ($$0, $$1) -> {
      });
   }

   protected void a(agg $$0, E $$1, long $$2) {
      bcc $$3 = this.c($$1);
      if (!$$1.c($$3)) {
         this.a($$1);
      } else if (this.f && a($$1)) {
         this.a($$1);
      } else if (this.d($$1)) {
         this.a($$1);
      } else if (this.b($$1)) {
         this.a($$1);
      } else if (this.d.test(this.c($$1))) {
         this.a($$1);
      }
   }

   private boolean b(E $$0) {
      return this.c($$0).s != $$0.s;
   }

   private bcc c(E $$0) {
      return (bcc)$$0.dy().c(bku.o).get();
   }

   private static <E extends bcc> boolean a(E $$0) {
      Optional<Long> $$1 = $$0.dy().c(bku.E);
      return $$1.isPresent() && $$0.s.U() - $$1.get() > 200L;
   }

   private boolean d(E $$0) {
      Optional<bcc> $$1 = $$0.dy().c(bku.o);
      return $$1.isPresent() && !((bcc)$$1.get()).bo();
   }

   protected void a(E $$0) {
      this.e.accept($$0, this.c($$0));
      $$0.dy().b(bku.o);
   }
}
