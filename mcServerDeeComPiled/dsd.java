import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class dsd {
   private final amn a;
   private final float b;
   private final agg c;
   private final Function<abb, dsg> d;
   private final Set<dsg> e = Sets.newLinkedHashSet();
   private final Function<abb, dux> f;
   private final Set<dux> g = Sets.newLinkedHashSet();
   private final Map<dui<?>, Object> h;
   private final Map<abb, dsd.b> i;

   dsd(amn $$0, float $$1, agg $$2, Function<abb, dsg> $$3, Function<abb, dux> $$4, Map<dui<?>, Object> $$5, Map<abb, dsd.b> $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.f = $$4;
      this.h = ImmutableMap.copyOf($$5);
      this.i = ImmutableMap.copyOf($$6);
   }

   public boolean a(dui<?> $$0) {
      return this.h.containsKey($$0);
   }

   public <T> T b(dui<T> $$0) {
      T $$1 = (T)this.h.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException($$0.a().toString());
      } else {
         return $$1;
      }
   }

   public void a(abb $$0, Consumer<cax> $$1) {
      dsd.b $$2 = (dsd.b)this.i.get($$0);
      if ($$2 != null) {
         $$2.add(this, $$1);
      }

   }

   @Nullable
   public <T> T c(dui<T> $$0) {
      return (T)this.h.get($$0);
   }

   public boolean a(dsg $$0) {
      return this.e.add($$0);
   }

   public void b(dsg $$0) {
      this.e.remove($$0);
   }

   public boolean a(dux $$0) {
      return this.g.add($$0);
   }

   public void b(dux $$0) {
      this.g.remove($$0);
   }

   public dsg a(abb $$0) {
      return (dsg)this.d.apply($$0);
   }

   @Nullable
   public dux b(abb $$0) {
      return (dux)this.f.apply($$0);
   }

   public amn a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public agg c() {
      return this.c;
   }

   public static class a {
      private final agg a;
      private final Map<dui<?>, Object> b = Maps.newIdentityHashMap();
      private final Map<abb, dsd.b> c = Maps.newHashMap();
      private amn d;
      private float e;

      public a(agg $$0) {
         this.a = $$0;
      }

      public dsd.a a(amn $$0) {
         this.d = $$0;
         return this;
      }

      public dsd.a a(long $$0) {
         if ($$0 != 0L) {
            this.d = amn.a($$0);
         }

         return this;
      }

      public dsd.a a(long $$0, amn $$1) {
         if ($$0 == 0L) {
            this.d = $$1;
         } else {
            this.d = amn.a($$0);
         }

         return this;
      }

      public dsd.a a(float $$0) {
         this.e = $$0;
         return this;
      }

      public <T> dsd.a a(dui<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public <T> dsd.a b(dui<T> $$0, @Nullable T $$1) {
         if ($$1 == null) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         return this;
      }

      public dsd.a a(abb $$0, dsd.b $$1) {
         dsd.b $$2 = (dsd.b)this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public agg a() {
         return this.a;
      }

      public <T> T a(dui<T> $$0) {
         T $$1 = (T)this.b.get($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("No parameter " + $$0);
         } else {
            return $$1;
         }
      }

      @Nullable
      public <T> T b(dui<T> $$0) {
         return (T)this.b.get($$0);
      }

      public dsd a(duj $$0) {
         Set<dui<?>> $$1 = Sets.difference(this.b.keySet(), $$0.b());
         if (!$$1.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + $$1);
         } else {
            Set<dui<?>> $$2 = Sets.difference($$0.a(), this.b.keySet());
            if (!$$2.isEmpty()) {
               throw new IllegalArgumentException("Missing required parameters: " + $$2);
            } else {
               amn $$3 = this.d;
               if ($$3 == null) {
                  $$3 = amn.a();
               }

               MinecraftServer $$4 = this.a.n();
               return new dsd($$3, this.e, this.a, $$4.aH()::a, $$4.aI()::a, this.b, this.c);
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void add(dsd var1, Consumer<cax> var2);
   }

   public static enum c {
      a("this", dul.a),
      b("killer", dul.d),
      c("direct_killer", dul.e),
      d("killer_player", dul.b);

      final String e;
      private final dui<? extends bbn> f;

      private c(String $$0, dui<? extends bbn> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public dui<? extends bbn> a() {
         return this.f;
      }

      public static dsd.c a(String $$0) {
         for(dsd.c $$1 : values()) {
            if ($$1.e.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid entity target " + $$0);
      }

      public static class a extends TypeAdapter<dsd.c> {
         public void a(JsonWriter $$0, dsd.c $$1) throws IOException {
            $$0.value($$1.e);
         }

         public dsd.c a(JsonReader $$0) throws IOException {
            return dsd.c.a($$0.nextString());
         }
      }
   }
}
