import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface bvx extends bac, bam {
   dwq cY();

   @Nullable
   abb y();

   void a(@Nullable abb var1);

   long z();

   void a(long var1);

   hi<cax> A();

   void C();

   cgx W();

   boolean dt();

   @Override
   default boolean c() {
      return this.g();
   }

   default void c(pj $$0) {
      if (this.y() != null) {
         $$0.a("LootTable", this.y().toString());
         if (this.z() != 0L) {
            $$0.a("LootTableSeed", this.z());
         }
      } else {
         bad.a($$0, this.A());
      }

   }

   default void a_(pj $$0) {
      this.C();
      if ($$0.b("LootTable", 8)) {
         this.a(new abb($$0.l("LootTable")));
         this.a($$0.i("LootTableSeed"));
      } else {
         bad.b($$0, this.A());
      }

   }

   default void a(baw $$0, cgx $$1, bbn $$2) {
      if ($$1.W().b(cgt.h)) {
         baf.a($$1, $$2, this);
         if (!$$1.y) {
            bbn $$3 = $$0.l();
            if ($$3 != null && $$3.ad() == bbr.bn) {
               bst.a((buc)$$3, true);
            }
         }

      }
   }

   default baj a(BiConsumer<czv, bbn> $$0, buc $$1) {
      $$1.a(this);
      if (!$$1.s.y) {
         $$0.accept(czv.k, $$1);
         bst.a($$1, true);
         return baj.b;
      } else {
         return baj.a;
      }
   }

   default void e(@Nullable buc $$0) {
      MinecraftServer $$1 = this.W().n();
      if (this.y() != null && $$1 != null) {
         dsg $$2 = $$1.aH().a(this.y());
         if ($$0 != null) {
            aj.N.a((agh)$$0, this.y());
         }

         this.a(null);
         dsd.a $$3 = new dsd.a((agg)this.W()).a(dul.f, this.cY()).a(this.z());
         if ($$0 != null) {
            $$3.a($$0.fX()).a(dul.a, $$0);
         }

         $$2.a(this, $$3.a(duk.b));
      }

   }

   default void f() {
      this.e(null);
      this.A().clear();
   }

   default boolean g() {
      for(cax $$0 : this.A()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   default cax c_(int $$0) {
      this.e(null);
      cax $$1 = this.A().get($$0);
      if ($$1.b()) {
         return cax.b;
      } else {
         this.A().set($$0, cax.b);
         return $$1;
      }
   }

   default cax d_(int $$0) {
      this.e(null);
      return this.A().get($$0);
   }

   default cax b(int $$0, int $$1) {
      this.e(null);
      return bad.a(this.A(), $$0, $$1);
   }

   default void c(int $$0, cax $$1) {
      this.e(null);
      this.A().set($$0, $$1);
      if (!$$1.b() && $$1.K() > this.O_()) {
         $$1.e(this.O_());
      }

   }

   default bct e_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new bct() {
         @Override
         public cax a() {
            return bvx.this.d_($$0);
         }

         @Override
         public boolean a(cax $$0x) {
            bvx.this.c($$0, $$0);
            return true;
         }
      } : bct.a;
   }

   default boolean f(buc $$0) {
      return !this.dt() && this.cY().a((hj)$$0.cY(), 8.0);
   }
}
