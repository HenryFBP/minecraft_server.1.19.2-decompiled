import java.util.List;
import java.util.function.Consumer;

public class jc implements Consumer<Consumer<af>> {
   private static final int a = 384;
   private static final int b = 320;
   private static final int c = -64;
   private static final int d = 5;
   private static final bbr<?>[] e = new bbr[]{
      bbr.i,
      bbr.m,
      bbr.q,
      bbr.u,
      bbr.v,
      bbr.x,
      bbr.y,
      bbr.z,
      bbr.A,
      bbr.I,
      bbr.N,
      bbr.O,
      bbr.Q,
      bbr.aa,
      bbr.ap,
      bbr.ar,
      bbr.as,
      bbr.at,
      bbr.ay,
      bbr.aB,
      bbr.aD,
      bbr.aE,
      bbr.aG,
      bbr.aL,
      bbr.aN,
      bbr.aY,
      bbr.ba,
      bbr.bd,
      bbr.bf,
      bbr.be,
      bbr.bi,
      bbr.bl,
      bbr.bj,
      bbr.bm
   };

   private static cg.a a(cj.d $$0, bo $$1) {
      return cg.a.a(bo.a.a().a(bf.c(cj.c.c(30.0))).a(cf.a($$0)).b(), $$1);
   }

   private static dg.a a(bbr<?> $$0, cat $$1) {
      return dg.a.a(bo.a.a().a(cq.d.a().a(bo.a.a().a($$0).b()).b()), ca.a.a().a($$1));
   }

