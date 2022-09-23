import java.util.Optional;
import javax.annotation.Nullable;

public abstract class dpu {
   public static final hg<dpv> c = new hg<>();
   protected final cvp<dpu, dpv> d;
   private dpv a;
   private final hc.c<dpu> b = hm.T.e(this);

   protected dpu() {
      cvp.a<dpu, dpv> $$0 = new cvp.a<>(this);
      this.a($$0);
      this.d = $$0.a(dpu::h, dpv::new);
      this.f(this.d.b());
   }

   protected void a(cvp.a<dpu, dpv> $$0) {
   }

   public cvp<dpu, dpv> g() {
      return this.d;
   }

   protected final void f(dpv $$0) {
      this.a = $$0;
   }

   public final dpv h() {
      return this.a;
   }

   public abstract cat a();

   protected void a(cgx $$0, gt $$1, dpv $$2, amn $$3) {
   }

   protected void a(cgx $$0, gt $$1, dpv $$2) {
   }

   protected void b(cgx $$0, gt $$1, dpv $$2, amn $$3) {
   }

   @Nullable
   protected im i() {
      return null;
   }

   protected abstract boolean a(dpv var1, cgd var2, gt var3, dpu var4, gy var5);

   protected abstract dwq a(cgd var1, gt var2, dpv var3);

   public abstract int a(cha var1);

   protected boolean j() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(dpv var1, cgd var2, gt var3);

   public abstract float a(dpv var1);

   protected abstract cvo b(dpv var1);

   public abstract boolean c(dpv var1);

   public abstract int d(dpv var1);

   public boolean a(dpu $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(akz<dpu> $$0) {
      return this.b.a($$0);
   }

   public abstract dxj b(dpv var1, cgd var2, gt var3);

   public Optional<ajv> k() {
      return Optional.empty();
   }

   @Deprecated
   public hc.c<dpu> l() {
      return this.b;
   }
}
