import java.util.Comparator;
import javax.annotation.Nullable;

public class dxn {
   public static final Comparator<dxn> a = ($$0, $$1) -> {
      if ($$0.b() > $$1.b()) {
         return 1;
      } else {
         return $$0.b() < $$1.b() ? -1 : $$1.e().compareToIgnoreCase($$0.e());
      }
   };
   private final dxo b;
   @Nullable
   private final dxl c;
   private final String d;
   private int e;
   private boolean f;
   private boolean g;

   public dxn(dxo $$0, dxl $$1, String $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.f = true;
      this.g = true;
   }

   public void a(int $$0) {
      if (this.c.c().e()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.b(this.b() + $$0);
      }
   }

   public void a() {
      this.a(1);
   }

   public int b() {
      return this.e;
   }

   public void c() {
      this.b(0);
   }

   public void b(int $$0) {
      int $$1 = this.e;
      this.e = $$0;
      if ($$1 != $$0 || this.g) {
         this.g = false;
         this.f().a(this);
      }

   }

   @Nullable
   public dxl d() {
      return this.c;
   }

   public String e() {
      return this.d;
   }

   public dxo f() {
      return this.b;
   }

   public boolean g() {
      return this.f;
   }

   public void a(boolean $$0) {
      this.f = $$0;
   }
}
