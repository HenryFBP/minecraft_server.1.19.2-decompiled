import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cpj {
   private final cgx a;
   private final gt b;
   private final cjj c;
   private cvo d;
   private final boolean e;
   private final List<gt> f = Lists.newArrayList();

   public cpj(cgx $$0, gt $$1, cvo $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (cjj)$$2.b();
      cws $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<gt> a() {
      return this.f;
   }

   private void a(cws $$0) {
      this.f.clear();
      switch($$0) {
         case a:
            this.f.add(this.b.d());
            this.f.add(this.b.e());
            break;
         case b:
            this.f.add(this.b.f());
            this.f.add(this.b.g());
            break;
         case c:
            this.f.add(this.b.f());
            this.f.add(this.b.g().b());
            break;
         case d:
            this.f.add(this.b.f().b());
            this.f.add(this.b.g());
            break;
         case e:
            this.f.add(this.b.d().b());
            this.f.add(this.b.e());
            break;
         case f:
            this.f.add(this.b.d());
            this.f.add(this.b.e().b());
            break;
         case g:
            this.f.add(this.b.g());
            this.f.add(this.b.e());
            break;
         case h:
            this.f.add(this.b.f());
            this.f.add(this.b.e());
            break;
         case i:
            this.f.add(this.b.f());
            this.f.add(this.b.d());
            break;
         case j:
            this.f.add(this.b.g());
            this.f.add(this.b.d());
      }

   }

   private void d() {
      for(int $$0 = 0; $$0 < this.f.size(); ++$$0) {
         cpj $$1 = this.b((gt)this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }

   }

   private boolean a(gt $$0) {
      return cjj.a(this.a, $$0) || cjj.a(this.a, $$0.b()) || cjj.a(this.a, $$0.c());
   }

   @Nullable
   private cpj b(gt $$0) {
      cvo $$2 = this.a.a_($$0);
      if (cjj.g($$2)) {
         return new cpj(this.a, $$0, $$2);
      } else {
         gt $$1 = $$0.b();
         $$2 = this.a.a_($$1);
         if (cjj.g($$2)) {
            return new cpj(this.a, $$1, $$2);
         } else {
            $$1 = $$0.c();
            $$2 = this.a.a_($$1);
            return cjj.g($$2) ? new cpj(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(cpj $$0) {
      return this.c($$0.b);
   }

   private boolean c(gt $$0) {
      for(int $$1 = 0; $$1 < this.f.size(); ++$$1) {
         gt $$2 = (gt)this.f.get($$1);
         if ($$2.u() == $$0.u() && $$2.w() == $$0.w()) {
            return true;
         }
      }

      return false;
   }

   protected int b() {
      int $$0 = 0;

      for(gy $$1 : gy.c.a) {
         if (this.a(this.b.a($$1))) {
            ++$$0;
         }
      }

      return $$0;
   }

   private boolean b(cpj $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(cpj $$0) {
      this.f.add($$0.b);
      gt $$1 = this.b.d();
      gt $$2 = this.b.e();
      gt $$3 = this.b.f();
      gt $$4 = this.b.g();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      cws $$9 = null;
      if ($$5 || $$6) {
         $$9 = cws.a;
      }

      if ($$7 || $$8) {
         $$9 = cws.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = cws.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = cws.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = cws.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = cws.j;
         }
      }

      if ($$9 == cws.a) {
         if (cjj.a(this.a, $$1.b())) {
            $$9 = cws.e;
         }

         if (cjj.a(this.a, $$2.b())) {
            $$9 = cws.f;
         }
      }

      if ($$9 == cws.b) {
         if (cjj.a(this.a, $$4.b())) {
            $$9 = cws.c;
         }

         if (cjj.a(this.a, $$3.b())) {
            $$9 = cws.d;
         }
      }

      if ($$9 == null) {
         $$9 = cws.a;
      }

      this.d = this.d.a(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(gt $$0) {
      cpj $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public cpj a(boolean $$0, boolean $$1, cws $$2) {
      gt $$3 = this.b.d();
      gt $$4 = this.b.e();
      gt $$5 = this.b.f();
      gt $$6 = this.b.g();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      cws $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = cws.a;
      }

      if ($$13 && !$$12) {
         $$11 = cws.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = cws.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = cws.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = cws.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = cws.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = cws.a;
         } else if ($$13) {
            $$11 = cws.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = cws.g;
               }

               if ($$15) {
                  $$11 = cws.h;
               }

               if ($$16) {
                  $$11 = cws.j;
               }

               if ($$17) {
                  $$11 = cws.i;
               }
            } else {
               if ($$17) {
                  $$11 = cws.i;
               }

               if ($$16) {
                  $$11 = cws.j;
               }

               if ($$15) {
                  $$11 = cws.h;
               }

               if ($$14) {
                  $$11 = cws.g;
               }
            }
         }
      }

      if ($$11 == cws.a) {
         if (cjj.a(this.a, $$3.b())) {
            $$11 = cws.e;
         }

         if (cjj.a(this.a, $$4.b())) {
            $$11 = cws.f;
         }
      }

      if ($$11 == cws.b) {
         if (cjj.a(this.a, $$6.b())) {
            $$11 = cws.c;
         }

         if (cjj.a(this.a, $$5.b())) {
            $$11 = cws.d;
         }
      }

      if ($$11 == null) {
         $$11 = $$2;
      }

      this.a($$11);
      this.d = this.d.a(this.c.c(), $$11);
      if ($$1 || this.a.a_(this.b) != this.d) {
         this.a.a(this.b, this.d, 3);

         for(int $$18 = 0; $$18 < this.f.size(); ++$$18) {
            cpj $$19 = this.b((gt)this.f.get($$18));
            if ($$19 != null) {
               $$19.d();
               if ($$19.b(this)) {
                  $$19.c(this);
               }
            }
         }
      }

      return this;
   }

   public cvo c() {
      return this.d;
   }
}
