import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class bmt {
   private final gt a;
   private final hc<bmv> b;
   private int c;
   private final Runnable d;

   public static Codec<bmt> a(Runnable $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  gt.a.fieldOf("pos").forGetter($$0xx -> $$0xx.a),
                  aaw.a(hm.C).fieldOf("type").forGetter($$0xx -> $$0xx.b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter($$0xx -> $$0xx.c),
                  RecordCodecBuilder.point($$0)
               )
               .apply($$1, bmt::new)
      );
   }

   private bmt(gt $$0, hc<bmv> $$1, int $$2, Runnable $$3) {
      this.a = $$0.h();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public bmt(gt $$0, hc<bmv> $$1, Runnable $$2) {
      this($$0, $$1, ((bmv)$$1.a()).b(), $$2);
   }

   @Deprecated
   @ang
   public int a() {
      return this.c;
   }

   protected boolean b() {
      if (this.c <= 0) {
         return false;
      } else {
         --this.c;
         this.d.run();
         return true;
      }
   }

   protected boolean c() {
      if (this.c >= ((bmv)this.b.a()).b()) {
         return false;
      } else {
         ++this.c;
         this.d.run();
         return true;
      }
   }

   public boolean d() {
      return this.c > 0;
   }

   public boolean e() {
      return this.c != ((bmv)this.b.a()).b();
   }

   public gt f() {
      return this.a;
   }

   public hc<bmv> g() {
      return this.b;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((bmt)$$0).a) : false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }
}
