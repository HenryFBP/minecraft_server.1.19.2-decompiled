import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class iv {
   private final cjt a;
   final Map<iv.b, cjt> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   iv(cjt $$0) {
      this.a = $$0;
   }

   public cjt a() {
      return this.a;
   }

   public Map<iv.b, cjt> b() {
      return this.b;
   }

   public cjt a(iv.b $$0) {
      return (cjt)this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return StringUtils.isBlank(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return StringUtils.isBlank(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final iv a;

      public a(cjt $$0) {
         this.a = new iv($$0);
      }

      public iv a() {
         return this.a;
      }

      public iv.a a(cjt $$0) {
         this.a.b.put(iv.b.a, $$0);
         return this;
      }

      public iv.a b(cjt $$0) {
         this.a.b.put(iv.b.b, $$0);
         return this;
      }

      public iv.a c(cjt $$0) {
         this.a.b.put(iv.b.c, $$0);
         return this;
      }

      public iv.a d(cjt $$0) {
         this.a.b.put(iv.b.d, $$0);
         return this;
      }

      public iv.a e(cjt $$0) {
         this.a.b.put(iv.b.e, $$0);
         return this;
      }

      public iv.a f(cjt $$0) {
         this.a.b.put(iv.b.f, $$0);
         return this;
      }

      public iv.a g(cjt $$0) {
         this.a.b.put(iv.b.g, $$0);
         return this;
      }

      public iv.a a(cjt $$0, cjt $$1) {
         this.a.b.put(iv.b.h, $$0);
         this.a.b.put(iv.b.o, $$1);
         return this;
      }

      public iv.a h(cjt $$0) {
         this.a.b.put(iv.b.i, $$0);
         return this;
      }

      public iv.a i(cjt $$0) {
         this.a.b.put(iv.b.j, $$0);
         return this;
      }

      public iv.a j(cjt $$0) {
         this.a.b.put(iv.b.k, $$0);
         return this;
      }

      public iv.a k(cjt $$0) {
         this.a.b.put(iv.b.l, $$0);
         return this;
      }

      public iv.a l(cjt $$0) {
         this.a.b.put(iv.b.m, $$0);
         return this;
      }

      public iv.a m(cjt $$0) {
         this.a.b.put(iv.b.n, $$0);
         return this;
      }

      public iv.a b() {
         this.a.c = false;
         return this;
      }

      public iv.a c() {
         this.a.d = false;
         return this;
      }

      public iv.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public iv.a b(String $$0) {
         this.a.f = $$0;
         return this;
      }
   }

   public static enum b {
      a("button"),
      b("chiseled"),
      c("cracked"),
      d("cut"),
      e("door"),
      f("fence"),
      g("fence_gate"),
      h("sign"),
      i("slab"),
      j("stairs"),
      k("pressure_plate"),
      l("polished"),
      m("trapdoor"),
      n("wall"),
      o("wall_sign");

      private final String p;

      private b(String $$0) {
         this.p = $$0;
      }

      public String a() {
         return this.p;
      }
   }
}
