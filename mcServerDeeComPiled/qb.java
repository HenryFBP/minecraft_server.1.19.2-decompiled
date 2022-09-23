import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class qb implements qg {
   private static final Pattern a = Pattern.compile("[A-Za-z0-9._+-]+");
   private final StringBuilder b = new StringBuilder();

   public String a(qc $$0) {
      $$0.a(this);
      return this.b.toString();
   }

   @Override
   public void a(qa $$0) {
      this.b.append(qa.b($$0.e_()));
   }

   @Override
   public void a(ph $$0) {
      this.b.append($$0.k()).append('b');
   }

   @Override
   public void a(px $$0) {
      this.b.append($$0.k()).append('s');
   }

   @Override
   public void a(po $$0) {
      this.b.append($$0.k());
   }

   @Override
   public void a(pr $$0) {
      this.b.append($$0.k()).append('L');
   }

   @Override
   public void a(pm $$0) {
      this.b.append($$0.j()).append('f');
   }

   @Override
   public void a(pk $$0) {
      this.b.append($$0.i()).append('d');
   }

   @Override
   public void a(pg $$0) {
      this.b.append("[B;");
      byte[] $$1 = $$0.d();

      for(int $$2 = 0; $$2 < $$1.length; ++$$2) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]).append('B');
      }

      this.b.append(']');
   }

   @Override
   public void a(pn $$0) {
      this.b.append("[I;");
      int[] $$1 = $$0.f();

      for(int $$2 = 0; $$2 < $$1.length; ++$$2) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]);
      }

      this.b.append(']');
   }

   @Override
   public void a(pq $$0) {
      this.b.append("[L;");
      long[] $$1 = $$0.f();

      for(int $$2 = 0; $$2 < $$1.length; ++$$2) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]).append('L');
      }

      this.b.append(']');
   }

   @Override
   public void a(pp $$0) {
      this.b.append('[');

      for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
         if ($$1 != 0) {
            this.b.append(',');
         }

         this.b.append(new qb().a($$0.k($$1)));
      }

      this.b.append(']');
   }

   @Override
   public void a(pj $$0) {
      this.b.append('{');
      List<String> $$1 = Lists.newArrayList($$0.d());
      Collections.sort($$1);

      for(String $$2 : $$1) {
         if (this.b.length() != 1) {
            this.b.append(',');
         }

         this.b.append(a($$2)).append(':').append(new qb().a($$0.c($$2)));
      }

      this.b.append('}');
   }

   protected static String a(String $$0) {
      return a.matcher($$0).matches() ? $$0 : qa.b($$0);
   }

   @Override
   public void a(pl $$0) {
      this.b.append("END");
   }
}
