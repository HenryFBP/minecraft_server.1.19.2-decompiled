import java.time.Instant;

public record xs(String a, Instant b, long c, dv d, boolean e, rw.b f) implements tc<xm> {
   public xs(String $$0, Instant $$1, long $$2, dv $$3, boolean $$4, rw.b $$5) {
      $$0 = amx.e($$0);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public xs(qx $$0) {
      this($$0.e(256), $$0.t(), $$0.readLong(), new dv($$0), $$0.readBoolean(), new rw.b($$0));
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

   public String b() {
      return this.a;
   }

   public Instant c() {
      return this.b;
   }

   public long d() {
      return this.c;
   }

   public dv e() {
      return this.d;
   }

   public boolean f() {
      return this.e;
   }

   public rw.b g() {
      return this.f;
   }
}
