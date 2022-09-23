import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cfu {
   void e(@Nullable buc var1);

   @Nullable
   buc fK();

   cfw fM();

   void a(cfw var1);

   void a(cfv var1);

   void m(cax var1);

   int fJ();

   void t(int var1);

   boolean fN();

   ajv fO();

   default boolean fW() {
      return false;
   }

   default void a(buc $$0, rq $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bap(($$0x, $$1x, $$2x) -> new bxs($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cfw $$4 = this.fM();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.fJ(), this.fN(), this.fW());
         }
      }

   }

   boolean fS();
}
