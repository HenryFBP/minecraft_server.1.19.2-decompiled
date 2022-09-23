import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqw implements dqy {
   private static final Logger b = LogUtils.getLogger();
   private final cgx c;
   private final int d;
   private final ArrayDeque<dqw.c> e = new ArrayDeque();
   private final List<dqw.c> f = new ArrayList();
   private int g = 0;

   public dqw(cgx $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(gy $$0, cvo $$1, gt $$2, gt $$3, int $$4, int $$5) {
      this.a($$2, new dqw.d($$0, $$1, $$2.h(), $$3.h(), $$4));
   }

   @Override
   public void a(gt $$0, cjt $$1, gt $$2) {
      this.a($$0, new dqw.e($$0, $$1, $$2.h()));
   }

   @Override
   public void a(cvo $$0, gt $$1, cjt $$2, gt $$3, boolean $$4) {
      this.a($$1, new dqw.a($$0, $$1.h(), $$2, $$3.h(), $$4));
   }

   @Override
   public void a(gt $$0, cjt $$1, @Nullable gy $$2) {
      this.a($$0, new dqw.b($$0.h(), $$1, $$2));
   }

   private void a(gt $$0, dqw.c $$1) {
      boolean $$2 = this.g > 0;
      boolean $$3 = this.d >= 0 && this.g >= this.d;
      ++this.g;
      if (!$$3) {
         if ($$2) {
            this.f.add($$1);
         } else {
            this.e.push($$1);
         }
      } else if (this.g - 1 == this.d) {
         b.error("Too many chained neighbor updates. Skipping the rest. First skipped position: " + $$0.x());
      }

      if (!$$2) {
         this.a();
      }

   }

   private void a() {
      try {
         while(!this.e.isEmpty() || !this.f.isEmpty()) {
            for(int $$0 = this.f.size() - 1; $$0 >= 0; --$$0) {
               this.e.push((dqw.c)this.f.get($$0));
            }

            this.f.clear();
            dqw.c $$1 = (dqw.c)this.e.peek();

            while(this.f.isEmpty()) {
               if (!$$1.a(this.c)) {
                  this.e.pop();
                  break;
               }
            }
         }
      } finally {
         this.e.clear();
         this.f.clear();
         this.g = 0;
      }

   }

   static record a(cvo a, gt b, cjt c, gt d, boolean e) implements dqw.c {
      @Override
      public boolean a(cgx $$0) {
         dqy.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements dqw.c {
      private final gt a;
      private final cjt b;
      @Nullable
      private final gy c;
      private int d = 0;

      b(gt $$0, cjt $$1, @Nullable gy $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         if (dqy.a[this.d] == $$2) {
            ++this.d;
         }

      }

      @Override
      public boolean a(cgx $$0) {
         gt $$1 = this.a.a(dqy.a[this.d++]);
         cvo $$2 = $$0.a_($$1);
         $$2.a($$0, $$1, this.b, this.a, false);
         if (this.d < dqy.a.length && dqy.a[this.d] == this.c) {
            ++this.d;
         }

         return this.d < dqy.a.length;
      }
   }

   interface c {
      boolean a(cgx var1);
   }

   static record d(gy a, cvo b, gt c, gt d, int e) implements dqw.c {
      @Override
      public boolean a(cgx $$0) {
         dqy.a($$0, this.a, this.b, this.c, this.d, this.e, 512);
         return false;
      }
   }

   static record e(gt a, cjt b, gt c) implements dqw.c {
      @Override
      public boolean a(cgx $$0) {
         cvo $$1 = $$0.a_(this.a);
         dqy.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
