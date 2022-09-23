import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class wl implements tc<tf> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bbs, cax>> c;

   public wl(int $$0, List<Pair<bbs, cax>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public wl(qx $$0) {
      this.b = $$0.k();
      bbs[] $$1 = bbs.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bbs $$3 = $$1[$$2 & 127];
         cax $$4 = $$0.p();
         this.c.add(Pair.of($$3, $$4));
      } while(($$2 & -128) != 0);

   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.b);
      int $$1 = this.c.size();

      for(int $$2 = 0; $$2 < $$1; ++$$2) {
         Pair<bbs, cax> $$3 = (Pair)this.c.get($$2);
         bbs $$4 = (bbs)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.writeByte($$5 ? $$6 | -128 : $$6);
         $$0.a((cax)$$3.getSecond());
      }

   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<Pair<bbs, cax>> c() {
      return this.c;
   }
}
