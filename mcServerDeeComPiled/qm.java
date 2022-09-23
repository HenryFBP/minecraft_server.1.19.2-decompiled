import java.util.HashMap;
import java.util.Map;

public record qm(int a, Map<String, qe<?>> b, Map<String, qm> c) {
   private qm(int $$0) {
      this($$0, new HashMap(), new HashMap());
   }

   public static qm a() {
      return new qm(1);
   }

   public void a(ql $$0) {
      if (this.a <= $$0.a().size()) {
         ((qm)this.c.computeIfAbsent((String)$$0.a().get(this.a - 1), $$0x -> new qm(this.a + 1))).a($$0);
      } else {
         this.b.put($$0.c(), $$0.b());
      }

   }

   public boolean a(qe<?> $$0, String $$1) {
      return $$0.equals(this.c().get($$1));
   }

   public int b() {
      return this.a;
   }

   public Map<String, qe<?>> c() {
      return this.b;
   }

   public Map<String, qm> d() {
      return this.c;
   }
}
