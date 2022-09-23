import java.util.EnumSet;

public abstract class bip {
   private final EnumSet<bip.a> a = EnumSet.noneOf(bip.a.class);

   public abstract boolean a();

   public boolean b() {
      return this.a();
   }

   public boolean D_() {
      return true;
   }

   public void c() {
   }

   public void d() {
   }

   public boolean E_() {
      return false;
   }

   public void e() {
   }

   public void a(EnumSet<bip.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<bip.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.E_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return ami.e($$0, 2);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
