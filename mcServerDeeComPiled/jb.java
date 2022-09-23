import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class jb implements iz {
   private static final Logger c = LogUtils.getLogger();
   private final iy.a d;
   private final List<Consumer<Consumer<af>>> e = ImmutableList.of(new jg(), new jd(), new jc(), new je(), new jf());

   public jb(iy $$0) {
      this.d = $$0.a(iy.b.a, "advancements");
   }

   @Override
   public void a(ix $$0) {
      Set<abb> $$1 = Sets.newHashSet();
      Consumer<af> $$2 = $$2x -> {
         if (!$$1.add($$2x.h())) {
            throw new IllegalStateException("Duplicate advancement " + $$2x.h());
         } else {
            Path $$3x = this.d.a($$2x.h());

            try {
               iz.a($$0, $$2x.a().b(), $$3x);
            } catch (IOException var6) {
               c.error("Couldn't save advancement {}", $$3x, var6);
            }

         }
      };

      for(Consumer<Consumer<af>> $$3 : this.e) {
         $$3.accept($$2);
      }

   }

   @Override
   public String a() {
      return "Advancements";
   }
}
