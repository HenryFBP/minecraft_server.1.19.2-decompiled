import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class byx extends cat {
   private static final String b = "BlockEntityTag";
   public static final String a = "BlockStateTag";
   @Deprecated
   private final cjt c;

   public byx(cjt $$0, cat.a $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public baj a(ccz $$0) {
      baj $$1 = this.a(new ccx($$0));
      if (!$$1.a() && this.v()) {
         baj $$2 = this.a($$0.q(), $$0.o(), $$0.p()).a();
         return $$2 == baj.b ? baj.c : $$2;
      } else {
         return $$1;
      }
   }

   public baj a(ccx $$0) {
      if (!$$0.b()) {
         return baj.e;
      } else {
         ccx $$1 = this.b($$0);
         if ($$1 == null) {
            return baj.e;
         } else {
            cvo $$2 = this.c($$1);
            if ($$2 == null) {
               return baj.e;
            } else if (!this.a($$1, $$2)) {
               return baj.e;
            } else {
               gt $$3 = $$1.a();
               cgx $$4 = $$1.q();
               buc $$5 = $$1.o();
               cax $$6 = $$1.n();
               cvo $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof agh) {
                     aj.y.a((agh)$$5, $$3, $$6);
                  }
               }

               cqw $$8 = $$7.r();
               $$4.a($$5, $$3, this.a($$7), ajx.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(czv.i, $$3, czv.a.a($$5, $$7));
               if ($$5 == null || !$$5.fB().d) {
                  $$6.g(1);
               }

               return baj.a($$4.y);
            }
         }
      }
   }

   protected ajv a(cvo $$0) {
      return $$0.r().e();
   }

   @Nullable
   public ccx b(ccx $$0) {
      return $$0;
   }

   protected boolean a(gt $$0, cgx $$1, @Nullable buc $$2, cax $$3, cvo $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected cvo c(ccx $$0) {
      cvo $$1 = this.e().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private cvo a(gt $$0, cgx $$1, cax $$2, cvo $$3) {
      cvo $$4 = $$3;
      pj $$5 = $$2.u();
      if ($$5 != null) {
         pj $$6 = $$5.p("BlockStateTag");
         cvp<cjt, cvo> $$7 = $$3.b().k();

         for(String $$8 : $$6.d()) {
            cwr<?> $$9 = $$7.a($$8);
            if ($$9 != null) {
               String $$10 = $$6.c($$8).e_();
               $$4 = a($$4, $$9, $$10);
            }
         }
      }

      if ($$4 != $$3) {
         $$1.a($$0, $$4, 2);
      }

      return $$4;
   }

   private static <T extends Comparable<T>> cvo a(cvo $$0, cwr<T> $$1, String $$2) {
      return (cvo)$$1.b($$2).map($$2x -> $$0.a($$1, $$2x)).orElse($$0);
   }

   protected boolean b(ccx $$0, cvo $$1) {
      buc $$2 = $$0.o();
      dwv $$3 = $$2 == null ? dwv.a() : dwv.a($$2);
      return (!this.d() || $$1.a((cha)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean d() {
      return true;
   }

   protected boolean a(ccx $$0, cvo $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(cgx $$0, @Nullable buc $$1, gt $$2, cax $$3) {
      MinecraftServer $$4 = $$0.n();
      if ($$4 == null) {
         return false;
      } else {
         pj $$5 = a($$3);
         if ($$5 != null) {
            cti $$6 = $$0.c_($$2);
            if ($$6 != null) {
               if (!$$0.y && $$6.u() && ($$1 == null || !$$1.fY())) {
                  return false;
               }

               pj $$7 = $$6.o();
               pj $$8 = $$7.g();
               $$7.a($$5);
               if (!$$7.equals($$8)) {
                  $$6.a($$7);
                  $$6.e();
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public String a() {
      return this.e().g();
   }

   @Override
   public void a(bzj $$0, hi<cax> $$1) {
      if (this.a($$0)) {
         this.e().a($$0, $$1);
      }

   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e().a($$0, $$1, $$2, $$3);
   }

   public cjt e() {
      return this.c;
   }

   public void a(Map<cjt, cat> $$0, cat $$1) {
      $$0.put(this.e(), $$1);
   }

   @Override
   public boolean S_() {
      return !(this.c instanceof cqj);
   }

   @Override
   public void a(bqv $$0) {
      if (this.c instanceof cqj) {
         cax $$1 = $$0.i();
         pj $$2 = a($$1);
         if ($$2 != null && $$2.b("Items", 9)) {
            pp $$3 = $$2.c("Items", 10);
            cay.a($$0, $$3.stream().map(pj.class::cast).map(cax::a));
         }
      }

   }

   @Nullable
   public static pj a(cax $$0) {
      return $$0.b("BlockEntityTag");
   }

   public static void a(cax $$0, ctk<?> $$1, pj $$2) {
      if ($$2.f()) {
         $$0.c("BlockEntityTag");
      } else {
         cti.a($$2, $$1);
         $$0.a("BlockEntityTag", $$2);
      }

   }
}
