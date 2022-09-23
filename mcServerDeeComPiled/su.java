import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class su implements rr {
   private static final String b = "*";
   private final String c;
   @Nullable
   private final fz d;
   private final String e;

   @Nullable
   private static fz a(String $$0) {
      try {
         return new ga(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public su(String $$0, String $$1) {
      this.c = $$0;
      this.d = a($$0);
      this.e = $$1;
   }

   public String a() {
      return this.c;
   }

   @Nullable
   public fz b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }

   private String a(dr $$0) throws CommandSyntaxException {
      if (this.d != null) {
         List<? extends bbn> $$1 = this.d.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw eb.a.create();
            }

            return ((bbn)$$1.get(0)).cq();
         }
      }

      return this.c;
   }

   private String a(String $$0, dr $$1) {
      MinecraftServer $$2 = $$1.m();
      if ($$2 != null) {
         dxo $$3 = $$2.aF();
         dxl $$4 = $$3.d(this.e);
         if ($$3.b($$0, $$4)) {
            dxn $$5 = $$3.c($$0, $$4);
            return Integer.toString($$5.b());
         }
      }

      return "";
   }

   @Override
   public sb a(@Nullable dr $$0, @Nullable bbn $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return rq.h();
      } else {
         String $$3 = this.a($$0);
         String $$4 = $$1 != null && $$3.equals("*") ? $$1.cq() : $$3;
         return rq.b(this.a($$4, $$0));
      }
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof su $$1 && this.c.equals($$1.c) && this.e.equals($$1.e)) {
            return true;
         }

         return false;
      }
   }

   public int hashCode() {
      int $$0 = this.c.hashCode();
      return 31 * $$0 + this.e.hashCode();
   }

   public String toString() {
      return "score{name='" + this.c + "', objective='" + this.e + "'}";
   }
}
