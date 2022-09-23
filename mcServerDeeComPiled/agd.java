import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class agd extends azz {
   private final Set<agh> h = Sets.newHashSet();
   private final Set<agh> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public agd(rq $$0, azz.a $$1, azz.b $$2) {
      super(ami.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(tq::b);
      }

   }

   @Override
   public void a(azz.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(tq::d);
      }

   }

   @Override
   public void a(azz.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(tq::d);
      }

   }

   @Override
   public azz a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(tq::e);
      }

      return this;
   }

   @Override
   public azz b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(tq::e);
      }

      return this;
   }

   @Override
   public azz c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(tq::e);
      }

      return this;
   }

   @Override
   public void a(rq $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(tq::c);
      }

   }

   private void a(Function<azz, tq> $$0) {
      if (this.j) {
         tq $$1 = (tq)$$0.apply(this);

         for(agh $$2 : this.h) {
            $$2.b.a($$1);
         }
      }

   }

   public void a(agh $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.b.a(tq.a(this));
      }

   }

   public void b(agh $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.b.a(tq.a(this.i()));
      }

   }

   public void b() {
      if (!this.h.isEmpty()) {
         for(agh $$0 : Lists.newArrayList(this.h)) {
            this.b($$0);
         }
      }

   }

   public boolean g() {
      return this.j;
   }

   public void d(boolean $$0) {
      if ($$0 != this.j) {
         this.j = $$0;

         for(agh $$1 : this.h) {
            $$1.b.a($$0 ? tq.a(this) : tq.a(this.i()));
         }
      }

   }

   public Collection<agh> h() {
      return this.i;
   }
}
