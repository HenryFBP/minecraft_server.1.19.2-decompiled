import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bzh extends cat implements cco {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public bzh(cat.a $$0) {
      super($$0);
   }

   public static boolean d(cax $$0) {
      pj $$1 = $$0.u();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<aba<cgx>> c(pj $$0) {
      return cgx.d.parse(pu.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static hb a(pj $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<aba<cgx>> $$3 = c($$0);
         if ($$3.isPresent()) {
            gt $$4 = pv.b($$0.p("LodestonePos"));
            return hb.a((aba<cgx>)$$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static hb a(cgx $$0) {
      return $$0.q_().j() ? hb.a($$0.ab(), $$0.Q()) : null;
   }

   @Override
   public boolean i(cax $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cax $$0, cgx $$1, bbn $$2, int $$3, boolean $$4) {
      if (!$$1.y) {
         if (d($$0)) {
            pj $$5 = $$0.v();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<aba<cgx>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ab() && $$5.e("LodestonePos")) {
               gt $$7 = pv.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((agg)$$1).x().a(bmw.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }

      }
   }

   @Override
   public baj a(ccz $$0) {
      gt $$1 = $$0.a();
      cgx $$2 = $$0.q();
      if (!$$2.a_($$1).a(cju.ob)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, ajw.kN, ajx.h, 1.0F, 1.0F);
         buc $$3 = $$0.o();
         cax $$4 = $$0.n();
         boolean $$5 = !$$3.fB().d && $$4.K() == 1;
         if ($$5) {
            this.a($$2.ab(), $$1, $$4.v());
         } else {
            cax $$6 = new cax(caz.pb, 1);
            pj $$7 = $$4.t() ? $$4.u().g() : new pj();
            $$6.c($$7);
            if (!$$3.fB().d) {
               $$4.g(1);
            }

            this.a($$2.ab(), $$1, $$7);
            if (!$$3.fA().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return baj.a($$2.y);
      }
   }

   private void a(aba<cgx> $$0, gt $$1, pj $$2) {
      $$2.a("LodestonePos", (qc)pv.a($$1));
      cgx.d.encodeStart(pu.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cax $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
