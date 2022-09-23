import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bqf<T extends bpz> {
   private static bqf<?>[] l = new bqf[0];
   public static final bqf<bpv> a = a(bpv.class, "HoldingPattern");
   public static final bqf<bqd> b = a(bqd.class, "StrafePlayer");
   public static final bqf<bpx> c = a(bpx.class, "LandingApproach");
   public static final bqf<bpy> d = a(bpy.class, "Landing");
   public static final bqf<bqe> e = a(bqe.class, "Takeoff");
   public static final bqf<bqb> f = a(bqb.class, "SittingFlaming");
   public static final bqf<bqc> g = a(bqc.class, "SittingScanning");
   public static final bqf<bqa> h = a(bqa.class, "SittingAttacking");
   public static final bqf<bpt> i = a(bpt.class, "ChargingPlayer");
   public static final bqf<bpu> j = a(bpu.class, "Dying");
   public static final bqf<bpw> k = a(bpw.class, "Hover");
   private final Class<? extends bpz> m;
   private final int n;
   private final String o;

   private bqf(int $$0, Class<? extends bpz> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bpz a(bpp $$0) {
      try {
         Constructor<? extends bpz> $$1 = this.a();
         return (bpz)$$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bpz> a() throws NoSuchMethodException {
      return this.m.getConstructor(bpp.class);
   }

   public int b() {
      return this.n;
   }

   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bqf<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bpz> bqf<T> a(Class<T> $$0, String $$1) {
      bqf<T> $$2 = new bqf<>(l.length, $$0, $$1);
      l = (bqf[])Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
