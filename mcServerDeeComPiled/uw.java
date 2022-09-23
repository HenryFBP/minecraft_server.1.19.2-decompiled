import javax.annotation.Nullable;

public abstract class uw implements tc<tf> {
   protected final int a;
   protected final short b;
   protected final short c;
   protected final short d;
   protected final byte e;
   protected final byte f;
   protected final boolean g;
   protected final boolean h;
   protected final boolean i;

   protected uw(int $$0, short $$1, short $$2, short $$3, byte $$4, byte $$5, boolean $$6, boolean $$7, boolean $$8) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
      this.i = $$8;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public String toString() {
      return "Entity_" + super.toString();
   }

   @Nullable
   public bbn a(cgx $$0) {
      return $$0.a(this.a);
   }

   public short b() {
      return this.b;
   }

   public short c() {
      return this.c;
   }

   public short d() {
      return this.d;
   }

   public byte e() {
      return this.e;
   }

   public byte f() {
      return this.f;
   }

   public boolean g() {
      return this.h;
   }

   public boolean h() {
      return this.i;
   }

   public boolean i() {
      return this.g;
   }

   public static class a extends uw {
      public a(int $$0, short $$1, short $$2, short $$3, boolean $$4) {
         super($$0, $$1, $$2, $$3, (byte)0, (byte)0, $$4, false, true);
      }

      public static uw.a b(qx $$0) {
         int $$1 = $$0.k();
         short $$2 = $$0.readShort();
         short $$3 = $$0.readShort();
         short $$4 = $$0.readShort();
         boolean $$5 = $$0.readBoolean();
         return new uw.a($$1, $$2, $$3, $$4, $$5);
      }

      @Override
      public void a(qx $$0) {
         $$0.d(this.a);
         $$0.writeShort(this.b);
         $$0.writeShort(this.c);
         $$0.writeShort(this.d);
         $$0.writeBoolean(this.g);
      }
   }

   public static class b extends uw {
      public b(int $$0, short $$1, short $$2, short $$3, byte $$4, byte $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      public static uw.b b(qx $$0) {
         int $$1 = $$0.k();
         short $$2 = $$0.readShort();
         short $$3 = $$0.readShort();
         short $$4 = $$0.readShort();
         byte $$5 = $$0.readByte();
         byte $$6 = $$0.readByte();
         boolean $$7 = $$0.readBoolean();
         return new uw.b($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void a(qx $$0) {
         $$0.d(this.a);
         $$0.writeShort(this.b);
         $$0.writeShort(this.c);
         $$0.writeShort(this.d);
         $$0.writeByte(this.e);
         $$0.writeByte(this.f);
         $$0.writeBoolean(this.g);
      }
   }

   public static class c extends uw {
      public c(int $$0, byte $$1, byte $$2, boolean $$3) {
         super($$0, (short)0, (short)0, (short)0, $$1, $$2, $$3, true, false);
      }

      public static uw.c b(qx $$0) {
         int $$1 = $$0.k();
         byte $$2 = $$0.readByte();
         byte $$3 = $$0.readByte();
         boolean $$4 = $$0.readBoolean();
         return new uw.c($$1, $$2, $$3, $$4);
      }

      @Override
      public void a(qx $$0) {
         $$0.d(this.a);
         $$0.writeByte(this.e);
         $$0.writeByte(this.f);
         $$0.writeBoolean(this.g);
      }
   }
}
