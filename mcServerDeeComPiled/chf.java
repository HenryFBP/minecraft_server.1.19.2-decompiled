import javax.annotation.Nullable;

public interface chf {
   boolean a(gt var1, cvo var2, int var3, int var4);

   default boolean a(gt $$0, cvo $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gt var1, boolean var2);

   default boolean b(gt $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(gt $$0, boolean $$1, @Nullable bbn $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gt var1, boolean var2, @Nullable bbn var3, int var4);

   default boolean b(bbn $$0) {
      return false;
   }
}
