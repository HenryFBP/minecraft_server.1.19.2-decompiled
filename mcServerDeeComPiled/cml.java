import com.google.common.collect.Maps;
import java.util.Map;

public class cml extends cjt {
   private static final Map<cjt, cjt> c = Maps.newHashMap();
   public static final float a = 3.0F;
   protected static final dxj b = cjt.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cjt d;

   public cml(cjt $$0, cvn.c $$1) {
      super($$1);
      this.d = $$0;
      c.put($$0, this);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      cat $$7 = $$6.c();
      cvo $$8 = ($$7 instanceof byx ? (cjt)c.getOrDefault(((byx)$$7).e(), cju.a) : cju.a).m();
      boolean $$9 = $$8.a(cju.a);
      boolean $$10 = this.q();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(akg.ah);
            if (!$$3.fB().d) {
               $$6.g(1);
            }
         } else {
            cax $$11 = new cax(this.d);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.j($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cju.eY.m(), 3);
         }

         $$1.a($$3, czv.c, $$2);
         return baj.a($$1.y);
      } else {
         return baj.b;
      }
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cax(this.d);
   }

   private boolean q() {
      return this.d == cju.a;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == gy.a && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cjt b() {
      return this.d;
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
