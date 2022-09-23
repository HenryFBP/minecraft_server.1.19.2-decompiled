import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ow {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";
   private static final int d = 4;

   public static cpw a(int $$0) {
      switch($$0) {
         case 0:
            return cpw.a;
         case 1:
            return cpw.b;
         case 2:
            return cpw.c;
         case 3:
            return cpw.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(cpw $$0) {
      switch($$0) {
         case a:
            return 0;
         case b:
            return 1;
         case c:
            return 2;
         case d:
            return 3;
         default:
            throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + $$0);
      }
   }

   public static void a(String[] $$0) throws IOException {
      abd.a();
      Files.walk(Paths.get(b)).filter($$0x -> $$0x.toString().endsWith(".snbt")).forEach($$0x -> {
         try {
            String $$1 = Files.readString($$0x);
            pj $$2 = pv.a($$1);
            pj $$3 = lf.a($$0x.toString(), $$2);
            ld.a(ix.a, $$0x, pv.d($$3));
         } catch (IOException | CommandSyntaxException var4) {
            c.error("Something went wrong upgrading: {}", $$0x, var4);
         }

      });
   }

   public static dwl a(cuo $$0) {
      gt $$1 = $$0.p();
      gt $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gt $$3 = dot.a($$2, coh.a, $$0.w(), $$1);
      return new dwl($$1, $$3);
   }

   public static dkt b(cuo $$0) {
      gt $$1 = $$0.p();
      gt $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gt $$3 = dot.a($$2, coh.a, $$0.w(), $$1);
      return dkt.a($$1, $$3);
   }

   public static void a(gt $$0, gt $$1, cpw $$2, agg $$3) {
      gt $$4 = dot.a($$0.a($$1), coh.a, $$2, $$0);
      $$3.b($$4, cju.eU.m());
      ctp $$5 = (ctp)$$3.c_($$4);
      $$5.c().a("test runthis");
      gt $$6 = dot.a($$4.b(0, 0, -1), coh.a, $$2, $$4);
      $$3.b($$6, cju.cV.m().a($$2));
   }

   public static void a(String $$0, gt $$1, hs $$2, cpw $$3, agg $$4) {
      dkt $$5 = a($$1, $$2, $$3);
      a($$5, $$1.v(), $$4);
      $$4.b($$1, cju.nL.m());
      cuo $$6 = (cuo)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new abb($$0));
      $$6.a($$2);
      $$6.a(cwx.a);
      $$6.e(true);
   }

   public static cuo a(String $$0, gt $$1, cpw $$2, int $$3, agg $$4, boolean $$5) {
      hs $$6 = a($$0, $$4).a();
      dkt $$7 = a($$1, $$6, $$2);
      gt $$8;
      if ($$2 == cpw.a) {
         $$8 = $$1;
      } else if ($$2 == cpw.b) {
         $$8 = $$1.b($$6.w() - 1, 0, 0);
      } else if ($$2 == cpw.c) {
         $$8 = $$1.b($$6.u() - 1, 0, $$6.w() - 1);
      } else {
         if ($$2 != cpw.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$8 = $$1.b(0, 0, $$6.u() - 1);
      }

      a($$1, $$4);
      a($$7, $$1.v(), $$4);
      cuo $$13 = a($$0, $$8, $$2, $$4, $$5);
      $$4.l().a($$7);
      $$4.a($$7);
      return $$13;
   }

   private static void a(gt $$0, agg $$1) {
      cge $$2 = new cge($$0);

      for(int $$3 = -1; $$3 < 4; ++$$3) {
         for(int $$4 = -1; $$4 < 4; ++$$4) {
            int $$5 = $$2.e + $$3;
            int $$6 = $$2.f + $$4;
            $$1.a($$5, $$6, true);
         }
      }

   }

   public static void a(dkt $$0, int $$1, agg $$2) {
      dkt $$3 = new dkt($$0.g() - 2, $$0.h() - 3, $$0.i() - 3, $$0.j() + 3, $$0.k() + 20, $$0.l() + 3);
      gt.a($$3).forEach($$2x -> a($$1, $$2x, $$2));
      $$2.l().a($$3);
      $$2.a($$3);
      dwl $$4 = new dwl((double)$$3.g(), (double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l());
      List<bbn> $$5 = $$2.a(bbn.class, $$4, $$0x -> !($$0x instanceof buc));
      $$5.forEach(bbn::ah);
   }

   public static dkt a(gt $$0, hs $$1, cpw $$2) {
      gt $$3 = $$0.a($$1).b(-1, -1, -1);
      gt $$4 = dot.a($$3, coh.a, $$2, $$0);
      dkt $$5 = dkt.a($$0, $$4);
      int $$6 = Math.min($$5.g(), $$5.j());
      int $$7 = Math.min($$5.i(), $$5.l());
      return $$5.a($$0.u() - $$6, 0, $$0.w() - $$7);
   }

   public static Optional<gt> a(gt $$0, int $$1, agg $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static gt b(gt $$0, int $$1, agg $$2) {
      Comparator<gt> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<gt> $$4 = c($$0, $$1, $$2);
      Optional<gt> $$5 = $$4.stream().min($$3);
      return (gt)$$5.orElse(null);
   }

   public static Collection<gt> c(gt $$0, int $$1, agg $$2) {
      Collection<gt> $$3 = Lists.newArrayList();
      dwl $$4 = new dwl($$0);
      $$4 = $$4.g((double)$$1);

      for(int $$5 = (int)$$4.a; $$5 <= (int)$$4.d; ++$$5) {
         for(int $$6 = (int)$$4.b; $$6 <= (int)$$4.e; ++$$6) {
            for(int $$7 = (int)$$4.c; $$7 <= (int)$$4.f; ++$$7) {
               gt $$8 = new gt($$5, $$6, $$7);
               cvo $$9 = $$2.a_($$8);
               if ($$9.a(cju.nL)) {
                  $$3.add($$8);
               }
            }
         }
      }

      return $$3;
   }

   private static dot a(String $$0, agg $$1) {
      dou $$2 = $$1.p();
      Optional<dot> $$3 = $$2.b(new abb($$0));
      if ($$3.isPresent()) {
         return (dot)$$3.get();
      } else {
         String $$4 = $$0 + ".snbt";
         Path $$5 = Paths.get(b, $$4);
         pj $$6 = a($$5);
         if ($$6 == null) {
            throw new RuntimeException("Could not find structure file " + $$5 + ", and the structure is not available in the world structures either.");
         } else {
            return $$2.a($$6);
         }
      }
   }

   private static cuo a(String $$0, gt $$1, cpw $$2, agg $$3, boolean $$4) {
      $$3.b($$1, cju.nL.m());
      cuo $$5 = (cuo)$$3.c_($$1);
      $$5.a(cwx.b);
      $$5.a($$2);
      $$5.a(false);
      $$5.a(new abb($$0));
      $$5.a($$3, $$4);
      if ($$5.j() != hs.g) {
         return $$5;
      } else {
         dot $$6 = a($$0, $$3);
         $$5.a($$3, $$4, $$6);
         if ($$5.j() == hs.g) {
            throw new RuntimeException("Failed to load structure " + $$0);
         } else {
            return $$5;
         }
      }
   }

   @Nullable
   private static pj a(Path $$0) {
      try {
         BufferedReader $$1 = Files.newBufferedReader($$0);
         String $$2 = IOUtils.toString($$1);
         return pv.a($$2);
      } catch (IOException var3) {
         return null;
      } catch (CommandSyntaxException var4) {
         throw new RuntimeException("Error while trying to load structure " + $$0, var4);
      }
   }

   private static void a(int $$0, gt $$1, agg $$2) {
      cvo $$3 = null;
      djf $$4 = djf.a($$2.s().d(hm.aR), $$2.s().d(hm.aO));
      List<cvo> $$5 = $$4.f();
      int $$6 = $$1.v() - $$2.u_();
      if ($$1.v() < $$0 && $$6 > 0 && $$6 <= $$5.size()) {
         $$3 = (cvo)$$5.get($$6 - 1);
      }

      if ($$3 == null) {
         $$3 = cju.a.m();
      }

      fc $$7 = new fc($$3, Collections.emptySet(), null);
      $$7.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(gt $$0, gt $$1, agg $$2) {
      cuo $$3 = (cuo)$$2.c_($$0);
      dwl $$4 = a($$3).g(1.0);
      return $$4.d(dwq.a($$1));
   }
}
