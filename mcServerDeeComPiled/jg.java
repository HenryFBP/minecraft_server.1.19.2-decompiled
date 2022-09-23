import java.util.function.Consumer;

public class jg implements Consumer<Consumer<af>> {
   public void a(Consumer<af> $$0) {
      af $$1 = af.a.a()
         .a(
            cju.eG,
            rq.c("advancements.end.root.title"),
            rq.c("advancements.end.root.description"),
            new abb("textures/gui/advancements/backgrounds/end.png"),
            ap.a,
            false,
            false,
            false
         )
         .a("entered_end", ax.a.a(cgx.g))
         .a($$0, "end/root");
      af $$2 = af.a.a()
         .a($$1)
         .a(cju.fR, rq.c("advancements.end.kill_dragon.title"), rq.c("advancements.end.kill_dragon.description"), null, ap.a, true, true, false)
         .a("killed_dragon", cc.a.a(bo.a.a().a(bbr.x)))
         .a($$0, "end/kill_dragon");
      af $$3 = af.a.a()
         .a($$2)
         .a(caz.qn, rq.c("advancements.end.enter_end_gateway.title"), rq.c("advancements.end.enter_end_gateway.description"), null, ap.a, true, true, false)
         .a("entered_end_gateway", bk.a.a(cju.jr))
         .a($$0, "end/enter_end_gateway");
      af.a.a()
         .a($$2)
         .a(caz.tb, rq.c("advancements.end.respawn_dragon.title"), rq.c("advancements.end.respawn_dragon.description"), null, ap.c, true, true, false)
         .a("summoned_dragon", da.a.a(bo.a.a().a(bbr.x)))
         .a($$0, "end/respawn_dragon");
      af $$4 = af.a.a()
         .a($$3)
         .a(cju.jl, rq.c("advancements.end.find_end_city.title"), rq.c("advancements.end.find_end_city.description"), null, ap.a, true, true, false)
         .a("in_city", cr.a.a(ch.c(dkv.q)))
         .a($$0, "end/find_end_city");
      af.a.a()
         .a($$2)
         .a(caz.th, rq.c("advancements.end.dragon_breath.title"), rq.c("advancements.end.dragon_breath.description"), null, ap.c, true, true, false)
         .a("dragon_breath", bx.a.a(caz.th))
         .a($$0, "end/dragon_breath");
      af.a.a()
         .a($$4)
         .a(caz.to, rq.c("advancements.end.levitate.title"), rq.c("advancements.end.levitate.description"), null, ap.b, true, true, false)
         .a(ai.a.a(50))
         .a("levitated", cd.a.a(bf.b(cj.c.b(50.0))))
         .a($$0, "end/levitate");
      af.a.a()
         .a($$4)
         .a(caz.mv, rq.c("advancements.end.elytra.title"), rq.c("advancements.end.elytra.description"), null, ap.c, true, true, false)
         .a("elytra", bx.a.a(caz.mv))
         .a($$0, "end/elytra");
      af.a.a()
         .a($$2)
         .a(cju.eH, rq.c("advancements.end.dragon_egg.title"), rq.c("advancements.end.dragon_egg.description"), null, ap.c, true, true, false)
         .a("dragon_egg", bx.a.a(cju.eH))
         .a($$0, "end/dragon_egg");
   }
}
