import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cer {
   private final bbs[] a;
   private final cer.a b;
   public final ces e;
   @Nullable
   protected String f;

   @Nullable
   public static cer c(int $$0) {
      return hm.W.a($$0);
   }

   protected cer(cer.a $$0, ces $$1, bbs[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<bbs, cax> a(bcc $$0) {
      Map<bbs, cax> $$1 = Maps.newEnumMap(bbs.class);

      for(bbs $$2 : this.a) {
         cax $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cer.a d() {
      return this.b;
   }

   public int e() {
      return 1;
   }

   public int a() {
      return 1;
   }

   public int a(int $$0) {
      return 1 + $$0 * 10;
   }

   public int b(int $$0) {
      return this.a($$0) + 5;
   }

   public int a(int $$0, baw $$1) {
      return 0;
   }

   public float a(int $$0, bch $$1) {
      return 0.0F;
   }

   public final boolean b(cer $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cer $$0) {
      return this != $$0;
   }

   protected String f() {
      if (this.f == null) {
         this.f = ad.a("enchantment", hm.W.b(this));
      }

      return this.f;
   }

   public String g() {
      return this.f();
   }

   public rq d(int $$0) {
      sb $$1 = rq.c(this.g());
      if (this.c()) {
         $$1.a(p.m);
      } else {
         $$1.a(p.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.f(" ").b(rq.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cax $$0) {
      return this.e.a($$0.c());
   }

   public void a(bcc $$0, bbn $$1, int $$2) {
   }

   public void b(bcc $$0, bbn $$1, int $$2) {
   }

   public boolean b() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean h() {
      return true;
   }

   public boolean i() {
      return true;
   }

   public static enum a {
      a(10),
      b(5),
      c(2),
      d(1);

      private final int e;

      private a(int $$0) {
         this.e = $$0;
      }

      public int a() {
         return this.e;
      }
   }
}
