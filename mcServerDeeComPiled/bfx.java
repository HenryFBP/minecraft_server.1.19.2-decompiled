import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bfx extends bdo<btp> {
   private static final int a = 900;
   private static final int d = 40;
   @Nullable
   private cax e;
   private final List<cax> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bfx(int $$0, int $$1) {
      super(ImmutableMap.of(bku.q, bkv.a), $$0, $$1);
   }

   public boolean a(agg $$0, btp $$1) {
      bcx<?> $$2 = $$1.dy();
      if (!$$2.c(bku.q).isPresent()) {
         return false;
      } else {
         bcc $$3 = (bcc)$$2.c(bku.q).get();
         return $$3.ad() == bbr.bn && $$1.bo() && $$3.bo() && !$$1.y_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(agg $$0, btp $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dy().c(bku.q).isPresent();
   }

   public void b(agg $$0, btp $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(agg $$0, btp $$1, long $$2) {
      bcc $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      --this.i;
   }

   public void d(agg $$0, btp $$1, long $$2) {
      super.c($$0, $$1, $$2);
      $$1.dy().b(bku.q);
      c($$1);
      this.e = null;
   }

   private void a(bcc $$0, btp $$1) {
      boolean $$2 = false;
      cax $$3 = $$0.ez();
      if (this.e == null || !cax.c(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.b()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }

   }

   private void a(btp $$0) {
      a($$0, (cax)this.f.get(0));
   }

   private void b(btp $$0) {
      for(cfv $$1 : $$0.fM()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.d());
         }
      }

   }

   private boolean a(cfv $$0) {
      return cax.c(this.e, $$0.b()) || cax.c(this.e, $$0.c());
   }

   private static void c(btp $$0) {
      $$0.a(bbs.a, cax.b);
      $$0.a(bbs.a, 0.085F);
   }

   private static void a(btp $$0, cax $$1) {
      $$0.a(bbs.a, $$1);
      $$0.a(bbs.a, 0.0F);
   }

   private bcc d(btp $$0) {
      bcx<?> $$1 = $$0.dy();
      bcc $$2 = (bcc)$$1.c(bku.q).get();
      $$1.a(bku.n, new bdy($$2, true));
      return $$2;
   }

   private void e(btp $$0) {
      if (this.f.size() >= 2 && ++this.g >= 40) {
         ++this.h;
         this.g = 0;
         if (this.h > this.f.size() - 1) {
            this.h = 0;
         }

         a($$0, (cax)this.f.get(this.h));
      }

   }
}
