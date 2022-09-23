import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class dde extends ddt<dge> {
   public dde(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      amn $$1 = $$0.d();
      chp $$2 = $$0.b();
      cge $$3 = new cge($$0.e());
      IntArrayList $$4 = ad.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ad.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      gt.a $$6 = new gt.a();
      IntListIterator var8 = $$4.iterator();

      while(var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while(var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            gt $$9 = $$2.a(dar.a.f, $$6);
            if ($$2.x($$9) || $$2.a_($$9).k($$2, $$9).b()) {
               $$2.a($$9, cju.cg.m(), 2);
               cuf.a($$2, $$1, $$9, dry.b);
               cvo $$10 = cju.ca.m();

               for(gy $$11 : gy.c.a) {
                  gt $$12 = $$9.a($$11);
                  if ($$10.a($$2, $$12)) {
                     $$2.a($$12, $$10, 2);
                  }
               }

               return true;
            }
         }
      }

      return false;
   }
}
