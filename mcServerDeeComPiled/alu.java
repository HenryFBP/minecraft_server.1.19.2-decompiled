import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface alu {
   alu a = $$0 -> true;

   boolean accept(alv var1);

   static alu codepoint(int $$0, sj $$1) {
      return $$2 -> $$2.accept(0, $$1, $$0);
   }

   static alu forward(String $$0, sj $$1) {
      return $$0.isEmpty() ? a : $$2 -> amv.a($$0, $$1, $$2);
   }

   static alu forward(String $$0, sj $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> amv.a($$0, $$1, decorateOutput($$3, $$2));
   }

   static alu backward(String $$0, sj $$1) {
      return $$0.isEmpty() ? a : $$2 -> amv.b($$0, $$1, $$2);
   }

   static alu backward(String $$0, sj $$1, Int2IntFunction $$2) {
      return $$0.isEmpty() ? a : $$3 -> amv.b($$0, $$1, decorateOutput($$3, $$2));
   }

   static alv decorateOutput(alv $$0, Int2IntFunction $$1) {
      return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, $$1.apply($$4));
   }

   static alu composite() {
      return a;
   }

   static alu composite(alu $$0) {
      return $$0;
   }

   static alu composite(alu $$0, alu $$1) {
      return fromPair($$0, $$1);
   }

   static alu composite(alu... $$0) {
      return fromList(ImmutableList.copyOf($$0));
   }

   static alu composite(List<alu> $$0) {
      int $$1 = $$0.size();
      switch($$1) {
         case 0:
            return a;
         case 1:
            return (alu)$$0.get(0);
         case 2:
            return fromPair((alu)$$0.get(0), (alu)$$0.get(1));
         default:
            return fromList(ImmutableList.copyOf($$0));
      }
   }

   static alu fromPair(alu $$0, alu $$1) {
      return $$2 -> $$0.accept($$2) && $$1.accept($$2);
   }

   static alu fromList(List<alu> $$0) {
      return $$1 -> {
         for(alu $$2 : $$0) {
            if (!$$2.accept($$1)) {
               return false;
            }
         }

         return true;
      };
   }
}
