import java.util.ArrayList;
import java.util.List;

public class akw {
   private final List<akx> a = new ArrayList();

   public static akw a() {
      return new akw();
   }

   public List<akx> b() {
      return List.copyOf(this.a);
   }

   public akw a(akx $$0) {
      this.a.add($$0);
      return this;
   }

   public akw a(abb $$0) {
      return this.a(akx.a($$0));
   }

   public akw b(abb $$0) {
      return this.a(akx.b($$0));
   }

   public akw c(abb $$0) {
      return this.a(akx.c($$0));
   }

   public akw d(abb $$0) {
      return this.a(akx.d($$0));
   }
}
