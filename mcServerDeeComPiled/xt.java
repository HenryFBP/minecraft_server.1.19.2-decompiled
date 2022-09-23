import java.time.Instant;

public record xt(String a, Instant b, long c, rz d, boolean e, rw.b f) implements tc<xm> {
   public xt(qx $$0) {
      this($$0.e(256), $$0.t(), $$0.readLong(), new rz($$0), $$0.readBoolean(), new rw.b($$0));
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.writeLong(this.c);
      this.d.a($$0);
      $$0.writeBoolean(this.e);
      this.f.a($$0);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public sa a(agh $$0) {
      return new sa($$0.co(), this.b, this.c);
   }

   public String b() {
      return this.a;
   }

   public Instant c() {
      return this.b;
   }

   public long d() {
      return this.c;
   }

   public rz e() {
      return this.d;
   }

   public boolean f() {
      return this.e;
   }

   public rw.b g() {
      return this.f;
   }
}
