import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class bkg extends bko {
   private static final bmf a = bmf.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public bkg(bcl $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bip.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.dS();
      bcc $$1 = this.e.dR();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ad() == bbr.bn && this.e.s.W().b(cgt.J)) {
            return false;
         } else {
            for(Class<?> $$2 : this.i) {
               if ($$2.isAssignableFrom($$1.getClass())) {
                  return false;
               }
            }

            return this.a($$1, a);
         }
      } else {
         return false;
      }
   }

   public bkg a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.dR());
      this.g = this.e.G();
      this.d = this.e.dS();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      dwl $$1 = dwl.a(this.e.cY()).c($$0, 10.0, $$0);
      List<? extends bce> $$2 = this.e.s.a(this.e.getClass(), $$1, bbq.f);
      Iterator var5 = $$2.iterator();

      while(true) {
         bce $$3;
         while(true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bce)var5.next();
            if (this.e != $$3 && $$3.G() == null && (!(this.e instanceof bcw) || ((bcw)this.e).fK() == ((bcw)$$3).fK()) && !$$3.p(this.e.dR())) {
               if (this.j == null) {
                  break;
               }

               boolean $$4 = false;

               for(Class<?> $$5 : this.j) {
                  if ($$3.getClass() == $$5) {
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  break;
               }
            }
         }

         this.a($$3, this.e.dR());
      }
   }

   protected void a(bce $$0, bcc $$1) {
      $$0.h($$1);
   }
}
