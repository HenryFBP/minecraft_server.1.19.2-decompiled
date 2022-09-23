import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class oe {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<pa> c;
   @Nullable
   private final Consumer<agg> d;
   @Nullable
   private final Consumer<agg> e;

   public oe(String $$0, Collection<pa> $$1, @Nullable Consumer<agg> $$2, @Nullable Consumer<agg> $$3) {
      if ($$1.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public String a() {
      return this.b;
   }

   public Collection<pa> b() {
      return this.c;
   }

   public void a(agg $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }

   }

   public void b(agg $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }

   }
}
