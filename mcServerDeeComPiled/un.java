import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class un {
   private static final int a = 2097152;
   private final pj b;
   private final byte[] c;
   private final List<un.a> d;

   public un(cxt $$0) {
      this.b = new pj();

      for(Entry<dar.a, dar> $$1 : $$0.e()) {
         if (((dar.a)$$1.getKey()).b()) {
            this.b.a(((dar.a)$$1.getKey()).a(), (qc)(new pq(((dar)$$1.getValue()).a())));
         }
      }

      this.c = new byte[a($$0)];
      a(new qx(this.c()), $$0);
      this.d = Lists.newArrayList();

      for(Entry<gt, cti> $$2 : $$0.E().entrySet()) {
         this.d.add(un.a.a((cti)$$2.getValue()));
      }

   }

   public un(qx $$0, int $$1, int $$2) {
      this.b = $$0.n();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.k();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.readBytes(this.c);
            this.d = $$0.a(un.a::new);
         }
      }
   }

   public void a(qx $$0) {
      $$0.a(this.b);
      $$0.d(this.c.length);
      $$0.writeBytes(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   private static int a(cxt $$0) {
      int $$1 = 0;

      for(cxu $$2 : $$0.d()) {
         $$1 += $$2.k();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(qx $$0, cxt $$1) {
      for(cxu $$2 : $$1.d()) {
         $$2.b($$0);
      }

   }

   public Consumer<un.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(un.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      gt.a $$5 = new gt.a();

      for(un.a $$6 : this.d) {
         int $$7 = $$3 + hq.b($$6.a >> 4);
         int $$8 = $$4 + hq.b($$6.a);
         $$5.d($$7, $$6.b, $$8);
         $$0.accept($$5, $$6.c, $$6.d);
      }

   }

   public qx a() {
      return new qx(Unpooled.wrappedBuffer(this.c));
   }

   public pj b() {
      return this.b;
   }

   static class a {
      final int a;
      final int b;
      final ctk<?> c;
      @Nullable
      final pj d;

      private a(int $$0, int $$1, ctk<?> $$2, @Nullable pj $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private a(qx $$0) {
         this.a = $$0.readByte();
         this.b = $$0.readShort();
         this.c = $$0.a(hm.ab);
         this.d = $$0.n();
      }

      void a(qx $$0) {
         $$0.writeByte(this.a);
         $$0.writeShort(this.b);
         $$0.a(hm.ab, this.c);
         $$0.a(this.d);
      }

      static un.a a(cti $$0) {
         pj $$1 = $$0.aa_();
         gt $$2 = $$0.p();
         int $$3 = hq.b($$2.u()) << 4 | hq.b($$2.w());
         return new un.a($$3, $$2.v(), $$0.v(), $$1.f() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(gt var1, ctk<?> var2, @Nullable pj var3);
   }
}
