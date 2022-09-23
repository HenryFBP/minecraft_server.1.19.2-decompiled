import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.Set;
import org.slf4j.Logger;

public class dtj extends dtn {
   static final Logger h = LogUtils.getLogger();
   public static final akz<dlb> a = akv.e;
   public static final String b = "mansion";
   public static final drd.a c = drd.a.i;
   public static final byte d = 2;
   public static final int e = 50;
   public static final boolean f = true;
   final akz<dlb> i;
   final drd.a j;
   final byte k;
   final int l;
   final boolean m;

   dtj(dux[] $$0, akz<dlb> $$1, drd.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = $$4;
      this.m = $$5;
   }

   @Override
   public dtp a() {
      return dtq.l;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.f);
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      if (!$$0.a(caz.sg)) {
         return $$0;
      } else {
         dwq $$2 = $$1.c(dul.f);
         if ($$2 != null) {
            agg $$3 = $$1.c();
            gt $$4 = $$3.a(this.i, new gt($$2), this.l, this.m);
            if ($$4 != null) {
               cax $$5 = cbd.a($$3, $$4.u(), $$4.w(), this.k, true, true);
               cbd.a($$3, $$5);
               drg.a($$5, $$4, "+", this.j);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static dtj.a c() {
      return new dtj.a();
   }

   public static class a extends dtn.a<dtj.a> {
      private akz<dlb> a;
      private drd.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = dtj.a;
         this.b = dtj.c;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected dtj.a a() {
         return this;
      }

      public dtj.a a(akz<dlb> $$0) {
         this.a = $$0;
         return this;
      }

      public dtj.a a(drd.a $$0) {
         this.b = $$0;
         return this;
      }

      public dtj.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public dtj.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public dtj.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public dto b() {
         return new dtj(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }

   public static class b extends dtn.c<dtj> {
      public void a(JsonObject $$0, dtj $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.i.equals(dtj.a)) {
            $$0.addProperty("destination", $$1.i.b().toString());
         }

         if ($$1.j != dtj.c) {
            $$0.add("decoration", $$2.serialize($$1.j.toString().toLowerCase(Locale.ROOT)));
         }

         if ($$1.k != 2) {
            $$0.addProperty("zoom", $$1.k);
         }

         if ($$1.l != 50) {
            $$0.addProperty("search_radius", $$1.l);
         }

         if (!$$1.m) {
            $$0.addProperty("skip_existing_chunks", $$1.m);
         }

      }

      public dtj a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         akz<dlb> $$3 = a($$0);
         String $$4 = $$0.has("decoration") ? alz.h($$0, "decoration") : "mansion";
         drd.a $$5 = dtj.c;

         try {
            $$5 = drd.a.valueOf($$4.toUpperCase(Locale.ROOT));
         } catch (IllegalArgumentException var10) {
            dtj.h.error("Error while parsing loot table decoration entry. Found {}. Defaulting to {}", $$4, dtj.c);
         }

         byte $$7 = alz.a($$0, "zoom", (byte)2);
         int $$8 = alz.a($$0, "search_radius", 50);
         boolean $$9 = alz.a($$0, "skip_existing_chunks", true);
         return new dtj($$2, $$3, $$5, $$7, $$8, $$9);
      }

      private static akz<dlb> a(JsonObject $$0) {
         if ($$0.has("destination")) {
            String $$1 = alz.h($$0, "destination");
            return akz.a(hm.aN, new abb($$1));
         } else {
            return dtj.a;
         }
      }
   }
}
