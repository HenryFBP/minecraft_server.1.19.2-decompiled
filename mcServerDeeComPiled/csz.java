import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class csz {
   final String a;

   public csz(String $$0) {
      this.a = $$0;
   }

   public static abb a(aba<csz> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      abb $$3 = $$0.a();
      return new abb($$3.b(), "entity/" + $$2 + "/" + $$3.a());
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static hc<csz> a(String $$0) {
      return (hc<csz>)hm.bO.g().filter($$1 -> ((csz)$$1.a()).a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<hc<csz>, bzq>> a = Lists.newArrayList();

      public csz.a a(aba<csz> $$0, bzq $$1) {
         return this.a(hm.bO.h($$0), $$1);
      }

      public csz.a a(hc<csz> $$0, bzq $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public csz.a a(Pair<hc<csz>, bzq> $$0) {
         this.a.add($$0);
         return this;
      }

      public pp a() {
         pp $$0 = new pp();

         for(Pair<hc<csz>, bzq> $$1 : this.a) {
            pj $$2 = new pj();
            $$2.a("Pattern", ((csz)((hc)$$1.getFirst()).a()).a);
            $$2.a("Color", ((bzq)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
