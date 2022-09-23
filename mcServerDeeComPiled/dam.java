import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class dam extends cxk {
   public static final Codec<dam> e = RecordCodecBuilder.create(
      $$0 -> a($$0).and(djf.a.fieldOf("settings").forGetter(dam::h)).apply($$0, $$0.stable(dam::new))
   );
   private final djf f;

   public dam(hm<dlh> $$0, djf $$1) {
      super($$0, $$1.c(), new cie($$1.d()), ad.a($$1::a));
      this.f = $$1;
   }

   @Override
   protected Codec<? extends cxk> b() {
      return e;
   }

   public djf h() {
      return this.f;
   }

   @Override
   public void a(agn $$0, cho $$1, dbf $$2, cxj $$3) {
   }

   @Override
   public int a(cgz $$0) {
      return $$0.u_() + Math.min($$0.v_(), this.f.f().size());
   }

   @Override
   public CompletableFuture<cxj> a(Executor $$0, dbr $$1, dbf $$2, cho $$3, cxj $$4) {
      List<cvo> $$5 = this.f.f();
      gt.a $$6 = new gt.a();
      dar $$7 = $$4.a(dar.a.c);
      dar $$8 = $$4.a(dar.a.a);

      for(int $$9 = 0; $$9 < Math.min($$4.v_(), $$5.size()); ++$$9) {
         cvo $$10 = (cvo)$$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.u_() + $$9;

            for(int $$12 = 0; $$12 < 16; ++$$12) {
               for(int $$13 = 0; $$13 < 16; ++$$13) {
                  $$4.a($$6.d($$12, $$11, $$13), $$10, false);
                  $$7.a($$12, $$11, $$13, $$10);
                  $$8.a($$12, $$11, $$13, $$10);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dar.a $$2, cgz $$3, dbf $$4) {
      List<cvo> $$5 = this.f.f();

      for(int $$6 = Math.min($$5.size(), $$3.ah()) - 1; $$6 >= 0; --$$6) {
         cvo $$7 = (cvo)$$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.u_() + $$6 + 1;
         }
      }

      return $$3.u_();
   }

   @Override
   public chj a(int $$0, int $$1, cgz $$2, dbf $$3) {
      return new chj($$2.u_(), (cvo[])this.f.f().stream().limit((long)$$2.v_()).map($$0x -> $$0x == null ? cju.a.m() : $$0x).toArray($$0x -> new cvo[$$0x]));
   }

   @Override
   public void a(List<String> $$0, dbf $$1, gt $$2) {
   }

   @Override
   public void a(agn $$0, long $$1, dbf $$2, chv $$3, cho $$4, cxj $$5, dan.a $$6) {
   }

   @Override
   public void a(agn $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return -63;
   }
}
