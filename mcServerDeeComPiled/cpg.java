import java.util.List;

public class cpg extends cji {
   public static final cwf d = cwe.w;
   private final cpg.a e;

   protected cpg(cpg.a $$0, cvn.c $$1) {
      super($$1);
      this.k(this.D.b().a(d, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   protected int g(cvo $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected cvo a(cvo $$0, int $$1) {
      return $$0.a(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected void a(cgy $$0, gt $$1) {
      if (this.aF != dpz.z && this.aF != dpz.A) {
         $$0.a(null, $$1, ajw.uv, ajx.e, 0.3F, 0.6F);
      } else {
         $$0.a(null, $$1, ajw.xF, ajx.e, 0.3F, 0.8F);
      }

   }

   @Override
   protected void b(cgy $$0, gt $$1) {
      if (this.aF != dpz.z && this.aF != dpz.A) {
         $$0.a(null, $$1, ajw.uu, ajx.e, 0.3F, 0.5F);
      } else {
         $$0.a(null, $$1, ajw.xE, ajx.e, 0.3F, 0.7F);
      }

   }

   @Override
   protected int b(cgx $$0, gt $$1) {
      dwl $$2 = c.a($$1);
      List<? extends bbn> $$3;
      switch(this.e) {
         case a:
            $$3 = $$0.a_(null, $$2);
            break;
         case b:
            $$3 = $$0.a(bcc.class, $$2);
            break;
         default:
            return 0;
      }

      if (!$$3.isEmpty()) {
         for(bbn $$6 : $$3) {
            if (!$$6.cm()) {
               return 15;
            }
         }
      }

      return 0;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d);
   }

   public static enum a {
      a,
      b;
   }
}
