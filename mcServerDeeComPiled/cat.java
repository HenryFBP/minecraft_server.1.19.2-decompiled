import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cat implements cgw {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<cjt, cat> k = Maps.newHashMap();
   protected static final UUID l = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID m = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int n = 64;
   public static final int o = 32;
   public static final int p = 13;
   private final hc.c<cat> b = hm.Y.e(this);
   @Nullable
   protected final bzj q;
   private final cbn c;
   private final int d;
   private final int e;
   private final boolean f;
   @Nullable
   private final cat g;
   @Nullable
   private String h;
   @Nullable
   private final bwj i;

   public static int a(cat $$0) {
      return $$0 == null ? 0 : hm.Y.a($$0);
   }

   public static cat b(int $$0) {
      return hm.Y.a($$0);
   }

   @Deprecated
   public static cat a(cjt $$0) {
      return (cat)k.getOrDefault($$0, caz.a);
   }

   public cat(cat.a $$0) {
      this.q = $$0.d;
      this.c = $$0.e;
      this.g = $$0.c;
      this.e = $$0.b;
      this.d = $$0.a;
      this.i = $$0.f;
      this.f = $$0.g;
      if (ab.aL) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }

   }

   @Deprecated
   public hc.c<cat> k() {
      return this.b;
   }

   public void a(cgx $$0, bcc $$1, cax $$2, int $$3) {
   }

   public void a(bqv $$0) {
   }

   public void b(pj $$0) {
   }

   public boolean a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
      return true;
   }

   @Override
   public cat l() {
      return this;
   }

   public baj a(ccz $$0) {
      return baj.d;
   }

   public float a(cax $$0, cvo $$1) {
      return 1.0F;
   }

   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      if (this.v()) {
         cax $$3 = $$1.b($$2);
         if ($$1.s(this.w().d())) {
            $$1.c($$2);
            return bak.b($$3);
         } else {
            return bak.d($$3);
         }
      } else {
         return bak.c($$1.b($$2));
      }
   }

   public cax a(cax $$0, cgx $$1, bcc $$2) {
      return this.v() ? $$2.a($$1, $$0) : $$0;
   }

   public final int m() {
      return this.d;
   }

   public final int n() {
      return this.e;
   }

   public boolean o() {
      return this.e > 0;
   }

   public boolean e(cax $$0) {
      return $$0.i();
   }

   public int f(cax $$0) {
      return Math.round(13.0F - (float)$$0.j() * 13.0F / (float)this.e);
   }

   public int g(cax $$0) {
      float $$1 = Math.max(0.0F, ((float)this.e - (float)$$0.j()) / (float)this.e);
      return ami.h($$1 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cax $$0, byd $$1, bwu $$2, buc $$3) {
      return false;
   }

   public boolean a(cax $$0, cax $$1, byd $$2, bwu $$3, buc $$4, bct $$5) {
      return false;
   }

   public boolean a(cax $$0, bcc $$1, bcc $$2) {
      return false;
   }

   public boolean a(cax $$0, cgx $$1, cvo $$2, gt $$3, bcc $$4) {
      return false;
   }

   public boolean a_(cvo $$0) {
      return false;
   }

   public baj a(cax $$0, buc $$1, bcc $$2, bai $$3) {
      return baj.d;
   }

   public rq p() {
      return rq.c(this.a());
   }

   public String toString() {
      return hm.Y.b(this).a();
   }

   protected String q() {
      if (this.h == null) {
         this.h = ad.a("item", hm.Y.b(this));
      }

      return this.h;
   }

   public String a() {
      return this.q();
   }

   public String j(cax $$0) {
      return this.a();
   }

   public boolean r() {
      return true;
   }

   @Nullable
   public final cat s() {
      return this.g;
   }

   public boolean t() {
      return this.g != null;
   }

   public void a(cax $$0, cgx $$1, bbn $$2, int $$3, boolean $$4) {
   }

   public void b(cax $$0, cgx $$1, buc $$2) {
   }

   public boolean P_() {
      return false;
   }

   public ccn c(cax $$0) {
      return $$0.c().v() ? ccn.b : ccn.a;
   }

   public int b(cax $$0) {
      if ($$0.c().v()) {
         return this.w().e() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public void a(cax $$0, cgx $$1, bcc $$2, int $$3) {
   }

   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
   }

   public Optional<byk> h(cax $$0) {
      return Optional.empty();
   }

   public rq m(cax $$0) {
      return rq.c(this.j($$0));
   }

   public boolean i(cax $$0) {
      return $$0.D();
   }

   public cbn n(cax $$0) {
      if (!$$0.D()) {
         return this.c;
      } else {
         switch(this.c) {
            case a:
            case b:
               return cbn.c;
            case c:
               return cbn.d;
            case d:
            default:
               return this.c;
         }
      }
   }

   public boolean c_(cax $$0) {
      return this.m() == 1 && this.o();
   }

   protected static dwm a(cgx $$0, buc $$1, cgg.b $$2) {
      float $$3 = $$1.ds();
      float $$4 = $$1.dq();
      dwq $$5 = $$1.bj();
      float $$6 = ami.b(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ami.a(-$$4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ami.b(-$$3 * (float) (Math.PI / 180.0));
      float $$9 = ami.a(-$$3 * (float) (Math.PI / 180.0));
      float $$10 = $$7 * $$8;
      float $$12 = $$6 * $$8;
      double $$13 = 5.0;
      dwq $$14 = $$5.b((double)$$10 * 5.0, (double)$$9 * 5.0, (double)$$12 * 5.0);
      return $$0.a(new cgg($$5, $$14, cgg.a.b, $$2, $$1));
   }

   public int c() {
      return 0;
   }

   public void a(bzj $$0, hi<cax> $$1) {
      if (this.a($$0)) {
         $$1.add(new cax(this));
      }

   }

   protected boolean a(bzj $$0) {
      bzj $$1 = this.u();
      return $$1 != null && ($$0 == bzj.g || $$0 == $$1);
   }

   @Nullable
   public final bzj u() {
      return this.q;
   }

   public boolean a(cax $$0, cax $$1) {
      return false;
   }

   public Multimap<bcy, bdb> a(bbs $$0) {
      return ImmutableMultimap.of();
   }

   public boolean l(cax $$0) {
      return false;
   }

   public cax Q_() {
      return new cax(this);
   }

   public boolean v() {
      return this.i != null;
   }

   @Nullable
   public bwj w() {
      return this.i;
   }

   public ajv R_() {
      return ajw.hm;
   }

   public ajv h() {
      return ajw.hn;
   }

   public boolean x() {
      return this.f;
   }

   public boolean a(baw $$0) {
      return !this.f || !$$0.u();
   }

   @Nullable
   public ajv g() {
      return null;
   }

   public boolean S_() {
      return true;
   }

   public static class a {
      int a = 64;
      int b;
      @Nullable
      cat c;
      @Nullable
      bzj d;
      cbn e = cbn.a;
      @Nullable
      bwj f;
      boolean g;

      public cat.a a(bwj $$0) {
         this.f = $$0;
         return this;
      }

      public cat.a a(int $$0) {
         if (this.b > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
         } else {
            this.a = $$0;
            return this;
         }
      }

      public cat.a b(int $$0) {
         return this.b == 0 ? this.c($$0) : this;
      }

      public cat.a c(int $$0) {
         this.b = $$0;
         this.a = 1;
         return this;
      }

      public cat.a a(cat $$0) {
         this.c = $$0;
         return this;
      }

      public cat.a a(bzj $$0) {
         this.d = $$0;
         return this;
      }

      public cat.a a(cbn $$0) {
         this.e = $$0;
         return this;
      }

      public cat.a a() {
         this.g = true;
         return this;
      }
   }
}
