import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bao implements bac, byg {
   private final int b;
   private final hi<cax> c;
   @Nullable
   private List<bae> d;

   public bao(int $$0) {
      this.b = $$0;
      this.c = hi.a($$0, cax.b);
   }

   public bao(cax... $$0) {
      this.b = $$0.length;
      this.c = hi.a(cax.b, $$0);
   }

   public void a(bae $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bae $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }

   }

   @Override
   public cax a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cax.b;
   }

   public List<cax> f() {
      List<cax> $$0 = (List)this.c.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cax a(int $$0, int $$1) {
      cax $$2 = bad.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cax a(cat $$0, int $$1) {
      cax $$2 = new cax($$0, 0);

      for(int $$3 = this.b - 1; $$3 >= 0; --$$3) {
         cax $$4 = this.a($$3);
         if ($$4.c().equals($$0)) {
            int $$5 = $$1 - $$2.K();
            cax $$6 = $$4.a($$5);
            $$2.f($$6.K());
            if ($$2.K() == $$1) {
               break;
            }
         }
      }

      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cax a(cax $$0) {
      cax $$1 = $$0.o();
      this.d($$1);
      if ($$1.b()) {
         return cax.b;
      } else {
         this.c($$1);
         return $$1.b() ? cax.b : $$1;
      }
   }

   public boolean b(cax $$0) {
      boolean $$1 = false;

      for(cax $$2 : this.c) {
         if ($$2.b() || cax.e($$2, $$0) && $$2.K() < $$2.f()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cax b(int $$0) {
      cax $$1 = this.c.get($$0);
      if ($$1.b()) {
         return cax.b;
      } else {
         this.c.set($$0, cax.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cax $$1) {
      this.c.set($$0, $$1);
      if (!$$1.b() && $$1.K() > this.O_()) {
         $$1.e(this.O_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for(cax $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for(bae $$0 : this.d) {
            $$0.a(this);
         }
      }

   }

   @Override
   public boolean a(buc $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void a(bug $$0) {
      for(cax $$1 : this.c) {
         $$0.b($$1);
      }

   }

   public String toString() {
      return ((List)this.c.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList())).toString();
   }

   private void c(cax $$0) {
      for(int $$1 = 0; $$1 < this.b; ++$$1) {
         cax $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.o());
            $$0.e(0);
            return;
         }
      }

   }

   private void d(cax $$0) {
      for(int $$1 = 0; $$1 < this.b; ++$$1) {
         cax $$2 = this.a($$1);
         if (cax.e($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }

   }

   private void a(cax $$0, cax $$1) {
      int $$2 = Math.min(this.O_(), $$1.f());
      int $$3 = Math.min($$0.K(), $$2 - $$1.K());
      if ($$3 > 0) {
         $$1.f($$3);
         $$0.g($$3);
         this.e();
      }

   }

   public void a(pp $$0) {
      for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
         cax $$2 = cax.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }

   }

   public pp g() {
      pp $$0 = new pp();

      for(int $$1 = 0; $$1 < this.b(); ++$$1) {
         cax $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new pj()));
         }
      }

      return $$0;
   }
}
