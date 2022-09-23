import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cgy extends cgj, che {
   @Override
   default long af() {
      return this.n_().f();
   }

   long t_();

   dxw<cjt> K();

   private <T> dya<T> a(gt $$0, T $$1, int $$2, dye $$3) {
      return new dya<>($$1, $$0, this.n_().e() + (long)$$2, $$3, this.t_());
   }

   private <T> dya<T> a(gt $$0, T $$1, int $$2) {
      return new dya<>($$1, $$0, this.n_().e() + (long)$$2, this.t_());
   }

   default void a(gt $$0, cjt $$1, int $$2, dye $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gt $$0, cjt $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   dxw<dpu> J();

   default void a(gt $$0, dpu $$1, int $$2, dye $$3) {
      this.J().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gt $$0, dpu $$1, int $$2) {
      this.J().a(this.a($$0, $$1, $$2));
   }

   drn n_();

   bah d_(gt var1);

   @Nullable
   MinecraftServer n();

   default bag ag() {
      return this.n_().s();
   }

   cxm I();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.I().b($$0, $$1);
   }

   amn r_();

   default void b(gt $$0, cjt $$1) {
   }

   default void a(gy $$0, cvo $$1, gt $$2, gt $$3, int $$4, int $$5) {
      dqy.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   void a(@Nullable buc var1, gt var2, ajv var3, ajx var4, float var5, float var6);

   void a(im var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable buc var1, int var2, gt var3, int var4);

   default void c(int $$0, gt $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(czv var1, dwq var2, czv.a var3);

   default void a(@Nullable bbn $$0, czv $$1, dwq $$2) {
      this.a($$1, $$2, new czv.a($$0, null));
   }

   default void a(@Nullable bbn $$0, czv $$1, gt $$2) {
      this.a($$1, $$2, new czv.a($$0, null));
   }

   default void a(czv $$0, gt $$1, czv.a $$2) {
      this.a($$0, dwq.a($$1), $$2);
   }
}
