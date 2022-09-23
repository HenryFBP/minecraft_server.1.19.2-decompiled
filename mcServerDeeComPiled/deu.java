import com.mojang.serialization.Codec;

public class deu extends ddt<dgl> {
   public deu(Codec<dgl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgl> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      dgl $$3 = $$0.f();

      for(dgf.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
