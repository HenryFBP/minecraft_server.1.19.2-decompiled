import java.util.Map;
import javax.annotation.Nullable;

public interface dp {
   dp a = new dp() {
      @Nullable
      @Override
      public sd a(String $$0) {
         return null;
      }
   };

   @Nullable
   sd a(String var1);

   public static record a(Map<String, sd> b) implements dp {
      @Nullable
      @Override
      public sd a(String $$0) {
         return (sd)this.b.get($$0);
      }

      public Map<String, sd> a() {
         return this.b;
      }
   }
}
