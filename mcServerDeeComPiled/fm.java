import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class fm implements ArgumentType<EnumSet<gy.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("arguments.swizzle.invalid"));

   public static fm a() {
      return new fm();
   }

   public static EnumSet<gy.a> a(CommandContext<dr> $$0, String $$1) {
      return (EnumSet<gy.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<gy.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<gy.a> $$1 = EnumSet.noneOf(gy.a.class);

      while($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         gy.a $$6 = switch($$2) {
            case 'x' -> gy.a.a;
            case 'y' -> gy.a.b;
            case 'z' -> gy.a.c;
            default -> throw b.create();
         };
         if ($$1.contains($$6)) {
            throw b.create();
         }

         $$1.add($$6);
      }

      return $$1;
   }

   public Collection<String> getExamples() {
      return a;
   }
}
