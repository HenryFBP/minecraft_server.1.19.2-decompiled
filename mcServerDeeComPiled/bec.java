import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bec<E extends bcc> extends bdo<E> {
   private final Set<bku<?>> a;
   private final bec.a d;
   private final bec.b e;
   private final bfy<bdo<? super E>> f = new bfy<>();

   public bec(Map<bku<?>, bkv> $$0, Set<bku<?>> $$1, bec.a $$2, bec.b $$3, List<Pair<bdo<? super E>, Integer>> $$4) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.e = $$3;
      $$4.forEach($$0x -> this.f.a((bdo<? super E>)$$0x.getFirst(), $$0x.getSecond()));
   }

   @Override
   protected boolean b(agg $$0, E $$1, long $$2) {
      return this.f.b().filter($$0x -> $$0x.a() == bdo.a.b).anyMatch($$3 -> $$3.b($$0, $$1, $$2));
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      this.d.a(this.f);
      this.e.a(this.f.b(), $$0, $$1, $$2);
   }

   @Override
   protected void d(agg $$0, E $$1, long $$2) {
      this.f.b().filter($$0x -> $$0x.a() == bdo.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
   }

   @Override
   protected void c(agg $$0, E $$1, long $$2) {
      this.f.b().filter($$0x -> $$0x.a() == bdo.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.a.forEach($$1.dy()::b);
   }

   @Override
   public String toString() {
      Set<? extends bdo<? super E>> $$0 = (Set)this.f.b().filter($$0x -> $$0x.a() == bdo.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bfy::a);

      private final Consumer<bfy<?>> c;

      private a(Consumer<bfy<?>> $$0) {
         this.c = $$0;
      }

      public void a(bfy<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bcc> void a(Stream<bdo<? super E>> $$0, agg $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bdo.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bcc> void a(Stream<bdo<? super E>> $$0, agg $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bdo.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bcc> void a(Stream<bdo<? super E>> var1, agg var2, E var3, long var4);
   }
}
