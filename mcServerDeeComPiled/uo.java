import java.util.BitSet;
import javax.annotation.Nullable;

public class uo implements tc<tf> {
   private final int a;
   private final int b;
   private final un c;
   private final us d;

   public uo(cxt $$0, dpm $$1, @Nullable BitSet $$2, @Nullable BitSet $$3, boolean $$4) {
      cge $$5 = $$0.f();
      this.a = $$5.e;
      this.b = $$5.f;
      this.c = new un($$0);
      this.d = new us($$5, $$1, $$2, $$3, $$4);
   }

   public uo(qx $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new un($$0, this.a, this.b);
      this.d = new us($$0, this.a, this.b);
   }

   @Override
   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.writeInt(this.b);
      this.c.a($$0);
      this.d.a($$0);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public un d() {
      return this.c;
   }

   public us e() {
      return this.d;
   }
}
