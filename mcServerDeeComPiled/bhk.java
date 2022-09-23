import com.google.common.collect.ImmutableMap;

public class bhk extends bdo<btg> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int a = 40;
   private static final int h = ami.e(34.0);
   private static final int i = ami.f(60.0F);

   public bhk() {
      super(ImmutableMap.of(bku.o, bkv.a, bku.aH, bkv.b, bku.aI, bkv.c, bku.aJ, bkv.c), i);
   }

   protected boolean a(agg $$0, btg $$1) {
      return $$1.a((bbn)$$1.dy().c(bku.o).get(), 15.0, 20.0);
   }

   protected boolean a(agg $$0, btg $$1, long $$2) {
      return true;
   }

   protected void b(agg $$0, btg $$1, long $$2) {
      $$1.dy().a(bku.p, true, (long)i);
      $$1.dy().a(bku.aJ, anf.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(ajw.wK, 3.0F, 1.0F);
   }

   protected void c(agg $$0, btg $$1, long $$2) {
      $$1.dy().c(bku.o).ifPresent($$1x -> $$1.z().a($$1x.cY()));
      if (!$$1.dy().a(bku.aJ) && !$$1.dy().a(bku.aI)) {
         $$1.dy().a(bku.aI, anf.a, (long)(i - h));
         $$1.dy().c(bku.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            dwq $$3 = $$1.cY().b(0.0, 1.6F, 0.0);
            dwq $$4 = $$2x.bj().d($$3);
            dwq $$5 = $$4.d();

            for(int $$6 = 1; $$6 < ami.b($$4.f()) + 7; ++$$6) {
               dwq $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(io.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(ajw.wJ, 3.0F, 1.0F);
            $$2x.a(baw.b((bbn)$$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bdd.c));
            double $$9 = 2.5 * (1.0 - $$2x.b(bdd.c));
            $$2x.i($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(agg $$0, btg $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bcc $$0, int $$1) {
      $$0.dy().a(bku.aH, anf.a, (long)$$1);
   }
}
