import com.mojang.brigadier.ResultConsumer;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class cfy implements dq {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final rq c = rq.b("@");
   private long d = -1L;
   private boolean e = true;
   private int f;
   private boolean g = true;
   @Nullable
   private rq h;
   private String i = "";
   private rq j = c;

   public int j() {
      return this.f;
   }

   public void a(int $$0) {
      this.f = $$0;
   }

   public rq k() {
      return this.h == null ? rp.a : this.h;
   }

   public pj a(pj $$0) {
      $$0.a("Command", this.i);
      $$0.a("SuccessCount", this.f);
      $$0.a("CustomName", rq.a.a(this.j));
      $$0.a("TrackOutput", this.g);
      if (this.h != null && this.g) {
         $$0.a("LastOutput", rq.a.a(this.h));
      }

      $$0.a("UpdateLastExecution", this.e);
      if (this.e && this.d > 0L) {
         $$0.a("LastExecution", this.d);
      }

      return $$0;
   }

   public void b(pj $$0) {
      this.i = $$0.l("Command");
      this.f = $$0.h("SuccessCount");
      if ($$0.b("CustomName", 8)) {
         this.b(rq.a.a($$0.l("CustomName")));
      }

      if ($$0.b("TrackOutput", 1)) {
         this.g = $$0.q("TrackOutput");
      }

      if ($$0.b("LastOutput", 8) && this.g) {
         try {
            this.h = rq.a.a($$0.l("LastOutput"));
         } catch (Throwable var3) {
            this.h = rq.b(var3.getMessage());
         }
      } else {
         this.h = null;
      }

      if ($$0.e("UpdateLastExecution")) {
         this.e = $$0.q("UpdateLastExecution");
      }

      if (this.e && $$0.e("LastExecution")) {
         this.d = $$0.i("LastExecution");
      } else {
         this.d = -1L;
      }

   }

   public void a(String $$0) {
      this.i = $$0;
      this.f = 0;
   }

   public String l() {
      return this.i;
   }

   public boolean a(cgx $$0) {
      if ($$0.y || $$0.U() == this.d) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.i)) {
         this.h = rq.b("#itzlipofutzli");
         this.f = 1;
         return true;
      } else {
         this.f = 0;
         MinecraftServer $$1 = this.e().n();
         if ($$1.n() && !amx.b(this.i)) {
            try {
               this.h = null;
               dr $$2 = this.i().a((ResultConsumer<dr>)(($$0x, $$1x, $$2) -> {
                  if ($$1x) {
                     ++this.f;
                  }

               }));
               $$1.aC().a($$2, this.i);
            } catch (Throwable var6) {
               q $$4 = q.a(var6, "Executing command block");
               r $$5 = $$4.a("Command to be executed");
               $$5.a("Command", this::l);
               $$5.a("Name", (s<String>)(() -> this.m().getString()));
               throw new z($$4);
            }
         }

         if (this.e) {
            this.d = $$0.U();
         } else {
            this.d = -1L;
         }

         return true;
      }
   }

   public rq m() {
      return this.j;
   }

   public void b(@Nullable rq $$0) {
      if ($$0 != null) {
         this.j = $$0;
      } else {
         this.j = c;
      }

   }

   @Override
   public void a(rq $$0) {
      if (this.g) {
         this.h = rq.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }

   }

   public abstract agg e();

   public abstract void f();

   public void c(@Nullable rq $$0) {
      this.h = $$0;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   public boolean n() {
      return this.g;
   }

   public baj a(buc $$0) {
      if (!$$0.fY()) {
         return baj.d;
      } else {
         if ($$0.cC().y) {
            $$0.a(this);
         }

         return baj.a($$0.s.y);
      }
   }

   public abstract dwq g();

   public abstract dr i();

   @Override
   public boolean i_() {
      return this.e().W().b(cgt.o) && this.g;
   }

   @Override
   public boolean j_() {
      return this.g;
   }

   @Override
   public boolean G_() {
      return this.e().W().b(cgt.i);
   }
}
