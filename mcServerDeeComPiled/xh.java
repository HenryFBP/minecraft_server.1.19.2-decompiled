import javax.annotation.Nullable;

public class xh implements tc<tf> {
   private static final short a = 32767;
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final int e;
   private final bbe f;
   private final byte g;
   private final int h;
   private final byte i;
   @Nullable
   private final bbg.a j;

   public xh(int $$0, bbg $$1) {
      this.e = $$0;
      this.f = $$1.b();
      this.g = (byte)($$1.d() & 0xFF);
      this.h = $$1.c();
      byte $$2 = 0;
      if ($$1.e()) {
         $$2 = (byte)($$2 | 1);
      }

      if ($$1.f()) {
         $$2 = (byte)($$2 | 2);
      }

      if ($$1.g()) {
         $$2 = (byte)($$2 | 4);
      }

      this.i = $$2;
      this.j = (bbg.a)$$1.a().orElse(null);
   }

   public xh(qx $$0) {
      this.e = $$0.k();
      this.f = $$0.a(hm.U);
      this.g = $$0.readByte();
      this.h = $$0.k();
      this.i = $$0.readByte();
      this.j = $$0.c($$0x -> $$0x.a(bbg.a.a));
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.e);
      $$0.a(hm.U, this.f);
      $$0.writeByte(this.g);
      $$0.d(this.h);
      $$0.writeByte(this.i);
      $$0.a(this.j, ($$0x, $$1) -> $$0x.a(bbg.a.a, $$1));
   }

   public boolean b() {
      return this.h >= 32767;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int c() {
      return this.e;
   }

   public bbe d() {
      return this.f;
   }

   public byte e() {
      return this.g;
   }

   public int f() {
      return this.h;
   }

   public boolean g() {
      return (this.i & 2) == 2;
   }

   public boolean h() {
      return (this.i & 1) == 1;
   }

   public boolean i() {
      return (this.i & 4) == 4;
   }

   @Nullable
   public bbg.a j() {
      return this.j;
   }
}
