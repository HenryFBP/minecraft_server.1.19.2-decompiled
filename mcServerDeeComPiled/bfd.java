import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bfd<E extends bcl> extends bdo<E> {
   public static final int a = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final bmf h;
   private final int i;
   private final Function<E, ajv> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bfd.a> l = Optional.empty();

   public bfd(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, bmf $$4, int $$5, Function<E, ajv> $$6) {
      super(ImmutableMap.of(bku.n, bkv.c, bku.T, bkv.b, bku.h, bkv.a, bku.U, bkv.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      $$3.c(bku.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(agg $$0, E $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      if (!$$3.a(bku.U)) {
         $$0.a($$1, (byte)59);
         $$3.a(bku.T, this.d.applyAsInt($$1));
      }

   }

   protected boolean c(agg $$0, bcl $$1, long $$2) {
      return this.l.isPresent() && ((bfd.a)this.l.get()).c().bo();
   }

   protected void d(agg $$0, E $$1, long $$2) {
      if (this.l.isPresent()) {
         $$1.dy().a(bku.m, new bkx(((bfd.a)this.l.get()).a(), this.g, 0));
         $$1.dy().a(bku.n, new bdy(((bfd.a)this.l.get()).c(), true));
         boolean $$3 = !((bfd.a)this.l.get()).c().da().equals(((bfd.a)this.l.get()).b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.D().n();
            this.b($$1, ((bfd.a)this.l.get()).c);
         } else {
            gt $$4 = $$1.da();
            if ($$4.equals(((bfd.a)this.l.get()).a())) {
               $$0.a($$1, (byte)58);
               if (!this.k.isPresent()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dy().a(bku.U, this.a($$4, ((bfd.a)this.l.get()).b()));
                  $$0.a(null, $$1, (ajv)this.j.apply($$1), ajx.f, 1.0F, $$1.eD());
                  this.l = Optional.empty();
               }
            }
         }

      }
   }

   private dwq a(gt $$0, gt $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ami.k((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ami.k((double)($$1.w() - $$0.w()));
      return dwq.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<gt> a(bcl $$0, bcc $$1) {
      gt $$2 = $$1.da();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<gt> $$3 = Lists.newArrayList();
         gt.a $$4 = $$2.i();

         for(gy $$5 : gy.c.a) {
            $$4.g($$2);

            for(int $$6 = 0; $$6 < this.f; ++$$6) {
               if (!this.a($$0, $$4.c($$5))) {
                  $$4.c($$5.g());
                  break;
               }
            }

            if ($$4.k($$2) >= this.e) {
               $$3.add($$4.h());
            }
         }

         blc $$7 = $$0.D();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.da()::j)).filter($$1x -> {
            dql $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bcl $$0, gt $$1) {
      return $$0.D().a($$1) && $$0.a(dqq.a($$0.s, $$1.i())) == 0.0F;
   }

   private void b(bcl $$0, bcc $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bfd.a($$1x, $$1.da(), $$1));
   }

   public static class a {
      private final gt a;
      private final gt b;
      final bcc c;

      public a(gt $$0, gt $$1, bcc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public gt a() {
         return this.a;
      }

      public gt b() {
         return this.b;
      }

      public bcc c() {
         return this.c;
      }
   }
}
