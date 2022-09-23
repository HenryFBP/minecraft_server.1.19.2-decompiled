import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dlf {
   private static final Logger a = LogUtils.getLogger();
   protected static final cvo e = cju.lN.m();
   protected dkt f;
   @Nullable
   private gy b;
   private coh c;
   private cpw d;
   protected int g;
   private final dls h;
   private static final Set<cjt> i = ImmutableSet.builder()
      .add(cju.ev)
      .add(cju.ca)
      .add(cju.cb)
      .add(cju.dd)
      .add(cju.iW)
      .add(cju.ja)
      .add(cju.iZ)
      .add(cju.iX)
      .add(cju.iY)
      .add(cju.cx)
      .add(cju.ee)
      .build();

   protected dlf(dls $$0, int $$1, dkt $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dlf(dls $$0, pj $$1) {
      this(
         $$0,
         $$1.h("GD"),
         (dkt)dkt.a.parse(pu.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : gy.b($$2));
   }

   protected static dkt a(int $$0, int $$1, int $$2, gy $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == gy.a.c
         ? new dkt($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dkt($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static gy a(amn $$0) {
      return gy.c.a.a($$0);
   }

   public final pj a(dlr $$0) {
      pj $$1 = new pj();
      $$1.a("id", hm.bd.b(this.k()).toString());
      dkt.a.encodeStart(pu.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      gy $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dlr var1, pj var2);

   public void a(dlf $$0, dlg $$1, amn $$2) {
   }

   public abstract void a(chp var1, cho var2, cxk var3, amn var4, dkt var5, cge var6, gt var7);

   public dkt f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cge $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public gt h() {
      return new gt(this.f.f());
   }

   protected gt.a b(int $$0, int $$1, int $$2) {
      return new gt.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      gy $$2 = this.i();
      if ($$2 == null) {
         return $$0;
      } else {
         switch($$2) {
            case c:
            case d:
               return this.f.g() + $$0;
            case e:
               return this.f.j() - $$1;
            case f:
               return this.f.g() + $$1;
            default:
               return $$0;
         }
      }
   }

   protected int b(int $$0) {
      return this.i() == null ? $$0 : $$0 + this.f.h();
   }

   protected int b(int $$0, int $$1) {
      gy $$2 = this.i();
      if ($$2 == null) {
         return $$1;
      } else {
         switch($$2) {
            case c:
               return this.f.l() - $$1;
            case d:
               return this.f.i() + $$1;
            case e:
            case f:
               return this.f.i() + $$0;
            default:
               return $$1;
         }
      }
   }

   protected void a(chp $$0, cvo $$1, int $$2, int $$3, int $$4, dkt $$5) {
      gt $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cha)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != coh.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != cpw.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            dpv $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.B($$6).e($$6);
            }

         }
      }
   }

   protected boolean a(cha $$0, int $$1, int $$2, int $$3, dkt $$4) {
      return true;
   }

   protected cvo a(cgd $$0, int $$1, int $$2, int $$3, dkt $$4) {
      gt $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cju.a.m() : $$0.a_($$5);
   }

   protected boolean b(cha $$0, int $$1, int $$2, int $$3, dkt $$4) {
      gt $$5 = this.b($$1, $$2 + 1, $$3);
      if (!$$4.b($$5)) {
         return false;
      } else {
         return $$5.v() < $$0.a(dar.a.c, $$5.u(), $$5.w());
      }
   }

   protected void a(chp $$0, dkt $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for(int $$8 = $$3; $$8 <= $$6; ++$$8) {
         for(int $$9 = $$2; $$9 <= $$5; ++$$9) {
            for(int $$10 = $$4; $$10 <= $$7; ++$$10) {
               this.a($$0, cju.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }

   }

   protected void a(chp $$0, dkt $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, cvo $$8, cvo $$9, boolean $$10) {
      for(int $$11 = $$3; $$11 <= $$6; ++$$11) {
         for(int $$12 = $$2; $$12 <= $$5; ++$$12) {
            for(int $$13 = $$4; $$13 <= $$7; ++$$13) {
               if (!$$10 || !this.a((cgd)$$0, $$12, $$11, $$13, $$1).h()) {
                  if ($$11 != $$3 && $$11 != $$6 && $$12 != $$2 && $$12 != $$5 && $$13 != $$4 && $$13 != $$7) {
                     this.a($$0, $$9, $$12, $$11, $$13, $$1);
                  } else {
                     this.a($$0, $$8, $$12, $$11, $$13, $$1);
                  }
               }
            }
         }
      }

   }

   protected void a(chp $$0, dkt $$1, dkt $$2, cvo $$3, cvo $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(chp $$0, dkt $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, amn $$9, dlf.a $$10) {
      for(int $$11 = $$3; $$11 <= $$6; ++$$11) {
         for(int $$12 = $$2; $$12 <= $$5; ++$$12) {
            for(int $$13 = $$4; $$13 <= $$7; ++$$13) {
               if (!$$8 || !this.a((cgd)$$0, $$12, $$11, $$13, $$1).h()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }

   }

   protected void a(chp $$0, dkt $$1, dkt $$2, boolean $$3, amn $$4, dlf.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(chp $$0, dkt $$1, amn $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, cvo $$10, cvo $$11, boolean $$12, boolean $$13) {
      for(int $$14 = $$5; $$14 <= $$8; ++$$14) {
         for(int $$15 = $$4; $$15 <= $$7; ++$$15) {
            for(int $$16 = $$6; $$16 <= $$9; ++$$16) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cgd)$$0, $$15, $$14, $$16, $$1).h()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
                  if ($$14 != $$5 && $$14 != $$8 && $$15 != $$4 && $$15 != $$7 && $$16 != $$6 && $$16 != $$9) {
                     this.a($$0, $$11, $$15, $$14, $$16, $$1);
                  } else {
                     this.a($$0, $$10, $$15, $$14, $$16, $$1);
                  }
               }
            }
         }
      }

   }

   protected void a(chp $$0, dkt $$1, amn $$2, float $$3, int $$4, int $$5, int $$6, cvo $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }

   }

   protected void a(chp $$0, dkt $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, cvo $$8, boolean $$9) {
      float $$10 = (float)($$5 - $$2 + 1);
      float $$11 = (float)($$6 - $$3 + 1);
      float $$12 = (float)($$7 - $$4 + 1);
      float $$13 = (float)$$2 + $$10 / 2.0F;
      float $$14 = (float)$$4 + $$12 / 2.0F;

      for(int $$15 = $$3; $$15 <= $$6; ++$$15) {
         float $$16 = (float)($$15 - $$3) / $$11;

         for(int $$17 = $$2; $$17 <= $$5; ++$$17) {
            float $$18 = ((float)$$17 - $$13) / ($$10 * 0.5F);

            for(int $$19 = $$4; $$19 <= $$7; ++$$19) {
               float $$20 = ((float)$$19 - $$14) / ($$12 * 0.5F);
               if (!$$9 || !this.a((cgd)$$0, $$17, $$15, $$19, $$1).h()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }

   }

   protected void b(chp $$0, cvo $$1, int $$2, int $$3, int $$4, dkt $$5) {
      gt.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while(this.a($$0.a_($$6)) && $$6.v() > $$0.u_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(gy.a);
         }

      }
   }

   protected boolean a(cvo $$0) {
      return $$0.h() || $$0.d().a() || $$0.a(cju.en) || $$0.a(cju.bj) || $$0.a(cju.bk);
   }

   protected boolean a(chp $$0, dkt $$1, amn $$2, int $$3, int $$4, int $$5, abb $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static cvo a(cgd $$0, gt $$1, cvo $$2) {
      gy $$3 = null;

      for(gy $$4 : gy.c.a) {
         gt $$5 = $$1.a($$4);
         cvo $$6 = $$0.a_($$5);
         if ($$6.a(cju.cg)) {
            return $$2;
         }

         if ($$6.i($$0, $$5)) {
            if ($$3 != null) {
               $$3 = null;
               break;
            }

            $$3 = $$4;
         }
      }

      if ($$3 != null) {
         return $$2.a(cnf.aD, $$3.g());
      } else {
         gy $$7 = $$2.c(cnf.aD);
         gt $$8 = $$1.a($$7);
         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.h();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         return $$2.a(cnf.aD, $$7);
      }
   }

   protected boolean a(chm $$0, dkt $$1, amn $$2, gt $$3, abb $$4, @Nullable cvo $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cju.cg)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cju.cg.m());
         }

         $$0.a($$3, $$5, 2);
         cti $$6 = $$0.c_($$3);
         if ($$6 instanceof ctn) {
            ((ctn)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(chp $$0, dkt $$1, amn $$2, int $$3, int $$4, int $$5, gy $$6, abb $$7) {
      gt $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cju.aH)) {
         this.a($$0, cju.aH.m().a(clo.a, $$6), $$3, $$4, $$5, $$1);
         cti $$9 = $$0.c_($$8);
         if ($$9 instanceof ctu) {
            ((ctu)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dkt a(Stream<dlf> $$0) {
      return (dkt)dkt.b($$0.map(dlf::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dlf a(List<dlf> $$0, dkt $$1) {
      for(dlf $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public gy i() {
      return this.b;
   }

   public void a(@Nullable gy $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = cpw.a;
         this.c = coh.a;
      } else {
         switch($$0) {
            case d:
               this.c = coh.b;
               this.d = cpw.a;
               break;
            case e:
               this.c = coh.b;
               this.d = cpw.b;
               break;
            case f:
               this.c = coh.a;
               this.d = cpw.b;
               break;
            default:
               this.c = coh.a;
               this.d = cpw.a;
         }
      }

   }

   public cpw a() {
      return this.d;
   }

   public coh j() {
      return this.c;
   }

   public dls k() {
      return this.h;
   }

   public abstract static class a {
      protected cvo a = cju.a.m();

      public abstract void a(amn var1, int var2, int var3, int var4, boolean var5);

      public cvo a() {
         return this.a;
      }
   }
}
