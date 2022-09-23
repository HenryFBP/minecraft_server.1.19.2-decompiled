import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ahw {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final Supplier<ahl> c;
   private final rq d;
   private final rq e;
   private final ahx f;
   private final ahw.b g;
   private final boolean h;
   private final boolean i;
   private final ahz j;

   @Nullable
   public static ahw a(String $$0, boolean $$1, Supplier<ahl> $$2, ahw.a $$3, ahw.b $$4, ahz $$5) {
      try {
         ahw var8;
         try (ahl $$6 = (ahl)$$2.get()) {
            ahq $$7 = $$6.a(ahq.a);
            if ($$7 == null) {
               a.warn("Couldn't find pack meta for pack {}", $$0);
               return null;
            }

            var8 = $$3.create($$0, rq.b($$6.a()), $$1, $$2, $$7, $$4, $$5);
         }

         return var8;
      } catch (IOException var11) {
         a.warn("Couldn't get pack info for: {}", var11.toString());
         return null;
      }
   }

   public ahw(String $$0, boolean $$1, Supplier<ahl> $$2, rq $$3, rq $$4, ahx $$5, ahw.b $$6, boolean $$7, ahz $$8) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.h = $$1;
      this.g = $$6;
      this.i = $$7;
      this.j = $$8;
   }

   public ahw(String $$0, rq $$1, boolean $$2, Supplier<ahl> $$3, ahq $$4, ahm $$5, ahw.b $$6, ahz $$7) {
      this($$0, $$2, $$3, $$1, $$4.a(), ahx.a($$4, $$5), $$6, false, $$7);
   }

   public rq a() {
      return this.d;
   }

   public rq b() {
      return this.e;
   }

   public rq a(boolean $$0) {
      return rs.a(this.j.decorate(rq.b(this.b)))
         .a($$1 -> $$1.a($$0 ? p.k : p.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new rv(rv.a.a, rq.h().b(this.d).f("\n").b(this.e))));
   }

   public ahx c() {
      return this.f;
   }

   public ahl d() {
      return (ahl)this.c.get();
   }

   public String e() {
      return this.b;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public ahw.b h() {
      return this.g;
   }

   public ahz i() {
      return this.j;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof ahw)) {
         return false;
      } else {
         ahw $$1 = (ahw)$$0;
         return this.b.equals($$1.b);
      }
   }

   public int hashCode() {
      return this.b.hashCode();
   }

   @FunctionalInterface
   public interface a {
      @Nullable
      ahw create(String var1, rq var2, boolean var3, Supplier<ahl> var4, ahq var5, ahw.b var6, ahz var7);
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, ahw> $$2, boolean $$3) {
         ahw.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for($$5 = 0; $$5 < $$0.size(); ++$$5) {
               ahw $$6 = (ahw)$$2.apply($$0.get($$5));
               if (!$$6.g() || $$6.h() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for($$7 = $$0.size() - 1; $$7 >= 0; --$$7) {
               ahw $$8 = (ahw)$$2.apply($$0.get($$7));
               if (!$$8.g() || $$8.h() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public ahw.b a() {
         return this == a ? b : a;
      }
   }
}
