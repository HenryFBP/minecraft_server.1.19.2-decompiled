import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class din {
   public static final Codec<din> h = hm.bz.p().dispatch(din::a, dio::a);

   protected abstract dio<?> a();

   public abstract void a(din.a var1);

   public static final class a {
      private final chd a;
      private final BiConsumer<gt, cvo> b;
      private final amn c;
      private final ObjectArrayList<gt> d;
      private final ObjectArrayList<gt> e;
      private final ObjectArrayList<gt> f;

      public a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, Set<gt> $$3, Set<gt> $$4, Set<gt> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(hs::v));
         this.e.sort(Comparator.comparingInt(hs::v));
         this.f.sort(Comparator.comparingInt(hs::v));
      }

      public void a(gt $$0, cwf $$1) {
         this.a($$0, cju.em.m().a($$1, Boolean.valueOf(true)));
      }

      public void a(gt $$0, cvo $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(gt $$0) {
         return this.a.a($$0, cvn.a::h);
      }

      public chd a() {
         return this.a;
      }

      public amn b() {
         return this.c;
      }

      public ObjectArrayList<gt> c() {
         return this.d;
      }

      public ObjectArrayList<gt> d() {
         return this.e;
      }

      public ObjectArrayList<gt> e() {
         return this.f;
      }
   }
}
