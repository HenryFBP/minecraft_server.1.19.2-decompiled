import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cbz extends cat {
   private static final Map<bbr<? extends bce>, cbz> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bbr<?> d;

   public cbz(bbr<? extends bce> $$0, int $$1, int $$2, cat.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      if (!($$1 instanceof agg)) {
         return baj.a;
      } else {
         cax $$2 = $$0.n();
         gt $$3 = $$0.a();
         gy $$4 = $$0.k();
         cvo $$5 = $$1.a_($$3);
         if ($$5.a(cju.ce)) {
            cti $$6 = $$1.c_($$3);
            if ($$6 instanceof cun) {
               cfz $$7 = ((cun)$$6).d();
               bbr<?> $$8 = this.a($$2.u());
               $$7.a($$8);
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), czv.c, $$3);
               $$2.g(1);
               return baj.b;
            }
         }

         gt $$9;
         if ($$5.k($$1, $$3).b()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bbr<?> $$11 = this.a($$2.u());
         if ($$11.a((agg)$$1, $$2, $$0.o(), $$9, bcg.m, true, !Objects.equals($$3, $$9) && $$4 == gy.b) != null) {
            $$2.g(1);
            $$1.a($$0.o(), czv.s, $$3);
         }

         return baj.b;
      }
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      dwo $$4 = a($$0, $$1, cgg.b.b);
      if ($$4.c() != dwo.a.b) {
         return bak.c($$3);
      } else if (!($$0 instanceof agg)) {
         return bak.a($$3);
      } else {
         dwm $$5 = (dwm)$$4;
         gt $$6 = $$5.a();
         if (!($$0.a_($$6).b() instanceof cnz)) {
            return bak.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$5.b(), $$3)) {
            bbr<?> $$7 = this.a($$3.u());
            bbn $$8 = $$7.a((agg)$$0, $$3, $$1, $$6, bcg.m, false, false);
            if ($$8 == null) {
               return bak.c($$3);
            } else {
               if (!$$1.fB().d) {
                  $$3.g(1);
               }

               $$1.b(akg.c.b(this));
               $$0.a($$1, czv.s, $$8.cY());
               return bak.b($$3);
            }
         } else {
            return bak.d($$3);
         }
      }
   }

   public boolean a(@Nullable pj $$0, bbr<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cbz a(@Nullable bbr<?> $$0) {
      return (cbz)a.get($$0);
   }

   public static Iterable<cbz> i() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bbr<?> a(@Nullable pj $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         pj $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return (bbr<?>)bbr.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   public Optional<bce> a(buc $$0, bce $$1, bbr<? extends bce> $$2, agg $$3, dwq $$4, cax $$5) {
      if (!this.a($$5.u(), $$2)) {
         return Optional.empty();
      } else {
         bce $$6;
         if ($$1 instanceof bbk) {
            $$6 = ((bbk)$$1).a($$3, (bbk)$$1);
         } else {
            $$6 = $$2.a((cgx)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.y_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               if ($$5.z()) {
                  $$6.b($$5.x());
               }

               if (!$$0.fB().d) {
                  $$5.g(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
