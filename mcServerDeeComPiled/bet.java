import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bet<E extends bce> extends bdo<E> {
   protected static final int a = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final azu p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bet.a> h = Lists.newArrayList();
   protected Optional<dwq> i = Optional.empty();
   @Nullable
   protected dwq j;
   protected int k;
   protected long l;
   private Function<E, ajv> q;
   private final Predicate<cvo> r;

   public bet(azu $$0, int $$1, int $$2, float $$3, Function<E, ajv> $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0x -> false);
   }

   public bet(azu $$0, int $$1, int $$2, float $$3, Function<E, ajv> $$4, Predicate<cvo> $$5) {
      super(ImmutableMap.of(bku.n, bkv.c, bku.Q, bkv.b, bku.R, bkv.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(agg $$0, bce $$1) {
      boolean $$2 = $$1.aw() && !$$1.aR() && !$$1.bf() && !$$0.a_($$1.da()).a(cju.nR);
      if (!$$2) {
         $$1.dy().a(bku.Q, this.p.a($$0.w) / 2);
      }

      return $$2;
   }

   protected boolean b(agg $$0, bce $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && ((dwq)this.i.get()).equals($$1.cY()) && this.k > 0 && !$$1.aU() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dy().c(bku.R).isEmpty()) {
         $$1.dy().a(bku.Q, this.p.a($$0.w) / 2);
         $$1.dy().b(bku.n);
      }

      return $$3;
   }

   protected void a(agg $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.cY());
      gt $$3 = $$1.da();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = (List)gt.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bet.a($$1x.h(), ami.e($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(agg $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.o($$1.aX);
            $$1.p(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + $$1.eG();
            $$1.f(this.j.a($$4 / $$3));
            $$1.dy().a(bku.R, true);
            $$0.a(null, $$1, (ajv)this.q.apply($$1), ajx.g, 1.0F, 1.0F);
         }
      } else {
         --this.k;
         this.d($$0, $$1, $$2);
      }

   }

   protected void d(agg $$0, E $$1, long $$2) {
      while(!this.h.isEmpty()) {
         Optional<bet.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bet.a $$4 = (bet.a)$$3.get();
            gt $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               dwq $$6 = dwq.a($$5);
               dwq $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dy().a(bku.n, new bdq($$5));
                  blc $$8 = $$1.D();
                  dql $$9 = $$8.a($$5, 0, 8);
                  if ($$9 == null || !$$9.j()) {
                     this.j = $$7;
                     this.l = $$2;
                     return;
                  }
               }
            }
         }
      }

   }

   protected Optional<bet.a> a(agg $$0) {
      Optional<bet.a> $$1 = ayw.a($$0.w, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   protected boolean a(agg $$0, E $$1, gt $$2) {
      gt $$3 = $$1.da();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      if ($$4 == $$2.u() && $$5 == $$2.w()) {
         return false;
      } else if (!$$1.D().a($$2) && !this.r.test($$0.a_($$2.c()))) {
         return false;
      } else {
         return $$1.a(dqq.a($$1.s, $$2.i())) == 0.0F;
      }
   }

   @Nullable
   protected dwq a(bce $$0, dwq $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);

      for(int $$3 : $$2) {
         dwq $$4 = this.a($$0, $$1, $$3);
         if ($$4 != null) {
            return $$4;
         }
      }

      return null;
   }

   @Nullable
   private dwq a(bce $$0, dwq $$1, int $$2) {
      dwq $$3 = $$0.cY();
      dwq $$4 = new dwq($$1.c - $$3.c, 0.0, $$1.e - $$3.e).d().a(0.5);
      $$1 = $$1.d($$4);
      dwq $$5 = $$1.d($$3);
      float $$6 = (float)$$2 * (float) Math.PI / 180.0F;
      double $$7 = Math.atan2($$5.e, $$5.c);
      double $$8 = $$5.a(0.0, $$5.d, 0.0).g();
      double $$9 = Math.sqrt($$8);
      double $$10 = $$5.d;
      double $$11 = Math.sin((double)(2.0F * $$6));
      double $$12 = 0.08;
      double $$13 = Math.pow(Math.cos((double)$$6), 2.0);
      double $$14 = Math.sin((double)$$6);
      double $$15 = Math.cos((double)$$6);
      double $$16 = Math.sin($$7);
      double $$17 = Math.cos($$7);
      double $$18 = $$8 * 0.08 / ($$9 * $$11 - 2.0 * $$10 * $$13);
      if ($$18 < 0.0) {
         return null;
      } else {
         double $$19 = Math.sqrt($$18);
         if ($$19 > (double)this.g) {
            return null;
         } else {
            double $$20 = $$19 * $$15;
            double $$21 = $$19 * $$14;
            int $$22 = ami.e($$9 / $$20) * 2;
            double $$23 = 0.0;
            dwq $$24 = null;

            for(int $$25 = 0; $$25 < $$22 - 1; ++$$25) {
               $$23 += $$9 / (double)$$22;
               double $$26 = $$14 / $$15 * $$23 - Math.pow($$23, 2.0) * 0.08 / (2.0 * $$18 * Math.pow($$15, 2.0));
               double $$27 = $$23 * $$17;
               double $$28 = $$23 * $$16;
               dwq $$29 = new dwq($$3.c + $$27, $$3.d + $$26, $$3.e + $$28);
               if ($$24 != null && !this.a($$0, $$24, $$29)) {
                  return null;
               }

               $$24 = $$29;
            }

            return new dwq($$20 * $$17, $$21, $$20 * $$16).a(0.95F);
         }
      }
   }

   private boolean a(bce $$0, dwq $$1, dwq $$2) {
      bbo $$3 = $$0.a(bco.g);
      dwq $$4 = $$2.d($$1);
      double $$5 = (double)Math.min($$3.a, $$3.b);
      int $$6 = ami.e($$4.f() / $$5);
      dwq $$7 = $$4.d();
      dwq $$8 = $$1;

      for(int $$9 = 0; $$9 < $$6; ++$$9) {
         $$8 = $$9 == $$6 - 1 ? $$2 : $$8.e($$7.a($$5 * 0.9F));
         dwl $$10 = $$3.a($$8);
         if (!$$0.s.a($$0, $$10)) {
            return false;
         }
      }

      return true;
   }

   public static class a extends ayv.a {
      private final gt a;

      public a(gt $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public gt b() {
         return this.a;
      }
   }
}
