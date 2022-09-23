import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class bti {
   public static final Codec<bti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alq.b.fieldOf("ticks_since_last_warning").orElse(0).forGetter($$0x -> $$0x.g),
               alq.b.fieldOf("warning_level").orElse(0).forGetter($$0x -> $$0x.h),
               alq.b.fieldOf("cooldown_ticks").orElse(0).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, bti::new)
   );
   public static final int b = 4;
   private static final double c = 16.0;
   private static final int d = 48;
   private static final int e = 12000;
   private static final int f = 200;
   private int g;
   private int h;
   private int i;

   public bti(int $$0, int $$1, int $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public void a() {
      if (this.g >= 12000) {
         this.f();
         this.g = 0;
      } else {
         ++this.g;
      }

      if (this.i > 0) {
         --this.i;
      }

   }

   public void b() {
      this.g = 0;
      this.h = 0;
      this.i = 0;
   }

   public static OptionalInt a(agg $$0, gt $$1, agh $$2) {
      if (a($$0, $$1)) {
         return OptionalInt.empty();
      } else {
         List<agh> $$3 = b($$0, $$1);
         if (!$$3.contains($$2)) {
            $$3.add($$2);
         }

         if ($$3.stream().anyMatch($$0x -> $$0x.fK().d())) {
            return OptionalInt.empty();
         } else {
            Optional<bti> $$4 = $$3.stream().map(buc::fK).max(Comparator.comparingInt($$0x -> $$0x.h));
            bti $$5 = (bti)$$4.get();
            $$5.e();
            $$3.forEach($$1x -> $$1x.fK().a($$5));
            return OptionalInt.of($$5.h);
         }
      }
   }

   private boolean d() {
      return this.i > 0;
   }

   private static boolean a(agg $$0, gt $$1) {
      dwl $$2 = dwl.a(dwq.a($$1), 48.0, 48.0, 48.0);
      return !$$0.a(btg.class, $$2).isEmpty();
   }

   private static List<agh> b(agg $$0, gt $$1) {
      dwq $$2 = dwq.a($$1);
      Predicate<agh> $$3 = $$1x -> $$1x.cY().a((hj)$$2, 16.0);
      return $$0.a($$3.and(bcc::bo).and(bbq.f));
   }

   private void e() {
      if (!this.d()) {
         this.g = 0;
         this.i = 200;
         this.a(this.c() + 1);
      }

   }

   private void f() {
      this.a(this.c() - 1);
   }

   public void a(int $$0) {
      this.h = ami.a($$0, 0, 4);
   }

   public int c() {
      return this.h;
   }

   private void a(bti $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.g = $$0.g;
   }
}
