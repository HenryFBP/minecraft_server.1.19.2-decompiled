import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fz {
   public static final int a = Integer.MAX_VALUE;
   private static final czj<bbn, ?> b = new czj<bbn, bbn>() {
      public bbn a(bbn $$0) {
         return $$0;
      }

      @Override
      public Class<? extends bbn> a() {
         return bbn.class;
      }
   };
   private final int c;
   private final boolean d;
   private final boolean e;
   private final Predicate<bbn> f;
   private final cj.c g;
   private final Function<dwq, dwq> h;
   @Nullable
   private final dwl i;
   private final BiConsumer<dwq, List<? extends bbn>> j;
   private final boolean k;
   @Nullable
   private final String l;
   @Nullable
   private final UUID m;
   private czj<bbn, ?> n;
   private final boolean o;

   public fz(
      int $$0,
      boolean $$1,
      boolean $$2,
      Predicate<bbn> $$3,
      cj.c $$4,
      Function<dwq, dwq> $$5,
      @Nullable dwl $$6,
      BiConsumer<dwq, List<? extends bbn>> $$7,
      boolean $$8,
      @Nullable String $$9,
      @Nullable UUID $$10,
      @Nullable bbr<?> $$11,
      boolean $$12
   ) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
      this.k = $$8;
      this.l = $$9;
      this.m = $$10;
      this.n = (czj<bbn, ?>)($$11 == null ? b : $$11);
      this.o = $$12;
   }

   public int a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.k;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.o;
   }

   private void e(dr $$0) throws CommandSyntaxException {
      if (this.o && !$$0.c(2)) {
         throw eb.f.create();
      }
   }

   public bbn a(dr $$0) throws CommandSyntaxException {
      this.e($$0);
      List<? extends bbn> $$1 = this.b($$0);
      if ($$1.isEmpty()) {
         throw eb.d.create();
      } else if ($$1.size() > 1) {
         throw eb.a.create();
      } else {
         return (bbn)$$1.get(0);
      }
   }

   public List<? extends bbn> b(dr $$0) throws CommandSyntaxException {
      this.e($$0);
      if (!this.d) {
         return this.d($$0);
      } else if (this.l != null) {
         agh $$1 = $$0.m().ac().a(this.l);
         return (List<? extends bbn>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new agh[]{$$1}));
      } else if (this.m != null) {
         for(agg $$2 : $$0.m().E()) {
            bbn $$3 = $$2.a(this.m);
            if ($$3 != null) {
               return Lists.newArrayList(new bbn[]{$$3});
            }
         }

         return Collections.emptyList();
      } else {
         dwq $$4 = (dwq)this.h.apply($$0.e());
         Predicate<bbn> $$5 = this.a($$4);
         if (this.k) {
            return (List<? extends bbn>)($$0.g() != null && $$5.test($$0.g()) ? Lists.newArrayList(new bbn[]{$$0.g()}) : Collections.emptyList());
         } else {
            List<bbn> $$6 = Lists.newArrayList();
            if (this.d()) {
               this.a($$6, $$0.f(), $$4, $$5);
            } else {
               for(agg $$7 : $$0.m().E()) {
                  this.a($$6, $$7, $$4, $$5);
               }
            }

            return this.a($$4, $$6);
         }
      }
   }

   private void a(List<bbn> $$0, agg $$1, dwq $$2, Predicate<bbn> $$3) {
      if (this.i != null) {
         $$0.addAll($$1.a(this.n, this.i.c($$2), $$3));
      } else {
         $$0.addAll($$1.a(this.n, $$3));
      }

   }

   public agh c(dr $$0) throws CommandSyntaxException {
      this.e($$0);
      List<agh> $$1 = this.d($$0);
      if ($$1.size() != 1) {
         throw eb.e.create();
      } else {
         return (agh)$$1.get(0);
      }
   }

   public List<agh> d(dr $$0) throws CommandSyntaxException {
      this.e($$0);
      if (this.l != null) {
         agh $$1 = $$0.m().ac().a(this.l);
         return (List<agh>)($$1 == null ? Collections.emptyList() : Lists.newArrayList(new agh[]{$$1}));
      } else if (this.m != null) {
         agh $$2 = $$0.m().ac().a(this.m);
         return (List<agh>)($$2 == null ? Collections.emptyList() : Lists.newArrayList(new agh[]{$$2}));
      } else {
         dwq $$3 = (dwq)this.h.apply($$0.e());
         Predicate<bbn> $$4 = this.a($$3);
         if (this.k) {
            if ($$0.g() instanceof agh $$5 && $$4.test($$5)) {
               return Lists.newArrayList(new agh[]{$$5});
            }

            return Collections.emptyList();
         } else {
            List<agh> $$6;
            if (this.d()) {
               $$6 = $$0.f().a($$4);
            } else {
               $$6 = Lists.newArrayList();

               for(agh $$8 : $$0.m().ac().t()) {
                  if ($$4.test($$8)) {
                     $$6.add($$8);
                  }
               }
            }

            return this.a($$3, $$6);
         }
      }
   }

   private Predicate<bbn> a(dwq $$0) {
      Predicate<bbn> $$1 = this.f;
      if (this.i != null) {
         dwl $$2 = this.i.c($$0);
         $$1 = $$1.and($$1x -> $$2.c($$1x.cy()));
      }

      if (!this.g.c()) {
         $$1 = $$1.and($$1x -> this.g.e($$1x.e($$0)));
      }

      return $$1;
   }

   private <T extends bbn> List<T> a(dwq $$0, List<T> $$1) {
      if ($$1.size() > 1) {
         this.j.accept($$0, $$1);
      }

      return $$1.subList(0, Math.min(this.c, $$1.size()));
   }

   public static rq a(List<? extends bbn> $$0) {
      return rs.b($$0, bbn::C_);
   }
}
