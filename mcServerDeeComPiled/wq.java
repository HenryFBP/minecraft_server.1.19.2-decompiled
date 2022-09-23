import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class wq implements tc<tf> {
   private static final int a = 0;
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 3;
   private static final int e = 4;
   private static final int f = 40;
   private static final int g = 40;
   private final int h;
   private final String i;
   private final Collection<String> j;
   private final Optional<wq.b> k;

   private wq(String $$0, int $$1, Optional<wq.b> $$2, Collection<String> $$3) {
      this.i = $$0;
      this.h = $$1;
      this.k = $$2;
      this.j = ImmutableList.copyOf($$3);
   }

   public static wq a(dxm $$0, boolean $$1) {
      return new wq($$0.b(), $$1 ? 0 : 2, Optional.of(new wq.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static wq a(dxm $$0) {
      return new wq($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static wq a(dxm $$0, String $$1, wq.a $$2) {
      return new wq($$0.b(), $$2 == wq.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   public wq(qx $$0) {
      this.i = $$0.q();
      this.h = $$0.readByte();
      if (b(this.h)) {
         this.k = Optional.of(new wq.b($$0));
      } else {
         this.k = Optional.empty();
      }

      if (a(this.h)) {
         this.j = $$0.a(qx::q);
      } else {
         this.j = ImmutableList.of();
      }

   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.i);
      $$0.writeByte(this.h);
      if (b(this.h)) {
         ((wq.b)this.k.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.h))).a($$0);
      }

      if (a(this.h)) {
         $$0.a(this.j, qx::a);
      }

   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public wq.a b() {
      switch(this.h) {
         case 0:
         case 3:
            return wq.a.a;
         case 1:
         case 2:
         default:
            return null;
         case 4:
            return wq.a.b;
      }
   }

   @Nullable
   public wq.a c() {
      switch(this.h) {
         case 0:
            return wq.a.a;
         case 1:
            return wq.a.b;
         default:
            return null;
      }
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public String d() {
      return this.i;
   }

   public Collection<String> e() {
      return this.j;
   }

   public Optional<wq.b> f() {
      return this.k;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final rq a;
      private final rq b;
      private final rq c;
      private final String d;
      private final String e;
      private final p f;
      private final int g;

      public b(dxm $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(qx $$0) {
         this.a = $$0.j();
         this.g = $$0.readByte();
         this.d = $$0.e(40);
         this.e = $$0.e(40);
         this.f = $$0.a(p.class);
         this.b = $$0.j();
         this.c = $$0.j();
      }

      public rq a() {
         return this.a;
      }

      public int b() {
         return this.g;
      }

      public p c() {
         return this.f;
      }

      public String d() {
         return this.d;
      }

      public String e() {
         return this.e;
      }

      public rq f() {
         return this.b;
      }

      public rq g() {
         return this.c;
      }

      public void a(qx $$0) {
         $$0.a(this.a);
         $$0.writeByte(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a((Enum<?>)this.f);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
