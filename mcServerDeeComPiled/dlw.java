import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlw extends dly {
   public static final Codec<dlw> a = RecordCodecBuilder.mapCodec(
         $$0 -> a($$0)
               .and(
                  $$0.group(
                     Codec.intRange(0, 4096).fieldOf("spacing").forGetter(dlw::a),
                     Codec.intRange(0, 4096).fieldOf("separation").forGetter(dlw::b),
                     dlx.c.optionalFieldOf("spread_type", dlx.a).forGetter(dlw::c)
                  )
               )
               .apply($$0, dlw::new)
      )
      .flatXmap($$0 -> $$0.c <= $$0.d ? DataResult.error("Spacing has to be larger than separation") : DataResult.success($$0), DataResult::success)
      .codec();
   private final int c;
   private final int d;
   private final dlx e;

   public dlw(hs $$0, dly.c $$1, float $$2, int $$3, Optional<dly.a> $$4, int $$5, int $$6, dlx $$7) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   public dlw(int $$0, int $$1, dlx $$2, int $$3) {
      this(hs.g, dly.c.a, 1.0F, $$3, Optional.empty(), $$0, $$1, $$2);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public dlx c() {
      return this.e;
   }

   public cge a(long $$0, int $$1, int $$2) {
      int $$3 = Math.floorDiv($$1, this.c);
      int $$4 = Math.floorDiv($$2, this.c);
      dbo $$5 = new dbo(new das(0L));
      $$5.a($$0, $$3, $$4, this.i());
      int $$6 = this.c - this.d;
      int $$7 = this.e.a($$5, $$6);
      int $$8 = this.e.a($$5, $$6);
      return new cge($$3 * this.c + $$7, $$4 * this.c + $$8);
   }

   @Override
   protected boolean a(cxk $$0, dbf $$1, long $$2, int $$3, int $$4) {
      cge $$5 = this.a($$2, $$3, $$4);
      return $$5.e == $$3 && $$5.f == $$4;
   }

   @Override
   public dlz<?> e() {
      return dlz.a;
   }
}
