import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class eq implements ArgumentType<abb> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> rq.a("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> rq.a("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> rq.a("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> rq.a("item_modifier.unknown", $$0));

   public static eq a() {
      return new eq();
   }

   public static af a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      abb $$2 = e($$0, $$1);
      af $$3 = ((dr)$$0.getSource()).m().az().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cdp<?> b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      cdq $$2 = ((dr)$$0.getSource()).m().aE();
      abb $$3 = e($$0, $$1);
      return (cdp<?>)$$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static dux c(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      abb $$2 = e($$0, $$1);
      dsi $$3 = ((dr)$$0.getSource()).m().aI();
      dux $$4 = $$3.a($$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static dto d(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      abb $$2 = e($$0, $$1);
      dsc $$3 = ((dr)$$0.getSource()).m().aJ();
      dto $$4 = $$3.a($$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static abb e(CommandContext<dr> $$0, String $$1) {
      return (abb)$$0.getArgument($$1, abb.class);
   }

   public abb a(StringReader $$0) throws CommandSyntaxException {
      return abb.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
