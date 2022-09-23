import java.util.function.Predicate;

public class cgg {
   private final dwq a;
   private final dwq b;
   private final cgg.a c;
   private final cgg.b d;
   private final dwv e;

   public cgg(dwq $$0, dwq $$1, cgg.a $$2, cgg.b $$3, bbn $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = dwv.a($$4);
   }

   public dwq a() {
      return this.b;
   }

   public dwq b() {
      return this.a;
   }

   public dxj a(cvo $$0, cgd $$1, gt $$2) {
      return this.c.get($$0, $$1, $$2, this.e);
   }

   public dxj a(dpv $$0, cgd $$1, gt $$2) {
      return this.d.a($$0) ? $$0.d($$1, $$2) : dxg.a();
   }

   public static enum a implements cgg.c {
      a(cvn.a::b),
      b(cvn.a::a),
      c(cvn.a::c),
      d(($$0, $$1, $$2, $$3) -> $$0.a(akl.aH) ? dxg.b() : dxg.a());

      private final cgg.c e;

      private a(cgg.c $$0) {
         this.e = $$0;
      }

      @Override
      public dxj get(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
         return this.e.get($$0, $$1, $$2, $$3);
      }
   }

   public static enum b {
      a($$0 -> false),
      b(dpv::b),
      c($$0 -> !$$0.c()),
      d($$0 -> $$0.a(akp.a));

      private final Predicate<dpv> e;

      private b(Predicate<dpv> $$0) {
         this.e = $$0;
      }

      public boolean a(dpv $$0) {
         return this.e.test($$0);
      }
   }

   public interface c {
      dxj get(cvo var1, cgd var2, gt var3, dwv var4);
   }
}
