import java.util.Locale;

public interface drn {
   int a();

   int b();

   int c();

   float d();

   long e();

   long f();

   boolean i();

   boolean k();

   void b(boolean var1);

   boolean n();

   cgt q();

   bag s();

   boolean t();

   default void a(r $$0, cgz $$1) {
      $$0.a("Level spawn location", (s<String>)(() -> r.a($$1, this.a(), this.b(), this.c())));
      $$0.a("Level time", (s<String>)(() -> String.format(Locale.ROOT, "%d game time, %d day time", this.e(), this.f())));
   }
}
