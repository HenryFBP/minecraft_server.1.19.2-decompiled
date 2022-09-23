import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface hu {
   Map<cat, hu> a = a();
   Map<cat, hu> b = a();
   Map<cat, hu> c = a();
   Map<cat, hu> d = a();
   hu e = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cju.eB.m().a(cns.e, Integer.valueOf(3)), ajw.ca);
   hu f = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cju.eC.m(), ajw.cd);
   hu g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cju.eD.m().a(cns.e, Integer.valueOf(3)), ajw.ce);
   hu h = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cjt $$6 = cjt.a($$5.c());
      if (!($$6 instanceof cqj)) {
         return baj.d;
      } else {
         if (!$$1.y) {
            cax $$7 = new cax(cju.jB);
            if ($$5.t()) {
               $$7.c($$5.u().g());
            }

            $$3.a($$4, $$7);
            $$3.a(akg.Z);
            cns.e($$0, $$1, $$2);
         }

         return baj.a($$1.y);
      }
   };
   hu i = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (csy.c($$5) <= 0) {
         return baj.d;
      } else {
         if (!$$1.y) {
            cax $$6 = $$5.o();
            $$6.e(1);
            csy.d($$6);
            if (!$$3.fB().d) {
               $$5.g(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fA().e($$6)) {
               $$3.bT.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(akg.Y);
            cns.e($$0, $$1, $$2);
         }

         return baj.a($$1.y);
      }
   };
   hu j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cat $$6 = $$5.c();
      if (!($$6 instanceof bzu)) {
         return baj.d;
      } else {
         bzu $$7 = (bzu)$$6;
         if (!$$7.a($$5)) {
            return baj.d;
         } else {
            if (!$$1.y) {
               $$7.e_($$5);
               $$3.a(akg.X);
               cns.e($$0, $$1, $$2);
            }

            return baj.a($$1.y);
         }
      }
   };

   static Object2ObjectOpenHashMap<cat, hu> a() {
      return ad.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue((hu)($$0x, $$1, $$2, $$3, $$4, $$5) -> baj.d));
   }

   baj interact(cvo var1, cgx var2, gt var3, buc var4, bai var5, cax var6);

   static void b() {
      a(a);
      a.put(caz.qs, (hu)($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (ccu.d($$5) != ccv.b) {
            return baj.d;
         } else {
            if (!$$1.y) {
               cat $$6 = $$5.c();
               $$3.a($$4, cay.a($$5, $$3, new cax(caz.qt)));
               $$3.a(akg.W);
               $$3.b(akg.c.b($$6));
               $$1.b($$2, cju.eB.m());
               $$1.a(null, $$2, ajw.bR, ajx.e, 1.0F, 1.0F);
               $$1.a(null, czv.z, $$2);
            }

            return baj.a($$1.y);
         }
      });
      a(b);
      b.put(caz.oH, (hu)($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cax(caz.oI), $$0x -> $$0x.c(cns.e) == 3, ajw.cg));
      b.put(caz.qt, (hu)($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (!$$1.y) {
            cat $$6 = $$5.c();
            $$3.a($$4, cay.a($$5, $$3, ccu.a(new cax(caz.qs), ccv.b)));
            $$3.a(akg.W);
            $$3.b(akg.c.b($$6));
            cns.e($$0, $$1, $$2);
            $$1.a(null, $$2, ajw.bS, ajx.e, 1.0F, 1.0F);
            $$1.a(null, czv.y, $$2);
         }

         return baj.a($$1.y);
      });
      b.put(caz.qs, (hu)($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if ($$0.c(cns.e) != 3 && ccu.d($$5) == ccv.b) {
            if (!$$1.y) {
               $$3.a($$4, cay.a($$5, $$3, new cax(caz.qt)));
               $$3.a(akg.W);
               $$3.b(akg.c.b($$5.c()));
               $$1.b($$2, $$0.a(cns.e));
               $$1.a(null, $$2, ajw.bR, ajx.e, 1.0F, 1.0F);
               $$1.a(null, czv.z, $$2);
            }

            return baj.a($$1.y);
         } else {
            return baj.d;
         }
      });
      b.put(caz.nX, j);
      b.put(caz.nW, j);
      b.put(caz.nV, j);
      b.put(caz.nU, j);
      b.put(caz.sF, j);
      b.put(caz.sL, i);
      b.put(caz.sS, i);
      b.put(caz.ta, i);
      b.put(caz.sW, i);
      b.put(caz.sX, i);
      b.put(caz.sU, i);
      b.put(caz.sY, i);
      b.put(caz.sO, i);
      b.put(caz.sT, i);
      b.put(caz.sQ, i);
      b.put(caz.sN, i);
      b.put(caz.sM, i);
      b.put(caz.sR, i);
      b.put(caz.sV, i);
      b.put(caz.sZ, i);
      b.put(caz.sP, i);
      b.put(caz.ih, h);
      b.put(caz.io, h);
      b.put(caz.iw, h);
      b.put(caz.is, h);
      b.put(caz.it, h);
      b.put(caz.iq, h);
      b.put(caz.iu, h);
      b.put(caz.ik, h);
      b.put(caz.ip, h);
      b.put(caz.im, h);
      b.put(caz.ij, h);
      b.put(caz.ii, h);
      b.put(caz.in, h);
      b.put(caz.ir, h);
      b.put(caz.iv, h);
      b.put(caz.il, h);
      c.put(caz.oH, (hu)($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cax(caz.oJ), $$0x -> true, ajw.cj));
      a(c);
      d.put(caz.oH, (hu)($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cax(caz.oK), $$0x -> $$0x.c(cns.e) == 3, ajw.ck));
      a(d);
   }

   static void a(Map<cat, hu> $$0) {
      $$0.put(caz.oJ, f);
      $$0.put(caz.oI, e);
      $$0.put(caz.oK, g);
   }

   static baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, cax $$5, cax $$6, Predicate<cvo> $$7, ajv $$8) {
      if (!$$7.test($$0)) {
         return baj.d;
      } else {
         if (!$$1.y) {
            cat $$9 = $$5.c();
            $$3.a($$4, cay.a($$5, $$3, $$6));
            $$3.a(akg.W);
            $$3.b(akg.c.b($$9));
            $$1.b($$2, cju.eA.m());
            $$1.a(null, $$2, $$8, ajx.e, 1.0F, 1.0F);
            $$1.a(null, czv.y, $$2);
         }

         return baj.a($$1.y);
      }
   }

   static baj a(cgx $$0, gt $$1, buc $$2, bai $$3, cax $$4, cvo $$5, ajv $$6) {
      if (!$$0.y) {
         cat $$7 = $$4.c();
         $$2.a($$3, cay.a($$4, $$2, new cax(caz.oH)));
         $$2.a(akg.V);
         $$2.b(akg.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, ajx.e, 1.0F, 1.0F);
         $$0.a(null, czv.z, $$1);
      }

      return baj.a($$0.y);
   }
}
