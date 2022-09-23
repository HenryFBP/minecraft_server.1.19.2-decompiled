import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bav {
   public static final int a = 100;
   public static final int b = 300;
   private final List<bat> c = Lists.newArrayList();
   private final bcc d;
   private int e;
   private int f;
   private int g;
   private boolean h;
   private boolean i;
   @Nullable
   private String j;

   public bav(bcc $$0) {
      this.d = $$0;
   }

   public void a() {
      this.l();
      Optional<gt> $$0 = this.d.eo();
      if ($$0.isPresent()) {
         cvo $$1 = this.d.s.a_((gt)$$0.get());
         if ($$1.a(cju.cx) || $$1.a(akl.L)) {
            this.j = "ladder";
         } else if ($$1.a(cju.em)) {
            this.j = "vines";
         } else if ($$1.a(cju.nk) || $$1.a(cju.nl)) {
            this.j = "weeping_vines";
         } else if ($$1.a(cju.nm) || $$1.a(cju.nn)) {
            this.j = "twisting_vines";
         } else if ($$1.a(cju.mD)) {
            this.j = "scaffolding";
         } else {
            this.j = "other_climbable";
         }
      } else if (this.d.aR()) {
         this.j = "water";
      }

   }

   public void a(baw $$0, float $$1, float $$2) {
      this.g();
      this.a();
      bat $$3 = new bat($$0, this.d.S, $$1, $$2, this.j, this.d.L);
      this.c.add($$3);
      this.e = this.d.S;
      this.i = true;
      if ($$3.f() && !this.h && this.d.bo()) {
         this.h = true;
         this.f = this.d.S;
         this.g = this.f;
         this.d.h();
      }

   }

   public rq b() {
      if (this.c.isEmpty()) {
         return rq.a("death.attack.generic", this.d.C_());
      } else {
         bat $$0 = this.k();
         bat $$1 = (bat)this.c.get(this.c.size() - 1);
         rq $$2 = $$1.h();
         bbn $$3 = $$1.a().m();
         rq $$5;
         if ($$0 != null && $$1.a() == baw.k) {
            rq $$4 = $$0.h();
            if ($$0.a() == baw.k || $$0.a() == baw.m) {
               $$5 = rq.a("death.fell.accident." + this.a($$0), this.d.C_());
            } else if ($$4 != null && !$$4.equals($$2)) {
               bbn $$6 = $$0.a().m();
               cax $$7 = $$6 instanceof bcc ? ((bcc)$$6).ez() : cax.b;
               if (!$$7.b() && $$7.z()) {
                  $$5 = rq.a("death.fell.assist.item", this.d.C_(), $$4, $$7.I());
               } else {
                  $$5 = rq.a("death.fell.assist", this.d.C_(), $$4);
               }
            } else if ($$2 != null) {
               cax $$10 = $$3 instanceof bcc ? ((bcc)$$3).ez() : cax.b;
               if (!$$10.b() && $$10.z()) {
                  $$5 = rq.a("death.fell.finish.item", this.d.C_(), $$2, $$10.I());
               } else {
                  $$5 = rq.a("death.fell.finish", this.d.C_(), $$2);
               }
            } else {
               $$5 = rq.a("death.fell.killer", this.d.C_());
            }
         } else {
            $$5 = $$1.a().a(this.d);
         }

         return $$5;
      }
   }

   @Nullable
   public bcc c() {
      bcc $$0 = null;
      buc $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for(bat $$4 : this.c) {
         if ($$4.a().m() instanceof buc && ($$1 == null || $$4.c() > $$3)) {
            $$3 = $$4.c();
            $$1 = (buc)$$4.a().m();
         }

         if ($$4.a().m() instanceof bcc && ($$0 == null || $$4.c() > $$2)) {
            $$2 = $$4.c();
            $$0 = (bcc)$$4.a().m();
         }
      }

      return (bcc)($$1 != null && $$3 >= $$2 / 3.0F ? $$1 : $$0);
   }

   @Nullable
   private bat k() {
      bat $$0 = null;
      bat $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for(int $$4 = 0; $$4 < this.c.size(); ++$$4) {
         bat $$5 = (bat)this.c.get($$4);
         bat $$6 = $$4 > 0 ? (bat)this.c.get($$4 - 1) : null;
         if (($$5.a() == baw.k || $$5.a() == baw.m) && $$5.j() > 0.0F && ($$0 == null || $$5.j() > $$3)) {
            if ($$4 > 0) {
               $$0 = $$6;
            } else {
               $$0 = $$5;
            }

            $$3 = $$5.j();
         }

         if ($$5.g() != null && ($$1 == null || $$5.c() > $$2)) {
            $$1 = $$5;
            $$2 = $$5.c();
         }
      }

      if ($$3 > 5.0F && $$0 != null) {
         return $$0;
      } else {
         return $$2 > 5.0F && $$1 != null ? $$1 : null;
      }
   }

   private String a(bat $$0) {
      return $$0.g() == null ? "generic" : $$0.g();
   }

   public boolean d() {
      this.g();
      return this.i;
   }

   public boolean e() {
      this.g();
      return this.h;
   }

   public int f() {
      return this.h ? this.d.S - this.f : this.g - this.f;
   }

   private void l() {
      this.j = null;
   }

   public void g() {
      int $$0 = this.h ? 300 : 100;
      if (this.i && (!this.d.bo() || this.d.S - this.e > $$0)) {
         boolean $$1 = this.h;
         this.i = false;
         this.h = false;
         this.g = this.d.S;
         if ($$1) {
            this.d.i();
         }

         this.c.clear();
      }

   }

   public bcc h() {
      return this.d;
   }

   @Nullable
   public bat i() {
      return this.c.isEmpty() ? null : (bat)this.c.get(this.c.size() - 1);
   }

   public int j() {
      bcc $$0 = this.c();
      return $$0 == null ? -1 : $$0.ae();
   }
}
