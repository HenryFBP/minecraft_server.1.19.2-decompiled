import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bvq {
   private final bvp a;
   private final List<bvq.a> b = Lists.newArrayList();

   public bvq(bvp $$0) {
      this.a = $$0;
   }

   public bvq a(int $$0, bvn $$1) {
      this.b.add(new bvq.a($$0, $$1));
      return this;
   }

   public bvp a() {
      ((Set)this.b.stream().map(bvq.a::b).collect(Collectors.toSet())).forEach(this.a::a);
      this.b.forEach($$0 -> {
         bvn $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final bvn b;

      public a(int $$0, bvn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public bvn b() {
         return this.b;
      }
   }
}
