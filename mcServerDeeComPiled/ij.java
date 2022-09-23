import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Locale;

public abstract class ij implements im {
   public static final float e = 0.01F;
   public static final float f = 4.0F;
   protected final k g;
   protected final float h;

   public ij(k $$0, float $$1) {
      this.g = $$0;
      this.h = ami.a($$1, 0.01F, 4.0F);
   }

   public static k a(StringReader $$0) throws CommandSyntaxException {
      $$0.expect(' ');
      float $$1 = $$0.readFloat();
      $$0.expect(' ');
      float $$2 = $$0.readFloat();
      $$0.expect(' ');
      float $$3 = $$0.readFloat();
      return new k($$1, $$2, $$3);
   }

   public static k b(qx $$0) {
      return new k($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   @Override
   public void a(qx $$0) {
      $$0.writeFloat(this.g.a());
      $$0.writeFloat(this.g.b());
      $$0.writeFloat(this.g.c());
      $$0.writeFloat(this.h);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", hm.aa.b(this.b()), this.g.a(), this.g.b(), this.g.c(), this.h);
   }

   public k e() {
      return this.g;
   }

   public float f() {
      return this.h;
   }
}
