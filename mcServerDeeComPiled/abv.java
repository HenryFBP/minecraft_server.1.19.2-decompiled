import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class abv extends agd {
   private final abb h;
   private final Set<UUID> i = Sets.newHashSet();
   private int j;
   private int k = 100;

   public abv(abb $$0, rq $$1) {
      super($$1, azz.a.g, azz.b.a);
      this.h = $$0;
      this.a(0.0F);
   }

   public abb a() {
      return this.h;
   }

   @Override
   public void a(agh $$0) {
      super.a($$0);
      this.i.add($$0.co());
   }

   public void a(UUID $$0) {
      this.i.add($$0);
   }

   @Override
   public void b(agh $$0) {
      super.b($$0);
      this.i.remove($$0.co());
   }

   @Override
   public void b() {
      super.b();
      this.i.clear();
   }

   public int c() {
      return this.j;
   }

   public int d() {
      return this.k;
   }

   public void a(int $$0) {
      this.j = $$0;
      this.a(ami.a((float)$$0 / (float)this.k, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.k = $$0;
      this.a(ami.a((float)this.j / (float)$$0, 0.0F, 1.0F));
   }

   public final rq e() {
      return rs.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new rv(rv.a.a, rq.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<agh> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<agh> $$2 = Sets.newHashSet();

      for(UUID $$3 : this.i) {
         boolean $$4 = false;

         for(agh $$5 : $$0) {
            if ($$5.co().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for(agh $$6 : $$0) {
         boolean $$7 = false;

         for(UUID $$8 : this.i) {
            if ($$6.co().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for(UUID $$9 : $$1) {
         for(agh $$10 : this.h()) {
            if ($$10.co().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.i.remove($$9);
      }

      for(agh $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public pj f() {
      pj $$0 = new pj();
      $$0.a("Name", rq.a.a(this.a));
      $$0.a("Visible", this.g());
      $$0.a("Value", this.j);
      $$0.a("Max", this.k);
      $$0.a("Color", this.l().b());
      $$0.a("Overlay", this.m().a());
      $$0.a("DarkenScreen", this.n());
      $$0.a("PlayBossMusic", this.o());
      $$0.a("CreateWorldFog", this.p());
      pp $$1 = new pp();

      for(UUID $$2 : this.i) {
         $$1.add(pv.a($$2));
      }

      $$0.a("Players", (qc)$$1);
      return $$0;
   }

   public static abv a(pj $$0, abb $$1) {
      abv $$2 = new abv($$1, rq.a.a($$0.l("Name")));
      $$2.d($$0.q("Visible"));
      $$2.a($$0.h("Value"));
      $$2.b($$0.h("Max"));
      $$2.a(azz.a.a($$0.l("Color")));
      $$2.a(azz.b.a($$0.l("Overlay")));
      $$2.a($$0.q("DarkenScreen"));
      $$2.b($$0.q("PlayBossMusic"));
      $$2.c($$0.q("CreateWorldFog"));
      pp $$3 = $$0.c("Players", 11);

      for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
         $$2.a(pv.a($$3.k($$4)));
      }

      return $$2;
   }

   public void c(agh $$0) {
      if (this.i.contains($$0.co())) {
         this.a($$0);
      }

   }

   public void d(agh $$0) {
      super.b($$0);
   }
}
