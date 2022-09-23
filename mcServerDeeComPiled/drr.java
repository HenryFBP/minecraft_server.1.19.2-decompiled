import java.nio.file.Path;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class drr implements Comparable<drr> {
   private final chb a;
   private final drs b;
   private final String c;
   private final boolean d;
   private final boolean e;
   private final Path f;
   @Nullable
   private rq g;

   public drr(chb $$0, drs $$1, String $$2, boolean $$3, boolean $$4, Path $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
      this.f = $$5;
      this.d = $$3;
   }

   public String a() {
      return this.c;
   }

   public String b() {
      return StringUtils.isEmpty(this.a.a()) ? this.c : this.a.a();
   }

   public Path c() {
      return this.f;
   }

   public boolean d() {
      return this.d;
   }

   public long e() {
      return this.b.b();
   }

   public int a(drr $$0) {
      if (this.b.b() < $$0.b.b()) {
         return 1;
      } else {
         return this.b.b() > $$0.b.b() ? -1 : this.c.compareTo($$0.c);
      }
   }

   public chb f() {
      return this.a;
   }

   public cgu g() {
      return this.a.b();
   }

   public boolean h() {
      return this.a.c();
   }

   public boolean i() {
      return this.a.e();
   }

   public sb j() {
      return amx.b(this.b.c()) ? rq.c("selectWorld.versionUnknown") : rq.b(this.b.c());
   }

   public drs k() {
      return this.b;
   }

   public boolean l() {
      return this.m() || !ab.b().isStable() && !this.b.e() || this.n().a();
   }

   public boolean m() {
      return this.b.d().c() > ab.b().b().c();
   }

   public drr.a n() {
      ae $$0 = ab.b();
      int $$1 = $$0.b().c();
      int $$2 = this.b.d().c();
      if (!$$0.isStable() && $$2 < $$1) {
         return drr.a.c;
      } else {
         return $$2 > $$1 ? drr.a.b : drr.a.a;
      }
   }

   public boolean o() {
      return this.e;
   }

   public boolean p() {
      if (!this.o() && !this.d()) {
         return !this.q();
      } else {
         return true;
      }
   }

   public boolean q() {
      return ab.b().b().a(this.b.d());
   }

   public rq r() {
      if (this.g == null) {
         this.g = this.s();
      }

      return this.g;
   }

   private rq s() {
      if (this.o()) {
         return rq.c("selectWorld.locked").a(p.m);
      } else if (this.d()) {
         return rq.c("selectWorld.conversion").a(p.m);
      } else if (!this.q()) {
         return rq.c("selectWorld.incompatible_series").a(p.m);
      } else {
         sb $$0 = this.h() ? rq.h().b(rq.c("gameMode.hardcore").a(p.e)) : rq.c("gameMode." + this.g().b());
         if (this.i()) {
            $$0.f(", ").b(rq.c("selectWorld.cheats"));
         }

         sb $$1 = this.j();
         sb $$2 = rq.b(", ").b(rq.c("selectWorld.version")).f(" ");
         if (this.l()) {
            $$2.b($$1.a(this.m() ? p.m : p.u));
         } else {
            $$2.b($$1);
         }

         $$0.b($$2);
         return $$0;
      }
   }

   public static enum a {
      a(false, false, ""),
      b(true, true, "downgrade"),
      c(true, false, "snapshot");

      private final boolean d;
      private final boolean e;
      private final String f;

      private a(boolean $$0, boolean $$1, String $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public boolean a() {
         return this.d;
      }

      public boolean b() {
         return this.e;
      }

      public String c() {
         return this.f;
      }
   }
}
