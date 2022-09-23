import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Predicate;

public class bfl<E extends bcc> extends bdo<E> {
   private final Predicate<E> a;
   private final bdo<? super E> d;
   private final boolean e;

   public bfl(Map<bku<?>, bkv> $$0, Predicate<E> $$1, bdo<? super E> $$2, boolean $$3) {
      super(a($$0, $$2.c));
      this.a = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private static Map<bku<?>, bkv> a(Map<bku<?>, bkv> $$0, Map<bku<?>, bkv> $$1) {
      Map<bku<?>, bkv> $$2 = Maps.newHashMap();
      $$2.putAll($$0);
      $$2.putAll($$1);
      return $$2;
   }

   public bfl(Predicate<E> $$0, bdo<? super E> $$1, boolean $$2) {
      this(ImmutableMap.of(), $$0, $$1, $$2);
   }

   public bfl(Predicate<E> $$0, bdo<? super E> $$1) {
      this(ImmutableMap.of(), $$0, $$1, false);
   }

   public bfl(Map<bku<?>, bkv> $$0, bdo<? super E> $$1) {
      this($$0, $$0x -> true, $$1, false);
   }

   @Override
   protected boolean a(agg $$0, E $$1) {
      return this.a.test($$1) && this.d.a($$0, $$1);
   }

   @Override
   protected boolean b(agg $$0, E $$1, long $$2) {
      return this.e && this.a.test($$1) && this.d.b($$0, $$1, $$2);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      this.d.a($$0, $$1, $$2);
   }

   @Override
   protected void d(agg $$0, E $$1, long $$2) {
      this.d.d($$0, $$1, $$2);
   }

   @Override
   protected void c(agg $$0, E $$1, long $$2) {
      this.d.c($$0, $$1, $$2);
   }

   @Override
   public String toString() {
      return "RunIf: " + this.d;
   }
}
