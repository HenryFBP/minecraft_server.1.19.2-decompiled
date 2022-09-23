import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cui extends cti implements dab.b {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 8;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 40;
   private static final Int2ObjectMap<ajv> h = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ajw.wE);
      $$0.put(2, ajw.wF);
      $$0.put(3, ajw.wG);
      $$0.put(4, ajw.wD);
   });
   private static final int i = 90;
   private int j;
   private dab k = new dab(new czr(this.o), 8, this, null, 0.0F, 0);

   public cui(gt $$0, cvo $$1) {
      super(ctk.J, $$0, $$1);
   }

   public dab c() {
      return this.k;
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.j = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dab.a(this).parse(new Dynamic(pu.a, $$0.p("listener"))).resultOrPartial(a::error).ifPresent($$0x -> this.k = $$0x);
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("warning_level", this.j);
      dab.a(this).encodeStart(pu.a, this.k).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public akz<czv> a() {
      return akq.c;
   }

   @Override
   public boolean a(agg $$0, czx $$1, gt $$2, czv $$3, czv.a $$4) {
      return !this.r() && !this.q().c(cqe.a) && a($$4.a()) != null;
   }

   @Nullable
   public static agh a(@Nullable bbn $$0) {
      if ($$0 instanceof agh $$1) {
         return $$1;
      } else {
         if ($$0 != null) {
            bbn $$6 = $$0.cG();
            if ($$6 instanceof agh $$2) {
               return $$2;
            }
         }

         if ($$0 instanceof buu $$3) {
            bbn var3 = $$3.x();
            if (var3 instanceof agh $$4) {
               return $$4;
            }
         }

         if ($$0 instanceof bqv $$5) {
            bbn var9 = $$5.h();
            if (var9 instanceof agh $$6) {
               return $$6;
            }
         }

         return null;
      }
   }

   @Override
   public void a(agg $$0, czx $$1, gt $$2, czv $$3, @Nullable bbn $$4, @Nullable bbn $$5, float $$6) {
      this.a($$0, a($$5 != null ? $$5 : $$4));
   }

   public void a(agg $$0, @Nullable agh $$1) {
      if ($$1 != null) {
         cvo $$2 = this.q();
         if (!$$2.c(cqe.a)) {
            this.j = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bbn)$$1);
            }
         }
      }
   }

   private boolean b(agg $$0, agh $$1) {
      OptionalInt $$2 = bti.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.j = $$0x);
      return $$2.isPresent();
   }

   private void a(agg $$0, @Nullable bbn $$1) {
      gt $$2 = this.p();
      cvo $$3 = this.q();
      $$0.a($$2, $$3.a(cqe.a, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(czv.P, $$2, czv.a.a($$1));
   }

   private boolean b(agg $$0) {
      return this.q().c(cqe.c) && $$0.ag() != bag.a && $$0.W().b(cgt.H);
   }

   public void a(agg $$0) {
      if (this.b($$0) && this.j > 0) {
         if (!this.c($$0)) {
            this.d();
         }

         btg.a($$0, dwq.a(this.p()), null, 40);
      }

   }

   private void d() {
      ajv $$0 = (ajv)h.get(this.j);
      if ($$0 != null) {
         gt $$1 = this.p();
         int $$2 = $$1.u() + ami.b(this.n.w, -10, 10);
         int $$3 = $$1.v() + ami.b(this.n.w, -10, 10);
         int $$4 = $$1.w() + ami.b(this.n.w, -10, 10);
         this.n.a(null, (double)$$2, (double)$$3, (double)$$4, $$0, ajx.f, 5.0F, 1.0F);
      }

   }

   private boolean c(agg $$0) {
      return this.j < 4 ? false : amu.a(bbr.bc, bcg.k, $$0, this.p(), 20, 5, 6, amu.a.b).isPresent();
   }

   @Override
   public void f() {
      this.e();
   }
}
