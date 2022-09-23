import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class czr implements czy {
   public static final Codec<czr> a = RecordCodecBuilder.create($$0 -> $$0.group(gt.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, czr::new));
   final gt c;

   public czr(gt $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<dwq> a(cgx $$0) {
      return Optional.of(dwq.a(this.c));
   }

   @Override
   public czz<?> a() {
      return czz.a;
   }

   public static class a implements czz<czr> {
      public czr a(qx $$0) {
         return new czr($$0.f());
      }

      public void a(qx $$0, czr $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<czr> a() {
         return czr.a;
      }
   }
}
