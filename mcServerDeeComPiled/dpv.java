import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class dpv extends cvq<dpu, dpv> {
   public static final Codec<dpv> a = a(hm.T.p(), dpu::h).stable();
   public static final int b = 9;
   public static final int g = 8;

   public dpv(dpu $$0, ImmutableMap<cwr<?>, Comparable<?>> $$1, MapCodec<dpv> $$2) {
      super($$0, $$1, $$2);
   }

   public dpu a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(dpu $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cgd $$0, gt $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cgd $$0, gt $$1) {
      for(int $$2 = -1; $$2 <= 1; ++$$2) {
         for(int $$3 = -1; $$3 <= 1; ++$$3) {
            gt $$4 = $$1.b($$2, 0, $$3);
            dpv $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cgx $$0, gt $$1) {
      this.a().a($$0, $$1, this);
   }

   public void a(cgx $$0, gt $$1, amn $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().j();
   }

   public void b(cgx $$0, gt $$1, amn $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public dwq c(cgd $$0, gt $$1) {
      return this.a().a($$0, $$1, this);
   }

   public cvo g() {
      return this.a().b(this);
   }

   @Nullable
   public im h() {
      return this.a().i();
   }

   public boolean a(akz<dpu> $$0) {
      return this.a().l().a($$0);
   }

   public boolean a(he<dpu> $$0) {
      return $$0.a(this.a().l());
   }

   public boolean b(dpu $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cgd $$0, gt $$1, dpu $$2, gy $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public dxj d(cgd $$0, gt $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public hc<dpu> j() {
      return this.e.l();
   }

   public Stream<akz<dpu>> k() {
      return this.e.l().c();
   }
}
