import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bdb {
   private static final Logger a = LogUtils.getLogger();
   private final double b;
   private final bdb.a c;
   private final Supplier<String> d;
   private final UUID e;

   public bdb(String $$0, double $$1, bdb.a $$2) {
      this(ami.a(amn.c()), (Supplier<String>)(() -> $$0), $$1, $$2);
   }

   public bdb(UUID $$0, String $$1, double $$2, bdb.a $$3) {
      this($$0, (Supplier<String>)(() -> $$1), $$2, $$3);
   }

   public bdb(UUID $$0, Supplier<String> $$1, double $$2, bdb.a $$3) {
      this.e = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public UUID a() {
      return this.e;
   }

   public String b() {
      return (String)this.d.get();
   }

   public bdb.a c() {
      return this.c;
   }

   public double d() {
      return this.b;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bdb $$1 = (bdb)$$0;
         return Objects.equals(this.e, $$1.e);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.e.hashCode();
   }

   public String toString() {
      return "AttributeModifier{amount=" + this.b + ", operation=" + this.c + ", name='" + (String)this.d.get() + "', id=" + this.e + "}";
   }

   public pj e() {
      pj $$0 = new pj();
      $$0.a("Name", this.b());
      $$0.a("Amount", this.b);
      $$0.a("Operation", this.c.a());
      $$0.a("UUID", this.e);
      return $$0;
   }

   @Nullable
   public static bdb a(pj $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bdb.a $$2 = bdb.a.a($$0.h("Operation"));
         return new bdb($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         a.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a {
      a(0),
      b(1),
      c(2);

      private static final bdb.a[] d = new bdb.a[]{a, b, c};
      private final int e;

      private a(int $$0) {
         this.e = $$0;
      }

      public int a() {
         return this.e;
      }

      public static bdb.a a(int $$0) {
         if ($$0 >= 0 && $$0 < d.length) {
            return d[$$0];
         } else {
            throw new IllegalArgumentException("No operation with value " + $$0);
         }
      }
   }
}
