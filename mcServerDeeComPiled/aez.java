import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class aez implements afa {
   static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("commands.data.block.invalid"));
   public static final Function<String, afb.c> a = $$0 -> new afb.c() {
         @Override
         public afa a(CommandContext<dr> $$0x) throws CommandSyntaxException {
            gt $$1 = fh.a($$0, $$0 + "Pos");
            cti $$2 = ((dr)$$0.getSource()).f().c_($$1);
            if ($$2 == null) {
               throw aez.b.create();
            } else {
               return new aez($$2, $$1);
            }
         }

         @Override
         public ArgumentBuilder<dr, ?> a(ArgumentBuilder<dr, ?> $$0x, Function<ArgumentBuilder<dr, ?>, ArgumentBuilder<dr, ?>> $$1) {
            return $$0.then(ds.a("block").then((ArgumentBuilder)$$1.apply(ds.a($$0 + "Pos", fh.a()))));
         }
      };
   private final cti c;
   private final gt d;

   public aez(cti $$0, gt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(pj $$0) {
      cvo $$1 = this.c.k().a_(this.d);
      this.c.a($$0);
      this.c.e();
      this.c.k().a(this.d, $$1, $$1, 3);
   }

   @Override
   public pj a() {
      return this.c.m();
   }

   @Override
   public rq b() {
      return rq.a("commands.data.block.modified", this.d.u(), this.d.v(), this.d.w());
   }

   @Override
   public rq a(qc $$0) {
      return rq.a("commands.data.block.query", this.d.u(), this.d.v(), this.d.w(), pv.c($$0));
   }

   @Override
   public rq a(eh.g $$0, double $$1, int $$2) {
      return rq.a("commands.data.block.get", $$0, this.d.u(), this.d.v(), this.d.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
