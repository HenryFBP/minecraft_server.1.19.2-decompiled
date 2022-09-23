import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cti {
   private static final Logger b = LogUtils.getLogger();
   private final ctk<?> c;
   @Nullable
   protected cgx n;
   protected final gt o;
   protected boolean p;
   private cvo d;

   public cti(ctk<?> $$0, gt $$1, cvo $$2) {
      this.c = $$0;
      this.o = $$1.h();
      this.d = $$2;
   }

   public static gt c(pj $$0) {
      return new gt($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public cgx k() {
      return this.n;
   }

   public void a(cgx $$0) {
      this.n = $$0;
   }

   public boolean l() {
      return this.n != null;
   }

   public void a(pj $$0) {
   }

   protected void b(pj $$0) {
   }

   public final pj m() {
      pj $$0 = this.o();
      this.e($$0);
      return $$0;
   }

   public final pj n() {
      pj $$0 = this.o();
      this.d($$0);
      return $$0;
   }

   public final pj o() {
      pj $$0 = new pj();
      this.b($$0);
      return $$0;
   }

   private void d(pj $$0) {
      abb $$1 = ctk.a(this.v());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(pj $$0, ctk<?> $$1) {
      $$0.a("id", ctk.a($$1).toString());
   }

   public void e(cax $$0) {
      byx.a($$0, this.v(), this.o());
   }

   private void e(pj $$0) {
      this.d($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static cti a(gt $$0, cvo $$1, pj $$2) {
      String $$3 = $$2.l("id");
      abb $$4 = abb.a($$3);
      if ($$4 == null) {
         b.error("Block entity has invalid type: {}", $$3);
         return null;
      } else {
         return (cti)hm.ab.b($$4).map($$3x -> {
            try {
               return $$3x.a($$0, $$1);
            } catch (Throwable var5) {
               b.error("Failed to create block entity {}", $$3, var5);
               return null;
            }
         }).map($$2x -> {
            try {
               $$2x.a($$2);
               return $$2x;
            } catch (Throwable var4x) {
               b.error("Failed to load data for block entity {}", $$3, var4x);
               return null;
            }
         }).orElseGet(() -> {
            b.warn("Skipping BlockEntity with id {}", $$3);
            return null;
         });
      }
   }

   public void e() {
      if (this.n != null) {
         a(this.n, this.o, this.d);
      }

   }

   protected static void a(cgx $$0, gt $$1, cvo $$2) {
      $$0.p($$1);
      if (!$$2.h()) {
         $$0.c($$1, $$2.b());
      }

   }

   public gt p() {
      return this.o;
   }

   public cvo q() {
      return this.d;
   }

   @Nullable
   public tc<tf> h() {
      return null;
   }

   public pj aa_() {
      return new pj();
   }

   public boolean r() {
      return this.p;
   }

   public void ab_() {
      this.p = true;
   }

   public void s() {
      this.p = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(r $$0) {
      $$0.a("Name", (s<String>)(() -> hm.ab.b(this.v()) + " // " + this.getClass().getCanonicalName()));
      if (this.n != null) {
         r.a($$0, this.n, this.o, this.q());
         r.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   public boolean u() {
      return false;
   }

   public ctk<?> v() {
      return this.c;
   }

   @Deprecated
   public void b(cvo $$0) {
      this.d = $$0;
   }
}
