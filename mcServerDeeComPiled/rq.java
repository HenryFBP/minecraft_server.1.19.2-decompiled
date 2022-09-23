import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.Message;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface rq extends Message, ru {
   sj a();

   rr b();

   @Override
   default String getString() {
      return ru.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((ru.a)($$2 -> {
         int $$3 = $$0 - $$1.length();
         if ($$3 <= 0) {
            return a;
         } else {
            $$1.append($$2.length() <= $$3 ? $$2 : $$2.substring(0, $$3));
            return Optional.empty();
         }
      }));
      return $$1.toString();
   }

   List<rq> c();

   default sb d() {
      return sb.a(this.b());
   }

   default sb e() {
      return new sb(this.b(), new ArrayList(this.c()), this.a());
   }

   alu f();

   @Override
   default <T> Optional<T> a(ru.b<T> $$0, sj $$1) {
      sj $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for(rq $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(ru.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for(rq $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<rq> g() {
      return this.a(sj.a);
   }

   default List<rq> a(sj $$0) {
      List<rq> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(rq $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<rq> $$1 = this.g();
         List<rq> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static rq a(@Nullable String $$0) {
      return (rq)($$0 != null ? b($$0) : rp.a);
   }

   static sb b(String $$0) {
      return sb.a(new ss($$0));
   }

   static sb c(String $$0) {
      return sb.a(new sx($$0));
   }

   static sb a(String $$0, Object... $$1) {
      return sb.a(new sx($$0, $$1));
   }

   static sb h() {
      return sb.a(rr.a);
   }

   static sb d(String $$0) {
      return sb.a(new sq($$0));
   }

   static sb a(String $$0, boolean $$1, Optional<rq> $$2, so $$3) {
      return sb.a(new st($$0, $$1, $$2, $$3));
   }

   static sb a(String $$0, String $$1) {
      return sb.a(new su($$0, $$1));
   }

   static sb a(String $$0, Optional<rq> $$1) {
      return sb.a(new sv($$0, $$1));
   }

   public static class a implements JsonDeserializer<sb>, JsonSerializer<rq> {
      private static final Gson a = ad.a((Supplier<Gson>)(() -> {
         GsonBuilder $$0 = new GsonBuilder();
         $$0.disableHtmlEscaping();
         $$0.registerTypeHierarchyAdapter(rq.class, new rq.a());
         $$0.registerTypeHierarchyAdapter(sj.class, new sj.b());
         $$0.registerTypeAdapterFactory(new amf());
         return $$0.create();
      }));
      private static final Field b = ad.a((Supplier<Field>)(() -> {
         try {
            new JsonReader(new StringReader(""));
            Field $$0 = JsonReader.class.getDeclaredField("pos");
            $$0.setAccessible(true);
            return $$0;
         } catch (NoSuchFieldException var1) {
            throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", var1);
         }
      }));
      private static final Field c = ad.a((Supplier<Field>)(() -> {
         try {
            new JsonReader(new StringReader(""));
            Field $$0 = JsonReader.class.getDeclaredField("lineStart");
            $$0.setAccessible(true);
            return $$0;
         } catch (NoSuchFieldException var1) {
            throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", var1);
         }
      }));

      public sb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         if ($$0.isJsonPrimitive()) {
            return rq.b($$0.getAsString());
         } else if (!$$0.isJsonObject()) {
            if ($$0.isJsonArray()) {
               JsonArray $$29 = $$0.getAsJsonArray();
               sb $$30 = null;

               for(JsonElement $$31 : $$29) {
                  sb $$32 = this.a($$31, $$31.getClass(), $$2);
                  if ($$30 == null) {
                     $$30 = $$32;
                  } else {
                     $$30.b($$32);
                  }
               }

               return $$30;
            } else {
               throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
            }
         } else {
            JsonObject $$3 = $$0.getAsJsonObject();
            sb $$5;
            if ($$3.has("text")) {
               String $$4 = alz.h($$3, "text");
               $$5 = $$4.isEmpty() ? rq.h() : rq.b($$4);
            } else if ($$3.has("translate")) {
               String $$6 = alz.h($$3, "translate");
               if ($$3.has("with")) {
                  JsonArray $$7 = alz.u($$3, "with");
                  Object[] $$8 = new Object[$$7.size()];

                  for(int $$9 = 0; $$9 < $$8.length; ++$$9) {
                     $$8[$$9] = a(this.a($$7.get($$9), $$1, $$2));
                  }

                  $$5 = rq.a($$6, $$8);
               } else {
                  $$5 = rq.c($$6);
               }
            } else if ($$3.has("score")) {
               JsonObject $$12 = alz.t($$3, "score");
               if (!$$12.has("name") || !$$12.has("objective")) {
                  throw new JsonParseException("A score component needs a least a name and an objective");
               }

               $$5 = rq.a(alz.h($$12, "name"), alz.h($$12, "objective"));
            } else if ($$3.has("selector")) {
               Optional<rq> $$15 = this.a($$1, $$2, $$3);
               $$5 = rq.a(alz.h($$3, "selector"), $$15);
            } else if ($$3.has("keybind")) {
               $$5 = rq.d(alz.h($$3, "keybind"));
            } else {
               if (!$$3.has("nbt")) {
                  throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
               }

               String $$18 = alz.h($$3, "nbt");
               Optional<rq> $$19 = this.a($$1, $$2, $$3);
               boolean $$20 = alz.a($$3, "interpret", false);
               so $$21;
               if ($$3.has("block")) {
                  $$21 = new sn(alz.h($$3, "block"));
               } else if ($$3.has("entity")) {
                  $$21 = new sp(alz.h($$3, "entity"));
               } else {
                  if (!$$3.has("storage")) {
                     throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
                  }

                  $$21 = new sw(new abb(alz.h($$3, "storage")));
               }

               $$5 = rq.a($$18, $$20, $$19, $$21);
            }

            if ($$3.has("extra")) {
               JsonArray $$27 = alz.u($$3, "extra");
               if ($$27.size() <= 0) {
                  throw new JsonParseException("Unexpected empty array of components");
               }

               for(int $$28 = 0; $$28 < $$27.size(); ++$$28) {
                  $$5.b(this.a($$27.get($$28), $$1, $$2));
               }
            }

            $$5.b((sj)$$2.deserialize($$0, sj.class));
            return $$5;
         }
      }

      private static Object a(Object $$0) {
         if ($$0 instanceof rq $$1 && $$1.a().g() && $$1.c().isEmpty()) {
            rr $$2 = $$1.b();
            if ($$2 instanceof ss $$3) {
               return $$3.a();
            }
         }

         return $$0;
      }

      private Optional<rq> a(Type $$0, JsonDeserializationContext $$1, JsonObject $$2) {
         return $$2.has("separator") ? Optional.of(this.a($$2.get("separator"), $$0, $$1)) : Optional.empty();
      }

      private void a(sj $$0, JsonObject $$1, JsonSerializationContext $$2) {
         JsonElement $$3 = $$2.serialize($$0);
         if ($$3.isJsonObject()) {
            JsonObject $$4 = (JsonObject)$$3;

            for(Entry<String, JsonElement> $$5 : $$4.entrySet()) {
               $$1.add((String)$$5.getKey(), (JsonElement)$$5.getValue());
            }
         }

      }

      public JsonElement a(rq $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         if (!$$0.a().g()) {
            this.a($$0.a(), $$3, $$2);
         }

         if (!$$0.c().isEmpty()) {
            JsonArray $$4 = new JsonArray();

            for(rq $$5 : $$0.c()) {
               $$4.add(this.a($$5, rq.class, $$2));
            }

            $$3.add("extra", $$4);
         }

         rr $$6 = $$0.b();
         if ($$6 == rr.a) {
            $$3.addProperty("text", "");
         } else if ($$6 instanceof ss $$7) {
            $$3.addProperty("text", $$7.a());
         } else if ($$6 instanceof sx $$8) {
            $$3.addProperty("translate", $$8.a());
            if ($$8.b().length > 0) {
               JsonArray $$9 = new JsonArray();

               for(Object $$10 : $$8.b()) {
                  if ($$10 instanceof rq) {
                     $$9.add(this.a((rq)$$10, $$10.getClass(), $$2));
                  } else {
                     $$9.add(new JsonPrimitive(String.valueOf($$10)));
                  }
               }

               $$3.add("with", $$9);
            }
         } else if ($$6 instanceof su $$11) {
            JsonObject $$12 = new JsonObject();
            $$12.addProperty("name", $$11.a());
            $$12.addProperty("objective", $$11.c());
            $$3.add("score", $$12);
         } else if ($$6 instanceof sv $$13) {
            $$3.addProperty("selector", $$13.a());
            this.a($$2, $$3, $$13.c());
         } else if ($$6 instanceof sq $$14) {
            $$3.addProperty("keybind", $$14.a());
         } else {
            if (!($$6 instanceof st)) {
               throw new IllegalArgumentException("Don't know how to serialize " + $$6 + " as a Component");
            }

            st $$15 = (st)$$6;
            $$3.addProperty("nbt", $$15.a());
            $$3.addProperty("interpret", $$15.b());
            this.a($$2, $$3, $$15.c());
            so $$16 = $$15.d();
            if ($$16 instanceof sn $$17) {
               $$3.addProperty("block", $$17.a());
            } else if ($$16 instanceof sp $$18) {
               $$3.addProperty("entity", $$18.a());
            } else {
               if (!($$16 instanceof sw)) {
                  throw new IllegalArgumentException("Don't know how to serialize " + $$6 + " as a Component");
               }

               sw $$19 = (sw)$$16;
               $$3.addProperty("storage", $$19.a().toString());
            }
         }

         return $$3;
      }

      private void a(JsonSerializationContext $$0, JsonObject $$1, Optional<rq> $$2) {
         $$2.ifPresent($$2x -> $$1.add("separator", this.a($$2x, $$2x.getClass(), $$0)));
      }

      public static String a(rq $$0) {
         return a.toJson($$0);
      }

      public static String b(rq $$0) {
         return alz.e(c($$0));
      }

      public static JsonElement c(rq $$0) {
         return a.toJsonTree($$0);
      }

      @Nullable
      public static sb a(String $$0) {
         return alz.a(a, $$0, sb.class, false);
      }

      @Nullable
      public static sb a(JsonElement $$0) {
         return (sb)a.fromJson($$0, sb.class);
      }

      @Nullable
      public static sb b(String $$0) {
         return alz.a(a, $$0, sb.class, true);
      }

      public static sb a(com.mojang.brigadier.StringReader $$0) {
         try {
            JsonReader $$1 = new JsonReader(new StringReader($$0.getRemaining()));
            $$1.setLenient(false);
            sb $$2 = (sb)a.getAdapter(sb.class).read($$1);
            $$0.setCursor($$0.getCursor() + a($$1));
            return $$2;
         } catch (StackOverflowError | IOException var3) {
            throw new JsonParseException(var3);
         }
      }

      private static int a(JsonReader $$0) {
         try {
            return b.getInt($$0) - c.getInt($$0) + 1;
         } catch (IllegalAccessException var2) {
            throw new IllegalStateException("Couldn't read position of JsonReader", var2);
         }
      }
   }
}
