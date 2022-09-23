import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class dmd {
   private final int a;
   private final int b;
   private final int c;
   private final int d;
   private final dmk.a e;

   public dmd(int $$0, int $$1, int $$2, int $$3, dmk.a $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public dmk.a e() {
      return this.e;
   }

   public <T> Dynamic<T> a(DynamicOps<T> $$0) {
      Builder<T, T> $$1 = ImmutableMap.builder();
      $$1.put($$0.createString("source_x"), $$0.createInt(this.a))
         .put($$0.createString("source_ground_y"), $$0.createInt(this.b))
         .put($$0.createString("source_z"), $$0.createInt(this.c))
         .put($$0.createString("delta_y"), $$0.createInt(this.d))
         .put($$0.createString("dest_proj"), $$0.createString(this.e.a()));
      return new Dynamic($$0, $$0.createMap($$1.build()));
   }

   public static <T> dmd a(Dynamic<T> $$0) {
      return new dmd(
         $$0.get("source_x").asInt(0),
         $$0.get("source_ground_y").asInt(0),
         $$0.get("source_z").asInt(0),
         $$0.get("delta_y").asInt(0),
         dmk.a.a($$0.get("dest_proj").asString(""))
      );
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         dmd $$1 = (dmd)$$0;
         if (this.a != $$1.a) {
            return false;
         } else if (this.c != $$1.c) {
            return false;
         } else if (this.d != $$1.d) {
            return false;
         } else {
            return this.e == $$1.e;
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      int $$0 = this.a;
      $$0 = 31 * $$0 + this.b;
      $$0 = 31 * $$0 + this.c;
      $$0 = 31 * $$0 + this.d;
      return 31 * $$0 + this.e.hashCode();
   }

   public String toString() {
      return "JigsawJunction{sourceX="
         + this.a
         + ", sourceGroundY="
         + this.b
         + ", sourceZ="
         + this.c
         + ", deltaY="
         + this.d
         + ", destProjection="
         + this.e
         + "}";
   }
}
