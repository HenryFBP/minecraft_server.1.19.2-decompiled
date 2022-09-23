import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bcb extends bbn {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int ao;
   private boolean ap;
   @Nullable
   private agh aq;
   private final Set<bbn> ar = Sets.newHashSet();
   private int as;

   public bcb(bbr<? extends bcb> $$0, cgx $$1) {
      super($$0, $$1);
      this.ae = true;
      this.f = 2;
      this.b = this.R.g();
      this.ao = this.R.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.ap = $$0;
   }

   @Override
   public ajx cR() {
      return ajx.d;
   }

   @Nullable
   public agh h() {
      return this.aq;
   }

   public void b(@Nullable agh $$0) {
      this.aq = $$0;
   }

   private void l() {
      gt $$0 = this.n();
      cvo $$1 = this.s.a_($$0);
      if ($$1.a(cju.qb)) {
         ((cny)$$1.b()).d($$1, this.s, $$0);
      }

   }

   @Override
   public void k() {
      super.k();
      if (this.f == 2) {
         if (this.s.k_()) {
            this.s.a(this.df(), this.dh(), this.dl(), ajw.kw, ajx.d, 10000.0F, 0.8F + this.R.i() * 0.2F, false);
            this.s.a(this.df(), this.dh(), this.dl(), ajw.kv, ajx.d, 2.0F, 0.5F + this.R.i() * 0.2F, false);
         } else {
            bag $$0 = this.s.ag();
            if ($$0 == bag.c || $$0 == bag.d) {
               this.a(4);
            }

            this.l();
            b(this.s, this.n());
            this.a(czv.G);
         }
      }

      --this.f;
      if (this.f < 0) {
         if (this.ao == 0) {
            if (this.s instanceof agg) {
               List<bbn> $$1 = this.s
                  .a(
                     this,
                     new dwl(this.df() - 15.0, this.dh() - 15.0, this.dl() - 15.0, this.df() + 15.0, this.dh() + 6.0 + 15.0, this.dl() + 15.0),
                     $$0 -> $$0.bo() && !this.ar.contains($$0)
                  );

               for(agh $$2 : ((agg)this.s).a((Predicate<? super agh>)($$0 -> $$0.e(this) < 256.0F))) {
                  aj.S.a($$2, this, $$1);
               }
            }

            this.ah();
         } else if (this.f < -this.R.a(10)) {
            --this.ao;
            this.f = 1;
            this.b = this.R.g();
            this.a(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.s instanceof agg)) {
            this.s.c(2);
         } else if (!this.ap) {
            List<bbn> $$3 = this.s
               .a(this, new dwl(this.df() - 3.0, this.dh() - 3.0, this.dl() - 3.0, this.df() + 3.0, this.dh() + 6.0 + 3.0, this.dl() + 3.0), bbn::bo);

            for(bbn $$4 : $$3) {
               $$4.a((agg)this.s, this);
            }

            this.ar.addAll($$3);
            if (this.aq != null) {
               aj.E.a(this.aq, $$3);
            }
         }
      }

   }

   private gt n() {
      dwq $$0 = this.cY();
      return new gt($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void a(int $$0) {
      if (!this.ap && !this.s.y && this.s.W().b(cgt.b)) {
         gt $$1 = this.da();
         cvo $$2 = cjh.a(this.s, $$1);
         if (this.s.a_($$1).h() && $$2.a((cha)this.s, $$1)) {
            this.s.b($$1, $$2);
            ++this.as;
         }

         for(int $$3 = 0; $$3 < $$0; ++$$3) {
            gt $$4 = $$1.b(this.R.a(3) - 1, this.R.a(3) - 1, this.R.a(3) - 1);
            $$2 = cjh.a(this.s, $$4);
            if (this.s.a_($$4).h() && $$2.a((cha)this.s, $$4)) {
               this.s.b($$4, $$2);
               ++this.as;
            }
         }

      }
   }

   private static void b(cgx $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      gt $$3;
      cvo $$4;
      if ($$2.a(cju.qb)) {
         $$3 = $$1.a(((gy)$$2.c(cny.a)).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof csj) {
         $$0.b($$3, csj.c($$0.a_($$3)));
         gt.a $$7 = $$1.i();
         int $$8 = $$0.w.a(3) + 3;

         for(int $$9 = 0; $$9 < $$8; ++$$9) {
            int $$10 = $$0.w.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }

      }
   }

   private static void a(cgx $$0, gt $$1, gt.a $$2, int $$3) {
      $$2.g($$1);

      for(int $$4 = 0; $$4 < $$3; ++$$4) {
         Optional<gt> $$5 = c($$0, $$2);
         if (!$$5.isPresent()) {
            break;
         }

         $$2.g((hs)$$5.get());
      }

   }

   private static Optional<gt> c(cgx $$0, gt $$1) {
      for(gt $$2 : gt.a($$0.w, 10, $$1, 1)) {
         cvo $$3 = $$0.a_($$2);
         if ($$3.b() instanceof csj) {
            csj.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cs();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(pj $$0) {
   }

   @Override
   protected void b(pj $$0) {
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }

   public int i() {
      return this.as;
   }

   public Stream<bbn> j() {
      return this.ar.stream().filter(bbn::bo);
   }
}
