import java.util.function.BiFunction;

public class dtq {
   public static final BiFunction<cax, dsd, cax> a = ($$0, $$1) -> $$0;
   public static final dtp b = a("set_count", new dty.a());
   public static final dtp c = a("enchant_with_levels", new dti.b());
   public static final dtp d = a("enchant_randomly", new dth.b());
   public static final dtp e = a("set_enchantments", new dtw.b());
   public static final dtp f = a("set_nbt", new duc.a());
   public static final dtp g = a("furnace_smelt", new duf.a());
   public static final dtp h = a("looting_enchant", new dtr.b());
   public static final dtp i = a("set_damage", new dtz.a());
   public static final dtp j = a("set_attributes", new dts.d());
   public static final dtp k = a("set_name", new dub.a());
   public static final dtp l = a("exploration_map", new dtj.b());
   public static final dtp m = a("set_stew_effect", new due.b());
   public static final dtp n = a("copy_name", new dtf.b());
   public static final dtp o = a("set_contents", new dtu.b());
   public static final dtp p = a("limit_count", new dtm.a());
   public static final dtp q = a("apply_bonus", new dtc.e());
   public static final dtp r = a("set_loot_table", new dtv.a());
   public static final dtp s = a("explosion_decay", new dtd.a());
   public static final dtp t = a("set_lore", new dua.b());
   public static final dtp u = a("fill_player_head", new dtk.a());
   public static final dtp v = a("copy_nbt", new dtg.d());
   public static final dtp w = a("copy_state", new dte.b());
   public static final dtp x = a("set_banner_pattern", new dtt.b());
   public static final dtp y = a("set_potion", new dud.a());
   public static final dtp z = a("set_instrument", new dtx.a());

   private static dtp a(String $$0, dsj<? extends dto> $$1) {
      return hm.a(hm.aw, new abb($$0), new dtp($$1));
   }

   public static Object a() {
      return dsa.<dto, dtp>a(hm.aw, "function", "function", dto::a).a();
   }

   public static BiFunction<cax, dsd, cax> a(BiFunction<cax, dsd, cax>[] $$0) {
      switch($$0.length) {
         case 0:
            return a;
         case 1:
            return $$0[0];
         case 2:
            BiFunction<cax, dsd, cax> $$1 = $$0[0];
            BiFunction<cax, dsd, cax> $$2 = $$0[1];
            return ($$2x, $$3) -> (cax)$$2.apply((cax)$$1.apply($$2x, $$3), $$3);
         default:
            return ($$1x, $$2x) -> {
               for(BiFunction<cax, dsd, cax> $$3 : $$0) {
                  $$1x = (cax)$$3.apply($$1x, $$2x);
               }

               return $$1x;
            };
      }
   }
}
