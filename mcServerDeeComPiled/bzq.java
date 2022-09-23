import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum bzq implements amw {
   a(0, "white", 16383998, dqa.i, 15790320, 16777215),
   b(1, "orange", 16351261, dqa.p, 15435844, 16738335),
   c(2, "magenta", 13061821, dqa.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, dqa.r, 6719955, 10141901),
   e(4, "yellow", 16701501, dqa.s, 14602026, 16776960),
   f(5, "lime", 8439583, dqa.t, 4312372, 12582656),
   g(6, "pink", 15961002, dqa.u, 14188952, 16738740),
   h(7, "gray", 4673362, dqa.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, dqa.w, 11250603, 13882323),
   j(9, "cyan", 1481884, dqa.x, 2651799, 65535),
   k(10, "purple", 8991416, dqa.y, 8073150, 10494192),
   l(11, "blue", 3949738, dqa.z, 2437522, 255),
   m(12, "brown", 8606770, dqa.A, 5320730, 9127187),
   n(13, "green", 6192150, dqa.B, 3887386, 65280),
   o(14, "red", 11546150, dqa.C, 11743532, 16711680),
   p(15, "black", 1908001, dqa.D, 1973019, 0);

   private static final bzq[] q = (bzq[])Arrays.stream(values()).sorted(Comparator.comparingInt(bzq::a)).toArray($$0 -> new bzq[$$0]);
   private static final Int2ObjectOpenHashMap<bzq> r = new Int2ObjectOpenHashMap(
      (Map)Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.w, $$0 -> $$0))
   );
   private final int s;
   private final String t;
   private final dqa u;
   private final float[] v;
   private final int w;
   private final int x;

   private bzq(int $$0, String $$1, int $$2, dqa $$3, int $$4, int $$5) {
      this.s = $$0;
      this.t = $$1;
      this.u = $$3;
      this.x = $$5;
      int $$6 = ($$2 & 0xFF0000) >> 16;
      int $$7 = ($$2 & 0xFF00) >> 8;
      int $$8 = ($$2 & 0xFF) >> 0;
      this.v = new float[]{(float)$$6 / 255.0F, (float)$$7 / 255.0F, (float)$$8 / 255.0F};
      this.w = $$4;
   }

   public int a() {
      return this.s;
   }

   public String b() {
      return this.t;
   }

   public float[] d() {
      return this.v;
   }

   public dqa e() {
      return this.u;
   }

   public int f() {
      return this.w;
   }

   public int g() {
      return this.x;
   }

   public static bzq a(int $$0) {
      if ($$0 < 0 || $$0 >= q.length) {
         $$0 = 0;
      }

      return q[$$0];
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static bzq a(String $$0, @Nullable bzq $$1) {
      for(bzq $$2 : values()) {
         if ($$2.t.equals($$0)) {
            return $$2;
         }
      }

      return $$1;
   }

   @Nullable
   public static bzq b(int $$0) {
      return (bzq)r.get($$0);
   }

   public String toString() {
      return this.t;
   }

   @Override
   public String c() {
      return this.t;
   }
}
