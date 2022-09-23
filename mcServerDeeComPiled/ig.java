import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ig implements im {
   public static final im.a<ig> a = new im.a<ig>() {
      public ig a(in<ig> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new ig($$0, ff.a(hm.V, $$1, false).a());
      }

      public ig a(in<ig> $$0, qx $$1) {
         return new ig($$0, $$1.a(cjt.o));
      }
   };
   private final in<ig> b;
   private final cvo c;

   public static Codec<ig> a(in<ig> $$0) {
      return cvo.b.xmap($$1 -> new ig($$0, $$1), $$0x -> $$0x.c);
   }

   public ig(in<ig> $$0, cvo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(qx $$0) {
      $$0.a(cjt.o, this.c);
   }

   @Override
   public String a() {
      return hm.aa.b(this.b()) + " " + ff.a(this.c);
   }

   @Override
   public in<ig> b() {
      return this.b;
   }

   public cvo c() {
      return this.c;
   }
}
