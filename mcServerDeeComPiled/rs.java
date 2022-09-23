import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class rs {
   public static final String a = ", ";
   public static final rq b = rq.b(", ").a(p.h);
   public static final rq c = rq.b(", ");

   public static sb a(sb $$0, sj $$1) {
      if ($$1.g()) {
         return $$0;
      } else {
         sj $$2 = $$0.a();
         if ($$2.g()) {
            return $$0.b($$1);
         } else {
            return $$2.equals($$1) ? $$0 : $$0.b($$2.a($$1));
         }
      }
   }

   public static Optional<sb> a(@Nullable dr $$0, Optional<rq> $$1, @Nullable bbn $$2, int $$3) throws CommandSyntaxException {
      return $$1.isPresent() ? Optional.of(a($$0, (rq)$$1.get(), $$2, $$3)) : Optional.empty();
   }

   public static sb a(@Nullable dr $$0, rq $$1, @Nullable bbn $$2, int $$3) throws CommandSyntaxException {
      if ($$3 > 100) {
         return $$1.e();
      } else {
         sb $$4 = $$1.b().a($$0, $$2, $$3 + 1);

         for(rq $$5 : $$1.c()) {
            $$4.b(a($$0, $$5, $$2, $$3 + 1));
         }

         return $$4.c(a($$0, $$1.a(), $$2, $$3));
      }
   }

   private static sj a(@Nullable dr $$0, sj $$1, @Nullable bbn $$2, int $$3) throws CommandSyntaxException {
      rv $$4 = $$1.i();
      if ($$4 != null) {
         rq $$5 = $$4.a(rv.a.a);
         if ($$5 != null) {
            rv $$6 = new rv(rv.a.a, a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
         }
      }

      return $$1;
   }

   public static rq a(GameProfile $$0) {
      if ($$0.getName() != null) {
         return rq.b($$0.getName());
      } else {
         return $$0.getId() != null ? rq.b($$0.getId().toString()) : rq.b("(unknown)");
      }
   }

   public static rq a(Collection<String> $$0) {
      return a($$0, $$0x -> rq.b($$0x).a(p.k));
   }

   public static <T extends Comparable<T>> rq a(Collection<T> $$0, Function<T, rq> $$1) {
      if ($$0.isEmpty()) {
         return rp.a;
      } else if ($$0.size() == 1) {
         return (rq)$$1.apply((Comparable)$$0.iterator().next());
      } else {
         List<T> $$2 = Lists.newArrayList($$0);
         $$2.sort(Comparable::compareTo);
         return b($$2, $$1);
      }
   }

   public static <T> rq b(Collection<? extends T> $$0, Function<T, rq> $$1) {
      return a($$0, b, $$1);
   }

   public static <T> sb a(Collection<? extends T> $$0, Optional<? extends rq> $$1, Function<T, rq> $$2) {
      return a($$0, (rq)DataFixUtils.orElse($$1, b), $$2);
   }

   public static rq a(Collection<? extends rq> $$0, rq $$1) {
      return a($$0, $$1, Function.identity());
   }

   public static <T> sb a(Collection<? extends T> $$0, rq $$1, Function<T, rq> $$2) {
      if ($$0.isEmpty()) {
         return rq.h();
      } else if ($$0.size() == 1) {
         return ((rq)$$2.apply($$0.iterator().next())).e();
      } else {
         sb $$3 = rq.h();
         boolean $$4 = true;

         for(T $$5 : $$0) {
            if (!$$4) {
               $$3.b($$1);
            }

            $$3.b((rq)$$2.apply($$5));
            $$4 = false;
         }

         return $$3;
      }
   }

   public static sb a(rq $$0) {
      return rq.a("chat.square_brackets", $$0);
   }

   public static rq a(Message $$0) {
      return (rq)($$0 instanceof rq ? (rq)$$0 : rq.b($$0.getString()));
   }

   public static boolean b(@Nullable rq $$0) {
      if ($$0 != null) {
         rr $$2 = $$0.b();
         if ($$2 instanceof sx $$1) {
            String $$2 = $$1.a();
            return pe.a().b($$2);
         }
      }

      return true;
   }
}
