import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class dab implements czx {
   protected final czy a;
   protected final int b;
   protected final dab.b c;
   @Nullable
   protected dab.a d;
   protected float e;
   protected int f;

   public static Codec<dab> a(dab.b $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  czy.b.fieldOf("source").forGetter($$0xx -> $$0xx.a),
                  alq.b.fieldOf("range").forGetter($$0xx -> $$0xx.b),
                  dab.a.a.optionalFieldOf("event").forGetter($$0xx -> Optional.ofNullable($$0xx.d)),
                  Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("event_distance").orElse(0.0F).forGetter($$0xx -> $$0xx.e),
                  alq.b.fieldOf("event_delay").orElse(0).forGetter($$0xx -> $$0xx.f)
               )
               .apply($$1, ($$1x, $$2, $$3, $$4, $$5) -> new dab($$1x, $$2, $$0, (dab.a)$$3.orElse(null), $$4, $$5))
      );
   }

   public dab(czy $$0, int $$1, dab.b $$2, @Nullable dab.a $$3, float $$4, int $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public void a(cgx $$0) {
      if ($$0 instanceof agg $$1 && this.d != null) {
         --this.f;
         if (this.f <= 0) {
            this.f = 0;
            this.c.a($$1, this, new gt(this.d.d), this.d.b, (bbn)this.d.a($$1).orElse(null), (bbn)this.d.b($$1).orElse(null), this.e);
            this.d = null;
         }
      }

   }

   @Override
   public czy a() {
      return this.a;
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean a(agg $$0, czv.b $$1) {
      if (this.d != null) {
         return false;
      } else {
         czv $$2 = $$1.a();
         czv.a $$3 = $$1.c();
         if (!this.c.a($$2, $$3)) {
            return false;
         } else {
            Optional<dwq> $$4 = this.a.a($$0);
            if ($$4.isEmpty()) {
               return false;
            } else {
               dwq $$5 = $$1.b();
               dwq $$6 = (dwq)$$4.get();
               if (!this.c.a($$0, this, new gt($$5), $$2, $$3)) {
                  return false;
               } else if (a($$0, $$5, $$6)) {
                  return false;
               } else {
                  this.a($$0, $$2, $$3, $$5, $$6);
                  return true;
               }
            }
         }
      }
   }

   private void a(agg $$0, czv $$1, czv.a $$2, dwq $$3, dwq $$4) {
      this.e = (float)$$3.f($$4);
      this.d = new dab.a($$1, this.e, $$3, $$2.a());
      this.f = ami.d(this.e);
      $$0.a(new is(this.a, this.f), $$3.c, $$3.d, $$3.e, 1, 0.0, 0.0, 0.0, 0.0);
      this.c.f();
   }

   private static boolean a(cgx $$0, dwq $$1, dwq $$2) {
      dwq $$3 = new dwq((double)ami.b($$1.c) + 0.5, (double)ami.b($$1.d) + 0.5, (double)ami.b($$1.e) + 0.5);
      dwq $$4 = new dwq((double)ami.b($$2.c) + 0.5, (double)ami.b($$2.d) + 0.5, (double)ami.b($$2.e) + 0.5);

      for(gy $$5 : gy.values()) {
         dwq $$6 = $$3.a($$5, 1.0E-5F);
         if ($$0.a(new cgf($$6, $$4, $$0x -> $$0x.a(akl.bf))).c() != dwo.a.b) {
            return false;
         }
      }

      return true;
   }

   public static record a(czv b, float c, dwq d, @Nullable UUID e, @Nullable UUID f, @Nullable bbn g) {
      final czv b;
      final dwq d;
      public static final Codec<dab.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hm.R.p().fieldOf("game_event").forGetter(dab.a::a),
                  Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dab.a::b),
                  dwq.a.fieldOf("pos").forGetter(dab.a::c),
                  alq.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
                  alq.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dab.a($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
      );

      public a(czv $$0, float $$1, dwq $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
         this($$0, $$1, $$2, $$3, $$4, null);
      }

      public a(czv $$0, float $$1, dwq $$2, @Nullable bbn $$3) {
         this($$0, $$1, $$2, $$3 == null ? null : $$3.co(), a($$3), $$3);
      }

      @Nullable
      private static UUID a(@Nullable bbn $$0) {
         if ($$0 instanceof buu $$1 && $$1.x() != null) {
            return $$1.x().co();
         }

         return null;
      }

      public Optional<bbn> a(agg $$0) {
         return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
      }

      public Optional<bbn> b(agg $$0) {
         return this.a($$0).filter($$0x -> $$0x instanceof buu).map($$0x -> (buu)$$0x).map(buu::x).or(() -> Optional.ofNullable(this.f).map($$0::a));
      }

      public czv a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dwq c() {
         return this.d;
      }

      @Nullable
      public UUID d() {
         return this.e;
      }

      @Nullable
      public UUID e() {
         return this.f;
      }

      @Nullable
      public bbn f() {
         return this.g;
      }
   }

   public interface b {
      default akz<czv> a() {
         return akq.a;
      }

      default boolean t() {
         return false;
      }

      default boolean a(czv $$0, czv.a $$1) {
         if (!$$0.a(this.a())) {
            return false;
         } else {
            bbn $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.B_()) {
                  return false;
               }

               if ($$2.bM() && $$0.a(akq.d)) {
                  if (this.t() && $$2 instanceof agh $$3) {
                     aj.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aP()) {
                  return false;
               }
            }

            if ($$1.b() != null) {
               return !$$1.b().a(akl.bg);
            } else {
               return true;
            }
         }
      }

      boolean a(agg var1, czx var2, gt var3, czv var4, czv.a var5);

      void a(agg var1, czx var2, gt var3, czv var4, @Nullable bbn var5, @Nullable bbn var6, float var7);

      default void f() {
      }
   }
}
