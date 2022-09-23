import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Map;

public class ckg extends cil {
   public static final cwf c = cil.b;
   protected static final float d = 1.0F;
   protected static final dxj e = cjt.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final dxj f = cjt.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final dxj g = dxg.a(e, f);
   private static final Map<cjt, ckg> h = Maps.newHashMap();
   private static final Iterable<dwq> i = ImmutableList.of(new dwq(0.5, 1.0, 0.5));

   protected ckg(cjt $$0, cvn.c $$1) {
      super($$1);
      this.k(this.D.b().a(c, Boolean.valueOf(false)));
      h.put($$0, this);
   }

   @Override
   protected Iterable<dwq> a(cvo $$0) {
      return i;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return g;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      if ($$6.a(caz.mO) || $$6.a(caz.rW)) {
         return baj.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(c)) {
         a($$3, $$0, $$1, $$2);
         return baj.a($$1.y);
      } else {
         baj $$7 = ckd.a($$1, $$2, cju.dq.m(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(dwm $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(c);
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(cju.dq);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == gy.a && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return $$1.a_($$2.c()).d().b();
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return ckd.c;
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   public static cvo a(cjt $$0) {
      return ((ckg)h.get($$0)).m();
   }

   public static boolean g(cvo $$0) {
      return $$0.a(akl.bb, $$1 -> $$1.b(c) && !$$0.c(c));
   }
}
