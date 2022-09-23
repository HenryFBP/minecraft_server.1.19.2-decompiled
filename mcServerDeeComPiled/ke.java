import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class ke {
   private static final ke a = new ke(ImmutableList.of());
   private static final Comparator<cwr.a<?>> b = Comparator.comparing($$0 -> $$0.a().f());
   private final List<cwr.a<?>> c;

   public ke a(cwr.a<?> $$0) {
      return new ke(ImmutableList.builder().addAll(this.c).add($$0).build());
   }

   public ke a(ke $$0) {
      return new ke(ImmutableList.builder().addAll(this.c).addAll($$0.c).build());
   }

   private ke(List<cwr.a<?>> $$0) {
      this.c = $$0;
   }

   public static ke a() {
      return a;
   }

   public static ke a(cwr.a<?>... $$0) {
      return new ke(ImmutableList.copyOf($$0));
   }

   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof ke && this.c.equals(((ke)$$0).c);
   }

   public int hashCode() {
      return this.c.hashCode();
   }

   public String b() {
      return (String)this.c.stream().sorted(b).map(cwr.a::toString).collect(Collectors.joining(","));
   }

   public String toString() {
      return this.b();
   }
}
