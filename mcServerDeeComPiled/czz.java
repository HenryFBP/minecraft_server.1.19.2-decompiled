import com.mojang.serialization.Codec;

public interface czz<T extends czy> {
   czz<czr> a = a("block", new czr.a());
   czz<czt> b = a("entity", new czt.a());

   T b(qx var1);

   void a(qx var1, T var2);

   Codec<T> a();

   static <S extends czz<T>, T extends czy> S a(String $$0, S $$1) {
      return hm.a(hm.al, $$0, $$1);
   }

   static czy c(qx $$0) {
      abb $$1 = $$0.r();
      return ((czz)hm.al.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1))).b($$0);
   }

   static <T extends czy> void a(T $$0, qx $$1) {
      $$1.a(hm.al.b($$0.a()));
      $$0.a().a($$1, $$0);
   }
}
