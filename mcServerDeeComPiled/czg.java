import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class czg<T extends czc> {
   private static final Logger a = LogUtils.getLogger();
   private final alg<T> b;
   private czp c;

   public czg(Class<T> $$0, czp $$1) {
      this.c = $$1;
      this.b = new alg<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public void a(dwl $$0, Consumer<T> $$1) {
      for(T $$2 : this.b) {
         if ($$2.cy().c($$0)) {
            $$1.accept($$2);
         }
      }

   }

   public <U extends T> void a(czj<T, U> $$0, dwl $$1, Consumer<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if (!$$3.isEmpty()) {
         for(T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cy().c($$1)) {
               $$2.accept($$5);
            }
         }

      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public czp c() {
      return this.c;
   }

   public czp a(czp $$0) {
      czp $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @ang
   public int d() {
      return this.b.size();
   }
}
