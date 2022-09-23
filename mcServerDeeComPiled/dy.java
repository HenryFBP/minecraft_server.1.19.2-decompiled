import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class dy implements ArgumentType<pj> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private dy() {
   }

   public static dy a() {
      return new dy();
   }

   public static <S> pj a(CommandContext<S> $$0, String $$1) {
      return (pj)$$0.getArgument($$1, pj.class);
   }

   public pj a(StringReader $$0) throws CommandSyntaxException {
      return new qd($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
