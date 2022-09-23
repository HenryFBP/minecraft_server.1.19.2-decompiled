import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;

public class cbd extends bzi {
   public static final int a = 128;
   public static final int b = 128;
   private static final int c = -12173266;
   private static final String d = "map";

   public cbd(cat.a $$0) {
      super($$0);
   }

   public static cax a(cgx $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
      cax $$6 = new cax(caz.qc);
      a($$6, $$0, $$1, $$2, $$3, $$4, $$5, $$0.ab());
      return $$6;
   }

   @Nullable
   public static drg a(@Nullable Integer $$0, cgx $$1) {
      return $$0 == null ? null : $$1.a(a($$0));
   }

   @Nullable
   public static drg a(cax $$0, cgx $$1) {
      Integer $$2 = d($$0);
      return a($$2, $$1);
   }

   @Nullable
   public static Integer d(cax $$0) {
      pj $$1 = $$0.u();
      return $$1 != null && $$1.b("map", 99) ? $$1.h("map") : null;
   }

   private static int a(cgx $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, aba<cgx> $$6) {
      drg $$7 = drg.a((double)$$1, (double)$$2, (byte)$$3, $$4, $$5, $$6);
      int $$8 = $$0.u();
      $$0.a(a($$8), $$7);
      return $$8;
   }

   private static void a(cax $$0, int $$1) {
      $$0.v().a("map", $$1);
   }

   private static void a(cax $$0, cgx $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6, aba<cgx> $$7) {
      int $$8 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      a($$0, $$8);
   }

   public static String a(int $$0) {
      return "map_" + $$0;
   }

