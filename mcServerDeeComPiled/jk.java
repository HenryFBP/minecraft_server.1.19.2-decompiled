import com.mojang.brigadier.CommandDispatcher;
import java.io.IOException;
import java.nio.file.Path;

public class jk implements iz {
   private final iy c;

   public jk(iy $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ix $$0) throws IOException {
      Path $$1 = this.c.a(iy.b.c).resolve("commands.json");
      CommandDispatcher<dr> $$2 = new ds(ds.a.a, new dl((hn)hn.d.get())).a();
      iz.a($$0, gh.a($$2, $$2.getRoot()), $$1);
   }

   @Override
   public String a() {
      return "Command Syntax";
   }
}
