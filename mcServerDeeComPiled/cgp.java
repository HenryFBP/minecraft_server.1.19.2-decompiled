import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class cgp {
   private static final cgq a = new cgq();
   private static final int b = 16;
   private final boolean c;
   private final cgp.a d;
   private final amn e = amn.a();
   private final cgx f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bbn j;
   private final float k;
   private final baw l;
   private final cgq m;
   private final ObjectArrayList<gt> n = new ObjectArrayList();
   private final Map<buc, dwq> o = Maps.newHashMap();

   public cgp(cgx $$0, @Nullable bbn $$1, double $$2, double $$3, double $$4, float $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, cgp.a.c);
   }

   public cgp(cgx $$0, @Nullable bbn $$1, double $$2, double $$3, double $$4, float $$5, List<gt> $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, cgp.a.c, $$6);
   }

   public cgp(cgx $$0, @Nullable bbn $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cgp.a $$7, List<gt> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.n.addAll($$8);
   }

   public cgp(cgx $$0, @Nullable bbn $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cgp.a $$7) {
      this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cgp(cgx $$0, @Nullable bbn $$1, @Nullable baw $$2, @Nullable cgq $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, cgp.a $$9) {
      this.f = $$0;
      this.j = $$1;
      this.k = $$7;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.c = $$8;
      this.d = $$9;
      this.l = $$2 == null ? baw.a(this) : $$2;
      this.m = $$3 == null ? this.a($$1) : $$3;
   }

   private cgq a(@Nullable bbn $$0) {
      return (cgq)($$0 == null ? a : new cgn($$0));
   }

   public static float a(dwq $$0, bbn $$1) {
      dwl $$2 = $$1.cy();
      double $$3 = 1.0 / (($$2.d - $$2.a) * 2.0 + 1.0);
      double $$4 = 1.0 / (($$2.e - $$2.b) * 2.0 + 1.0);
      double $$5 = 1.0 / (($$2.f - $$2.c) * 2.0 + 1.0);
      double $$6 = (1.0 - Math.floor(1.0 / $$3) * $$3) / 2.0;
      double $$7 = (1.0 - Math.floor(1.0 / $$5) * $$5) / 2.0;
      if (!($$3 < 0.0) && !($$4 < 0.0) && !($$5 < 0.0)) {
         int $$8 = 0;
         int $$9 = 0;

         for(double $$10 = 0.0; $$10 <= 1.0; $$10 += $$3) {
            for(double $$11 = 0.0; $$11 <= 1.0; $$11 += $$4) {
               for(double $$12 = 0.0; $$12 <= 1.0; $$12 += $$5) {
                  double $$13 = ami.d($$10, $$2.a, $$2.d);
                  double $$14 = ami.d($$11, $$2.b, $$2.e);
                  double $$15 = ami.d($$12, $$2.c, $$2.f);
                  dwq $$16 = new dwq($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.s.a(new cgg($$16, $$0, cgg.a.a, cgg.b.a, $$1)).c() == dwo.a.a) {
                     ++$$8;
                  }

                  ++$$9;
               }
            }
         }

         return (float)$$8 / (float)$$9;
      } else {
         return 0.0F;
      }
   }

   public void a() {
      this.f.a(this.j, czv.w, new dwq(this.g, this.h, this.i));
      Set<gt> $$0 = Sets.newHashSet();
      int $$1 = 16;

      for(int $$2 = 0; $$2 < 16; ++$$2) {
         for(int $$3 = 0; $$3 < 16; ++$$3) {
            for(int $$4 = 0; $$4 < 16; ++$$4) {
               if ($$2 == 0 || $$2 == 15 || $$3 == 0 || $$3 == 15 || $$4 == 0 || $$4 == 15) {
                  double $$5 = (double)((float)$$2 / 15.0F * 2.0F - 1.0F);
                  double $$6 = (double)((float)$$3 / 15.0F * 2.0F - 1.0F);
                  double $$7 = (double)((float)$$4 / 15.0F * 2.0F - 1.0F);
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  float $$9 = this.k * (0.7F + this.f.w.i() * 0.6F);
                  double $$10 = this.g;
                  double $$11 = this.h;
                  double $$12 = this.i;

                  for(float $$13 = 0.3F; $$9 > 0.0F; $$9 -= 0.22500001F) {
                     gt $$14 = new gt($$10, $$11, $$12);
                     cvo $$15 = this.f.a_($$14);
                     dpv $$16 = this.f.b_($$14);
                     if (!this.f.j($$14)) {
                        break;
                     }

                     Optional<Float> $$17 = this.m.a(this, this.f, $$14, $$15, $$16);
                     if ($$17.isPresent()) {
                        $$9 -= ($$17.get() + 0.3F) * 0.3F;
                     }

                     if ($$9 > 0.0F && this.m.a(this, this.f, $$14, $$15, $$9)) {
                        $$0.add($$14);
                     }

                     $$10 += $$5 * 0.3F;
                     $$11 += $$6 * 0.3F;
                     $$12 += $$7 * 0.3F;
                  }
               }
            }
         }
      }

      this.n.addAll($$0);
      float $$18 = this.k * 2.0F;
      int $$19 = ami.b(this.g - (double)$$18 - 1.0);
      int $$20 = ami.b(this.g + (double)$$18 + 1.0);
      int $$21 = ami.b(this.h - (double)$$18 - 1.0);
      int $$22 = ami.b(this.h + (double)$$18 + 1.0);
      int $$23 = ami.b(this.i - (double)$$18 - 1.0);
      int $$24 = ami.b(this.i + (double)$$18 + 1.0);
      List<bbn> $$25 = this.f.a_(this.j, new dwl((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      dwq $$26 = new dwq(this.g, this.h, this.i);

      for(int $$27 = 0; $$27 < $$25.size(); ++$$27) {
         bbn $$28 = (bbn)$$25.get($$27);
         if (!$$28.cE()) {
            double $$29 = Math.sqrt($$28.e($$26)) / (double)$$18;
            if ($$29 <= 1.0) {
               double $$30 = $$28.df() - this.g;
               double $$31 = ($$28 instanceof bqw ? $$28.dh() : $$28.dj()) - this.h;
               double $$32 = $$28.dl() - this.i;
               double $$33 = Math.sqrt($$30 * $$30 + $$31 * $$31 + $$32 * $$32);
               if ($$33 != 0.0) {
                  $$30 /= $$33;
                  $$31 /= $$33;
                  $$32 /= $$33;
                  double $$34 = (double)a($$26, $$28);
                  double $$35 = (1.0 - $$29) * $$34;
                  $$28.a(this.b(), (float)((int)(($$35 * $$35 + $$35) / 2.0 * 7.0 * (double)$$18 + 1.0)));
                  double $$36 = $$35;
                  if ($$28 instanceof bcc) {
                     $$36 = cfe.a((bcc)$$28, $$35);
                  }

                  $$28.f($$28.dd().b($$30 * $$36, $$31 * $$36, $$32 * $$36));
                  if ($$28 instanceof buc $$37 && !$$37.B_() && (!$$37.f() || !$$37.fB().b)) {
                     this.o.put($$37, new dwq($$30 * $$35, $$31 * $$35, $$32 * $$35));
                  }
               }
            }
         }
      }

   }

   public void a(boolean $$0) {
      if (this.f.y) {
         this.f.a(this.g, this.h, this.i, ajw.ho, ajx.e, 4.0F, (1.0F + (this.f.w.i() - this.f.w.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d != cgp.a.a;
      if ($$0) {
         if (!(this.k < 2.0F) && $$1) {
            this.f.a(io.w, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         } else {
            this.f.a(io.x, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         }
      }

      if ($$1) {
         ObjectArrayList<Pair<cax, gt>> $$2 = new ObjectArrayList();
         boolean $$3 = this.d() instanceof buc;
         ad.b(this.n, this.f.w);
         ObjectListIterator var5 = this.n.iterator();

         while(var5.hasNext()) {
            gt $$4 = (gt)var5.next();
            cvo $$5 = this.f.a_($$4);
            cjt $$6 = $$5.b();
            if (!$$5.h()) {
               gt $$7 = $$4.h();
               this.f.ac().a("explosion_blocks");
               if ($$6.a(this)) {
                  cgx $$9 = this.f;
                  if ($$9 instanceof agg $$8) {
                     cti $$9 = $$5.o() ? this.f.c_($$4) : null;
                     dsd.a $$10 = new dsd.a($$8).a(this.f.w).a(dul.f, dwq.a($$4)).a(dul.i, cax.b).b(dul.h, $$9).b(dul.a, this.j);
                     if (this.d == cgp.a.c) {
                        $$10.a(dul.j, this.k);
                     }

                     $$5.a($$8, $$4, cax.b, $$3);
                     $$5.a($$10).forEach($$2x -> a($$2, $$2x, $$7));
                  }
               }

               this.f.a($$4, cju.a.m(), 3);
               $$6.a(this.f, $$4, this);
               this.f.ac().c();
            }
         }

         var5 = $$2.iterator();

         while(var5.hasNext()) {
            Pair<cax, gt> $$11 = (Pair)var5.next();
            cjt.a(this.f, (gt)$$11.getSecond(), (cax)$$11.getFirst());
         }
      }

      if (this.c) {
         ObjectListIterator var13 = this.n.iterator();

         while(var13.hasNext()) {
            gt $$12 = (gt)var13.next();
            if (this.e.a(3) == 0 && this.f.a_($$12).h() && this.f.a_($$12.c()).i(this.f, $$12.c())) {
               this.f.b($$12, cjh.a(this.f, $$12));
            }
         }
      }

   }

   private static void a(ObjectArrayList<Pair<cax, gt>> $$0, cax $$1, gt $$2) {
      int $$3 = $$0.size();

      for(int $$4 = 0; $$4 < $$3; ++$$4) {
         Pair<cax, gt> $$5 = (Pair)$$0.get($$4);
         cax $$6 = (cax)$$5.getFirst();
         if (bqv.a($$6, $$1)) {
            cax $$7 = bqv.a($$6, $$1, 16);
            $$0.set($$4, Pair.of($$7, (gt)$$5.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public baw b() {
      return this.l;
   }

   public Map<buc, dwq> c() {
      return this.o;
   }

   @Nullable
   public bcc d() {
      if (this.j == null) {
         return null;
      } else if (this.j instanceof bqw) {
         return ((bqw)this.j).h();
      } else if (this.j instanceof bcc) {
         return (bcc)this.j;
      } else {
         if (this.j instanceof buu) {
            bbn $$0 = ((buu)this.j).x();
            if ($$0 instanceof bcc) {
               return (bcc)$$0;
            }
         }

         return null;
      }
   }

   public void e() {
      this.n.clear();
   }

   public List<gt> f() {
      return this.n;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
