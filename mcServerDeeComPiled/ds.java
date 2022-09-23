import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ds {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<dr> g = new CommandDispatcher();

   public ds(ds.a $$0, dl $$1) {
      acb.a(this.g);
      acc.a(this.g);
      acu.a(this.g, $$1);
      acg.a(this.g);
      aci.a(this.g, $$1);
      acj.a(this.g, $$1);
      afb.a(this.g);
      ack.a(this.g);
      acm.a(this.g);
      acp.a(this.g);
      acq.a(this.g);
      acr.a(this.g);
      acs.a(this.g);
      act.a(this.g);
      acv.a(this.g);
      acw.a(this.g, $$1);
      acx.a(this.g);
      acy.a(this.g);
      acz.a(this.g);
      ada.a(this.g);
      adb.a(this.g, $$1);
      adc.a(this.g);
      add.a(this.g, $$1);
      adf.a(this.g);
      adg.a(this.g);
      adh.a(this.g);
      adi.a(this.g);
      adj.a(this.g, $$1);
      adk.a(this.g);
      ado.a(this.g);
      adq.a(this.g);
      adr.a(this.g);
      adv.a(this.g);
      adu.a(this.g);
      aea.a(this.g);
      aeb.a(this.g);
      aec.a(this.g);
      aed.a(this.g, $$0 != ds.a.c);
      aee.a(this.g, $$1);
      aeg.a(this.g);
      aeh.a(this.g);
      aei.a(this.g);
      aej.a(this.g);
      ael.a(this.g);
      aem.a(this.g);
      aen.a(this.g);
      aeo.a(this.g);
      aep.a(this.g);
      aeq.a(this.g);
      aer.a(this.g);
      aes.a(this.g);
      aet.a(this.g);
      aeu.a(this.g);
      aew.a(this.g);
      aey.a(this.g);
      if (axf.e.d()) {
         ade.a(this.g);
      }

      if (ab.aL) {
         oz.a(this.g);
      }

      if ($$0.e) {
         acd.a(this.g);
         ace.a(this.g);
         acf.a(this.g);
         acl.a(this.g);
         adl.a(this.g);
         adm.a(this.g);
         adn.a(this.g);
         adp.a(this.g);
         adx.a(this.g);
         ady.a(this.g);
         adz.a(this.g);
         aef.a(this.g);
         aek.a(this.g);
         aex.a(this.g);
      }

      if ($$0.d) {
         ads.a(this.g);
      }

      this.g.setConsumer(($$0x, $$1x, $$2) -> ((dr)$$0x.getSource()).a($$0x, $$1x, $$2));
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply($$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public int a(dr $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      return this.a(this.g.parse($$1, $$0), $$1);
   }

   public int a(ParseResults<dr> $$0, String $$1) {
      dr $$2 = (dr)$$0.getContext().getSource();
      $$2.m().aP().a((Supplier<String>)(() -> "/" + $$1));

      try {
         try {
            return this.g.execute($$0);
         } catch (dn var13) {
            $$2.b(var13.a());
            return 0;
         } catch (CommandSyntaxException var14) {
            $$2.b(rs.a(var14.getRawMessage()));
            if (var14.getInput() != null && var14.getCursor() >= 0) {
               int $$5 = Math.min(var14.getInput().length(), var14.getCursor());
               sb $$6 = rq.h().a(p.h).a($$1x -> $$1x.a(new ro(ro.a.d, "/" + $$1)));
               if ($$5 > 10) {
                  $$6.b(rp.n);
               }

               $$6.f(var14.getInput().substring(Math.max(0, $$5 - 10), $$5));
               if ($$5 < var14.getInput().length()) {
                  rq $$7 = rq.b(var14.getInput().substring($$5)).a(p.m, p.t);
                  $$6.b($$7);
               }

               $$6.b(rq.c("command.context.here").a(p.m, p.u));
               $$2.b($$6);
            }
         } catch (Exception var15) {
            sb $$9 = rq.b(var15.getMessage() == null ? var15.getClass().getName() : var15.getMessage());
            if (f.isDebugEnabled()) {
               f.error("Command exception: /{}", $$1, var15);
               StackTraceElement[] $$10 = var15.getStackTrace();

               for(int $$11 = 0; $$11 < Math.min($$10.length, 3); ++$$11) {
                  $$9.f("\n\n").f($$10[$$11].getMethodName()).f("\n ").f($$10[$$11].getFileName()).f(":").f(String.valueOf($$10[$$11].getLineNumber()));
               }
            }

            $$2.b(rq.c("command.failed").a($$1x -> $$1x.a(new rv(rv.a.a, $$9))));
            if (ab.aL) {
               $$2.b(rq.b(ad.d(var15)));
               f.error("'/{}' threw an exception", $$1, var15);
            }

            return 0;
         }

         return 0;
      } finally {
         $$2.m().aP().c();
      }
   }

   public void a(agh $$0) {
      Map<CommandNode<dr>, CommandNode<dt>> $$1 = Maps.newHashMap();
      RootCommandNode<dt> $$2 = new RootCommandNode();
      $$1.put(this.g.getRoot(), $$2);
      this.a(this.g.getRoot(), $$2, $$0.cT(), $$1);
      $$0.b.a(new tv($$2));
   }

   private void a(CommandNode<dr> $$0, CommandNode<dt> $$1, dr $$2, Map<CommandNode<dr>, CommandNode<dt>> $$3) {
      for(CommandNode<dr> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<dt, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder $$6 && $$6.getSuggestionsProvider() != null) {
               $$6.suggests(gj.b($$6.getSuggestionsProvider()));
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect((CommandNode)$$3.get($$5.getRedirect()));
            }

            CommandNode<dt> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }

   }

   public static LiteralArgumentBuilder<dr> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<dr, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ds.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<dr> a() {
      return this.g;
   }

   @Nullable
   public static <S> CommandSyntaxException a(ParseResults<S> $$0) {
      if (!$$0.getReader().canRead()) {
         return null;
      } else if ($$0.getExceptions().size() == 1) {
         return (CommandSyntaxException)$$0.getExceptions().values().iterator().next();
      } else {
         return $$0.getContext().getRange().isEmpty()
            ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader())
            : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext($$0.getReader());
      }
   }

   public static void b() {
      dl $$0 = new dl((hn)hn.d.get());
      $$0.a(dl.a.b);
      CommandDispatcher<dr> $$1 = new ds(ds.a.a, $$0).a();
      RootCommandNode<dr> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> f.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = gh.a($$2);
      Set<ArgumentType<?>> $$4 = (Set)$$3.stream().filter($$0x -> !gg.a($$0x.getClass())).collect(Collectors.toSet());
      if (!$$4.isEmpty()) {
         f.warn("Missing type registration for following arguments:\n {}", $$4.stream().map($$0x -> "\t" + $$0x).collect(Collectors.joining(",\n")));
         throw new IllegalStateException("Unregistered argument types");
      }
   }

   public static enum a {
      a(true, true),
      b(false, true),
      c(true, false);

      final boolean d;
      final boolean e;

      private a(boolean $$0, boolean $$1) {
         this.d = $$0;
         this.e = $$1;
      }
   }

   @FunctionalInterface
   public interface b {
      void parse(StringReader var1) throws CommandSyntaxException;
   }
}
