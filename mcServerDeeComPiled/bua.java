import java.util.Arrays;
import java.util.Comparator;

public enum bua implements amk {
   a(0, "options.chat.visibility.full"),
   b(1, "options.chat.visibility.system"),
   c(2, "options.chat.visibility.hidden");

   private static final bua[] d = (bua[])Arrays.stream(values()).sorted(Comparator.comparingInt(bua::a)).toArray($$0 -> new bua[$$0]);
   private final int e;
   private final String f;

   private bua(int $$0, String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public int a() {
      return this.e;
   }

   @Override
   public String b() {
      return this.f;
   }

   public static bua a(int $$0) {
      return d[ami.b($$0, d.length)];
   }
}
