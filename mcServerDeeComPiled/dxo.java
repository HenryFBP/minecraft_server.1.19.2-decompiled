import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxo {
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 18;
   public static final int f = 19;
   private final Map<String, dxl> h = Maps.newHashMap();
   private final Map<dxr, List<dxl>> i = Maps.newHashMap();
   private final Map<String, Map<dxl, dxn>> j = Maps.newHashMap();
   private final dxl[] k = new dxl[19];
   private final Map<String, dxm> l = Maps.newHashMap();
   private final Map<String, dxm> m = Maps.newHashMap();
   @Nullable
   private static String[] n;

   public boolean b(String $$0) {
      return this.h.containsKey($$0);
   }

   public dxl c(String $$0) {
      return (dxl)this.h.get($$0);
   }

   @Nullable
   public dxl d(@Nullable String $$0) {
      return (dxl)this.h.get($$0);
   }

   public dxl a(String $$0, dxr $$1, rq $$2, dxr.a $$3) {
      if (this.h.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         dxl $$4 = new dxl(this, $$0, $$1, $$2, $$3);
         ((List)this.i.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$4);
         this.h.put($$0, $$4);
         this.a($$4);
         return $$4;
      }
   }

   public final void a(dxr $$0, String $$1, Consumer<dxn> $$2) {
      ((List)this.i.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.c($$1, $$2x)));
   }

   public boolean b(String $$0, dxl $$1) {
      Map<dxl, dxn> $$2 = (Map)this.j.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         dxn $$3 = (dxn)$$2.get($$1);
         return $$3 != null;
      }
   }

   public dxn c(String $$0, dxl $$1) {
      Map<dxl, dxn> $$2 = (Map)this.j.computeIfAbsent($$0, $$0x -> Maps.newHashMap());
      return (dxn)$$2.computeIfAbsent($$1, $$1x -> {
         dxn $$2x = new dxn(this, $$1x, $$0);
         $$2x.b(0);
         return $$2x;
      });
   }

   public Collection<dxn> i(dxl $$0) {
      List<dxn> $$1 = Lists.newArrayList();

      for(Map<dxl, dxn> $$2 : this.j.values()) {
         dxn $$3 = (dxn)$$2.get($$0);
         if ($$3 != null) {
            $$1.add($$3);
         }
      }

      $$1.sort(dxn.a);
      return $$1;
   }

   public Collection<dxl> c() {
      return this.h.values();
   }

   public Collection<String> d() {
      return this.h.keySet();
   }

   public Collection<String> e() {
      return Lists.newArrayList(this.j.keySet());
   }

   public void d(String $$0, @Nullable dxl $$1) {
      if ($$1 == null) {
         Map<dxl, dxn> $$2 = (Map)this.j.remove($$0);
         if ($$2 != null) {
            this.a($$0);
         }
      } else {
         Map<dxl, dxn> $$3 = (Map)this.j.get($$0);
         if ($$3 != null) {
            dxn $$4 = (dxn)$$3.remove($$1);
            if ($$3.size() < 1) {
               Map<dxl, dxn> $$5 = (Map)this.j.remove($$0);
               if ($$5 != null) {
                  this.a($$0);
               }
            } else if ($$4 != null) {
               this.a($$0, $$1);
            }
         }
      }

   }

   public Map<dxl, dxn> e(String $$0) {
      Map<dxl, dxn> $$1 = (Map)this.j.get($$0);
      if ($$1 == null) {
         $$1 = Maps.newHashMap();
      }

      return $$1;
   }

   public void j(dxl $$0) {
      this.h.remove($$0.b());

      for(int $$1 = 0; $$1 < 19; ++$$1) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<dxl> $$2 = (List)this.i.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for(Map<dxl, dxn> $$3 : this.j.values()) {
         $$3.remove($$0);
      }

      this.c($$0);
   }

   public void a(int $$0, @Nullable dxl $$1) {
      this.k[$$0] = $$1;
   }

   @Nullable
   public dxl a(int $$0) {
      return this.k[$$0];
   }

   @Nullable
   public dxm f(String $$0) {
      return (dxm)this.l.get($$0);
   }

   public dxm g(String $$0) {
      dxm $$1 = this.f($$0);
      if ($$1 != null) {
         g.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new dxm(this, $$0);
         this.l.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(dxm $$0) {
      this.l.remove($$0.b());

      for(String $$1 : $$0.g()) {
         this.m.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, dxm $$1) {
      if (this.i($$0) != null) {
         this.h($$0);
      }

      this.m.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean h(String $$0) {
      dxm $$1 = this.i($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, dxm $$1) {
      if (this.i($$0) != $$1) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.b() + "'.");
      } else {
         this.m.remove($$0);
         $$1.g().remove($$0);
      }
   }

   public Collection<String> f() {
      return this.l.keySet();
   }

   public Collection<dxm> g() {
      return this.l.values();
   }

   @Nullable
   public dxm i(String $$0) {
      return (dxm)this.m.get($$0);
   }

   public void a(dxl $$0) {
   }

   public void b(dxl $$0) {
   }

   public void c(dxl $$0) {
   }

   public void a(dxn $$0) {
   }

   public void a(String $$0) {
   }

   public void a(String $$0, dxl $$1) {
   }

   public void a(dxm $$0) {
   }

   public void b(dxm $$0) {
   }

   public void c(dxm $$0) {
   }

   public static String b(int $$0) {
      switch($$0) {
         case 0:
            return "list";
         case 1:
            return "sidebar";
         case 2:
            return "belowName";
         default:
            if ($$0 >= 3 && $$0 <= 18) {
               p $$1 = p.a($$0 - 3);
               if ($$1 != null && $$1 != p.v) {
                  return "sidebar.team." + $$1.g();
               }
            }

            return null;
      }
   }

   public static int j(String $$0) {
      if ("list".equalsIgnoreCase($$0)) {
         return 0;
      } else if ("sidebar".equalsIgnoreCase($$0)) {
         return 1;
      } else if ("belowName".equalsIgnoreCase($$0)) {
         return 2;
      } else {
         if ($$0.startsWith("sidebar.team.")) {
            String $$1 = $$0.substring("sidebar.team.".length());
            p $$2 = p.b($$1);
            if ($$2 != null && $$2.b() >= 0) {
               return $$2.b() + 3;
            }
         }

         return -1;
      }
   }

   public static String[] h() {
      if (n == null) {
         n = new String[19];

         for(int $$0 = 0; $$0 < 19; ++$$0) {
            n[$$0] = b($$0);
         }
      }

      return n;
   }

   public void a(bbn $$0) {
      if ($$0 != null && !($$0 instanceof buc) && !$$0.bo()) {
         String $$1 = $$0.cp();
         this.d($$1, null);
         this.h($$1);
      }
   }

   protected pp i() {
      pp $$0 = new pp();
      this.j.values().stream().map(Map::values).forEach($$1 -> $$1.stream().filter($$0xx -> $$0xx.d() != null).forEach($$1x -> {
            pj $$2 = new pj();
            $$2.a("Name", $$1x.e());
            $$2.a("Objective", $$1x.d().b());
            $$2.a("Score", $$1x.b());
            $$2.a("Locked", $$1x.g());
            $$0.add($$2);
         }));
      return $$0;
   }

   protected void a(pp $$0) {
      for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
         pj $$2 = $$0.a($$1);
         dxl $$3 = this.c($$2.l("Objective"));
         String $$4 = $$2.l("Name");
         dxn $$5 = this.c($$4, $$3);
         $$5.b($$2.h("Score"));
         if ($$2.e("Locked")) {
            $$5.a($$2.q("Locked"));
         }
      }

   }
}
