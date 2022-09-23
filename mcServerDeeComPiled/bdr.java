import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bdr extends bdo<btp> {
   @Nullable
   private bvj a;

   public bdr(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(agg $$0, btp $$1) {
      gt $$2 = $$1.da();
      this.a = $$0.c($$2);
      return this.a != null && this.a.e() && bey.a($$0, $$1, $$2);
   }

   protected boolean a(agg $$0, btp $$1, long $$2) {
      return this.a != null && !this.a.d();
   }

   protected void b(agg $$0, btp $$1, long $$2) {
      this.a = null;
      $$1.dy().a($$0.V(), $$0.U());
   }

   protected void c(agg $$0, btp $$1, long $$2) {
      amn $$3 = $$1.dQ();
      if ($$3.a(100) == 0) {
         $$1.fP();
      }

      if ($$3.a(200) == 0 && bey.a($$0, $$1, $$1.da())) {
         bzq $$4 = ad.a(bzq.values(), $$3);
         int $$5 = $$3.a(3);
         cax $$6 = this.a($$4, $$5);
         bup $$7 = new bup($$1.s, $$1, $$1.df(), $$1.dj(), $$1.dl(), $$6);
         $$1.s.b($$7);
      }

   }

   private cax a(bzq $$0, int $$1) {
      cax $$2 = new cax(caz.sq, 1);
      cax $$3 = new cax(caz.sr);
      pj $$4 = $$3.a("Explosion");
      List<Integer> $$5 = Lists.newArrayList();
      $$5.add($$0.f());
      $$4.b("Colors", $$5);
      $$4.a("Type", (byte)caf.a.e.a());
      pj $$6 = $$2.a("Fireworks");
      pp $$7 = new pp();
      pj $$8 = $$3.b("Explosion");
      if ($$8 != null) {
         $$7.add($$8);
      }

      $$6.a("Flight", (byte)$$1);
      if (!$$7.isEmpty()) {
         $$6.a("Explosions", (qc)$$7);
      }

      return $$2;
   }
}
