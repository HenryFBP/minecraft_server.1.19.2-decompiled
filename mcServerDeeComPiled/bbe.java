import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bbe {
   private final Map<bcy, bdb> a = Maps.newHashMap();
   private final bbf b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bbg.a> e = () -> null;

   @Nullable
   public static bbe a(int $$0) {
      return hm.U.a($$0);
   }

   public static int a(bbe $$0) {
      return hm.U.a($$0);
   }

   public static int b(@Nullable bbe $$0) {
      return hm.U.a($$0);
   }

   protected bbe(bbf $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bbg.a> b() {
      return Optional.ofNullable((bbg.a)this.e.get());
   }

   public void a(bcc $$0, int $$1) {
      if (this == bbi.j) {
         if ($$0.ef() < $$0.et()) {
            $$0.b(1.0F);
         }
      } else if (this == bbi.s) {
         if ($$0.ef() > 1.0F) {
            $$0.a(baw.o, 1.0F);
         }
      } else if (this == bbi.t) {
         $$0.a(baw.p, 1.0F);
      } else if (this == bbi.q && $$0 instanceof buc) {
         ((buc)$$0).u(0.005F * (float)($$1 + 1));
      } else if (this == bbi.w && $$0 instanceof buc) {
         if (!$$0.s.y) {
            ((buc)$$0).fL().a($$1 + 1, 1.0F);
         }
      } else if ((this != bbi.f || $$0.ee()) && (this != bbi.g || !$$0.ee())) {
         if (this == bbi.g && !$$0.ee() || this == bbi.f && $$0.ee()) {
            $$0.a(baw.o, (float)(6 << $$1));
         }
      } else {
         $$0.b((float)Math.max(4 << $$1, 0));
      }

   }

   public void a(@Nullable bbn $$0, @Nullable bbn $$1, bcc $$2, int $$3, double $$4) {
      if ((this != bbi.f || $$2.ee()) && (this != bbi.g || !$$2.ee())) {
         if (this == bbi.g && !$$2.ee() || this == bbi.f && $$2.ee()) {
            int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
            if ($$0 == null) {
               $$2.a(baw.o, (float)$$6);
            } else {
               $$2.a(baw.c($$0, $$1), (float)$$6);
            }
         } else {
            this.a($$2, $$3);
         }
      } else {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.b((float)$$5);
      }

   }

   public boolean a(int $$0, int $$1) {
      if (this == bbi.j) {
         int $$2 = 50 >> $$1;
         if ($$2 > 0) {
            return $$0 % $$2 == 0;
         } else {
            return true;
         }
      } else if (this == bbi.s) {
         int $$3 = 25 >> $$1;
         if ($$3 > 0) {
            return $$0 % $$3 == 0;
         } else {
            return true;
         }
      } else if (this == bbi.t) {
         int $$4 = 40 >> $$1;
         if ($$4 > 0) {
            return $$0 % $$4 == 0;
         } else {
            return true;
         }
      } else {
         return this == bbi.q;
      }
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ad.a("effect", hm.U.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public rq e() {
      return rq.c(this.d());
   }

   public bbf f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bbe a(bcy $$0, String $$1, double $$2, bdb.a $$3) {
      bdb $$4 = new bdb(UUID.fromString($$1), this::d, $$2, $$3);
      this.a.put($$0, $$4);
      return this;
   }

   public bbe a(Supplier<bbg.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bcy, bdb> h() {
      return this.a;
   }

   public void a(bcc $$0, bda $$1, int $$2) {
      for(Entry<bcy, bdb> $$3 : this.a.entrySet()) {
         bcz $$4 = $$1.a((bcy)$$3.getKey());
         if ($$4 != null) {
            $$4.d((bdb)$$3.getValue());
         }
      }

   }

   public void b(bcc $$0, bda $$1, int $$2) {
      for(Entry<bcy, bdb> $$3 : this.a.entrySet()) {
         bcz $$4 = $$1.a((bcy)$$3.getKey());
         if ($$4 != null) {
            bdb $$5 = (bdb)$$3.getValue();
            $$4.d($$5);
            $$4.c(new bdb($$5.a(), this.d() + " " + $$2, this.a($$2, $$5), $$5.c()));
         }
      }

   }

   public double a(int $$0, bdb $$1) {
      return $$1.d() * (double)($$0 + 1);
   }

   public boolean i() {
      return this.b == bbf.a;
   }
}
