import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqg {
   private static final Logger a = LogUtils.getLogger();
   private final bpp b;
   private final bpz[] c = new bpz[bqf.c()];
   @Nullable
   private bpz d;

   public bqg(bpp $$0) {
      this.b = $$0;
      this.a(bqf.k);
   }

   public void a(bqf<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b($$0);
         if (!this.b.s.y) {
            this.b.ai().b(bpp.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.s.y ? "client" : "server");
         this.d.d();
      }
   }

   public bpz a() {
      return this.d;
   }

   public <T extends bpz> T b(bqf<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
