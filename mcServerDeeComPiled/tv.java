import com.google.common.collect.Queues;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Queue;
import java.util.function.BiPredicate;
import javax.annotation.Nullable;

public class tv implements tc<tf> {
   private static final byte a = 3;
   private static final byte b = 4;
   private static final byte c = 8;
   private static final byte d = 16;
   private static final byte e = 0;
   private static final byte f = 1;
   private static final byte g = 2;
   private final int h;
   private final List<tv.b> i;

   public tv(RootCommandNode<dt> $$0) {
      Object2IntMap<CommandNode<dt>> $$1 = a($$0);
      this.i = a($$1);
      this.h = $$1.getInt($$0);
   }

   public tv(qx $$0) {
      this.i = $$0.a(tv::b);
      this.h = $$0.k();
      a(this.i);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.i, ($$0x, $$1) -> $$1.a($$0x));
      $$0.d(this.h);
   }

   private static void a(List<tv.b> $$0, BiPredicate<tv.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while(!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test((tv.b)$$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }

   }

   private static void a(List<tv.b> $$0) {
      a($$0, tv.b::a);
      a($$0, tv.b::b);
   }

   private static Object2IntMap<CommandNode<dt>> a(RootCommandNode<dt> $$0) {
      Object2IntMap<CommandNode<dt>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<dt>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<dt> $$3;
      while(($$3 = (CommandNode)$$2.poll()) != null) {
         if (!$$1.containsKey($$3)) {
            int $$4 = $$1.size();
            $$1.put($$3, $$4);
            $$2.addAll($$3.getChildren());
            if ($$3.getRedirect() != null) {
               $$2.add($$3.getRedirect());
            }
         }
      }

      return $$1;
   }

   private static List<tv.b> a(Object2IntMap<CommandNode<dt>> $$0) {
      ObjectArrayList<tv.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while(var2.hasNext()) {
         Entry<CommandNode<dt>> $$2 = (Entry)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<dt>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static tv.b b(qx $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.k() : 0;
      tv.e $$4 = a($$0, $$1);
      return new tv.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static tv.e a(qx $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.q();
         int $$4 = $$0.k();
         gf<?, ?> $$5 = hm.am.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            gf.a<?> $$6 = $$5.b($$0);
            abb $$7 = ($$1 & 16) != 0 ? $$0.r() : null;
            return new tv.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.q();
         return new tv.c($$8);
      } else {
         return null;
      }
   }

   private static tv.b a(CommandNode<dt> $$0, Object2IntMap<CommandNode<dt>> $$1) {
      int $$2 = 0;
      int $$3;
      if ($$0.getRedirect() != null) {
         $$2 |= 8;
         $$3 = $$1.getInt($$0.getRedirect());
      } else {
         $$3 = 0;
      }

      if ($$0.getCommand() != null) {
         $$2 |= 4;
      }

      tv.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode $$6) {
         $$5 = new tv.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         LiteralCommandNode $$8 = (LiteralCommandNode)$$0;
         $$5 = new tv.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new tv.b($$5, $$2, $$3, $$11);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public RootCommandNode<dt> a(dl $$0) {
      return (RootCommandNode<dt>)new tv.d($$0, this.i).a(this.h);
   }

   static class a implements tv.e {
      private final String a;
      private final gf.a<?> b;
      @Nullable
      private final abb c;

      @Nullable
      private static abb a(@Nullable SuggestionProvider<dt> $$0) {
         return $$0 != null ? gj.a($$0) : null;
      }

      a(String $$0, gf.a<?> $$1, @Nullable abb $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<dt, ?> $$0) {
         this($$0.getName(), gg.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<dt, ?> a(dl $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<dt, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(gj.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(qx $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }

      }

      private static <A extends ArgumentType<?>> void a(qx $$0, gf.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends gf.a<A>> void a(qx $$0, gf<A, T> $$1, gf.a<A> $$2) {
         $$0.d(hm.am.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final tv.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable tv.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(qx $$0) {
         $$0.writeByte(this.b);
         $$0.a(this.d);
         if ((this.b & 8) != 0) {
            $$0.d(this.c);
         }

         if (this.a != null) {
            this.a.a($$0);
         }

      }

      public boolean a(IntSet $$0) {
         if ((this.b & 8) != 0) {
            return !$$0.contains(this.c);
         } else {
            return true;
         }
      }

      public boolean b(IntSet $$0) {
         for(int $$1 : this.d) {
            if ($$0.contains($$1)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c implements tv.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<dt, ?> a(dl $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(qx $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final dl a;
      private final List<tv.b> b;
      private final List<CommandNode<dt>> c;

      d(dl $$0, List<tv.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<dt>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<dt> a(int $$0) {
         CommandNode<dt> $$1 = (CommandNode)this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            tv.b $$2 = (tv.b)this.b.get($$0);
            CommandNode<dt> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<dt, ?> $$4 = $$2.a.a(this.a);
               if (($$2.b & 8) != 0) {
                  $$4.redirect(this.a($$2.c));
               }

               if (($$2.b & 4) != 0) {
                  $$4.executes($$0x -> 0);
               }

               $$3 = $$4.build();
            }

            this.c.set($$0, $$3);

            for(int $$6 : $$2.d) {
               CommandNode<dt> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<dt, ?> a(dl var1);

      void a(qx var1);
   }
}
