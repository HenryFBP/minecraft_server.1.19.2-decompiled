public class uc implements tc<tf> {
   private static final int s = 1048576;
   public static final abb a = new abb("brand");
   public static final abb b = new abb("debug/path");
   public static final abb c = new abb("debug/neighbors_update");
   public static final abb d = new abb("debug/structures");
   public static final abb e = new abb("debug/worldgen_attempt");
   public static final abb f = new abb("debug/poi_ticket_count");
   public static final abb g = new abb("debug/poi_added");
   public static final abb h = new abb("debug/poi_removed");
   public static final abb i = new abb("debug/village_sections");
   public static final abb j = new abb("debug/goal_selector");
   public static final abb k = new abb("debug/brain");
   public static final abb l = new abb("debug/bee");
   public static final abb m = new abb("debug/hive");
   public static final abb n = new abb("debug/game_test_add_marker");
   public static final abb o = new abb("debug/game_test_clear");
   public static final abb p = new abb("debug/raids");
   public static final abb q = new abb("debug/game_event");
   public static final abb r = new abb("debug/game_event_listeners");
   private final abb t;
   private final qx u;

   public uc(abb $$0, qx $$1) {
      this.t = $$0;
      this.u = $$1;
      if ($$1.writerIndex() > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   public uc(qx $$0) {
      this.t = $$0.r();
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         this.u = new qx($$0.readBytes($$1));
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.t);
      $$0.writeBytes(this.u.copy());
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public abb b() {
      return this.t;
   }

   public qx c() {
      return new qx(this.u.copy());
   }
}
