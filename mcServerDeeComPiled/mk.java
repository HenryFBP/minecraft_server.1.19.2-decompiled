import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class mk {
   public static final hc<dmk> a = mm.a(
      new dmk(new abb("pillager_outpost/base_plates"), new abb("empty"), ImmutableList.of(Pair.of(dmi.a("pillager_outpost/base_plate"), 1)), dmk.a.b)
   );

   public static void a() {
   }

   static {
      mm.a(
         new dmk(
            new abb("pillager_outpost/towers"),
            new abb("empty"),
            ImmutableList.of(Pair.of(dmi.a(ImmutableList.of(dmi.a("pillager_outpost/watchtower"), dmi.a("pillager_outpost/watchtower_overgrown", mn.r))), 1)),
            dmk.a.b
         )
      );
      mm.a(
         new dmk(new abb("pillager_outpost/feature_plates"), new abb("empty"), ImmutableList.of(Pair.of(dmi.a("pillager_outpost/feature_plate"), 1)), dmk.a.a)
      );
      mm.a(
         new dmk(
            new abb("pillager_outpost/features"),
            new abb("empty"),
            ImmutableList.of(
               Pair.of(dmi.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dmi.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dmi.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dmi.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dmi.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dmi.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dmi.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dmi.g(), 6)
            ),
            dmk.a.b
         )
      );
   }
}
