import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bdp {
   private bdp() {
   }

   public static void a(bcc $$0, bcc $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bcx<?> $$0, bcc $$1) {
      Optional<bkw> $$2 = $$0.c(bku.h);
      return $$2.isPresent() && ((bkw)$$2.get()).a($$1);
   }

   public static boolean a(bcx<?> $$0, bku<? extends bcc> $$1, bbr<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ad() == $$2);
   }

   private static boolean a(bcx<?> $$0, bku<? extends bcc> $$1, Predicate<bcc> $$2) {
      return $$0.c($$1).filter($$2).filter(bcc::bo).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bcc $$0, bcc $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bcc $$0, bcc $$1) {
      $$0.dy().a(bku.n, new bdy($$1, true));
   }

   private static void b(bcc $$0, bcc $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bcc $$0, bbn $$1, float $$2, int $$3) {
      a($$0, new bdy($$1, true), $$2, $$3);
   }

   public static void a(bcc $$0, gt $$1, float $$2, int $$3) {
      a($$0, new bdq($$1), $$2, $$3);
   }

   public static void a(bcc $$0, bfc $$1, float $$2, int $$3) {
      bkx $$4 = new bkx($$1, $$2, $$3);
      $$0.dy().a(bku.n, $$1);
      $$0.dy().a(bku.m, $$4);
   }

   public static void a(bcc $$0, cax $$1, dwq $$2) {
      dwq $$3 = new dwq(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bcc $$0, cax $$1, dwq $$2, dwq $$3, float $$4) {
      double $$5 = $$0.dj() - (double)$$4;
      bqv $$6 = new bqv($$0.s, $$0.df(), $$5, $$0.dl(), $$1);
      $$6.c($$0.co());
      dwq $$7 = $$2.d($$0.cY());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.o();
      $$0.s.b($$6);
   }

   public static hq a(agg $$0, hq $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return (hq)hq.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bce $$0, bcc $$1, int $$2) {
      cat $$3 = $$0.ez().c();
      if ($$3 instanceof cbm $$4 && $$0.a((cbm)$$3)) {
         int $$5 = $$4.d() - $$2;
         return $$0.a($$1, (double)$$5);
      }

      return $$0.j($$1);
   }

   public static boolean a(bcc $$0, bcc $$1, double $$2) {
      Optional<bcc> $$3 = $$0.dy().c(bku.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e(((bcc)$$3.get()).cY());
         double $$5 = $$0.e($$1.cY());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bcc $$0, bcc $$1) {
      bcx<?> $$2 = $$0.dy();
      return !$$2.a(bku.h) ? false : ((bkw)$$2.c(bku.h).get()).a($$1);
   }

   public static bcc a(bcc $$0, Optional<bcc> $$1, bcc $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, (bcc)$$1.get(), $$2);
   }

   public static bcc a(bcc $$0, bcc $$1, bcc $$2) {
      dwq $$3 = $$1.cY();
      dwq $$4 = $$2.cY();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<bcc> a(bcc $$0, bku<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dy().c($$1);
      return $$2.map($$1x -> ((agg)$$0.s).a($$1x)).map($$0x -> $$0x instanceof bcc $$1x ? $$1x : null);
   }

   public static Stream<btp> a(btp $$0, Predicate<btp> $$1) {
      return (Stream<btp>)$$0.dy()
         .c(bku.g)
         .map($$2 -> $$2.stream().filter($$1xx -> $$1xx instanceof btp && $$1xx != $$0).map($$0xx -> (btp)$$0xx).filter(bcc::bo).filter($$1))
         .orElseGet(Stream::empty);
   }

   @Nullable
   public static dwq a(bcl $$0, int $$1, int $$2) {
      dwq $$3 = bmj.a($$0, $$1, $$2);
      int $$4 = 0;

      while($$3 != null && !$$0.s.a_(new gt($$3)).a($$0.s, new gt($$3), dqm.b) && $$4++ < 10) {
         $$3 = bmj.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bcc $$0) {
      return $$0.dy().a(bku.r);
   }
}
