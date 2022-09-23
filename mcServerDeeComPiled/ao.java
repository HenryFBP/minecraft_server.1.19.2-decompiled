import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class ao {
   private final rq a;
   private final rq b;
   private final cax c;
   @Nullable
   private final abb d;
   private final ap e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private float i;
   private float j;

   public ao(cax $$0, rq $$1, rq $$2, @Nullable abb $$3, ap $$4, boolean $$5, boolean $$6, boolean $$7) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$0;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   public void a(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public rq a() {
      return this.a;
   }

   public rq b() {
      return this.b;
   }

   public cax c() {
      return this.c;
   }

   @Nullable
   public abb d() {
      return this.d;
   }

   public ap e() {
      return this.e;
   }

   public float f() {
      return this.i;
   }

   public float g() {
      return this.j;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }

   public static ao a(JsonObject $$0) {
      rq $$1 = rq.a.a($$0.get("title"));
      rq $$2 = rq.a.a($$0.get("description"));
      if ($$1 != null && $$2 != null) {
         cax $$3 = b(alz.t($$0, "icon"));
         abb $$4 = $$0.has("background") ? new abb(alz.h($$0, "background")) : null;
         ap $$5 = $$0.has("frame") ? ap.a(alz.h($$0, "frame")) : ap.a;
         boolean $$6 = alz.a($$0, "show_toast", true);
         boolean $$7 = alz.a($$0, "announce_to_chat", true);
         boolean $$8 = alz.a($$0, "hidden", false);
         return new ao($$3, $$1, $$2, $$4, $$5, $$6, $$7, $$8);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   private static cax b(JsonObject $$0) {
      if (!$$0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         cat $$1 = alz.i($$0, "item");
         if ($$0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            cax $$2 = new cax($$1);
            if ($$0.has("nbt")) {
               try {
                  pj $$3 = qd.a(alz.a($$0.get("nbt"), "nbt"));
                  $$2.c($$3);
               } catch (CommandSyntaxException var4) {
                  throw new JsonSyntaxException("Invalid nbt tag: " + var4.getMessage());
               }
            }

            return $$2;
         }
      }
   }

   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a((Enum<?>)this.e);
      int $$1 = 0;
      if (this.d != null) {
         $$1 |= 1;
      }

      if (this.f) {
         $$1 |= 2;
      }

      if (this.h) {
         $$1 |= 4;
      }

      $$0.writeInt($$1);
      if (this.d != null) {
         $$0.a(this.d);
      }

      $$0.writeFloat(this.i);
      $$0.writeFloat(this.j);
   }

   public static ao b(qx $$0) {
      rq $$1 = $$0.j();
      rq $$2 = $$0.j();
      cax $$3 = $$0.p();
      ap $$4 = $$0.a(ap.class);
      int $$5 = $$0.readInt();
      abb $$6 = ($$5 & 1) != 0 ? $$0.r() : null;
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ao $$9 = new ao($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }

   public JsonElement k() {
      JsonObject $$0 = new JsonObject();
      $$0.add("icon", this.l());
      $$0.add("title", rq.a.c(this.a));
      $$0.add("description", rq.a.c(this.b));
      $$0.addProperty("frame", this.e.a());
      $$0.addProperty("show_toast", this.f);
      $$0.addProperty("announce_to_chat", this.g);
      $$0.addProperty("hidden", this.h);
      if (this.d != null) {
         $$0.addProperty("background", this.d.toString());
      }

      return $$0;
   }

   private JsonObject l() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("item", hm.Y.b(this.c.c()).toString());
      if (this.c.t()) {
         $$0.addProperty("nbt", this.c.u().toString());
      }

      return $$0;
   }
}
