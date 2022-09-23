import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ed implements ArgumentType<ed.a> {
   private static final Collection<String> b = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.player.unknown"));

   public static Collection<GameProfile> a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((ed.a)$$0.getArgument($$1, ed.a.class)).getNames((dr)$$0.getSource());
   }

   public static ed a() {
      return new ed();
   }

   public ed.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         ga $$1 = new ga($$0);
         fz $$2 = $$1.t();
         if ($$2.b()) {
            throw eb.c.create();
         } else {
            return new ed.b($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         return $$1 -> {
            Optional<GameProfile> $$2 = $$1.m().ap().a($$4);
            return Collections.singleton((GameProfile)$$2.orElseThrow(a::create));
         };
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if ($$0.getSource() instanceof dt) {
         StringReader $$2 = new StringReader($$1.getInput());
         $$2.setCursor($$1.getStart());
         ga $$3 = new ga($$2);

         try {
            $$3.t();
         } catch (CommandSyntaxException var6) {
         }

         return $$3.a($$1, $$1x -> dt.b(((dt)$$0.getSource()).q(), $$1x));
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   @FunctionalInterface
   public interface a {
      Collection<GameProfile> getNames(dr var1) throws CommandSyntaxException;
   }

   public static class b implements ed.a {
      private final fz a;

      public b(fz $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<GameProfile> getNames(dr $$0) throws CommandSyntaxException {
         List<agh> $$1 = this.a.d($$0);
         if ($$1.isEmpty()) {
            throw eb.e.create();
         } else {
            List<GameProfile> $$2 = Lists.newArrayList();

            for(agh $$3 : $$1) {
               $$2.add($$3.fy());
            }

            return $$2;
         }
      }
   }
}
