import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface drw {
   int c = 19133;
   int d = 19132;

   cgl D();

   void a(cgl var1);

   boolean F();

   Set<String> G();

   void a(String var1, boolean var2);

   default void a(r $$0) {
      $$0.a("Known server brands", (s<String>)(() -> String.join(", ", this.G())));
      $$0.a("Level was modded", (s<String>)(() -> Boolean.toString(this.F())));
      $$0.a("Level storage version", (s<String>)(() -> {
         int $$0x = this.z();
         return String.format(Locale.ROOT, "0x%05X - %s", $$0x, this.i($$0x));
      }));
   }

   default String i(int $$0) {
      switch($$0) {
         case 19132:
            return "McRegion";
         case 19133:
            return "Anvil";
         default:
            return "Unknown?";
      }
   }

   @Nullable
   pj E();

   void b(@Nullable pj var1);

   drv H();

   chb I();

   pj a(hn var1, @Nullable pj var2);

   boolean n();

   int z();

   String g();

   cgu m();

   void a(cgu var1);

   boolean o();

   bag s();

   void a(bag var1);

   boolean t();

   void d(boolean var1);

   cgt q();

   @Nullable
   pj y();

   pj C();

   void a(pj var1);

   dbm A();

   Lifecycle B();
}
