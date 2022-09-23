import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fb implements ArgumentType<UUID> {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.uuid.invalid"));
   private static final Collection<String> b = Arrays.asList("dd12be42-52a9-4a91-a8a1-11c01849e498");
   private static final Pattern c = Pattern.compile("^([-A-Fa-f0-9]+)");

   public static UUID a(CommandContext<dr> $$0, String $$1) {
      return (UUID)$$0.getArgument($$1, UUID.class);
   }

   public static fb a() {
      return new fb();
   }

   public UUID a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.getRemaining();
      Matcher $$2 = c.matcher($$1);
      if ($$2.find()) {
         String $$3 = $$2.group(1);

         try {
            UUID $$4 = UUID.fromString($$3);
            $$0.setCursor($$0.getCursor() + $$3.length());
            return $$4;
         } catch (IllegalArgumentException var6) {
         }
      }

      throw a.create();
   }

   public Collection<String> getExamples() {
      return b;
   }
}
