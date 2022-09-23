import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dot {
   public static final String a = "palette";
   public static final String b = "palettes";
   public static final String c = "entities";
   public static final String d = "blocks";
   public static final String e = "pos";
   public static final String f = "state";
   public static final String g = "nbt";
   public static final String h = "pos";
   public static final String i = "blockPos";
   public static final String j = "nbt";
   public static final String k = "size";
   static final int l = 16;
   private final List<dot.a> m = Lists.newArrayList();
   private final List<dot.d> n = Lists.newArrayList();
   private hs o = hs.g;
   private String p = "?";

   public hs a() {
      return this.o;
   }

   public void a(String $$0) {
      this.p = $$0;
   }

   public String b() {
      return this.p;
   }

   public void a(cgx $$0, gt $$1, hs $$2, boolean $$3, @Nullable cjt $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         gt $$5 = $$1.a($$2).b(-1, -1, -1);
         List<dot.c> $$6 = Lists.newArrayList();
         List<dot.c> $$7 = Lists.newArrayList();
         List<dot.c> $$8 = Lists.newArrayList();
         gt $$9 = new gt(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         gt $$10 = new gt(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.o = $$2;

         for(gt $$11 : gt.a($$9, $$10)) {
            gt $$12 = $$11.b($$9);
            cvo $$13 = $$0.a_($$11);
            if ($$4 == null || !$$13.a($$4)) {
               cti $$14 = $$0.c_($$11);
               dot.c $$15;
               if ($$14 != null) {
                  $$15 = new dot.c($$12, $$13, $$14.n());
               } else {
                  $$15 = new dot.c($$12, $$13, null);
               }

               a($$15, $$6, $$7, $$8);
            }
         }

         List<dot.c> $$17 = a($$6, $$7, $$8);
         this.m.clear();
         this.m.add(new dot.a($$17));
         if ($$3) {
            this.a($$0, $$9, $$10.b(1, 1, 1));
         } else {
            this.n.clear();
         }

      }
   }

   private static void a(dot.c $$0, List<dot.c> $$1, List<dot.c> $$2, List<dot.c> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.r(cgm.a, gt.b)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }

   }

   private static List<dot.c> a(List<dot.c> $$0, List<dot.c> $$1, List<dot.c> $$2) {
      Comparator<dot.c> $$3 = Comparator.comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<dot.c> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(cgx $$0, gt $$1, gt $$2) {
      List<bbn> $$3 = $$0.a(bbn.class, new dwl($$1, $$2), $$0x -> !($$0x instanceof buc));
      this.n.clear();

      for(bbn $$4 : $$3) {
         dwq $$5 = new dwq($$4.df() - (double)$$1.u(), $$4.dh() - (double)$$1.v(), $$4.dl() - (double)$$1.w());
         pj $$6 = new pj();
         $$4.e($$6);
         gt $$7;
         if ($$4 instanceof bqq) {
            $$7 = ((bqq)$$4).w().b($$1);
         } else {
            $$7 = new gt($$5);
         }

         this.n.add(new dot.d($$5, $$7, $$6.g()));
      }

   }

   public List<dot.c> a(gt $$0, dop $$1, cjt $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public ObjectArrayList<dot.c> a(gt $$0, dop $$1, cjt $$2, boolean $$3) {
      ObjectArrayList<dot.c> $$4 = new ObjectArrayList();
      dkt $$5 = $$1.g();
      if (this.m.isEmpty()) {
         return $$4;
      } else {
         for(dot.c $$6 : $$1.a(this.m, $$0).a($$2)) {
            gt $$7 = $$3 ? a($$1, $$6.a).a($$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new dot.c($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public gt a(dop $$0, gt $$1, dop $$2, gt $$3) {
      gt $$4 = a($$0, $$1);
      gt $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static gt a(dop $$0, gt $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(chm $$0, gt $$1, gt $$2, dop $$3, amn $$4, int $$5) {
      if (this.m.isEmpty()) {
         return false;
      } else {
         List<dot.c> $$6 = $$3.a(this.m, $$1).a();
         if ((!$$6.isEmpty() || !$$3.f() && !this.n.isEmpty()) && this.o.u() >= 1 && this.o.v() >= 1 && this.o.w() >= 1) {
            dkt $$7 = $$3.g();
            List<gt> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<gt> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<gt, pj>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;

            for(dot.c $$18 : a($$0, $$1, $$2, $$3, $$6)) {
               gt $$19 = $$18.a;
               if ($$7 == null || $$7.b($$19)) {
                  dpv $$20 = $$3.j() ? $$0.b_($$19) : null;
                  cvo $$21 = $$18.b.a($$3.c()).a($$3.d());
                  if ($$18.c != null) {
                     cti $$22 = $$0.c_($$19);
                     baa.a($$22);
                     $$0.a($$19, cju.gU.m(), 20);
                  }

                  if ($$0.a($$19, $$21, $$5)) {
                     $$11 = Math.min($$11, $$19.u());
                     $$12 = Math.min($$12, $$19.v());
                     $$13 = Math.min($$13, $$19.w());
                     $$14 = Math.max($$14, $$19.u());
                     $$15 = Math.max($$15, $$19.v());
                     $$16 = Math.max($$16, $$19.w());
                     $$10.add(Pair.of($$19, $$18.c));
                     if ($$18.c != null) {
                        cti $$23 = $$0.c_($$19);
                        if ($$23 != null) {
                           if ($$23 instanceof cuf) {
                              $$18.c.a("LootTableSeed", $$4.g());
                           }

                           $$23.a($$18.c);
                        }
                     }

                     if ($$20 != null) {
                        if ($$21.p().b()) {
                           $$9.add($$19);
                        } else if ($$21.b() instanceof coa) {
                           ((coa)$$21.b()).a($$0, $$19, $$21, $$20);
                           if (!$$20.b()) {
                              $$8.add($$19);
                           }
                        }
                     }
                  }
               }
            }

            boolean $$24 = true;
            gy[] $$25 = new gy[]{gy.b, gy.c, gy.f, gy.d, gy.e};

            while($$24 && !$$8.isEmpty()) {
               $$24 = false;
               Iterator<gt> $$26 = $$8.iterator();

               while($$26.hasNext()) {
                  gt $$27 = (gt)$$26.next();
                  dpv $$28 = $$0.b_($$27);

                  for(int $$29 = 0; $$29 < $$25.length && !$$28.b(); ++$$29) {
                     gt $$30 = $$27.a($$25[$$29]);
                     dpv $$31 = $$0.b_($$30);
                     if ($$31.b() && !$$9.contains($$30)) {
                        $$28 = $$31;
                     }
                  }

                  if ($$28.b()) {
                     cvo $$32 = $$0.a_($$27);
                     cjt $$33 = $$32.b();
                     if ($$33 instanceof coa) {
                        ((coa)$$33).a($$0, $$27, $$32, $$28);
                        $$24 = true;
                        $$26.remove();
                     }
                  }
               }
            }

            if ($$11 <= $$14) {
               if (!$$3.h()) {
                  dwz $$34 = new dwt($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                  int $$35 = $$11;
                  int $$36 = $$12;
                  int $$37 = $$13;

                  for(Pair<gt, pj> $$38 : $$10) {
                     gt $$39 = (gt)$$38.getFirst();
                     $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                  }

                  a($$0, $$5, $$34, $$35, $$36, $$37);
               }

               for(Pair<gt, pj> $$40 : $$10) {
                  gt $$41 = (gt)$$40.getFirst();
                  if (!$$3.h()) {
                     cvo $$42 = $$0.a_($$41);
                     cvo $$43 = cjt.b($$42, $$0, $$41);
                     if ($$42 != $$43) {
                        $$0.a($$41, $$43, $$5 & -2 | 16);
                     }

                     $$0.b($$41, $$43.b());
                  }

                  if ($$40.getSecond() != null) {
                     cti $$44 = $$0.c_($$41);
                     if ($$44 != null) {
                        $$44.e();
                     }
                  }
               }
            }

            if (!$$3.f()) {
               this.a($$0, $$1, $$3.c(), $$3.d(), $$3.e(), $$7, $$3.k());
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void a(cgy $$0, int $$1, dwz $$2, int $$3, int $$4, int $$5) {
      $$2.a(($$5x, $$6, $$7, $$8) -> {
         gt $$9 = new gt($$3 + $$6, $$4 + $$7, $$5 + $$8);
         gt $$10 = $$9.a($$5x);
         cvo $$11 = $$0.a_($$9);
         cvo $$12 = $$0.a_($$10);
         cvo $$13 = $$11.a($$5x, $$12, $$0, $$9, $$10);
         if ($$11 != $$13) {
            $$0.a($$9, $$13, $$1 & -2);
         }

         cvo $$14 = $$12.a($$5x.g(), $$13, $$0, $$10, $$9);
         if ($$12 != $$14) {
            $$0.a($$10, $$14, $$1 & -2);
         }

      });
   }

   public static List<dot.c> a(cgy $$0, gt $$1, gt $$2, dop $$3, List<dot.c> $$4) {
      List<dot.c> $$5 = Lists.newArrayList();

      for(dot.c $$6 : $$4) {
         gt $$7 = a($$3, $$6.a).a($$1);
         dot.c $$8 = new dot.c($$7, $$6.b, $$6.c != null ? $$6.c.g() : null);
         Iterator<doq> $$9 = $$3.i().iterator();

         while($$8 != null && $$9.hasNext()) {
            $$8 = ((doq)$$9.next()).a($$0, $$1, $$2, $$6, $$8, $$3);
         }

         if ($$8 != null) {
            $$5.add($$8);
         }
      }

      return $$5;
   }

   private void a(chm $$0, gt $$1, coh $$2, cpw $$3, gt $$4, @Nullable dkt $$5, boolean $$6) {
      for(dot.d $$7 : this.n) {
         gt $$8 = a($$7.b, $$2, $$3, $$4).a($$1);
         if ($$5 == null || $$5.b($$8)) {
            pj $$9 = $$7.c.g();
            dwq $$10 = a($$7.a, $$2, $$3, $$4);
            dwq $$11 = $$10.b((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            pp $$12 = new pp();
            $$12.add(pk.a($$11.c));
            $$12.add(pk.a($$11.d));
            $$12.add(pk.a($$11.e));
            $$9.a("Pos", (qc)$$12);
            $$9.r("UUID");
            a($$0, $$9).ifPresent($$6x -> {
               float $$7x = $$6x.a($$3);
               $$7x += $$6x.a($$2) - $$6x.dq();
               $$6x.b($$11.c, $$11.d, $$11.e, $$7x, $$6x.ds());
               if ($$6 && $$6x instanceof bce) {
                  ((bce)$$6x).a($$0, $$0.d_(new gt($$11)), bcg.d, null, $$9);
               }

               $$0.a_($$6x);
            });
         }
      }

   }

   private static Optional<bbn> a(chm $$0, pj $$1) {
      try {
         return bbr.a($$1, $$0.D());
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   public hs a(cpw $$0) {
      switch($$0) {
         case d:
         case b:
            return new hs(this.o.w(), this.o.v(), this.o.u());
         default:
            return this.o;
      }
   }

   public static gt a(gt $$0, coh $$1, cpw $$2, gt $$3) {
      int $$4 = $$0.u();
      int $$5 = $$0.v();
      int $$6 = $$0.w();
      boolean $$7 = true;
      switch($$1) {
         case b:
            $$6 = -$$6;
            break;
         case c:
            $$4 = -$$4;
            break;
         default:
            $$7 = false;
      }

      int $$8 = $$3.u();
      int $$9 = $$3.w();
      switch($$2) {
         case d:
            return new gt($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new gt($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new gt($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new gt($$4, $$5, $$6) : $$0;
      }
   }

   public static dwq a(dwq $$0, coh $$1, cpw $$2, gt $$3) {
      double $$4 = $$0.c;
      double $$5 = $$0.d;
      double $$6 = $$0.e;
      boolean $$7 = true;
      switch($$1) {
         case b:
            $$6 = 1.0 - $$6;
            break;
         case c:
            $$4 = 1.0 - $$4;
            break;
         default:
            $$7 = false;
      }

      int $$8 = $$3.u();
      int $$9 = $$3.w();
      switch($$2) {
         case d:
            return new dwq((double)($$8 - $$9) + $$6, $$5, (double)($$8 + $$9 + 1) - $$4);
         case b:
            return new dwq((double)($$8 + $$9 + 1) - $$6, $$5, (double)($$9 - $$8) + $$4);
         case c:
            return new dwq((double)($$8 + $$8 + 1) - $$4, $$5, (double)($$9 + $$9 + 1) - $$6);
         default:
            return $$7 ? new dwq($$4, $$5, $$6) : $$0;
      }
   }

   public gt a(gt $$0, coh $$1, cpw $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static gt a(gt $$0, coh $$1, cpw $$2, int $$3, int $$4) {
      --$$3;
      --$$4;
      int $$5 = $$1 == coh.c ? $$3 : 0;
      int $$6 = $$1 == coh.b ? $$4 : 0;
      gt $$7 = $$0;
      switch($$2) {
         case d:
            $$7 = $$0.b($$6, 0, $$3 - $$5);
            break;
         case b:
            $$7 = $$0.b($$4 - $$6, 0, $$5);
            break;
         case c:
            $$7 = $$0.b($$3 - $$5, 0, $$4 - $$6);
            break;
         case a:
            $$7 = $$0.b($$5, 0, $$6);
      }

      return $$7;
   }

   public dkt b(dop $$0, gt $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public dkt a(gt $$0, cpw $$1, gt $$2, coh $$3) {
      return a($$0, $$1, $$2, $$3, this.o);
   }

   @VisibleForTesting
   protected static dkt a(gt $$0, cpw $$1, gt $$2, coh $$3, hs $$4) {
      hs $$5 = $$4.c(-1, -1, -1);
      gt $$6 = a(gt.b, $$3, $$1, $$2);
      gt $$7 = a(gt.b.a($$5), $$3, $$1, $$2);
      return dkt.a($$6, $$7).a((hs)$$0);
   }

   public pj a(pj $$0) {
      if (this.m.isEmpty()) {
         $$0.a("blocks", (qc)(new pp()));
         $$0.a("palette", (qc)(new pp()));
      } else {
         List<dot.b> $$1 = Lists.newArrayList();
         dot.b $$2 = new dot.b();
         $$1.add($$2);

         for(int $$3 = 1; $$3 < this.m.size(); ++$$3) {
            $$1.add(new dot.b());
         }

         pp $$4 = new pp();
         List<dot.c> $$5 = ((dot.a)this.m.get(0)).a();

         for(int $$6 = 0; $$6 < $$5.size(); ++$$6) {
            dot.c $$7 = (dot.c)$$5.get($$6);
            pj $$8 = new pj();
            $$8.a("pos", (qc)this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", (qc)$$7.c);
            }

            $$4.add($$8);

            for(int $$10 = 1; $$10 < this.m.size(); ++$$10) {
               dot.b $$11 = (dot.b)$$1.get($$10);
               $$11.a(((dot.c)((dot.a)this.m.get($$10)).a().get($$6)).b, $$9);
            }
         }

         $$0.a("blocks", (qc)$$4);
         if ($$1.size() == 1) {
            pp $$12 = new pp();

            for(cvo $$13 : $$2) {
               $$12.add(pv.a($$13));
            }

            $$0.a("palette", (qc)$$12);
         } else {
            pp $$14 = new pp();

            for(dot.b $$15 : $$1) {
               pp $$16 = new pp();

               for(cvo $$17 : $$15) {
                  $$16.add(pv.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", (qc)$$14);
         }
      }

      pp $$18 = new pp();

      for(dot.d $$19 : this.n) {
         pj $$20 = new pj();
         $$20.a("pos", (qc)this.a($$19.a.c, $$19.a.d, $$19.a.e));
         $$20.a("blockPos", (qc)this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", (qc)$$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", (qc)$$18);
      $$0.a("size", (qc)this.a(this.o.u(), this.o.v(), this.o.w()));
      $$0.a("DataVersion", ab.b().getWorldVersion());
      return $$0;
   }

   public void b(pj $$0) {
      this.m.clear();
      this.n.clear();
      pp $$1 = $$0.c("size", 3);
      this.o = new hs($$1.e(0), $$1.e(1), $$1.e(2));
      pp $$2 = $$0.c("blocks", 10);
      if ($$0.b("palettes", 9)) {
         pp $$3 = $$0.c("palettes", 9);

         for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            this.a($$3.b($$4), $$2);
         }
      } else {
         this.a($$0.c("palette", 10), $$2);
      }

      pp $$5 = $$0.c("entities", 10);

      for(int $$6 = 0; $$6 < $$5.size(); ++$$6) {
         pj $$7 = $$5.a($$6);
         pp $$8 = $$7.c("pos", 6);
         dwq $$9 = new dwq($$8.h(0), $$8.h(1), $$8.h(2));
         pp $$10 = $$7.c("blockPos", 3);
         gt $$11 = new gt($$10.e(0), $$10.e(1), $$10.e(2));
         if ($$7.e("nbt")) {
            pj $$12 = $$7.p("nbt");
            this.n.add(new dot.d($$9, $$11, $$12));
         }
      }

   }

   private void a(pp $$0, pp $$1) {
      dot.b $$2 = new dot.b();

      for(int $$3 = 0; $$3 < $$0.size(); ++$$3) {
         $$2.a(pv.c($$0.a($$3)), $$3);
      }

      List<dot.c> $$4 = Lists.newArrayList();
      List<dot.c> $$5 = Lists.newArrayList();
      List<dot.c> $$6 = Lists.newArrayList();

      for(int $$7 = 0; $$7 < $$1.size(); ++$$7) {
         pj $$8 = $$1.a($$7);
         pp $$9 = $$8.c("pos", 3);
         gt $$10 = new gt($$9.e(0), $$9.e(1), $$9.e(2));
         cvo $$11 = $$2.a($$8.h("state"));
         pj $$12;
         if ($$8.e("nbt")) {
            $$12 = $$8.p("nbt");
         } else {
            $$12 = null;
         }

         dot.c $$14 = new dot.c($$10, $$11, $$12);
         a($$14, $$4, $$5, $$6);
      }

      List<dot.c> $$15 = a($$4, $$5, $$6);
      this.m.add(new dot.a($$15));
   }

   private pp a(int... $$0) {
      pp $$1 = new pp();

      for(int $$2 : $$0) {
         $$1.add(po.a($$2));
      }

      return $$1;
   }

   private pp a(double... $$0) {
      pp $$1 = new pp();

      for(double $$2 : $$0) {
         $$1.add(pk.a($$2));
      }

      return $$1;
   }

   public static final class a {
      private final List<dot.c> a;
      private final Map<cjt, List<dot.c>> b = Maps.newHashMap();

      a(List<dot.c> $$0) {
         this.a = $$0;
      }

      public List<dot.c> a() {
         return this.a;
      }

      public List<dot.c> a(cjt $$0) {
         return (List<dot.c>)this.b.computeIfAbsent($$0, $$0x -> (List)this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class b implements Iterable<cvo> {
      public static final cvo a = cju.a.m();
      private final hg<cvo> b = new hg<>(16);
      private int c;

      public int a(cvo $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public cvo a(int $$0) {
         cvo $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      public Iterator<cvo> iterator() {
         return this.b.iterator();
      }

      public void a(cvo $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public static class c {
      public final gt a;
      public final cvo b;
      public final pj c;

      public c(gt $$0, cvo $$1, @Nullable pj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class d {
      public final dwq a;
      public final gt b;
      public final pj c;

      public d(dwq $$0, gt $$1, pj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
