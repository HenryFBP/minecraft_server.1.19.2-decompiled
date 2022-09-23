import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cuh extends cti implements dab.b {
   private static final Logger a = LogUtils.getLogger();
   private dab b;
   private int c;

   public cuh(gt $$0, cvo $$1) {
      super(ctk.H, $$0, $$1);
      this.b = new dab(new czr(this.o), ((cqd)$$1.b()).d(), this, null, 0.0F, 0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.c = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dab.a(this).parse(new Dynamic(pu.a, $$0.p("listener"))).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.c);
      dab.a(this).encodeStart(pu.a, this.b).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   public dab c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public boolean a(agg $$0, czx $$1, gt $$2, czv $$3, @Nullable czv.a $$4) {
      return !this.r() && (!$$2.equals(this.p()) || $$3 != czv.f && $$3 != czv.i) ? cqd.n(this.q()) : false;
   }

   @Override
   public void a(agg $$0, czx $$1, gt $$2, czv $$3, @Nullable bbn $$4, @Nullable bbn $$5, float $$6) {
      cvo $$7 = this.q();
      if (cqd.n($$7)) {
         this.c = cqd.c.getInt($$3);
         cqd.a($$4, $$0, this.o, $$7, a($$6, $$1.b()));
      }

   }

   @Override
   public void f() {
      this.e();
   }

   public static int a(float $$0, int $$1) {
      double $$2 = (double)$$0 / (double)$$1;
      return Math.max(1, 15 - ami.b($$2 * 15.0));
   }

   public void a(int $$0) {
      this.c = $$0;
   }
}
