import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cbo extends cat {
   private static final Map<ajv, cbo> a = Maps.newHashMap();
   private final int b;
   private final ajv c;
   private final int d;

   protected cbo(int $$0, ajv $$1, cat.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      if ($$3.a(cju.dc) && !$$3.c(cnm.a)) {
         cax $$4 = $$0.n();
         if (!$$1.y) {
            ((cnm)cju.dc).a($$0.o(), $$1, $$2, $$3, $$4);
            $$1.a(null, 1010, $$2, cat.a(this));
            $$4.g(1);
            buc $$5 = $$0.o();
            if ($$5 != null) {
               $$5.a(akg.al);
            }
         }

         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   public int i() {
      return this.b;
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      $$2.add(this.j().a(p.h));
   }

   public sb j() {
      return rq.c(this.a() + ".desc");
   }

   @Nullable
   public static cbo a(ajv $$0) {
      return (cbo)a.get($$0);
   }

   public ajv y() {
      return this.c;
   }

   public int z() {
      return this.d;
   }
}
