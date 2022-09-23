import com.google.common.base.Preconditions;

public class dqa {
   private static final dqa[] am = new dqa[64];
   public static final dqa a = new dqa(0, 0);
   public static final dqa b = new dqa(1, 8368696);
   public static final dqa c = new dqa(2, 16247203);
   public static final dqa d = new dqa(3, 13092807);
   public static final dqa e = new dqa(4, 16711680);
   public static final dqa f = new dqa(5, 10526975);
   public static final dqa g = new dqa(6, 10987431);
   public static final dqa h = new dqa(7, 31744);
   public static final dqa i = new dqa(8, 16777215);
   public static final dqa j = new dqa(9, 10791096);
   public static final dqa k = new dqa(10, 9923917);
   public static final dqa l = new dqa(11, 7368816);
   public static final dqa m = new dqa(12, 4210943);
   public static final dqa n = new dqa(13, 9402184);
   public static final dqa o = new dqa(14, 16776437);
   public static final dqa p = new dqa(15, 14188339);
   public static final dqa q = new dqa(16, 11685080);
   public static final dqa r = new dqa(17, 6724056);
   public static final dqa s = new dqa(18, 15066419);
   public static final dqa t = new dqa(19, 8375321);
   public static final dqa u = new dqa(20, 15892389);
   public static final dqa v = new dqa(21, 5000268);
   public static final dqa w = new dqa(22, 10066329);
   public static final dqa x = new dqa(23, 5013401);
   public static final dqa y = new dqa(24, 8339378);
   public static final dqa z = new dqa(25, 3361970);
   public static final dqa A = new dqa(26, 6704179);
   public static final dqa B = new dqa(27, 6717235);
   public static final dqa C = new dqa(28, 10040115);
   public static final dqa D = new dqa(29, 1644825);
   public static final dqa E = new dqa(30, 16445005);
   public static final dqa F = new dqa(31, 6085589);
   public static final dqa G = new dqa(32, 4882687);
   public static final dqa H = new dqa(33, 55610);
   public static final dqa I = new dqa(34, 8476209);
   public static final dqa J = new dqa(35, 7340544);
   public static final dqa K = new dqa(36, 13742497);
   public static final dqa L = new dqa(37, 10441252);
   public static final dqa M = new dqa(38, 9787244);
   public static final dqa N = new dqa(39, 7367818);
   public static final dqa O = new dqa(40, 12223780);
   public static final dqa P = new dqa(41, 6780213);
   public static final dqa Q = new dqa(42, 10505550);
   public static final dqa R = new dqa(43, 3746083);
   public static final dqa S = new dqa(44, 8874850);
   public static final dqa T = new dqa(45, 5725276);
   public static final dqa U = new dqa(46, 8014168);
   public static final dqa V = new dqa(47, 4996700);
   public static final dqa W = new dqa(48, 4993571);
   public static final dqa X = new dqa(49, 5001770);
   public static final dqa Y = new dqa(50, 9321518);
   public static final dqa Z = new dqa(51, 2430480);
   public static final dqa aa = new dqa(52, 12398641);
   public static final dqa ab = new dqa(53, 9715553);
   public static final dqa ac = new dqa(54, 6035741);
   public static final dqa ad = new dqa(55, 1474182);
   public static final dqa ae = new dqa(56, 3837580);
   public static final dqa af = new dqa(57, 5647422);
   public static final dqa ag = new dqa(58, 1356933);
   public static final dqa ah = new dqa(59, 6579300);
   public static final dqa ai = new dqa(60, 14200723);
   public static final dqa aj = new dqa(61, 8365974);
   public final int ak;
   public final int al;

   private dqa(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(dqa.a $$0) {
      if (this == a) {
         return 0;
      } else {
         int $$1 = $$0.f;
         int $$2 = (this.ak >> 16 & 0xFF) * $$1 / 255;
         int $$3 = (this.ak >> 8 & 0xFF) * $$1 / 255;
         int $$4 = (this.ak & 0xFF) * $$1 / 255;
         return 0xFF000000 | $$4 << 16 | $$3 << 8 | $$2;
      }
   }

   public static dqa a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static dqa c(int $$0) {
      dqa $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(dqa.a.b($$1 & 3));
   }

   public byte b(dqa.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final dqa.a[] g = new dqa.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static dqa.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static dqa.a b(int $$0) {
         return g[$$0];
      }
   }
}
