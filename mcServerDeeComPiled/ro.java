import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ro {
   private final ro.a a;
   private final String b;

   public ro(ro.a $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ro.a a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ro $$1 = (ro)$$0;
         if (this.a != $$1.a) {
            return false;
         } else {
            if (this.b != null) {
               if (!this.b.equals($$1.b)) {
                  return false;
               }
            } else if ($$1.b != null) {
               return false;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public String toString() {
      return "ClickEvent{action=" + this.a + ", value='" + this.b + "'}";
   }

   public int hashCode() {
      int $$0 = this.a.hashCode();
      return 31 * $$0 + (this.b != null ? this.b.hashCode() : 0);
   }

   public static enum a {
      a("open_url", true),
      b("open_file", false),
      c("run_command", true),
      d("suggest_command", true),
      e("change_page", true),
      f("copy_to_clipboard", true);

      private static final Map<String, ro.a> g = (Map<String, ro.a>)Arrays.stream(values()).collect(Collectors.toMap(ro.a::b, $$0 -> $$0));
      private final boolean h;
      private final String i;

      private a(String $$0, boolean $$1) {
         this.i = $$0;
         this.h = $$1;
      }

      public boolean a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }

      public static ro.a a(String $$0) {
         return (ro.a)g.get($$0);
      }
   }
}
