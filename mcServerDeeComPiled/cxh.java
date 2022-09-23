import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class cxh implements AutoCloseable {
   private final cgy a;
   private final Long2ObjectMap<cxu> b = new Long2ObjectOpenHashMap();
   @Nullable
   private cxu c;
   private long d;

   public cxh(cgy $$0) {
      this.a = $$0;
   }

   @Nullable
   public cxu a(gt $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ai()) {
         long $$2 = hq.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (cxu)this.b.computeIfAbsent($$2, $$2x -> {
               cxj $$3 = this.a.a(hq.a($$0.u()), hq.a($$0.w()));
               cxu $$4 = $$3.b($$1);
               $$4.a();
               return $$4;
            });
            this.d = $$2;
         }

         return this.c;
      } else {
         return null;
      }
   }

   public cvo b(gt $$0) {
      cxu $$1 = this.a($$0);
      if ($$1 == null) {
         return cju.a.m();
      } else {
         int $$2 = hq.b($$0.u());
         int $$3 = hq.b($$0.v());
         int $$4 = hq.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while(var1.hasNext()) {
         cxu $$0 = (cxu)var1.next();
         $$0.b();
      }

   }
}
