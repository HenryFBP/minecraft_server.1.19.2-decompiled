import javax.annotation.Nullable;

public abstract class bzj {
   public static final bzj[] a = new bzj[12];
   public static final bzj b = (new bzj(0, "buildingBlocks") {
      @Override
      public cax e() {
         return new cax(cju.bV);
      }
   }).b("building_blocks");
   public static final bzj c = new bzj(1, "decorations") {
      @Override
      public cax e() {
         return new cax(cju.hE);
      }
   };
   public static final bzj d = new bzj(2, "redstone") {
      @Override
      public cax e() {
         return new cax(caz.kK);
      }
   };
   public static final bzj e = new bzj(3, "transportation") {
      @Override
      public cax e() {
         return new cax(cju.bc);
      }
   };
   public static final bzj f = new bzj(6, "misc") {
      @Override
      public cax e() {
         return new cax(caz.oJ);
      }
   };
   public static final bzj g = (new bzj(5, "search") {
      @Override
      public cax e() {
         return new cax(caz.pb);
      }
   }).a("item_search.png");
   public static final bzj h = new bzj(7, "food") {
      @Override
      public cax e() {
         return new cax(caz.mP);
      }
   };
   public static final bzj i = (new bzj(8, "tools") {
      @Override
      public cax e() {
         return new cax(caz.nz);
      }
   }).a(new ces[]{ces.n, ces.g, ces.h, ces.j});
   public static final bzj j = (new bzj(9, "combat") {
      @Override
      public cax e() {
         return new cax(caz.nr);
      }
   }).a(new ces[]{ces.n, ces.a, ces.b, ces.e, ces.c, ces.d, ces.k, ces.f, ces.l, ces.j, ces.i, ces.m});
   public static final bzj k = new bzj(10, "brewing") {
      @Override
      public cax e() {
         return ccu.a(new cax(caz.qs), ccv.b);
      }
   };
   public static final bzj l = f;
   public static final bzj m = new bzj(4, "hotbar") {
      @Override
      public cax e() {
         return new cax(cju.bX);
      }

      @Override
      public void a(hi<cax> $$0) {
         throw new RuntimeException("Implement exception client-side.");
      }

      @Override
      public boolean m() {
         return true;
      }
   };
   public static final bzj n = (new bzj(11, "inventory") {
      @Override
      public cax e() {
         return new cax(cju.cg);
      }
   }).a("inventory.png").j().h();
   private final int o;
   private final String p;
   private final rq q;
   private String r;
   private String s = "items.png";
   private boolean t = true;
   private boolean u = true;
   private ces[] v = new ces[0];
   private cax w;

   public bzj(int $$0, String $$1) {
      this.o = $$0;
      this.p = $$1;
      this.q = rq.c("itemGroup." + $$1);
      this.w = cax.b;
      a[$$0] = this;
   }

   public int a() {
      return this.o;
   }

   public String b() {
      return this.r == null ? this.p : this.r;
   }

   public rq c() {
      return this.q;
   }

   public cax d() {
      if (this.w.b()) {
         this.w = this.e();
      }

      return this.w;
   }

   public abstract cax e();

   public String f() {
      return this.s;
   }

   public bzj a(String $$0) {
      this.s = $$0;
      return this;
   }

   public bzj b(String $$0) {
      this.r = $$0;
      return this;
   }

   public boolean g() {
      return this.u;
   }

   public bzj h() {
      this.u = false;
      return this;
   }

   public boolean i() {
      return this.t;
   }

   public bzj j() {
      this.t = false;
      return this;
   }

   public int k() {
      return this.o % 6;
   }

   public boolean l() {
      return this.o < 6;
   }

   public boolean m() {
      return this.k() == 5;
   }

   public ces[] n() {
      return this.v;
   }

   public bzj a(ces... $$0) {
      this.v = $$0;
      return this;
   }

   public boolean a(@Nullable ces $$0) {
      if ($$0 != null) {
         for(ces $$1 : this.v) {
            if ($$1 == $$0) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(hi<cax> $$0) {
      for(cat $$1 : hm.Y) {
         $$1.a(this, $$0);
      }

   }
}
