import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dnv extends doq {
   public static final Codec<dnv> a = Codec.FLOAT.fieldOf("mossiness").xmap(dnv::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final cvo[] e = new cvo[]{cju.iy.m(), cju.iF.m()};
   private final float f;

   public dnv(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      amn $$6 = $$5.b($$4.a);
      cvo $$7 = $$4.b;
      gt $$8 = $$4.a;
      cvo $$9 = null;
      if ($$7.a(cju.dP) || $$7.a(cju.b) || $$7.a(cju.dS)) {
         $$9 = this.a($$6);
      } else if ($$7.a(akl.F)) {
         $$9 = this.a($$6, $$4.b);
      } else if ($$7.a(akl.G)) {
         $$9 = this.b($$6);
      } else if ($$7.a(akl.H)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cju.bZ)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dot.c($$8, $$9, $$4.c) : $$4;
   }

   @Nullable
   private cvo a(amn $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         cvo[] $$1 = new cvo[]{cju.dR.m(), a($$0, cju.eq)};
         cvo[] $$2 = new cvo[]{cju.dQ.m(), a($$0, cju.lR)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private cvo a(amn $$0, cvo $$1) {
      gy $$2 = $$1.c(crd.a);
      cwn $$3 = $$1.c(crd.b);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         cvo[] $$4 = new cvo[]{cju.lR.m().a(crd.a, $$2).a(crd.b, $$3), cju.mf.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private cvo b(amn $$0) {
      return $$0.i() < this.f ? cju.mf.m() : null;
   }

   @Nullable
   private cvo c(amn $$0) {
      return $$0.i() < this.f ? cju.mt.m() : null;
   }

   @Nullable
   private cvo d(amn $$0) {
      return $$0.i() < 0.15F ? cju.nV.m() : null;
   }

   private static cvo a(amn $$0, cjt $$1) {
      return $$1.m().a(crd.a, gy.c.a.a($$0)).a(crd.b, cwn.values()[$$0.a(cwn.values().length)]);
   }

   private cvo a(amn $$0, cvo[] $$1, cvo[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static cvo a(amn $$0, cvo[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dos<?> a() {
      return dos.g;
   }
}
