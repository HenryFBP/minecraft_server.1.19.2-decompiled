import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum f implements amw {
   a("identity", h.a, false, false, false),
   b("rot_180_face_xy", h.a, true, true, false),
   c("rot_180_face_xz", h.a, true, false, true),
   d("rot_180_face_yz", h.a, false, true, true),
   e("rot_120_nnn", h.d, false, false, false),
   f("rot_120_nnp", h.e, true, false, true),
   g("rot_120_npn", h.e, false, true, true),
   h("rot_120_npp", h.d, true, false, true),
   i("rot_120_pnn", h.e, true, true, false),
   j("rot_120_pnp", h.d, true, true, false),
   k("rot_120_ppn", h.d, false, true, true),
   l("rot_120_ppp", h.e, false, false, false),
   m("rot_180_edge_xy_neg", h.b, true, true, true),
   n("rot_180_edge_xy_pos", h.b, false, false, true),
   o("rot_180_edge_xz_neg", h.f, true, true, true),
   p("rot_180_edge_xz_pos", h.f, false, true, false),
   q("rot_180_edge_yz_neg", h.c, true, true, true),
   r("rot_180_edge_yz_pos", h.c, true, false, false),
   s("rot_90_x_neg", h.c, false, false, true),
   t("rot_90_x_pos", h.c, false, true, false),
   u("rot_90_y_neg", h.f, true, false, false),
   v("rot_90_y_pos", h.f, false, false, true),
   w("rot_90_z_neg", h.b, false, true, false),
   x("rot_90_z_pos", h.b, true, false, false),
   y("inversion", h.a, true, true, true),
   z("invert_x", h.a, true, false, false),
   A("invert_y", h.a, false, true, false),
   B("invert_z", h.a, false, false, true),
   C("rot_60_ref_nnn", h.e, true, true, true),
   D("rot_60_ref_nnp", h.d, true, false, false),
   E("rot_60_ref_npn", h.d, false, false, true),
   F("rot_60_ref_npp", h.e, false, false, true),
   G("rot_60_ref_pnn", h.d, false, true, false),
   H("rot_60_ref_pnp", h.e, true, false, false),
   I("rot_60_ref_ppn", h.e, false, true, false),
   J("rot_60_ref_ppp", h.d, true, true, true),
   K("swap_xy", h.b, false, false, false),
   L("swap_yz", h.c, false, false, false),
   M("swap_xz", h.f, false, false, false),
   N("swap_neg_xy", h.b, true, true, false),
   O("swap_neg_yz", h.c, false, true, true),
   P("swap_neg_xz", h.f, true, false, true),
   Q("rot_90_ref_x_neg", h.c, true, false, true),
   R("rot_90_ref_x_pos", h.c, true, true, false),
   S("rot_90_ref_y_neg", h.f, true, true, false),
   T("rot_90_ref_y_pos", h.f, false, true, true),
   U("rot_90_ref_z_neg", h.b, false, true, true),
   V("rot_90_ref_z_pos", h.b, true, false, true);

   private final c X;
   private final String Y;
   @Nullable
   private Map<gy, gy> Z;
   private final boolean aa;
   private final boolean ab;
   private final boolean ac;
   private final h ad;
   private static final f[][] ae = ad.a(new f[values().length][values().length], $$0 -> {
      Map<Pair<h, BooleanList>, f> $$1 = (Map)Arrays.stream(values()).collect(Collectors.toMap($$0x -> Pair.of($$0x.ad, $$0x.d()), $$0x -> $$0x));

      for(f $$2 : values()) {
         for(f $$3 : values()) {
            BooleanList $$4 = $$2.d();
            BooleanList $$5 = $$3.d();
            h $$6 = $$3.ad.a($$2.ad);
            BooleanArrayList $$7 = new BooleanArrayList(3);

            for(int $$8 = 0; $$8 < 3; ++$$8) {
               $$7.add($$4.getBoolean($$8) ^ $$5.getBoolean($$2.ad.a($$8)));
            }

            $$0[$$2.ordinal()][$$3.ordinal()] = (f)$$1.get(Pair.of($$6, $$7));
         }
      }

   });
   private static final f[] af = (f[])Arrays.stream(values())
      .map($$0 -> (f)Arrays.stream(values()).filter($$1 -> $$0.a($$1) == a).findAny().get())
      .toArray($$0 -> new f[$$0]);

   private f(String $$0, h $$1, boolean $$2, boolean $$3, boolean $$4) {
      this.Y = $$0;
      this.aa = $$2;
      this.ab = $$3;
      this.ac = $$4;
      this.ad = $$1;
      this.X = new c();
      this.X.a = $$2 ? -1.0F : 1.0F;
      this.X.e = $$3 ? -1.0F : 1.0F;
      this.X.i = $$4 ? -1.0F : 1.0F;
      this.X.b($$1.a());
   }

   private BooleanList d() {
      return new BooleanArrayList(new boolean[]{this.aa, this.ab, this.ac});
   }

   public f a(f $$0) {
      return ae[this.ordinal()][$$0.ordinal()];
   }

   public f a() {
      return af[this.ordinal()];
   }

   public c b() {
      return this.X.h();
   }

   public String toString() {
      return this.Y;
   }

   @Override
   public String c() {
      return this.Y;
   }

   public gy a(gy $$0) {
      if (this.Z == null) {
         this.Z = Maps.newEnumMap(gy.class);

         for(gy $$1 : gy.values()) {
            gy.a $$2 = $$1.o();
            gy.b $$3 = $$1.f();
            gy.a $$4 = gy.a.values()[this.ad.a($$2.ordinal())];
            gy.b $$5 = this.a($$4) ? $$3.c() : $$3;
            gy $$6 = gy.a($$4, $$5);
            this.Z.put($$1, $$6);
         }
      }

      return (gy)this.Z.get($$0);
   }

   public boolean a(gy.a $$0) {
      switch($$0) {
         case a:
            return this.aa;
         case b:
            return this.ab;
         case c:
         default:
            return this.ac;
      }
   }

   public ha a(ha $$0) {
      return ha.a(this.a($$0.a()), this.a($$0.b()));
   }
}
