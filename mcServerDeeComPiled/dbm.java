import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Map.Entry;
import java.util.function.Function;
import org.apache.commons.lang3.StringUtils;

public class dbm {
   public static final Codec<dbm> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.LONG.fieldOf("seed").stable().forGetter(dbm::a),
                  Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(dbm::b),
                  Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(dbm::c),
                  ho.b(hm.Q, Lifecycle.stable(), cyv.a).xmap(cyv::a, Function.identity()).fieldOf("dimensions").forGetter(dbm::d),
                  Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter($$0x -> $$0x.f)
               )
               .apply($$0, $$0.stable(dbm::new))
      )
      .comapFlatMap(dbm::m, Function.identity());
   private final long b;
   private final boolean c;
   private final boolean d;
   private final hm<cyv> e;
   private final Optional<String> f;

   private DataResult<dbm> m() {
      cyv $$0 = this.e.a(cyv.b);
      if ($$0 == null) {
         return DataResult.error("Overworld settings missing");
      } else {
         return this.n() ? DataResult.success(this, Lifecycle.stable()) : DataResult.success(this);
      }
   }

   private boolean n() {
      return cyv.b(this.e);
   }

   public dbm(long $$0, boolean $$1, boolean $$2, hm<cyv> $$3) {
      this($$0, $$1, $$2, $$3, Optional.empty());
      cyv $$4 = $$3.a(cyv.b);
      if ($$4 == null) {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   private dbm(long $$0, boolean $$1, boolean $$2, hm<cyv> $$3, Optional<String> $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   public long a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }

   public boolean c() {
      return this.d;
   }

   public static dbm a(hn $$0, dbm $$1, cxk $$2) {
      hm<cyu> $$3 = $$0.d(hm.O);
      hm<cyv> $$4 = a($$3, $$1.d(), $$2);
      return new dbm($$1.a(), $$1.b(), $$1.c(), $$4);
   }

   public static hm<cyv> a(hm<cyu> $$0, hm<cyv> $$1, cxk $$2) {
      cyv $$3 = $$1.a(cyv.b);
      hc<cyu> $$4 = $$3 == null ? $$0.c(cys.a) : $$3.a();
      return a($$1, $$4, $$2);
   }

   public static hm<cyv> a(hm<cyv> $$0, hc<cyu> $$1, cxk $$2) {
      ht<cyv> $$3 = new hh<>(hm.Q, Lifecycle.experimental(), null);
      $$3.a(cyv.b, new cyv($$1, $$2), Lifecycle.stable());

      for(Entry<aba<cyv>, cyv> $$4 : $$0.f()) {
         aba<cyv> $$5 = (aba)$$4.getKey();
         if ($$5 != cyv.b) {
            $$3.a($$5, (cyv)$$4.getValue(), $$0.d((cyv)$$4.getValue()));
         }
      }

      return $$3;
   }

   public hm<cyv> d() {
      return this.e;
   }

   public cxk e() {
      cyv $$0 = this.e.a(cyv.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public ImmutableSet<aba<cgx>> f() {
      return (ImmutableSet<aba<cgx>>)this.d().f().stream().map(Entry::getKey).map(dbm::a).collect(ImmutableSet.toImmutableSet());
   }

   public static aba<cgx> a(aba<cyv> $$0) {
      return aba.a(hm.P, $$0.a());
   }

   public static aba<cyv> b(aba<cgx> $$0) {
      return aba.a(hm.Q, $$0.a());
   }

   public boolean g() {
      return this.e() instanceof dai;
   }

   public boolean h() {
      return this.e() instanceof dam;
   }

   public boolean i() {
      return this.f.isPresent();
   }

   public dbm j() {
      return new dbm(this.b, this.c, true, this.e, this.f);
   }

   public dbm k() {
      return new dbm(this.b, !this.c, this.d, this.e);
   }

   public dbm l() {
      return new dbm(this.b, this.c, !this.d, this.e);
   }

   public dbm a(boolean $$0, OptionalLong $$1) {
      long $$2 = $$1.orElse(this.b);
      hm<cyv> $$6;
      if ($$1.isPresent()) {
         ht<cyv> $$3 = new hh<>(hm.Q, Lifecycle.experimental(), null);

         for(Entry<aba<cyv>, cyv> $$4 : this.e.f()) {
            aba<cyv> $$5 = (aba)$$4.getKey();
            $$3.a($$5, new cyv(((cyv)$$4.getValue()).a(), ((cyv)$$4.getValue()).b()), this.e.d((cyv)$$4.getValue()));
         }

         $$6 = $$3;
      } else {
         $$6 = this.e;
      }

      dbm $$8;
      if (this.g()) {
         $$8 = new dbm($$2, false, false, $$6);
      } else {
         $$8 = new dbm($$2, this.b(), this.c() && !$$0, $$6);
      }

      return $$8;
   }

   public static OptionalLong a(String $$0) {
      $$0 = $$0.trim();
      if (StringUtils.isEmpty($$0)) {
         return OptionalLong.empty();
      } else {
         try {
            return OptionalLong.of(Long.parseLong($$0));
         } catch (NumberFormatException var2) {
            return OptionalLong.of((long)$$0.hashCode());
         }
      }
   }
}
