import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class cau {
   private final Map<cat, cau.a> a = Maps.newHashMap();
   private int b;

   public boolean a(cat $$0) {
      return this.a($$0, 0.0F) > 0.0F;
   }

   public float a(cat $$0, float $$1) {
      cau.a $$2 = (cau.a)this.a.get($$0);
      if ($$2 != null) {
         float $$3 = (float)($$2.b - $$2.a);
         float $$4 = (float)$$2.b - ((float)this.b + $$1);
         return ami.a($$4 / $$3, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   public void a() {
      ++this.b;
      if (!this.a.isEmpty()) {
         Iterator<Entry<cat, cau.a>> $$0 = this.a.entrySet().iterator();

         while($$0.hasNext()) {
            Entry<cat, cau.a> $$1 = (Entry)$$0.next();
            if (((cau.a)$$1.getValue()).b <= this.b) {
               $$0.remove();
               this.c((cat)$$1.getKey());
            }
         }
      }

   }

   public void a(cat $$0, int $$1) {
      this.a.put($$0, new cau.a(this.b, this.b + $$1));
      this.b($$0, $$1);
   }

   public void b(cat $$0) {
      this.a.remove($$0);
      this.c($$0);
   }

   protected void b(cat $$0, int $$1) {
   }

   protected void c(cat $$0) {
   }

   static class a {
      final int a;
      final int b;

      a(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
