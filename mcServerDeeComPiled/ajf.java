import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Objects;

public class ajf extends aje<GameProfile, ajg> {
   public ajf(File $$0) {
      super($$0);
   }

   @Override
   protected ajd<GameProfile> a(JsonObject $$0) {
      return new ajg($$0);
   }

   public boolean a(GameProfile $$0) {
      return this.d($$0);
   }

   @Override
   public String[] a() {
      return (String[])this.d().stream().map(ajd::g).filter(Objects::nonNull).map(GameProfile::getName).toArray($$0 -> new String[$$0]);
   }

   protected String b(GameProfile $$0) {
      return $$0.getId().toString();
   }
}
