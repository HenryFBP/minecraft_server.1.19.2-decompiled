import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ec implements ArgumentType<abb> {
   private static final Collection<String> b = Arrays.asList("minecraft:pig", "cow");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> rq.a("entity.notFound", $$0));

   public static ec a() {
      return new ec();
   }

   public static abb a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return a((abb)$$0.getArgument($$1, abb.class));
   }

   private static abb a(abb $$0) throws CommandSyntaxException {
      hm.X.b($$0).filter(bbr::c).orElseThrow(() -> a.create($$0));
      return $$0;
   }

   public abb a(StringReader $$0) throws CommandSyntaxException {
      return a(abb.a($$0));
   }

   public Collection<String> getExamples() {
      return b;
   }
}
