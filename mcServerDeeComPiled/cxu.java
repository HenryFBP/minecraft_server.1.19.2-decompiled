import java.util.function.Predicate;

public class cxu {
   public static final int a = 16;
   public static final int b = 16;
   public static final int c = 4096;
   public static final int d = 2;
   private final int e;
   private short f;
   private short g;
   private short h;
   private final cya<cvo> i;
   private cyb<hc<cht>> j;

   public cxu(int $$0, cya<cvo> $$1, cyb<hc<cht>> $$2) {
      this.e = a($$0);
      this.i = $$1;
      this.j = $$2;
      this.h();
   }

   public cxu(int $$0, hm<cht> $$1) {
      this.e = a($$0);
      this.i = new cya<>(cjt.o, cju.a.m(), cya.d.d);
      this.j = new cya<>($$1.s(), $$1.h(cia.b), cya.d.e);
   }

   public static int a(int $$0) {
      return $$0 << 4;
   }

   public cvo a(int $$0, int $$1, int $$2) {
      return this.i.a($$0, $$1, $$2);
   }

   public dpv b(int $$0, int $$1, int $$2) {
      return this.i.a($$0, $$1, $$2).p();
   }

   public void a() {
      this.i.a();
   }

   public void b() {
      this.i.b();
   }

   public cvo a(int $$0, int $$1, int $$2, cvo $$3) {
      return this.a($$0, $$1, $$2, $$3, true);
   }

   public cvo a(int $$0, int $$1, int $$2, cvo $$3, boolean $$4) {
      cvo $$5;
      if ($$4) {
         $$5 = this.i.a($$0, $$1, $$2, $$3);
      } else {
         $$5 = this.i.b($$0, $$1, $$2, $$3);
      }

      dpv $$7 = $$5.p();
      dpv $$8 = $$3.p();
      if (!$$5.h()) {
         --this.f;
         if ($$5.q()) {
            --this.g;
         }
      }

      if (!$$7.c()) {
         --this.h;
      }

      if (!$$3.h()) {
         ++this.f;
         if ($$3.q()) {
            ++this.g;
         }
      }

      if (!$$8.c()) {
         ++this.h;
      }

      return $$5;
   }

   public boolean c() {
      return this.f == 0;
   }

   public boolean d() {
      return this.e() || this.f();
   }

   public boolean e() {
      return this.g > 0;
   }

   public boolean f() {
      return this.h > 0;
   }

   public int g() {
      return this.e;
   }

   public void h() {
      class a implements cya.b<cvo> {
         public int a;
         public int b;
         public int c;

         public void a(cvo $$0, int $$1) {
            dpv $$2 = $$0.p();
            if (!$$0.h()) {
               this.a += $$1;
               if ($$0.q()) {
                  this.b += $$1;
               }
            }

            if (!$$2.c()) {
               this.a += $$1;
               if ($$2.f()) {
                  this.c += $$1;
               }
            }

         }
      }

      a $$0 = new a();
      this.i.a($$0);
      this.f = (short)$$0.a;
      this.g = (short)$$0.b;
      this.h = (short)$$0.c;
   }

   public cya<cvo> i() {
      return this.i;
   }

   public cyb<hc<cht>> j() {
      return this.j;
   }

   public void a(qx $$0) {
      this.f = $$0.readShort();
      this.i.a($$0);
      cya<hc<cht>> $$1 = this.j.e();
      $$1.a($$0);
      this.j = $$1;
   }

   public void b(qx $$0) {
      $$0.writeShort(this.f);
      this.i.b($$0);
      this.j.b($$0);
   }

   public int k() {
      return 2 + this.i.c() + this.j.c();
   }

   public boolean a(Predicate<cvo> $$0) {
      return this.i.a($$0);
   }

   public hc<cht> c(int $$0, int $$1, int $$2) {
      return this.j.a($$0, $$1, $$2);
   }

   public void a(chw $$0, cic.f $$1, int $$2, int $$3) {
      cya<hc<cht>> $$4 = this.j.e();
      int $$5 = hl.a(this.g());
      int $$6 = 4;

      for(int $$7 = 0; $$7 < 4; ++$$7) {
         for(int $$8 = 0; $$8 < 4; ++$$8) {
            for(int $$9 = 0; $$9 < 4; ++$$9) {
               $$4.b($$7, $$8, $$9, $$0.getNoiseBiome($$2 + $$7, $$5 + $$8, $$3 + $$9, $$1));
            }
         }
      }

      this.j = $$4;
   }
}
