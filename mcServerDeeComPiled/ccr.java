import java.util.List;
import javax.annotation.Nullable;

public class ccr extends cat {
   public static final int a = 16;
   public static final int b = 32;
   public static final int c = 1024;
   public static final int d = 32767;
   public static final int e = 100;
   public static final int f = 2;
   public static final String g = "title";
   public static final String h = "filtered_title";
   public static final String i = "author";
   public static final String j = "pages";
   public static final String r = "filtered_pages";
   public static final String s = "generation";
   public static final String t = "resolved";

   public ccr(cat.a $$0) {
      super($$0);
   }

   public static boolean a(@Nullable pj $$0) {
      if (!ccq.a($$0)) {
         return false;
      } else if (!$$0.b("title", 8)) {
         return false;
      } else {
         String $$1 = $$0.l("title");
         return $$1.length() > 32 ? false : $$0.b("author", 8);
      }
   }

   public static int d(cax $$0) {
      return $$0.u().h("generation");
   }

   public static int k(cax $$0) {
      pj $$1 = $$0.u();
      return $$1 != null ? $$1.c("pages", 8).size() : 0;
   }

   @Override
   public rq m(cax $$0) {
      pj $$1 = $$0.u();
      if ($$1 != null) {
         String $$2 = $$1.l("title");
         if (!amx.b($$2)) {
            return rq.b($$2);
         }
      }

      return super.m($$0);
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      if ($$0.t()) {
         pj $$4 = $$0.u();
         String $$5 = $$4.l("author");
         if (!amx.b($$5)) {
            $$2.add(rq.a("book.byAuthor", $$5).a(p.h));
         }

         $$2.add(rq.c("book.generation." + $$4.h("generation")).a(p.h));
      }

   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      if ($$3.a(cju.mL)) {
         return cnu.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? baj.a($$1.y) : baj.d;
      } else {
         return baj.d;
      }
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(akg.c.b(this));
      return bak.a($$3, $$0.k_());
   }

   public static boolean a(cax $$0, @Nullable dr $$1, @Nullable buc $$2) {
      pj $$3 = $$0.u();
      if ($$3 != null && !$$3.q("resolved")) {
         $$3.a("resolved", true);
         if (!a($$3)) {
            return false;
         } else {
            pp $$4 = $$3.c("pages", 8);
            pp $$5 = new pp();

            for(int $$6 = 0; $$6 < $$4.size(); ++$$6) {
               String $$7 = a($$1, $$2, $$4.j($$6));
               if ($$7.length() > 32767) {
                  return false;
               }

               $$5.c($$6, qa.a($$7));
            }

            if ($$3.b("filtered_pages", 10)) {
               pj $$8 = $$3.p("filtered_pages");
               pj $$9 = new pj();

               for(String $$10 : $$8.d()) {
                  String $$11 = a($$1, $$2, $$8.l($$10));
                  if ($$11.length() > 32767) {
                     return false;
                  }

                  $$9.a($$10, $$11);
               }

               $$3.a("filtered_pages", (qc)$$9);
            }

            $$3.a("pages", (qc)$$5);
            return true;
         }
      } else {
         return false;
      }
   }

   private static String a(@Nullable dr $$0, @Nullable buc $$1, String $$2) {
      rq $$5;
      try {
         $$5 = rq.a.b($$2);
         $$5 = rs.a($$0, $$5, $$1, 0);
      } catch (Exception var5) {
         $$5 = rq.b($$2);
      }

      return rq.a.a($$5);
   }

   @Override
   public boolean i(cax $$0) {
      return true;
   }
}
