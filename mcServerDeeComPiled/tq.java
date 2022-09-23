import java.util.UUID;
import java.util.function.Function;

public class tq implements tc<tf> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final UUID d;
   private final tq.c e;
   static final tq.c f = new tq.c() {
      @Override
      public tq.d a() {
         return tq.d.b;
      }

      @Override
      public void a(UUID $$0, tq.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(qx $$0) {
      }
   };

   private tq(UUID $$0, tq.c $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public tq(qx $$0) {
      this.d = $$0.m();
      tq.d $$1 = $$0.a(tq.d.class);
      this.e = (tq.c)$$1.g.apply($$0);
   }

   public static tq a(azz $$0) {
      return new tq($$0.i(), new tq.a($$0));
   }

   public static tq a(UUID $$0) {
      return new tq($$0, f);
   }

   public static tq b(azz $$0) {
      return new tq($$0.i(), new tq.f($$0.k()));
   }

   public static tq c(azz $$0) {
      return new tq($$0.i(), new tq.e($$0.j()));
   }

   public static tq d(azz $$0) {
      return new tq($$0.i(), new tq.h($$0.l(), $$0.m()));
   }

   public static tq e(azz $$0) {
      return new tq($$0.i(), new tq.g($$0.n(), $$0.o(), $$0.p()));
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.d);
      $$0.a((Enum<?>)this.e.a());
      this.e.a($$0);
   }

   static int a(boolean $$0, boolean $$1, boolean $$2) {
      int $$3 = 0;
      if ($$0) {
         $$3 |= 1;
      }

      if ($$1) {
         $$3 |= 2;
      }

      if ($$2) {
         $$3 |= 4;
      }

      return $$3;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public void a(tq.b $$0) {
      this.e.a(this.d, $$0);
   }

   static class a implements tq.c {
      private final rq a;
      private final float b;
      private final azz.a c;
      private final azz.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(azz $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(qx $$0) {
         this.a = $$0.j();
         this.b = $$0.readFloat();
         this.c = $$0.a(azz.a.class);
         this.d = $$0.a(azz.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public tq.d a() {
         return tq.d.a;
      }

      @Override
      public void a(UUID $$0, tq.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(qx $$0) {
         $$0.a(this.a);
         $$0.writeFloat(this.b);
         $$0.a((Enum<?>)this.c);
         $$0.a((Enum<?>)this.d);
         $$0.writeByte(tq.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, rq $$1, float $$2, azz.a $$3, azz.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, rq $$1) {
      }

      default void a(UUID $$0, azz.a $$1, azz.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      tq.d a();

      void a(UUID var1, tq.b var2);

      void a(qx var1);
   }

   static enum d {
      a(tq.a::new),
      b($$0 -> tq.f),
      c(tq.f::new),
      d(tq.e::new),
      e(tq.h::new),
      f(tq.g::new);

      final Function<qx, tq.c> g;

      private d(Function<qx, tq.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements tq.c {
      private final rq a;

      e(rq $$0) {
         this.a = $$0;
      }

      private e(qx $$0) {
         this.a = $$0.j();
      }

      @Override
      public tq.d a() {
         return tq.d.d;
      }

      @Override
      public void a(UUID $$0, tq.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(qx $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements tq.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(qx $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public tq.d a() {
         return tq.d.c;
      }

      @Override
      public void a(UUID $$0, tq.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(qx $$0) {
         $$0.writeFloat(this.a);
      }
   }

   static class g implements tq.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(qx $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public tq.d a() {
         return tq.d.f;
      }

      @Override
      public void a(UUID $$0, tq.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(qx $$0) {
         $$0.writeByte(tq.a(this.a, this.b, this.c));
      }
   }

   static class h implements tq.c {
      private final azz.a a;
      private final azz.b b;

      h(azz.a $$0, azz.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(qx $$0) {
         this.a = $$0.a(azz.a.class);
         this.b = $$0.a(azz.b.class);
      }

      @Override
      public tq.d a() {
         return tq.d.e;
      }

      @Override
      public void a(UUID $$0, tq.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(qx $$0) {
         $$0.a((Enum<?>)this.a);
         $$0.a((Enum<?>)this.b);
      }
   }
}
