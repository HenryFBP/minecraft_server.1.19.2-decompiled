import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bkh<T extends bcc> extends bko {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bcc c;
   protected bmf d;

   public bkh(bce $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public bkh(bce $$0, Class<T> $$1, boolean $$2, Predicate<bcc> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public bkh(bce $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public bkh(bce $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bcc> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bip.a.d));
      this.d = bmf.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.dQ().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected dwl a(double $$0) {
      return this.e.cy().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != buc.class && this.a != agh.class) {
         this.c = this.e.s.a(this.e.s.a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.df(), this.e.dj(), this.e.dl());
      } else {
         this.c = this.e.s.a(this.d, this.e, this.e.df(), this.e.dj(), this.e.dl());
      }

   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable bcc $$0) {
      this.c = $$0;
   }
}
