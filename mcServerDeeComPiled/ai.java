import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ai {
   public static final ai a = new ai(0, new abb[0], new abb[0], dm.a.a);
   private final int b;
   private final abb[] c;
   private final abb[] d;
   private final dm.a e;

   public ai(int $$0, abb[] $$1, abb[] $$2, dm.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public abb[] a() {
      return this.d;
   }

   public void a(agh $$0) {
      $$0.d(this.b);
      dsd $$1 = new dsd.a($$0.x()).a(dul.a, $$0).a(dul.f, $$0.cY()).a($$0.dQ()).a(duk.i);
      boolean $$2 = false;

      for(abb $$3 : this.c) {
         ObjectListIterator var8 = $$0.c.aH().a($$3).a($$1).iterator();

         while(var8.hasNext()) {
            cax $$4 = (cax)var8.next();
            if ($$0.j($$4)) {
               $$0.s.a(null, $$0.df(), $$0.dh(), $$0.dl(), ajw.kc, ajx.h, 0.2F, (($$0.dQ().i() - $$0.dQ().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               bqv $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.q();
                  $$5.b($$0.co());
               }
            }
         }
      }

      if ($$2) {
         $$0.bU.d();
      }

      if (this.d.length > 0) {
         $$0.a(this.d);
      }

      MinecraftServer $$6 = $$0.c;
      this.e.a($$6.aA()).ifPresent($$2x -> $$6.aA().a($$2x, $$0.cT().a().a(2)));
   }

   public String toString() {
      return "AdvancementRewards{experience="
         + this.b
         + ", loot="
         + Arrays.toString(this.c)
         + ", recipes="
         + Arrays.toString(this.d)
         + ", function="
         + this.e
         + "}";
   }

   public JsonElement b() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.b != 0) {
            $$0.addProperty("experience", this.b);
         }

         if (this.c.length > 0) {
            JsonArray $$1 = new JsonArray();

            for(abb $$2 : this.c) {
               $$1.add($$2.toString());
            }

            $$0.add("loot", $$1);
         }

         if (this.d.length > 0) {
            JsonArray $$3 = new JsonArray();

            for(abb $$4 : this.d) {
               $$3.add($$4.toString());
            }

            $$0.add("recipes", $$3);
         }

         if (this.e.a() != null) {
            $$0.addProperty("function", this.e.a().toString());
         }

         return $$0;
      }
   }

   public static ai a(JsonObject $$0) throws JsonParseException {
      int $$1 = alz.a($$0, "experience", 0);
      JsonArray $$2 = alz.a($$0, "loot", new JsonArray());
      abb[] $$3 = new abb[$$2.size()];

      for(int $$4 = 0; $$4 < $$3.length; ++$$4) {
         $$3[$$4] = new abb(alz.a($$2.get($$4), "loot[" + $$4 + "]"));
      }

      JsonArray $$5 = alz.a($$0, "recipes", new JsonArray());
      abb[] $$6 = new abb[$$5.size()];

      for(int $$7 = 0; $$7 < $$6.length; ++$$7) {
         $$6[$$7] = new abb(alz.a($$5.get($$7), "recipes[" + $$7 + "]"));
      }

      dm.a $$8;
      if ($$0.has("function")) {
         $$8 = new dm.a(new abb(alz.h($$0, "function")));
      } else {
         $$8 = dm.a.a;
      }

      return new ai($$1, $$3, $$6, $$8);
   }

   public static class a {
      private int a;
      private final List<abb> b = Lists.newArrayList();
      private final List<abb> c = Lists.newArrayList();
      @Nullable
      private abb d;

      public static ai.a a(int $$0) {
         return new ai.a().b($$0);
      }

      public ai.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ai.a a(abb $$0) {
         return new ai.a().b($$0);
      }

      public ai.a b(abb $$0) {
         this.b.add($$0);
         return this;
      }

      public static ai.a c(abb $$0) {
         return new ai.a().d($$0);
      }

      public ai.a d(abb $$0) {
         this.c.add($$0);
         return this;
      }

      public static ai.a e(abb $$0) {
         return new ai.a().f($$0);
      }

      public ai.a f(abb $$0) {
         this.d = $$0;
         return this;
      }

      public ai a() {
         return new ai(this.a, (abb[])this.b.toArray(new abb[0]), (abb[])this.c.toArray(new abb[0]), this.d == null ? dm.a.a : new dm.a(this.d));
      }
   }
}
