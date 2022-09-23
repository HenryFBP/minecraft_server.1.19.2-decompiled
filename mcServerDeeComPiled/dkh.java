import java.util.Optional;

public class dkh extends dbn {
   private final chp a;
   private final cxk b;
   private final Optional<dkg> c;

   public dkh(chp $$0, cxk $$1, Optional<dkg> $$2) {
      super($$1, $$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public int a(dar.a $$0, int $$1, int $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public cxi a(cge $$0, dan.a $$1) {
      return ((cyc)this.a.a($$0.e, $$0.f)).b($$1);
   }

   public cvo a(gt $$0) {
      return this.a.a_($$0);
   }

   public int c() {
      return this.a.u_();
   }

   public chp d() {
      return this.a;
   }

   public Optional<dkg> e() {
      return this.c;
   }

   public cxk f() {
      return this.b;
   }
}
