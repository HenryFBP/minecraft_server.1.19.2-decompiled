import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dmb extends dmi {
   public static final Codec<dmb> a = Codec.unit(() -> dmb.b);
   public static final dmb b = new dmb();

   private dmb() {
      super(dmk.a.a);
   }

   @Override
   public hs a(dou $$0, cpw $$1) {
      return hs.g;
   }

   @Override
   public List<dot.c> a(dou $$0, gt $$1, cpw $$2, amn $$3) {
      return Collections.emptyList();
   }

   @Override
   public dkt a(dou $$0, gt $$1, cpw $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dou $$0, chp $$1, cho $$2, cxk $$3, gt $$4, gt $$5, cpw $$6, dkt $$7, amn $$8, boolean $$9) {
      return true;
   }

   @Override
   public dmj<?> a() {
      return dmj.d;
   }

   public String toString() {
      return "Empty";
   }
}
