import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public class cxa {
   private static final Set<cxa> j = new ObjectArraySet();
   public static final cxa a = a(new cxa("oak"));
   public static final cxa b = a(new cxa("spruce"));
   public static final cxa c = a(new cxa("birch"));
   public static final cxa d = a(new cxa("acacia"));
   public static final cxa e = a(new cxa("jungle"));
   public static final cxa f = a(new cxa("dark_oak"));
   public static final cxa g = a(new cxa("crimson"));
   public static final cxa h = a(new cxa("warped"));
   public static final cxa i = a(new cxa("mangrove"));
   private final String k;

   protected cxa(String $$0) {
      this.k = $$0;
   }

   private static cxa a(cxa $$0) {
      j.add($$0);
      return $$0;
   }

   public static Stream<cxa> a() {
      return j.stream();
   }

   public String b() {
      return this.k;
   }
}
