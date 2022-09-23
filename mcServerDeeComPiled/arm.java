import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import org.apache.commons.lang3.StringUtils;

public class arm extends DataFix {
   public arm(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("pages", $$1 -> (Dynamic)DataFixUtils.orElse($$1.asStreamOpt().map($$0xx -> $$0xx.map($$0xxx -> {
               if (!$$0xxx.asString().result().isPresent()) {
                  return $$0xxx;
               } else {
                  String $$1x = $$0xxx.asString("");
                  rq $$2 = null;
                  if (!"null".equals($$1x) && !StringUtils.isEmpty($$1x)) {
                     if ($$1x.charAt(0) == '"' && $$1x.charAt($$1x.length() - 1) == '"' || $$1x.charAt(0) == '{' && $$1x.charAt($$1x.length() - 1) == '}') {
                        try {
                           $$2 = alz.a(aog.a, $$1x, rq.class, true);
                           if ($$2 == null) {
                              $$2 = rp.a;
                           }
                        } catch (Exception var6) {
                        }

                        if ($$2 == null) {
                           try {
                              $$2 = rq.a.a($$1x);
                           } catch (Exception var5) {
                           }
                        }

                        if ($$2 == null) {
                           try {
                              $$2 = rq.a.b($$1x);
                           } catch (Exception var4) {
                           }
                        }

                        if ($$2 == null) {
                           $$2 = rq.b($$1x);
                        }
                     } else {
                        $$2 = rq.b($$1x);
                     }
                  } else {
                     $$2 = rp.a;
                  }

                  return $$0xxx.createString(rq.a.a($$2));
               }
            })).map($$0::createList).result(), $$0.emptyList()));
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.m);
      OpticFinder<?> $$1 = $$0.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemWrittenBookPagesStrictJsonFix", $$0, $$1x -> $$1x.updateTyped($$1, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::a))
      );
   }
}
