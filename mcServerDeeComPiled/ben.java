import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;

public class ben extends bdo<bcc> {
   private static final int a = 20;
   private static final double d = 2.0;
   private static final double e = 2.0;
   @Nullable
   private dqj f;
   private int g;

   public ben() {
      super(ImmutableMap.of(bku.t, bkv.a, bku.v, bkv.c));
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      dql $$2 = (dql)$$1.dy().c(bku.t).get();
      if (!$$2.b() && !$$2.c()) {
         if (!Objects.equals(this.f, $$2.h())) {
            this.g = 20;
            return true;
         } else {
            if (this.g > 0) {
               --this.g;
            }

            return this.g == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      dql $$3 = (dql)$$1.dy().c(bku.t).get();
      this.f = $$3.h();
      dqj $$4 = $$3.i();
      dqj $$5 = $$3.h();
      gt $$6 = $$4.a();
      cvo $$7 = $$0.a_($$6);
      if ($$7.a(akl.g, $$0x -> $$0x.b() instanceof clp)) {
         clp $$8 = (clp)$$7.b();
         if (!$$8.h($$7)) {
            $$8.a($$1, $$0, $$7, $$6, true);
         }

         this.c($$0, $$1, $$6);
      }

      gt $$9 = $$5.a();
      cvo $$10 = $$0.a_($$9);
      if ($$10.a(akl.g, $$0x -> $$0x.b() instanceof clp)) {
         clp $$11 = (clp)$$10.b();
         if (!$$11.h($$10)) {
            $$11.a($$1, $$0, $$10, $$9, true);
            this.c($$0, $$1, $$9);
         }
      }

      a($$0, $$1, $$4, $$5);
   }

   public static void a(agg $$0, bcc $$1, @Nullable dqj $$2, @Nullable dqj $$3) {
      bcx<?> $$4 = $$1.dy();
      if ($$4.a(bku.v)) {
         Iterator<hb> $$5 = ((Set)$$4.c(bku.v).get()).iterator();

         while($$5.hasNext()) {
            hb $$6 = (hb)$$5.next();
            gt $$7 = $$6.b();
            if (($$2 == null || !$$2.a().equals($$7)) && ($$3 == null || !$$3.a().equals($$7))) {
               if (a($$0, $$1, $$6)) {
                  $$5.remove();
               } else {
                  cvo $$8 = $$0.a_($$7);
                  if (!$$8.a(akl.g, $$0x -> $$0x.b() instanceof clp)) {
                     $$5.remove();
                  } else {
                     clp $$9 = (clp)$$8.b();
                     if (!$$9.h($$8)) {
                        $$5.remove();
                     } else if (a($$0, $$1, $$7)) {
                        $$5.remove();
                     } else {
                        $$9.a($$1, $$0, $$8, $$7, false);
                        $$5.remove();
                     }
                  }
               }
            }
         }
      }

   }

   private static boolean a(agg $$0, bcc $$1, gt $$2) {
      bcx<?> $$3 = $$1.dy();
      return !$$3.a(bku.g)
         ? false
         : ((List)$$3.c(bku.g).get()).stream().filter($$1x -> $$1x.ad() == $$1.ad()).filter($$1x -> $$2.a($$1x.cY(), 2.0)).anyMatch($$2x -> b($$0, $$2x, $$2));
   }

   private static boolean b(agg $$0, bcc $$1, gt $$2) {
      if (!$$1.dy().a(bku.t)) {
         return false;
      } else {
         dql $$3 = (dql)$$1.dy().c(bku.t).get();
         if ($$3.c()) {
            return false;
         } else {
            dqj $$4 = $$3.i();
            if ($$4 == null) {
               return false;
            } else {
               dqj $$5 = $$3.h();
               return $$2.equals($$4.a()) || $$2.equals($$5.a());
            }
         }
      }
   }

   private static boolean a(agg $$0, bcc $$1, hb $$2) {
      return $$2.a() != $$0.ab() || !$$2.b().a($$1.cY(), 2.0);
   }

   private void c(agg $$0, bcc $$1, gt $$2) {
      bcx<?> $$3 = $$1.dy();
      hb $$4 = hb.a($$0.ab(), $$2);
      if ($$3.c(bku.v).isPresent()) {
         ((Set)$$3.c(bku.v).get()).add($$4);
      } else {
         $$3.a(bku.v, Sets.newHashSet(new hb[]{$$4}));
      }

   }
}
