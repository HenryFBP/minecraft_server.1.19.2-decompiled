import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cdl extends cdi {
   private static final cdm a = cdm.a(caz.rW, caz.nP, caz.qq, caz.si, caz.sj, caz.sm, caz.sk, caz.sn, caz.sl);
   private static final cdm b = cdm.a(caz.mU);
   private static final cdm c = cdm.a(caz.ph);
   private static final Map<cat, caf.a> d = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(caz.rW, caf.a.b);
      $$0.put(caz.nP, caf.a.e);
      $$0.put(caz.qq, caf.a.c);
      $$0.put(caz.si, caf.a.d);
      $$0.put(caz.sj, caf.a.d);
      $$0.put(caz.sm, caf.a.d);
      $$0.put(caz.sk, caf.a.d);
      $$0.put(caz.sn, caf.a.d);
      $$0.put(caz.sl, caf.a.d);
   });
   private static final cdm e = cdm.a(caz.nQ);

   public cdl(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for(int $$7 = 0; $$7 < $$0.b(); ++$$7) {
         cax $$8 = $$0.a($$7);
         if (!$$8.b()) {
            if (a.a($$8)) {
               if ($$4) {
                  return false;
               }

               $$4 = true;
            } else if (c.a($$8)) {
               if ($$6) {
                  return false;
               }

               $$6 = true;
            } else if (b.a($$8)) {
               if ($$5) {
                  return false;
               }

               $$5 = true;
            } else if (e.a($$8)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else {
               if (!($$8.c() instanceof bzr)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cax a(bxa $$0) {
      cax $$1 = new cax(caz.sr);
      pj $$2 = $$1.a("Explosion");
      caf.a $$3 = caf.a.a;
      List<Integer> $$4 = Lists.newArrayList();

      for(int $$5 = 0; $$5 < $$0.b(); ++$$5) {
         cax $$6 = $$0.a($$5);
         if (!$$6.b()) {
            if (a.a($$6)) {
               $$3 = (caf.a)d.get($$6.c());
            } else if (c.a($$6)) {
               $$2.a("Flicker", true);
            } else if (b.a($$6)) {
               $$2.a("Trail", true);
            } else if ($$6.c() instanceof bzr) {
               $$4.add(((bzr)$$6.c()).d().f());
            }
         }
      }

      $$2.b("Colors", $$4);
      $$2.a("Type", (byte)$$3.a());
      return $$1;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cax c() {
      return new cax(caz.sr);
   }

   @Override
   public cdr<?> U_() {
      return cdr.h;
   }
}
