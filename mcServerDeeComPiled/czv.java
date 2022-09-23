import javax.annotation.Nullable;

public class czv {
   public static final czv a = a("block_activate");
   public static final czv b = a("block_attach");
   public static final czv c = a("block_change");
   public static final czv d = a("block_close");
   public static final czv e = a("block_deactivate");
   public static final czv f = a("block_destroy");
   public static final czv g = a("block_detach");
   public static final czv h = a("block_open");
   public static final czv i = a("block_place");
   public static final czv j = a("container_close");
   public static final czv k = a("container_open");
   public static final czv l = a("dispense_fail");
   public static final czv m = a("drink");
   public static final czv n = a("eat");
   public static final czv o = a("elytra_glide");
   public static final czv p = a("entity_damage");
   public static final czv q = a("entity_die");
   public static final czv r = a("entity_interact");
   public static final czv s = a("entity_place");
   public static final czv t = a("entity_roar");
   public static final czv u = a("entity_shake");
   public static final czv v = a("equip");
   public static final czv w = a("explode");
   public static final czv x = a("flap");
   public static final czv y = a("fluid_pickup");
   public static final czv z = a("fluid_place");
   public static final czv A = a("hit_ground");
   public static final czv B = a("instrument_play");
   public static final czv C = a("item_interact_finish");
   public static final czv D = a("item_interact_start");
   public static final czv E = a("jukebox_play", 10);
   public static final czv F = a("jukebox_stop_play", 10);
   public static final czv G = a("lightning_strike");
   public static final czv H = a("note_block_play");
   public static final czv I = a("piston_contract");
   public static final czv J = a("piston_extend");
   public static final czv K = a("prime_fuse");
   public static final czv L = a("projectile_land");
   public static final czv M = a("projectile_shoot");
   public static final czv N = a("sculk_sensor_tendrils_clicking");
   public static final czv O = a("shear");
   public static final czv P = a("shriek", 32);
   public static final czv Q = a("splash");
   public static final czv R = a("step");
   public static final czv S = a("swim");
   public static final czv T = a("teleport");
   public static final int U = 16;
   private final String V;
   private final int W;
   private final hc.c<czv> X = hm.R.e(this);

   public czv(String $$0, int $$1) {
      this.V = $$0;
      this.W = $$1;
   }

   public String a() {
      return this.V;
   }

   public int b() {
      return this.W;
   }

   private static czv a(String $$0) {
      return a($$0, 16);
   }

   private static czv a(String $$0, int $$1) {
      return hm.a(hm.R, $$0, new czv($$0, $$1));
   }

   public String toString() {
      return "Game Event{ " + this.V + " , " + this.W + "}";
   }

   @Deprecated
   public hc.c<czv> c() {
      return this.X;
   }

   public boolean a(akz<czv> $$0) {
      return this.X.a($$0);
   }

   public static record a(@Nullable bbn a, @Nullable cvo b) {
      public static czv.a a(@Nullable bbn $$0) {
         return new czv.a($$0, null);
      }

      public static czv.a a(@Nullable cvo $$0) {
         return new czv.a(null, $$0);
      }

      public static czv.a a(@Nullable bbn $$0, @Nullable cvo $$1) {
         return new czv.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<czv.b> {
      private final czv a;
      private final dwq b;
      private final czv.a c;
      private final czx d;
      private final double e;

      public b(czv $$0, dwq $$1, czv.a $$2, czx $$3, dwq $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(czv.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public czv a() {
         return this.a;
      }

      public dwq b() {
         return this.b;
      }

      public czv.a c() {
         return this.c;
      }

      public czx d() {
         return this.d;
      }
   }
}
