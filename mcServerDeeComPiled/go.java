import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class go implements gf<StringArgumentType, go.a> {
   public void a(go.a $$0, qx $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public go.a a(qx $$0) {
      StringType $$1 = $$0.a(StringType.class);
      return new go.a($$1);
   }

   public void a(go.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new IncompatibleClassChangeError();
      });
   }

   public go.a a(StringArgumentType $$0) {
      return new go.a($$0.getType());
   }

   public final class a implements gf.a<StringArgumentType> {
      final StringType b;

      public a(StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(dl $$0) {
         return switch(this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public gf<StringArgumentType, ?> a() {
         return go.this;
      }
   }
}
