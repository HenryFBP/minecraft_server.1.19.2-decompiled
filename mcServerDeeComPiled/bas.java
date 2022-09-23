public class bas extends baw {
   protected bas() {
      super("badRespawnPoint");
      this.x();
      this.e();
   }

   @Override
   public rq a(bcc $$0) {
      rq $$1 = rs.a((rq)rq.c("death.attack.badRespawnPoint.link"))
         .a($$0x -> $$0x.a(new ro(ro.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new rv(rv.a.a, rq.b("MCPE-28723"))));
      return rq.a("death.attack.badRespawnPoint.message", $$0.C_(), $$1);
   }
}
