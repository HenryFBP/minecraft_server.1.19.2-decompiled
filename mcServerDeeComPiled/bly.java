import java.util.Set;

public abstract class bly<E extends bcc> {
   private static final amn a = amn.b();
   private static final int c = 20;
   protected static final int b = 16;
   private static final bmf d = bmf.b().a(16.0);
   private static final bmf e = bmf.b().a(16.0).e();
   private static final bmf f = bmf.a().a(16.0);
   private static final bmf g = bmf.a().a(16.0).e();
   private static final bmf h = bmf.a().a(16.0).d();
   private static final bmf i = bmf.a().a(16.0).d().e();
   private final int j;
   private long k;

   public bly(int $$0) {
      this.j = $$0;
      this.k = (long)a.a($$0);
   }

   public bly() {
      this(20);
   }

   public final void b(agg $$0, E $$1) {
      if (--this.k <= 0L) {
         this.k = (long)this.j;
         this.a($$0, $$1);
      }

   }

   protected abstract void a(agg var1, E var2);

   public abstract Set<bku<?>> a();

   public static boolean b(bcc $$0, bcc $$1) {
      return $$0.dy().b(bku.o, $$1) ? e.a($$0, $$1) : d.a($$0, $$1);
   }

   public static boolean c(bcc $$0, bcc $$1) {
      return $$0.dy().b(bku.o, $$1) ? g.a($$0, $$1) : f.a($$0, $$1);
   }

   public static boolean d(bcc $$0, bcc $$1) {
      return $$0.dy().b(bku.o, $$1) ? i.a($$0, $$1) : h.a($$0, $$1);
   }
}
