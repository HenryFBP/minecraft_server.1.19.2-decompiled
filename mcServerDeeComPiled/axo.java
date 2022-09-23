import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record axo(
   Instant a, Instant b, Duration c, @Nullable Duration d, List<axy> e, List<axt> f, axv.a g, axx.a h, axw i, axw j, axu.a k, axu.a l, List<axs> m
) {
   public List<Pair<cxn, ayb<axs>>> a() {
      Map<cxn, List<axs>> $$0 = (Map)this.m.stream().collect(Collectors.groupingBy(axs::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((cxn)$$0x.getKey(), ayb.a((List)$$0x.getValue())))
         .sorted(Comparator.comparing($$0x -> ((ayb)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new axq().a(this);
   }

   public Instant c() {
      return this.a;
   }

   public Instant d() {
      return this.b;
   }

   public Duration e() {
      return this.c;
   }

   @Nullable
   public Duration f() {
      return this.d;
   }

   public List<axy> g() {
      return this.e;
   }

   public List<axt> h() {
      return this.f;
   }

   public axv.a i() {
      return this.g;
   }

   public axx.a j() {
      return this.h;
   }

   public axw k() {
      return this.i;
   }

   public axw l() {
      return this.j;
   }

   public axu.a m() {
      return this.k;
   }

   public axu.a n() {
      return this.l;
   }

   public List<axs> o() {
      return this.m;
   }
}
