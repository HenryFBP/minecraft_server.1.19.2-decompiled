import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cuk extends cti {
   public static final int a = 4;
   private static final String[] b = new String[]{"Text1", "Text2", "Text3", "Text4"};
   private static final String[] c = new String[]{"FilteredText1", "FilteredText2", "FilteredText3", "FilteredText4"};
   private final rq[] d = new rq[]{rp.a, rp.a, rp.a, rp.a};
   private final rq[] e = new rq[]{rp.a, rp.a, rp.a, rp.a};
   private boolean f = true;
   @Nullable
   private UUID g;
   @Nullable
   private alu[] h;
   private boolean i;
   private bzq j = bzq.p;
   private boolean k;

   public cuk(gt $$0, cvo $$1) {
      super(ctk.h, $$0, $$1);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);

      for(int $$1 = 0; $$1 < 4; ++$$1) {
         rq $$2 = this.d[$$1];
         String $$3 = rq.a.a($$2);
         $$0.a(b[$$1], $$3);
         rq $$4 = this.e[$$1];
         if (!$$4.equals($$2)) {
            $$0.a(c[$$1], rq.a.a($$4));
         }
      }

      $$0.a("Color", this.j.b());
      $$0.a("GlowingText", this.k);
   }

   @Override
   public void a(pj $$0) {
      this.f = false;
      super.a($$0);
      this.j = bzq.a($$0.l("Color"), bzq.p);

      for(int $$1 = 0; $$1 < 4; ++$$1) {
         String $$2 = $$0.l(b[$$1]);
         rq $$3 = this.a($$2);
         this.d[$$1] = $$3;
         String $$4 = c[$$1];
         if ($$0.b($$4, 8)) {
            this.e[$$1] = this.a($$0.l($$4));
         } else {
            this.e[$$1] = $$3;
         }
      }

      this.h = null;
      this.k = $$0.q("GlowingText");
   }

   private rq a(String $$0) {
      rq $$1 = this.b($$0);
      if (this.n instanceof agg) {
         try {
            return rs.a(this.b(null), $$1, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$1;
   }

   private rq b(String $$0) {
      try {
         rq $$1 = rq.a.a($$0);
         if ($$1 != null) {
            return $$1;
         }
      } catch (Exception var3) {
      }

      return rp.a;
   }

   public rq a(int $$0, boolean $$1) {
      return this.c($$1)[$$0];
   }

   public void a(int $$0, rq $$1) {
      this.a($$0, $$1, $$1);
   }

   public void a(int $$0, rq $$1, rq $$2) {
      this.d[$$0] = $$1;
      this.e[$$0] = $$2;
      this.h = null;
   }

   public alu[] a(boolean $$0, Function<rq, alu> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new alu[4];

         for(int $$2 = 0; $$2 < 4; ++$$2) {
            this.h[$$2] = (alu)$$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private rq[] c(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public tn c() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   @Override
   public boolean u() {
      return true;
   }

   public boolean d() {
      return this.f;
   }

   public void a(boolean $$0) {
      this.f = $$0;
      if (!$$0) {
         this.g = null;
      }

   }

   public void a(UUID $$0) {
      this.g = $$0;
   }

   @Nullable
   public UUID f() {
      return this.g;
   }

   public boolean a(agh $$0) {
      for(rq $$1 : this.c($$0.U())) {
         sj $$2 = $$1.a();
         ro $$3 = $$2.h();
         if ($$3 != null && $$3.a() == ro.a.c) {
            $$0.cD().aC().a(this.b($$0), $$3.b());
         }
      }

      return true;
   }

   public dr b(@Nullable agh $$0) {
      String $$1 = $$0 == null ? "Sign" : $$0.X().getString();
      rq $$2 = (rq)($$0 == null ? rq.b("Sign") : $$0.C_());
      return new dr(dq.a, dwq.a(this.o), dwp.a, (agg)this.n, 2, $$1, $$2, this.n.n(), $$0);
   }

   public bzq g() {
      return this.j;
   }

   public boolean a(bzq $$0) {
      if ($$0 != this.g()) {
         this.j = $$0;
         this.j();
         return true;
      } else {
         return false;
      }
   }

   public boolean i() {
      return this.k;
   }

   public boolean b(boolean $$0) {
      if (this.k != $$0) {
         this.k = $$0;
         this.j();
         return true;
      } else {
         return false;
      }
   }

   private void j() {
      this.e();
      this.n.a(this.p(), this.q(), this.q(), 3);
   }
}
