import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class xg implements tc<tf> {
   private final int a;
   private final List<xg.a> b;

   public xg(int $$0, Collection<bcz> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for(bcz $$2 : $$1) {
         this.b.add(new xg.a($$2.a(), $$2.b(), $$2.c()));
      }

   }

   public xg(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.a((qx.a<xg.a>)($$0x -> {
         abb $$1 = $$0x.r();
         bcy $$2 = hm.ak.a($$1);
         double $$3 = $$0x.readDouble();
         List<bdb> $$4 = $$0x.a((qx.a<bdb>)($$0xx -> new bdb($$0xx.m(), "Unknown synced attribute modifier", $$0xx.readDouble(), bdb.a.a($$0xx.readByte()))));
         return new xg.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(hm.ak.b($$1.a()));
         $$0x.writeDouble($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.writeDouble($$1x.d());
            $$0xx.writeByte($$1x.c().a());
         });
      });
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public List<xg.a> c() {
      return this.b;
   }

   public static class a {
      private final bcy a;
      private final double b;
      private final Collection<bdb> c;

      public a(bcy $$0, double $$1, Collection<bdb> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bcy a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bdb> c() {
         return this.c;
      }
   }
}
