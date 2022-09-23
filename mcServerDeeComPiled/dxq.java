import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dxq {
   public boolean a(@Nullable dxq $$0) {
      if ($$0 == null) {
         return false;
      } else {
         return this == $$0;
      }
   }

   public abstract String b();

   public abstract sb d(rq var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract dxq.b j();

   public abstract p n();

   public abstract Collection<String> g();

   public abstract dxq.b k();

   public abstract dxq.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, dxq.a> g = (Map<String, dxq.a>)Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> $$0));
      public final String e;
      public final int f;

      @Nullable
      public static dxq.a a(String $$0) {
         return (dxq.a)g.get($$0);
      }

      private a(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public rq a() {
         return rq.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, dxq.b> g = (Map<String, dxq.b>)Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> $$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return (String[])g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static dxq.b a(String $$0) {
         return (dxq.b)g.get($$0);
      }

      private b(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public rq b() {
         return rq.c("team.visibility." + this.e);
      }
   }
}
