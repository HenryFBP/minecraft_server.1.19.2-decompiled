import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import org.slf4j.Logger;

public class duf extends dtn {
   private static final Logger a = LogUtils.getLogger();

   duf(dux[] $$0) {
      super($$0);
   }

   @Override
   public dtp a() {
      return dtq.g;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<ceb> $$2 = $$1.c().q().a(cds.b, new bao($$0), $$1.c());
         if ($$2.isPresent()) {
            cax $$3 = ((ceb)$$2.get()).c();
            if (!$$3.b()) {
               cax $$4 = $$3.o();
               $$4.e($$0.K());
               return $$4;
            }
         }

         a.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static dtn.a<?> c() {
      return a(duf::new);
   }

   public static class a extends dtn.c<duf> {
      public duf a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         return new duf($$2);
      }
   }
}
