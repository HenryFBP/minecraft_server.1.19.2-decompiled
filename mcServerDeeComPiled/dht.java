import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class dht extends dhu {
   public static final int a = 8;
   public static final int b = 15;
   public static final Codec<dht> c = RecordCodecBuilder.create(
      $$0 -> a($$0).and(dhs.a.fieldOf("mangrove_root_placement").forGetter($$0x -> $$0x.h)).apply($$0, dht::new)
   );
   private final dhs h;

   public dht(azo $$0, dhw $$1, Optional<dhr> $$2, dhs $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   public boolean a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, gt $$3, gt $$4, dgt $$5) {
      List<gt> $$6 = Lists.newArrayList();
      gt.a $$7 = $$3.i();

      while($$7.v() < $$4.v()) {
         if (!this.a($$0, $$7)) {
            return false;
         }

         $$7.c(gy.b);
      }

      $$6.add($$4.c());

      for(gy $$8 : gy.c.a) {
         gt $$9 = $$4.a($$8);
         List<gt> $$10 = Lists.newArrayList();
         if (!this.a($$0, $$2, $$9, $$8, $$4, $$10, 0)) {
            return false;
         }

         $$6.addAll($$10);
         $$6.add($$4.a($$8));
      }

      for(gt $$11 : $$6) {
         this.a($$0, $$1, $$2, $$11, $$5);
      }

      return true;
   }

   private boolean a(chd $$0, amn $$1, gt $$2, gy $$3, gt $$4, List<gt> $$5, int $$6) {
      int $$7 = this.h.e();
      if ($$6 != $$7 && $$5.size() <= $$7) {
         for(gt $$9 : this.a($$2, $$3, $$1, $$4)) {
            if (this.a($$0, $$9)) {
               $$5.add($$9);
               if (!this.a($$0, $$1, $$9, $$3, $$4, $$5, $$6 + 1)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected List<gt> a(gt $$0, gy $$1, amn $$2, gt $$3) {
      gt $$4 = $$0.c();
      gt $$5 = $$0.a($$1);
      int $$6 = $$0.k($$3);
      int $$7 = this.h.d();
      float $$8 = this.h.f();
      if ($$6 > $$7 - 3 && $$6 <= $$7) {
         return $$2.i() < $$8 ? List.of($$4, $$5.c()) : List.of($$4);
      } else if ($$6 > $$7) {
         return List.of($$4);
      } else if ($$2.i() < $$8) {
         return List.of($$4);
      } else {
         return $$2.h() ? List.of($$5) : List.of($$4);
      }
   }

   @Override
   protected boolean a(chd $$0, gt $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.h.a()));
   }

   @Override
   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, gt $$3, dgt $$4) {
      if ($$0.a($$3, $$0x -> $$0x.a(this.h.b()))) {
         cvo $$5 = this.h.c().a($$2, $$3);
         $$1.accept($$3, this.a($$0, $$3, $$5));
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }

   }

   @Override
   protected dhv<?> a() {
      return dhv.a;
   }
}
