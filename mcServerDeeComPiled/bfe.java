import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bfe extends bdo<bow> {
   public static final int a = 200;
   public static final float d = 1.65F;
   private final Function<bow, azu> e;
   private final bmf f;
   private final float g;
   private final ToDoubleFunction<bow> h;
   private dwq i;
   private final Function<bow, ajv> j;
   private final Function<bow, ajv> k;

   public bfe(Function<bow, azu> $$0, bmf $$1, float $$2, ToDoubleFunction<bow> $$3, Function<bow, ajv> $$4, Function<bow, ajv> $$5) {
      super(ImmutableMap.of(bku.T, bkv.b, bku.U, bkv.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = dwq.b;
   }

   protected boolean a(agg $$0, bow $$1) {
      return $$1.dy().a(bku.U);
   }

   protected boolean a(agg $$0, bow $$1, long $$2) {
      return $$1.dy().a(bku.U);
   }

   protected void b(agg $$0, bow $$1, long $$2) {
      gt $$3 = $$1.da();
      bcx<?> $$4 = $$1.dy();
      dwq $$5 = (dwq)$$4.c(bku.U).get();
      this.i = new dwq((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bku.m, new bkx($$5, this.g, 0));
   }

   protected void c(agg $$0, bow $$1, long $$2) {
      List<bcc> $$3 = $$0.a(bcc.class, this.f, $$1, $$1.cy());
      bcx<?> $$4 = $$1.dy();
      if (!$$3.isEmpty()) {
         bcc $$5 = (bcc)$$3.get(0);
         $$5.a(baw.c($$1).t(), (float)$$1.b(bdd.f));
         int $$6 = $$1.a(bbi.a) ? $$1.b(bbi.a).d() + 1 : 0;
         int $$7 = $$1.a(bbi.b) ? $$1.b(bbi.b).d() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ami.a($$1.eK() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.e(baw.c($$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, (ajv)this.j.apply($$1), ajx.f, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, (ajv)this.j.apply($$1), ajx.f, 1.0F, 1.0F);
         boolean $$11 = $$1.fR();
         if ($$11) {
            $$0.a(null, $$1, (ajv)this.k.apply($$1), ajx.f, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bkx> $$12 = $$4.c(bku.m);
         Optional<dwq> $$13 = $$4.c(bku.U);
         boolean $$14 = !$$12.isPresent() || !$$13.isPresent() || ((bkx)$$12.get()).a().a().a((hj)$$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }

   }

   private boolean c(agg $$0, bow $$1) {
      dwq $$2 = $$1.dd().d(1.0, 0.0, 1.0).d();
      gt $$3 = new gt($$1.cY().e($$2));
      return $$0.a_($$3).a(akl.bT) || $$0.a_($$3.b()).a(akl.bT);
   }

   protected void b(agg $$0, bow $$1) {
      $$0.a($$1, (byte)59);
      $$1.dy().a(bku.T, ((azu)this.e.apply($$1)).a($$0.w));
      $$1.dy().b(bku.U);
   }
}
