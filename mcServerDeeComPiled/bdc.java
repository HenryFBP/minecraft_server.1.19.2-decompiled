import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bdc {
   private final Map<bcy, bcz> a;

   public bdc(Map<bcy, bcz> $$0) {
      this.a = ImmutableMap.copyOf($$0);
   }

   private bcz d(bcy $$0) {
      bcz $$1 = (bcz)this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + hm.ak.b($$0));
      } else {
         return $$1;
      }
   }

   public double a(bcy $$0) {
      return this.d($$0).f();
   }

   public double b(bcy $$0) {
      return this.d($$0).b();
   }

   public double a(bcy $$0, UUID $$1) {
      bdb $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + hm.ak.b($$0));
      } else {
         return $$2.d();
      }
   }

   @Nullable
   public bcz a(Consumer<bcz> $$0, bcy $$1) {
      bcz $$2 = (bcz)this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         bcz $$3 = new bcz($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static bdc.a a() {
      return new bdc.a();
   }

   public boolean c(bcy $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(bcy $$0, UUID $$1) {
      bcz $$2 = (bcz)this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Map<bcy, bcz> a = Maps.newHashMap();
      private boolean b;

      private bcz b(bcy $$0) {
         bcz $$1 = new bcz($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + hm.ak.b($$0));
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public bdc.a a(bcy $$0) {
         this.b($$0);
         return this;
      }

      public bdc.a a(bcy $$0, double $$1) {
         bcz $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public bdc a() {
         this.b = true;
         return new bdc(this.a);
      }
   }
}
