import java.util.EnumSet;
import javax.annotation.Nullable;

public class bkc extends bip {
   private final bip a;
   private final int b;
   private boolean c;

   public bkc(int $$0, bip $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public boolean a(bkc $$0) {
      return this.D_() && $$0.i() < this.i();
   }

   @Override
   public boolean a() {
      return this.a.a();
   }

   @Override
   public boolean b() {
      return this.a.b();
   }

   @Override
   public boolean D_() {
      return this.a.D_();
   }

   @Override
   public void c() {
      if (!this.c) {
         this.c = true;
         this.a.c();
      }
   }

   @Override
   public void d() {
      if (this.c) {
         this.c = false;
         this.a.d();
      }
   }

   @Override
   public boolean E_() {
      return this.a.E_();
   }

   @Override
   protected int a(int $$0) {
      return this.a.a($$0);
   }

   @Override
   public void e() {
      this.a.e();
   }

   @Override
   public void a(EnumSet<bip.a> $$0) {
      this.a.a($$0);
   }

   @Override
   public EnumSet<bip.a> j() {
      return this.a.j();
   }

   public boolean h() {
      return this.c;
   }

   public int i() {
      return this.b;
   }

   public bip k() {
      return this.a;
   }

   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? this.a.equals(((bkc)$$0).a) : false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }
}
