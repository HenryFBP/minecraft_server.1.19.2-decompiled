import com.mojang.bridge.game.GameVersion;

public interface ae extends GameVersion {
   @Deprecated
   default int getWorldVersion() {
      return this.b().c();
   }

   @Deprecated
   default String getSeriesId() {
      return this.b().b();
   }

   drk b();
}
