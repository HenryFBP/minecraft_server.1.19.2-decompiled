import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class dql {
   private final List<dqj> a;
   private dqj[] b = new dqj[0];
   private dqj[] c = new dqj[0];
   @Nullable
   private Set<dqp> d;
   private int e;
   private final gt f;
   private final float g;
   private final boolean h;

   public dql(List<dqj> $$0, gt $$1, boolean $$2) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$0.isEmpty() ? Float.MAX_VALUE : ((dqj)this.a.get(this.a.size() - 1)).c(this.f);
      this.h = $$2;
   }

   public void a() {
      ++this.e;
   }

   public boolean b() {
      return this.e <= 0;
   }

   public boolean c() {
      return this.e >= this.a.size();
   }

   @Nullable
   public dqj d() {
      return !this.a.isEmpty() ? (dqj)this.a.get(this.a.size() - 1) : null;
   }

   public dqj a(int $$0) {
      return (dqj)this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }

   }

   public void a(int $$0, dqj $$1) {
      this.a.set($$0, $$1);
   }

   public int e() {
      return this.a.size();
   }

   public int f() {
      return this.e;
   }

   public void c(int $$0) {
      this.e = $$0;
   }

   public dwq a(bbn $$0, int $$1) {
      dqj $$2 = (dqj)this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.cW() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.cW() + 1.0F)) * 0.5;
      return new dwq($$3, $$4, $$5);
   }

   public gt d(int $$0) {
      return ((dqj)this.a.get($$0)).a();
   }

   public dwq a(bbn $$0) {
      return this.a($$0, this.e);
   }

   public gt g() {
      return ((dqj)this.a.get(this.e)).a();
   }

   public dqj h() {
      return (dqj)this.a.get(this.e);
   }

   @Nullable
   public dqj i() {
      return this.e > 0 ? (dqj)this.a.get(this.e - 1) : null;
   }

   public boolean a(@Nullable dql $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for(int $$1 = 0; $$1 < this.a.size(); ++$$1) {
            dqj $$2 = (dqj)this.a.get($$1);
            dqj $$3 = (dqj)$$0.a.get($$1);
            if ($$2.a != $$3.a || $$2.b != $$3.b || $$2.c != $$3.c) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean j() {
      return this.h;
   }

   @ang
   void a(dqj[] $$0, dqj[] $$1, Set<dqp> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @ang
   public dqj[] k() {
      return this.b;
   }

   @ang
   public dqj[] l() {
      return this.c;
   }

   public void a(qx $$0) {
      if (this.d != null && !this.d.isEmpty()) {
         $$0.writeBoolean(this.h);
         $$0.writeInt(this.e);
         $$0.writeInt(this.d.size());
         this.d.forEach($$1x -> $$1x.a($$0));
         $$0.writeInt(this.f.u());
         $$0.writeInt(this.f.v());
         $$0.writeInt(this.f.w());
         $$0.writeInt(this.a.size());

         for(dqj $$1 : this.a) {
            $$1.a($$0);
         }

         $$0.writeInt(this.b.length);

         for(dqj $$2 : this.b) {
            $$2.a($$0);
         }

         $$0.writeInt(this.c.length);

         for(dqj $$3 : this.c) {
            $$3.a($$0);
         }

      }
   }

   public static dql b(qx $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      int $$3 = $$0.readInt();
      Set<dqp> $$4 = Sets.newHashSet();

      for(int $$5 = 0; $$5 < $$3; ++$$5) {
         $$4.add(dqp.c($$0));
      }

      gt $$6 = new gt($$0.readInt(), $$0.readInt(), $$0.readInt());
      List<dqj> $$7 = Lists.newArrayList();
      int $$8 = $$0.readInt();

      for(int $$9 = 0; $$9 < $$8; ++$$9) {
         $$7.add(dqj.b($$0));
      }

      dqj[] $$10 = new dqj[$$0.readInt()];

      for(int $$11 = 0; $$11 < $$10.length; ++$$11) {
         $$10[$$11] = dqj.b($$0);
      }

      dqj[] $$12 = new dqj[$$0.readInt()];

      for(int $$13 = 0; $$13 < $$12.length; ++$$13) {
         $$12[$$13] = dqj.b($$0);
      }

      dql $$14 = new dql($$7, $$6, $$1);
      $$14.b = $$10;
      $$14.c = $$12;
      $$14.d = $$4;
      $$14.e = $$2;
      return $$14;
   }

   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public gt m() {
      return this.f;
   }

   public float n() {
      return this.g;
   }
}
