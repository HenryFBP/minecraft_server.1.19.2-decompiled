import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class dkx extends dlf {
   private static final Logger d = LogUtils.getLogger();
   protected final dmi a;
   protected gt b;
   private final int h;
   protected final cpw c;
   private final List<dmd> i = Lists.newArrayList();
   private final dou j;

   public dkx(dou $$0, dmi $$1, gt $$2, int $$3, cpw $$4, dkt $$5) {
      super(dls.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public dkx(dlr $$0, pj $$1) {
      super(dls.ad, $$1);
      this.j = $$0.c();
      this.b = new gt($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<qc> $$2 = aay.a(pu.a, $$0.b());
      this.a = (dmi)dmi.e
         .parse($$2, $$1.p("pool_element"))
         .resultOrPartial(d::error)
         .orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.c = cpw.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      pp $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(dmd.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(dlr $$0, pj $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<qc> $$2 = aay.a(pu.a, $$0.b());
      dmi.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      pp $$3 = new pp();

      for(dmd $$4 : this.i) {
         $$3.add((qc)$$4.a($$2).getValue());
      }

      $$1.a("junctions", (qc)$$3);
   }

   @Override
   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, gt $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public cpw a() {
      return this.c;
   }

   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public dmi b() {
      return this.a;
   }

   public gt c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(dmd $$0) {
      this.i.add($$0);
   }

   public List<dmd> e() {
      return this.i;
   }
}
