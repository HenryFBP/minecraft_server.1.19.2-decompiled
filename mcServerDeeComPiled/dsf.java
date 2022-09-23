import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.mutable.MutableInt;

public class dsf {
   final dsv[] a;
   final dux[] b;
   private final Predicate<dsd> c;
   final dto[] d;
   private final BiFunction<cax, dsd, cax> e;
   final dvs f;
   final dvs g;

   dsf(dsv[] $$0, dux[] $$1, dto[] $$2, dvs $$3, dvs $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = duz.a($$1);
      this.d = $$2;
      this.e = dtq.a($$2);
      this.f = $$3;
      this.g = $$4;
   }

   private void b(Consumer<cax> $$0, dsd $$1) {
      amn $$2 = $$1.a();
      List<dsu> $$3 = Lists.newArrayList();
      MutableInt $$4 = new MutableInt();

      for(dsv $$5 : this.a) {
         $$5.expand($$1, $$3x -> {
            int $$4x = $$3x.a($$1.b());
            if ($$4x > 0) {
               $$3.add($$3x);
               $$4.add($$4x);
            }

         });
      }

      int $$6 = $$3.size();
      if ($$4.intValue() != 0 && $$6 != 0) {
         if ($$6 == 1) {
            ((dsu)$$3.get(0)).a($$0, $$1);
         } else {
            int $$7 = $$2.a($$4.intValue());

            for(dsu $$8 : $$3) {
               $$7 -= $$8.a($$1.b());
               if ($$7 < 0) {
                  $$8.a($$0, $$1);
                  return;
               }
            }

         }
      }
   }

   public void a(Consumer<cax> $$0, dsd $$1) {
      if (this.c.test($$1)) {
         Consumer<cax> $$2 = dto.a(this.e, $$0, $$1);
         int $$3 = this.f.a($$1) + ami.d(this.g.b($$1) * $$1.b());

         for(int $$4 = 0; $$4 < $$3; ++$$4) {
            this.b($$2, $$1);
         }

      }
   }

   public void a(dsl $$0) {
      for(int $$1 = 0; $$1 < this.b.length; ++$$1) {
         this.b[$$1].a($$0.b(".condition[" + $$1 + "]"));
      }

      for(int $$2 = 0; $$2 < this.d.length; ++$$2) {
         this.d[$$2].a($$0.b(".functions[" + $$2 + "]"));
      }

      for(int $$3 = 0; $$3 < this.a.length; ++$$3) {
         this.a[$$3].a($$0.b(".entries[" + $$3 + "]"));
      }

      this.f.a($$0.b(".rolls"));
      this.g.a($$0.b(".bonusRolls"));
   }

   public static dsf.a a() {
      return new dsf.a();
   }

   public static class a implements dtl<dsf.a>, duq<dsf.a> {
      private final List<dsv> a = Lists.newArrayList();
      private final List<dux> b = Lists.newArrayList();
      private final List<dto> c = Lists.newArrayList();
      private dvs d = dvq.a(1.0F);
      private dvs e = dvq.a(0.0F);

      public dsf.a a(dvs $$0) {
         this.d = $$0;
         return this;
      }

      public dsf.a a() {
         return this;
      }

      public dsf.a b(dvs $$0) {
         this.e = $$0;
         return this;
      }

      public dsf.a a(dsv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      public dsf.a a(dux.a $$0) {
         this.b.add($$0.build());
         return this;
      }

      public dsf.a a(dto.a $$0) {
         this.c.add($$0.b());
         return this;
      }

      public dsf b() {
         if (this.d == null) {
            throw new IllegalArgumentException("Rolls not set");
         } else {
            return new dsf((dsv[])this.a.toArray(new dsv[0]), (dux[])this.b.toArray(new dux[0]), (dto[])this.c.toArray(new dto[0]), this.d, this.e);
         }
      }
   }

   public static class b implements JsonDeserializer<dsf>, JsonSerializer<dsf> {
      public dsf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = alz.m($$0, "loot pool");
         dsv[] $$4 = alz.a($$3, "entries", $$2, dsv[].class);
         dux[] $$5 = alz.a($$3, "conditions", new dux[0], $$2, dux[].class);
         dto[] $$6 = alz.a($$3, "functions", new dto[0], $$2, dto[].class);
         dvs $$7 = alz.a($$3, "rolls", $$2, dvs.class);
         dvs $$8 = alz.a($$3, "bonus_rolls", dvq.a(0.0F), $$2, dvs.class);
         return new dsf($$4, $$5, $$6, $$7, $$8);
      }

      public JsonElement a(dsf $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         $$3.add("rolls", $$2.serialize($$0.f));
         $$3.add("bonus_rolls", $$2.serialize($$0.g));
         $$3.add("entries", $$2.serialize($$0.a));
         if (!ArrayUtils.isEmpty($$0.b)) {
            $$3.add("conditions", $$2.serialize($$0.b));
         }

         if (!ArrayUtils.isEmpty($$0.d)) {
            $$3.add("functions", $$2.serialize($$0.d));
         }

         return $$3;
      }
   }
}
