import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.function.BiConsumer;

public abstract class dhi {
   public static final Codec<dhi> d = hm.bw.p().dispatch(dhi::a, dhj::a);
   protected final azo e;
   protected final azo f;

   protected static <P extends dhi> P2<Mu<P>, azo, azo> b(Instance<P> $$0) {
      return $$0.group(azo.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), azo.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public dhi(azo $$0, azo $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract dhj<?> a();

   public void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, int $$4, dhi.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(chd var1, BiConsumer<gt, cvo> var2, amn var3, dgt var4, int var5, dhi.a var6, int var7, int var8, int var9);

   public abstract int a(amn var1, int var2, dgt var3);

   public int a(amn $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(amn $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(amn var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(amn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      int $$6;
      int $$7;
      if ($$5) {
         $$6 = Math.min(Math.abs($$1), Math.abs($$1 - 1));
         $$7 = Math.min(Math.abs($$3), Math.abs($$3 - 1));
      } else {
         $$6 = Math.abs($$1);
         $$7 = Math.abs($$3);
      }

      return this.a($$0, $$6, $$2, $$7, $$4, $$5);
   }

   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, gt $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      gt.a $$9 = new gt.a();

      for(int $$10 = -$$5; $$10 <= $$5 + $$8; ++$$10) {
         for(int $$11 = -$$5; $$11 <= $$5 + $$8; ++$$11) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }

   }

   protected static void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, gt $$4) {
      if (dff.d($$0, $$4)) {
         cvo $$5 = $$3.e.a($$2, $$4);
         if ($$5.b(cwe.C)) {
            $$5 = $$5.a(cwe.C, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(dpw.c))));
         }

         $$1.accept($$4, $$5);
      }

   }

   public static final class a {
      private final gt a;
      private final int b;
      private final boolean c;

      public a(gt $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public gt a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public boolean c() {
         return this.c;
      }
   }
}
