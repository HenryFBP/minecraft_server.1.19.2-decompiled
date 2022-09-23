import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dop {
   private coh a;
   private cpw b;
   private gt c;
   private boolean d;
   @Nullable
   private dkt e;
   private boolean f;
   @Nullable
   private amn g;
   private int h;
   private final List<doq> i;
   private boolean j;
   private boolean k;

   public dop() {
      this.a = coh.a;
      this.b = cpw.a;
      this.c = gt.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dop a() {
      dop $$0 = new dop();
      $$0.a = this.a;
      $$0.b = this.b;
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      $$0.h = this.h;
      $$0.i.addAll(this.i);
      $$0.j = this.j;
      $$0.k = this.k;
      return $$0;
   }

   public dop a(coh $$0) {
      this.a = $$0;
      return this;
   }

   public dop a(cpw $$0) {
      this.b = $$0;
      return this;
   }

   public dop a(gt $$0) {
      this.c = $$0;
      return this;
   }

   public dop a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dop a(dkt $$0) {
      this.e = $$0;
      return this;
   }

   public dop a(@Nullable amn $$0) {
      this.g = $$0;
      return this;
   }

   public dop b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dop c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dop b() {
      this.i.clear();
      return this;
   }

   public dop a(doq $$0) {
      this.i.add($$0);
      return this;
   }

   public dop b(doq $$0) {
      this.i.remove($$0);
      return this;
   }

   public coh c() {
      return this.a;
   }

   public cpw d() {
      return this.b;
   }

   public gt e() {
      return this.c;
   }

   public amn b(@Nullable gt $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? amn.a(ad.b()) : amn.a(ami.a((hs)$$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dkt g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<doq> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dot.a a(List<dot.a> $$0, @Nullable gt $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return (dot.a)$$0.get(this.b($$1).a($$2));
      }
   }

   public dop d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
