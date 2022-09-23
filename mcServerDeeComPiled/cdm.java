import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public final class cdm implements Predicate<cax> {
   public static final cdm a = new cdm(Stream.empty());
   private final cdm.c[] b;
   @Nullable
   private cax[] c;
   @Nullable
   private IntList d;

   private cdm(Stream<? extends cdm.c> $$0) {
      this.b = (cdm.c[])$$0.toArray($$0x -> new cdm.c[$$0x]);
   }

   public cax[] a() {
      this.f();
      return this.c;
   }

   private void f() {
      if (this.c == null) {
         this.c = (cax[])Arrays.stream(this.b).flatMap($$0 -> $$0.a().stream()).distinct().toArray($$0 -> new cax[$$0]);
      }

   }

   public boolean a(@Nullable cax $$0) {
      if ($$0 == null) {
         return false;
      } else {
         this.f();
         if (this.c.length == 0) {
            return $$0.b();
         } else {
            for(cax $$1 : this.c) {
               if ($$1.a($$0.c())) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public IntList b() {
      if (this.d == null) {
         this.f();
         this.d = new IntArrayList(this.c.length);

         for(cax $$0 : this.c) {
            this.d.add(bug.c($$0));
         }

         this.d.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.d;
   }

   public void a(qx $$0) {
      this.f();
      $$0.a(Arrays.asList(this.c), qx::a);
   }

   public JsonElement c() {
      if (this.b.length == 1) {
         return this.b[0].b();
      } else {
         JsonArray $$0 = new JsonArray();

         for(cdm.c $$1 : this.b) {
            $$0.add($$1.b());
         }

         return $$0;
      }
   }

   public boolean d() {
      return this.b.length == 0 && (this.c == null || this.c.length == 0) && (this.d == null || this.d.isEmpty());
   }

   private static cdm b(Stream<? extends cdm.c> $$0) {
      cdm $$1 = new cdm($$0);
      return $$1.b.length == 0 ? a : $$1;
   }

   public static cdm e() {
      return a;
   }

   public static cdm a(cgw... $$0) {
      return a(Arrays.stream($$0).map(cax::new));
   }

   public static cdm a(cax... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cdm a(Stream<cax> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cdm.a::new));
   }

   public static cdm a(akz<cat> $$0) {
      return b(Stream.of(new cdm.b($$0)));
   }

   public static cdm b(qx $$0) {
      return b($$0.a(qx::p).stream().map(cdm.a::new));
   }

   public static cdm a(@Nullable JsonElement $$0) {
      if ($$0 == null || $$0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if ($$0.isJsonObject()) {
         return b(Stream.of(a($$0.getAsJsonObject())));
      } else if ($$0.isJsonArray()) {
         JsonArray $$1 = $$0.getAsJsonArray();
         if ($$1.size() == 0) {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         } else {
            return b(StreamSupport.stream($$1.spliterator(), false).map($$0x -> a(alz.m($$0x, "item"))));
         }
      } else {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      }
   }

   private static cdm.c a(JsonObject $$0) {
      if ($$0.has("item") && $$0.has("tag")) {
         throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
      } else if ($$0.has("item")) {
         cat $$1 = cdu.b($$0);
         return new cdm.a(new cax($$1));
      } else if ($$0.has("tag")) {
         abb $$2 = new abb(alz.h($$0, "tag"));
         akz<cat> $$3 = akz.a(hm.k, $$2);
         return new cdm.b($$3);
      } else {
         throw new JsonParseException("An ingredient entry needs either a tag or an item");
      }
   }

   static class a implements cdm.c {
      private final cax a;

      a(cax $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<cax> a() {
         return Collections.singleton(this.a);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("item", hm.Y.b(this.a.c()).toString());
         return $$0;
      }
   }

   static class b implements cdm.c {
      private final akz<cat> a;

      b(akz<cat> $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<cax> a() {
         List<cax> $$0 = Lists.newArrayList();

         for(hc<cat> $$1 : hm.Y.d(this.a)) {
            $$0.add(new cax($$1));
         }

         return $$0;
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("tag", this.a.b().toString());
         return $$0;
      }
   }

   interface c {
      Collection<cax> a();

      JsonObject b();
   }
}
