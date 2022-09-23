import java.util.function.Consumer;

public class jf implements Consumer<Consumer<af>> {
   public void a(Consumer<af> $$0) {
      af $$1 = af.a.a()
         .a(
            cju.i,
            rq.c("advancements.story.root.title"),
            rq.c("advancements.story.root.description"),
            new abb("textures/gui/advancements/backgrounds/stone.png"),
            ap.a,
            false,
            false,
            false
         )
         .a("crafting_table", bx.a.a(cju.cl))
         .a($$0, "story/root");
      af $$2 = af.a.a()
         .a($$1)
         .a(caz.nj, rq.c("advancements.story.mine_stone.title"), rq.c("advancements.story.mine_stone.description"), null, ap.a, true, true, false)
         .a("get_stone", bx.a.a(ca.a.a().a(aks.as).b()))
         .a($$0, "story/mine_stone");
      af $$3 = af.a.a()
         .a($$2)
         .a(caz.no, rq.c("advancements.story.upgrade_tools.title"), rq.c("advancements.story.upgrade_tools.description"), null, ap.a, true, true, false)
         .a("stone_pickaxe", bx.a.a(caz.no))
         .a($$0, "story/upgrade_tools");
      af $$4 = af.a.a()
         .a($$3)
         .a(caz.na, rq.c("advancements.story.smelt_iron.title"), rq.c("advancements.story.smelt_iron.description"), null, ap.a, true, true, false)
         .a("iron", bx.a.a(caz.na))
         .a($$0, "story/smelt_iron");
      af $$5 = af.a.a()
         .a($$4)
         .a(caz.ny, rq.c("advancements.story.iron_tools.title"), rq.c("advancements.story.iron_tools.description"), null, ap.a, true, true, false)
         .a("iron_pickaxe", bx.a.a(caz.ny))
         .a($$0, "story/iron_tools");
      af $$6 = af.a.a()
         .a($$5)
         .a(caz.mU, rq.c("advancements.story.mine_diamond.title"), rq.c("advancements.story.mine_diamond.description"), null, ap.a, true, true, false)
         .a("diamond", bx.a.a(caz.mU))
         .a($$0, "story/mine_diamond");
      af $$7 = af.a.a()
         .a($$4)
         .a(caz.oJ, rq.c("advancements.story.lava_bucket.title"), rq.c("advancements.story.lava_bucket.description"), null, ap.a, true, true, false)
         .a("lava_bucket", bx.a.a(caz.oJ))
         .a($$0, "story/lava_bucket");
      af $$8 = af.a.a()
         .a($$4)
         .a(caz.od, rq.c("advancements.story.obtain_armor.title"), rq.c("advancements.story.obtain_armor.description"), null, ap.a, true, true, false)
         .a(aq.b)
         .a("iron_helmet", bx.a.a(caz.oc))
         .a("iron_chestplate", bx.a.a(caz.od))
         .a("iron_leggings", bx.a.a(caz.oe))
         .a("iron_boots", bx.a.a(caz.of))
         .a($$0, "story/obtain_armor");
      af.a.a()
         .a($$6)
         .a(caz.ss, rq.c("advancements.story.enchant_item.title"), rq.c("advancements.story.enchant_item.description"), null, ap.a, true, true, false)
         .a("enchanted_item", bi.a.c())
         .a($$0, "story/enchant_item");
      af $$9 = af.a.a()
         .a($$7)
         .a(cju.bZ, rq.c("advancements.story.form_obsidian.title"), rq.c("advancements.story.form_obsidian.description"), null, ap.a, true, true, false)
         .a("obsidian", bx.a.a(cju.bZ))
         .a($$0, "story/form_obsidian");
      af.a.a()
         .a($$8)
         .a(caz.tm, rq.c("advancements.story.deflect_arrow.title"), rq.c("advancements.story.deflect_arrow.description"), null, ap.a, true, true, false)
         .a("deflected_projectile", bn.a.a(bc.a.a().a(bd.a.a().a(true)).a(true)))
         .a($$0, "story/deflect_arrow");
      af.a.a()
         .a($$6)
         .a(caz.oh, rq.c("advancements.story.shiny_gear.title"), rq.c("advancements.story.shiny_gear.description"), null, ap.a, true, true, false)
         .a(aq.b)
         .a("diamond_helmet", bx.a.a(caz.og))
         .a("diamond_chestplate", bx.a.a(caz.oh))
         .a("diamond_leggings", bx.a.a(caz.oi))
         .a("diamond_boots", bx.a.a(caz.oj))
         .a($$0, "story/shiny_gear");
      af $$10 = af.a.a()
         .a($$9)
         .a(caz.mO, rq.c("advancements.story.enter_the_nether.title"), rq.c("advancements.story.enter_the_nether.description"), null, ap.a, true, true, false)
         .a("entered_nether", ax.a.a(cgx.f))
         .a($$0, "story/enter_the_nether");
      af.a.a()
         .a($$10)
         .a(
            caz.ow,
            rq.c("advancements.story.cure_zombie_villager.title"),
            rq.c("advancements.story.cure_zombie_villager.description"),
            null,
            ap.c,
            true,
            true,
            false
         )
         .a("cured_zombie", bb.a.c())
         .a($$0, "story/cure_zombie_villager");
      af $$11 = af.a.a()
         .a($$10)
         .a(caz.qA, rq.c("advancements.story.follow_ender_eye.title"), rq.c("advancements.story.follow_ender_eye.description"), null, ap.a, true, true, false)
         .a("in_stronghold", cr.a.a(ch.c(dkv.k)))
         .a($$0, "story/follow_ender_eye");
      af.a.a()
         .a($$11)
         .a(cju.eG, rq.c("advancements.story.enter_the_end.title"), rq.c("advancements.story.enter_the_end.description"), null, ap.a, true, true, false)
         .a("entered_end", ax.a.a(cgx.g))
         .a($$0, "story/enter_the_end");
   }
}
