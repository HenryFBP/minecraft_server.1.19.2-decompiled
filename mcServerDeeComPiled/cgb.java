import com.google.common.collect.AbstractIterator;
import javax.annotation.Nullable;

public class cgb extends AbstractIterator<dxj> {
   private final dwl a;
   private final dwv b;
   private final gw c;
   private final gt.a d;
   private final dxj e;
   private final cgh f;
   private final boolean g;
   @Nullable
   private cgd h;
   private long i;

   public cgb(cgh $$0, @Nullable bbn $$1, dwl $$2) {
      this($$0, $$1, $$2, false);
   }

   public cgb(cgh $$0, @Nullable bbn $$1, dwl $$2, boolean $$3) {
      this.b = $$1 == null ? dwv.a() : dwv.a($$1);
      this.d = new gt.a();
      this.e = dxg.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      int $$4 = ami.b($$2.a - 1.0E-7) - 1;
      int $$5 = ami.b($$2.d + 1.0E-7) + 1;
      int $$6 = ami.b($$2.b - 1.0E-7) - 1;
      int $$7 = ami.b($$2.e + 1.0E-7) + 1;
      int $$8 = ami.b($$2.c - 1.0E-7) - 1;
      int $$9 = ami.b($$2.f + 1.0E-7) + 1;
      this.c = new gw($$4, $$6, $$8, $$5, $$7, $$9);
   }

   @Nullable
   private cgd a(int $$0, int $$1) {
      int $$2 = hq.a($$0);
      int $$3 = hq.a($$1);
      long $$4 = cge.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cgd $$5 = this.f.c($$2, $$3);
         this.h = $$5;
         this.i = $$4;
         return $$5;
      }
   }

   protected dxj a() {
      while(this.c.a()) {
         int $$0 = this.c.b();
         int $$1 = this.c.c();
         int $$2 = this.c.d();
         int $$3 = this.c.e();
         if ($$3 != 3) {
            cgd $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               cvo $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.e()) && ($$3 != 2 || $$5.a(cju.bD))) {
                  dxj $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == dxg.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return $$6.a((double)$$0, (double)$$1, (double)$$2);
                     }
                  } else {
                     dxj $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (dxg.c($$7, this.e, dwu.i)) {
                        return $$7;
                     }
                  }
               }
            }
         }
      }

      return (dxj)this.endOfData();
   }
}
