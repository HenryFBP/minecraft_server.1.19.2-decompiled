import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public abstract class cxm implements cxv, AutoCloseable {
   @Nullable
   public cxt a(int $$0, int $$1, boolean $$2) {
      return (cxt)this.a($$0, $$1, cxn.o, $$2);
   }

   @Nullable
   public cxt a(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   @Nullable
   @Override
   public cgd c(int $$0, int $$1) {
      return this.a($$0, $$1, cxn.c, false);
   }

   public boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, cxn.o, false) != null;
   }

   @Nullable
   public abstract cxj a(int var1, int var2, cxn var3, boolean var4);

   public abstract void a(BooleanSupplier var1, boolean var2);

   public abstract String e();

   public abstract int i();

   public void close() throws IOException {
   }

   public abstract dpm o();

   public void a(boolean $$0, boolean $$1) {
   }

   public void a(cge $$0, boolean $$1) {
   }
}
