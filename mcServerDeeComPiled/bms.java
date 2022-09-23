import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class bms extends cyq<bmu> {
   public static final int a = 6;
   public static final int b = 1;
   private final bms.a d;
   private final LongSet e = new LongOpenHashSet();

   public bms(Path $$0, DataFixer $$1, boolean $$2, hn $$3, cgz $$4) {
      super($$0, bmu::a, bmu::new, $$1, ani.j, $$2, $$3, $$4);
      this.d = new bms.a();
   }

   public void a(gt $$0, hc<bmv> $$1) {
      this.f(hq.c($$0)).a($$0, $$1);
   }

   public void a(gt $$0) {
      this.d(hq.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<hc<bmv>> $$0, gt $$1, int $$2, bms.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aba<bmv> $$0, gt $$1) {
      return this.a($$1, (Predicate<hc<bmv>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<bmt> b(Predicate<hc<bmv>> $$0, gt $$1, int $$2, bms.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cge.a(new cge($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         gt $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<bmt> c(Predicate<hc<bmv>> $$0, gt $$1, int $$2, bms.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @ang
   public Stream<bmt> a(Predicate<hc<bmv>> $$0, cge $$1, bms.b $$2) {
      return IntStream.range(this.c.aj(), this.c.ak())
         .boxed()
         .map($$1x -> this.d(hq.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((bmu)$$2x.get()).a($$0, $$2));
   }

   public Stream<gt> a(Predicate<hc<bmv>> $$0, Predicate<gt> $$1, gt $$2, int $$3, bms.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bmt::f).filter($$1);
   }

   public Stream<Pair<hc<bmv>, gt>> b(Predicate<hc<bmv>> $$0, Predicate<gt> $$1, gt $$2, int $$3, bms.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<hc<bmv>, gt>> c(Predicate<hc<bmv>> $$0, Predicate<gt> $$1, gt $$2, int $$3, bms.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((gt)$$1x.getSecond()).j($$2)));
   }

   public Optional<gt> d(Predicate<hc<bmv>> $$0, Predicate<gt> $$1, gt $$2, int $$3, bms.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<gt> d(Predicate<hc<bmv>> $$0, gt $$1, int $$2, bms.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(bmt::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<hc<bmv>, gt>> e(Predicate<hc<bmv>> $$0, gt $$1, int $$2, bms.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<gt> e(Predicate<hc<bmv>> $$0, Predicate<gt> $$1, gt $$2, int $$3, bms.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bmt::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<gt> a(Predicate<hc<bmv>> $$0, BiPredicate<hc<bmv>, gt> $$1, gt $$2, int $$3) {
      return this.c($$0, $$2, $$3, bms.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<gt> a(Predicate<hc<bmv>> $$0, Predicate<gt> $$1, bms.b $$2, gt $$3, int $$4, amn $$5) {
      List<bmt> $$6 = ad.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(bmt::f);
   }

   public boolean b(gt $$0) {
      return this.d(hq.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ad.c(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(gt $$0, Predicate<hc<bmv>> $$1) {
      return this.d(hq.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<hc<bmv>> c(gt $$0) {
      return this.d(hq.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @ang
   public int d(gt $$0) {
      return this.d(hq.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(hq $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<bmu> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.map($$0x -> $$0x.a($$0xx -> $$0xx.a(aku.b), bms.b.b).findAny().isPresent()).orElse(false);
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      this.d.a();
   }

   @Override
   protected void a(long $$0) {
      super.a($$0);
      this.d.b($$0, this.d.b($$0), false);
   }

   @Override
   protected void b(long $$0) {
      this.d.b($$0, this.d.b($$0), false);
   }

   public void a(cge $$0, cxu $$1) {
      hq $$2 = hq.a($$0, hq.a($$1.g()));
      ad.a(this.d($$2.s()), $$2x -> $$2x.a((Consumer<BiConsumer<gt, hc<bmv>>>)($$2xx -> {
            if (a($$1)) {
               this.a($$1, $$2, $$2xx);
            }

         })), () -> {
         if (a($$1)) {
            bmu $$2x = this.f($$2.s());
            this.a($$1, $$2, $$2x::a);
         }

      });
   }

   private static boolean a(cxu $$0) {
      return $$0.a(bmw.u::contains);
   }

   private void a(cxu $$0, hq $$1, BiConsumer<gt, hc<bmv>> $$2) {
      $$1.t().forEach($$2x -> {
         cvo $$3 = $$0.a(hq.b($$2x.u()), hq.b($$2x.v()), hq.b($$2x.w()));
         bmw.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cha $$0, gt $$1, int $$2) {
      hq.a(new cge($$1), Math.floorDiv($$2, 16), this.c.aj(), this.c.ak())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).map(bmu::a).orElse(false))
         .map($$0x -> ((hq)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, cxn.c));
   }

   final class a extends agc {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return bms.this.g($$0) ? 0 : 7;
      }

      @Override
      protected int c(long $$0) {
         return this.b.get($$0);
      }

      @Override
      protected void a(long $$0, int $$1) {
         if ($$1 > 6) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, (byte)$$1);
         }

      }

      public void a() {
         super.b(Integer.MAX_VALUE);
      }
   }

   public static enum b {
      a(bmt::d),
      b(bmt::e),
      c($$0 -> true);

      private final Predicate<? super bmt> d;

      private b(Predicate<? super bmt> $$0) {
         this.d = $$0;
      }

      public Predicate<? super bmt> a() {
         return this.d;
      }
   }
}
