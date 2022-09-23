import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class cdu implements cdh {
   final int a;
   final int b;
   final hi<cdm> c;
   final cax d;
   private final abb e;
   final String f;

   public cdu(abb $$0, String $$1, int $$2, int $$3, hi<cdm> $$4, cax $$5) {
      this.e = $$0;
      this.f = $$1;
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Override
   public abb f() {
      return this.e;
   }

   @Override
   public cdr<?> U_() {
      return cdr.a;
   }

   @Override
   public String d() {
      return this.f;
   }

   @Override
   public cax c() {
      return this.d;
   }

   @Override
   public hi<cdm> a() {
      return this.c;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= this.a && $$1 >= this.b;
   }

   public boolean a(bxa $$0, cgx $$1) {
      for(int $$2 = 0; $$2 <= $$0.g() - this.a; ++$$2) {
         for(int $$3 = 0; $$3 <= $$0.f() - this.b; ++$$3) {
            if (this.a($$0, $$2, $$3, true)) {
               return true;
            }

            if (this.a($$0, $$2, $$3, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean a(bxa $$0, int $$1, int $$2, boolean $$3) {
      for(int $$4 = 0; $$4 < $$0.g(); ++$$4) {
         for(int $$5 = 0; $$5 < $$0.f(); ++$$5) {
            int $$6 = $$4 - $$1;
            int $$7 = $$5 - $$2;
            cdm $$8 = cdm.a;
            if ($$6 >= 0 && $$7 >= 0 && $$6 < this.a && $$7 < this.b) {
               if ($$3) {
                  $$8 = this.c.get(this.a - $$6 - 1 + $$7 * this.a);
               } else {
                  $$8 = this.c.get($$6 + $$7 * this.a);
               }
            }

            if (!$$8.a($$0.a($$4 + $$5 * $$0.g()))) {
               return false;
            }
         }
      }

      return true;
   }

   public cax a(bxa $$0) {
      return this.c().o();
   }

   public int j() {
      return this.a;
   }

   public int k() {
      return this.b;
   }

   static hi<cdm> a(String[] $$0, Map<String, cdm> $$1, int $$2, int $$3) {
      hi<cdm> $$4 = hi.a($$2 * $$3, cdm.a);
      Set<String> $$5 = Sets.newHashSet($$1.keySet());
      $$5.remove(" ");

      for(int $$6 = 0; $$6 < $$0.length; ++$$6) {
         for(int $$7 = 0; $$7 < $$0[$$6].length(); ++$$7) {
            String $$8 = $$0[$$6].substring($$7, $$7 + 1);
            cdm $$9 = (cdm)$$1.get($$8);
            if ($$9 == null) {
               throw new JsonSyntaxException("Pattern references symbol '" + $$8 + "' but it's not defined in the key");
            }

            $$5.remove($$8);
            $$4.set($$7 + $$2 * $$6, $$9);
         }
      }

      if (!$$5.isEmpty()) {
         throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + $$5);
      } else {
         return $$4;
      }
   }

   @VisibleForTesting
   static String[] a(String... $$0) {
      int $$1 = Integer.MAX_VALUE;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for(int $$5 = 0; $$5 < $$0.length; ++$$5) {
         String $$6 = $$0[$$5];
         $$1 = Math.min($$1, a($$6));
         int $$7 = b($$6);
         $$2 = Math.max($$2, $$7);
         if ($$7 < 0) {
            if ($$3 == $$5) {
               ++$$3;
            }

            ++$$4;
         } else {
            $$4 = 0;
         }
      }

      if ($$0.length == $$4) {
         return new String[0];
      } else {
         String[] $$8 = new String[$$0.length - $$4 - $$3];

         for(int $$9 = 0; $$9 < $$8.length; ++$$9) {
            $$8[$$9] = $$0[$$9 + $$3].substring($$1, $$2 + 1);
         }

         return $$8;
      }
   }

   @Override
   public boolean i() {
      hi<cdm> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.d()).anyMatch($$0x -> $$0x.a().length == 0);
   }

   private static int a(String $$0) {
      int $$1 = 0;

      while($$1 < $$0.length() && $$0.charAt($$1) == ' ') {
         ++$$1;
      }

      return $$1;
   }

   private static int b(String $$0) {
      int $$1 = $$0.length() - 1;

      while($$1 >= 0 && $$0.charAt($$1) == ' ') {
         --$$1;
      }

      return $$1;
   }

   static String[] a(JsonArray $$0) {
      String[] $$1 = new String[$$0.size()];
      if ($$1.length > 3) {
         throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
      } else if ($$1.length == 0) {
         throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
      } else {
         for(int $$2 = 0; $$2 < $$1.length; ++$$2) {
            String $$3 = alz.a($$0.get($$2), "pattern[" + $$2 + "]");
            if ($$3.length() > 3) {
               throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
            }

            if ($$2 > 0 && $$1[0].length() != $$3.length()) {
               throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }

            $$1[$$2] = $$3;
         }

         return $$1;
      }
   }

   static Map<String, cdm> c(JsonObject $$0) {
      Map<String, cdm> $$1 = Maps.newHashMap();

      for(Entry<String, JsonElement> $$2 : $$0.entrySet()) {
         if (((String)$$2.getKey()).length() != 1) {
            throw new JsonSyntaxException("Invalid key entry: '" + (String)$$2.getKey() + "' is an invalid symbol (must be 1 character only).");
         }

         if (" ".equals($$2.getKey())) {
            throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
         }

         $$1.put((String)$$2.getKey(), cdm.a((JsonElement)$$2.getValue()));
      }

      $$1.put(" ", cdm.a);
      return $$1;
   }

   public static cax a(JsonObject $$0) {
      cat $$1 = b($$0);
      if ($$0.has("data")) {
         throw new JsonParseException("Disallowed data tag found");
      } else {
         int $$2 = alz.a($$0, "count", 1);
         if ($$2 < 1) {
            throw new JsonSyntaxException("Invalid output count: " + $$2);
         } else {
            return new cax($$1, $$2);
         }
      }
   }

   public static cat b(JsonObject $$0) {
      String $$1 = alz.h($$0, "item");
      cat $$2 = (cat)hm.Y.b(new abb($$1)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + $$1 + "'"));
      if ($$2 == caz.a) {
         throw new JsonSyntaxException("Invalid item: " + $$1);
      } else {
         return $$2;
      }
   }

   public static class a implements cdr<cdu> {
      public cdu b(abb $$0, JsonObject $$1) {
         String $$2 = alz.a($$1, "group", "");
         Map<String, cdm> $$3 = cdu.c(alz.t($$1, "key"));
         String[] $$4 = cdu.a(cdu.a(alz.u($$1, "pattern")));
         int $$5 = $$4[0].length();
         int $$6 = $$4.length;
         hi<cdm> $$7 = cdu.a($$4, $$3, $$5, $$6);
         cax $$8 = cdu.a(alz.t($$1, "result"));
         return new cdu($$0, $$2, $$5, $$6, $$7, $$8);
      }

      public cdu b(abb $$0, qx $$1) {
         int $$2 = $$1.k();
         int $$3 = $$1.k();
         String $$4 = $$1.q();
         hi<cdm> $$5 = hi.a($$2 * $$3, cdm.a);

         for(int $$6 = 0; $$6 < $$5.size(); ++$$6) {
            $$5.set($$6, cdm.b($$1));
         }

         cax $$7 = $$1.p();
         return new cdu($$0, $$4, $$2, $$3, $$5, $$7);
      }

      public void a(qx $$0, cdu $$1) {
         $$0.d($$1.a);
         $$0.d($$1.b);
         $$0.a($$1.f);

         for(cdm $$2 : $$1.c) {
            $$2.a($$0);
         }

         $$0.a($$1.d);
      }
   }
}