   public void a(Consumer<af> $$0) {
      af $$1 = af.a.a()
         .a(
            caz.sg,
            rq.c("advancements.adventure.root.title"),
            rq.c("advancements.adventure.root.description"),
            new abb("textures/gui/advancements/backgrounds/adventure.png"),
            ap.a,
            false,
            false,
            false
         )
         .a(aq.b)
         .a("killed_something", cc.a.c())
         .a("killed_by_something", cc.a.e())
         .a($$0, "adventure/root");
      af $$2 = af.a.a()
         .a($$1)
         .a(cju.ba, rq.c("advancements.adventure.sleep_in_bed.title"), rq.c("advancements.adventure.sleep_in_bed.description"), null, ap.a, true, true, false)
         .a("slept_in_bed", cr.a.c())
         .a($$0, "adventure/sleep_in_bed");
      a(af.a.a(), cig.a.b.b().toList())
         .a($$2)
         .a(
            caz.oj,
            rq.c("advancements.adventure.adventuring_time.title"),
            rq.c("advancements.adventure.adventuring_time.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(ai.a.a(500))
         .a($$0, "adventure/adventuring_time");
      af $$3 = af.a.a()
         .a($$1)
         .a(caz.mV, rq.c("advancements.adventure.trade.title"), rq.c("advancements.adventure.trade.description"), null, ap.a, true, true, false)
         .a("traded", dd.a.c())
         .a($$0, "adventure/trade");
      af.a.a()
         .a($$3)
         .a(
            caz.mV,
            rq.c("advancements.adventure.trade_at_world_height.title"),
            rq.c("advancements.adventure.trade_at_world_height.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("trade_at_world_height", dd.a.a(bo.a.a().a(ch.a(cj.c.b(319.0)))))
         .a($$0, "adventure/trade_at_world_height");
      af $$4 = this.a(af.a.a())
         .a($$1)
         .a(caz.nw, rq.c("advancements.adventure.kill_a_mob.title"), rq.c("advancements.adventure.kill_a_mob.description"), null, ap.a, true, true, false)
         .a(aq.b)
         .a($$0, "adventure/kill_a_mob");
      this.a(af.a.a())
         .a($$4)
         .a(
            caz.nB,
            rq.c("advancements.adventure.kill_all_mobs.title"),
            rq.c("advancements.adventure.kill_all_mobs.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(ai.a.a(100))
         .a($$0, "adventure/kill_all_mobs");
      af $$5 = af.a.a()
         .a($$4)
         .a(caz.mQ, rq.c("advancements.adventure.shoot_arrow.title"), rq.c("advancements.adventure.shoot_arrow.description"), null, ap.a, true, true, false)
         .a("shot_arrow", co.a.a(bc.a.a().a(bd.a.a().a(true).a(bo.a.a().a(akn.d)))))
         .a($$0, "adventure/shoot_arrow");
      af $$6 = af.a.a()
         .a($$4)
         .a(
            caz.tI,
            rq.c("advancements.adventure.throw_trident.title"),
            rq.c("advancements.adventure.throw_trident.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("shot_trident", co.a.a(bc.a.a().a(bd.a.a().a(true).a(bo.a.a().a(bbr.aU)))))
         .a($$0, "adventure/throw_trident");
      af.a.a()
         .a($$6)
         .a(
            caz.tI,
            rq.c("advancements.adventure.very_very_frightening.title"),
            rq.c("advancements.adventure.very_very_frightening.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("struck_villager", ay.a.a(bo.a.a().a(bbr.aZ).b()))
         .a($$0, "adventure/very_very_frightening");
      af.a.a()
         .a($$3)
         .a(
            cju.do,
            rq.c("advancements.adventure.summon_iron_golem.title"),
            rq.c("advancements.adventure.summon_iron_golem.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("summoned_golem", da.a.a(bo.a.a().a(bbr.S)))
         .a($$0, "adventure/summon_iron_golem");
      af.a.a()
         .a($$5)
         .a(caz.mR, rq.c("advancements.adventure.sniper_duel.title"), rq.c("advancements.adventure.sniper_duel.description"), null, ap.b, true, true, false)
         .a(ai.a.a(50))
         .a("killed_skeleton", cc.a.a(bo.a.a().a(bbr.aE).a(bf.a(cj.c.b(50.0))), bd.a.a().a(true)))
         .a($$0, "adventure/sniper_duel");
      af.a.a()
         .a($$4)
         .a(
            caz.tn,
            rq.c("advancements.adventure.totem_of_undying.title"),
            rq.c("advancements.adventure.totem_of_undying.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("used_totem", df.a.a(caz.tn))
         .a($$0, "adventure/totem_of_undying");
      af $$7 = af.a.a()
         .a($$1)
         .a(caz.tM, rq.c("advancements.adventure.ol_betsy.title"), rq.c("advancements.adventure.ol_betsy.description"), null, ap.a, true, true, false)
         .a("shot_crossbow", cu.a.a(caz.tM))
         .a($$0, "adventure/ol_betsy");
      af.a.a()
         .a($$7)
         .a(
            caz.tM,
            rq.c("advancements.adventure.whos_the_pillager_now.title"),
            rq.c("advancements.adventure.whos_the_pillager_now.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("kill_pillager", cb.a.a(bo.a.a().a(bbr.at)))
         .a($$0, "adventure/whos_the_pillager_now");
      af.a.a()
         .a($$7)
         .a(
            caz.tM,
            rq.c("advancements.adventure.two_birds_one_arrow.title"),
            rq.c("advancements.adventure.two_birds_one_arrow.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(ai.a.a(65))
         .a("two_birds", cb.a.a(bo.a.a().a(bbr.ap), bo.a.a().a(bbr.ap)))
         .a($$0, "adventure/two_birds_one_arrow");
      af.a.a()
         .a($$7)
         .a(caz.tM, rq.c("advancements.adventure.arbalistic.title"), rq.c("advancements.adventure.arbalistic.description"), null, ap.b, true, true, true)
         .a(ai.a.a(85))
         .a("arbalistic", cb.a.a(cj.d.a(5)))
         .a($$0, "adventure/arbalistic");
      af $$8 = af.a.a()
         .a($$1)
         .a(
            bvj.s(),
            rq.c("advancements.adventure.voluntary_exile.title"),
            rq.c("advancements.adventure.voluntary_exile.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("voluntary_exile", cc.a.a(bo.a.a().a(akn.b).a(bl.b)))
         .a($$0, "adventure/voluntary_exile");
      af.a.a()
         .a($$8)
         .a(
            bvj.s(),
            rq.c("advancements.adventure.hero_of_the_village.title"),
            rq.c("advancements.adventure.hero_of_the_village.description"),
            null,
            ap.b,
            true,
            true,
            true
         )
         .a(ai.a.a(100))
         .a("hero_of_the_village", cr.a.d())
         .a($$0, "adventure/hero_of_the_village");
      af.a.a()
         .a($$1)
         .a(
            cju.nR.l(),
            rq.c("advancements.adventure.honey_block_slide.title"),
            rq.c("advancements.adventure.honey_block_slide.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("honey_block_slide", cw.a.a(cju.nR))
         .a($$0, "adventure/honey_block_slide");
      af.a.a()
         .a($$5)
         .a(cju.nO.l(), rq.c("advancements.adventure.bullseye.title"), rq.c("advancements.adventure.bullseye.description"), null, ap.b, true, true, false)
         .a(ai.a.a(50))
         .a("bullseye", dc.a.a(cj.d.a(15), bo.b.a(bo.a.a().a(bf.a(cj.c.b(30.0))).b())))
         .a($$0, "adventure/bullseye");
      af.a.a()
         .a($$2)
         .a(
            caz.nX,
            rq.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            rq.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("walk_on_powder_snow_with_leather_boots", cr.a.a(cju.pn, caz.nX))
         .a($$0, "adventure/walk_on_powder_snow_with_leather_boots");
      af.a.a()
         .a($$1)
         .a(
            caz.la,
            rq.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            rq.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("lightning_rod_with_villager_no_fire", a(cj.d.a(0), bo.a.a().a(bbr.aZ).b()))
         .a($$0, "adventure/lightning_rod_with_villager_no_fire");
      af $$9 = af.a.a()
         .a($$1)
         .a(
            caz.pg,
            rq.c("advancements.adventure.spyglass_at_parrot.title"),
            rq.c("advancements.adventure.spyglass_at_parrot.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_parrot", a(bbr.ao, caz.pg))
         .a($$0, "adventure/spyglass_at_parrot");
      af $$10 = af.a.a()
         .a($$9)
         .a(
            caz.pg,
            rq.c("advancements.adventure.spyglass_at_ghast.title"),
            rq.c("advancements.adventure.spyglass_at_ghast.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_ghast", a(bbr.I, caz.pg))
         .a($$0, "adventure/spyglass_at_ghast");
      af.a.a()
         .a($$2)
         .a(
            caz.eh,
            rq.c("advancements.adventure.play_jukebox_in_meadows.title"),
            rq.c("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("play_jukebox_in_meadows", bz.a.a(ch.a.a().a(cia.D).a(au.a.a().a(cju.dc).b()), ca.a.a().a(aks.am)))
         .a($$0, "adventure/play_jukebox_in_meadows");
      af.a.a()
         .a($$10)
         .a(
            caz.pg,
            rq.c("advancements.adventure.spyglass_at_dragon.title"),
            rq.c("advancements.adventure.spyglass_at_dragon.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("spyglass_at_dragon", a(bbr.x, caz.pg))
         .a($$0, "adventure/spyglass_at_dragon");
      af.a.a()
         .a($$1)
         .a(
            caz.oI,
            rq.c("advancements.adventure.fall_from_world_height.title"),
            rq.c("advancements.adventure.fall_from_world_height.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("fall_from_world_height", bg.a.a(bo.a.a().a(ch.a(cj.c.c(-59.0))), bf.b(cj.c.b(379.0)), ch.a(cj.c.b(319.0))))
         .a($$0, "adventure/fall_from_world_height");
      af.a.a()
         .a($$4)
         .a(
            cju.pr,
            rq.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            rq.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a("kill_mob_near_sculk_catalyst", cc.a.d())
         .a($$0, "adventure/kill_mob_near_sculk_catalyst");
      af.a.a()
         .a($$1)
         .a(
            cju.po,
            rq.c("advancements.adventure.avoid_vibration.title"),
            rq.c("advancements.adventure.avoid_vibration.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("avoid_vibration", cr.a.e())
         .a($$0, "adventure/avoid_vibration");
   }

   private af.a a(af.a $$0) {
      for(bbr<?> $$1 : e) {
         $$0.a(hm.X.b($$1).toString(), cc.a.a(bo.a.a().a($$1)));
      }

      return $$0;
   }

   protected static af.a a(af.a $$0, List<aba<cht>> $$1) {
      for(aba<cht> $$2 : $$1) {
         $$0.a($$2.a().toString(), cr.a.a(ch.a($$2)));
      }

      return $$0;
   }
}
