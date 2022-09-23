import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public final class dau extends cxk {
   public static final Codec<dau> e = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aay.b(hm.aS).forGetter($$0x -> $$0x.i),
                  chx.a.fieldOf("biome_source").forGetter($$0x -> $$0x.c),
                  daw.b.fieldOf("settings").forGetter($$0x -> $$0x.g)
               )
            )
            .apply($$0, $$0.stable(dau::new))
   );
   private static final cvo h = cju.a.m();
   protected final cvo f;
   private final hm<dpa.a> i;
   protected final hc<daw> g;
   private final dad.a j;

   public dau(hm<dlh> $$0, hm<dpa.a> $$1, chx $$2, hc<daw> $$3) {
      super($$0, Optional.empty(), $$2);
      this.i = $$1;
      this.g = $$3;
      daw $$4 = (daw)this.g.a();
      this.f = $$4.g();
      dad.b $$5 = new dad.b(-54, cju.D.m());
      int $$6 = $$4.l();
      dad.b $$7 = new dad.b($$6, $$4.h());
      dad.b $$8 = new dad.b(cyu.e * 2, cju.a.m());
      this.j = ($$4x, $$5x, $$6x) -> $$5x < Math.min(-54, $$6) ? $$5 : $$7;
   }

   @Override
   public CompletableFuture<cxj> a(hm<cht> $$0, Executor $$1, dbf $$2, dbr $$3, cho $$4, cxj $$5) {
      return CompletableFuture.supplyAsync(ad.a("init_biomes", (Supplier)(() -> {
         this.a($$3, $$2, $$4, $$5);
         return $$5;
      })), ad.g());
   }

   private void a(dbr $$0, dbf $$1, cho $$2, cxj $$3) {
      dav $$4 = $$3.a((Function<cxj, dav>)($$3x -> this.a($$3x, $$2, $$0, $$1)));
      chw $$5 = daf.a($$0.a(this.c), $$3);
      $$3.a($$5, $$4.a($$1.b(), ((daw)this.g.a()).k()));
   }

   private dav a(cxj $$0, cho $$1, dbr $$2, dbf $$3) {
      return dav.a($$0, $$3, dae.a($$1, $$0.f()), (daw)this.g.a(), this.j, $$2);
   }

   @Override
   protected Codec<? extends cxk> b() {
      return e;
   }

   public hc<daw> h() {
      return this.g;
   }

   public boolean a(aba<daw> $$0) {
      return this.g.a($$0);
   }

   @Override
   public int a(int $$0, int $$1, dar.a $$2, cgz $$3, dbf $$4) {
      return this.a($$3, $$4, $$0, $$1, null, $$2.e()).orElse($$3.u_());
   }

   @Override
   public chj a(int $$0, int $$1, cgz $$2, dbf $$3) {
      MutableObject<chj> $$4 = new MutableObject();
      this.a($$2, $$3, $$0, $$1, $$4, null);
      return (chj)$$4.getValue();
   }

   @Override
   public void a(List<String> $$0, dbf $$1, gt $$2) {
      DecimalFormat $$3 = new DecimalFormat("0.000");
      dax $$4 = $$1.b();
      dak.e $$5 = new dak.e($$2.u(), $$2.v(), $$2.w());
      double $$6 = $$4.j().a($$5);
      $$0.add(
         "NoiseRouter T: "
            + $$3.format($$4.e().a($$5))
            + " V: "
            + $$3.format($$4.f().a($$5))
            + " C: "
            + $$3.format($$4.g().a($$5))
            + " E: "
            + $$3.format($$4.h().a($$5))
            + " D: "
            + $$3.format($$4.i().a($$5))
            + " W: "
            + $$3.format($$6)
            + " PV: "
            + $$3.format((double)day.a((float)$$6))
            + " AS: "
            + $$3.format($$4.k().a($$5))
            + " N: "
            + $$3.format($$4.l().a($$5))
      );
   }

   private OptionalInt a(cgz $$0, dbf $$1, int $$2, int $$3, @Nullable MutableObject<chj> $$4, @Nullable Predicate<cvo> $$5) {
      daz $$6 = ((daw)this.g.a()).f().a($$0);
      int $$7 = $$6.a();
      int $$8 = $$6.c();
      int $$9 = ami.a($$8, $$7);
      int $$10 = ami.a($$6.d(), $$7);
      if ($$10 <= 0) {
         return OptionalInt.empty();
      } else {
         cvo[] $$11;
         if ($$4 == null) {
            $$11 = null;
         } else {
            $$11 = new cvo[$$6.d()];
            $$4.setValue(new chj($$8, $$11));
         }

         int $$13 = $$6.b();
         int $$14 = Math.floorDiv($$2, $$13);
         int $$15 = Math.floorDiv($$3, $$13);
         int $$16 = Math.floorMod($$2, $$13);
         int $$17 = Math.floorMod($$3, $$13);
         int $$18 = $$14 * $$13;
         int $$19 = $$15 * $$13;
         double $$20 = (double)$$16 / (double)$$13;
         double $$21 = (double)$$17 / (double)$$13;
         dav $$22 = new dav(1, $$1, $$18, $$19, $$6, dal.b.a, (daw)this.g.a(), this.j, dbr.a());
         $$22.f();
         $$22.b(0);

         for(int $$23 = $$10 - 1; $$23 >= 0; --$$23) {
            $$22.b($$23, 0);

            for(int $$24 = $$7 - 1; $$24 >= 0; --$$24) {
               int $$25 = ($$9 + $$23) * $$7 + $$24;
               double $$26 = (double)$$24 / (double)$$7;
               $$22.a($$25, $$26);
               $$22.b($$2, $$20);
               $$22.c($$3, $$21);
               cvo $$27 = $$22.e();
               cvo $$28 = $$27 == null ? this.f : $$27;
               if ($$11 != null) {
                  int $$29 = $$23 * $$7 + $$24;
                  $$11[$$29] = $$28;
               }

               if ($$5 != null && $$5.test($$28)) {
                  $$22.g();
                  return OptionalInt.of($$25 + 1);
               }
            }
         }

         $$22.g();
         return OptionalInt.empty();
      }
   }

   @Override
   public void a(agn $$0, cho $$1, dbf $$2, cxj $$3) {
      if (!ab.a($$3.f())) {
         dbn $$4 = new dbn(this, $$0);
         this.a($$3, $$4, $$2, $$1, $$0.s_(), $$0.s().d(hm.aR), dbr.a($$0));
      }
   }

   @VisibleForTesting
   public void a(cxj $$0, dbn $$1, dbf $$2, cho $$3, chv $$4, hm<cht> $$5, dbr $$6) {
      dav $$7 = $$0.a((Function<cxj, dav>)($$3x -> this.a($$3x, $$3, $$6, $$2)));
      daw $$8 = (daw)this.g.a();
      $$2.d().a($$2, $$4, $$5, $$8.n(), $$1, $$0, $$7, $$8.j());
   }

   @Override
   public void a(agn $$0, long $$1, dbf $$2, chv $$3, cho $$4, cxj $$5, dan.a $$6) {
      chv $$7 = $$3.a(($$1x, $$2x, $$3x) -> this.c.getNoiseBiome($$1x, $$2x, $$3x, $$2.c()));
      dbo $$8 = new dbo(new das(dbg.a()));
      int $$9 = 8;
      cge $$10 = $$5.f();
      dav $$11 = $$5.a((Function<cxj, dav>)($$3x -> this.a($$3x, $$4, dbr.a($$0), $$2)));
      dad $$12 = $$11.i();
      dcp $$13 = new dcp(this, $$0.s(), $$5.z(), $$11, $$2, ((daw)this.g.a()).j());
      cxi $$14 = ((cyc)$$5).b($$6);

      for(int $$15 = -8; $$15 <= 8; ++$$15) {
         for(int $$16 = -8; $$16 <= 8; ++$$16) {
            cge $$17 = new cge($$10.e + $$15, $$10.f + $$16);
            cxj $$18 = $$0.a($$17.e, $$17.f);
            chu $$19 = $$18.a((Supplier<chu>)(() -> this.a(this.c.getNoiseBiome(hl.a($$17.d()), 0, hl.a($$17.e()), $$2.c()))));
            Iterable<hc<dcs<?>>> $$20 = $$19.a($$6);
            int $$21 = 0;

            for(hc<dcs<?>> $$22 : $$20) {
               dcs<?> $$23 = (dcs)$$22.a();
               $$8.c($$1 + (long)$$21, $$17.e, $$17.f);
               if ($$23.a($$8)) {
                  $$23.a($$13, $$5, $$7::a, $$8, $$12, $$17, $$14);
               }

               ++$$21;
            }
         }
      }

   }

   @Override
   public CompletableFuture<cxj> a(Executor $$0, dbr $$1, dbf $$2, cho $$3, cxj $$4) {
      daz $$5 = ((daw)this.g.a()).f().a($$4.z());
      int $$6 = $$5.c();
      int $$7 = ami.a($$6, $$5.a());
      int $$8 = ami.a($$5.d(), $$5.a());
      if ($$8 <= 0) {
         return CompletableFuture.completedFuture($$4);
      } else {
         int $$9 = $$4.e($$8 * $$5.a() - 1 + $$6);
         int $$10 = $$4.e($$6);
         Set<cxu> $$11 = Sets.newHashSet();

         for(int $$12 = $$9; $$12 >= $$10; --$$12) {
            cxu $$13 = $$4.b($$12);
            $$13.a();
            $$11.add($$13);
         }

         return CompletableFuture.supplyAsync(ad.a("wgen_fill_noise", (Supplier)(() -> this.a($$1, $$3, $$2, $$4, $$7, $$8))), ad.g())
            .whenCompleteAsync(($$1x, $$2x) -> {
               for(cxu $$3x : $$11) {
                  $$3x.b();
               }
   
            }, $$0);
      }
   }

   private cxj a(dbr $$0, cho $$1, dbf $$2, cxj $$3, int $$4, int $$5) {
      dav $$6 = $$3.a((Function<cxj, dav>)($$3x -> this.a($$3x, $$1, $$0, $$2)));
      dar $$7 = $$3.a(dar.a.c);
      dar $$8 = $$3.a(dar.a.a);
      cge $$9 = $$3.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dad $$12 = $$6.i();
      $$6.f();
      gt.a $$13 = new gt.a();
      int $$14 = $$6.j();
      int $$15 = $$6.k();
      int $$16 = 16 / $$14;
      int $$17 = 16 / $$14;

      for(int $$18 = 0; $$18 < $$16; ++$$18) {
         $$6.b($$18);

         for(int $$19 = 0; $$19 < $$17; ++$$19) {
            cxu $$20 = $$3.b($$3.ai() - 1);

            for(int $$21 = $$5 - 1; $$21 >= 0; --$$21) {
               $$6.b($$21, $$19);

               for(int $$22 = $$15 - 1; $$22 >= 0; --$$22) {
                  int $$23 = ($$4 + $$21) * $$15 + $$22;
                  int $$24 = $$23 & 15;
                  int $$25 = $$3.e($$23);
                  if ($$3.e($$20.g()) != $$25) {
                     $$20 = $$3.b($$25);
                  }

                  double $$26 = (double)$$22 / (double)$$15;
                  $$6.a($$23, $$26);

                  for(int $$27 = 0; $$27 < $$14; ++$$27) {
                     int $$28 = $$10 + $$18 * $$14 + $$27;
                     int $$29 = $$28 & 15;
                     double $$30 = (double)$$27 / (double)$$14;
                     $$6.b($$28, $$30);

                     for(int $$31 = 0; $$31 < $$14; ++$$31) {
                        int $$32 = $$11 + $$19 * $$14 + $$31;
                        int $$33 = $$32 & 15;
                        double $$34 = (double)$$31 / (double)$$14;
                        $$6.c($$32, $$34);
                        cvo $$35 = $$6.e();
                        if ($$35 == null) {
                           $$35 = this.f;
                        }

                        $$35 = this.a($$6, $$28, $$23, $$32, $$35);
                        if ($$35 != h && !ab.a($$3.f())) {
                           if ($$35.g() != 0 && $$3 instanceof cyc) {
                              $$13.d($$28, $$23, $$32);
                              ((cyc)$$3).j($$13);
                           }

                           $$20.a($$29, $$24, $$33, $$35, false);
                           $$7.a($$29, $$23, $$33, $$35);
                           $$8.a($$29, $$23, $$33, $$35);
                           if ($$12.a() && !$$35.p().c()) {
                              $$13.d($$28, $$23, $$32);
                              $$3.e($$13);
                           }
                        }
                     }
                  }
               }
            }
         }

         $$6.h();
      }

      $$6.g();
      return $$3;
   }

   private cvo a(dav $$0, int $$1, int $$2, int $$3, cvo $$4) {
      return $$4;
   }

   @Override
   public int e() {
      return ((daw)this.g.a()).f().d();
   }

   @Override
   public int f() {
      return ((daw)this.g.a()).l();
   }

   @Override
   public int g() {
      return ((daw)this.g.a()).f().c();
   }

   @Override
   public void a(agn $$0) {
      if (!((daw)this.g.a()).a()) {
         cge $$1 = $$0.a();
         hc<cht> $$2 = $$0.w($$1.l().h($$0.ah() - 1));
         dbo $$3 = new dbo(new das(dbg.a()));
         $$3.a($$0.B(), $$1.d(), $$1.e());
         chi.a($$0, $$2, $$1, $$3);
      }
   }
}
