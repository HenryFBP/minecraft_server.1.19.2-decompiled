import com.google.common.collect.ComparisonChain;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bbg implements Comparable<bbg> {
   private static final Logger a = LogUtils.getLogger();
   private final bbe b;
   int c;
   private int d;
   private boolean e;
   private boolean f;
   private boolean g;
   private boolean h;
   @Nullable
   private bbg i;
   private Optional<bbg.a> j;

   public bbg(bbe $$0) {
      this($$0, 0, 0);
   }

   public bbg(bbe $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bbg(bbe $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bbg(bbe $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bbg(bbe $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null, $$0.b());
   }

   public bbg(bbe $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bbg $$6, Optional<bbg.a> $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   public bbg(bbg $$0) {
      this.b = $$0.b;
      this.j = this.b.b();
      this.a($$0);
   }

   public Optional<bbg.a> a() {
      return this.j;
   }

   void a(bbg $$0) {
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.g = $$0.g;
      this.h = $$0.h;
   }

   public boolean b(bbg $$0) {
      if (this.b != $$0.b) {
         a.warn("This method should only be called for matching effects!");
      }

      int $$1 = this.c;
      boolean $$2 = false;
      if ($$0.d > this.d) {
         if ($$0.c < this.c) {
            bbg $$3 = this.i;
            this.i = new bbg(this);
            this.i.i = $$3;
         }

         this.d = $$0.d;
         this.c = $$0.c;
         $$2 = true;
      } else if ($$0.c > this.c) {
         if ($$0.d == this.d) {
            this.c = $$0.c;
            $$2 = true;
         } else if (this.i == null) {
            this.i = new bbg($$0);
         } else {
            this.i.b($$0);
         }
      }

      if (!$$0.e && this.e || $$2) {
         this.e = $$0.e;
         $$2 = true;
      }

      if ($$0.g != this.g) {
         this.g = $$0.g;
         $$2 = true;
      }

      if ($$0.h != this.h) {
         this.h = $$0.h;
         $$2 = true;
      }

      if ($$1 != this.c) {
         this.j.ifPresent($$1x -> $$1x.f += this.c - $$1);
         $$2 = true;
      }

      return $$2;
   }

   public bbe b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public boolean a(bcc $$0, Runnable $$1) {
      if (this.c > 0) {
         if (this.b.a(this.c, this.d)) {
            this.a($$0);
         }

         this.j();
         if (this.c == 0 && this.i != null) {
            this.a(this.i);
            this.i = this.i.i;
            $$1.run();
         }
      }

      this.j.ifPresent($$0x -> $$0x.a(this));
      return this.c > 0;
   }

   private int j() {
      if (this.i != null) {
         this.i.j();
      }

      return --this.c;
   }

   public void a(bcc $$0) {
      if (this.c > 0) {
         this.b.a($$0, this.d);
      }

   }

   public String h() {
      return this.b.d();
   }

   public String toString() {
      String $$0;
      if (this.d > 0) {
         $$0 = this.h() + " x " + (this.d + 1) + ", Duration: " + this.c;
      } else {
         $$0 = this.h() + ", Duration: " + this.c;
      }

      if (!this.g) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.h) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof bbg)) {
         return false;
      } else {
         bbg $$1 = (bbg)$$0;
         return this.c == $$1.c && this.d == $$1.d && this.e == $$1.e && this.b.equals($$1.b);
      }
   }

   public int hashCode() {
      int $$0 = this.b.hashCode();
      $$0 = 31 * $$0 + this.c;
      $$0 = 31 * $$0 + this.d;
      return 31 * $$0 + (this.e ? 1 : 0);
   }

   public pj a(pj $$0) {
      $$0.a("Id", bbe.a(this.b()));
      this.c($$0);
      return $$0;
   }

   private void c(pj $$0) {
      $$0.a("Amplifier", (byte)this.d());
      $$0.a("Duration", this.c());
      $$0.a("Ambient", this.e());
      $$0.a("ShowParticles", this.f());
      $$0.a("ShowIcon", this.g());
      if (this.i != null) {
         pj $$1 = new pj();
         this.i.a($$1);
         $$0.a("HiddenEffect", (qc)$$1);
      }

      this.j.ifPresent($$1x -> bbg.a.a.encodeStart(pu.a, $$1x).resultOrPartial(a::error).ifPresent($$1xx -> $$0.a("FactorCalculationData", $$1xx)));
   }

   @Nullable
   public static bbg b(pj $$0) {
      int $$1 = $$0.h("Id");
      bbe $$2 = bbe.a($$1);
      return $$2 == null ? null : a($$2, $$0);
   }

   private static bbg a(bbe $$0, pj $$1) {
      int $$2 = $$1.f("Amplifier");
      int $$3 = $$1.h("Duration");
      boolean $$4 = $$1.q("Ambient");
      boolean $$5 = true;
      if ($$1.b("ShowParticles", 1)) {
         $$5 = $$1.q("ShowParticles");
      }

      boolean $$6 = $$5;
      if ($$1.b("ShowIcon", 1)) {
         $$6 = $$1.q("ShowIcon");
      }

      bbg $$7 = null;
      if ($$1.b("HiddenEffect", 10)) {
         $$7 = a($$0, $$1.p("HiddenEffect"));
      }

      Optional<bbg.a> $$8;
      if ($$1.b("FactorCalculationData", 10)) {
         $$8 = bbg.a.a.parse(new Dynamic(pu.a, $$1.p("FactorCalculationData"))).resultOrPartial(a::error);
      } else {
         $$8 = Optional.empty();
      }

      return new bbg($$0, $$3, Math.max($$2, 0), $$4, $$5, $$6, $$7, $$8);
   }

   public void a(boolean $$0) {
      this.f = $$0;
   }

   public boolean i() {
      return this.f;
   }

   public int c(bbg $$0) {
      int $$1 = 32147;
      return (this.c() <= 32147 || $$0.c() <= 32147) && (!this.e() || !$$0.e())
         ? ComparisonChain.start().compare(this.e(), $$0.e()).compare(this.c(), $$0.c()).compare(this.b().g(), $$0.b().g()).result()
         : ComparisonChain.start().compare(this.e(), $$0.e()).compare(this.b().g(), $$0.b().g()).result();
   }

   public static class a {
      public static final Codec<bbg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alq.b.fieldOf("padding_duration").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("factor_start").orElse(0.0F).forGetter($$0x -> $$0x.c),
                  Codec.FLOAT.fieldOf("factor_target").orElse(1.0F).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("factor_current").orElse(0.0F).forGetter($$0x -> $$0x.e),
                  alq.b.fieldOf("effect_changed_timestamp").orElse(0).forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("factor_previous_frame").orElse(0.0F).forGetter($$0x -> $$0x.g),
                  Codec.BOOL.fieldOf("had_effect_last_tick").orElse(false).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, bbg.a::new)
      );
      private final int b;
      private float c;
      private float d;
      private float e;
      int f;
      private float g;
      private boolean h;

      public a(int $$0, float $$1, float $$2, float $$3, int $$4, float $$5, boolean $$6) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.h = $$6;
      }

      public a(int $$0) {
         this($$0, 0.0F, 1.0F, 0.0F, 0, 0.0F, false);
      }

      public void a(bbg $$0) {
         this.g = this.e;
         boolean $$1 = $$0.c > this.b;
         if (this.h != $$1) {
            this.h = $$1;
            this.f = $$0.c;
            this.c = this.e;
            this.d = $$1 ? 1.0F : 0.0F;
         }

         float $$2 = ami.a(((float)this.f - (float)$$0.c) / (float)this.b, 0.0F, 1.0F);
         this.e = ami.i($$2, this.c, this.d);
      }

      public float a(bcc $$0, float $$1) {
         if ($$0.dt()) {
            this.g = this.e;
         }

         return ami.i($$1, this.g, this.e);
      }
   }
}
