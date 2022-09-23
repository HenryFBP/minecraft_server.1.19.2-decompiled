import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import javax.annotation.Nullable;

public class col {
   public static final col.e[] a = new col.e[]{col.e.a, col.e.b, col.e.c};
   private final col.b b;

   public col(cok $$0) {
      this(new col.a($$0));
   }

   public col(col.b $$0) {
      this.b = $$0;
   }

   public boolean a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return gy.a().anyMatch($$4 -> this.a($$0, $$1, $$2, $$3, $$4, this.b::a).isPresent());
   }

   public Optional<col.c> a(cvo $$0, cgy $$1, gt $$2, amn $$3) {
      return (Optional<col.c>)gy.a($$3)
         .stream()
         .filter($$1x -> this.b.b($$0, $$1x))
         .map($$4 -> this.a($$0, $$1, $$2, $$4, $$3, false))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   public long a(cvo $$0, cgy $$1, gt $$2, boolean $$3) {
      return gy.a().filter($$1x -> this.b.b($$0, $$1x)).map($$4 -> this.a($$0, $$1, $$2, $$4, $$3)).reduce(0L, Long::sum);
   }

   public Optional<col.c> a(cvo $$0, cgy $$1, gt $$2, gy $$3, amn $$4, boolean $$5) {
      return (Optional<col.c>)gy.a($$4)
         .stream()
         .map($$5x -> this.a($$0, $$1, $$2, $$3, $$5x, $$5))
         .filter(Optional::isPresent)
         .findFirst()
         .orElse(Optional.empty());
   }

   private long a(cvo $$0, cgy $$1, gt $$2, gy $$3, boolean $$4) {
      return gy.a().map($$5 -> this.a($$0, $$1, $$2, $$3, $$5, $$4)).filter(Optional::isPresent).count();
   }

   @VisibleForTesting
   public Optional<col.c> a(cvo $$0, cgy $$1, gt $$2, gy $$3, gy $$4, boolean $$5) {
      return this.a($$0, $$1, $$2, $$3, $$4, this.b::a).flatMap($$2x -> this.a($$1, $$2x, $$5));
   }

   public Optional<col.c> a(cvo $$0, cgd $$1, gt $$2, gy $$3, gy $$4, col.d $$5) {
      if ($$4.o() == $$3.o()) {
         return Optional.empty();
      } else if (this.b.a($$0) || this.b.a($$0, $$3) && !this.b.a($$0, $$4)) {
         for(col.e $$6 : this.b.a()) {
            col.c $$7 = $$6.a($$2, $$4, $$3);
            if ($$5.test($$1, $$2, $$7)) {
               return Optional.of($$7);
            }
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public Optional<col.c> a(cgy $$0, col.c $$1, boolean $$2) {
      cvo $$3 = $$0.a_($$1.a());
      return this.b.a($$0, $$1, $$3, $$2) ? Optional.of($$1) : Optional.empty();
   }

   public static class a implements col.b {
      protected cok a;

      public a(cok $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public cvo a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
         return this.a.c($$0, $$1, $$2, $$3);
      }

      protected boolean a(cgd $$0, gt $$1, gt $$2, gy $$3, cvo $$4) {
         return $$4.h() || $$4.a(this.a) || $$4.a(cju.C) && $$4.p().b();
      }

      @Override
      public boolean a(cgd $$0, gt $$1, col.c $$2) {
         cvo $$3 = $$0.a_($$2.a());
         return this.a($$0, $$1, $$2.a(), $$2.b(), $$3) && this.a.a($$0, $$3, $$2.a(), $$2.b());
      }
   }

   public interface b {
      @Nullable
      cvo a(cvo var1, cgd var2, gt var3, gy var4);

      boolean a(cgd var1, gt var2, col.c var3);

      default col.e[] a() {
         return col.a;
      }

      default boolean a(cvo $$0, gy $$1) {
         return cok.a($$0, $$1);
      }

      default boolean a(cvo $$0) {
         return false;
      }

      default boolean b(cvo $$0, gy $$1) {
         return this.a($$0) || this.a($$0, $$1);
      }

      default boolean a(cgy $$0, col.c $$1, cvo $$2, boolean $$3) {
         cvo $$4 = this.a($$2, $$0, $$1.a(), $$1.b());
         if ($$4 != null) {
            if ($$3) {
               $$0.B($$1.a()).e($$1.a());
            }

            return $$0.a($$1.a(), $$4, 2);
         } else {
            return false;
         }
      }
   }

   public static record c(gt a, gy b) {
   }

   @FunctionalInterface
   public interface d {
      boolean test(cgd var1, gt var2, col.c var3);
   }

   public static enum e {
      a {
         @Override
         public col.c a(gt $$0, gy $$1, gy $$2) {
            return new col.c($$0, $$1);
         }
      },
      b {
         @Override
         public col.c a(gt $$0, gy $$1, gy $$2) {
            return new col.c($$0.a($$1), $$2);
         }
      },
      c {
         @Override
         public col.c a(gt $$0, gy $$1, gy $$2) {
            return new col.c($$0.a($$1).a($$2), $$1.g());
         }
      };

      public abstract col.c a(gt var1, gy var2, gy var3);
   }
}
