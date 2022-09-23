import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bos extends bdo<boq> {
   public static final int a = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final ajv l;
   private final ajv m;
   private dwq n;
   private bos.a o = bos.a.d;

   public bos(ajv $$0, ajv $$1) {
      super(ImmutableMap.of(bku.m, bkv.b, bku.n, bkv.c, bku.o, bkv.a, bku.X, bkv.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(agg $$0, boq $$1) {
      bcc $$2 = (bcc)$$1.dy().c(bku.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dy().b(bku.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ak() != bco.i && boq.k($$2);
   }

   protected boolean a(agg $$0, boq $$1, long $$2) {
      return $$1.dy().a(bku.o) && this.o != bos.a.d && !$$1.dy().a(bku.X);
   }

   protected void b(agg $$0, boq $$1, long $$2) {
      bcc $$3 = (bcc)$$1.dy().c(bku.o).get();
      bdp.a($$1, $$3);
      $$1.a($$3);
      $$1.dy().a(bku.m, new bkx($$3.cY(), 2.0F, 0));
      this.k = 10;
      this.o = bos.a.a;
   }

   protected void c(agg $$0, boq $$1, long $$2) {
      $$1.dy().b(bku.o);
      $$1.q();
      $$1.b(bco.a);
   }

   private void b(agg $$0, boq $$1) {
      $$0.a(null, $$1, this.m, ajx.g, 2.0F, 1.0F);
      Optional<bbn> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bbn $$3 = (bbn)$$2.get();
         if ($$3.bo()) {
            $$1.z($$3);
            if (!$$3.bo()) {
               $$3.a(bbn.c.a);
            }
         }
      }

   }

   protected void d(agg $$0, boq $$1, long $$2) {
      bcc $$3 = (bcc)$$1.dy().c(bku.o).get();
      $$1.a($$3);
      switch(this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, ajx.g, 2.0F, 1.0F);
               $$1.b(bco.j);
               $$3.f($$3.cY().a($$1.cY()).d().a(0.75));
               this.n = $$3.cY();
               this.j = 0;
               this.o = bos.a.b;
            } else if (this.k <= 0) {
               $$1.dy().a(bku.m, new bkx($$3.cY(), 2.0F, 0));
               this.k = 10;
            } else {
               --this.k;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bos.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bos.a.d;
            } else {
               ++this.j;
            }
         case d:
      }

   }

   private boolean a(boq $$0, bcc $$1) {
      dql $$2 = $$0.D().a($$1, 0);
      return $$2 != null && $$2.n() < 1.75F;
   }

   private void b(boq $$0, bcc $$1) {
      List<UUID> $$2 = (List)$$0.dy().c(bku.Y).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.co());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.co());
      }

      $$0.dy().a(bku.Y, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
