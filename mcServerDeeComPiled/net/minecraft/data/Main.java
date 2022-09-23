package net.minecraft.data;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collectors;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.obfuscate.DontObfuscate;

public class Main {
   @DontObfuscate
   public static void main(String[] $$0) throws IOException {
      ab.a();
      OptionParser $$1 = new OptionParser();
      OptionSpec<Void> $$2 = $$1.accepts("help", "Show the help menu").forHelp();
      OptionSpec<Void> $$3 = $$1.accepts("server", "Include server generators");
      OptionSpec<Void> $$4 = $$1.accepts("client", "Include client generators");
      OptionSpec<Void> $$5 = $$1.accepts("dev", "Include development tools");
      OptionSpec<Void> $$6 = $$1.accepts("reports", "Include data reports");
      OptionSpec<Void> $$7 = $$1.accepts("validate", "Validate inputs");
      OptionSpec<Void> $$8 = $$1.accepts("all", "Include all generators");
      OptionSpec<String> $$9 = $$1.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", new String[0]);
      OptionSpec<String> $$10 = $$1.accepts("input", "Input folder").withRequiredArg();
      OptionSet $$11 = $$1.parse($$0);
      if (!$$11.has($$2) && $$11.hasOptions()) {
         Path $$12 = Paths.get((String)$$9.value($$11));
         boolean $$13 = $$11.has($$8);
         boolean $$14 = $$13 || $$11.has($$4);
         boolean $$15 = $$13 || $$11.has($$3);
         boolean $$16 = $$13 || $$11.has($$5);
         boolean $$17 = $$13 || $$11.has($$6);
         boolean $$18 = $$13 || $$11.has($$7);
         iy $$19 = a(
            $$12,
            (Collection<Path>)$$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()),
            $$14,
            $$15,
            $$16,
            $$17,
            $$18,
            ab.b(),
            true
         );
         $$19.c();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   public static iy a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ae $$7, boolean $$8) {
      iy $$9 = new iy($$0, $$1, $$7, $$8);
      $$9.a($$2 || $$3, new le($$9).a(new lf()));
      $$9.a($$2, new jy($$9));
      $$9.a($$3, new jb($$9));
      $$9.a($$3, new jt($$9));
      $$9.a($$3, new kv($$9));
      lj $$10 = new lj($$9);
      $$9.a($$3, $$10);
      $$9.a($$3, new lq($$9, $$10));
      $$9.a($$3, new lh($$9));
      $$9.a($$3, new li($$9));
      $$9.a($$3, new lk($$9));
      $$9.a($$3, new ll($$9));
      $$9.a($$3, new lm($$9));
      $$9.a($$3, new ln($$9));
      $$9.a($$3, new lo($$9));
      $$9.a($$3, new lp($$9));
      $$9.a($$3, new lr($$9));
      $$9.a($$3, new ls($$9));
      $$9.a($$3, new lt($$9));
      $$9.a($$3, new lv($$9));
      $$9.a($$4, new ld($$9));
      $$9.a($$5, new ji($$9));
      $$9.a($$5, new jj($$9));
      $$9.a($$5, new jk($$9));
      $$9.a($$5, new jl($$9));
      $$9.a($$5, new jm($$9));
      return $$9;
   }
}
