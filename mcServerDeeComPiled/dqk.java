import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import javax.annotation.Nullable;

public abstract class dqk {
   protected chk a;
   protected bce b;
   protected final Int2ObjectMap<dqj> c = new Int2ObjectOpenHashMap();
   protected int d;
   protected int e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;

   public void a(chk $$0, bce $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c.clear();
      this.d = ami.d($$1.cW() + 1.0F);
      this.e = ami.d($$1.cX() + 1.0F);
      this.f = ami.d($$1.cW() + 1.0F);
   }

   public void b() {
      this.a = null;
      this.b = null;
   }

   @Nullable
   protected dqj b(gt $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   @Nullable
   protected dqj a(int $$0, int $$1, int $$2) {
      return (dqj)this.c.computeIfAbsent(dqj.b($$0, $$1, $$2), $$3 -> new dqj($$0, $$1, $$2));
   }

   @Nullable
   public abstract dqj a();

   @Nullable
   public abstract dqp a(double var1, double var3, double var5);

   @Nullable
   protected dqp a(@Nullable dqj $$0) {
      return $$0 != null ? new dqp($$0) : null;
   }

   public abstract int a(dqj[] var1, dqj var2);

   public abstract dqh a(cgd var1, int var2, int var3, int var4, bce var5, int var6, int var7, int var8, boolean var9, boolean var10);

   public abstract dqh a(cgd var1, int var2, int var3, int var4);

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public void b(boolean $$0) {
      this.h = $$0;
   }

   public void c(boolean $$0) {
      this.i = $$0;
   }

   public boolean d() {
      return this.g;
   }

   public boolean e() {
      return this.h;
   }

   public boolean f() {
      return this.i;
   }
}