   public void a(cgx $$0, bbn $$1, drg $$2) {
      if ($$0.ab() == $$2.e && $$1 instanceof buc) {
         int $$3 = 1 << $$2.f;
         int $$4 = $$2.c;
         int $$5 = $$2.d;
         int $$6 = ami.b($$1.df() - (double)$$4) / $$3 + 64;
         int $$7 = ami.b($$1.dl() - (double)$$5) / $$3 + 64;
         int $$8 = 128 / $$3;
         if ($$0.q_().h()) {
            $$8 /= 2;
         }

         drg.a $$9 = $$2.a((buc)$$1);
         ++$$9.b;
         boolean $$10 = false;

         for(int $$11 = $$6 - $$8 + 1; $$11 < $$6 + $$8; ++$$11) {
            if (($$11 & 15) == ($$9.b & 15) || $$10) {
               $$10 = false;
               double $$12 = 0.0;

               for(int $$13 = $$7 - $$8 - 1; $$13 < $$7 + $$8; ++$$13) {
                  if ($$11 >= 0 && $$13 >= -1 && $$11 < 128 && $$13 < 128) {
                     int $$14 = $$11 - $$6;
                     int $$15 = $$13 - $$7;
                     boolean $$16 = $$14 * $$14 + $$15 * $$15 > ($$8 - 2) * ($$8 - 2);
                     int $$17 = ($$4 / $$3 + $$11 - 64) * $$3;
                     int $$18 = ($$5 / $$3 + $$13 - 64) * $$3;
                     Multiset<dqa> $$19 = LinkedHashMultiset.create();
                     cxt $$20 = $$0.l(new gt($$17, 0, $$18));
                     if (!$$20.A()) {
                        cge $$21 = $$20.f();
                        int $$22 = $$17 & 15;
                        int $$23 = $$18 & 15;
                        int $$24 = 0;
                        double $$25 = 0.0;
                        if ($$0.q_().h()) {
                           int $$26 = $$17 + $$18 * 231871;
                           $$26 = $$26 * $$26 * 31287121 + $$26 * 11;
                           if (($$26 >> 20 & 1) == 0) {
                              $$19.add(cju.j.m().d($$0, gt.b), 10);
                           } else {
                              $$19.add(cju.b.m().d($$0, gt.b), 100);
                           }

                           $$25 = 100.0;
                        } else {
                           gt.a $$27 = new gt.a();
                           gt.a $$28 = new gt.a();

                           for(int $$29 = 0; $$29 < $$3; ++$$29) {
                              for(int $$30 = 0; $$30 < $$3; ++$$30) {
                                 int $$31 = $$20.a(dar.a.b, $$29 + $$22, $$30 + $$23) + 1;
                                 cvo $$35;
                                 if ($$31 <= $$0.u_() + 1) {
                                    $$35 = cju.B.m();
                                 } else {
                                    do {
                                       $$27.d($$21.d() + $$29 + $$22, --$$31, $$21.e() + $$30 + $$23);
                                       $$35 = $$20.a_($$27);
                                    } while($$35.d($$0, $$27) == dqa.a && $$31 > $$0.u_());

                                    if ($$31 > $$0.u_() && !$$35.p().c()) {
                                       int $$33 = $$31 - 1;
                                       $$28.g($$27);

                                       cvo $$34;
                                       do {
                                          $$28.q($$33--);
                                          $$34 = $$20.a_($$28);
                                          ++$$24;
                                       } while($$33 > $$0.u_() && !$$34.p().c());

                                       $$35 = this.a($$0, $$35, $$27);
                                    }
                                 }

                                 $$2.a($$0, $$21.d() + $$29 + $$22, $$21.e() + $$30 + $$23);
                                 $$25 += (double)$$31 / (double)($$3 * $$3);
                                 $$19.add($$35.d($$0, $$27));
                              }
                           }
                        }

                        $$24 /= $$3 * $$3;
                        dqa $$36 = (dqa)Iterables.getFirst(Multisets.copyHighestCountFirst($$19), dqa.a);
                        dqa.a $$38;
                        if ($$36 == dqa.m) {
                           double $$37 = (double)$$24 * 0.1 + (double)($$11 + $$13 & 1) * 0.2;
                           if ($$37 < 0.5) {
                              $$38 = dqa.a.c;
                           } else if ($$37 > 0.9) {
                              $$38 = dqa.a.a;
                           } else {
                              $$38 = dqa.a.b;
                           }
                        } else {
                           double $$41 = ($$25 - $$12) * 4.0 / (double)($$3 + 4) + ((double)($$11 + $$13 & 1) - 0.5) * 0.4;
                           if ($$41 > 0.6) {
                              $$38 = dqa.a.c;
                           } else if ($$41 < -0.6) {
                              $$38 = dqa.a.a;
                           } else {
                              $$38 = dqa.a.b;
                           }
                        }

                        $$12 = $$25;
                        if ($$13 >= 0 && $$14 * $$14 + $$15 * $$15 < $$8 * $$8 && (!$$16 || ($$11 + $$13 & 1) != 0)) {
                           $$10 |= $$2.a($$11, $$13, $$36.b($$38));
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private cvo a(cgx $$0, cvo $$1, gt $$2) {
      dpv $$3 = $$1.p();
      return !$$3.c() && !$$1.d($$0, $$2, gy.b) ? $$3.g() : $$1;
   }

   private static boolean a(boolean[] $$0, int $$1, int $$2) {
      return $$0[$$2 * 128 + $$1];
   }

   public static void a(agg $$0, cax $$1) {
      drg $$2 = a($$1, $$0);
      if ($$2 != null) {
         if ($$0.ab() == $$2.e) {
            int $$3 = 1 << $$2.f;
            int $$4 = $$2.c;
            int $$5 = $$2.d;
            boolean[] $$6 = new boolean[16384];
            int $$7 = $$4 / $$3 - 64;
            int $$8 = $$5 / $$3 - 64;
            gt.a $$9 = new gt.a();

            for(int $$10 = 0; $$10 < 128; ++$$10) {
               for(int $$11 = 0; $$11 < 128; ++$$11) {
                  hc<cht> $$12 = $$0.w($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                  $$6[$$10 * 128 + $$11] = $$12.a(akk.Z);
               }
            }

            for(int $$13 = 1; $$13 < 127; ++$$13) {
               for(int $$14 = 1; $$14 < 127; ++$$14) {
                  int $$15 = 0;

                  for(int $$16 = -1; $$16 < 2; ++$$16) {
                     for(int $$17 = -1; $$17 < 2; ++$$17) {
                        if (($$16 != 0 || $$17 != 0) && a($$6, $$13 + $$16, $$14 + $$17)) {
                           ++$$15;
                        }
                     }
                  }

                  dqa.a $$18 = dqa.a.d;
                  dqa $$19 = dqa.a;
                  if (a($$6, $$13, $$14)) {
                     $$19 = dqa.p;
                     if ($$15 > 7 && $$14 % 2 == 0) {
                        switch(($$13 + (int)(ami.a((float)$$14 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              $$18 = dqa.a.a;
                              break;
                           case 1:
                           case 3:
                              $$18 = dqa.a.b;
                              break;
                           case 2:
                              $$18 = dqa.a.c;
                        }
                     } else if ($$15 > 7) {
                        $$19 = dqa.a;
                     } else if ($$15 > 5) {
                        $$18 = dqa.a.b;
                     } else if ($$15 > 3) {
                        $$18 = dqa.a.a;
                     } else if ($$15 > 1) {
                        $$18 = dqa.a.a;
                     }
                  } else if ($$15 > 0) {
                     $$19 = dqa.A;
                     if ($$15 > 3) {
                        $$18 = dqa.a.b;
                     } else {
                        $$18 = dqa.a.d;
                     }
                  }

                  if ($$19 != dqa.a) {
                     $$2.b($$13, $$14, $$19.b($$18));
                  }
               }
            }

         }
      }
   }

   @Override
   public void a(cax $$0, cgx $$1, bbn $$2, int $$3, boolean $$4) {
      if (!$$1.y) {
         drg $$5 = a($$0, $$1);
         if ($$5 != null) {
            if ($$2 instanceof buc $$6) {
               $$5.a($$6, $$0);
            }

            if (!$$5.h && ($$4 || $$2 instanceof buc && ((buc)$$2).eA() == $$0)) {
               this.a($$1, $$2, $$5);
            }

         }
      }
   }

   @Nullable
   @Override
   public tc<?> a(cax $$0, cgx $$1, buc $$2) {
      Integer $$3 = d($$0);
      drg $$4 = a($$3, $$1);
      return $$4 != null ? $$4.a($$3, $$2) : null;
   }

   @Override
   public void b(cax $$0, cgx $$1, buc $$2) {
      pj $$3 = $$0.u();
      if ($$3 != null && $$3.b("map_scale_direction", 99)) {
         a($$0, $$1, $$3.h("map_scale_direction"));
         $$3.r("map_scale_direction");
      } else if ($$3 != null && $$3.b("map_to_lock", 1) && $$3.q("map_to_lock")) {
         a($$1, $$0);
         $$3.r("map_to_lock");
      }

   }

   private static void a(cax $$0, cgx $$1, int $$2) {
      drg $$3 = a($$0, $$1);
      if ($$3 != null) {
         int $$4 = $$1.u();
         $$1.a(a($$4), $$3.a($$2));
         a($$0, $$4);
      }

   }

   public static void a(cgx $$0, cax $$1) {
      drg $$2 = a($$1, $$0);
      if ($$2 != null) {
         int $$3 = $$0.u();
         String $$4 = a($$3);
         drg $$5 = $$2.a();
         $$0.a($$4, $$5);
         a($$1, $$3);
      }

   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      Integer $$4 = d($$0);
      drg $$5 = $$1 == null ? null : a($$4, $$1);
      if ($$5 != null && $$5.h) {
         $$2.add(rq.a("filled_map.locked", $$4).a(p.h));
      }

      if ($$3.a()) {
         if ($$5 != null) {
            $$2.add(rq.a("filled_map.id", $$4).a(p.h));
            $$2.add(rq.a("filled_map.scale", 1 << $$5.f).a(p.h));
            $$2.add(rq.a("filled_map.level", $$5.f, 4).a(p.h));
         } else {
            $$2.add(rq.c("filled_map.unknown").a(p.h));
         }
      }

   }

   public static int k(cax $$0) {
      pj $$1 = $$0.b("display");
      if ($$1 != null && $$1.b("MapColor", 99)) {
         int $$2 = $$1.h("MapColor");
         return 0xFF000000 | $$2 & 16777215;
      } else {
         return -12173266;
      }
   }

   @Override
   public baj a(ccz $$0) {
      cvo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(akl.D)) {
         if (!$$0.q().y) {
            drg $$2 = a($$0.n(), $$0.q());
            if ($$2 != null && !$$2.a($$0.q(), $$0.a())) {
               return baj.e;
            }
         }

         return baj.a($$0.q().y);
      } else {
         return super.a($$0);
      }
   }
}
