import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import java.util.regex.Pattern;

public class qd {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(rq.c("argument.nbt.expected.value"));
   public static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> rq.a("argument.nbt.list.mixed", $$0, $$1));
   public static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> rq.a("argument.nbt.array.mixed", $$0, $$1));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> rq.a("argument.nbt.array.invalid", $$0));
   public static final char g = ',';
   public static final char h = ':';
   private static final char i = '[';
   private static final char j = ']';
   private static final char k = '}';
   private static final char l = '{';
   private static final Pattern m = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
   private static final Pattern n = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
   private static final Pattern o = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
   private static final Pattern p = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
   private static final Pattern q = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
   private static final Pattern r = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
   private static final Pattern s = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
   private final StringReader t;

   public static pj a(String $$0) throws CommandSyntaxException {
      return new qd(new StringReader($$0)).a();
   }

   @VisibleForTesting
   pj a() throws CommandSyntaxException {
      pj $$0 = this.f();
      this.t.skipWhitespace();
      if (this.t.canRead()) {
         throw a.createWithContext(this.t);
      } else {
         return $$0;
      }
   }

   public qd(StringReader $$0) {
      this.t = $$0;
   }

   protected String b() throws CommandSyntaxException {
      this.t.skipWhitespace();
      if (!this.t.canRead()) {
         throw b.createWithContext(this.t);
      } else {
         return this.t.readString();
      }
   }

   protected qc c() throws CommandSyntaxException {
      this.t.skipWhitespace();
      int $$0 = this.t.getCursor();
      if (StringReader.isQuotedStringStart(this.t.peek())) {
         return qa.a(this.t.readQuotedString());
      } else {
         String $$1 = this.t.readUnquotedString();
         if ($$1.isEmpty()) {
            this.t.setCursor($$0);
            throw c.createWithContext(this.t);
         } else {
            return this.b($$1);
         }
      }
   }

   private qc b(String $$0) {
      try {
         if (o.matcher($$0).matches()) {
            return pm.a(Float.parseFloat($$0.substring(0, $$0.length() - 1)));
         }

         if (p.matcher($$0).matches()) {
            return ph.a(Byte.parseByte($$0.substring(0, $$0.length() - 1)));
         }

         if (q.matcher($$0).matches()) {
            return pr.a(Long.parseLong($$0.substring(0, $$0.length() - 1)));
         }

         if (r.matcher($$0).matches()) {
            return px.a(Short.parseShort($$0.substring(0, $$0.length() - 1)));
         }

         if (s.matcher($$0).matches()) {
            return po.a(Integer.parseInt($$0));
         }

         if (n.matcher($$0).matches()) {
            return pk.a(Double.parseDouble($$0.substring(0, $$0.length() - 1)));
         }

         if (m.matcher($$0).matches()) {
            return pk.a(Double.parseDouble($$0));
         }

         if ("true".equalsIgnoreCase($$0)) {
            return ph.c;
         }

         if ("false".equalsIgnoreCase($$0)) {
            return ph.b;
         }
      } catch (NumberFormatException var3) {
      }

      return qa.a($$0);
   }

   public qc d() throws CommandSyntaxException {
      this.t.skipWhitespace();
      if (!this.t.canRead()) {
         throw c.createWithContext(this.t);
      } else {
         char $$0 = this.t.peek();
         if ($$0 == '{') {
            return this.f();
         } else {
            return $$0 == '[' ? this.e() : this.c();
         }
      }
   }

   protected qc e() throws CommandSyntaxException {
      return this.t.canRead(3) && !StringReader.isQuotedStringStart(this.t.peek(1)) && this.t.peek(2) == ';' ? this.h() : this.g();
   }

   public pj f() throws CommandSyntaxException {
      this.a('{');
      pj $$0 = new pj();
      this.t.skipWhitespace();

      while(this.t.canRead() && this.t.peek() != '}') {
         int $$1 = this.t.getCursor();
         String $$2 = this.b();
         if ($$2.isEmpty()) {
            this.t.setCursor($$1);
            throw b.createWithContext(this.t);
         }

         this.a(':');
         $$0.a($$2, this.d());
         if (!this.i()) {
            break;
         }

         if (!this.t.canRead()) {
            throw b.createWithContext(this.t);
         }
      }

      this.a('}');
      return $$0;
   }

   private qc g() throws CommandSyntaxException {
      this.a('[');
      this.t.skipWhitespace();
      if (!this.t.canRead()) {
         throw c.createWithContext(this.t);
      } else {
         pp $$0 = new pp();
         qe<?> $$1 = null;

         while(this.t.peek() != ']') {
            int $$2 = this.t.getCursor();
            qc $$3 = this.d();
            qe<?> $$4 = $$3.b();
            if ($$1 == null) {
               $$1 = $$4;
            } else if ($$4 != $$1) {
               this.t.setCursor($$2);
               throw d.createWithContext(this.t, $$4.b(), $$1.b());
            }

            $$0.add($$3);
            if (!this.i()) {
               break;
            }

            if (!this.t.canRead()) {
               throw c.createWithContext(this.t);
            }
         }

         this.a(']');
         return $$0;
      }
   }

   private qc h() throws CommandSyntaxException {
      this.a('[');
      int $$0 = this.t.getCursor();
      char $$1 = this.t.read();
      this.t.read();
      this.t.skipWhitespace();
      if (!this.t.canRead()) {
         throw c.createWithContext(this.t);
      } else if ($$1 == 'B') {
         return new pg(this.a(pg.a, ph.a));
      } else if ($$1 == 'L') {
         return new pq(this.a(pq.a, pr.a));
      } else if ($$1 == 'I') {
         return new pn(this.a(pn.a, po.a));
      } else {
         this.t.setCursor($$0);
         throw f.createWithContext(this.t, String.valueOf($$1));
      }
   }

   private <T extends Number> List<T> a(qe<?> $$0, qe<?> $$1) throws CommandSyntaxException {
      List<T> $$2 = Lists.newArrayList();

      while(this.t.peek() != ']') {
         int $$3 = this.t.getCursor();
         qc $$4 = this.d();
         qe<?> $$5 = $$4.b();
         if ($$5 != $$1) {
            this.t.setCursor($$3);
            throw e.createWithContext(this.t, $$5.b(), $$0.b());
         }

         if ($$1 == ph.a) {
            $$2.add(((pw)$$4).h());
         } else if ($$1 == pr.a) {
            $$2.add(((pw)$$4).e());
         } else {
            $$2.add(((pw)$$4).f());
         }

         if (!this.i()) {
            break;
         }

         if (!this.t.canRead()) {
            throw c.createWithContext(this.t);
         }
      }

      this.a(']');
      return $$2;
   }

   private boolean i() {
      this.t.skipWhitespace();
      if (this.t.canRead() && this.t.peek() == ',') {
         this.t.skip();
         this.t.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   private void a(char $$0) throws CommandSyntaxException {
      this.t.skipWhitespace();
      this.t.expect($$0);
   }
}
