import java.util.Optional;
import javax.annotation.Nullable;

public class vq implements tc<tf> {
   private final aba<cyu> a;
   private final aba<cgx> b;
   private final long c;
   private final cgu d;
   @Nullable
   private final cgu e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private final Optional<hb> i;

   public vq(aba<cyu> $$0, aba<cgx> $$1, long $$2, cgu $$3, @Nullable cgu $$4, boolean $$5, boolean $$6, boolean $$7, Optional<hb> $$8) {
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

   public vq(qx $$0) {
      this.a = $$0.a(hm.O);
      this.b = $$0.a(hm.P);
      this.c = $$0.readLong();
      this.d = cgu.a($$0.readUnsignedByte());
      this.e = cgu.b($$0.readByte());
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
      this.h = $$0.readBoolean();
      this.i = $$0.b(qx::i);
   }

   @Override
   public void a(qx $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.writeLong(this.c);
      $$0.writeByte(this.d.a());
      $$0.writeByte(cgu.a(this.e));
      $$0.writeBoolean(this.f);
      $$0.writeBoolean(this.g);
      $$0.writeBoolean(this.h);
      $$0.a(this.i, qx::a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public aba<cyu> b() {
      return this.a;
   }

   public aba<cgx> c() {
      return this.b;
   }

   public long d() {
      return this.c;
   }

   public cgu e() {
      return this.d;
   }

   @Nullable
   public cgu f() {
      return this.e;
   }

   public boolean g() {
      return this.f;
   }

   public boolean h() {
      return this.g;
   }

   public boolean i() {
      return this.h;
   }

   public Optional<hb> j() {
      return this.i;
   }
}
