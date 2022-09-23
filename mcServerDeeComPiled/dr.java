import com.google.common.collect.Lists;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class dr implements dt {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("permissions.requires.entity"));
   private final dq c;
   private final dwq d;
   private final agg e;
   private final int f;
   private final String g;
   private final rq h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bbn k;
   @Nullable
   private final ResultConsumer<dr> l;
   private final ea.a m;
   private final dwp n;
   private final dp o;
   private final amy p;

   public dr(dq $$0, dwq $$1, dwp $$2, agg $$3, int $$4, String $$5, rq $$6, MinecraftServer $$7, @Nullable bbn $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, ($$0x, $$1x, $$2x) -> {
      }, ea.a.a, dp.a, amy.b);
   }

   protected dr(
      dq $$0,
      dwq $$1,
      dwp $$2,
      agg $$3,
      int $$4,
      String $$5,
      rq $$6,
      MinecraftServer $$7,
      @Nullable bbn $$8,
      boolean $$9,
      @Nullable ResultConsumer<dr> $$10,
      ea.a $$11,
      dp $$12,
      amy $$13
   ) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
      this.j = $$9;
      this.k = $$8;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.l = $$10;
      this.m = $$11;
      this.n = $$2;
      this.o = $$12;
      this.p = $$13;
   }

   public dr a(dq $$0) {
      return this.c == $$0 ? this : new dr($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dr a(bbn $$0) {
      return this.k == $$0
         ? this
         : new dr(this.c, this.d, this.n, this.e, this.f, $$0.X().getString(), $$0.C_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public dr a(dwq $$0) {
      return this.d.equals($$0) ? this : new dr(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dr a(dwp $$0) {
      return this.n.c($$0) ? this : new dr(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dr a(ResultConsumer<dr> $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new dr(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public dr a(ResultConsumer<dr> $$0, BinaryOperator<ResultConsumer<dr>> $$1) {
      ResultConsumer<dr> $$2 = (ResultConsumer)$$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public dr a() {
      return !this.j && !this.c.d_()
         ? new dr(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public dr a(int $$0) {
      return $$0 == this.f ? this : new dr(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dr b(int $$0) {
      return $$0 <= this.f ? this : new dr(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public dr a(ea.a $$0) {
      return $$0 == this.m ? this : new dr(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public dr a(agg $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = cyu.a(this.e.q_(), $$0.q_());
         dwq $$2 = new dwq(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new dr(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public dr a(bbn $$0, ea.a $$1) {
      return this.b($$1.a($$0));
   }

   public dr b(dwq $$0) {
      dwq $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = ami.g((float)(-(ami.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = ami.g((float)(ami.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new dwp($$6, $$7));
   }

   public dr a(dp $$0) {
      return $$0 == this.o ? this : new dr(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, this.p);
   }

   public dr a(amy $$0) {
      return $$0 == this.p ? this : new dr(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, $$0);
   }

   public rq b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   public rl d() {
      return this.k != null ? this.k.aW() : rl.a;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public dwq e() {
      return this.d;
   }

   public agg f() {
      return this.e;
   }

   @Nullable
   public bbn g() {
      return this.k;
   }

   public bbn h() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public agh i() throws CommandSyntaxException {
      bbn var2 = this.k;
      if (var2 instanceof agh) {
         return (agh)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public agh j() {
      bbn var2 = this.k;
      return var2 instanceof agh $$0 ? $$0 : null;
   }

   public boolean k() {
      return this.k instanceof agh;
   }

   public dwp l() {
      return this.n;
   }

   public MinecraftServer m() {
      return this.i;
   }

   public ea.a n() {
      return this.m;
   }

   public dp o() {
      return this.o;
   }

   public amy p() {
      return this.p;
   }

   public boolean a(agh $$0) {
      agh $$1 = this.j();
      if ($$0 == $$1) {
         return false;
      } else {
         return $$1 != null && $$1.U() || $$0.U();
      }
   }

   public void a(sc $$0, boolean $$1, rm.a $$2) {
      if (!this.j) {
         agh $$3 = this.j();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }

      }
   }

   public void a(rq $$0) {
      if (!this.j) {
         agh $$1 = this.j();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }

      }
   }

   public void a(rq $$0, boolean $$1) {
      if (this.c.i_() && !this.j) {
         this.c.a($$0);
      }

      if ($$1 && this.c.G_() && !this.j) {
         this.c($$0);
      }

   }

   private void c(rq $$0) {
      rq $$1 = rq.a("chat.type.admin", this.b(), $$0).a(p.h, p.u);
      if (this.i.aK().b(cgt.o)) {
         for(agh $$2 : this.i.ac().t()) {
            if ($$2 != this.c && this.i.ac().e($$2.fy())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aK().b(cgt.l)) {
         this.i.a($$1);
      }

   }

   public void b(rq $$0) {
      if (this.c.j_() && !this.j) {
         this.c.a(rq.h().b($$0).a(p.m));
      }

   }

   public void a(CommandContext<dr> $$0, boolean $$1, int $$2) {
      if (this.l != null) {
         this.l.onCommandComplete($$0, $$1, $$2);
      }

   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.i.I());
   }

   @Override
   public Collection<String> r() {
      return this.i.aF().f();
   }

   @Override
   public Collection<abb> s() {
      return hm.S.d();
   }

   @Override
   public Stream<abb> t() {
      return this.i.aE().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(aba<? extends hm<?>> $$0, dt.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return (CompletableFuture<Suggestions>)this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<aba<cgx>> u() {
      return this.i.D();
   }

   @Override
   public hn v() {
      return this.i.aX();
   }
}
