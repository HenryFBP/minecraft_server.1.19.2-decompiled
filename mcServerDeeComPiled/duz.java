import java.util.function.Predicate;

public class duz {
   public static final duy a = a("inverted", new duu.a());
   public static final duy b = a("alternative", new dun.b());
   public static final duy c = a("random_chance", new dvc.a());
   public static final duy d = a("random_chance_with_looting", new dvd.a());
   public static final duy e = a("entity_properties", new dva.a());
   public static final duy f = a("killed_by_player", new dvb.a());
   public static final duy g = a("entity_scores", new dus.b());
   public static final duy h = a("block_state_property", new duw.b());
   public static final duy i = a("match_tool", new dve.a());
   public static final duy j = a("table_bonus", new duo.a());
   public static final duy k = a("survives_explosion", new dut.a());
   public static final duy l = a("damage_source_properties", new dur.a());
   public static final duy m = a("location_check", new duv.a());
   public static final duy n = a("weather_check", new dvh.b());
   public static final duy o = a("reference", new dup.a());
   public static final duy p = a("time_check", new dvf.b());
   public static final duy q = a("value_check", new dvg.a());

   private static duy a(String $$0, dsj<? extends dux> $$1) {
      return hm.a(hm.ax, new abb($$0), new duy($$1));
   }

   public static Object a() {
      return dsa.<dux, duy>a(hm.ax, "condition", "condition", dux::a).a();
   }

   public static <T> Predicate<T> a(Predicate<T>[] $$0) {
      switch($$0.length) {
         case 0:
            return $$0x -> true;
         case 1:
            return $$0[0];
         case 2:
            return $$0[0].and($$0[1]);
         default:
            return $$1 -> {
               for(Predicate<T> $$2 : $$0) {
                  if (!$$2.test($$1)) {
                     return false;
                  }
               }

               return true;
            };
      }
   }

   public static <T> Predicate<T> b(Predicate<T>[] $$0) {
      switch($$0.length) {
         case 0:
            return $$0x -> false;
         case 1:
            return $$0[0];
         case 2:
            return $$0[0].or($$0[1]);
         default:
            return $$1 -> {
               for(Predicate<T> $$2 : $$0) {
                  if ($$2.test($$1)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }
}
