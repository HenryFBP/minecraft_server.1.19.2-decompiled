import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class bzf extends cat {
   private static final String b = "Items";
   public static final int a = 64;
   private static final int c = 4;
   private static final int d = ami.f(0.4F, 0.4F, 1.0F);

   public bzf(cat.a $$0) {
      super($$0);
   }

   public static float d(cax $$0) {
      return (float)o($$0) / 64.0F;
   }

   @Override
   public boolean a(cax $$0, byd $$1, bwu $$2, buc $$3) {
      if ($$2 != bwu.b) {
         return false;
      } else {
         cax $$4 = $$1.e();
         if ($$4.b()) {
            this.a($$3);
            p($$0).ifPresent($$2x -> b($$0, $$1.f($$2x)));
         } else if ($$4.c().S_()) {
            int $$5 = (64 - o($$0)) / k($$4);
            int $$6 = b($$0, $$1.b($$4.K(), $$5, $$3));
            if ($$6 > 0) {
               this.b($$3);
            }
         }

         return true;
      }
   }

   @Override
   public boolean a(cax $$0, cax $$1, byd $$2, bwu $$3, buc $$4, bct $$5) {
      if ($$3 == bwu.b && $$2.b($$4)) {
         if ($$1.b()) {
            p($$0).ifPresent($$2x -> {
               this.a($$4);
               $$5.a($$2x);
            });
         } else {
            int $$6 = b($$0, $$1);
            if ($$6 > 0) {
               this.b($$4);
               $$1.g($$6);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(akg.c.b(this));
         return bak.a($$3, $$0.k_());
      } else {
         return bak.d($$3);
      }
   }

   @Override
   public boolean e(cax $$0) {
      return o($$0) > 0;
   }

   @Override
   public int f(cax $$0) {
      return Math.min(1 + 12 * o($$0) / 64, 13);
   }

   @Override
   public int g(cax $$0) {
      return d;
   }

   private static int b(cax $$0, cax $$1) {
      if (!$$1.b() && $$1.c().S_()) {
         pj $$2 = $$0.v();
         if (!$$2.e("Items")) {
            $$2.a("Items", (qc)(new pp()));
         }

         int $$3 = o($$0);
         int $$4 = k($$1);
         int $$5 = Math.min($$1.K(), (64 - $$3) / $$4);
         if ($$5 == 0) {
            return 0;
         } else {
            pp $$6 = $$2.c("Items", 10);
            Optional<pj> $$7 = a($$1, $$6);
            if ($$7.isPresent()) {
               pj $$8 = (pj)$$7.get();
               cax $$9 = cax.a($$8);
               $$9.f($$5);
               $$9.b($$8);
               $$6.remove($$8);
               $$6.c(0, $$8);
            } else {
               cax $$10 = $$1.o();
               $$10.e($$5);
               pj $$11 = new pj();
               $$10.b($$11);
               $$6.c(0, $$11);
            }

            return $$5;
         }
      } else {
         return 0;
      }
   }

   private static Optional<pj> a(cax $$0, pp $$1) {
      return $$0.a(caz.pd)
         ? Optional.empty()
         : $$1.stream().filter(pj.class::isInstance).map(pj.class::cast).filter($$1x -> cax.e(cax.a($$1x), $$0)).findFirst();
   }

   private static int k(cax $$0) {
      if ($$0.a(caz.pd)) {
         return 4 + o($$0);
      } else {
         if (($$0.a(caz.up) || $$0.a(caz.uo)) && $$0.t()) {
            pj $$1 = byx.a($$0);
            if ($$1 != null && !$$1.c("Bees", 10).isEmpty()) {
               return 64;
            }
         }

         return 64 / $$0.f();
      }
   }

   private static int o(cax $$0) {
      return q($$0).mapToInt($$0x -> k($$0x) * $$0x.K()).sum();
   }

   private static Optional<cax> p(cax $$0) {
      pj $$1 = $$0.v();
      if (!$$1.e("Items")) {
         return Optional.empty();
      } else {
         pp $$2 = $$1.c("Items", 10);
         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            int $$3 = 0;
            pj $$4 = $$2.a(0);
            cax $$5 = cax.a($$4);
            $$2.c(0);
            if ($$2.isEmpty()) {
               $$0.c("Items");
            }

            return Optional.of($$5);
         }
      }
   }

   private static boolean a(cax $$0, buc $$1) {
      pj $$2 = $$0.v();
      if (!$$2.e("Items")) {
         return false;
      } else {
         if ($$1 instanceof agh) {
            pp $$3 = $$2.c("Items", 10);

            for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
               pj $$5 = $$3.a($$4);
               cax $$6 = cax.a($$5);
               $$1.a($$6, true);
            }
         }

         $$0.c("Items");
         return true;
      }
   }

   private static Stream<cax> q(cax $$0) {
      pj $$1 = $$0.u();
      if ($$1 == null) {
         return Stream.empty();
      } else {
         pp $$2 = $$1.c("Items", 10);
         return $$2.stream().map(pj.class::cast).map(cax::a);
      }
   }

   @Override
   public Optional<byk> h(cax $$0) {
      hi<cax> $$1 = hi.a();
      q($$0).forEach($$1::add);
      return Optional.of(new byj($$1, o($$0)));
   }

   @Override
   public void a(cax $$0, cgx $$1, List<rq> $$2, ccl $$3) {
      $$2.add(rq.a("item.minecraft.bundle.fullness", o($$0), 64).a(p.h));
   }

   @Override
   public void a(bqv $$0) {
      cay.a($$0, q($$0.i()));
   }

   private void a(bbn $$0) {
      $$0.a(ajw.co, 0.8F, 0.8F + $$0.W().r_().i() * 0.4F);
   }

   private void b(bbn $$0) {
      $$0.a(ajw.cn, 0.8F, 0.8F + $$0.W().r_().i() * 0.4F);
   }

   private void c(bbn $$0) {
      $$0.a(ajw.cm, 0.8F, 0.8F + $$0.W().r_().i() * 0.4F);
   }
}
