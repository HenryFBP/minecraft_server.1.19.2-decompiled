import java.util.Map;

public class xj implements tc<tf> {
   private final Map<aba<? extends hm<?>>, alc.a> a;

   public xj(Map<aba<? extends hm<?>>, alc.a> $$0) {
      this.a = $$0;
   }

   public xj(qx $$0) {
      this.a = $$0.a((qx.a<aba<? extends hm<?>>>)($$0x -> aba.a($$0x.r())), alc.a::b);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a($$1.a()), ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public Map<aba<? extends hm<?>>, alc.a> b() {
      return this.a;
   }
}
