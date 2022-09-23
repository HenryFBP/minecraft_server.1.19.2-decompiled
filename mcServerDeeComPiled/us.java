import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class us {
   private final BitSet a;
   private final BitSet b;
   private final BitSet c;
   private final BitSet d;
   private final List<byte[]> e;
   private final List<byte[]> f;
   private final boolean g;

   public us(cge $$0, dpm $$1, @Nullable BitSet $$2, @Nullable BitSet $$3, boolean $$4) {
      this.g = $$4;
      this.a = new BitSet();
      this.b = new BitSet();
      this.c = new BitSet();
      this.d = new BitSet();
      this.e = Lists.newArrayList();
      this.f = Lists.newArrayList();

      for(int $$5 = 0; $$5 < $$1.b(); ++$$5) {
         if ($$2 == null || $$2.get($$5)) {
            this.a($$0, $$1, chg.a, $$5, this.a, this.c, this.e);
         }

         if ($$3 == null || $$3.get($$5)) {
            this.a($$0, $$1, chg.b, $$5, this.b, this.d, this.f);
         }
      }

   }

   public us(qx $$0, int $$1, int $$2) {
      this.g = $$0.readBoolean();
      this.a = $$0.w();
      this.b = $$0.w();
      this.c = $$0.w();
      this.d = $$0.w();
      this.e = $$0.a((qx.a<byte[]>)($$0x -> $$0x.b(2048)));
      this.f = $$0.a((qx.a<byte[]>)($$0x -> $$0x.b(2048)));
   }

   public void a(qx $$0) {
      $$0.writeBoolean(this.g);
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e, qx::a);
      $$0.a(this.f, qx::a);
   }

   private void a(cge $$0, dpm $$1, chg $$2, int $$3, BitSet $$4, BitSet $$5, List<byte[]> $$6) {
      cxo $$7 = $$1.a($$2).a(hq.a($$0, $$1.c() + $$3));
      if ($$7 != null) {
         if ($$7.c()) {
            $$5.set($$3);
         } else {
            $$4.set($$3);
            $$6.add((byte[])$$7.a().clone());
         }
      }

   }

   public BitSet a() {
      return this.a;
   }

   public BitSet b() {
      return this.c;
   }

   public List<byte[]> c() {
      return this.e;
   }

   public BitSet d() {
      return this.b;
   }

   public BitSet e() {
      return this.d;
   }

   public List<byte[]> f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }
}
