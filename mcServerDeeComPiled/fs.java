import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class fs implements ArgumentType<fs.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> rq.a("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> rq.a("arguments.function.unknown", $$0));

   public static fs a() {
      return new fs();
   }

   public fs.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final abb $$1 = abb.a($$0);
         return new fs.a() {
            @Override
            public Collection<dm> a(CommandContext<dr> $$0) throws CommandSyntaxException {
               return fs.b($$0, $$1);
            }

            @Override
            public Pair<abb, Either<dm, Collection<dm>>> b(CommandContext<dr> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(fs.b($$0, $$1)));
            }
         };
      } else {
         final abb $$2 = abb.a($$0);
         return new fs.a() {
            @Override
            public Collection<dm> a(CommandContext<dr> $$0) throws CommandSyntaxException {
               return Collections.singleton(fs.a($$0, $$2));
            }

            @Override
            public Pair<abb, Either<dm, Collection<dm>>> b(CommandContext<dr> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(fs.a($$0, $$2)));
            }
         };
      }
   }

   static dm a(CommandContext<dr> $$0, abb $$1) throws CommandSyntaxException {
      return (dm)((dr)$$0.getSource()).m().aA().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<dm> b(CommandContext<dr> $$0, abb $$1) throws CommandSyntaxException {
      Collection<dm> $$2 = ((dr)$$0.getSource()).m().aA().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<dm> a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((fs.a)$$0.getArgument($$1, fs.a.class)).a($$0);
   }

   public static Pair<abb, Either<dm, Collection<dm>>> b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((fs.a)$$0.getArgument($$1, fs.a.class)).b($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<dm> a(CommandContext<dr> var1) throws CommandSyntaxException;

      Pair<abb, Either<dm, Collection<dm>>> b(CommandContext<dr> var1) throws CommandSyntaxException;
   }
}
