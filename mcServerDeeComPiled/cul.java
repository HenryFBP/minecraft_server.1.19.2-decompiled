import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cul extends cti {
   public static final String a = "SkullOwner";
   @Nullable
   private static aiv b;
   @Nullable
   private static MinecraftSessionService c;
   @Nullable
   private static Executor d;
   @Nullable
   private GameProfile e;
   private int f;
   private boolean g;

   public cul(gt $$0, cvo $$1) {
      super(ctk.o, $$0, $$1);
   }

   public static void a(abr $$0, Executor $$1) {
      b = $$0.d();
      c = $$0.a();
      d = $$1;
   }

   public static void c() {
      b = null;
      c = null;
      d = null;
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (this.e != null) {
         pj $$1 = new pj();
         pv.a($$1, this.e);
         $$0.a("SkullOwner", (qc)$$1);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("SkullOwner", 10)) {
         this.a(pv.a($$0.p("SkullOwner")));
      } else if ($$0.b("ExtraType", 8)) {
         String $$1 = $$0.l("ExtraType");
         if (!amx.b($$1)) {
            this.a(new GameProfile(null, $$1));
         }
      }

   }

   public static void a(cgx $$0, gt $$1, cvo $$2, cul $$3) {
      if ($$0.r($$1)) {
         $$3.g = true;
         ++$$3.f;
      } else {
         $$3.g = false;
      }

   }

   public float a(float $$0) {
      return this.g ? (float)this.f + $$0 : (float)this.f;
   }

   @Nullable
   public GameProfile d() {
      return this.e;
   }

   public tn f() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   public void a(@Nullable GameProfile $$0) {
      synchronized(this) {
         this.e = $$0;
      }

      this.g();
   }

   private void g() {
      a(this.e, $$0 -> {
         this.e = $$0;
         this.e();
      });
   }

   public static void a(@Nullable GameProfile $$0, Consumer<GameProfile> $$1) {
      if ($$0 != null && !amx.b($$0.getName()) && (!$$0.isComplete() || !$$0.getProperties().containsKey("textures")) && b != null && c != null) {
         b.a($$0.getName(), $$2 -> ad.g().execute(() -> ad.a($$2, $$1xxx -> {
                  Property $$2xx = (Property)Iterables.getFirst($$1xxx.getProperties().get("textures"), null);
                  if ($$2xx == null) {
                     $$1xxx = c.fillProfileProperties($$1xxx, true);
                  }

                  GameProfile $$3 = $$1xxx;
                  d.execute(() -> {
                     b.a($$3);
                     $$1.accept($$3);
                  });
               }, () -> d.execute(() -> $$1.accept($$0)))));
      } else {
         $$1.accept($$0);
      }
   }
}
