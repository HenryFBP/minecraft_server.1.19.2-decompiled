import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmy extends dlb {
   public static final Codec<dmy> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dmy.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dmy::new)
   );
   private final dmy.a e;

   public dmy(dlb.c $$0, dmy.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      $$0.f().j();
      cge $$1 = $$0.h();
      gt $$2 = new gt($$1.b(), 50, $$1.e());
      dlt $$3 = new dlt();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dlb.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dlt $$0, dlb.a $$1) {
      cge $$2 = $$1.h();
      dbo $$3 = $$1.f();
      cxk $$4 = $$1.b();
      dmx.d $$5 = new dmx.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == dmy.a.b) {
         gt $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dar.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ami.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public dlk<?> e() {
      return dlk.h;
   }

   public static enum a implements amw {
      a("normal", cju.O, cju.n, cju.dd),
      b("mesa", cju.T, cju.s, cju.ja);

      public static final Codec<dmy.a> c = amw.a(dmy.a::values);
      private final String d;
      private final cvo e;
      private final cvo f;
      private final cvo g;

      private a(String $$0, cjt $$1, cjt $$2, cjt $$3) {
         this.d = $$0;
         this.e = $$1.m();
         this.f = $$2.m();
         this.g = $$3.m();
      }

      public String a() {
         return this.d;
      }

      public static dmy.a a(int $$0) {
         return $$0 >= 0 && $$0 < values().length ? values()[$$0] : a;
      }

      public cvo b() {
         return this.e;
      }

      public cvo d() {
         return this.f;
      }

      public cvo e() {
         return this.g;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
