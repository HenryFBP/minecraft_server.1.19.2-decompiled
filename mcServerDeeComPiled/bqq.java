import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bqq extends bqn {
   private static final aaj<hc<bqr>> e = aam.a(bqq.class, aal.w);
   private static final aba<bqr> f = bqs.a;

   private static hc<bqr> i() {
      return hm.ac.h(f);
   }

   public bqq(bbr<? extends bqq> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      this.Y.a(e, i());
   }

   @Override
   public void a(aaj<?> $$0) {
      if (e.equals($$0)) {
         this.q();
      }

   }

   private void a(hc<bqr> $$0) {
      this.Y.b(e, $$0);
   }

   public hc<bqr> h() {
      return this.Y.a(e);
   }

   public static Optional<bqq> a(cgx $$0, gt $$1, gy $$2) {
      bqq $$3 = new bqq($$0, $$1);
      List<hc<bqr>> $$4 = new ArrayList();
      hm.ac.d(akt.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.a($$1x);
            return !$$3.r();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(bqq::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<hc<bqr>> $$6 = ad.b($$4, $$3.R);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.a((hc<bqr>)$$6.get());
               $$3.a($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int b(hc<bqr> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private bqq(cgx $$0, gt $$1) {
      super(bbr.am, $$0, $$1);
   }

   public bqq(cgx $$0, gt $$1, gy $$2, hc<bqr> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(pj $$0) {
      $$0.a("variant", ((aba)this.h().e().orElse(f)).a().toString());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(pj $$0) {
      aba<bqr> $$1 = aba.a(hm.o, abb.a($$0.l("variant")));
      this.a((hc<bqr>)hm.ac.b($$1).orElseGet(bqq::i));
      this.d = gy.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   public int s() {
      return this.h().a().a();
   }

   @Override
   public int t() {
      return this.h().a().b();
   }

   @Override
   public void a(@Nullable bbn $$0) {
      if (this.s.W().b(cgt.h)) {
         this.a(ajw.ob, 1.0F, 1.0F);
         if ($$0 instanceof buc $$1 && $$1.fB().d) {
            return;
         }

         this.a(caz.ov);
      }
   }

   @Override
   public void u() {
      this.a(ajw.oc, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.e($$0, $$1, $$2);
   }

   @Override
   public dwq cZ() {
      return dwq.b(this.c);
   }

   @Override
   public tc<?> S() {
      return new tg(this, this.d.d(), this.w());
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      this.a(gy.a($$0.n()));
   }

   @Override
   public cax dn() {
      return new cax(caz.ov);
   }
}
