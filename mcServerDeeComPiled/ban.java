import javax.annotation.Nullable;

public interface ban {
   rq X();

   default boolean Y() {
      return this.Z() != null;
   }

   default rq C_() {
      return this.X();
   }

   @Nullable
   default rq Z() {
      return null;
   }
}
