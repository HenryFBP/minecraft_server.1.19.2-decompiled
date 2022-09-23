import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface cgo {
   List<bbn> a(@Nullable bbn var1, dwl var2, Predicate<? super bbn> var3);

   <T extends bbn> List<T> a(czj<bbn, T> var1, dwl var2, Predicate<? super T> var3);

   default <T extends bbn> List<T> a(Class<T> $$0, dwl $$1, Predicate<? super T> $$2) {
      return this.a(czj.a($$0), $$1, $$2);
   }

   List<? extends buc> w();

   default List<bbn> a_(@Nullable bbn $$0, dwl $$1) {
      return this.a($$0, $$1, bbq.f);
   }

   default boolean a(@Nullable bbn $$0, dxj $$1) {
      if ($$1.b()) {
         return true;
      } else {
         for(bbn $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dt() && $$2.q && ($$0 == null || !$$2.v($$0)) && dxg.c($$1, dxg.a($$2.cy()), dwu.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bbn> List<T> a(Class<T> $$0, dwl $$1) {
      return this.a($$0, $$1, bbq.f);
   }

   default List<dxj> b(@Nullable bbn $$0, dwl $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bbn> $$2 = $$0 == null ? bbq.g : bbq.f.and($$0::h);
         List<bbn> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<dxj> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for(bbn $$5 : $$3) {
               $$4.add(dxg.a($$5.cy()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default buc a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bbn> $$4) {
      double $$5 = -1.0;
      buc $$6 = null;

      for(buc $$7 : this.w()) {
         if ($$4 == null || $$4.test($$7)) {
            double $$8 = $$7.h($$0, $$1, $$2);
            if (($$3 < 0.0 || $$8 < $$3 * $$3) && ($$5 == -1.0 || $$8 < $$5)) {
               $$5 = $$8;
               $$6 = $$7;
            }
         }
      }

      return $$6;
   }

   @Nullable
   default buc a(bbn $$0, double $$1) {
      return this.a($$0.df(), $$0.dh(), $$0.dl(), $$1, false);
   }

   @Nullable
   default buc a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bbn> $$5 = $$4 ? bbq.e : bbq.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for(buc $$4 : this.w()) {
         if (bbq.f.test($$4) && bbq.b.test($$4)) {
            double $$5 = $$4.h($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default buc a(bmf $$0, bcc $$1) {
      return this.a(this.w(), $$0, $$1, $$1.df(), $$1.dh(), $$1.dl());
   }

   @Nullable
   default buc a(bmf $$0, bcc $$1, double $$2, double $$3, double $$4) {
      return this.a(this.w(), $$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   default buc a(bmf $$0, double $$1, double $$2, double $$3) {
      return this.a(this.w(), $$0, null, $$1, $$2, $$3);
   }

   @Nullable
   default <T extends bcc> T a(Class<? extends T> $$0, bmf $$1, @Nullable bcc $$2, double $$3, double $$4, double $$5, dwl $$6) {
      return this.a(this.a($$0, $$6, $$0x -> true), $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   default <T extends bcc> T a(List<? extends T> $$0, bmf $$1, @Nullable bcc $$2, double $$3, double $$4, double $$5) {
      double $$6 = -1.0;
      T $$7 = null;

      for(T $$8 : $$0) {
         if ($$1.a($$2, $$8)) {
            double $$9 = $$8.h($$3, $$4, $$5);
            if ($$6 == -1.0 || $$9 < $$6) {
               $$6 = $$9;
               $$7 = $$8;
            }
         }
      }

      return $$7;
   }

   default List<buc> a(bmf $$0, bcc $$1, dwl $$2) {
      List<buc> $$3 = Lists.newArrayList();

      for(buc $$4 : this.w()) {
         if ($$2.e($$4.df(), $$4.dh(), $$4.dl()) && $$0.a($$1, $$4)) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   default <T extends bcc> List<T> a(Class<T> $$0, bmf $$1, bcc $$2, dwl $$3) {
      List<T> $$4 = this.a($$0, $$3, $$0x -> true);
      List<T> $$5 = Lists.newArrayList();

      for(T $$6 : $$4) {
         if ($$1.a($$2, $$6)) {
            $$5.add($$6);
         }
      }

      return $$5;
   }

   @Nullable
   default buc b(UUID $$0) {
      for(int $$1 = 0; $$1 < this.w().size(); ++$$1) {
         buc $$2 = (buc)this.w().get($$1);
         if ($$0.equals($$2.co())) {
            return $$2;
         }
      }

      return null;
   }
}
