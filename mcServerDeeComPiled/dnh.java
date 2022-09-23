import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class dnh extends dll {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final dnh.b l;
   private final dnh.a m;

   public dnh(dou $$0, gt $$1, dnh.b $$2, dnh.a $$3, abb $$4, dot $$5, cpw $$6, coh $$7, gt $$8) {
      super(dls.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public dnh(dou $$0, pj $$1) {
      super(dls.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = dnh.b.a($$1.l("VerticalPlacement"));
      this.m = (dnh.a)dnh.a.a.parse(new Dynamic(pu.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dlr $$0, pj $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      dnh.a.a.encodeStart(pu.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static dop a(dou $$0, pj $$1, abb $$2) {
      dot $$3 = $$0.a($$2);
      gt $$4 = new gt($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         coh.valueOf($$1.l("Mirror")),
         cpw.valueOf($$1.l("Rotation")),
         dnh.b.a($$1.l("VerticalPlacement")),
         $$4,
         (dnh.a)dnh.a.a.parse(new Dynamic(pu.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static dop a(coh $$0, cpw $$1, dnh.b $$2, gt $$3, dnh.a $$4) {
      dnw $$5 = $$4.d ? dnw.b : dnw.d;
      List<doi> $$6 = Lists.newArrayList();
      $$6.add(a(cju.bT, 0.3F, cju.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cju.df, 0.07F, cju.jv));
      }

      dop $$7 = new dop().a($$1).a($$0).a($$3).a($$5).a(new dom($$6)).a(new dnv($$4.c)).a(new doj(akl.bw)).a(new doc());
      if ($$4.g) {
         $$7.a(dnu.b);
      }

      return $$7;
   }

   private static doi a(dnh.b $$0, dnh.a $$1) {
      if ($$0 == dnh.b.c) {
         return a(cju.D, cju.jv);
      } else {
         return $$1.b ? a(cju.D, cju.df) : a(cju.D, 0.2F, cju.jv);
      }
   }

   @Override
   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
      dkt $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.f())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            gt.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cgy)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }

            });
         }

      }
   }

   @Override
   protected void a(String $$0, gt $$1, chm $$2, amn $$3, dkt $$4) {
   }

   private void a(amn $$0, cgy $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2);
      if (!$$3.h() && !$$3.a(cju.em)) {
         gy $$4 = a($$0);
         gt $$5 = $$2.a($$4);
         cvo $$6 = $$1.a_($$5);
         if ($$6.h()) {
            if (cjt.a($$3.k($$1, $$2), $$4)) {
               cwf $$7 = csc.a($$4.g());
               $$1.a($$5, cju.em.m().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(amn $$0, cgy $$1, gt $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cju.df) && $$1.a_($$2.b()).h()) {
         $$1.a($$2.b(), cju.av.m().a(cnt.c, Boolean.valueOf(true)), 3);
      }

   }

   private void a(amn $$0, cgy $$1) {
      for(int $$2 = this.f.g() + 1; $$2 < this.f.j(); ++$$2) {
         for(int $$3 = this.f.i() + 1; $$3 < this.f.l(); ++$$3) {
            gt $$4 = new gt($$2, this.f.h(), $$3);
            if ($$1.a_($$4).a(cju.df)) {
               this.c($$0, $$1, $$4.c());
            }
         }
      }

   }

   private void c(amn $$0, cgy $$1, gt $$2) {
      gt.a $$3 = $$2.i();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(gy.a);
         --$$4;
         this.d($$0, $$1, $$3);
      }

   }

   private void b(amn $$0, cgy $$1) {
      boolean $$2 = this.l == dnh.b.a || this.l == dnh.b.c;
      gt $$3 = this.f.f();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.c() + this.f.e()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      gt.a $$11 = gt.b.i();

      for(int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; ++$$12) {
         for(int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; ++$$13) {
            int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
            int $$15 = Math.max(0, $$14 + $$9);
            if ($$15 < $$7) {
               float $$16 = $$6[$$15];
               if ($$0.j() < (double)$$16) {
                  int $$17 = a($$1, $$12, $$13, this.l);
                  int $$18 = $$2 ? $$17 : Math.min(this.f.h(), $$17);
                  $$11.d($$12, $$18, $$13);
                  if (Math.abs($$18 - this.f.h()) <= 3 && this.a($$1, $$11)) {
                     this.d($$0, $$1, $$11);
                     if (this.m.e) {
                        this.b($$0, $$1, $$11);
                     }

                     this.c($$0, $$1, $$11.c());
                  }
               }
            }
         }
      }

   }

   private boolean a(cgy $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      return !$$2.a(cju.a) && !$$2.a(cju.bZ) && !$$2.a(akl.bw) && (this.l == dnh.b.f || !$$2.a(cju.D));
   }

   private void d(amn $$0, cgy $$1, gt $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cju.jv.m(), 3);
      } else {
         $$1.a($$2, cju.df.m(), 3);
      }

   }

   private static int a(cgy $$0, int $$1, int $$2, dnh.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dar.a a(dnh.b $$0) {
      return $$0 == dnh.b.c ? dar.a.c : dar.a.a;
   }

   private static doi a(cjt $$0, float $$1, cjt $$2) {
      return new doi(new dok($$0, $$1), dns.b, $$2.m());
   }

   private static doi a(cjt $$0, cjt $$1) {
      return new doi(new dnx($$0), dns.b, $$1.m());
   }

   public static class a {
      public static final Codec<dnh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dnh.a::new)
      );
      public boolean b;
      public float c;
      public boolean d;
      public boolean e;
      public boolean f;
      public boolean g;

      public a() {
      }

      public a(boolean $$0, float $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }
   }

   public static enum b implements amw {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final amw.a<dnh.b> g = amw.a(dnh.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static dnh.b a(String $$0) {
         return (dnh.b)g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
