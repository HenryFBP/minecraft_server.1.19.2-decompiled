import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dmg extends dmi {
   public static final Codec<dmg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmi.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dmg::new)
   );
   private final List<dmi> b;

   public dmg(List<dmi> $$0, dmk.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public hs a(dou $$0, cpw $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for(dmi $$5 : this.b) {
         hs $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new hs($$2, $$3, $$4);
   }

   @Override
   public List<dot.c> a(dou $$0, gt $$1, cpw $$2, amn $$3) {
      return ((dmi)this.b.get(0)).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dkt a(dou $$0, gt $$1, cpw $$2) {
      Stream<dkt> $$3 = this.b.stream().filter($$0x -> $$0x != dmb.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return (dkt)dkt.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dou $$0, chp $$1, cho $$2, cxk $$3, gt $$4, gt $$5, cpw $$6, dkt $$7, amn $$8, boolean $$9) {
      for(dmi $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dmj<?> a() {
      return dmj.b;
   }

   @Override
   public dmi a(dmk.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   public String toString() {
      return "List[" + (String)this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dmk.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
