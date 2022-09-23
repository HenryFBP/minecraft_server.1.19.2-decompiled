import java.util.BitSet;
import javax.annotation.Nullable;

public class ur implements tc<tf> {
   private final int a;
   private final int b;
   private final us c;

   public ur(cge $$0, dpm $$1, @Nullable BitSet $$2, @Nullable BitSet $$3, boolean $$4) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new us($$0, $$1, $$2, $$3, $$4);
   }

   public ur(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.k();
      this.c = new us($$0, this.a, this.b);
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.d(this.b);
      this.c.a($$0);
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

   public us d() {
      return this.c;
   }
}
