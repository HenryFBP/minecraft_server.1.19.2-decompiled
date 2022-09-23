import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class age extends cxm {
   private static final List<cxn> b = cxn.a();
   private final afz c;
   final agg d;
   final Thread e;
   final agj f;
   private final age.b g;
   public final aft a;
   private final drm h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final cxn[] n = new cxn[4];
   private final cxj[] o = new cxj[4];
   @Nullable
   @ang
   private chi.d p;

   public age(agg $$0, drq.c $$1, DataFixer $$2, dou $$3, Executor $$4, cxk $$5, int $$6, int $$7, boolean $$8, agp $$9, czb $$10, Supplier<drm> $$11) {
      this.d = $$0;
      this.g = new age.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ab()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new drm($$12, $$2);
      this.a = new aft($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.i();
      this.c.b($$7);
      this.q();
   }

   public agj a() {
      return this.f;
   }

   @Nullable
   private afs b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.g();
   }

   private void a(long $$0, cxj $$1, cxn $$2) {
      for(int $$3 = 3; $$3 > 0; --$$3) {
         this.m[$$3] = this.m[$$3 - 1];
         this.n[$$3] = this.n[$$3 - 1];
         this.o[$$3] = this.o[$$3 - 1];
      }

      this.m[0] = $$0;
      this.n[0] = $$2;
      this.o[0] = $$1;
   }

   @Nullable
   @Override
   public cxj a(int $$0, int $$1, cxn $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return (cxj)CompletableFuture.supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         awz $$4 = this.d.ac();
         $$4.d("getChunk");
         long $$5 = cge.c($$0, $$1);

         for(int $$6 = 0; $$6 < 4; ++$$6) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               cxj $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<Either<cxj, afs.a>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         cxj $$9 = (cxj)((Either)$$8.join()).map($$0x -> $$0x, $$1x -> {
            if ($$3) {
               throw (IllegalStateException)ad.c(new IllegalStateException("Chunk not there when requested: " + $$1x));
            } else {
               return null;
            }
         });
         this.a($$5, $$9, $$2);
         return $$9;
      }
   }

   @Nullable
   @Override
   public cxt a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ac().d("getChunkNow");
         long $$2 = cge.c($$0, $$1);

         for(int $$3 = 0; $$3 < 4; ++$$3) {
            if ($$2 == this.m[$$3] && this.n[$$3] == cxn.o) {
               cxj $$4 = this.o[$$3];
               return $$4 instanceof cxt ? (cxt)$$4 : null;
            }
         }

         afs $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            Either<cxj, afs.a> $$6 = (Either)$$5.b(cxn.o).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               cxj $$7 = (cxj)$$6.left().orElse(null);
               if ($$7 != null) {
                  this.a($$2, $$7, cxn.o);
                  if ($$7 instanceof cxt) {
                     return (cxt)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void q() {
      Arrays.fill(this.m, cge.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<Either<cxj, afs.a>> b(int $$0, int $$1, cxn $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<Either<cxj, afs.a>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<Either<cxj, afs.a>> c(int $$0, int $$1, cxn $$2, boolean $$3) {
      cge $$4 = new cge($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = 33 + cxn.a($$2);
      afs $$7 = this.b($$5);
      if ($$3) {
         this.c.a(agl.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            awz $$8 = this.d.ac();
            $$8.a("chunkLoad");
            this.r();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ad.c(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? afs.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable afs $$0, int $$1) {
      return $$0 == null || $$0.k() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      afs $$2 = this.b(new cge($$0, $$1).a());
      int $$3 = 33 + cxn.a(cxn.o);
      return !this.a($$2, $$3);
   }

   @Override
   public cgd c(int $$0, int $$1) {
      long $$2 = cge.c($$0, $$1);
      afs $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while(true) {
            cxn $$5 = (cxn)b.get($$4);
            Optional<cxj> $$6 = ((Either)$$3.a($$5).getNow(afs.a)).left();
            if ($$6.isPresent()) {
               return (cgd)$$6.get();
            }

            if ($$5 == cxn.l.e()) {
               return null;
            }

            --$$4;
         }
      }
   }

   public cgx c() {
      return this.d;
   }

   public boolean d() {
      return this.g.x();
   }

   boolean r() {
      boolean $$0 = this.c.a(this.a);
      boolean $$1 = this.a.f();
      if (!$$0 && !$$1) {
         return false;
      } else {
         this.q();
         return true;
      }
   }

   public boolean a(long $$0) {
      afs $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         Either<cxt, afs.a> $$2 = (Either)$$1.a().getNow(null);
         return $$2 != null && $$2.left().isPresent();
      }
   }

   public void a(boolean $$0) {
      this.r();
      this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a(true);
      this.f.close();
      this.a.close();
   }

   @Override
   public void a(BooleanSupplier $$0, boolean $$1) {
      this.d.ac().a("purge");
      this.c.a();
      this.r();
      this.d.ac().b("chunks");
      if ($$1) {
         this.s();
      }

      this.d.ac().b("unload");
      this.a.a($$0);
      this.d.ac().c();
      this.q();
   }

   private void s() {
      long $$0 = this.d.U();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      boolean $$2 = this.d.ae();
      if ($$2) {
         this.a.k();
      } else {
         drn $$3 = this.d.n_();
         awz $$4 = this.d.ac();
         $$4.a("pollingChunks");
         int $$5 = this.d.W().c(cgt.n);
         boolean $$6 = $$3.e() % 400L == 0L;
         $$4.a("naturalSpawnCount");
         int $$7 = this.c.b();
         chi.d $$8 = chi.a($$7, this.d.z(), this::a, new chh(this.a));
         this.p = $$8;
         $$4.b("filteringLoadedChunks");
         List<age.a> $$9 = Lists.newArrayListWithCapacity($$7);

         for(afs $$10 : this.a.j()) {
            cxt $$11 = $$10.d();
            if ($$11 != null) {
               $$9.add(new age.a($$11, $$10));
            }
         }

         $$4.b("spawnAndTick");
         boolean $$12 = this.d.W().b(cgt.e);
         Collections.shuffle($$9);

         for(age.a $$13 : $$9) {
            cxt $$14 = $$13.a;
            cge $$15 = $$14.f();
            if (this.d.a($$15) && this.a.d($$15)) {
               $$14.a($$1);
               if ($$12 && (this.j || this.k) && this.d.p_().a($$15)) {
                  chi.a(this.d, $$14, $$8, this.k, this.j, $$6);
               }

               if (this.d.a($$15.a())) {
                  this.d.a($$14, $$5);
               }
            }
         }

         $$4.b("customSpawners");
         if ($$12) {
            this.d.a(this.j, this.k);
         }

         $$4.b("broadcast");
         $$9.forEach($$0x -> $$0x.b.a($$0x.a));
         $$4.c();
         $$4.c();
         this.a.k();
      }
   }

   private void a(long $$0, Consumer<cxt> $$1) {
      afs $$2 = this.b($$0);
      if ($$2 != null) {
         ((Either)$$2.c().getNow(afs.c)).left().ifPresent($$1);
      }

   }

   @Override
   public String e() {
      return Integer.toString(this.i());
   }

   @VisibleForTesting
   public int f() {
      return this.g.bn();
   }

   public cxk g() {
      return this.a.a();
   }

   public dbf h() {
      return this.a.b();
   }

   @Override
   public int i() {
      return this.a.h();
   }

   public void a(gt $$0) {
      int $$1 = hq.a($$0.u());
      int $$2 = hq.a($$0.w());
      afs $$3 = this.b(cge.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }

   }

   @Override
   public void a(chg $$0, hq $$1) {
      this.g.execute(() -> {
         afs $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }

      });
   }

   public <T> void a(agl<T> $$0, cge $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(agl<T> $$0, cge $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cge $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(agh $$0) {
      if (!$$0.dt()) {
         this.a.a($$0);
      }

   }

   public void a(bbn $$0) {
      this.a.b($$0);
   }

   public void b(bbn $$0) {
      this.a.a($$0);
   }

   public void a(bbn $$0, tc<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bbn $$0, tc<?> $$1) {
      this.a.a($$0, $$1);
   }

   public void a(int $$0) {
      this.a.a($$0);
   }

   public void b(int $$0) {
      this.c.b($$0);
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public String a(cge $$0) {
      return this.a.a($$0);
   }

   public drm j() {
      return this.h;
   }

   public bms k() {
      return this.a.l();
   }

   public cyh l() {
      return this.a.o();
   }

   @Nullable
   @ang
   public chi.d m() {
      return this.p;
   }

   public void n() {
      this.c.e();
   }

   static record a(cxt a, afs b) {
      final cxt a;
      final afs b;
   }

   final class b extends ayz<Runnable> {
      b(cgx $$0) {
         super("Chunk source main thread executor for " + $$0.ab().a());
      }

      @Override
      protected Runnable f(Runnable $$0) {
         return $$0;
      }

      @Override
      protected boolean e(Runnable $$0) {
         return true;
      }

      @Override
      protected boolean at() {
         return true;
      }

      @Override
      protected Thread au() {
         return age.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         age.this.d.ac().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean x() {
         if (age.this.r()) {
            return true;
         } else {
            age.this.f.a();
            return super.x();
         }
      }
   }
}
