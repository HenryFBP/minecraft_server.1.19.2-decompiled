import java.util.function.Predicate;

public abstract class cbm extends cat {
   public static final Predicate<cax> c = $$0 -> $$0.a(aks.ap);
   public static final Predicate<cax> d = c.or($$0 -> $$0.a(caz.sq));

   public cbm(cat.a $$0) {
      super($$0);
   }

   public Predicate<cax> e() {
      return this.b();
   }

   public abstract Predicate<cax> b();

   public static cax a(bcc $$0, Predicate<cax> $$1) {
      if ($$1.test($$0.b(bai.b))) {
         return $$0.b(bai.b);
      } else {
         return $$1.test($$0.b(bai.a)) ? $$0.b(bai.a) : cax.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
