import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class cuj extends cuf implements baq {
   public static final int b = 9;
   public static final int c = 3;
   public static final int f = 27;
   public static final int i = 1;
   public static final int j = 10;
   public static final float k = 0.5F;
   public static final float l = 270.0F;
   public static final String m = "Items";
   private static final int[] q = IntStream.range(0, 27).toArray();
   private hi<cax> r = hi.a(27, cax.b);
   private int s;
   private cuj.a t = cuj.a.a;
   private float u;
   private float v;
   @Nullable
   private final bzq w;

   public cuj(@Nullable bzq $$0, gt $$1, cvo $$2) {
      super(ctk.w, $$1, $$2);
      this.w = $$0;
   }

   public cuj(gt $$0, cvo $$1) {
      super(ctk.w, $$0, $$1);
      this.w = cqj.a($$1.b());
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, cuj $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cgx $$0, gt $$1, cvo $$2) {
      this.v = this.u;
      switch(this.t) {
         case a:
            this.u = 0.0F;
            break;
         case b:
            this.u += 0.1F;
            if (this.u >= 1.0F) {
               this.t = cuj.a.c;
               this.u = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.u -= 0.1F;
            if (this.u <= 0.0F) {
               this.t = cuj.a.a;
               this.u = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.u = 1.0F;
      }

   }

   public cuj.a i() {
      return this.t;
   }

   public dwl a(cvo $$0) {
      return brw.a($$0.c(cqj.a), 0.5F * this.a(1.0F));
   }

   private void c(cgx $$0, gt $$1, cvo $$2) {
      if ($$2.b() instanceof cqj) {
         gy $$3 = $$2.c(cqj.a);
         dwl $$4 = brw.a($$3, this.v, this.u).a($$1);
         List<bbn> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for(int $$6 = 0; $$6 < $$5.size(); ++$$6) {
               bbn $$7 = (bbn)$$5.get($$6);
               if ($$7.c_() != dqb.d) {
                  $$7.a(bci.d, new dwq(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }

         }
      }
   }

   @Override
   public int b() {
      return this.r.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.s = $$1;
         if ($$1 == 0) {
            this.t = cuj.a.d;
            d(this.k(), this.o, this.q());
         }

         if ($$1 == 1) {
            this.t = cuj.a.b;
            d(this.k(), this.o, this.q());
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cgx $$0, gt $$1, cvo $$2) {
      $$2.a($$0, $$1, 3);
   }

   @Override
   public void d_(buc $$0) {
      if (!$$0.B_()) {
         if (this.s < 0) {
            this.s = 0;
         }

         ++this.s;
         this.n.a(this.o, this.q().b(), 1, this.s);
         if (this.s == 1) {
            this.n.a($$0, czv.k, this.o);
            this.n.a(null, this.o, ajw.st, ajx.e, 0.5F, this.n.w.i() * 0.1F + 0.9F);
         }
      }

   }

   @Override
   public void c_(buc $$0) {
      if (!$$0.B_()) {
         --this.s;
         this.n.a(this.o, this.q().b(), 1, this.s);
         if (this.s <= 0) {
            this.n.a($$0, czv.j, this.o);
            this.n.a(null, this.o, ajw.ss, ajx.e, 0.5F, this.n.w.i() * 0.1F + 0.9F);
         }
      }

   }

   @Override
   protected rq g() {
      return rq.c("container.shulkerBox");
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bad.a($$0, this.r, false);
      }

   }

   public void f(pj $$0) {
      this.r = hi.a(this.b(), cax.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bad.b($$0, this.r);
      }

   }

   @Override
   protected hi<cax> f() {
      return this.r;
   }

   @Override
   protected void a(hi<cax> $$0) {
      this.r = $$0;
   }

   @Override
   public int[] a(gy $$0) {
      return q;
   }

   @Override
   public boolean a(int $$0, cax $$1, @Nullable gy $$2) {
      return !(cjt.a($$1.c()) instanceof cqj);
   }

   @Override
   public boolean b(int $$0, cax $$1, gy $$2) {
      return true;
   }

   public float a(float $$0) {
      return ami.i($$0, this.v, this.u);
   }

   @Nullable
   public bzq j() {
      return this.w;
   }

   @Override
   protected bwm a(int $$0, bub $$1) {
      return new bya($$0, $$1, this);
   }

   public boolean t() {
      return this.t == cuj.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
