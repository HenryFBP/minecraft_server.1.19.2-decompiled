import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class dxm extends dxq {
   private static final int a = 0;
   private static final int b = 1;
   private final dxo c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private rq f;
   private rq g = rp.a;
   private rq h = rp.a;
   private boolean i = true;
   private boolean j = true;
   private dxq.b k = dxq.b.a;
   private dxq.b l = dxq.b.a;
   private p m = p.v;
   private dxq.a n = dxq.a.a;
   private final sj o;

   public dxm(dxo $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = rq.b($$1);
      this.o = sj.a.a($$1).a(new rv(rv.a.a, rq.b($$1)));
   }

   public dxo a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public rq c() {
      return this.f;
   }

   public sb d() {
      sb $$0 = rs.a((rq)this.f.e().c(this.o));
      p $$1 = this.n();
      if ($$1 != p.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(rq $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable rq $$0) {
      this.g = $$0 == null ? rp.a : $$0;
      this.c.b(this);
   }

   public rq e() {
      return this.g;
   }

   public void c(@Nullable rq $$0) {
      this.h = $$0 == null ? rp.a : $$0;
      this.c.b(this);
   }

   public rq f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public sb d(rq $$0) {
      sb $$1 = rq.h().b(this.g).b($$0).b(this.h);
      p $$2 = this.n();
      if ($$2 != p.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static sb a(@Nullable dxq $$0, rq $$1) {
      return $$0 == null ? $$1.e() : $$0.d($$1);
   }

   @Override
   public boolean h() {
      return this.i;
   }

   public void a(boolean $$0) {
      this.i = $$0;
      this.c.b(this);
   }

   @Override
   public boolean i() {
      return this.j;
   }

   public void b(boolean $$0) {
      this.j = $$0;
      this.c.b(this);
   }

   @Override
   public dxq.b j() {
      return this.k;
   }

   @Override
   public dxq.b k() {
      return this.l;
   }

   public void a(dxq.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(dxq.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public dxq.a l() {
      return this.n;
   }

   public void a(dxq.a $$0) {
      this.n = $$0;
      this.c.b(this);
   }

   public int m() {
      int $$0 = 0;
      if (this.h()) {
         $$0 |= 1;
      }

      if (this.i()) {
         $$0 |= 2;
      }

      return $$0;
   }

   public void a(int $$0) {
      this.a(($$0 & 1) > 0);
      this.b(($$0 & 2) > 0);
   }

   public void a(p $$0) {
      this.m = $$0;
      this.c.b(this);
   }

   @Override
   public p n() {
      return this.m;
   }
}
