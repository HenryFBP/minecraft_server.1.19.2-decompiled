import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.IntFunction;

public class xz implements tc<xm> {
   private static final int a = 128;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final bwv f;
   private final cax g;
   private final Int2ObjectMap<cax> h;

   public xz(int $$0, int $$1, int $$2, int $$3, bwv $$4, cax $$5, Int2ObjectMap<cax> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = Int2ObjectMaps.unmodifiable($$6);
   }

   public xz(qx $$0) {
      this.b = $$0.readByte();
      this.c = $$0.k();
      this.d = $$0.readShort();
      this.e = $$0.readByte();
      this.f = $$0.a(bwv.class);
      IntFunction<Int2ObjectOpenHashMap<cax>> $$1 = qx.a(Int2ObjectOpenHashMap::new, 128);
      this.h = Int2ObjectMaps.unmodifiable($$0.a($$1, $$0x -> Integer.valueOf($$0x.readShort()), qx::p));
      this.g = $$0.p();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.b);
      $$0.d(this.c);
      $$0.writeShort(this.d);
      $$0.writeByte(this.e);
      $$0.a((Enum<?>)this.f);
      $$0.a(this.h, qx::writeShort, qx::a);
      $$0.a(this.g);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public cax e() {
      return this.g;
   }

   public Int2ObjectMap<cax> f() {
      return this.h;
   }

   public bwv g() {
      return this.f;
   }

   public int h() {
      return this.c;
   }
}
