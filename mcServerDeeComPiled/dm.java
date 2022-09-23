import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class dm {
   private final dm.c[] a;
   final abb b;

   public dm(abb $$0, dm.c[] $$1) {
      this.b = $$0;
      this.a = $$1;
   }

   public abb a() {
      return this.b;
   }

   public dm.c[] b() {
      return this.a;
   }

   public static dm a(abb $$0, CommandDispatcher<dr> $$1, dr $$2, List<String> $$3) {
      List<dm.c> $$4 = Lists.newArrayListWithCapacity($$3.size());

      for(int $$5 = 0; $$5 < $$3.size(); ++$$5) {
         int $$6 = $$5 + 1;
         String $$7 = ((String)$$3.get($$5)).trim();
         StringReader $$8 = new StringReader($$7);
         if ($$8.canRead() && $$8.peek() != '#') {
            if ($$8.peek() == '/') {
               $$8.skip();
               if ($$8.peek() == '/') {
                  throw new IllegalArgumentException(
                     "Unknown or invalid command '" + $$7 + "' on line " + $$6 + " (if you intended to make a comment, use '#' not '//')"
                  );
               }

               String $$9 = $$8.readUnquotedString();
               throw new IllegalArgumentException(
                  "Unknown or invalid command '" + $$7 + "' on line " + $$6 + " (did you mean '" + $$9 + "'? Do not use a preceding forwards slash.)"
               );
            }

            try {
               ParseResults<dr> $$10 = $$1.parse($$8, $$2);
               if ($$10.getReader().canRead()) {
                  throw ds.a($$10);
               }

               $$4.add(new dm.b($$10));
            } catch (CommandSyntaxException var10) {
               throw new IllegalArgumentException("Whilst parsing command on line " + $$6 + ": " + var10.getMessage());
            }
         }
      }

      return new dm($$0, (dm.c[])$$4.toArray(new dm.c[0]));
   }

   public static class a {
      public static final dm.a a = new dm.a((abb)null);
      @Nullable
      private final abb b;
      private boolean c;
      private Optional<dm> d = Optional.empty();

      public a(@Nullable abb $$0) {
         this.b = $$0;
      }

      public a(dm $$0) {
         this.c = true;
         this.b = null;
         this.d = Optional.of($$0);
      }

      public Optional<dm> a(abo $$0) {
         if (!this.c) {
            if (this.b != null) {
               this.d = $$0.a(this.b);
            }

            this.c = true;
         }

         return this.d;
      }

      @Nullable
      public abb a() {
         return (abb)this.d.map($$0 -> $$0.b).orElse(this.b);
      }
   }

   public static class b implements dm.c {
      private final ParseResults<dr> a;

      public b(ParseResults<dr> $$0) {
         this.a = $$0;
      }

      @Override
      public void execute(abo $$0, dr $$1, Deque<abo.b> $$2, int $$3, int $$4, @Nullable abo.c $$5) throws CommandSyntaxException {
         if ($$5 != null) {
            String $$6 = this.a.getReader().getString();
            $$5.a($$4, $$6);
            int $$7 = this.a($$0, $$1);
            $$5.a($$4, $$6, $$7);
         } else {
            this.a($$0, $$1);
         }

      }

      private int a(abo $$0, dr $$1) throws CommandSyntaxException {
         return $$0.b().execute(ds.a(this.a, (UnaryOperator)($$1x -> $$1)));
      }

      public String toString() {
         return this.a.getReader().getString();
      }
   }

   @FunctionalInterface
   public interface c {
      void execute(abo var1, dr var2, Deque<abo.b> var3, int var4, int var5, @Nullable abo.c var6) throws CommandSyntaxException;
   }

   public static class d implements dm.c {
      private final dm.a a;

      public d(dm $$0) {
         this.a = new dm.a($$0);
      }

      @Override
      public void execute(abo $$0, dr $$1, Deque<abo.b> $$2, int $$3, int $$4, @Nullable abo.c $$5) {
         ad.a(this.a.a($$0), $$5x -> {
            dm.c[] $$6 = $$5x.b();
            if ($$5 != null) {
               $$5.a($$4, $$5x.a(), $$6.length);
            }

            int $$7 = $$3 - $$2.size();
            int $$8 = Math.min($$6.length, $$7);

            for(int $$9 = $$8 - 1; $$9 >= 0; --$$9) {
               $$2.addFirst(new abo.b($$1, $$4 + 1, $$6[$$9]));
            }

         }, () -> {
            if ($$5 != null) {
               $$5.a($$4, this.a.a(), -1);
            }

         });
      }

      public String toString() {
         return "function " + this.a.a();
      }
   }
}
