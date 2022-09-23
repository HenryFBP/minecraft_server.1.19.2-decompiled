import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ik implements im {
   public static final im.a<ik> a = new im.a<ik>() {
      public ik a(in<ik> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         fv.a $$2 = fv.a(hd.a(hm.Y), $$1);
         cax $$3 = new fu($$2.a(), $$2.b()).a(1, false);
         return new ik($$0, $$3);
      }

      public ik a(in<ik> $$0, qx $$1) {
         return new ik($$0, $$1.p());
      }
   };
   private final in<ik> b;
   private final cax c;

   public static Codec<ik> a(in<ik> $$0) {
      return cax.a.xmap($$1 -> new ik($$0, $$1), $$0x -> $$0x.c);
   }

   public ik(in<ik> $$0, cax $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return hm.aa.b(this.b()) + " " + new fu(this.c.d(), this.c.u()).b();
   }

   @Override
   public in<ik> b() {
      return this.b;
   }

   public cax c() {
      return this.c;
   }
}
