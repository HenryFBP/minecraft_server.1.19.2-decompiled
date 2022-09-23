import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public final class cyv {
   public static final Codec<cyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyu.j.fieldOf("type").forGetter(cyv::a), cxk.a.fieldOf("generator").forGetter(cyv::b)).apply($$0, $$0.stable(cyv::new))
   );
   public static final aba<cyv> b = aba.a(hm.Q, new abb("overworld"));
   public static final aba<cyv> c = aba.a(hm.Q, new abb("the_nether"));
   public static final aba<cyv> d = aba.a(hm.Q, new abb("the_end"));
   private static final Set<aba<cyv>> e = ImmutableSet.of(b, c, d);
   private final hc<cyu> f;
   private final cxk g;

   public cyv(hc<cyu> $$0, cxk $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public hc<cyu> a() {
      return this.f;
   }

   public cxk b() {
      return this.g;
   }

   public static Stream<aba<cyv>> a(Stream<aba<cyv>> $$0) {
      return Stream.concat(e.stream(), $$0.filter($$0x -> !e.contains($$0x)));
   }

   public static hm<cyv> a(hm<cyv> $$0) {
      ht<cyv> $$1 = new hh<>(hm.Q, Lifecycle.experimental(), null);
      a($$0.e().stream()).forEach($$2 -> {
         cyv $$3 = $$0.a($$2);
         if ($$3 != null) {
            $$1.a($$2, $$3, $$0.d($$3));
         }

      });
      return $$1;
   }

   public static boolean b(hm<cyv> $$0) {
      if ($$0.b() != e.size()) {
         return false;
      } else {
         Optional<cyv> $$1 = $$0.f(b);
         Optional<cyv> $$2 = $$0.f(c);
         Optional<cyv> $$3 = $$0.f(d);
         if (!$$1.isEmpty() && !$$2.isEmpty() && !$$3.isEmpty()) {
            if (!((cyv)$$1.get()).a().a(cys.a) && !((cyv)$$1.get()).a().a(cys.d)) {
               return false;
            } else if (!((cyv)$$2.get()).a().a(cys.b)) {
               return false;
            } else if (!((cyv)$$3.get()).a().a(cys.c)) {
               return false;
            } else if (((cyv)$$2.get()).b() instanceof dau $$4 && ((cyv)$$3.get()).b() instanceof dau $$5) {
               if (!$$4.a(daw.f)) {
                  return false;
               } else if (!$$5.a(daw.g)) {
                  return false;
               } else if (!($$4.d() instanceof cig)) {
                  return false;
               } else {
                  cig $$6 = (cig)$$4.d();
                  if (!$$6.a(cig.a.a)) {
                     return false;
                  } else {
                     chx $$7 = ((cyv)$$1.get()).b().d();
                     if ($$7 instanceof cig && !((cig)$$7).a(cig.a.b)) {
                        return false;
                     } else {
                        return $$5.d() instanceof cii;
                     }
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }
}
