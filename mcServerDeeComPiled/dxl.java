public class dxl {
   private final dxo a;
   private final String b;
   private final dxr c;
   private rq d;
   private rq e;
   private dxr.a f;

   public dxl(dxo $$0, String $$1, dxr $$2, rq $$3, dxr.a $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.g();
      this.f = $$4;
   }

   public dxo a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public dxr c() {
      return this.c;
   }

   public rq d() {
      return this.d;
   }

   private rq g() {
      return rs.a((rq)this.d.e().a($$0 -> $$0.a(new rv(rv.a.a, rq.b(this.b)))));
   }

   public rq e() {
      return this.e;
   }

   public void a(rq $$0) {
      this.d = $$0;
      this.e = this.g();
      this.a.b(this);
   }

   public dxr.a f() {
      return this.f;
   }

   public void a(dxr.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }
}
