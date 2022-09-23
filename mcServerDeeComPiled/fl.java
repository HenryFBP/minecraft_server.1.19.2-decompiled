import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fl implements ArgumentType<fj> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.rotation.incomplete"));

   public static fl a() {
      return new fl();
   }

   public static fj a(CommandContext<dr> $$0, String $$1) {
      return (fj)$$0.getArgument($$1, fj.class);
   }

   public fj a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fp $$2 = fp.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fp $$3 = fp.a($$0, false);
            return new fq($$3, $$2, new fp(true, 0.0));
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
