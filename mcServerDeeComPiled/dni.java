import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class dni extends dlb {
   private static final String[] e = new String[]{
      "ruined_portal/portal_1",
      "ruined_portal/portal_2",
      "ruined_portal/portal_3",
      "ruined_portal/portal_4",
      "ruined_portal/portal_5",
      "ruined_portal/portal_6",
      "ruined_portal/portal_7",
      "ruined_portal/portal_8",
      "ruined_portal/portal_9",
      "ruined_portal/portal_10"
   };
   private static final String[] f = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};
   private static final float g = 0.05F;
   private static final int h = 15;
   private final List<dni.a> i;
   public static final Codec<dni> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), alq.a(dni.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, dni::new)
   );

   public dni(dlb.c $$0, List<dni.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public dni(dlb.c $$0, dni.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      dnh.a $$1 = new dnh.a();
      dbo $$2 = $$0.f();
      dni.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for(dni.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for(dni.a $$7 : this.i) {
            $$6 -= $$7.h() / $$4;
            if ($$6 < 0.0F) {
               $$3 = $$7;
               break;
            }
         }
      } else {
         $$3 = (dni.a)this.i.get(0);
      }

      if ($$3 == null) {
         throw new IllegalStateException();
      } else {
         dni.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         abb $$9;
         if ($$2.i() < 0.05F) {
            $$9 = new abb(f[$$2.a(f.length)]);
         } else {
            $$9 = new abb(e[$$2.a(e.length)]);
         }

         dot $$11 = $$0.e().a($$9);
         cpw $$12 = ad.a(cpw.values(), $$2);
         coh $$13 = $$2.i() < 0.5F ? coh.a : coh.c;
         gt $$14 = new gt($$11.a().u() / 2, 0, $$11.a().w() / 2);
         cxk $$15 = $$0.b();
         cgz $$16 = $$0.i();
         dbf $$17 = $$0.d();
         gt $$18 = $$0.h().l();
         dkt $$19 = $$11.a($$18, $$12, $$14, $$13);
         gt $$20 = $$19.f();
         int $$21 = $$15.a($$20.u(), $$20.w(), dnh.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.d(), $$19, $$16, $$17);
         gt $$23 = new gt($$18.u(), $$22, $$18.w());
         return Optional.of(new dlb.b($$23, (Consumer<dlt>)($$10 -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(hl.a($$23.u()), hl.a($$23.v()), hl.a($$23.w()), $$17.c()));
            }

            $$10.a(new dnh($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(dbo $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else if ($$1 == 1.0F) {
         return true;
      } else {
         return $$0.i() < $$1;
      }
   }

   private static boolean a(gt $$0, hc<cht> $$1) {
      return $$1.a().a($$0);
   }

   private static int a(amn $$0, cxk $$1, dnh.b $$2, boolean $$3, int $$4, int $$5, dkt $$6, cgz $$7, dbf $$8) {
      int $$9 = $$7.u_() + 15;
      int $$10;
      if ($$2 == dnh.b.f) {
         if ($$3) {
            $$10 = ami.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = ami.b($$0, 27, 29);
         } else {
            $$10 = ami.b($$0, 29, 100);
         }
      } else if ($$2 == dnh.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == dnh.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == dnh.b.b) {
         $$10 = $$4 - $$5 + ami.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<gt> $$19 = ImmutableList.of(new gt($$6.g(), 0, $$6.i()), new gt($$6.j(), 0, $$6.i()), new gt($$6.g(), 0, $$6.l()), new gt($$6.j(), 0, $$6.l()));
      List<chj> $$20 = (List)$$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      dar.a $$21 = $$2 == dnh.b.c ? dar.a.c : dar.a.a;

      int $$22;
      for($$22 = $$10; $$22 > $$9; --$$22) {
         int $$23 = 0;

         for(chj $$24 : $$20) {
            cvo $$25 = $$24.a($$22);
            if ($$21.e().test($$25) && ++$$23 == 3) {
               return $$22;
            }
         }
      }

      return $$22;
   }

   private static int a(amn $$0, int $$1, int $$2) {
      return $$1 < $$2 ? ami.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public dlk<?> e() {
      return dlk.l;
   }

   public static record a(dnh.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<dni.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dnh.b.g.fieldOf("placement").forGetter(dni.a::a),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(dni.a::b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(dni.a::c),
                  Codec.BOOL.fieldOf("overgrown").forGetter(dni.a::d),
                  Codec.BOOL.fieldOf("vines").forGetter(dni.a::e),
                  Codec.BOOL.fieldOf("can_be_cold").forGetter(dni.a::f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(dni.a::g),
                  alq.d.fieldOf("weight").forGetter(dni.a::h)
               )
               .apply($$0, dni.a::new)
      );

      public dnh.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public boolean f() {
         return this.g;
      }

      public boolean g() {
         return this.h;
      }

      public float h() {
         return this.i;
      }
   }
}
