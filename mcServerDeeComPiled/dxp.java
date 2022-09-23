public class dxp extends drb {
   public static final String a = "scoreboard";
   private final dxo b;

   public dxp(dxo $$0) {
      this.b = $$0;
   }

   public dxp b(pj $$0) {
      this.b($$0.c("Objectives", 10));
      this.b.a($$0.c("PlayerScores", 10));
      if ($$0.b("DisplaySlots", 10)) {
         this.c($$0.p("DisplaySlots"));
      }

      if ($$0.b("Teams", 9)) {
         this.a($$0.c("Teams", 10));
      }

      return this;
   }

   private void a(pp $$0) {
      for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
         pj $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         dxm $$4 = this.b.g($$3);
         rq $$5 = rq.a.a($$2.l("DisplayName"));
         if ($$5 != null) {
            $$4.a($$5);
         }

         if ($$2.b("TeamColor", 8)) {
            $$4.a(p.b($$2.l("TeamColor")));
         }

         if ($$2.b("AllowFriendlyFire", 99)) {
            $$4.a($$2.q("AllowFriendlyFire"));
         }

         if ($$2.b("SeeFriendlyInvisibles", 99)) {
            $$4.b($$2.q("SeeFriendlyInvisibles"));
         }

         if ($$2.b("MemberNamePrefix", 8)) {
            rq $$6 = rq.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            rq $$7 = rq.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            dxq.b $$8 = dxq.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            dxq.b $$9 = dxq.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            dxq.a $$10 = dxq.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }

   }

   private void a(dxm $$0, pp $$1) {
      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         this.b.a($$1.j($$2), $$0);
      }

   }

   private void c(pj $$0) {
      for(int $$1 = 0; $$1 < 19; ++$$1) {
         if ($$0.b("slot_" + $$1, 8)) {
            String $$2 = $$0.l("slot_" + $$1);
            dxl $$3 = this.b.d($$2);
            this.b.a($$1, $$3);
         }
      }

   }

   private void b(pp $$0) {
      for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
         pj $$2 = $$0.a($$1);
         dxr.a($$2.l("CriteriaName")).ifPresent($$1x -> {
            String $$2x = $$2.l("Name");
            rq $$3 = rq.a.a($$2.l("DisplayName"));
            dxr.a $$4 = dxr.a.a($$2.l("RenderType"));
            this.b.a($$2x, $$1x, $$3, $$4);
         });
      }

   }

   @Override
   public pj a(pj $$0) {
      $$0.a("Objectives", (qc)this.d());
      $$0.a("PlayerScores", (qc)this.b.i());
      $$0.a("Teams", (qc)this.a());
      this.d($$0);
      return $$0;
   }

   private pp a() {
      pp $$0 = new pp();

      for(dxm $$2 : this.b.g()) {
         pj $$3 = new pj();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", rq.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", rq.a.a($$2.e()));
         $$3.a("MemberNameSuffix", rq.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         pp $$4 = new pp();

         for(String $$5 : $$2.g()) {
            $$4.add(qa.a($$5));
         }

         $$3.a("Players", (qc)$$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(pj $$0) {
      pj $$1 = new pj();
      boolean $$2 = false;

      for(int $$3 = 0; $$3 < 19; ++$$3) {
         dxl $$4 = this.b.a($$3);
         if ($$4 != null) {
            $$1.a("slot_" + $$3, $$4.b());
            $$2 = true;
         }
      }

      if ($$2) {
         $$0.a("DisplaySlots", (qc)$$1);
      }

   }

   private pp d() {
      pp $$0 = new pp();

      for(dxl $$2 : this.b.c()) {
         if ($$2.c() != null) {
            pj $$3 = new pj();
            $$3.a("Name", $$2.b());
            $$3.a("CriteriaName", $$2.c().d());
            $$3.a("DisplayName", rq.a.a($$2.d()));
            $$3.a("RenderType", $$2.f().a());
            $$0.add($$3);
         }
      }

      return $$0;
   }
}
