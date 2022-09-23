import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dai extends cxk {
   public static final Codec<dai> e = RecordCodecBuilder.create($$0 -> a($$0).and(aay.b(hm.aR).forGetter($$0x -> $$0x.n)).apply($$0, $$0.stable(dai::new)));
   private static final int j = 2;
   private static final List<cvo> k = (List<cvo>)StreamSupport.stream(hm.V.spliterator(), false)
      .flatMap($$0 -> $$0.k().a().stream())
      .collect(Collectors.toList());
   private static final int l = ami.f(ami.c((float)k.size()));
   private static final int m = ami.f((float)k.size() / (float)l);
   protected static final cvo f = cju.a.m();
   protected static final cvo g = cju.gU.m();
   public static final int h = 70;
   public static final int i = 60;
   private final hm<cht> n;

   public dai(hm<dlh> $$0, hm<cht> $$1) {
      super($$0, Optional.empty(), new cie($$1.c(cia.b)));
      this.n = $$1;
   }

   public hm<cht> h() {
      return this.n;
   }

   @Override
   protected Codec<? extends cxk> b() {
      return e;
   }

   @Override
   public void a(agn $$0, cho $$1, dbf $$2, cxj $$3) {
   }

   @Override
   public void a(chp $$0, cxj $$1, cho $$2) {
      gt.a $$3 = new gt.a();
      cge $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for(int $$7 = 0; $$7 < 16; ++$$7) {
         for(int $$8 = 0; $$8 < 16; ++$$8) {
            int $$9 = hq.a($$5, $$7);
            int $$10 = hq.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), g, 2);
            cvo $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }

   }

   @Override
   public CompletableFuture<cxj> a(Executor $$0, dbr $$1, dbf $$2, cho $$3, cxj $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dar.a $$2, cgz $$3, dbf $$4) {
      return 0;
   }

   @Override
   public chj a(int $$0, int $$1, cgz $$2, dbf $$3) {
      return new chj(0, new cvo[0]);
   }

   @Override
   public void a(List<String> $$0, dbf $$1, gt $$2) {
   }

   public static cvo a(int $$0, int $$1) {
      cvo $$2 = f;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= l && $$1 <= m) {
            int $$3 = ami.a($$0 * l + $$1);
            if ($$3 < k.size()) {
               $$2 = (cvo)k.get($$3);
            }
         }
      }

      return $$2;
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
      return 63;
   }
}
