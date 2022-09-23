import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class csy extends cti implements ban {
   public static final int a = 6;
   public static final String b = "Patterns";
   public static final String c = "Pattern";
   public static final String d = "Color";
   @Nullable
   private rq e;
   private bzq f;
   @Nullable
   private pp g;
   @Nullable
   private List<Pair<hc<csz>, bzq>> h;

   public csy(gt $$0, cvo $$1) {
      super(ctk.s, $$0, $$1);
      this.f = ((cik)$$1.b()).b();
   }

   public csy(gt $$0, cvo $$1, bzq $$2) {
      this($$0, $$1);
      this.f = $$2;
   }

   @Nullable
   public static pp a(cax $$0) {
      pp $$1 = null;
      pj $$2 = byx.a($$0);
      if ($$2 != null && $$2.b("Patterns", 9)) {
         $$1 = $$2.c("Patterns", 10).d();
      }

      return $$1;
   }

   public void a(cax $$0, bzq $$1) {
      this.f = $$1;
      this.b($$0);
   }

   public void b(cax $$0) {
      this.g = a($$0);
      this.h = null;
      this.e = $$0.z() ? $$0.x() : null;
   }

   @Override
   public rq X() {
      return (rq)(this.e != null ? this.e : rq.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public rq Z() {
      return this.e;
   }

   public void a(rq $$0) {
      this.e = $$0;
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (this.g != null) {
         $$0.a("Patterns", (qc)this.g);
      }

      if (this.e != null) {
         $$0.a("CustomName", rq.a.a(this.e));
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.e = rq.a.a($$0.l("CustomName"));
      }

      this.g = $$0.c("Patterns", 10);
      this.h = null;
   }

   public tn a() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   public static int c(cax $$0) {
      pj $$1 = byx.a($$0);
      return $$1 != null && $$1.e("Patterns") ? $$1.c("Patterns", 10).size() : 0;
   }

   public List<Pair<hc<csz>, bzq>> c() {
      if (this.h == null) {
         this.h = a(this.f, this.g);
      }

      return this.h;
   }

   public static List<Pair<hc<csz>, bzq>> a(bzq $$0, @Nullable pp $$1) {
      List<Pair<hc<csz>, bzq>> $$2 = Lists.newArrayList();
      $$2.add(Pair.of(hm.bO.h(cta.a), $$0));
      if ($$1 != null) {
         for(int $$3 = 0; $$3 < $$1.size(); ++$$3) {
            pj $$4 = $$1.a($$3);
            hc<csz> $$5 = csz.a($$4.l("Pattern"));
            if ($$5 != null) {
               int $$6 = $$4.h("Color");
               $$2.add(Pair.of($$5, bzq.a($$6)));
            }
         }
      }

      return $$2;
   }

   public static void d(cax $$0) {
      pj $$1 = byx.a($$0);
      if ($$1 != null && $$1.b("Patterns", 9)) {
         pp $$2 = $$1.c("Patterns", 10);
         if (!$$2.isEmpty()) {
            $$2.c($$2.size() - 1);
            if ($$2.isEmpty()) {
               $$1.r("Patterns");
            }

            byx.a($$0, ctk.s, $$1);
         }
      }
   }

   public cax f() {
      cax $$0 = new cax(ciz.a(this.f));
      if (this.g != null && !this.g.isEmpty()) {
         pj $$1 = new pj();
         $$1.a("Patterns", (qc)this.g.d());
         byx.a($$0, this.v(), $$1);
      }

      if (this.e != null) {
         $$0.a(this.e);
      }

      return $$0;
   }

   public bzq g() {
      return this.f;
   }
}
