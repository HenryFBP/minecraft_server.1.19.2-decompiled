import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bpt extends bpr {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private dwq d;
   private int e;

   public bpt(bpp $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.fG().a(bqf.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.fG().a(bqf.a);
      } else {
         double $$0 = this.d.c(this.a.df(), this.a.dh(), this.a.dl());
         if ($$0 < 100.0 || $$0 > 22500.0 || this.a.z || this.a.A) {
            ++this.e;
         }

      }
   }

   @Override
   public void d() {
      this.d = null;
      this.e = 0;
   }

   public void a(dwq $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public dwq g() {
      return this.d;
   }

   @Override
   public bqf<bpt> i() {
      return bqf.i;
   }
}
