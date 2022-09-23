import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ajg extends aiu<GameProfile> {
   public ajg(GameProfile $$0) {
      this($$0, null, null, null, null);
   }

   public ajg(GameProfile $$0, @Nullable Date $$1, @Nullable String $$2, @Nullable Date $$3, @Nullable String $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ajg(JsonObject $$0) {
      super(b($$0), $$0);
   }

   @Override
   protected void a(JsonObject $$0) {
      if (this.g() != null) {
         $$0.addProperty("uuid", this.g().getId() == null ? "" : this.g().getId().toString());
         $$0.addProperty("name", this.g().getName());
         super.a($$0);
      }
   }

   @Override
   public rq e() {
      GameProfile $$0 = this.g();
      return rq.b($$0.getName() != null ? $$0.getName() : Objects.toString($$0.getId(), "(Unknown)"));
   }

   private static GameProfile b(JsonObject $$0) {
      if ($$0.has("uuid") && $$0.has("name")) {
         String $$1 = $$0.get("uuid").getAsString();

         UUID $$2;
         try {
            $$2 = UUID.fromString($$1);
         } catch (Throwable var4) {
            return null;
         }

         return new GameProfile($$2, $$0.get("name").getAsString());
      } else {
         return null;
      }
   }
}
