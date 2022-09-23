import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class vj implements tc<tf> {
   private final vj.a a;
   private final List<vj.b> b;

   public vj(vj.a $$0, agh... $$1) {
      this.a = $$0;
      this.b = Lists.newArrayListWithCapacity($$1.length);

      for(agh $$2 : $$1) {
         this.b.add(a($$2));
      }

   }

   public vj(vj.a $$0, Collection<agh> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayListWithCapacity($$1.size());

      for(agh $$2 : $$1) {
         this.b.add(a($$2));
      }

   }

   public vj(qx $$0) {
      this.a = $$0.a(vj.a.class);
      this.b = $$0.a(this.a::a);
   }

   private static vj.b a(agh $$0) {
      buf $$1 = $$0.fz();
      buf.a $$2 = $$1 != null ? $$1.b() : null;
      return new vj.b($$0.fy(), $$0.e, $$0.d.b(), $$0.J(), $$2);
   }

   @Override
   public void a(qx $$0) {
      $$0.a((Enum<?>)this.a);
      $$0.a(this.b, this.a::a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public List<vj.b> b() {
      return this.b;
   }

   public vj.a c() {
      return this.a;
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("action", this.a).add("entries", this.b).toString();
   }

   public static enum a {
      a {
         @Override
         protected vj.b a(qx $$0) {
            GameProfile $$1 = $$0.x();
            cgu $$2 = cgu.a($$0.k());
            int $$3 = $$0.k();
            rq $$4 = $$0.c(qx::j);
            buf.a $$5 = $$0.c(buf.a::new);
            return new vj.b($$1, $$3, $$2, $$4, $$5);
         }

         @Override
         protected void a(qx $$0, vj.b $$1) {
            $$0.a($$1.a());
            $$0.d($$1.c().a());
            $$0.d($$1.b());
            $$0.a($$1.d(), qx::a);
            $$0.a($$1.e(), ($$0x, $$1x) -> $$1x.a($$0x));
         }
      },
      b {
         @Override
         protected vj.b a(qx $$0) {
            GameProfile $$1 = new GameProfile($$0.m(), null);
            cgu $$2 = cgu.a($$0.k());
            return new vj.b($$1, 0, $$2, null, null);
         }

         @Override
         protected void a(qx $$0, vj.b $$1) {
            $$0.a($$1.a().getId());
            $$0.d($$1.c().a());
         }
      },
      c {
         @Override
         protected vj.b a(qx $$0) {
            GameProfile $$1 = new GameProfile($$0.m(), null);
            int $$2 = $$0.k();
            return new vj.b($$1, $$2, null, null, null);
         }

         @Override
         protected void a(qx $$0, vj.b $$1) {
            $$0.a($$1.a().getId());
            $$0.d($$1.b());
         }
      },
      d {
         @Override
         protected vj.b a(qx $$0) {
            GameProfile $$1 = new GameProfile($$0.m(), null);
            rq $$2 = $$0.c(qx::j);
            return new vj.b($$1, 0, null, $$2, null);
         }

         @Override
         protected void a(qx $$0, vj.b $$1) {
            $$0.a($$1.a().getId());
            $$0.a($$1.d(), qx::a);
         }
      },
      e {
         @Override
         protected vj.b a(qx $$0) {
            GameProfile $$1 = new GameProfile($$0.m(), null);
            return new vj.b($$1, 0, null, null, null);
         }

         @Override
         protected void a(qx $$0, vj.b $$1) {
            $$0.a($$1.a().getId());
         }
      };

      protected abstract vj.b a(qx var1);

      protected abstract void a(qx var1, vj.b var2);
   }

   public static class b {
      private final int a;
      private final cgu b;
      private final GameProfile c;
      @Nullable
      private final rq d;
      @Nullable
      private final buf.a e;

      public b(GameProfile $$0, int $$1, @Nullable cgu $$2, @Nullable rq $$3, @Nullable buf.a $$4) {
         this.c = $$0;
         this.a = $$1;
         this.b = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public GameProfile a() {
         return this.c;
      }

      public int b() {
         return this.a;
      }

      public cgu c() {
         return this.b;
      }

      @Nullable
      public rq d() {
         return this.d;
      }

      @Nullable
      public buf.a e() {
         return this.e;
      }

      public String toString() {
         return MoreObjects.toStringHelper(this)
            .add("latency", this.a)
            .add("gameMode", this.b)
            .add("profile", this.c)
            .add("displayName", this.d == null ? null : rq.a.a(this.d))
            .add("profilePublicKey", this.e)
            .toString();
      }
   }
}
