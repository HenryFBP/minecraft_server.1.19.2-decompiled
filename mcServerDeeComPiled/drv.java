import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface drv extends drx {
   @Override
   String g();

   void a(boolean var1);

   int l();

   void f(int var1);

   void e(int var1);

   int j();

   @Override
   default void a(r $$0, cgz $$1) {
      drx.super.a($$0, $$1);
      $$0.a("Level name", this::g);
      $$0.a(
         "Level game mode",
         (s<String>)(() -> String.format(Locale.ROOT, "Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", this.m().b(), this.m().a(), this.n(), this.o()))
      );
      $$0.a(
         "Level weather",
         (s<String>)(() -> String.format(Locale.ROOT, "Rain time: %d (now: %b), thunder time: %d (now: %b)", this.l(), this.k(), this.j(), this.i()))
      );
   }

   int h();

   void a(int var1);

   int v();

   void g(int var1);

   int w();

   void h(int var1);

   @Nullable
   UUID x();

   void a(UUID var1);

   cgu m();

   void a(cxe.c var1);

   cxe.c r();

   boolean p();

   void c(boolean var1);

   boolean o();

   void a(cgu var1);

   dwi<MinecraftServer> u();

   void a(long var1);

   void b(long var1);
}
