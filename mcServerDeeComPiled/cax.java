import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class cax {
   public static final Codec<cax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hm.Y.p().fieldOf("id").forGetter($$0x -> $$0x.t),
               Codec.INT.fieldOf("Count").forGetter($$0x -> $$0x.r),
               pj.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.u))
            )
            .apply($$0, cax::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final cax b = new cax((cat)null);
   public static final DecimalFormat c = ad.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
   public static final String d = "Enchantments";
   public static final String e = "display";
   public static final String f = "Name";
   public static final String g = "Lore";
   public static final String h = "Damage";
   public static final String i = "color";
   private static final String k = "Unbreakable";
   private static final String l = "RepairCost";
   private static final String m = "CanDestroy";
   private static final String n = "CanPlaceOn";
   private static final String o = "HideFlags";
   private static final int p = 0;
   private static final sj q = sj.a.a(p.f).b(true);
   private int r;
   private int s;
   @Deprecated
   private final cat t;
   @Nullable
   private pj u;
   private boolean v;
   @Nullable
   private bbn w;
   @Nullable
   private bym x;
   @Nullable
   private bym y;

   public Optional<byk> a() {
      return this.c().h(this);
   }

   public cax(cgw $$0) {
      this($$0, 1);
   }

   public cax(hc<cat> $$0) {
      this($$0.a(), 1);
   }

   private cax(cgw $$0, int $$1, Optional<pj> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cax(hc<cat> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cax(cgw $$0, int $$1) {
      this.t = $$0 == null ? null : $$0.l();
      this.r = $$1;
      if (this.t != null && this.t.o()) {
         this.b(this.j());
      }

      this.P();
   }

   private void P() {
      this.v = false;
      this.v = this.b();
   }

   private cax(pj $$0) {
      this.t = hm.Y.a(new abb($$0.l("id")));
      this.r = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.u = $$0.p("tag");
         this.c().b(this.u);
      }

      if (this.c().o()) {
         this.b(this.j());
      }

      this.P();
   }

   public static cax a(pj $$0) {
      try {
         return new cax($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      if (this == b) {
         return true;
      } else if (this.c() == null || this.a(caz.a)) {
         return true;
      } else {
         return this.r <= 0;
      }
   }

   public cax a(int $$0) {
      int $$1 = Math.min($$0, this.r);
      cax $$2 = this.o();
      $$2.e($$1);
      this.g($$1);
      return $$2;
   }

   public cat c() {
      return this.v ? caz.a : this.t;
   }

   public hc<cat> d() {
      return this.c().k();
   }

   public boolean a(akz<cat> $$0) {
      return this.c().k().a($$0);
   }

   public boolean a(cat $$0) {
      return this.c() == $$0;
   }

   public boolean a(Predicate<hc<cat>> $$0) {
      return $$0.test(this.c().k());
   }

   public boolean a(hc<cat> $$0) {
      return this.c().k() == $$0;
   }

   public Stream<akz<cat>> e() {
      return this.c().k().c();
   }

   public baj a(ccz $$0) {
      buc $$1 = $$0.o();
      gt $$2 = $$0.a();
      cvs $$3 = new cvs($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fB().e && !this.a($$0.q().s().d(hm.h), $$3)) {
         return baj.d;
      } else {
         cat $$4 = this.c();
         baj $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(akg.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(cvo $$0) {
      return this.c().a(this, $$0);
   }

   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      return this.c().a($$0, $$1, $$2);
   }

   public cax a(cgx $$0, bcc $$1) {
      return this.c().a(this, $$0, $$1);
   }

   public pj b(pj $$0) {
      abb $$1 = hm.Y.b(this.c());
      $$0.a("id", $$1 == null ? "minecraft:air" : $$1.toString());
      $$0.a("Count", (byte)this.r);
      if (this.u != null) {
         $$0.a("tag", (qc)this.u.g());
      }

      return $$0;
   }

   public int f() {
      return this.c().m();
   }

   public boolean g() {
      return this.f() > 1 && (!this.h() || !this.i());
   }

   public boolean h() {
      if (!this.v && this.c().n() > 0) {
         pj $$0 = this.u();
         return $$0 == null || !$$0.q("Unbreakable");
      } else {
         return false;
      }
   }

   public boolean i() {
      return this.h() && this.j() > 0;
   }

   public int j() {
      return this.u == null ? 0 : this.u.h("Damage");
   }

   public void b(int $$0) {
      this.v().a("Damage", Math.max(0, $$0));
   }

   public int k() {
      return this.c().n();
   }

   public boolean a(int $$0, amn $$1, @Nullable agh $$2) {
      if (!this.h()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cet.a(cev.w, this);
            int $$4 = 0;

            for(int $$5 = 0; $$3 > 0 && $$5 < $$0; ++$$5) {
               if (cep.a(this, $$3, $$1)) {
                  ++$$4;
               }
            }

            $$0 -= $$4;
            if ($$0 <= 0) {
               return false;
            }
         }

         if ($$2 != null && $$0 != 0) {
            aj.t.a($$2, this, this.j() + $$0);
         }

         int $$6 = this.j() + $$0;
         this.b($$6);
         return $$6 >= this.k();
      }
   }

   public <T extends bcc> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.s.y && (!($$1 instanceof buc) || !((buc)$$1).fB().d)) {
         if (this.h()) {
            if (this.a($$0, $$1.dQ(), $$1 instanceof agh ? (agh)$$1 : null)) {
               $$2.accept($$1);
               cat $$3 = this.c();
               this.g(1);
               if ($$1 instanceof buc) {
                  ((buc)$$1).b(akg.d.b($$3));
               }

               this.b(0);
            }

         }
      }
   }

   public boolean l() {
      return this.t.e(this);
   }

   public int m() {
      return this.t.f(this);
   }

   public int n() {
      return this.t.g(this);
   }

   public boolean a(byd $$0, bwu $$1, buc $$2) {
      return this.c().a(this, $$0, $$1, $$2);
   }

   public boolean a(cax $$0, byd $$1, bwu $$2, buc $$3, bct $$4) {
      return this.c().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bcc $$0, buc $$1) {
      cat $$2 = this.c();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(akg.c.b($$2));
      }

   }

   public void a(cgx $$0, cvo $$1, gt $$2, buc $$3) {
      cat $$4 = this.c();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(akg.c.b($$4));
      }

   }

   public boolean b(cvo $$0) {
      return this.c().a_($$0);
   }

   public baj a(buc $$0, bcc $$1, bai $$2) {
      return this.c().a(this, $$0, $$1, $$2);
   }

   public cax o() {
      if (this.b()) {
         return b;
      } else {
         cax $$0 = new cax(this.c(), this.r);
         $$0.d(this.J());
         if (this.u != null) {
            $$0.u = this.u.g();
         }

         return $$0;
      }
   }

   public static boolean a(cax $$0, cax $$1) {
      if ($$0.b() && $$1.b()) {
         return true;
      } else if ($$0.b() || $$1.b()) {
         return false;
      } else if ($$0.u == null && $$1.u != null) {
         return false;
      } else {
         return $$0.u == null || $$0.u.equals($$1.u);
      }
   }

   public static boolean b(cax $$0, cax $$1) {
      if ($$0.b() && $$1.b()) {
         return true;
      } else {
         return !$$0.b() && !$$1.b() ? $$0.c($$1) : false;
      }
   }

   private boolean c(cax $$0) {
      if (this.r != $$0.r) {
         return false;
      } else if (!this.a($$0.c())) {
         return false;
      } else if (this.u == null && $$0.u != null) {
         return false;
      } else {
         return this.u == null || this.u.equals($$0.u);
      }
   }

   public static boolean c(cax $$0, cax $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return !$$0.b() && !$$1.b() ? $$0.a($$1) : false;
      }
   }

   public static boolean d(cax $$0, cax $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return !$$0.b() && !$$1.b() ? $$0.b($$1) : false;
      }
   }

   public boolean a(cax $$0) {
      return !$$0.b() && this.a($$0.c());
   }

   public boolean b(cax $$0) {
      if (!this.h()) {
         return this.a($$0);
      } else {
         return !$$0.b() && this.a($$0.c());
      }
   }

   public static boolean e(cax $$0, cax $$1) {
      return $$0.a($$1.c()) && a($$0, $$1);
   }

   public String p() {
      return this.c().j(this);
   }

   public String toString() {
      return this.r + " " + this.c();
   }

   public void a(cgx $$0, bbn $$1, int $$2, boolean $$3) {
      if (this.s > 0) {
         --this.s;
      }

      if (this.c() != null) {
         this.c().a(this, $$0, $$1, $$2, $$3);
      }

   }

   public void a(cgx $$0, buc $$1, int $$2) {
      $$1.a(akg.b.b(this.c()), $$2);
      this.c().b(this, $$0, $$1);
   }

   public int q() {
      return this.c().b(this);
   }

   public ccn r() {
      return this.c().c(this);
   }

   public void a(cgx $$0, bcc $$1, int $$2) {
      this.c().a(this, $$0, $$1, $$2);
   }

   public boolean s() {
      return this.c().l(this);
   }

   public boolean t() {
      return !this.v && this.u != null && !this.u.f();
   }

   @Nullable
   public pj u() {
      return this.u;
   }

   public pj v() {
      if (this.u == null) {
         this.c(new pj());
      }

      return this.u;
   }

   public pj a(String $$0) {
      if (this.u != null && this.u.b($$0, 10)) {
         return this.u.p($$0);
      } else {
         pj $$1 = new pj();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public pj b(String $$0) {
      return this.u != null && this.u.b($$0, 10) ? this.u.p($$0) : null;
   }

   public void c(String $$0) {
      if (this.u != null && this.u.e($$0)) {
         this.u.r($$0);
         if (this.u.f()) {
            this.u = null;
         }
      }

   }

   public pp w() {
      return this.u != null ? this.u.c("Enchantments", 10) : new pp();
   }

   public void c(@Nullable pj $$0) {
      this.u = $$0;
      if (this.c().o()) {
         this.b(this.j());
      }

      if ($$0 != null) {
         this.c().b($$0);
      }

   }

   public rq x() {
      pj $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            rq $$1 = rq.a.a($$0.l("Name"));
            if ($$1 != null) {
               return $$1;
            }

            $$0.r("Name");
         } catch (Exception var3) {
            $$0.r("Name");
         }
      }

      return this.c().m(this);
   }

   public cax a(@Nullable rq $$0) {
      pj $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", rq.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void y() {
      pj $$0 = this.b("display");
      if ($$0 != null) {
         $$0.r("Name");
         if ($$0.f()) {
            this.c("display");
         }
      }

      if (this.u != null && this.u.f()) {
         this.u = null;
      }

   }

   public boolean z() {
      pj $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<rq> a(@Nullable buc $$0, ccl $$1) {
      List<rq> $$2 = Lists.newArrayList();
      sb $$3 = rq.h().b(this.x()).a(this.B().e);
      if (this.z()) {
         $$3.a(p.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.z() && this.a(caz.qc)) {
         Integer $$4 = cbd.d(this);
         if ($$4 != null) {
            $$2.add(rq.b("#" + $$4).a(p.h));
         }
      }

      int $$5 = this.Q();
      if (a($$5, cax.a.f)) {
         this.c().a(this, $$0 == null ? null : $$0.s, $$2, $$1);
      }

      if (this.t()) {
         if (a($$5, cax.a.a)) {
            a($$2, this.w());
         }

         if (this.u.b("display", 10)) {
            pj $$6 = this.u.p("display");
            if (a($$5, cax.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(rq.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(p.h));
               } else {
                  $$2.add(rq.c("item.dyed").a(p.h, p.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               pp $$7 = $$6.c("Lore", 8);

               for(int $$8 = 0; $$8 < $$7.size(); ++$$8) {
                  String $$9 = $$7.j($$8);

                  try {
                     sb $$10 = rq.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(rs.a($$10, q));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cax.a.b)) {
         for(bbs $$12 : bbs.values()) {
            Multimap<bcy, bdb> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(rp.a);
               $$2.add(rq.c("item.modifiers." + $$12.d()).a(p.h));

               for(Entry<bcy, bdb> $$14 : $$13.entries()) {
                  bdb $$15 = (bdb)$$14.getValue();
                  double $$16 = $$15.d();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cat.l) {
                        $$16 += $$0.c(bdd.f);
                        $$16 += (double)cet.a(this, bch.a);
                        $$17 = true;
                     } else if ($$15.a() == cat.m) {
                        $$16 += $$0.c(bdd.h);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.c() == bdb.a.b || $$15.c() == bdb.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if (((bcy)$$14.getKey()).equals(bdd.c)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(rq.b(" ").b(rq.a("attribute.modifier.equals." + $$15.c().a(), c.format($$18), rq.c(((bcy)$$14.getKey()).c()))).a(p.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(rq.a("attribute.modifier.plus." + $$15.c().a(), c.format($$18), rq.c(((bcy)$$14.getKey()).c())).a(p.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(rq.a("attribute.modifier.take." + $$15.c().a(), c.format($$18), rq.c(((bcy)$$14.getKey()).c())).a(p.m));
                  }
               }
            }
         }
      }

      if (this.t()) {
         if (a($$5, cax.a.c) && this.u.q("Unbreakable")) {
            $$2.add(rq.c("item.unbreakable").a(p.j));
         }

         if (a($$5, cax.a.d) && this.u.b("CanDestroy", 9)) {
            pp $$21 = this.u.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(rp.a);
               $$2.add(rq.c("item.canBreak").a(p.h));

               for(int $$22 = 0; $$22 < $$21.size(); ++$$22) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cax.a.e) && this.u.b("CanPlaceOn", 9)) {
            pp $$23 = this.u.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(rp.a);
               $$2.add(rq.c("item.canPlace").a(p.h));

               for(int $$24 = 0; $$24 < $$23.size(); ++$$24) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.i()) {
            $$2.add(rq.a("item.durability", this.k() - this.j(), this.k()));
         }

         $$2.add(rq.b(hm.Y.b(this.c()).toString()).a(p.i));
         if (this.t()) {
            $$2.add(rq.a("item.nbt_tags", this.u.d().size()).a(p.i));
         }
      }

      return $$2;
   }

   private static boolean a(int $$0, cax.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int Q() {
      return this.t() && this.u.b("HideFlags", 99) ? this.u.h("HideFlags") : 0;
   }

   public void a(cax.a $$0) {
      pj $$1 = this.v();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<rq> $$0, pp $$1) {
      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         pj $$3 = $$1.a($$2);
         hm.W.b(cet.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cet.a($$3))));
      }

   }

   private static Collection<rq> d(String $$0) {
      try {
         return (Collection<rq>)ff.b(hm.V, $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new rq[]{$$0x.a().b().f().a(p.i)}),
               $$0x -> (List)$$0x.a().a().map($$0xx -> ((cjt)$$0xx.a()).f().a(p.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new rq[]{rq.b("missingno").a(p.i)});
      }
   }

   public boolean A() {
      return this.c().i(this);
   }

   public cbn B() {
      return this.c().n(this);
   }

   public boolean C() {
      if (!this.c().c_(this)) {
         return false;
      } else {
         return !this.D();
      }
   }

   public void a(cer $$0, int $$1) {
      this.v();
      if (!this.u.b("Enchantments", 9)) {
         this.u.a("Enchantments", (qc)(new pp()));
      }

      pp $$2 = this.u.c("Enchantments", 10);
      $$2.add(cet.a(cet.a($$0), (byte)$$1));
   }

   public boolean D() {
      if (this.u != null && this.u.b("Enchantments", 9)) {
         return !this.u.c("Enchantments", 10).isEmpty();
      } else {
         return false;
      }
   }

   public void a(String $$0, qc $$1) {
      this.v().a($$0, $$1);
   }

   public boolean E() {
      return this.w instanceof bqo;
   }

   public void a(@Nullable bbn $$0) {
      this.w = $$0;
   }

   @Nullable
   public bqo F() {
      return this.w instanceof bqo ? (bqo)this.G() : null;
   }

   @Nullable
   public bbn G() {
      return !this.v ? this.w : null;
   }

   public int H() {
      return this.t() && this.u.b("RepairCost", 3) ? this.u.h("RepairCost") : 0;
   }

   public void c(int $$0) {
      this.v().a("RepairCost", $$0);
   }

   public Multimap<bcy, bdb> a(bbs $$0) {
      Multimap<bcy, bdb> $$1;
      if (this.t() && this.u.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         pp $$2 = this.u.c("AttributeModifiers", 10);

         for(int $$3 = 0; $$3 < $$2.size(); ++$$3) {
            pj $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.d())) {
               Optional<bcy> $$5 = hm.ak.b(abb.a($$4.l("AttributeName")));
               if ($$5.isPresent()) {
                  bdb $$6 = bdb.a($$4);
                  if ($$6 != null && $$6.a().getLeastSignificantBits() != 0L && $$6.a().getMostSignificantBits() != 0L) {
                     $$1.put((bcy)$$5.get(), $$6);
                  }
               }
            }
         }
      } else {
         $$1 = this.c().a($$0);
      }

      return $$1;
   }

   public void a(bcy $$0, bdb $$1, @Nullable bbs $$2) {
      this.v();
      if (!this.u.b("AttributeModifiers", 9)) {
         this.u.a("AttributeModifiers", (qc)(new pp()));
      }

      pp $$3 = this.u.c("AttributeModifiers", 10);
      pj $$4 = $$1.e();
      $$4.a("AttributeName", hm.ak.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.d());
      }

      $$3.add($$4);
   }

   public rq I() {
      sb $$0 = rq.h().b(this.x());
      if (this.z()) {
         $$0.a(p.u);
      }

      sb $$1 = rs.a((rq)$$0);
      if (!this.v) {
         $$1.a(this.B().e).a($$0x -> $$0x.a(new rv(rv.a.b, new rv.c(this))));
      }

      return $$1;
   }

   public boolean a(hm<cjt> $$0, cvs $$1) {
      if (this.y == null) {
         this.y = new bym("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(hm<cjt> $$0, cvs $$1) {
      if (this.x == null) {
         this.x = new bym("CanDestroy");
      }

      return this.x.a(this, $$0, $$1);
   }

   public int J() {
      return this.s;
   }

   public void d(int $$0) {
      this.s = $$0;
   }

   public int K() {
      return this.v ? 0 : this.r;
   }

   public void e(int $$0) {
      this.r = $$0;
      this.P();
   }

   public void f(int $$0) {
      this.e(this.r + $$0);
   }

   public void g(int $$0) {
      this.f(-$$0);
   }

   public void b(cgx $$0, bcc $$1, int $$2) {
      this.c().a($$0, $$1, this, $$2);
   }

   public void a(bqv $$0) {
      this.c().a($$0);
   }

   public boolean L() {
      return this.c().v();
   }

   public ajv M() {
      return this.c().R_();
   }

   public ajv N() {
      return this.c().h();
   }

   @Nullable
   public ajv O() {
      return this.c().g();
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;

      private final int h = 1 << this.ordinal();

      public int a() {
         return this.h;
      }
   }
}
