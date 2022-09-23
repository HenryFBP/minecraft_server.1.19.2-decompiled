import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cxs extends cyc {
   private final cxt l;
   private final boolean m;

   public cxs(cxt $$0, boolean $$1) {
      super($$0.f(), cyf.a, $$0.j, $$0.D().s().d(hm.aR), $$0.t());
      this.l = $$0;
      this.m = $$1;
   }

   @Nullable
   @Override
   public cti c_(gt $$0) {
      return this.l.c_($$0);
   }

   @Override
   public cvo a_(gt $$0) {
      return this.l.a_($$0);
   }

   @Override
   public dpv b_(gt $$0) {
      return this.l.b_($$0);
   }

   @Override
   public int L() {
      return this.l.L();
   }

   @Override
   public cxu b(int $$0) {
      return this.m ? this.l.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public cvo a(gt $$0, cvo $$1, boolean $$2) {
      return this.m ? this.l.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(cti $$0) {
      if (this.m) {
         this.l.a($$0);
      }

   }

   @Override
   public void a(bbn $$0) {
      if (this.m) {
         this.l.a($$0);
      }

   }

   @Override
   public void a(cxn $$0) {
      if (this.m) {
         super.a($$0);
      }

   }

   @Override
   public cxu[] d() {
      return this.l.d();
   }

   @Override
   public void a(dar.a $$0, long[] $$1) {
   }

   private dar.a c(dar.a $$0) {
      if ($$0 == dar.a.a) {
         return dar.a.b;
      } else {
         return $$0 == dar.a.c ? dar.a.d : $$0;
      }
   }

   @Override
   public dar a(dar.a $$0) {
      return this.l.a($$0);
   }

   @Override
   public int a(dar.a $$0, int $$1, int $$2) {
      return this.l.a(this.c($$0), $$1, $$2);
   }

   @Override
   public hc<cht> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.l.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public cge f() {
      return this.l.f();
   }

   @Nullable
   @Override
   public dlj a(dlb $$0) {
      return this.l.a($$0);
   }

   @Override
   public void a(dlb $$0, dlj $$1) {
   }

   @Override
   public Map<dlb, dlj> g() {
      return this.l.g();
   }

   @Override
   public void a(Map<dlb, dlj> $$0) {
   }

   @Override
   public LongSet b(dlb $$0) {
      return this.l.b($$0);
   }

   @Override
   public void a(dlb $$0, long $$1) {
   }

   @Override
   public Map<dlb, LongSet> h() {
      return this.l.h();
   }

   @Override
   public void b(Map<dlb, LongSet> $$0) {
   }

   @Override
   public void a(boolean $$0) {
      this.l.a($$0);
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   public cxn j() {
      return this.l.j();
   }

   @Override
   public void d(gt $$0) {
   }

   @Override
   public void e(gt $$0) {
   }

   @Override
   public void a(pj $$0) {
   }

   @Nullable
   @Override
   public pj f(gt $$0) {
      return this.l.f($$0);
   }

   @Nullable
   @Override
   public pj g(gt $$0) {
      return this.l.g($$0);
   }

   @Override
   public Stream<gt> n() {
      return this.l.n();
   }

   @Override
   public dyd<cjt> o() {
      return this.m ? this.l.o() : dxu.a();
   }

   @Override
   public dyd<dpu> p() {
      return this.m ? this.l.p() : dxu.a();
   }

   @Override
   public cxj.a q() {
      return this.l.q();
   }

   @Nullable
   @Override
   public dbs t() {
      return this.l.t();
   }

   @Override
   public void a(dbs $$0) {
      this.l.a($$0);
   }

   @Override
   public cxi a(dan.a $$0) {
      if (this.m) {
         return super.a($$0);
      } else {
         throw (UnsupportedOperationException)ad.c(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public cxi b(dan.a $$0) {
      if (this.m) {
         return super.b($$0);
      } else {
         throw (UnsupportedOperationException)ad.c(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public cxt A() {
      return this.l;
   }

   @Override
   public boolean v() {
      return this.l.v();
   }

   @Override
   public void b(boolean $$0) {
      this.l.b($$0);
   }

   @Override
   public void a(chw $$0, cic.f $$1) {
      if (this.m) {
         this.l.a($$0, $$1);
      }

   }
}
