import com.google.common.annotations.VisibleForTesting;

public class cug extends cti implements czx {
   private final czr a = new czr(this.o);
   private final cqf b = cqf.a();

   public cug(gt $$0, cvo $$1) {
      super(ctk.I, $$0, $$1);
   }

   @Override
   public boolean c() {
      return true;
   }

   @Override
   public czy a() {
      return this.a;
   }

   @Override
   public int b() {
      return 8;
   }

   @Override
   public boolean a(agg $$0, czv.b $$1) {
      if (this.r()) {
         return false;
      } else {
         czv.a $$2 = $$1.c();
         if ($$1.a() == czv.q) {
            bbn $$4 = $$2.a();
            if ($$4 instanceof bcc $$3) {
               if (!$$3.em()) {
                  int $$4 = $$3.dO();
                  if ($$3.dM() && $$4 > 0) {
                     this.b.a(new gt($$1.b().a(gy.b, 0.5)), $$4);
                     bcc $$5 = $$3.dR();
                     if ($$5 instanceof agh $$6) {
                        baw $$7 = $$3.eh() == null ? baw.a((buc)$$6) : $$3.eh();
                        aj.W.a($$6, $$2.a(), $$7);
                     }
                  }

                  $$3.el();
                  cqc.a($$0, this.o, this.q(), $$0.r_());
               }

               return true;
            }
         }

         return false;
      }
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, cug $$3) {
      $$3.b.a($$0, $$1, $$0.r_(), true);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.b.a($$0);
   }

   @Override
   protected void b(pj $$0) {
      this.b.b($$0);
      super.b($$0);
   }

   @VisibleForTesting
   public cqf d() {
      return this.b;
   }
}
