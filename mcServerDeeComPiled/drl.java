import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class drl implements drv {
   private final drw a;
   private final drv b;

   public drl(drw $$0, drv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public int a() {
      return this.b.a();
   }

   @Override
   public int b() {
      return this.b.b();
   }

   @Override
   public int c() {
      return this.b.c();
   }

   @Override
   public float d() {
      return this.b.d();
   }

   @Override
   public long e() {
      return this.b.e();
   }

   @Override
   public long f() {
      return this.b.f();
   }

   @Override
   public String g() {
      return this.a.g();
   }

   @Override
   public int h() {
      return this.b.h();
   }

   @Override
   public void a(int $$0) {
   }

   @Override
   public boolean i() {
      return this.b.i();
   }

   @Override
   public int j() {
      return this.b.j();
   }

   @Override
   public boolean k() {
      return this.b.k();
   }

   @Override
   public int l() {
      return this.b.l();
   }

   @Override
   public cgu m() {
      return this.a.m();
   }

   @Override
   public void b(int $$0) {
   }

   @Override
   public void c(int $$0) {
   }

   @Override
   public void d(int $$0) {
   }

   @Override
   public void a(float $$0) {
   }

   @Override
   public void a(long $$0) {
   }

   @Override
   public void b(long $$0) {
   }

   @Override
   public void a(gt $$0, float $$1) {
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void e(int $$0) {
   }

   @Override
   public void b(boolean $$0) {
   }

   @Override
   public void f(int $$0) {
   }

   @Override
   public void a(cgu $$0) {
   }

   @Override
   public boolean n() {
      return this.a.n();
   }

   @Override
   public boolean o() {
      return this.a.o();
   }

   @Override
   public boolean p() {
      return this.b.p();
   }

   @Override
   public void c(boolean $$0) {
   }

   @Override
   public cgt q() {
      return this.a.q();
   }

   @Override
   public cxe.c r() {
      return this.b.r();
   }

   @Override
   public void a(cxe.c $$0) {
   }

   @Override
   public bag s() {
      return this.a.s();
   }

   @Override
   public boolean t() {
      return this.a.t();
   }

   @Override
   public dwi<MinecraftServer> u() {
      return this.b.u();
   }

   @Override
   public int v() {
      return 0;
   }

   @Override
   public void g(int $$0) {
   }

   @Override
   public int w() {
      return 0;
   }

   @Override
   public void h(int $$0) {
   }

   @Override
   public UUID x() {
      return null;
   }

   @Override
   public void a(UUID $$0) {
   }

   @Override
   public void a(r $$0, cgz $$1) {
      $$0.a("Derived", true);
      this.b.a($$0, $$1);
   }
}
