import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class eh implements ArgumentType<eh.g> {
   private static final Collection<String> c = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("arguments.nbtpath.node.invalid"));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> rq.a("arguments.nbtpath.nothing_found", $$0));
   private static final char d = '[';
   private static final char e = ']';
   private static final char f = '{';
   private static final char g = '}';
   private static final char h = '"';

   public static eh a() {
      return new eh();
   }

   public static eh.g a(CommandContext<dr> $$0, String $$1) {
      return (eh.g)$$0.getArgument($$1, eh.g.class);
   }

   public eh.g a(StringReader $$0) throws CommandSyntaxException {
      List<eh.h> $$1 = Lists.newArrayList();
      int $$2 = $$0.getCursor();
      Object2IntMap<eh.h> $$3 = new Object2IntOpenHashMap();
      boolean $$4 = true;

      while($$0.canRead() && $$0.peek() != ' ') {
         eh.h $$5 = a($$0, $$4);
         $$1.add($$5);
         $$3.put($$5, $$0.getCursor() - $$2);
         $$4 = false;
         if ($$0.canRead()) {
            char $$6 = $$0.peek();
            if ($$6 != ' ' && $$6 != '[' && $$6 != '{') {
               $$0.expect('.');
            }
         }
      }

      return new eh.g($$0.getString().substring($$2, $$0.getCursor()), (eh.h[])$$1.toArray(new eh.h[0]), $$3);
   }

   private static eh.h a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      switch($$0.peek()) {
         case '"':
            String $$6 = $$0.readString();
            return a($$0, $$6);
         case '[':
            $$0.skip();
            int $$3 = $$0.peek();
            if ($$3 == 123) {
               pj $$4 = new qd($$0).f();
               $$0.expect(']');
               return new eh.d($$4);
            } else {
               if ($$3 == 93) {
                  $$0.skip();
                  return eh.a.a;
               }

               int $$5 = $$0.readInt();
               $$0.expect(']');
               return new eh.c($$5);
            }
         case '{':
            if (!$$1) {
               throw a.createWithContext($$0);
            }

            pj $$2 = new qd($$0).f();
            return new eh.f($$2);
         default:
            String $$7 = b($$0);
            return a($$0, $$7);
      }
   }

   private static eh.h a(StringReader $$0, String $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '{') {
         pj $$2 = new qd($$0).f();
         return new eh.e($$1, $$2);
      } else {
         return new eh.b($$1);
      }
   }

   private static String b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();

      while($$0.canRead() && a($$0.peek())) {
         $$0.skip();
      }

      if ($$0.getCursor() == $$1) {
         throw a.createWithContext($$0);
      } else {
         return $$0.getString().substring($$1, $$0.getCursor());
      }
   }

   public Collection<String> getExamples() {
      return c;
   }

   private static boolean a(char $$0) {
      return $$0 != ' ' && $$0 != '"' && $$0 != '[' && $$0 != ']' && $$0 != '.' && $$0 != '{' && $$0 != '}';
   }

   static Predicate<qc> a(pj $$0) {
      return $$1 -> pv.a($$0, $$1, true);
   }

   static class a implements eh.h {
      public static final eh.a a = new eh.a();

      private a() {
      }

      @Override
      public void a(qc $$0, List<qc> $$1) {
         if ($$0 instanceof pi) {
            $$1.addAll((pi)$$0);
         }

      }

      @Override
      public void a(qc $$0, Supplier<qc> $$1, List<qc> $$2) {
         if ($$0 instanceof pi $$3) {
            if ($$3.isEmpty()) {
               qc $$4 = (qc)$$1.get();
               if ($$3.b(0, $$4)) {
                  $$2.add($$4);
               }
            } else {
               $$2.addAll($$3);
            }
         }

      }

      @Override
      public qc a() {
         return new pp();
      }

      @Override
      public int a(qc $$0, Supplier<qc> $$1) {
         if (!($$0 instanceof pi)) {
            return 0;
         } else {
            pi<?> $$2 = (pi)$$0;
            int $$3 = $$2.size();
            if ($$3 == 0) {
               $$2.b(0, (qc)$$1.get());
               return 1;
            } else {
               qc $$4 = (qc)$$1.get();
               int $$5 = $$3 - (int)$$2.stream().filter($$4::equals).count();
               if ($$5 == 0) {
                  return 0;
               } else {
                  $$2.clear();
                  if (!$$2.b(0, $$4)) {
                     return 0;
                  } else {
                     for(int $$6 = 1; $$6 < $$3; ++$$6) {
                        $$2.b($$6, (qc)$$1.get());
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      @Override
      public int a(qc $$0) {
         if ($$0 instanceof pi $$1) {
            int $$2 = $$1.size();
            if ($$2 > 0) {
               $$1.clear();
               return $$2;
            }
         }

         return 0;
      }
   }

   static class b implements eh.h {
      private final String a;

      public b(String $$0) {
         this.a = $$0;
      }

      @Override
      public void a(qc $$0, List<qc> $$1) {
         if ($$0 instanceof pj) {
            qc $$2 = ((pj)$$0).c(this.a);
            if ($$2 != null) {
               $$1.add($$2);
            }
         }

      }

      @Override
      public void a(qc $$0, Supplier<qc> $$1, List<qc> $$2) {
         if ($$0 instanceof pj $$3) {
            qc $$4;
            if ($$3.e(this.a)) {
               $$4 = $$3.c(this.a);
            } else {
               $$4 = (qc)$$1.get();
               $$3.a(this.a, $$4);
            }

            $$2.add($$4);
         }

      }

      @Override
      public qc a() {
         return new pj();
      }

      @Override
      public int a(qc $$0, Supplier<qc> $$1) {
         if ($$0 instanceof pj $$2) {
            qc $$3 = (qc)$$1.get();
            qc $$4 = $$2.a(this.a, $$3);
            if (!$$3.equals($$4)) {
               return 1;
            }
         }

         return 0;
      }

      @Override
      public int a(qc $$0) {
         if ($$0 instanceof pj $$1 && $$1.e(this.a)) {
            $$1.r(this.a);
            return 1;
         }

         return 0;
      }
   }

   static class c implements eh.h {
      private final int a;

      public c(int $$0) {
         this.a = $$0;
      }

      @Override
      public void a(qc $$0, List<qc> $$1) {
         if ($$0 instanceof pi $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               $$1.add((qc)$$2.get($$4));
            }
         }

      }

      @Override
      public void a(qc $$0, Supplier<qc> $$1, List<qc> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public qc a() {
         return new pp();
      }

      @Override
      public int a(qc $$0, Supplier<qc> $$1) {
         if ($$0 instanceof pi $$2) {
            int $$3 = $$2.size();
            int $$4 = this.a < 0 ? $$3 + this.a : this.a;
            if (0 <= $$4 && $$4 < $$3) {
               qc $$5 = (qc)$$2.get($$4);
               qc $$6 = (qc)$$1.get();
               if (!$$6.equals($$5) && $$2.a($$4, $$6)) {
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(qc $$0) {
         if ($$0 instanceof pi $$1) {
            int $$2 = $$1.size();
            int $$3 = this.a < 0 ? $$2 + this.a : this.a;
            if (0 <= $$3 && $$3 < $$2) {
               $$1.c($$3);
               return 1;
            }
         }

         return 0;
      }
   }

   static class d implements eh.h {
      private final pj a;
      private final Predicate<qc> b;

      public d(pj $$0) {
         this.a = $$0;
         this.b = eh.a($$0);
      }

      @Override
      public void a(qc $$0, List<qc> $$1) {
         if ($$0 instanceof pp $$2) {
            $$2.stream().filter(this.b).forEach($$1::add);
         }

      }

      @Override
      public void a(qc $$0, Supplier<qc> $$1, List<qc> $$2) {
         MutableBoolean $$3 = new MutableBoolean();
         if ($$0 instanceof pp $$4) {
            $$4.stream().filter(this.b).forEach($$2x -> {
               $$2.add($$2x);
               $$3.setTrue();
            });
            if ($$3.isFalse()) {
               pj $$5 = this.a.g();
               $$4.add($$5);
               $$2.add($$5);
            }
         }

      }

      @Override
      public qc a() {
         return new pp();
      }

      @Override
      public int a(qc $$0, Supplier<qc> $$1) {
         int $$2 = 0;
         if ($$0 instanceof pp $$3) {
            int $$4 = $$3.size();
            if ($$4 == 0) {
               $$3.add((qc)$$1.get());
               ++$$2;
            } else {
               for(int $$5 = 0; $$5 < $$4; ++$$5) {
                  qc $$6 = $$3.k($$5);
                  if (this.b.test($$6)) {
                     qc $$7 = (qc)$$1.get();
                     if (!$$7.equals($$6) && $$3.a($$5, $$7)) {
                        ++$$2;
                     }
                  }
               }
            }
         }

         return $$2;
      }

      @Override
      public int a(qc $$0) {
         int $$1 = 0;
         if ($$0 instanceof pp $$2) {
            for(int $$3 = $$2.size() - 1; $$3 >= 0; --$$3) {
               if (this.b.test($$2.k($$3))) {
                  $$2.c($$3);
                  ++$$1;
               }
            }
         }

         return $$1;
      }
   }

   static class e implements eh.h {
      private final String a;
      private final pj b;
      private final Predicate<qc> c;

      public e(String $$0, pj $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = eh.a($$1);
      }

      @Override
      public void a(qc $$0, List<qc> $$1) {
         if ($$0 instanceof pj) {
            qc $$2 = ((pj)$$0).c(this.a);
            if (this.c.test($$2)) {
               $$1.add($$2);
            }
         }

      }

      @Override
      public void a(qc $$0, Supplier<qc> $$1, List<qc> $$2) {
         if ($$0 instanceof pj $$3) {
            qc $$4 = $$3.c(this.a);
            if ($$4 == null) {
               qc var6 = this.b.g();
               $$3.a(this.a, (qc)var6);
               $$2.add(var6);
            } else if (this.c.test($$4)) {
               $$2.add($$4);
            }
         }

      }

      @Override
      public qc a() {
         return new pj();
      }

      @Override
      public int a(qc $$0, Supplier<qc> $$1) {
         if ($$0 instanceof pj $$2) {
            qc $$3 = $$2.c(this.a);
            if (this.c.test($$3)) {
               qc $$4 = (qc)$$1.get();
               if (!$$4.equals($$3)) {
                  $$2.a(this.a, $$4);
                  return 1;
               }
            }
         }

         return 0;
      }

      @Override
      public int a(qc $$0) {
         if ($$0 instanceof pj $$1) {
            qc $$2 = $$1.c(this.a);
            if (this.c.test($$2)) {
               $$1.r(this.a);
               return 1;
            }
         }

         return 0;
      }
   }

   static class f implements eh.h {
      private final Predicate<qc> a;

      public f(pj $$0) {
         this.a = eh.a($$0);
      }

      @Override
      public void a(qc $$0, List<qc> $$1) {
         if ($$0 instanceof pj && this.a.test($$0)) {
            $$1.add($$0);
         }

      }

      @Override
      public void a(qc $$0, Supplier<qc> $$1, List<qc> $$2) {
         this.a($$0, $$2);
      }

      @Override
      public qc a() {
         return new pj();
      }

      @Override
      public int a(qc $$0, Supplier<qc> $$1) {
         return 0;
      }

      @Override
      public int a(qc $$0) {
         return 0;
      }
   }

   public static class g {
      private final String a;
      private final Object2IntMap<eh.h> b;
      private final eh.h[] c;

      public g(String $$0, eh.h[] $$1, Object2IntMap<eh.h> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public List<qc> a(qc $$0) throws CommandSyntaxException {
         List<qc> $$1 = Collections.singletonList($$0);

         for(eh.h $$2 : this.c) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               throw this.a($$2);
            }
         }

         return $$1;
      }

      public int b(qc $$0) {
         List<qc> $$1 = Collections.singletonList($$0);

         for(eh.h $$2 : this.c) {
            $$1 = $$2.a($$1);
            if ($$1.isEmpty()) {
               return 0;
            }
         }

         return $$1.size();
      }

      private List<qc> d(qc $$0) throws CommandSyntaxException {
         List<qc> $$1 = Collections.singletonList($$0);

         for(int $$2 = 0; $$2 < this.c.length - 1; ++$$2) {
            eh.h $$3 = this.c[$$2];
            int $$4 = $$2 + 1;
            $$1 = $$3.a($$1, this.c[$$4]::a);
            if ($$1.isEmpty()) {
               throw this.a($$3);
            }
         }

         return $$1;
      }

      public List<qc> a(qc $$0, Supplier<qc> $$1) throws CommandSyntaxException {
         List<qc> $$2 = this.d($$0);
         eh.h $$3 = this.c[this.c.length - 1];
         return $$3.a($$2, $$1);
      }

      private static int a(List<qc> $$0, Function<qc, Integer> $$1) {
         return $$0.stream().map($$1).reduce(0, ($$0x, $$1x) -> $$0x + $$1x);
      }

      public int a(qc $$0, qc $$1) throws CommandSyntaxException {
         return this.b($$0, $$1::c);
      }

      public int b(qc $$0, Supplier<qc> $$1) throws CommandSyntaxException {
         List<qc> $$2 = this.d($$0);
         eh.h $$3 = this.c[this.c.length - 1];
         return a($$2, $$2x -> $$3.a($$2x, $$1));
      }

      public int c(qc $$0) {
         List<qc> $$1 = Collections.singletonList($$0);

         for(int $$2 = 0; $$2 < this.c.length - 1; ++$$2) {
            $$1 = this.c[$$2].a($$1);
         }

         eh.h $$3 = this.c[this.c.length - 1];
         return a($$1, $$3::a);
      }

      private CommandSyntaxException a(eh.h $$0) {
         int $$1 = this.b.getInt($$0);
         return eh.b.create(this.a.substring(0, $$1));
      }

      public String toString() {
         return this.a;
      }
   }

   interface h {
      void a(qc var1, List<qc> var2);

      void a(qc var1, Supplier<qc> var2, List<qc> var3);

      qc a();

      int a(qc var1, Supplier<qc> var2);

      int a(qc var1);

      default List<qc> a(List<qc> $$0) {
         return this.a($$0, this::a);
      }

      default List<qc> a(List<qc> $$0, Supplier<qc> $$1) {
         return this.a($$0, (BiConsumer<qc, List<qc>>)(($$1x, $$2) -> this.a($$1x, $$1, $$2)));
      }

      default List<qc> a(List<qc> $$0, BiConsumer<qc, List<qc>> $$1) {
         List<qc> $$2 = Lists.newArrayList();

         for(qc $$3 : $$0) {
            $$1.accept($$3, $$2);
         }

         return $$2;
      }
   }
}
