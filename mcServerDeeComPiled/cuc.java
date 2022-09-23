public class cuc extends cti implements baa {
   private cax a = cax.b;
   private int b;
   private long c;
   private long d;
   private boolean e;

   public cuc(gt $$0, cvo $$1) {
      super(ctk.e, $$0, $$1);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.a(cax.a($$0.p("RecordItem")));
      }

      this.e = $$0.q("IsPlaying");
      this.d = $$0.i("RecordStartTick");
      this.c = $$0.i("TickCount");
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("RecordItem", (qc)this.c().b(new pj()));
      }

      $$0.a("IsPlaying", this.e);
      $$0.a("RecordStartTick", this.d);
      $$0.a("TickCount", this.c);
   }

   public cax c() {
      return this.a;
   }

   public void a(cax $$0) {
      this.a = $$0;
      this.e();
   }

   public void d() {
      this.d = this.c;
      this.e = true;
   }

   @Override
   public void a() {
      this.a(cax.b);
      this.e = false;
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, cuc $$3) {
      ++$$3.b;
      if (a($$2, $$3)) {
         cat var5 = $$3.c().c();
         if (var5 instanceof cbo $$4) {
            if (a($$3, $$4)) {
               $$0.a(czv.F, $$1, czv.a.a($$2));
               $$3.e = false;
            } else if (a($$3)) {
               $$3.b = 0;
               $$0.a(czv.E, $$1, czv.a.a($$2));
            }
         }
      }

      ++$$3.c;
   }

   private static boolean a(cvo $$0, cuc $$1) {
      return $$0.c(cnm.a) && $$1.e;
   }

   private static boolean a(cuc $$0, cbo $$1) {
      return $$0.c >= $$0.d + (long)$$1.z();
   }

   private static boolean a(cuc $$0) {
      return $$0.b >= 20;
   }
}
