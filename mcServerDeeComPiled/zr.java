import com.mojang.authlib.GameProfile;

public class zr implements tc<zp> {
   private final GameProfile a;

   public zr(GameProfile $$0) {
      this.a = $$0;
   }

   public zr(qx $$0) {
      this.a = $$0.x();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
   }

   public void a(zp $$0) {
      $$0.a(this);
   }

   public GameProfile b() {
      return this.a;
   }
}
