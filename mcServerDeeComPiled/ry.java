import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class ry {
   private static final int a = Integer.MIN_VALUE;
   private rw b = rw.a;
   private final ObjectList<rw.a> c = new ObjectArrayList();

   public void a(rw.a $$0) {
      this.c.add($$0);
   }

   public int a() {
      return this.c.size();
   }

   private boolean a(rw $$0) {
      Set<UUID> $$1 = new HashSet($$0.a().size());

      for(rw.a $$2 : $$0.a()) {
         if (!$$1.add($$2.a())) {
            return true;
         }
      }

      return false;
   }

   private int a(List<rw.a> $$0, int[] $$1, @Nullable rw.a $$2) {
      Arrays.fill($$1, Integer.MIN_VALUE);
      List<rw.a> $$3 = this.b.a();
      int $$4 = $$3.size();

      for(int $$5 = $$4 - 1; $$5 >= 0; --$$5) {
         int $$6 = $$0.indexOf($$3.get($$5));
         if ($$6 != -1) {
            $$1[$$6] = -$$5 - 1;
         }
      }

      int $$7 = Integer.MIN_VALUE;
      int $$8 = this.c.size();

      for(int $$9 = 0; $$9 < $$8; ++$$9) {
         rw.a $$10 = (rw.a)this.c.get($$9);
         int $$11 = $$0.indexOf($$10);
         if ($$11 != -1) {
            $$1[$$11] = $$9;
         }

         if ($$10.equals($$2)) {
            $$7 = $$9;
         }
      }

      return $$7;
   }

   public Set<ry.a> a(rw.b $$0) {
      EnumSet<ry.a> $$1 = EnumSet.noneOf(ry.a.class);
      rw $$2 = $$0.a();
      rw.a $$3 = (rw.a)$$0.b().orElse(null);
      List<rw.a> $$4 = $$2.a();
      int $$5 = this.b.a().size();
      int $$6 = Integer.MIN_VALUE;
      int $$7 = $$4.size();
      if ($$7 < $$5) {
         $$1.add(ry.a.d);
      }

      int[] $$8 = new int[$$7];
      int $$9 = this.a($$4, $$8, $$3);

      for(int $$10 = $$7 - 1; $$10 >= 0; --$$10) {
         int $$11 = $$8[$$10];
         if ($$11 != Integer.MIN_VALUE) {
            if ($$11 < $$6) {
               $$1.add(ry.a.a);
            } else {
               $$6 = $$11;
            }
         } else {
            $$1.add(ry.a.c);
         }
      }

      if ($$3 != null) {
         if ($$9 != Integer.MIN_VALUE && $$9 >= $$6) {
            $$6 = $$9;
         } else {
            $$1.add(ry.a.c);
         }
      }

      if ($$6 >= 0) {
         this.c.removeElements(0, $$6 + 1);
      }

      if (this.a($$2)) {
         $$1.add(ry.a.b);
      }

      this.b = $$2;
      return $$1;
   }

   public static enum a {
      a("messages received out of order"),
      b("multiple entries for single profile"),
      c("unknown message"),
      d("previously present messages removed from context");

      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }
   }
}
