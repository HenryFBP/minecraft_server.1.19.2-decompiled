import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dtr extends dtn {
   public static final int a = 0;
   final dvs b;
   final int c;

   dtr(dux[] $$0, dvs $$1, int $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public dtp a() {
      return dtq.h;
   }

   @Override
   public Set<dui<?>> b() {
      return Sets.union(ImmutableSet.of(dul.d), this.b.b());
   }

   boolean c() {
      return this.c > 0;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      bbn $$2 = $$1.c(dul.d);
      if ($$2 instanceof bcc) {
         int $$3 = cet.h((bcc)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.b.b($$1);
         $$0.f(Math.round($$4));
         if (this.c() && $$0.K() > this.c) {
            $$0.e(this.c);
         }
      }

      return $$0;
   }

   public static dtr.a a(dvs $$0) {
      return new dtr.a($$0);
   }

   public static class a extends dtn.a<dtr.a> {
      private final dvs a;
      private int b = 0;

      public a(dvs $$0) {
         this.a = $$0;
      }

      protected dtr.a a() {
         return this;
      }

      public dtr.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public dto b() {
         return new dtr(this.g(), this.a, this.b);
      }
   }

   public static class b extends dtn.c<dtr> {
      public void a(JsonObject $$0, dtr $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("count", $$2.serialize($$1.b));
         if ($$1.c()) {
            $$0.add("limit", $$2.serialize($$1.c));
         }

      }

      public dtr a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         int $$3 = alz.a($$0, "limit", 0);
         return new dtr($$2, alz.a($$0, "count", $$1, dvs.class), $$3);
      }
   }
}
