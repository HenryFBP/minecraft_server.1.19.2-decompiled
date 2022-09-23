import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bil extends bip {
   private static final int a = 200;
   private final bnd b;
   private int c;
   private int d;

   public bil(bnd $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(bnd $$0) {
      return b(200 + $$0.dQ().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.fP()) {
         return false;
      } else if (this.b.fM()) {
         return true;
      } else if (this.d > 0) {
         --this.d;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<bnd> $$0 = $$0x -> $$0x.fO() || !$$0x.fM();
         List<? extends bnd> $$1 = this.b.s.a(this.b.getClass(), this.b.cy().c(8.0, 8.0, 8.0), $$0);
         bnd $$2 = (bnd)DataFixUtils.orElse($$1.stream().filter(bnd::fO).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.fM()));
         return this.b.fM();
      }
   }

   @Override
   public boolean b() {
      return this.b.fM() && this.b.fQ();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.fN();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.fR();
      }
   }
}
