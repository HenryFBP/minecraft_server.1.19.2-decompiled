public class bvn {
   public static final bvn a = a("core");
   public static final bvn b = a("idle");
   public static final bvn c = a("work");
   public static final bvn d = a("play");
   public static final bvn e = a("rest");
   public static final bvn f = a("meet");
   public static final bvn g = a("panic");
   public static final bvn h = a("raid");
   public static final bvn i = a("pre_raid");
   public static final bvn j = a("hide");
   public static final bvn k = a("fight");
   public static final bvn l = a("celebrate");
   public static final bvn m = a("admire_item");
   public static final bvn n = a("avoid");
   public static final bvn o = a("ride");
   public static final bvn p = a("play_dead");
   public static final bvn q = a("long_jump");
   public static final bvn r = a("ram");
   public static final bvn s = a("tongue");
   public static final bvn t = a("swim");
   public static final bvn u = a("lay_spawn");
   public static final bvn v = a("sniff");
   public static final bvn w = a("investigate");
   public static final bvn x = a("roar");
   public static final bvn y = a("emerge");
   public static final bvn z = a("dig");
   private final String A;
   private final int B;

   private bvn(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static bvn a(String $$0) {
      return hm.a(hm.au, $$0, new bvn($$0));
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bvn $$1 = (bvn)$$0;
         return this.A.equals($$1.A);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.B;
   }

   public String toString() {
      return this.a();
   }
}
