import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public interface en<T> extends ArgumentType<T> {
   @Nullable
   default CompletableFuture<rq> a(dr $$0, ParsedArgument<dr, ?> $$1) throws CommandSyntaxException {
      return this.b().isInstance($$1.getResult()) ? this.a($$0, (T)this.b().cast($$1.getResult())) : null;
   }

   CompletableFuture<rq> a(dr var1, T var2) throws CommandSyntaxException;

   Class<T> b();
}
