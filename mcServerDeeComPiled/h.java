import java.util.Arrays;

public enum h {
   a(0, 1, 2),
   b(1, 0, 2),
   c(0, 2, 1),
   d(1, 2, 0),
   e(2, 0, 1),
   f(2, 1, 0);

   private final int[] g;
   private final c h;
   private static final int i = 3;
   private static final h[][] j = ad.a(new h[values().length][values().length], $$0 -> {
      for(h $$1 : values()) {
         for(h $$2 : values()) {
            int[] $$3 = new int[3];

            for(int $$4 = 0; $$4 < 3; ++$$4) {
               $$3[$$4] = $$1.g[$$2.g[$$4]];
            }

            h $$5 = (h)Arrays.stream(values()).filter($$1x -> Arrays.equals($$1x.g, $$3)).findFirst().get();
            $$0[$$1.ordinal()][$$2.ordinal()] = $$5;
         }
      }

   });

   private h(int $$0, int $$1, int $$2) {
      this.g = new int[]{$$0, $$1, $$2};
      this.h = new c();
      this.h.a(0, this.a(0), 1.0F);
      this.h.a(1, this.a(1), 1.0F);
      this.h.a(2, this.a(2), 1.0F);
   }

   public h a(h $$0) {
      return j[this.ordinal()][$$0.ordinal()];
   }

   public int a(int $$0) {
      return this.g[$$0];
   }

   public c a() {
      return this.h;
   }
}
