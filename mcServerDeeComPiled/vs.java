import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class vs implements tc<tf> {
   private static final int a = 12;
   private final hq b;
   private final short[] c;
   private final cvo[] d;
   private final boolean e;

   public vs(hq $$0, ShortSet $$1, cxu $$2, boolean $$3) {
      this.b = $$0;
      this.e = $$3;
      int $$4 = $$1.size();
      this.c = new short[$$4];
      this.d = new cvo[$$4];
      int $$5 = 0;

      for(ShortIterator var7 = $$1.iterator(); var7.hasNext(); ++$$5) {
         short $$6 = var7.next();
         this.c[$$5] = $$6;
         this.d[$$5] = $$2.a(hq.a($$6), hq.b($$6), hq.c($$6));
      }

   }

   public vs(qx $$0) {
      this.b = hq.a($$0.readLong());
      this.e = $$0.readBoolean();
      int $$1 = $$0.k();
      this.c = new short[$$1];
      this.d = new cvo[$$1];

      for(int $$2 = 0; $$2 < $$1; ++$$2) {
         long $$3 = $$0.l();
         this.c[$$2] = (short)((int)($$3 & 4095L));
         this.d[$$2] = cjt.o.a((int)($$3 >>> 12));
      }

   }

   @Override
   public void a(qx $$0) {
      $$0.writeLong(this.b.s());
      $$0.writeBoolean(this.e);
      $$0.d(this.c.length);

      for(int $$1 = 0; $$1 < this.c.length; ++$$1) {
         $$0.b((long)(cjt.i(this.d[$$1]) << 12 | this.c[$$1]));
      }

   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<gt, cvo> $$0) {
      gt.a $$1 = new gt.a();

      for(int $$2 = 0; $$2 < this.c.length; ++$$2) {
         short $$3 = this.c[$$2];
         $$1.d(this.b.d($$3), this.b.e($$3), this.b.f($$3));
         $$0.accept($$1, this.d[$$2]);
      }

   }

   public boolean b() {
      return this.e;
   }
}
