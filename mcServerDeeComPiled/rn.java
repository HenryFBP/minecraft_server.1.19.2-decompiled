import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record rn(String b, List<rn.a> c, sj d) {
   public static final Codec<rn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(rn::a),
               rn.a.d.listOf().fieldOf("parameters").forGetter(rn::b),
               sj.b.optionalFieldOf("style", sj.a).forGetter(rn::c)
            )
            .apply($$0, rn::new)
   );

   public static rn a(String $$0) {
      return new rn($$0, List.of(rn.a.a, rn.a.c), sj.a);
   }

   public static rn b(String $$0) {
      sj $$1 = sj.a.a(p.h).b(true);
      return new rn($$0, List.of(rn.a.a, rn.a.c), $$1);
   }

   public static rn c(String $$0) {
      sj $$1 = sj.a.a(p.h).b(true);
      return new rn($$0, List.of(rn.a.b, rn.a.c), $$1);
   }

   public static rn d(String $$0) {
      return new rn($$0, List.of(rn.a.b, rn.a.a, rn.a.c), sj.a);
   }

   public rq a(rq $$0, rm.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return rq.a(this.b, $$2).c(this.d);
   }

   private rq[] b(rq $$0, rm.a $$1) {
      rq[] $$2 = new rq[this.c.size()];

      for(int $$3 = 0; $$3 < $$2.length; ++$$3) {
         rn.a $$4 = (rn.a)this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<rn.a> b() {
      return this.c;
   }

   public sj c() {
      return this.d;
   }

   public static enum a implements amw {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<rn.a> d = amw.a(rn.a::values);
      private final String e;
      private final rn.a.a f;

      private a(String $$0, rn.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public rq a(rq $$0, rm.a $$1) {
         rq $$2 = this.f.select($$0, $$1);
         return (rq)Objects.requireNonNullElse($$2, rp.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         rq select(rq var1, rm.a var2);
      }
   }
}
