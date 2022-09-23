import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class dxr {
   private static final Map<String, dxr> n = Maps.newHashMap();
   private static final Map<String, dxr> o = Maps.newHashMap();
   public static final dxr a = b("dummy");
   public static final dxr b = b("trigger");
   public static final dxr c = b("deathCount");
   public static final dxr d = b("playerKillCount");
   public static final dxr e = b("totalKillCount");
   public static final dxr f = a("health", true, dxr.a.b);
   public static final dxr g = a("food", true, dxr.a.a);
   public static final dxr h = a("air", true, dxr.a.a);
   public static final dxr i = a("armor", true, dxr.a.a);
   public static final dxr j = a("xp", true, dxr.a.a);
   public static final dxr k = a("level", true, dxr.a.a);
   public static final dxr[] l = new dxr[]{
      b("teamkill." + p.a.g()),
      b("teamkill." + p.b.g()),
      b("teamkill." + p.c.g()),
      b("teamkill." + p.d.g()),
      b("teamkill." + p.e.g()),
      b("teamkill." + p.f.g()),
      b("teamkill." + p.g.g()),
      b("teamkill." + p.h.g()),
      b("teamkill." + p.i.g()),
      b("teamkill." + p.j.g()),
      b("teamkill." + p.k.g()),
      b("teamkill." + p.l.g()),
      b("teamkill." + p.m.g()),
      b("teamkill." + p.n.g()),
      b("teamkill." + p.o.g()),
      b("teamkill." + p.p.g())
   };
   public static final dxr[] m = new dxr[]{
      b("killedByTeam." + p.a.g()),
      b("killedByTeam." + p.b.g()),
      b("killedByTeam." + p.c.g()),
      b("killedByTeam." + p.d.g()),
      b("killedByTeam." + p.e.g()),
      b("killedByTeam." + p.f.g()),
      b("killedByTeam." + p.g.g()),
      b("killedByTeam." + p.h.g()),
      b("killedByTeam." + p.i.g()),
      b("killedByTeam." + p.j.g()),
      b("killedByTeam." + p.k.g()),
      b("killedByTeam." + p.l.g()),
      b("killedByTeam." + p.m.g()),
      b("killedByTeam." + p.n.g()),
      b("killedByTeam." + p.o.g()),
      b("killedByTeam." + p.p.g())
   };
   private final String p;
   private final boolean q;
   private final dxr.a r;

   private static dxr a(String $$0, boolean $$1, dxr.a $$2) {
      dxr $$3 = new dxr($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static dxr b(String $$0) {
      return a($$0, false, dxr.a.a);
   }

   protected dxr(String $$0) {
      this($$0, false, dxr.a.a);
   }

   protected dxr(String $$0, boolean $$1, dxr.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<dxr> a(String $$0) {
      dxr $$1 = (dxr)o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : hm.an.b(abb.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, abb.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<dxr> a(akf<T> $$0, abb $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public dxr.a f() {
      return this.r;
   }

   public static enum a {
      a("integer"),
      b("hearts");

      private final String c;
      private static final Map<String, dxr.a> d;

      private a(String $$0) {
         this.c = $$0;
      }

      public String a() {
         return this.c;
      }

      public static dxr.a a(String $$0) {
         return (dxr.a)d.getOrDefault($$0, a);
      }

      static {
         Builder<String, dxr.a> $$0 = ImmutableMap.builder();

         for(dxr.a $$1 : values()) {
            $$0.put($$1.c, $$1);
         }

         d = $$0.build();
      }
   }
}
