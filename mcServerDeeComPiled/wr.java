import java.util.Objects;
import javax.annotation.Nullable;

public class wr implements tc<tf> {
   private final String a;
   @Nullable
   private final String b;
   private final int c;
   private final abq.a d;

   public wr(abq.a $$0, @Nullable String $$1, String $$2, int $$3) {
      if ($$0 != abq.a.b && $$1 == null) {
         throw new IllegalArgumentException("Need an objective name");
      } else {
         this.a = $$2;
         this.b = $$1;
         this.c = $$3;
         this.d = $$0;
      }
   }

   public wr(qx $$0) {
      this.a = $$0.q();
      this.d = $$0.a(abq.a.class);
      String $$1 = $$0.q();
      this.b = Objects.equals($$1, "") ? null : $$1;
      if (this.d != abq.a.b) {
         this.c = $$0.k();
      } else {
         this.c = 0;
      }

   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.a((Enum<?>)this.d);
      $$0.a(this.b == null ? "" : this.b);
      if (this.d != abq.a.b) {
         $$0.d(this.c);
      }

   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.a;
   }

   @Nullable
   public String c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public abq.a e() {
      return this.d;
   }
}
