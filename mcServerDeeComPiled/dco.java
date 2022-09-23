import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dco {
   public static final dco a = new dco(false, cju.fE.m(), cju.ow.m(), cju.dt.m(), cju.aD.m());
   public static final Codec<dco> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dco::a),
               cvo.b.optionalFieldOf("air_state", a.b()).forGetter(dco::b),
               cvo.b.optionalFieldOf("water_state", a.b()).forGetter(dco::c),
               cvo.b.optionalFieldOf("lava_state", a.b()).forGetter(dco::d),
               cvo.b.optionalFieldOf("barrier_state", a.b()).forGetter(dco::e)
            )
            .apply($$0, dco::new)
   );
   private boolean c;
   private final cvo d;
   private final cvo e;
   private final cvo f;
   private final cvo g;

   public static dco a(boolean $$0, cvo $$1, cvo $$2, cvo $$3, cvo $$4) {
      return new dco($$0, $$1, $$2, $$3, $$4);
   }

   public static dco a(cvo $$0, cvo $$1, cvo $$2, cvo $$3) {
      return new dco(false, $$0, $$1, $$2, $$3);
   }

   public static dco a(boolean $$0, cvo $$1) {
      return new dco($$0, $$1, a.c(), a.d(), a.e());
   }

   private dco(boolean $$0, cvo $$1, cvo $$2, cvo $$3, cvo $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public cvo b() {
      return this.d;
   }

   public cvo c() {
      return this.e;
   }

   public cvo d() {
      return this.f;
   }

   public cvo e() {
      return this.g;
   }
}
