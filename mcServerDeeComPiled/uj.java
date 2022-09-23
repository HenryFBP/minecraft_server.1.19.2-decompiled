import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class uj implements tc<tf> {
   public static final uj.a a = new uj.a(0);
   public static final uj.a b = new uj.a(1);
   public static final uj.a c = new uj.a(2);
   public static final uj.a d = new uj.a(3);
   public static final uj.a e = new uj.a(4);
   public static final uj.a f = new uj.a(5);
   public static final uj.a g = new uj.a(6);
   public static final uj.a h = new uj.a(7);
   public static final uj.a i = new uj.a(8);
   public static final uj.a j = new uj.a(9);
   public static final uj.a k = new uj.a(10);
   public static final uj.a l = new uj.a(11);
   public static final int m = 0;
   public static final int n = 101;
   public static final int o = 102;
   public static final int p = 103;
   public static final int q = 104;
   private final uj.a r;
   private final float s;

   public uj(uj.a $$0, float $$1) {
      this.r = $$0;
      this.s = $$1;
   }

   public uj(qx $$0) {
      this.r = (uj.a)uj.a.a.get($$0.readUnsignedByte());
      this.s = $$0.readFloat();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.r.b);
      $$0.writeFloat(this.s);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public uj.a b() {
      return this.r;
   }

   public float c() {
      return this.s;
   }

   public static class a {
      static final Int2ObjectMap<uj.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
