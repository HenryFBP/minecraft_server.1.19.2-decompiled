import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class je implements Consumer<Consumer<af>> {
   private static final List<aba<cht>> a = ImmutableList.of(cia.ab, cia.ae, cia.ac, cia.ad, cia.af);
   private static final bo.b b = bo.b.a(
      dva.a(dsd.c.a, bo.a.a().a(bl.a.a().a(ca.a.a().a(caz.ok).b()).b())).invert().build(),
      dva.a(dsd.c.a, bo.a.a().a(bl.a.a().b(ca.a.a().a(caz.ol).b()).b())).invert().build(),
      dva.a(dsd.c.a, bo.a.a().a(bl.a.a().c(ca.a.a().a(caz.om).b()).b())).invert().build(),
      dva.a(dsd.c.a, bo.a.a().a(bl.a.a().d(ca.a.a().a(caz.on).b()).b())).invert().build()
   );

   public void a(Consumer<af> $$0) {
      af $$1 = af.a.a()
         .a(
            cju.jx,
            rq.c("advancements.nether.root.title"),
            rq.c("advancements.nether.root.description"),
            new abb("textures/gui/advancements/backgrounds/nether.png"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_nether", ax.a.a(cgx.f))
         .a($$0, "nether/root");
      af $$2 = af.a.a()
         .a($$1)
         .a(
            caz.rW,
            rq.c("advancements.nether.return_to_sender.title"),
            rq.c("advancements.nether.return_to_sender.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(ai.a.a(50))
         .a("killed_ghast", cc.a.a(bo.a.a().a(bbr.I), bd.a.a().a(true).a(bo.a.a().a(bbr.V))))
         .a($$0, "nether/return_to_sender");
      af $$3 = af.a.a()
         .a($$1)
         .a(cju.eu, rq.c("advancements.nether.find_fortress.title"), rq.c("advancements.nether.find_fortress.description"), null, ap.a, true, true, false)
         .a("fortress", cr.a.a(ch.c(dkv.o)))
         .a($$0, "nether/find_fortress");
      af.a.a()
         .a($$1)
         .a(caz.sg, rq.c("advancements.nether.fast_travel.title"), rq.c("advancements.nether.fast_travel.description"), null, ap.b, true, true, false)
         .a(ai.a.a(100))
         .a("travelled", bg.a.a(bf.a(cj.c.b(7000.0))))
         .a($$0, "nether/fast_travel");
      af.a.a()
         .a($$2)
         .a(caz.qp, rq.c("advancements.nether.uneasy_alliance.title"), rq.c("advancements.nether.uneasy_alliance.description"), null, ap.b, true, true, false)
         .a(ai.a.a(100))
         .a("killed_ghast", cc.a.a(bo.a.a().a(bbr.I).a(ch.b(cgx.e))))
         .a($$0, "nether/uneasy_alliance");
      af $$4 = af.a.a()
         .a($$3)
         .a(
            cju.fJ,
            rq.c("advancements.nether.get_wither_skull.title"),
            rq.c("advancements.nether.get_wither_skull.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("wither_skull", bx.a.a(cju.fJ))
         .a($$0, "nether/get_wither_skull");
      af $$5 = af.a.a()
         .a($$4)
         .a(caz.so, rq.c("advancements.nether.summon_wither.title"), rq.c("advancements.nether.summon_wither.description"), null, ap.a, true, true, false)
         .a("summoned", da.a.a(bo.a.a().a(bbr.be)))
         .a($$0, "nether/summon_wither");
      af $$6 = af.a.a()
         .a($$3)
         .a(
            caz.qo,
            rq.c("advancements.nether.obtain_blaze_rod.title"),
            rq.c("advancements.nether.obtain_blaze_rod.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("blaze_rod", bx.a.a(caz.qo))
         .a($$0, "nether/obtain_blaze_rod");
      af $$7 = af.a.a()
         .a($$5)
         .a(cju.eV, rq.c("advancements.nether.create_beacon.title"), rq.c("advancements.nether.create_beacon.description"), null, ap.a, true, true, false)
         .a("beacon", az.a.a(cj.d.b(1)))
         .a($$0, "nether/create_beacon");
      af.a.a()
         .a($$7)
         .a(
            cju.eV,
            rq.c("advancements.nether.create_full_beacon.title"),
            rq.c("advancements.nether.create_full_beacon.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("beacon", az.a.a(cj.d.a(4)))
         .a($$0, "nether/create_full_beacon");
      af $$8 = af.a.a()
         .a($$6)
         .a(caz.qs, rq.c("advancements.nether.brew_potion.title"), rq.c("advancements.nether.brew_potion.description"), null, ap.a, true, true, false)
         .a("potion", aw.a.c())
         .a($$0, "nether/brew_potion");
      af $$9 = af.a.a()
         .a($$8)
         .a(caz.oN, rq.c("advancements.nether.all_potions.title"), rq.c("advancements.nether.all_potions.description"), null, ap.b, true, true, false)
         .a(ai.a.a(100))
         .a("all_effects", bh.a.a(ck.a().a(bbi.a).a(bbi.b).a(bbi.e).a(bbi.h).a(bbi.j).a(bbi.l).a(bbi.m).a(bbi.n).a(bbi.p).a(bbi.r).a(bbi.s).a(bbi.B).a(bbi.k)))
         .a($$0, "nether/all_potions");
      af.a.a()
         .a($$9)
         .a(caz.oH, rq.c("advancements.nether.all_effects.title"), rq.c("advancements.nether.all_effects.description"), null, ap.b, true, true, true)
         .a(ai.a.a(1000))
         .a(
            "all_effects",
            bh.a.a(
               ck.a()
                  .a(bbi.a)
                  .a(bbi.b)
                  .a(bbi.e)
                  .a(bbi.h)
                  .a(bbi.j)
                  .a(bbi.l)
                  .a(bbi.m)
                  .a(bbi.n)
                  .a(bbi.p)
                  .a(bbi.r)
                  .a(bbi.s)
                  .a(bbi.t)
                  .a(bbi.c)
                  .a(bbi.d)
                  .a(bbi.y)
                  .a(bbi.x)
                  .a(bbi.v)
                  .a(bbi.q)
                  .a(bbi.i)
                  .a(bbi.k)
                  .a(bbi.B)
                  .a(bbi.C)
                  .a(bbi.D)
                  .a(bbi.o)
                  .a(bbi.E)
                  .a(bbi.F)
                  .a(bbi.G)
            )
         )
         .a($$0, "nether/all_effects");
      af $$10 = af.a.a()
         .a($$1)
         .a(
            caz.aj,
            rq.c("advancements.nether.obtain_ancient_debris.title"),
            rq.c("advancements.nether.obtain_ancient_debris.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ancient_debris", bx.a.a(caz.aj))
         .a($$0, "nether/obtain_ancient_debris");
      af.a.a()
         .a($$10)
         .a(caz.op, rq.c("advancements.nether.netherite_armor.title"), rq.c("advancements.nether.netherite_armor.description"), null, ap.b, true, true, false)
         .a(ai.a.a(100))
         .a("netherite_armor", bx.a.a(caz.oo, caz.op, caz.oq, caz.or))
         .a($$0, "nether/netherite_armor");
      af.a.a()
         .a($$10)
         .a(caz.us, rq.c("advancements.nether.use_lodestone.title"), rq.c("advancements.nether.use_lodestone.description"), null, ap.a, true, true, false)
         .a("use_lodestone", bz.a.a(ch.a.a().a(au.a.a().a(cju.ob).b()), ca.a.a().a(caz.pb)))
         .a($$0, "nether/use_lodestone");
      af $$11 = af.a.a()
         .a($$1)
         .a(
            caz.ut,
            rq.c("advancements.nether.obtain_crying_obsidian.title"),
            rq.c("advancements.nether.obtain_crying_obsidian.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("crying_obsidian", bx.a.a(caz.ut))
         .a($$0, "nether/obtain_crying_obsidian");
      af.a.a()
         .a($$11)
         .a(
            caz.uG,
            rq.c("advancements.nether.charge_respawn_anchor.title"),
            rq.c("advancements.nether.charge_respawn_anchor.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("charge_respawn_anchor", bz.a.a(ch.a.a().a(au.a.a().a(cju.nW).a(cz.a.a().a(cpr.c, 4).b()).b()), ca.a.a().a(cju.dm)))
         .a($$0, "nether/charge_respawn_anchor");
      af $$12 = af.a.a()
         .a($$1)
         .a(caz.mu, rq.c("advancements.nether.ride_strider.title"), rq.c("advancements.nether.ride_strider.description"), null, ap.a, true, true, false)
         .a("used_warped_fungus_on_a_stick", by.a.a(bo.b.a(bo.a.a().a(bo.a.a().a(bbr.aO).b()).b()), ca.a.a().a(caz.mu).b(), cj.d.e))
         .a($$0, "nether/ride_strider");
      af.a.a()
         .a($$12)
         .a(
            caz.mu,
            rq.c("advancements.nether.ride_strider_in_overworld_lava.title"),
            rq.c("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_entity_distance", bg.a.a(bo.a.a().a(ch.b(cgx.e)).a(bo.a.a().a(bbr.aO).b()), bf.a(cj.c.b(50.0))))
         .a($$0, "nether/ride_strider_in_overworld_lava");
      jc.a(af.a.a(), a)
         .a($$12)
         .a(caz.or, rq.c("advancements.nether.explore_nether.title"), rq.c("advancements.nether.explore_nether.description"), null, ap.b, true, true, false)
         .a(ai.a.a(500))
         .a($$0, "nether/explore_nether");
      af $$13 = af.a.a()
         .a($$1)
         .a(caz.uC, rq.c("advancements.nether.find_bastion.title"), rq.c("advancements.nether.find_bastion.description"), null, ap.a, true, true, false)
         .a("bastion", cr.a.a(ch.c(dkv.s)))
         .a($$0, "nether/find_bastion");
      af.a.a()
         .a($$13)
         .a(cju.cg, rq.c("advancements.nether.loot_bastion.title"), rq.c("advancements.nether.loot_bastion.description"), null, ap.a, true, true, false)
         .a(aq.b)
         .a("loot_bastion_other", ci.a.a(new abb("minecraft:chests/bastion_other")))
         .a("loot_bastion_treasure", ci.a.a(new abb("minecraft:chests/bastion_treasure")))
         .a("loot_bastion_hoglin_stable", ci.a.a(new abb("minecraft:chests/bastion_hoglin_stable")))
         .a("loot_bastion_bridge", ci.a.a(new abb("minecraft:chests/bastion_bridge")))
         .a($$0, "nether/loot_bastion");
      af.a.a()
         .a($$1)
         .a(aq.b)
         .a(caz.ne, rq.c("advancements.nether.distract_piglin.title"), rq.c("advancements.nether.distract_piglin.description"), null, ap.a, true, true, false)
         .a("distract_piglin", cm.a.a(b, ca.a.a().a(aks.Q).b(), bo.b.a(bo.a.a().a(bbr.ar).a(bm.a.a().e(false).b()).b())))
         .a("distract_piglin_directly", cp.a.a(b, ca.a.a().a(bst.c), bo.b.a(bo.a.a().a(bbr.ar).a(bm.a.a().e(false).b()).b())))
         .a($$0, "nether/distract_piglin");
   }
}
