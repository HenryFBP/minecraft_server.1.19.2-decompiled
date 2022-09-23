import com.google.common.collect.BiMap;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class jd implements Consumer<Consumer<af>> {
   private static final bbr<?>[] a = new bbr[]{
      bbr.P, bbr.s, bbr.aj, bbr.aA, bbr.p, bbr.ak, bbr.aq, bbr.n, bbr.bh, bbr.al, bbr.ax, bbr.Y, bbr.l, bbr.an, bbr.G, bbr.h, bbr.O, bbr.aO, bbr.M, bbr.f
   };
   private static final bbr<?>[] b = new bbr[]{bbr.aX, bbr.H};
   private static final cat[] c = new cat[]{caz.pi, caz.pk, caz.pl, caz.pj};
   private static final cat[] d = new cat[]{caz.oQ, caz.oR, caz.oO, caz.oP};
   private static final cat[] e = new cat[]{
      caz.mP,
      caz.nN,
      caz.nT,
      caz.ot,
      caz.ou,
      caz.ow,
      caz.ox,
      caz.pi,
      caz.pj,
      caz.pk,
      caz.pl,
      caz.pm,
      caz.pn,
      caz.qb,
      caz.qe,
      caz.qi,
      caz.qj,
      caz.qk,
      caz.ql,
      caz.qm,
      caz.qu,
      caz.sc,
      caz.sd,
      caz.se,
      caz.sf,
      caz.sh,
      caz.sp,
      caz.sw,
      caz.sx,
      caz.sy,
      caz.sJ,
      caz.sK,
      caz.tc,
      caz.te,
      caz.tg,
      caz.qf,
      caz.tN,
      caz.ui,
      caz.uq,
      caz.uj
   };
   private static final cat[] f = new cat[]{caz.nk, caz.nu, caz.np, caz.nz, caz.nE, caz.nJ};

   public void a(Consumer<af> $$0) {
      af $$1 = af.a.a()
         .a(
            cju.hh,
            rq.c("advancements.husbandry.root.title"),
            rq.c("advancements.husbandry.root.description"),
            new abb("textures/gui/advancements/backgrounds/husbandry.png"),
            ap.a,
            false,
            false,
            false
         )
         .a("consumed_item", ba.a.c())
         .a($$0, "husbandry/root");
      af $$2 = af.a.a()
         .a($$1)
         .a(caz.nS, rq.c("advancements.husbandry.plant_seed.title"), rq.c("advancements.husbandry.plant_seed.description"), null, ap.a, true, true, false)
         .a(aq.b)
         .a("wheat", cn.a.a(cju.cm))
         .a("pumpkin_stem", cn.a.a(cju.ek))
         .a("melon_stem", cn.a.a(cju.el))
         .a("beetroots", cn.a.a(cju.jp))
         .a("nether_wart", cn.a.a(cju.ex))
         .a($$0, "husbandry/plant_seed");
      af $$3 = af.a.a()
         .a($$1)
         .a(
            caz.nS,
            rq.c("advancements.husbandry.breed_an_animal.title"),
            rq.c("advancements.husbandry.breed_an_animal.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a(aq.b)
         .a("bred", av.a.c())
         .a($$0, "husbandry/breed_an_animal");
      this.b(af.a.a())
         .a($$2)
         .a(
            caz.mP,
            rq.c("advancements.husbandry.balanced_diet.title"),
            rq.c("advancements.husbandry.balanced_diet.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(ai.a.a(100))
         .a($$0, "husbandry/balanced_diet");
      af.a.a()
         .a($$2)
         .a(
            caz.nK,
            rq.c("advancements.husbandry.netherite_hoe.title"),
            rq.c("advancements.husbandry.netherite_hoe.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(ai.a.a(100))
         .a("netherite_hoe", bx.a.a(caz.nK))
         .a($$0, "husbandry/obtain_netherite_hoe");
      af $$4 = af.a.a()
         .a($$1)
         .a(
            caz.sG,
            rq.c("advancements.husbandry.tame_an_animal.title"),
            rq.c("advancements.husbandry.tame_an_animal.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("tamed_animal", db.a.c())
         .a($$0, "husbandry/tame_an_animal");
      this.c(af.a.a())
         .a($$3)
         .a(
            caz.sh,
            rq.c("advancements.husbandry.breed_all_animals.title"),
            rq.c("advancements.husbandry.breed_all_animals.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(ai.a.a(100))
         .a($$0, "husbandry/bred_all_animals");
      af $$5 = this.e(af.a.a())
         .a($$1)
         .a(aq.b)
         .a(
            caz.pe,
            rq.c("advancements.husbandry.fishy_business.title"),
            rq.c("advancements.husbandry.fishy_business.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$0, "husbandry/fishy_business");
      af $$6 = this.d(af.a.a())
         .a($$5)
         .a(aq.b)
         .a(
            caz.oO,
            rq.c("advancements.husbandry.tactical_fishing.title"),
            rq.c("advancements.husbandry.tactical_fishing.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$0, "husbandry/tactical_fishing");
      af $$7 = af.a.a()
         .a($$6)
         .a(aq.b)
         .a(hm.Y.b(caz.oS).a(), bs.a.a(ca.a.a().a(caz.oS).b()))
         .a(
            caz.oS,
            rq.c("advancements.husbandry.axolotl_in_a_bucket.title"),
            rq.c("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$0, "husbandry/axolotl_in_a_bucket");
      af.a.a()
         .a($$7)
         .a("kill_axolotl_target", bh.a.a(bo.a.a().a(bbr.f).b()))
         .a(
            caz.oR,
            rq.c("advancements.husbandry.kill_axolotl_target.title"),
            rq.c("advancements.husbandry.kill_axolotl_target.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$0, "husbandry/kill_axolotl_target");
      this.f(af.a.a())
         .a($$4)
         .a(
            caz.pi,
            rq.c("advancements.husbandry.complete_catalogue.title"),
            rq.c("advancements.husbandry.complete_catalogue.description"),
            null,
            ap.b,
            true,
            true,
            false
         )
         .a(ai.a.a(50))
         .a($$0, "husbandry/complete_catalogue");
      af $$8 = af.a.a()
         .a($$1)
         .a("safely_harvest_honey", bz.a.a(ch.a.a().a(au.a.a().a(akl.ax).b()).a(true), ca.a.a().a(caz.qt)))
         .a(
            caz.uq,
            rq.c("advancements.husbandry.safely_harvest_honey.title"),
            rq.c("advancements.husbandry.safely_harvest_honey.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$0, "husbandry/safely_harvest_honey");
      af $$9 = af.a.a()
         .a($$8)
         .a(caz.un, rq.c("advancements.husbandry.wax_on.title"), rq.c("advancements.husbandry.wax_on.description"), null, ap.a, true, true, false)
         .a("wax_on", bz.a.a(ch.a.a().a(au.a.a().a(((BiMap)cao.a.get()).keySet()).b()), ca.a.a().a(caz.un)))
         .a($$0, "husbandry/wax_on");
      af.a.a()
         .a($$9)
         .a(caz.np, rq.c("advancements.husbandry.wax_off.title"), rq.c("advancements.husbandry.wax_off.description"), null, ap.a, true, true, false)
         .a("wax_off", bz.a.a(ch.a.a().a(au.a.a().a(((BiMap)cao.b.get()).keySet()).b()), ca.a.a().a(f)))
         .a($$0, "husbandry/wax_off");
      af $$10 = af.a.a()
         .a($$1)
         .a(hm.Y.b(caz.oT).a(), bs.a.a(ca.a.a().a(caz.oT).b()))
         .a(
            caz.oT,
            rq.c("advancements.husbandry.tadpole_in_a_bucket.title"),
            rq.c("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$0, "husbandry/tadpole_in_a_bucket");
      af $$11 = this.a(af.a.a())
         .a($$10)
         .a(
            caz.sG,
            rq.c("advancements.husbandry.leash_all_frog_variants.title"),
            rq.c("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$0, "husbandry/leash_all_frog_variants");
      af.a.a()
         .a($$11)
         .a(caz.ve, rq.c("advancements.husbandry.froglights.title"), rq.c("advancements.husbandry.froglights.description"), null, ap.b, true, true, false)
         .a("froglights", bx.a.a(caz.vd, caz.vf, caz.ve))
         .a($$0, "husbandry/froglights");
      af.a.a()
         .a($$1)
         .a("silk_touch_nest", at.a.a(cju.nP, ca.a.a().a(new bj(cev.v, cj.d.b(1))), cj.d.a(3)))
         .a(
            cju.nP,
            rq.c("advancements.husbandry.silk_touch_nest.title"),
            rq.c("advancements.husbandry.silk_touch_nest.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a($$0, "husbandry/silk_touch_nest");
      af.a.a()
         .a($$1)
         .a(
            caz.mw,
            rq.c("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            rq.c("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("ride_a_boat_with_a_goat", cy.a.a(bo.a.a().a(bo.a.a().a(bbr.j).b(bo.a.a().a(bbr.M).b()).b())))
         .a($$0, "husbandry/ride_a_boat_with_a_goat");
      af.a.a()
         .a($$1)
         .a(
            caz.pp,
            rq.c("advancements.husbandry.make_a_sign_glow.title"),
            rq.c("advancements.husbandry.make_a_sign_glow.description"),
            null,
            ap.a,
            true,
            true,
            false
         )
         .a("make_a_sign_glow", bz.a.a(ch.a.a().a(au.a.a().a(akl.as).b()), ca.a.a().a(caz.pp)))
         .a($$0, "husbandry/make_a_sign_glow");
      af $$12 = af.a.a()
         .a($$1)
         .a(
            caz.qb,
            rq.c("advancements.husbandry.allay_deliver_item_to_player.title"),
            rq.c("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            ap.a,
            true,
            true,
            true
         )
         .a("allay_deliver_item_to_player", cm.a.b(bo.b.a, ca.a, bo.b.a(bo.a.a().a(bbr.b).b())))
         .a($$0, "husbandry/allay_deliver_item_to_player");
      af.a.a()
         .a($$12)
         .a(
            caz.lh,
            rq.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            rq.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            ap.b,
            true,
            true,
            true
         )
         .a("allay_deliver_cake_to_note_block", bz.a.b(ch.a.a().a(au.a.a().a(cju.aL).b()), ca.a.a().a(caz.pK)))
         .a($$0, "husbandry/allay_deliver_cake_to_note_block");
   }

   private af.a a(af.a $$0) {
      hm.bM.g().forEach($$1 -> $$0.a($$1.g().a().toString(), cp.a.a(ca.a.a().a(caz.sG), bo.b.a(bo.a.a().a(bbr.H).a(bp.a((bnp)$$1.a())).b()))));
      return $$0;
   }

   private af.a b(af.a $$0) {
      for(cat $$1 : e) {
         $$0.a(hm.Y.b($$1).a(), ba.a.a($$1));
      }

      return $$0;
   }

   private af.a c(af.a $$0) {
      for(bbr<?> $$1 : a) {
         $$0.a(bbr.a($$1).toString(), av.a.a(bo.a.a().a($$1)));
      }

      for(bbr<?> $$2 : b) {
         $$0.a(bbr.a($$2).toString(), av.a.a(bo.a.a().a($$2).b(), bo.a.a().a($$2).b(), bo.a));
      }

      return $$0;
   }

   private af.a d(af.a $$0) {
      for(cat $$1 : d) {
         $$0.a(hm.Y.b($$1).a(), bs.a.a(ca.a.a().a($$1).b()));
      }

      return $$0;
   }

   private af.a e(af.a $$0) {
      for(cat $$1 : c) {
         $$0.a(hm.Y.b($$1).a(), bu.a.a(ca.a, bo.a, ca.a.a().a($$1).b()));
      }

      return $$0;
   }

   private af.a f(af.a $$0) {
      hm.bK
         .f()
         .stream()
         .sorted(Entry.comparingByKey(Comparator.comparing(aba::a)))
         .forEach($$1 -> $$0.a(((aba)$$1.getKey()).a().toString(), db.a.a(bo.a.a().a(bp.a((bni)$$1.getValue())).b())));
      return $$0;
   }
}
