import java.util.List;
import javax.annotation.Nullable;

public class cbt extends cat {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cbt(cat.a $$0) {
      super($$0);
      clo.a(this, byo.a);
   }

   @Override
   public String j(cax $$0) {
      return byx.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      byu.a($$0, $$2);
   }

   @Override
   public ccn c(cax $$0) {
      return ccn.d;
   }

   @Override
   public int b(cax $$0) {
      return 72000;
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      $$1.c($$2);
      return bak.b($$3);
   }

   @Override
   public boolean a(cax $$0, cax $$1) {
      return $$1.a(aks.b) || super.a($$0, $$1);
   }

   public static bzq d(cax $$0) {
      pj $$1 = byx.a($$0);
      return $$1 != null ? bzq.a($$1.h("Base")) : bzq.a;
   }
}
