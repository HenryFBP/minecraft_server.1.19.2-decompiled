import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class chi {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 24;
   public static final int a = 8;
   public static final int b = 128;
   static final int e = (int)Math.pow(17.0, 2.0);
   private static final bcf[] f = (bcf[])Stream.of(bcf.values()).filter($$0 -> $$0 != bcf.h).toArray($$0 -> new bcf[$$0]);

   private chi() {
   }

   public static chi.d a(int $$0, Iterable<bbn> $$1, chi.b $$2, chh $$3) {
      chl $$4 = new chl();
      Object2IntOpenHashMap<bcf> $$5 = new Object2IntOpenHashMap();
      Iterator var6 = $$1.iterator();

      while(true) {
         bbn $$6;
         bce $$7;
         do {
            if (!var6.hasNext()) {
               return new chi.d($$0, $$5, $$4, $$3);
            }

            $$6 = (bbn)var6.next();
            if (!($$6 instanceof bce)) {
               break;
            }

            $$7 = (bce)$$6;
         } while($$7.fr() || $$7.P());

         bcf $$8 = $$6.ad().f();
         if ($$8 != bcf.h) {
            gt $$9 = $$6.da();
            $$2.query(cge.a($$9), $$6x -> {
               cif.b $$7 = a($$9, $$6x).b().a($$6.ad());
               if ($$7 != null) {
                  $$4.a($$6.da(), $$7.b());
               }

               if ($$6 instanceof bce) {
                  $$3.a($$6x.f(), $$8);
               }

               $$5.addTo($$8, 1);
            });
         }
      }
   }

   static cht a(gt $$0, cxj $$1) {
      return $$1.getNoiseBiome(hl.a($$0.u()), hl.a($$0.v()), hl.a($$0.w())).a();
   }

   public static void a(agg $$0, cxt $$1, chi.d $$2, boolean $$3, boolean $$4, boolean $$5) {
      // $FF: Couldn't be decompiled
      // Please report this to the Quiltflower issue tracker, at https://github.com/QuiltMC/quiltflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:657)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:394)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:974)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:971)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:757)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:858)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:65)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:796)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:237)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:796)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.DoStatement.toJava(DoStatement.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:796)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SequenceStatement.toJava(SequenceStatement.java:111)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:37)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.methodToJava(ClassWriter.java:1084)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual agg.ac ()Lawz;
      // 04: ldc "spawner"
      // 06: invokeinterface awz.a (Ljava/lang/String;)V 2
      // 0b: getstatic chi.f [Lbcf;
      // 0e: astore 6
      // 10: aload 6
      // 12: arraylength
      // 13: istore 7
      // 15: bipush 0
      // 16: istore 8
      // 18: iload 8
      // 1a: iload 7
      // 1c: if_icmpge 7c
      // 1f: aload 6
      // 21: iload 8
      // 23: aaload
      // 24: astore 9
      // 26: iload 3
      // 27: ifne 32
      // 2a: aload 9
      // 2c: invokevirtual bcf.d ()Z
      // 2f: ifne 76
      // 32: iload 4
      // 34: ifne 3f
      // 37: aload 9
      // 39: invokevirtual bcf.d ()Z
      // 3c: ifeq 76
      // 3f: iload 5
      // 41: ifne 4c
      // 44: aload 9
      // 46: invokevirtual bcf.e ()Z
      // 49: ifne 76
      // 4c: aload 2
      // 4d: aload 9
      // 4f: aload 1
      // 50: invokevirtual cxt.f ()Lcge;
      // 53: invokevirtual chi$d.a (Lbcf;Lcge;)Z
      // 56: ifeq 76
      // 59: aload 9
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: dup
      // 5f: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 62: pop
      // 63: invokedynamic test (Lchi$d;)Lchi$c; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbbr;Lgt;Lcxj;)Z, chi$d.a (Lbbr;Lgt;Lcxj;)Z, (Lbbr;Lgt;Lcxj;)Z ]
      // 68: aload 2
      // 69: dup
      // 6a: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d: pop
      // 6e: invokedynamic run (Lchi$d;)Lchi$a; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lbce;Lcxj;)V, chi$d.a (Lbce;Lcxj;)V, (Lbce;Lcxj;)V ]
      // 73: invokestatic chi.a (Lbcf;Lagg;Lcxt;Lchi$c;Lchi$a;)V
      // 76: iinc 8 1
      // 79: goto 18
      // 7c: aload 0
      // 7d: invokevirtual agg.ac ()Lawz;
      // 80: invokeinterface awz.c ()V 1
      // 85: return
   }

   public static void a(bcf $$0, agg $$1, cxt $$2, chi.c $$3, chi.a $$4) {
      gt $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.u_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @ang
   public static void a(bcf $$0, agg $$1, gt $$2) {
      a($$0, $$1, $$1.B($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {
      });
   }

   public static void a(bcf $$0, agg $$1, cxj $$2, gt $$3, chi.c $$4, chi.a $$5) {
      cho $$6 = $$1.a();
      cxk $$7 = $$1.k().g();
      int $$8 = $$3.v();
      cvo $$9 = $$2.a_($$3);
      if (!$$9.g($$2, $$3)) {
         gt.a $$10 = new gt.a();
         int $$11 = 0;

         for(int $$12 = 0; $$12 < 3; ++$$12) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            cif.c $$16 = null;
            bcu $$17 = null;
            int $$18 = ami.f($$1.w.i() * 4.0F);
            int $$19 = 0;

            for(int $$20 = 0; $$20 < $$18; ++$$20) {
               $$13 += $$1.w.a(6) - $$1.w.a(6);
               $$14 += $$1.w.a(6) - $$1.w.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = (double)$$13 + 0.5;
               double $$22 = (double)$$14 + 0.5;
               buc $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.h($$21, (double)$$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<cif.c> $$25 = a($$1, $$6, $$7, $$0, $$1.w, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = (cif.c)$$25.get();
                        $$18 = $$16.c + $$1.w.a(1 + $$16.d - $$16.c);
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.b, $$10, $$2)) {
                        bce $$26 = a($$1, $$16.b);
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, (double)$$8, $$22, $$1.w.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.da()), bcg.a, $$17, null);
                           ++$$11;
                           ++$$19;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.fo()) {
                              return;
                           }

                           if ($$26.d($$19)) {
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private static boolean a(agg $$0, cxj $$1, gt.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else if ($$0.Q().a(new dwq((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5), 24.0)) {
         return false;
      } else {
         return Objects.equals(new cge($$2), $$1.f()) || $$0.f($$2);
      }
   }

   private static boolean a(agg $$0, bcf $$1, cho $$2, cxk $$3, cif.c $$4, gt.a $$5, double $$6) {
      bbr<?> $$7 = $$4.b;
      if ($$7.f() == bcf.h) {
         return false;
      } else if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
         return false;
      } else if ($$7.c() && a($$0, $$2, $$3, $$1, $$4, $$5)) {
         bcv.c $$8 = bcv.a($$7);
         if (!a($$8, $$0, $$5, $$7)) {
            return false;
         } else if (!bcv.a($$7, $$0, bcg.a, $$5, $$0.w)) {
            return false;
         } else {
            return $$0.b($$7.a((double)$$5.u() + 0.5, (double)$$5.v(), (double)$$5.w() + 0.5));
         }
      } else {
         return false;
      }
   }

   @Nullable
   private static bce a(agg $$0, bbr<?> $$1) {
      try {
         bbn $$2 = $$1.a((cgx)$$0);
         if (!($$2 instanceof bce)) {
            throw new IllegalStateException("Trying to spawn a non-mob: " + hm.X.b($$1));
         } else {
            return (bce)$$2;
         }
      } catch (Exception var4) {
         c.warn("Failed to create mob", var4);
         return null;
      }
   }

   private static boolean a(agg $$0, bce $$1, double $$2) {
      if ($$2 > (double)($$1.ad().f().f() * $$1.ad().f().f()) && $$1.h($$2)) {
         return false;
      } else {
         return $$1.a($$0, bcg.a) && $$1.a((cha)$$0);
      }
   }

   private static Optional<cif.c> a(agg $$0, cho $$1, cxk $$2, bcf $$3, amn $$4, gt $$5) {
      hc<cht> $$6 = $$0.w($$5);
      return $$3 == bcf.g && $$6.a(akk.ah) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
   }

   private static boolean a(agg $$0, cho $$1, cxk $$2, bcf $$3, cif.c $$4, gt $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
   }

   private static ayx<cif.c> a(agg $$0, cho $$1, cxk $$2, bcf $$3, gt $$4, @Nullable hc<cht> $$5) {
      return a($$4, $$0, $$3, $$1) ? dna.d : $$2.a($$5 != null ? $$5 : $$0.w($$4), $$1, $$3, $$4);
   }

   public static boolean a(gt $$0, agg $$1, bcf $$2, cho $$3) {
      if ($$2 == bcf.a && $$1.a_($$0.c()).a(cju.eu)) {
         dlb $$4 = $$3.b().d(hm.aN).a(dkv.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static gt a(cgx $$0, cxt $$1) {
      cge $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.w.a(16);
      int $$4 = $$2.e() + $$0.w.a(16);
      int $$5 = $$1.a(dar.a.b, $$3, $$4) + 1;
      int $$6 = ami.b($$0.w, $$0.u_(), $$5);
      return new gt($$3, $$6, $$4);
   }

   public static boolean a(cgd $$0, gt $$1, cvo $$2, dpv $$3, bbr<?> $$4) {
      if ($$2.r($$0, $$1)) {
         return false;
      } else if ($$2.j()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else if ($$2.a(akl.aO)) {
         return false;
      } else {
         return !$$4.a($$2);
      }
   }

   public static boolean a(bcv.c $$0, cha $$1, gt $$2, @Nullable bbr<?> $$3) {
      if ($$0 == bcv.c.c) {
         return true;
      } else if ($$3 != null && $$1.p_().a($$2)) {
         cvo $$4 = $$1.a_($$2);
         dpv $$5 = $$1.b_($$2);
         gt $$6 = $$2.b();
         gt $$7 = $$2.c();
         switch($$0) {
            case b:
               return $$5.a(akp.a) && !$$1.a_($$6).g($$1, $$6);
            case d:
               return $$5.a(akp.b);
            case a:
            default:
               cvo $$8 = $$1.a_($$7);
               if (!$$8.a($$1, $$7, $$3)) {
                  return false;
               } else {
                  return a($$1, $$2, $$4, $$5, $$3) && a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
               }
         }
      } else {
         return false;
      }
   }

   public static void a(chm $$0, hc<cht> $$1, cge $$2, amn $$3) {
      cif $$4 = $$1.a().b();
      ayx<cif.c> $$5 = $$4.a(bcf.b);
      if (!$$5.d()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while($$3.i() < $$4.a()) {
            Optional<cif.c> $$8 = $$5.b($$3);
            if ($$8.isPresent()) {
               cif.c $$9 = (cif.c)$$8.get();
               int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
               bcu $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for(int $$16 = 0; $$16 < $$10; ++$$16) {
                  boolean $$17 = false;

                  for(int $$18 = 0; !$$17 && $$18 < 4; ++$$18) {
                     gt $$19 = a($$0, $$9.b, $$12, $$13);
                     if ($$9.b.c() && a(bcv.a($$9.b), $$0, $$19, $$9.b)) {
                        float $$20 = $$9.b.k();
                        double $$21 = ami.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = ami.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, (double)$$19.v(), $$22)) || !bcv.a($$9.b, $$0, bcg.b, new gt($$21, (double)$$19.v(), $$22), $$0.r_())) {
                           continue;
                        }

                        bbn $$23;
                        try {
                           $$23 = $$9.b.a((cgx)$$0.D());
                        } catch (Exception var27) {
                           c.warn("Failed to create mob", var27);
                           continue;
                        }

                        $$23.b($$21, (double)$$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof bce $$26 && $$26.a($$0, bcg.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.da()), bcg.b, $$11, null);
                           $$0.a_($$26);
                           $$17 = true;
                        }
                     }

                     $$12 += $$3.a(5) - $$3.a(5);

                     for($$13 += $$3.a(5) - $$3.a(5); $$12 < $$6 || $$12 >= $$6 + 16 || $$13 < $$7 || $$13 >= $$7 + 16; $$13 = $$15 + $$3.a(5) - $$3.a(5)) {
                        $$12 = $$14 + $$3.a(5) - $$3.a(5);
                     }
                  }
               }
            }
         }

      }
   }

   private static gt a(cha $$0, bbr<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(bcv.b($$1), $$2, $$3);
      gt.a $$5 = new gt.a($$2, $$4, $$3);
      if ($$0.q_().h()) {
         do {
            $$5.c(gy.a);
         } while(!$$0.a_($$5).h());

         do {
            $$5.c(gy.a);
         } while($$0.a_($$5).h() && $$5.v() > $$0.u_());
      }

      if (bcv.a($$1) == bcv.c.a) {
         gt $$6 = $$5.c();
         if ($$0.a_($$6).a($$0, $$6, dqm.a)) {
            return $$6;
         }
      }

      return $$5.h();
   }

   @FunctionalInterface
   public interface a {
      void run(bce var1, cxj var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<cxt> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bbr<?> var1, gt var2, cxj var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<bcf> b;
      private final chl c;
      private final Object2IntMap<bcf> d;
      private final chh e;
      @Nullable
      private gt f;
      @Nullable
      private bbr<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<bcf> $$1, chl $$2, chh $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bbr<?> $$0, gt $$1, cxj $$2) {
         this.f = $$1;
         this.g = $$0;
         cif.b $$3 = chi.a($$1, $$2).b().a($$0);
         if ($$3 == null) {
            this.h = 0.0;
            return true;
         } else {
            double $$4 = $$3.b();
            this.h = $$4;
            double $$5 = this.c.b($$1, $$4);
            return $$5 <= $$3.a();
         }
      }

      private void a(bce $$0, cxj $$1) {
         bbr<?> $$2 = $$0.ad();
         gt $$3 = $$0.da();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            cif.b $$5 = chi.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         bcf $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new cge($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<bcf> b() {
         return this.d;
      }

      boolean a(bcf $$0, cge $$1) {
         int $$2 = $$0.b() * this.a / chi.e;
         if (this.b.getInt($$0) >= $$2) {
            return false;
         } else {
            return this.e.a($$0, $$1);
         }
      }
   }
}
