import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cxn {
   public static final int a = 8;
   private static final EnumSet<dar.a> p = EnumSet.of(dar.a.c, dar.a.a);
   public static final EnumSet<dar.a> b = EnumSet.of(dar.a.d, dar.a.b, dar.a.e, dar.a.f);
   private static final cxn.c q = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if ($$5 instanceof cyc $$6 && !$$5.j().b($$0)) {
         $$6.a($$0);
      }

      return CompletableFuture.completedFuture(Either.left($$5));
   };
   public static final cxn c = a("empty", null, -1, p, cxn.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final cxn d = a("structure_starts", c, 0, p, cxn.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
      if (!$$8.j().b($$0)) {
         if ($$2.n().aW().A().b()) {
            $$3.a($$2.s(), $$2.k().h(), $$2.a(), $$8, $$4, $$2.B());
         }

         if ($$8 instanceof cyc $$10) {
            $$10.a($$0);
         }

         $$2.a($$8);
      }

      return CompletableFuture.completedFuture(Either.left($$8));
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.j().b($$0)) {
         if ($$5 instanceof cyc $$6) {
            $$6.a($$0);
         }

         $$1.a($$5);
      }

      return CompletableFuture.completedFuture(Either.left($$5));
   });
   public static final cxn e = a("structure_references", d, 8, p, cxn.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      agn $$5 = new agn($$1, $$3, $$0, -1);
      $$2.a($$5, $$1.a().a($$5), $$4);
   });
   public static final cxn f = a("biomes", e, 8, p, cxn.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
      if (!$$9 && $$8.j().b($$0)) {
         return CompletableFuture.completedFuture(Either.left($$8));
      } else {
         agn $$10 = new agn($$2, $$7, $$0, -1);
         return $$3.a($$2.s().d(hm.aR), $$1, $$2.k().h(), dbr.a($$10), $$2.a().a($$10), $$8).thenApply($$1x -> {
            if ($$1x instanceof cyc) {
               ((cyc)$$1x).a($$0);
            }

            return Either.left($$1x);
         });
      }
   });
   public static final cxn g = a("noise", f, 8, p, cxn.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
      if (!$$9 && $$8.j().b($$0)) {
         return CompletableFuture.completedFuture(Either.left($$8));
      } else {
         agn $$10 = new agn($$2, $$7, $$0, 0);
         return $$3.a($$1, dbr.a($$10), $$2.k().h(), $$2.a().a($$10), $$8).thenApply($$1x -> {
            if ($$1x instanceof cyc $$2x) {
               daf $$3x = $$2x.x();
               if ($$3x != null) {
                  daf.a($$2x);
                  if ($$3x.b()) {
                     $$3x.b($$2x);
                  }
               }

               $$2x.a($$0);
            }

            return Either.left($$1x);
         });
      }
   });
   public static final cxn h = a("surface", g, 8, p, cxn.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      agn $$5 = new agn($$1, $$3, $$0, 0);
      $$2.a($$5, $$1.a().a($$5), $$1.k().h(), $$4);
   });
   public static final cxn i = a("carvers", h, 8, p, cxn.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      agn $$5 = new agn($$1, $$3, $$0, 0);
      if ($$4 instanceof cyc $$6) {
         dbr.a($$5, $$6);
      }

      $$2.a($$5, $$1.B(), $$1.k().h(), $$1.s_(), $$1.a().a($$5), $$4, dan.a.a);
   });
   public static final cxn j = a("liquid_carvers", i, 8, b, cxn.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final cxn k = a("features", j, 8, b, cxn.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
      cyc $$10 = (cyc)$$8;
      $$10.a($$5);
      if ($$9 || !$$8.j().b($$0)) {
         dar.a($$8, EnumSet.of(dar.a.e, dar.a.f, dar.a.d, dar.a.b));
         agn $$11 = new agn($$2, $$7, $$0, 1);
         $$3.a($$11, $$8, $$2.a().a($$11));
         dbr.a($$11, $$8);
         $$10.a($$0);
      }

      return $$5.a($$8).thenApply(Either::left);
   }, ($$0, $$1, $$2, $$3, $$4, $$5) -> $$3.a($$5).thenApply(Either::left));
   public static final cxn l = a(
      "light", k, 1, b, cxn.a.a, ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> a($$0, $$5, $$8), ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$3, $$5)
   );
   public static final cxn m = a("spawn", l, 0, b, cxn.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
      if (!$$4.y()) {
         $$2.a(new agn($$1, $$3, $$0, -1));
      }

   });
   public static final cxn n = a("heightmaps", m, 0, b, cxn.a.a, ($$0, $$1, $$2, $$3, $$4) -> {
   });
   public static final cxn o = a(
      "full",
      n,
      0,
      b,
      cxn.a.b,
      ($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> (CompletableFuture<Either<cxj, afs.a>>)$$6.apply($$8),
      ($$0, $$1, $$2, $$3, $$4, $$5) -> (CompletableFuture<Either<cxj, afs.a>>)$$4.apply($$5)
   );
   private static final List<cxn> r = ImmutableList.of(o, k, j, f, d, d, d, d, d, d, d, d, new cxn[0]);
   private static final IntList s = ad.a(new IntArrayList(a().size()), $$0 -> {
      int $$1 = 0;

      for(int $$2 = a().size() - 1; $$2 >= 0; --$$2) {
         while($$1 + 1 < r.size() && $$2 <= ((cxn)r.get($$1 + 1)).c()) {
            ++$$1;
         }

         $$0.add(0, $$1);
      }

   });
   private final String t;
   private final int u;
   private final cxn v;
   private final cxn.b w;
   private final cxn.c x;
   private final int y;
   private final cxn.a z;
   private final EnumSet<dar.a> A;

   private static CompletableFuture<Either<cxj, afs.a>> a(cxn $$0, agj $$1, cxj $$2) {
      boolean $$3 = a($$0, $$2);
      if (!$$2.j().b($$0)) {
         ((cyc)$$2).a($$0);
      }

      return $$1.a($$2, $$3).thenApply(Either::left);
   }

   private static cxn a(String $$0, @Nullable cxn $$1, int $$2, EnumSet<dar.a> $$3, cxn.a $$4, cxn.d $$5) {
      return a($$0, $$1, $$2, $$3, $$4, (cxn.b)$$5);
   }

   private static cxn a(String $$0, @Nullable cxn $$1, int $$2, EnumSet<dar.a> $$3, cxn.a $$4, cxn.b $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, q);
   }

   private static cxn a(String $$0, @Nullable cxn $$1, int $$2, EnumSet<dar.a> $$3, cxn.a $$4, cxn.b $$5, cxn.c $$6) {
      return hm.a(hm.ae, $$0, new cxn($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   public static List<cxn> a() {
      List<cxn> $$0 = Lists.newArrayList();

      cxn $$1;
      for($$1 = o; $$1.e() != $$1; $$1 = $$1.e()) {
         $$0.add($$1);
      }

      $$0.add($$1);
      Collections.reverse($$0);
      return $$0;
   }

   private static boolean a(cxn $$0, cxj $$1) {
      return $$1.j().b($$0) && $$1.v();
   }

   public static cxn a(int $$0) {
      if ($$0 >= r.size()) {
         return c;
      } else {
         return $$0 < 0 ? o : (cxn)r.get($$0);
      }
   }

   public static int b() {
      return r.size();
   }

   public static int a(cxn $$0) {
      return s.getInt($$0.c());
   }

   cxn(String $$0, @Nullable cxn $$1, int $$2, EnumSet<dar.a> $$3, cxn.a $$4, cxn.b $$5, cxn.c $$6) {
      this.t = $$0;
      this.v = $$1 == null ? this : $$1;
      this.w = $$5;
      this.x = $$6;
      this.y = $$2;
      this.z = $$4;
      this.A = $$3;
      this.u = $$1 == null ? 0 : $$1.c() + 1;
   }

   public int c() {
      return this.u;
   }

   public String d() {
      return this.t;
   }

   public cxn e() {
      return this.v;
   }

   public CompletableFuture<Either<cxj, afs.a>> a(
      Executor $$0, agg $$1, cxk $$2, dou $$3, agj $$4, Function<cxj, CompletableFuture<Either<cxj, afs.a>>> $$5, List<cxj> $$6, boolean $$7
   ) {
      cxj $$8 = (cxj)$$6.get($$6.size() / 2);
      axi $$9 = axf.e.a($$8.f(), $$1.ab(), this.t);
      CompletableFuture<Either<cxj, afs.a>> $$10 = this.w.doWork(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$7);
      return $$9 != null ? $$10.thenApply($$1x -> {
         $$9.finish();
         return $$1x;
      }) : $$10;
   }

   public CompletableFuture<Either<cxj, afs.a>> a(agg $$0, dou $$1, agj $$2, Function<cxj, CompletableFuture<Either<cxj, afs.a>>> $$3, cxj $$4) {
      return this.x.doWork(this, $$0, $$1, $$2, $$3, $$4);
   }

   public int f() {
      return this.y;
   }

   public cxn.a g() {
      return this.z;
   }

   public static cxn a(String $$0) {
      return hm.ae.a(abb.a($$0));
   }

   public EnumSet<dar.a> h() {
      return this.A;
   }

   public boolean b(cxn $$0) {
      return this.c() >= $$0.c();
   }

   public String toString() {
      return hm.ae.b(this).toString();
   }

   public static enum a {
      a,
      b;
   }

   interface b {
      CompletableFuture<Either<cxj, afs.a>> doWork(
         cxn var1,
         Executor var2,
         agg var3,
         cxk var4,
         dou var5,
         agj var6,
         Function<cxj, CompletableFuture<Either<cxj, afs.a>>> var7,
         List<cxj> var8,
         cxj var9,
         boolean var10
      );
   }

   interface c {
      CompletableFuture<Either<cxj, afs.a>> doWork(cxn var1, agg var2, dou var3, agj var4, Function<cxj, CompletableFuture<Either<cxj, afs.a>>> var5, cxj var6);
   }

   interface d extends cxn.b {
      @Override
      default CompletableFuture<Either<cxj, afs.a>> doWork(
         cxn $$0,
         Executor $$1,
         agg $$2,
         cxk $$3,
         dou $$4,
         agj $$5,
         Function<cxj, CompletableFuture<Either<cxj, afs.a>>> $$6,
         List<cxj> $$7,
         cxj $$8,
         boolean $$9
      ) {
         if ($$9 || !$$8.j().b($$0)) {
            this.doWork($$0, $$2, $$3, $$7, $$8);
            if ($$8 instanceof cyc $$10) {
               $$10.a($$0);
            }
         }

         return CompletableFuture.completedFuture(Either.left($$8));
      }

      void doWork(cxn var1, agg var2, cxk var3, List<cxj> var4, cxj var5);
   }
}
