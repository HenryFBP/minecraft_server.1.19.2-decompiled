import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;

public class bem<E extends bcc, T extends bcc> extends bdo<E> {
   private final int a;
   private final float d;
   private final bbr<? extends T> e;
   private final int f;
   private final Predicate<T> g;
   private final Predicate<E> h;
   private final bku<T> i;

   public bem(bbr<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bku<T> $$4, float $$5, int $$6) {
      super(ImmutableMap.of(bku.n, bkv.c, bku.m, bkv.b, bku.h, bkv.a));
      this.e = $$0;
      this.d = $$5;
      this.f = $$1 * $$1;
      this.a = $$6;
      this.g = $$3;
      this.h = $$2;
      this.i = $$4;
   }

   public static <T extends bcc> bem<bcc, T> a(bbr<? extends T> $$0, int $$1, bku<T> $$2, float $$3, int $$4) {
      return new bem<>($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <T extends bcc> bem<bcc, T> a(bbr<? extends T> $$0, int $$1, Predicate<T> $$2, bku<T> $$3, float $$4, int $$5) {
      return new bem<>($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      return this.h.test($$1) && this.a($$1);
   }

   private boolean a(E $$0) {
      bkw $$1 = (bkw)$$0.dy().c(bku.h).get();
      return $$1.d(this::b);
   }

   private boolean b(bcc $$0) {
      return this.e.equals($$0.ad()) && this.g.test($$0);
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      Optional<bkw> $$4 = $$3.c(bku.h);
      if (!$$4.isEmpty()) {
         bkw $$5 = (bkw)$$4.get();
         $$5.a($$1x -> this.a($$1, $$1x)).ifPresent($$1x -> {
            $$3.a(this.i, (T)$$1x);
            $$3.a(bku.n, new bdy($$1x, true));
            $$3.a(bku.m, new bkx(new bdy($$1x, false), this.d, this.a));
         });
      }
   }

   private boolean a(E $$0, bcc $$1) {
      return this.e.equals($$1.ad()) && $$1.f((bbn)$$0) <= (double)this.f && this.g.test($$1);
   }
}
