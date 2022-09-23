import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dmc extends dmi {
   public static final Codec<dmc> a = RecordCodecBuilder.create($$0 -> $$0.group(dkg.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dmc::new));
   private final hc<dkg> b;
   private final pj c;

   protected dmc(hc<dkg> $$0, dmk.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private pj b() {
      pj $$0 = new pj();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", cub.a.a.c());
      return $$0;
   }

   @Override
   public hs a(dou $$0, cpw $$1) {
      return hs.g;
   }

   @Override
   public List<dot.c> a(dou $$0, gt $$1, cpw $$2, amn $$3) {
      List<dot.c> $$4 = Lists.newArrayList();
      $$4.add(new dot.c($$1, cju.nM.m().a(cnl.a, ha.a(gy.a, gy.d)), this.c));
      return $$4;
   }

   @Override
   public dkt a(dou $$0, gt $$1, cpw $$2) {
      hs $$3 = this.a($$0, $$2);
      return new dkt($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dou $$0, chp $$1, cho $$2, cxk $$3, gt $$4, gt $$5, cpw $$6, dkt $$7, amn $$8, boolean $$9) {
      return ((dkg)this.b.a()).a($$1, $$3, $$8, $$4);
   }

   @Override
   public dmj<?> a() {
      return dmj.c;
   }

   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
