import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class oi {
   private final oj a;
   private boolean b;

   public oi(oj $$0) {
      this.a = $$0;
   }

   public agg a() {
      return this.a.g();
   }

   public cvo a(gt $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public cti b(gt $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      dwl $$0 = this.i();
      List<bbn> $$1 = this.a().a(bbn.class, $$0.g(1.0), $$0x -> !($$0x instanceof buc));
      $$1.forEach(bbn::ag);
   }

   public bqv a(cat $$0, float $$1, float $$2, float $$3) {
      agg $$4 = this.a();
      dwq $$5 = this.a(new dwq((double)$$1, (double)$$2, (double)$$3));
      bqv $$6 = new bqv($$4, $$5.c, $$5.d, $$5.e, new cax($$0, 1));
      $$6.n(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public <E extends bbn> E a(bbr<E> $$0, gt $$1) {
      return this.a($$0, dwq.c($$1));
   }

   public <E extends bbn> E a(bbr<E> $$0, dwq $$1) {
      agg $$2 = this.a();
      E $$3 = $$0.a((cgx)$$2);
      if ($$3 instanceof bce) {
         ((bce)$$3).fp();
      }

      dwq $$4 = this.a($$1);
      $$3.b($$4.c, $$4.d, $$4.e, $$3.dq(), $$3.ds());
      $$2.b($$3);
      return $$3;
   }

   public <E extends bbn> E a(bbr<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new gt($$1, $$2, $$3));
   }

   public <E extends bbn> E a(bbr<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new dwq((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bce> E b(bbr<E> $$0, gt $$1) {
      E $$2 = this.a($$0, $$1);
      $$2.fE();
      return $$2;
   }

   public <E extends bce> E b(bbr<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new gt($$1, $$2, $$3));
   }

   public <E extends bce> E b(bbr<E> $$0, dwq $$1) {
      E $$2 = this.a($$0, $$1);
      $$2.fE();
      return $$2;
   }

   public <E extends bce> E b(bbr<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new dwq((double)$$1, (double)$$2, (double)$$3));
   }

   public on a(bce $$0, gt $$1, float $$2) {
      return this.f().a(2, () -> {
         dql $$3 = $$0.D().a(this.i($$1), 0);
         $$0.D().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new gt($$0, $$1, $$2));
   }

   public void c(gt $$0) {
      this.b($$0, $$0x -> $$0x.a(akl.e), () -> "Expected button");
      gt $$1 = this.i($$0);
      cvo $$2 = this.a().a_($$1);
      ckb $$3 = (ckb)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(gt $$0) {
      gt $$1 = this.i($$0);
      cvo $$2 = this.a().a_($$1);
      $$2.a(this.a(), this.c(), bai.a, new dwm(dwq.a($$1), gy.c, $$1, true));
   }

   public bcc a(bcc $$0) {
      $$0.i(0);
      $$0.c(0.25F);
      return $$0;
   }

   public buc c() {
      return new buc(this.a(), gt.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player"), null) {
         @Override
         public boolean B_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new gt($$0, $$1, $$2));
   }

   public void e(gt $$0) {
      this.a(cju.cH, $$0);
      gt $$1 = this.i($$0);
      cvo $$2 = this.a().a_($$1);
      cnw $$3 = (cnw)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(gt $$0, long $$1) {
      this.a($$0, cju.gb);
      this.b($$1, () -> this.a($$0, cju.a));
   }

   public void f(gt $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cjt $$3) {
      this.a(new gt($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, cvo $$3) {
      this.a(new gt($$0, $$1, $$2), $$3);
   }

   public void a(gt $$0, cjt $$1) {
      this.a($$0, $$1.m());
   }

   public void a(gt $$0, cvo $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cjt $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gt($$1, $$2, $$3));
   }

   public void a(cjt $$0, gt $$1) {
      cvo $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cjt $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new gt($$1, $$2, $$3));
   }

   public void b(cjt $$0, gt $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cjt $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gt($$1, $$2, $$3));
   }

   public void c(cjt $$0, gt $$1) {
      this.b((Runnable)(() -> this.a($$0, $$1)));
   }

   public void a(gt $$0, Predicate<cjt> $$1, String $$2) {
      this.a($$0, $$1, (Supplier<String>)(() -> $$2));
   }

   public void a(gt $$0, Predicate<cjt> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(gt $$0, cwr<T> $$1, T $$2) {
      this.b($$0, $$2x -> $$2x.b($$1) && $$2x.<T>c($$1).equals($$2), () -> "Expected property " + $$1.f() + " to be " + $$2);
   }

   public <T extends Comparable<T>> void a(gt $$0, cwr<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> $$2.test($$2x.<T>c($$1)), () -> $$3);
   }

   public void b(gt $$0, Predicate<cvo> $$1, Supplier<String> $$2) {
      cvo $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new od((String)$$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(bbr<?> $$0) {
      List<? extends bbn> $$1 = this.a().a($$0, this.i(), bbn::bo);
      if ($$1.isEmpty()) {
         throw new oc("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bbr<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gt($$1, $$2, $$3));
   }

   public void c(bbr<?> $$0, gt $$1) {
      gt $$2 = this.i($$1);
      List<? extends bbn> $$3 = this.a().a($$0, new dwl($$2), bbn::bo);
      if ($$3.isEmpty()) {
         throw new od("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bbr<?> $$0, gt $$1, int $$2, double $$3) {
      gt $$4 = this.i($$1);
      List<? extends bbn> $$5 = this.b($$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new od("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bbr<?> $$0, gt $$1, double $$2) {
      List<? extends bbn> $$3 = this.b($$0, $$1, $$2);
      if ($$3.isEmpty()) {
         gt $$4 = this.i($$1);
         throw new od("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bbn> List<T> b(bbr<T> $$0, gt $$1, double $$2) {
      gt $$3 = this.i($$1);
      return this.a().a($$0, new dwl($$3).g($$2), bbn::bo);
   }

   public void a(bbn $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gt($$1, $$2, $$3));
   }

   public void a(bbn $$0, gt $$1) {
      gt $$2 = this.i($$1);
      List<? extends bbn> $$3 = this.a().a($$0.ad(), new dwl($$2), bbn::bo);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new od("Expected " + $$0.ad().i(), $$2, $$1, this.a.p()));
   }

   public void a(cat $$0, gt $$1, double $$2, int $$3) {
      gt $$4 = this.i($$1);
      List<bqv> $$5 = this.a().a(bbr.T, new dwl($$4).g($$2), bbn::bo);
      int $$6 = 0;

      for(bbn $$7 : $$5) {
         bqv $$8 = (bqv)$$7;
         if ($$8.i().c().equals($$0)) {
            $$6 += $$8.i().K();
         }
      }

      if ($$6 != $$3) {
         throw new od("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cat $$0, gt $$1, double $$2) {
      gt $$3 = this.i($$1);

      for(bbn $$5 : this.a().a(bbr.T, new dwl($$3).g($$2), bbn::bo)) {
         bqv $$6 = (bqv)$$5;
         if ($$6.i().c().equals($$0)) {
            return;
         }
      }

      throw new od("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cat $$0, gt $$1, double $$2) {
      gt $$3 = this.i($$1);

      for(bbn $$5 : this.a().a(bbr.T, new dwl($$3).g($$2), bbn::bo)) {
         bqv $$6 = (bqv)$$5;
         if ($$6.i().c().equals($$0)) {
            throw new od("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }

   }

   public void b(bbr<?> $$0) {
      List<? extends bbn> $$1 = this.a().a($$0, this.i(), bbn::bo);
      if (!$$1.isEmpty()) {
         throw new oc("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bbr<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new gt($$1, $$2, $$3));
   }

   public void d(bbr<?> $$0, gt $$1) {
      gt $$2 = this.i($$1);
      List<? extends bbn> $$3 = this.a().a($$0, new dwl($$2), bbn::bo);
      if (!$$3.isEmpty()) {
         throw new od("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bbr<?> $$0, double $$1, double $$2, double $$3) {
      dwq $$4 = new dwq($$1, $$2, $$3);
      dwq $$5 = this.a($$4);
      Predicate<? super bbn> $$6 = $$1x -> $$1x.cy().a($$5, $$5);
      List<? extends bbn> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new oc("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bbr<?> $$0, double $$1, double $$2, double $$3) {
      dwq $$4 = new dwq($$1, $$2, $$3);
      dwq $$5 = this.a($$4);
      Predicate<? super bbn> $$6 = $$1x -> !$$1x.cy().a($$5, $$5);
      List<? extends bbn> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new oc("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bbn, T> void a(gt $$0, bbr<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      gt $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new dwl($$4), bbn::bo);
      if ($$5.isEmpty()) {
         throw new od("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for(E $$6 : $$5) {
            T $$7 = (T)$$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new oc("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new oc("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }

      }
   }

   public void g(gt $$0) {
      gt $$1 = this.i($$0);
      cti $$2 = this.a().c_($$1);
      if ($$2 instanceof ctc && !((ctc)$$2).c()) {
         throw new oc("Container should be empty");
      }
   }

   public void a(gt $$0, cat $$1) {
      gt $$2 = this.i($$0);
      cti $$3 = this.a().c_($$2);
      if (!($$3 instanceof ctc)) {
         throw new oc("Expected a container at " + $$0 + ", found " + hm.ab.b($$3.v()));
      } else if (((ctc)$$3).a_($$1) != 1) {
         throw new oc("Container should contain: " + $$1);
      }
   }

   public void a(dkt $$0, gt $$1) {
      gt.a($$0).forEach($$2 -> {
         gt $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(gt $$0, gt $$1) {
      cvo $$2 = this.a($$0);
      cvo $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }

   }

   public void a(long $$0, gt $$1, cat $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, gt $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bbn, T> void b(gt $$0, bbr<E> $$1, Function<E, T> $$2, T $$3) {
      this.b((Runnable)(() -> this.a($$0, $$1, $$2, $$3)));
   }

   public <E extends bbn> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new oc("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bbn, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = (T)$$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new oc("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void e(bbr<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new gt($$1, $$2, $$3));
   }

   public void e(bbr<?> $$0, gt $$1) {
      this.b((Runnable)(() -> this.c($$0, $$1)));
   }

   public void f(bbr<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new gt($$1, $$2, $$3));
   }

   public void f(bbr<?> $$0, gt $$1) {
      this.b((Runnable)(() -> this.d($$0, $$1)));
   }

   public void e() {
      this.a.m();
   }

   private void h() {
      if (this.b) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.b = true;
      }
   }

   public void a(Runnable $$0) {
      this.h();
      this.a.q().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.h();
      this.a.q().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.h();
      this.a.q().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.p() + $$0, $$1);
   }

   public void h(gt $$0) {
      gt $$1 = this.i($$0);
      agg $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.w);
   }

   public int a(dar.a $$0, int $$1, int $$2) {
      gt $$3 = this.i(new gt($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, gt $$1) {
      throw new od($$0, this.i($$1), $$1, this.g());
   }

   public void a(String $$0, bbn $$1) {
      throw new od($$0, $$1.da(), this.j($$1.da()), this.g());
   }

   public void a(String $$0) {
      throw new oc($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a((Supplier<Exception>)(() -> new oc("Fail conditions met")));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public on f() {
      return this.a.q();
   }

   public gt i(gt $$0) {
      gt $$1 = this.a.d();
      gt $$2 = $$1.a($$0);
      return dot.a($$2, coh.a, this.a.u(), $$1);
   }

   public gt j(gt $$0) {
      gt $$1 = this.a.d();
      cpw $$2 = this.a.u().a(cpw.c);
      gt $$3 = dot.a($$0, coh.a, $$2, $$1);
      return $$3.b($$1);
   }

   public dwq a(dwq $$0) {
      dwq $$1 = dwq.b(this.a.d());
      return dot.a($$1.e($$0), coh.a, this.a.u(), this.a.d());
   }

   public long g() {
      return this.a.p();
   }

   private dwl i() {
      return this.a.f();
   }

   private dwl j() {
      dwl $$0 = this.a.f();
      return $$0.a(gt.b.b(this.i(gt.b)));
   }

   public void a(Consumer<gt> $$0) {
      dwl $$1 = this.j();
      gt.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }
}
