import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class ail {
   static final Logger b = LogUtils.getLogger();
   static final Codec<ail> c = RecordCodecBuilder.create($$0 -> $$0.group(Codec.list(ail.a.a).fieldOf("block").forGetter($$0x -> $$0x.d)).apply($$0, ail::new));
   public static final ahp<ail> a = new ahp<ail>() {
      @Override
      public String a() {
         return "filter";
      }

      public ail b(JsonObject $$0) {
         return (ail)ail.c.parse(JsonOps.INSTANCE, $$0).getOrThrow(false, ail.b::error);
      }
   };
   private final List<ail.a> d;

   public ail(List<ail.a> $$0) {
      this.d = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.d.stream().anyMatch($$1 -> $$1.c.test($$0));
   }

   public boolean b(String $$0) {
      return this.d.stream().anyMatch($$1 -> $$1.e.test($$0));
   }

   static class a implements Predicate<abb> {
      static final Codec<ail.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(alq.e.optionalFieldOf("namespace").forGetter($$0x -> $$0x.b), alq.e.optionalFieldOf("path").forGetter($$0x -> $$0x.d))
               .apply($$0, ail.a::new)
      );
      private final Optional<Pattern> b;
      final Predicate<String> c;
      private final Optional<Pattern> d;
      final Predicate<String> e;

      private a(Optional<Pattern> $$0, Optional<Pattern> $$1) {
         this.b = $$0;
         this.c = (Predicate)$$0.map(Pattern::asPredicate).orElse((Predicate)$$0x -> true);
         this.d = $$1;
         this.e = (Predicate)$$1.map(Pattern::asPredicate).orElse((Predicate)$$0x -> true);
      }

      public boolean a(abb $$0) {
         return this.c.test($$0.b()) && this.e.test($$0.a());
      }
   }
}
