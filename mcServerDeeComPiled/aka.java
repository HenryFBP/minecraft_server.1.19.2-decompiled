import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public final class aka {
   private static final Map<bxw, Pair<String, String>> a = ImmutableMap.of(
      bxw.a,
      Pair.of("isGuiOpen", "isFilteringCraftable"),
      bxw.b,
      Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"),
      bxw.c,
      Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"),
      bxw.d,
      Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable")
   );
   private final Map<bxw, aka.a> b;

   private aka(Map<bxw, aka.a> $$0) {
      this.b = $$0;
   }

   public aka() {
      this(ad.a(Maps.newEnumMap(bxw.class), $$0 -> {
         for(bxw $$1 : bxw.values()) {
            $$0.put($$1, new aka.a(false, false));
         }

      }));
   }

   public boolean a(bxw $$0) {
      return ((aka.a)this.b.get($$0)).a;
   }

   public void a(bxw $$0, boolean $$1) {
      ((aka.a)this.b.get($$0)).a = $$1;
   }

   public boolean b(bxw $$0) {
      return ((aka.a)this.b.get($$0)).b;
   }

   public void b(bxw $$0, boolean $$1) {
      ((aka.a)this.b.get($$0)).b = $$1;
   }

   public static aka a(qx $$0) {
      Map<bxw, aka.a> $$1 = Maps.newEnumMap(bxw.class);

      for(bxw $$2 : bxw.values()) {
         boolean $$3 = $$0.readBoolean();
         boolean $$4 = $$0.readBoolean();
         $$1.put($$2, new aka.a($$3, $$4));
      }

      return new aka($$1);
   }

   public void b(qx $$0) {
      for(bxw $$1 : bxw.values()) {
         aka.a $$2 = (aka.a)this.b.get($$1);
         if ($$2 == null) {
            $$0.writeBoolean(false);
            $$0.writeBoolean(false);
         } else {
            $$0.writeBoolean($$2.a);
            $$0.writeBoolean($$2.b);
         }
      }

   }

   public static aka a(pj $$0) {
      Map<bxw, aka.a> $$1 = Maps.newEnumMap(bxw.class);
      a.forEach(($$2, $$3) -> {
         boolean $$4 = $$0.q((String)$$3.getFirst());
         boolean $$5 = $$0.q((String)$$3.getSecond());
         $$1.put($$2, new aka.a($$4, $$5));
      });
      return new aka($$1);
   }

   public void b(pj $$0) {
      a.forEach(($$1, $$2) -> {
         aka.a $$3 = (aka.a)this.b.get($$1);
         $$0.a((String)$$2.getFirst(), $$3.a);
         $$0.a((String)$$2.getSecond(), $$3.b);
      });
   }

   public aka a() {
      Map<bxw, aka.a> $$0 = Maps.newEnumMap(bxw.class);

      for(bxw $$1 : bxw.values()) {
         aka.a $$2 = (aka.a)this.b.get($$1);
         $$0.put($$1, $$2.a());
      }

      return new aka($$0);
   }

   public void a(aka $$0) {
      this.b.clear();

      for(bxw $$1 : bxw.values()) {
         aka.a $$2 = (aka.a)$$0.b.get($$1);
         this.b.put($$1, $$2.a());
      }

   }

   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof aka && this.b.equals(((aka)$$0).b);
   }

   public int hashCode() {
      return this.b.hashCode();
   }

   static final class a {
      boolean a;
      boolean b;

      public a(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aka.a a() {
         return new aka.a(this.a, this.b);
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if (!($$0 instanceof aka.a)) {
            return false;
         } else {
            aka.a $$1 = (aka.a)$$0;
            return this.a == $$1.a && this.b == $$1.b;
         }
      }

      public int hashCode() {
         int $$0 = this.a ? 1 : 0;
         return 31 * $$0 + (this.b ? 1 : 0);
      }

      public String toString() {
         return "[open=" + this.a + ", filtering=" + this.b + "]";
      }
   }
}
