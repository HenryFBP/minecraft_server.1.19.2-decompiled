import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;

public class dsg {
   static final Logger c = LogUtils.getLogger();
   public static final dsg a = new dsg(duk.a, new dsf[0], new dto[0]);
   public static final duj b = duk.k;
   final duj d;
   final dsf[] e;
   final dto[] f;
   private final BiFunction<cax, dsd, cax> g;

   dsg(duj $$0, dsf[] $$1, dto[] $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = dtq.a($$2);
   }

   public static Consumer<cax> a(Consumer<cax> $$0) {
      return $$1 -> {
         if ($$1.K() < $$1.f()) {
            $$0.accept($$1);
         } else {
            int $$2 = $$1.K();

            while($$2 > 0) {
               cax $$3 = $$1.o();
               $$3.e(Math.min($$1.f(), $$2));
               $$2 -= $$3.K();
               $$0.accept($$3);
            }
         }

      };
   }

   public void a(dsd $$0, Consumer<cax> $$1) {
      if ($$0.a(this)) {
         Consumer<cax> $$2 = dto.a(this.g, $$1, $$0);

         for(dsf $$3 : this.e) {
            $$3.a($$2, $$0);
         }

         $$0.b(this);
      } else {
         c.warn("Detected infinite loop in loot tables");
      }

   }

   public void b(dsd $$0, Consumer<cax> $$1) {
      this.a($$0, a($$1));
   }

   public ObjectArrayList<cax> a(dsd $$0) {
      ObjectArrayList<cax> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public duj a() {
      return this.d;
   }

   public void a(dsl $$0) {
      for(int $$1 = 0; $$1 < this.e.length; ++$$1) {
         this.e[$$1].a($$0.b(".pools[" + $$1 + "]"));
      }

      for(int $$2 = 0; $$2 < this.f.length; ++$$2) {
         this.f[$$2].a($$0.b(".functions[" + $$2 + "]"));
      }

   }

   public void a(bac $$0, dsd $$1) {
      ObjectArrayList<cax> $$2 = this.a($$1);
      amn $$3 = $$1.a();
      List<Integer> $$4 = this.a($$0, $$3);
      this.a($$2, $$4.size(), $$3);
      ObjectListIterator var6 = $$2.iterator();

      while(var6.hasNext()) {
         cax $$5 = (cax)var6.next();
         if ($$4.isEmpty()) {
            c.warn("Tried to over-fill a container");
            return;
         }

         if ($$5.b()) {
            $$0.a($$4.remove($$4.size() - 1), cax.b);
         } else {
            $$0.a($$4.remove($$4.size() - 1), $$5);
         }
      }

   }

   private void a(ObjectArrayList<cax> $$0, int $$1, amn $$2) {
      List<cax> $$3 = Lists.newArrayList();
      Iterator<cax> $$4 = $$0.iterator();

      while($$4.hasNext()) {
         cax $$5 = (cax)$$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.K() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cax $$6 = (cax)$$3.remove(ami.a($$2, 0, $$3.size() - 1));
         int $$7 = ami.a($$2, 1, $$6.K() / 2);
         cax $$8 = $$6.a($$7);
         if ($$6.K() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.K() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ad.b($$0, $$2);
   }

   private List<Integer> a(bac $$0, amn $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ad.b($$2, $$1);
      return $$2;
   }

   public static dsg.a b() {
      return new dsg.a();
   }

   public static class a implements dtl<dsg.a> {
      private final List<dsf> a = Lists.newArrayList();
      private final List<dto> b = Lists.newArrayList();
      private duj c = dsg.b;

      public dsg.a a(dsf.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public dsg.a a(duj $$0) {
         this.c = $$0;
         return this;
      }

      public dsg.a a(dto.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public dsg.a a() {
         return this;
      }

      public dsg b() {
         return new dsg(this.c, (dsf[])this.a.toArray(new dsf[0]), (dto[])this.b.toArray(new dto[0]));
      }
   }

   public static class b implements JsonDeserializer<dsg>, JsonSerializer<dsg> {
      public dsg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = alz.m($$0, "loot table");
         dsf[] $$4 = alz.a($$3, "pools", new dsf[0], $$2, dsf[].class);
         duj $$5 = null;
         if ($$3.has("type")) {
            String $$6 = alz.h($$3, "type");
            $$5 = duk.a(new abb($$6));
         }

         dto[] $$7 = alz.a($$3, "functions", new dto[0], $$2, dto[].class);
         return new dsg($$5 != null ? $$5 : duk.k, $$4, $$7);
      }

      public JsonElement a(dsg $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         if ($$0.d != dsg.b) {
            abb $$4 = duk.a($$0.d);
            if ($$4 != null) {
               $$3.addProperty("type", $$4.toString());
            } else {
               dsg.c.warn("Failed to find id for param set {}", $$0.d);
            }
         }

         if ($$0.e.length > 0) {
            $$3.add("pools", $$2.serialize($$0.e));
         }

         if (!ArrayUtils.isEmpty($$0.f)) {
            $$3.add("functions", $$2.serialize($$0.f));
         }

         return $$3;
      }
   }
}
