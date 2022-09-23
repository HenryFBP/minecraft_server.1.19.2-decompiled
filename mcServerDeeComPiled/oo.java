import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.net.Proxy;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class oo extends MinecraftServer {
   private static final Logger n = LogUtils.getLogger();
   private static final int o = 20;
   private static final abr p = new abr(null, amp.a, null, null);
   private final List<oe> q;
   private final gt r;
   private static final cgt s = ad.a(new cgt(), $$0 -> {
      $$0.a(cgt.e).a(false, null);
      $$0.a(cgt.u).a(false, null);
   });
   private static final chb t = new chb("Test Level", cgu.b, false, bag.c, true, s, cgl.a);
   @Nullable
   private ou u;

   public static oo a(Thread $$0, drq.c $$1, ahy $$2, Collection<oe> $$3, gt $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         abt.b $$5 = new abt.b($$2, cgl.a, false);
         abt.a $$6 = new abt.a($$5, ds.a.b, 4);

         try {
            n.debug("Starting resource loading");
            Stopwatch $$7 = Stopwatch.createStarted();
            abu $$8 = (abu)ad.b((Function)($$1x -> abu.a($$6, ($$0xx, $$1xx) -> {
                  hn.a $$2x = (hn.a)hn.d.get();
                  dbm $$3x = $$2x.<dkr>d(hm.aU).h(dks.b).a().a(0L, false, false);
                  drw $$4x = new dru(t, $$3x, Lifecycle.stable());
                  return Pair.of($$4x, $$2x);
               }, ad.g(), $$1x))).get();
            $$7.stop();
            n.debug("Finished resource loading after {} ms", $$7.elapsed(TimeUnit.MILLISECONDS));
            return new oo($$0, $$1, $$2, $$8, $$3, $$4);
         } catch (Exception var9) {
            n.warn("Failed to load vanilla datapack, bit oops", var9);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private oo(Thread $$0, drq.c $$1, ahy $$2, abu $$3, Collection<oe> $$4, gt $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, ank.a(), p, agr::new);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new aiz(this, this.aX(), this.i, 1) {
      });
      this.f_();
      agg $$0 = this.C();
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      n.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      agg $$1 = this.C();
      if (!this.bg()) {
         this.b($$1);
      }

      if ($$1.U() % 20L == 0L) {
         n.info(this.u.j());
      }

      if (this.u.i()) {
         this.a(false);
         n.info(this.u.j());
         or.a();
         n.info("========= {} GAME TESTS COMPLETE ======================", this.u.h());
         if (this.u.d()) {
            n.info("{} required tests failed :(", this.u.a());
            this.u.f().forEach($$0x -> n.info("   - {}", $$0x.c()));
         } else {
            n.info("All {} required tests passed :)", this.u.h());
         }

         if (this.u.e()) {
            n.info("{} optional tests failed", this.u.b());
            this.u.g().forEach($$0x -> n.info("   - {}", $$0x.c()));
         }

         n.info("====================================================");
      }

   }

   @Override
   public ac a(ac $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void f() {
      super.f();
      n.info("Game test server shutting down");
      System.exit(this.u.a());
   }

   @Override
   public void a(q $$0) {
      super.a($$0);
      n.error("Game test server crashed\n{}", $$0.e());
      System.exit(1);
   }

   private void b(agg $$0) {
      Collection<oj> $$1 = om.a(this.q, new gt(0, -60, 0), cpw.a, $$0, op.a, 8);
      this.u = new ou($$1);
      n.info("{} tests are now running!", this.u.h());
   }

   private boolean bg() {
      return this.u != null;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public int h() {
      return 0;
   }

   @Override
   public int i() {
      return 4;
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public int l() {
      return 0;
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean n() {
      return true;
   }

   @Override
   public boolean o() {
      return false;
   }

   @Override
   public boolean G_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
