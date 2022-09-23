import java.util.Optional;
import javax.annotation.Nullable;

public class sg {
   @Nullable
   private rz a;

   private sg.c a(amq $$0, sa $$1, ri $$2, rw $$3) {
      rz $$4 = a($$0, $$1, this.a, $$2, $$3);
      this.a = $$4;
      return new sg.c($$4);
   }

   private static rz a(amq $$0, sa $$1, @Nullable rz $$2, ri $$3, rw $$4) {
      sh $$5 = new sh($$2, $$1.c());
      sf $$6 = new sf($$3, $$1.d(), $$1.e(), $$4);
      byte[] $$7 = $$6.a().asBytes();
      return new rz($$0.sign($$2x -> $$5.a($$2x, $$7)));
   }

   private sd a(sg.c $$0, sa $$1, ri $$2, rw $$3) {
      sd $$4 = a($$0, this.a, $$1, $$2, $$3);
      this.a = $$0.a;
      return $$4;
   }

   private static sd a(sg.c $$0, @Nullable rz $$1, sa $$2, ri $$3, rw $$4) {
      sh $$5 = new sh($$1, $$2.c());
      sf $$6 = new sf($$3, $$2.d(), $$2.e(), $$4);
      return new sd($$5, $$0.a, $$6, Optional.empty(), rt.b);
   }

   public sg.a a() {
      return this::a;
   }

   public sg.b b() {
      return this::a;
   }

   @FunctionalInterface
   public interface a {
      sg.a a = ($$0, $$1, $$2, $$3) -> sd.a($$1, $$2);

      sd unpack(sg.c var1, sa var2, ri var3, rw var4);
   }

   @FunctionalInterface
   public interface b {
      sg.c pack(amq var1, sa var2, ri var3, rw var4);
   }

   public static record c(rz a) {
      final rz a;
   }
}
