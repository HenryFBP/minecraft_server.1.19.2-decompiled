import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class biq {
   private static final Logger a = LogUtils.getLogger();
   private static final bkc b = new bkc(Integer.MAX_VALUE, new bip() {
      @Override
      public boolean a() {
         return false;
      }
   }) {
      @Override
      public boolean h() {
         return false;
      }
   };
   private final Map<bip.a, bkc> c = new EnumMap(bip.a.class);
   private final Set<bkc> d = Sets.newLinkedHashSet();
   private final Supplier<awz> e;
   private final EnumSet<bip.a> f = EnumSet.noneOf(bip.a.class);
   private int g;
   private int h = 3;

   public biq(Supplier<awz> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bip $$1) {
      this.d.add(new bkc($$0, $$1));
   }

   @VisibleForTesting
   public void a() {
      this.d.clear();
   }

   public void a(bip $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(bkc::h).forEach(bkc::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(bkc $$0, EnumSet<bip.a> $$1) {
      for(bip.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(bkc $$0, Map<bip.a, bkc> $$1) {
      for(bip.a $$2 : $$0.j()) {
         if (!((bkc)$$1.getOrDefault($$2, b)).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void b() {
      awz $$0 = (awz)this.e.get();
      $$0.a("goalCleanup");

      for(bkc $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bip.a, bkc>> $$2 = this.c.entrySet().iterator();

      while($$2.hasNext()) {
         Entry<bip.a, bkc> $$3 = (Entry)$$2.next();
         if (!((bkc)$$3.getValue()).h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for(bkc $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for(bip.a $$5 : $$4.j()) {
               bkc $$6 = (bkc)this.c.getOrDefault($$5, b);
               $$6.d();
               this.c.put($$5, $$4);
            }

            $$4.c();
         }
      }

      $$0.c();
      this.a(true);
   }

   public void a(boolean $$0) {
      awz $$1 = (awz)this.e.get();
      $$1.a("goalTick");

      for(bkc $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.E_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<bkc> c() {
      return this.d;
   }

   public Stream<bkc> d() {
      return this.d.stream().filter(bkc::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bip.a $$0) {
      this.f.add($$0);
   }

   public void b(bip.a $$0) {
      this.f.remove($$0);
   }

   public void a(bip.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }

   }
}
