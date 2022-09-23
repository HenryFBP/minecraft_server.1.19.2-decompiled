import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class qk implements pz {
   private String a = "";
   @Nullable
   private qc b;
   private final Deque<Consumer<qc>> c = new ArrayDeque();

   @Nullable
   public qc d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(qc $$0) {
      ((Consumer)this.c.getLast()).accept($$0);
   }

   @Override
   public pz.b a() {
      this.a((qc)pl.b);
      return pz.b.a;
   }

   @Override
   public pz.b a(String $$0) {
      this.a((qc)qa.a($$0));
      return pz.b.a;
   }

   @Override
   public pz.b a(byte $$0) {
      this.a((qc)ph.a($$0));
      return pz.b.a;
   }

   @Override
   public pz.b a(short $$0) {
      this.a((qc)px.a($$0));
      return pz.b.a;
   }

   @Override
   public pz.b a(int $$0) {
      this.a((qc)po.a($$0));
      return pz.b.a;
   }

   @Override
   public pz.b a(long $$0) {
      this.a((qc)pr.a($$0));
      return pz.b.a;
   }

   @Override
   public pz.b a(float $$0) {
      this.a((qc)pm.a($$0));
      return pz.b.a;
   }

   @Override
   public pz.b a(double $$0) {
      this.a((qc)pk.a($$0));
      return pz.b.a;
   }

   @Override
   public pz.b a(byte[] $$0) {
      this.a((qc)(new pg($$0)));
      return pz.b.a;
   }

   @Override
   public pz.b a(int[] $$0) {
      this.a((qc)(new pn($$0)));
      return pz.b.a;
   }

   @Override
   public pz.b a(long[] $$0) {
      this.a((qc)(new pq($$0)));
      return pz.b.a;
   }

   @Override
   public pz.b a(qe<?> $$0, int $$1) {
      return pz.b.a;
   }

   @Override
   public pz.a b(qe<?> $$0, int $$1) {
      this.c($$0);
      return pz.a.a;
   }

   @Override
   public pz.a a(qe<?> $$0) {
      return pz.a.a;
   }

   @Override
   public pz.a a(qe<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return pz.a.a;
   }

   private void c(qe<?> $$0) {
      if ($$0 == pp.a) {
         pp $$1 = new pp();
         this.a((qc)$$1);
         this.c.addLast($$1::add);
      } else if ($$0 == pj.b) {
         pj $$2 = new pj();
         this.a((qc)$$2);
         this.c.addLast((Consumer)$$1 -> $$2.a(this.a, $$1));
      }

   }

   @Override
   public pz.b b() {
      this.c.removeLast();
      return pz.b.a;
   }

   @Override
   public pz.b b(qe<?> $$0) {
      if ($$0 == pp.a) {
         pp $$1 = new pp();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == pj.b) {
         pj $$2 = new pj();
         this.b = $$2;
         this.c.addLast((Consumer)$$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast((Consumer)$$0x -> this.b = $$0x);
      }

      return pz.b.a;
   }
}
