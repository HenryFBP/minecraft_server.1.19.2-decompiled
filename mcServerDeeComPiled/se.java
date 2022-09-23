import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.util.ArrayList;
import java.util.List;

public record se<S>(List<se.a<S>> a) {
   public static <S> se<S> a(ParseResults<S> $$0) {
      CommandContextBuilder<S> $$1 = $$0.getContext();
      CommandContextBuilder<S> $$2 = $$1;

      List<se.a<S>> $$3;
      CommandContextBuilder<S> $$4;
      for($$3 = a($$1); ($$4 = $$2.getChild()) != null; $$2 = $$4) {
         boolean $$5 = $$4.getRootNode() != $$1.getRootNode();
         if (!$$5) {
            break;
         }

         $$3.addAll(a($$4));
      }

      return new se<>($$3);
   }

   private static <S> List<se.a<S>> a(CommandContextBuilder<S> $$0) {
      List<se.a<S>> $$1 = new ArrayList();

      for(ParsedCommandNode<S> $$2 : $$0.getNodes()) {
         CommandNode $$5 = $$2.getNode();
         if ($$5 instanceof ArgumentCommandNode $$3) {
            ArgumentType var7 = $$3.getType();
            if (var7 instanceof en $$4) {
               ParsedArgument<S, ?> $$5 = (ParsedArgument)$$0.getArguments().get($$3.getName());
               if ($$5 != null) {
                  $$1.add(new se.a($$3, $$5, $$4));
               }
            }
         }
      }

      return $$1;
   }

   public boolean a(CommandNode<?> $$0) {
      for(se.a<S> $$1 : this.a) {
         if ($$1.b() == $$0) {
            return true;
         }
      }

      return false;
   }

   public static record a<S>(ArgumentCommandNode<S, ?> a, ParsedArgument<S, ?> b, en<?> c) {
      public String a() {
         return this.a.getName();
      }

      public ArgumentCommandNode<S, ?> b() {
         return this.a;
      }

      public ParsedArgument<S, ?> c() {
         return this.b;
      }

      public en<?> d() {
         return this.c;
      }
   }
}
