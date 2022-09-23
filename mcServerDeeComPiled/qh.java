import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.bytes.ByteCollection;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class qh implements qg {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 8;
   private static final ByteCollection c = new ByteOpenHashSet(Arrays.asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
   private static final p d = p.l;
   private static final p e = p.k;
   private static final p f = p.g;
   private static final p g = p.m;
   private static final Pattern h = Pattern.compile("[A-Za-z0-9._+-]+");
   private static final String i = String.valueOf(':');
   private static final String j = String.valueOf(',');
   private static final String k = "[";
   private static final String l = "]";
   private static final String m = ";";
   private static final String n = " ";
   private static final String o = "{";
   private static final String p = "}";
   private static final String q = "\n";
   private final String r;
   private final int s;
   private rq t = rp.a;

   public qh(String $$0, int $$1) {
      this.r = $$0;
      this.s = $$1;
   }

   public rq a(qc $$0) {
      $$0.a(this);
      return this.t;
   }

   @Override
   public void a(qa $$0) {
      String $$1 = qa.b($$0.e_());
      String $$2 = $$1.substring(0, 1);
      rq $$3 = rq.b($$1.substring(1, $$1.length() - 1)).a(e);
      this.t = rq.b($$2).b($$3).f($$2);
   }

   @Override
   public void a(ph $$0) {
      rq $$1 = rq.b("b").a(g);
      this.t = rq.b(String.valueOf($$0.k())).b($$1).a(f);
   }

   @Override
   public void a(px $$0) {
      rq $$1 = rq.b("s").a(g);
      this.t = rq.b(String.valueOf($$0.k())).b($$1).a(f);
   }

   @Override
   public void a(po $$0) {
      this.t = rq.b(String.valueOf($$0.k())).a(f);
   }

   @Override
   public void a(pr $$0) {
      rq $$1 = rq.b("L").a(g);
      this.t = rq.b(String.valueOf($$0.k())).b($$1).a(f);
   }

   @Override
   public void a(pm $$0) {
      rq $$1 = rq.b("f").a(g);
      this.t = rq.b(String.valueOf($$0.j())).b($$1).a(f);
   }

   @Override
   public void a(pk $$0) {
      rq $$1 = rq.b("d").a(g);
      this.t = rq.b(String.valueOf($$0.i())).b($$1).a(f);
   }

   @Override
   public void a(pg $$0) {
      rq $$1 = rq.b("B").a(g);
      sb $$2 = rq.b("[").b($$1).f(";");
      byte[] $$3 = $$0.d();

      for(int $$4 = 0; $$4 < $$3.length; ++$$4) {
         sb $$5 = rq.b(String.valueOf($$3[$$4])).a(f);
         $$2.f(" ").b($$5).b($$1);
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(pn $$0) {
      rq $$1 = rq.b("I").a(g);
      sb $$2 = rq.b("[").b($$1).f(";");
      int[] $$3 = $$0.f();

      for(int $$4 = 0; $$4 < $$3.length; ++$$4) {
         $$2.f(" ").b(rq.b(String.valueOf($$3[$$4])).a(f));
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(pq $$0) {
      rq $$1 = rq.b("L").a(g);
      sb $$2 = rq.b("[").b($$1).f(";");
      long[] $$3 = $$0.f();

      for(int $$4 = 0; $$4 < $$3.length; ++$$4) {
         rq $$5 = rq.b(String.valueOf($$3[$$4])).a(f);
         $$2.f(" ").b($$5).b($$1);
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(pp $$0) {
      if ($$0.isEmpty()) {
         this.t = rq.b("[]");
      } else if (c.contains($$0.e()) && $$0.size() <= 8) {
         String $$1 = j + " ";
         sb $$2 = rq.b("[");

         for(int $$3 = 0; $$3 < $$0.size(); ++$$3) {
            if ($$3 != 0) {
               $$2.f($$1);
            }

            $$2.b(new qh(this.r, this.s).a($$0.k($$3)));
         }

         $$2.f("]");
         this.t = $$2;
      } else {
         sb $$4 = rq.b("[");
         if (!this.r.isEmpty()) {
            $$4.f("\n");
         }

         for(int $$5 = 0; $$5 < $$0.size(); ++$$5) {
            sb $$6 = rq.b(Strings.repeat(this.r, this.s + 1));
            $$6.b(new qh(this.r, this.s + 1).a($$0.k($$5)));
            if ($$5 != $$0.size() - 1) {
               $$6.f(j).f(this.r.isEmpty() ? " " : "\n");
            }

            $$4.b($$6);
         }

         if (!this.r.isEmpty()) {
            $$4.f("\n").f(Strings.repeat(this.r, this.s));
         }

         $$4.f("]");
         this.t = $$4;
      }
   }

   @Override
   public void a(pj $$0) {
      if ($$0.f()) {
         this.t = rq.b("{}");
      } else {
         sb $$1 = rq.b("{");
         Collection<String> $$2 = $$0.d();
         if (a.isDebugEnabled()) {
            List<String> $$3 = Lists.newArrayList($$0.d());
            Collections.sort($$3);
            $$2 = $$3;
         }

         if (!this.r.isEmpty()) {
            $$1.f("\n");
         }

         sb $$6;
         for(Iterator<String> $$4 = $$2.iterator(); $$4.hasNext(); $$1.b($$6)) {
            String $$5 = (String)$$4.next();
            $$6 = rq.b(Strings.repeat(this.r, this.s + 1)).b(a($$5)).f(i).f(" ").b(new qh(this.r, this.s + 1).a($$0.c($$5)));
            if ($$4.hasNext()) {
               $$6.f(j).f(this.r.isEmpty() ? " " : "\n");
            }
         }

         if (!this.r.isEmpty()) {
            $$1.f("\n").f(Strings.repeat(this.r, this.s));
         }

         $$1.f("}");
         this.t = $$1;
      }
   }

   protected static rq a(String $$0) {
      if (h.matcher($$0).matches()) {
         return rq.b($$0).a(d);
      } else {
         String $$1 = qa.b($$0);
         String $$2 = $$1.substring(0, 1);
         rq $$3 = rq.b($$1.substring(1, $$1.length() - 1)).a(d);
         return rq.b($$2).b($$3).f($$2);
      }
   }

   @Override
   public void a(pl $$0) {
      this.t = rp.a;
   }
}
