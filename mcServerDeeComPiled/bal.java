import javax.annotation.concurrent.Immutable;

@Immutable
public class bal {
   public static final bal a = new bal("");
   public static final String b = "Lock";
   private final String c;

   public bal(String $$0) {
      this.c = $$0;
   }

   public boolean a(cax $$0) {
      return this.c.isEmpty() || !$$0.b() && $$0.z() && this.c.equals($$0.x().getString());
   }

   public void a(pj $$0) {
      if (!this.c.isEmpty()) {
         $$0.a("Lock", this.c);
      }

   }

   public static bal b(pj $$0) {
      return $$0.b("Lock", 8) ? new bal($$0.l("Lock")) : a;
   }
}
