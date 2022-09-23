import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cuo extends cti {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   private abb e;
   private String f = "";
   private String g = "";
   private gt h = new gt(0, 1, 0);
   private hs i = hs.g;
   private coh j = coh.a;
   private cpw k = cpw.a;
   private cwx l;
   private boolean m = true;
   private boolean q;
   private boolean r;
   private boolean s = true;
   private float t = 1.0F;
   private long u;

   public cuo(gt $$0, cvo $$1) {
      super(ctk.t, $$0, $$1);
      this.l = $$1.c(crj.a);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("name", this.d());
      $$0.a("author", this.f);
      $$0.a("metadata", this.g);
      $$0.a("posX", this.h.u());
      $$0.a("posY", this.h.v());
      $$0.a("posZ", this.h.w());
      $$0.a("sizeX", this.i.u());
      $$0.a("sizeY", this.i.v());
      $$0.a("sizeZ", this.i.w());
      $$0.a("rotation", this.k.toString());
      $$0.a("mirror", this.j.toString());
      $$0.a("mode", this.l.toString());
      $$0.a("ignoreEntities", this.m);
      $$0.a("powered", this.q);
      $$0.a("showair", this.r);
      $$0.a("showboundingbox", this.s);
      $$0.a("integrity", this.t);
      $$0.a("seed", this.u);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a($$0.l("name"));
      this.f = $$0.l("author");
      this.g = $$0.l("metadata");
      int $$1 = ami.a($$0.h("posX"), -48, 48);
      int $$2 = ami.a($$0.h("posY"), -48, 48);
      int $$3 = ami.a($$0.h("posZ"), -48, 48);
      this.h = new gt($$1, $$2, $$3);
      int $$4 = ami.a($$0.h("sizeX"), 0, 48);
      int $$5 = ami.a($$0.h("sizeY"), 0, 48);
      int $$6 = ami.a($$0.h("sizeZ"), 0, 48);
      this.i = new hs($$4, $$5, $$6);

      try {
         this.k = cpw.valueOf($$0.l("rotation"));
      } catch (IllegalArgumentException var11) {
         this.k = cpw.a;
      }

      try {
         this.j = coh.valueOf($$0.l("mirror"));
      } catch (IllegalArgumentException var10) {
         this.j = coh.a;
      }

      try {
         this.l = cwx.valueOf($$0.l("mode"));
      } catch (IllegalArgumentException var9) {
         this.l = cwx.d;
      }

      this.m = $$0.q("ignoreEntities");
      this.q = $$0.q("powered");
      this.r = $$0.q("showair");
      this.s = $$0.q("showboundingbox");
      if ($$0.e("integrity")) {
         this.t = $$0.j("integrity");
      } else {
         this.t = 1.0F;
      }

      this.u = $$0.i("seed");
      this.J();
   }

   private void J() {
      if (this.n != null) {
         gt $$0 = this.p();
         cvo $$1 = this.n.a_($$0);
         if ($$1.a(cju.nL)) {
            this.n.a($$0, $$1.a(crj.a, this.l), 2);
         }

      }
   }

   public tn c() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   public boolean a(buc $$0) {
      if (!$$0.fY()) {
         return false;
      } else {
         if ($$0.cC().y) {
            $$0.a(this);
         }

         return true;
      }
   }

   public String d() {
      return this.e == null ? "" : this.e.toString();
   }

   public String f() {
      return this.e == null ? "" : this.e.a();
   }

   public boolean g() {
      return this.e != null;
   }

   public void a(@Nullable String $$0) {
      this.a(amx.b($$0) ? null : abb.a($$0));
   }

   public void a(@Nullable abb $$0) {
      this.e = $$0;
   }

   public void a(bcc $$0) {
      this.f = $$0.X().getString();
   }

   public gt i() {
      return this.h;
   }

   public void a(gt $$0) {
      this.h = $$0;
   }

   public hs j() {
      return this.i;
   }

   public void a(hs $$0) {
      this.i = $$0;
   }

   public coh t() {
      return this.j;
   }

   public void a(coh $$0) {
      this.j = $$0;
   }

   public cpw w() {
      return this.k;
   }

   public void a(cpw $$0) {
      this.k = $$0;
   }

   public String x() {
      return this.g;
   }

   public void b(String $$0) {
      this.g = $$0;
   }

   public cwx y() {
      return this.l;
   }

   public void a(cwx $$0) {
      this.l = $$0;
      cvo $$1 = this.n.a_(this.p());
      if ($$1.a(cju.nL)) {
         this.n.a(this.p(), $$1.a(crj.a, $$0), 2);
      }

   }

   public boolean z() {
      return this.m;
   }

   public void a(boolean $$0) {
      this.m = $$0;
   }

   public float A() {
      return this.t;
   }

   public void a(float $$0) {
      this.t = $$0;
   }

   public long B() {
      return this.u;
   }

   public void a(long $$0) {
      this.u = $$0;
   }

   public boolean C() {
      if (this.l != cwx.a) {
         return false;
      } else {
         gt $$0 = this.p();
         int $$1 = 80;
         gt $$2 = new gt($$0.u() - 80, this.n.u_(), $$0.w() - 80);
         gt $$3 = new gt($$0.u() + 80, this.n.ah() - 1, $$0.w() + 80);
         Stream<gt> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.j() - $$1x.g();
            int $$3x = $$1x.k() - $$1x.h();
            int $$4x = $$1x.l() - $$1x.i();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.h = new gt($$1x.g() - $$0.u() + 1, $$1x.h() - $$0.v() + 1, $$1x.i() - $$0.w() + 1);
               this.i = new hs($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               cvo $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<gt> a(gt $$0, gt $$1) {
      return gt.b($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(cju.nL))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof cuo)
         .map($$0x -> (cuo)$$0x)
         .filter($$0x -> $$0x.l == cwx.c && Objects.equals(this.e, $$0x.e))
         .map(cti::p);
   }

   private static Optional<dkt> a(gt $$0, Stream<gt> $$1) {
      Iterator<gt> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         gt $$3 = (gt)$$2.next();
         dkt $$4 = new dkt($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean D() {
      return this.b(true);
   }

   public boolean b(boolean $$0) {
      if (this.l == cwx.a && !this.n.y && this.e != null) {
         gt $$1 = this.p().a(this.h);
         agg $$2 = (agg)this.n;
         dou $$3 = $$2.p();

         dot $$4;
         try {
            $$4 = $$3.a(this.e);
         } catch (aa var8) {
            return false;
         }

         $$4.a(this.n, $$1, this.i, !this.m, cju.jz);
         $$4.a(this.f);
         if ($$0) {
            try {
               return $$3.c(this.e);
            } catch (aa var7) {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean a(agg $$0) {
      return this.a($$0, true);
   }

   public static amn b(long $$0) {
      return $$0 == 0L ? amn.a(ad.b()) : amn.a($$0);
   }

   public boolean a(agg $$0, boolean $$1) {
      if (this.l == cwx.b && this.e != null) {
         dou $$2 = $$0.p();

         Optional<dot> $$3;
         try {
            $$3 = $$2.b(this.e);
         } catch (aa var6) {
            return false;
         }

         return !$$3.isPresent() ? false : this.a($$0, $$1, (dot)$$3.get());
      } else {
         return false;
      }
   }

   public boolean a(agg $$0, boolean $$1, dot $$2) {
      gt $$3 = this.p();
      if (!amx.b($$2.b())) {
         this.f = $$2.b();
      }

      hs $$4 = $$2.a();
      boolean $$5 = this.i.equals($$4);
      if (!$$5) {
         this.i = $$4;
         this.e();
         cvo $$6 = $$0.a_($$3);
         $$0.a($$3, $$6, $$6, 3);
      }

      if ($$1 && !$$5) {
         return false;
      } else {
         dop $$7 = new dop().a(this.j).a(this.k).a(this.m);
         if (this.t < 1.0F) {
            $$7.b().a(new dny(ami.a(this.t, 0.0F, 1.0F))).a(b(this.u));
         }

         gt $$8 = $$3.a(this.h);
         $$2.a($$0, $$8, $$8, $$7, b(this.u), 2);
         return true;
      }
   }

   public void E() {
      if (this.e != null) {
         agg $$0 = (agg)this.n;
         dou $$1 = $$0.p();
         $$1.d(this.e);
      }
   }

   public boolean F() {
      if (this.l == cwx.b && !this.n.y && this.e != null) {
         agg $$0 = (agg)this.n;
         dou $$1 = $$0.p();

         try {
            return $$1.b(this.e).isPresent();
         } catch (aa var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean G() {
      return this.q;
   }

   public void c(boolean $$0) {
      this.q = $$0;
   }

   public boolean H() {
      return this.r;
   }

   public void d(boolean $$0) {
      this.r = $$0;
   }

   public boolean I() {
      return this.s;
   }

   public void e(boolean $$0) {
      this.s = $$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
