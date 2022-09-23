import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class afd implements afa {
   static final SuggestionProvider<dr> b = ($$0, $$1) -> dt.a(a($$0).a(), $$1);
   public static final Function<String, afb.c> a = $$0 -> new afb.c() {
         @Override
         public afa a(CommandContext<dr> $$0x) {
            return new afd(afd.a($$0), eq.e($$0, $$0));
         }

         @Override
         public ArgumentBuilder<dr, ?> a(ArgumentBuilder<dr, ?> $$0x, Function<ArgumentBuilder<dr, ?>, ArgumentBuilder<dr, ?>> $$1) {
            return $$0.then(ds.a("storage").then((ArgumentBuilder)$$1.apply(ds.a($$0, eq.a()).suggests(afd.b))));
         }
      };
   private final drj c;
   private final abb d;

   static drj a(CommandContext<dr> $$0) {
      return ((dr)$$0.getSource()).m().aG();
   }

   afd(drj $$0, abb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(pj $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public pj a() {
      return this.c.a(this.d);
   }

   @Override
   public rq b() {
      return rq.a("commands.data.storage.modified", this.d);
   }

   @Override
   public rq a(qc $$0) {
      return rq.a("commands.data.storage.query", this.d, pv.c($$0));
   }

   @Override
   public rq a(eh.g $$0, double $$1, int $$2) {
      return rq.a("commands.data.storage.get", $$0, this.d, String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
