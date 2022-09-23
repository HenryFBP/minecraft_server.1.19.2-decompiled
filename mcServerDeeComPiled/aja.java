import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class aja extends aje<GameProfile, ajb> {
   public aja(File $$0) {
      super($$0);
   }

   @Override
   protected ajd<GameProfile> a(JsonObject $$0) {
      return new ajb($$0);
   }

   @Override
   public String[] a() {
      return (String[])this.d().stream().map(ajd::g).filter(Objects::nonNull).map(GameProfile::getName).toArray($$0 -> new String[$$0]);
   }

   public boolean a(GameProfile $$0) {
      ajb $$1 = this.b($$0);
      return $$1 != null ? $$1.b() : false;
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
