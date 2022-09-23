import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class sb implements rq {
   private final rr c;
   private final List<rq> d;
   private sj e;
   private alu f = alu.a;
   @Nullable
   private pe g;

   sb(rr $$0, List<rq> $$1, sj $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static sb a(rr $$0) {
      return new sb($$0, Lists.newArrayList(), sj.a);
   }

   @Override
   public rr b() {
      return this.c;
   }

   @Override
   public List<rq> c() {
      return this.d;
   }

   public sb b(sj $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public sj a() {
      return this.e;
   }

   public sb f(String $$0) {
      return this.b(rq.b($$0));
   }

   public sb b(rq $$0) {
      this.d.add($$0);
      return this;
   }

   public sb a(UnaryOperator<sj> $$0) {
      this.b((sj)$$0.apply(this.a()));
      return this;
   }

   public sb c(sj $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public sb a(p... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public sb a(p $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public alu f() {
      pe $$0 = pe.a();
      if (this.g != $$0) {
         this.f = $$0.a(this);
         this.g = $$0;
      }

      return this.f;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof sb)) {
         return false;
      } else {
         sb $$1 = (sb)$$0;
         return this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.c, this.e, this.d});
   }

   public String toString() {
      StringBuilder $$0 = new StringBuilder(this.c.toString());
      boolean $$1 = !this.e.g();
      boolean $$2 = !this.d.isEmpty();
      if ($$1 || $$2) {
         $$0.append('[');
         if ($$1) {
            $$0.append("style=");
            $$0.append(this.e);
         }

         if ($$1 && $$2) {
            $$0.append(", ");
         }

         if ($$2) {
            $$0.append("siblings=");
            $$0.append(this.d);
         }

         $$0.append(']');
      }

      return $$0.toString();
   }
}
