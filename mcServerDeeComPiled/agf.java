import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class agf {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 1;
   private final agg c;
   private final bbn d;
   private final int e;
   private final boolean f;
   private final Consumer<tc<?>> g;
   private final zk h = new zk();
   private int i;
   private int j;
   private int k;
   private dwq l = dwq.b;
   private int m;
   private int n;
   private List<bbn> o = Collections.emptyList();
   private boolean p;
   private boolean q;

   public agf(agg $$0, bbn $$1, int $$2, boolean $$3, Consumer<tc<?>> $$4) {
      this.c = $$0;
      this.g = $$4;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h.e($$1.cZ());
      this.i = ami.d($$1.dq() * 256.0F / 360.0F);
      this.j = ami.d($$1.ds() * 256.0F / 360.0F);
      this.k = ami.d($$1.cg() * 256.0F / 360.0F);
      this.q = $$1.aw();
   }

   public void a() {
      List<bbn> $$0 = this.d.cI();
      if (!$$0.equals(this.o)) {
         this.o = $$0;
         this.g.accept(new wp(this.d));
      }

      bbn $$11 = this.d;
      if ($$11 instanceof bqo $$1 && this.m % 10 == 0) {
         cax $$2 = $$1.x();
         if ($$2.c() instanceof cbd) {
            Integer $$3 = cbd.d($$2);
            drg $$4 = cbd.a($$3, this.c);
            if ($$4 != null) {
               for(agh $$5 : this.c.w()) {
                  $$4.a($$5, $$2);
                  tc<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.b.a($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.m % this.e == 0 || this.d.af || this.d.ai().a()) {
         if (this.d.bI()) {
            int $$7 = ami.d(this.d.dq() * 256.0F / 360.0F);
            int $$8 = ami.d(this.d.ds() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.i) >= 1 || Math.abs($$8 - this.j) >= 1;
            if ($$9) {
               this.g.accept(new uw.c(this.d.ae(), (byte)$$7, (byte)$$8, this.d.aw()));
               this.i = $$7;
               this.j = $$8;
            }

            this.h.e(this.d.cZ());
            this.b();
            this.p = true;
         } else {
            ++this.n;
            int $$10 = ami.d(this.d.dq() * 256.0F / 360.0F);
            int $$11 = ami.d(this.d.ds() * 256.0F / 360.0F);
            dwq $$12 = this.d.cZ();
            boolean $$13 = this.h.d($$12).g() >= 7.6293945E-6F;
            tc<?> $$14 = null;
            boolean $$15 = $$13 || this.m % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.i) >= 1 || Math.abs($$11 - this.j) >= 1;
            if (this.m > 0 || this.d instanceof bui) {
               long $$17 = this.h.a($$12);
               long $$18 = this.h.b($$12);
               long $$19 = this.h.c($$12);
               boolean $$20 = $$17 < -32768L || $$17 > 32767L || $$18 < -32768L || $$18 > 32767L || $$19 < -32768L || $$19 > 32767L;
               if ($$20 || this.n > 400 || this.p || this.q != this.d.aw()) {
                  this.q = this.d.aw();
                  this.n = 0;
                  $$14 = new xe(this.d);
               } else if ((!$$15 || !$$16) && !(this.d instanceof bui)) {
                  if ($$15) {
                     $$14 = new uw.a(this.d.ae(), (short)((int)$$17), (short)((int)$$18), (short)((int)$$19), this.d.aw());
                  } else if ($$16) {
                     $$14 = new uw.c(this.d.ae(), (byte)$$10, (byte)$$11, this.d.aw());
                  }
               } else {
                  $$14 = new uw.b(this.d.ae(), (short)((int)$$17), (short)((int)$$18), (short)((int)$$19), (byte)$$10, (byte)$$11, this.d.aw());
               }
            }

            if ((this.f || this.d.af || this.d instanceof bcc && ((bcc)this.d).fc()) && this.m > 0) {
               dwq $$21 = this.d.dd();
               double $$22 = $$21.g(this.l);
               if ($$22 > 1.0E-7 || $$22 > 0.0 && $$21.g() == 0.0) {
                  this.l = $$21;
                  this.g.accept(new wk(this.d.ae(), this.l));
               }
            }

            if ($$14 != null) {
               this.g.accept($$14);
            }

            this.b();
            if ($$15) {
               this.h.e($$12);
            }

            if ($$16) {
               this.i = $$10;
               this.j = $$11;
            }

            this.p = false;
         }

         int $$23 = ami.d(this.d.cg() * 256.0F / 360.0F);
         if (Math.abs($$23 - this.k) >= 1) {
            this.g.accept(new vr(this.d, (byte)$$23));
            this.k = $$23;
         }

         this.d.af = false;
      }

      ++this.m;
      if (this.d.D) {
         this.a(new wk(this.d));
         this.d.D = false;
      }

   }

   public void a(agh $$0) {
      this.d.d($$0);
      $$0.b.a(new vn(this.d.ae()));
   }

   public void b(agh $$0) {
      this.a($$0.b::a);
      this.d.c($$0);
   }

   public void a(Consumer<tc<?>> $$0) {
      if (this.d.dt()) {
         a.warn("Fetching packet for removed entity {}", this.d);
      }

      tc<?> $$1 = this.d.S();
      this.k = ami.d(this.d.cg() * 256.0F / 360.0F);
      $$0.accept($$1);
      if (!this.d.ai().d()) {
         $$0.accept(new wi(this.d.ae(), this.d.ai(), true));
      }

      boolean $$2 = this.f;
      if (this.d instanceof bcc) {
         Collection<bcz> $$3 = ((bcc)this.d).ex().b();
         if (!$$3.isEmpty()) {
            $$0.accept(new xg(this.d.ae(), $$3));
         }

         if (((bcc)this.d).fc()) {
            $$2 = true;
         }
      }

      this.l = this.d.dd();
      if ($$2 && !(this.d instanceof bcc)) {
         $$0.accept(new wk(this.d.ae(), this.l));
      }

      if (this.d instanceof bcc) {
         List<Pair<bbs, cax>> $$4 = Lists.newArrayList();

         for(bbs $$5 : bbs.values()) {
            cax $$6 = ((bcc)this.d).c($$5);
            if (!$$6.b()) {
               $$4.add(Pair.of($$5, $$6.o()));
            }
         }

         if (!$$4.isEmpty()) {
            $$0.accept(new wl(this.d.ae(), $$4));
         }
      }

      if (this.d instanceof bcc $$7) {
         for(bbg $$8 : $$7.ec()) {
            $$0.accept(new xh(this.d.ae(), $$8));
         }
      }

      if (!this.d.cI().isEmpty()) {
         $$0.accept(new wp(this.d));
      }

      if (this.d.bI()) {
         $$0.accept(new wp(this.d.cQ()));
      }

      if (this.d instanceof bce $$9 && $$9.fy()) {
         $$0.accept(new wj($$9, $$9.fz()));
      }

   }

   private void b() {
      aam $$0 = this.d.ai();
      if ($$0.a()) {
         this.a(new wi(this.d.ae(), $$0, false));
      }

      if (this.d instanceof bcc) {
         Set<bcz> $$1 = ((bcc)this.d).ex().a();
         if (!$$1.isEmpty()) {
            this.a(new xg(this.d.ae(), $$1));
         }

         $$1.clear();
      }

   }

   private void a(tc<?> $$0) {
      this.g.accept($$0);
      if (this.d instanceof agh) {
         ((agh)this.d).b.a($$0);
      }

   }
}
