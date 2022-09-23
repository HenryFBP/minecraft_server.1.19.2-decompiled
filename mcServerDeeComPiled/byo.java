import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class byo extends cat implements ccp {
   private static final UUID[] e = new UUID[]{
      UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
      UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
      UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
      UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
   };
   public static final hz a = new hy() {
      @Override
      protected cax a(gu $$0, cax $$1) {
         return byo.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final bbs b;
   private final int f;
   private final float g;
   protected final float c;
   protected final byp d;
   private final Multimap<bcy, bdb> h;

   public static boolean a(gu $$0, cax $$1) {
      gt $$2 = $$0.d().a($$0.e().c(clo.a));
      List<bcc> $$3 = $$0.g().a(bcc.class, new dwl($$2), bbq.f.and(new bbq.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bcc $$4 = (bcc)$$3.get(0);
         bbs $$5 = bce.i($$1);
         cax $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bce) {
            ((bce)$$4).a($$5, 2.0F);
            ((bce)$$4).fp();
         }

         return true;
      }
   }

   public byo(byp $$0, bbs $$1, cat.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.e();
      this.c = $$0.f();
      clo.a(this, a);
      Builder<bcy, bdb> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e[$$1.b()];
      $$3.put(bdd.i, new bdb($$4, "Armor modifier", (double)this.f, bdb.a.a));
      $$3.put(bdd.j, new bdb($$4, "Armor toughness", (double)this.g, bdb.a.a));
      if ($$0 == byq.g) {
         $$3.put(bdd.c, new bdb($$4, "Armor knockback resistance", (double)this.c, bdb.a.a));
      }

      this.h = $$3.build();
   }

   public bbs b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public byp d() {
      return this.d;
   }

   @Override
   public boolean a(cax $$0, cax $$1) {
      return this.d.c().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      bbs $$4 = bce.i($$3);
      cax $$5 = $$1.c($$4);
      if ($$5.b()) {
         $$1.a($$4, $$3.o());
         if (!$$0.k_()) {
            $$1.b(akg.c.b(this));
         }

         $$3.e(0);
         return bak.a($$3, $$0.k_());
      } else {
         return bak.d($$3);
      }
   }

   @Override
   public Multimap<bcy, bdb> a(bbs $$0) {
      return $$0 == this.b ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Nullable
   @Override
   public ajv g() {
      return this.d().b();
   }
}
