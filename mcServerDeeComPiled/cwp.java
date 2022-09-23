public enum cwp implements amw {
   a("harp", ajw.nO),
   b("basedrum", ajw.nI),
   c("snare", ajw.nR),
   d("hat", ajw.nP),
   e("bass", ajw.nJ),
   f("flute", ajw.nM),
   g("bell", ajw.nK),
   h("guitar", ajw.nN),
   i("chime", ajw.nL),
   j("xylophone", ajw.nS),
   k("iron_xylophone", ajw.nT),
   l("cow_bell", ajw.nU),
   m("didgeridoo", ajw.nV),
   n("bit", ajw.nW),
   o("banjo", ajw.nX),
   p("pling", ajw.nQ);

   private final String q;
   private final ajv r;

   private cwp(String $$0, ajv $$1) {
      this.q = $$0;
      this.r = $$1;
   }

   @Override
   public String c() {
      return this.q;
   }

   public ajv a() {
      return this.r;
   }

   public static cwp a(cvo $$0) {
      if ($$0.a(cju.da)) {
         return f;
      } else if ($$0.a(cju.bT)) {
         return g;
      } else if ($$0.a(akl.a)) {
         return h;
      } else if ($$0.a(cju.hA)) {
         return i;
      } else if ($$0.a(cju.jy)) {
         return j;
      } else if ($$0.a(cju.bU)) {
         return k;
      } else if ($$0.a(cju.dg)) {
         return l;
      } else if ($$0.a(cju.de)) {
         return m;
      } else if ($$0.a(cju.eQ)) {
         return n;
      } else if ($$0.a(cju.hh)) {
         return o;
      } else if ($$0.a(cju.dm)) {
         return p;
      } else {
         dpz $$1 = $$0.d();
         if ($$1 == dpz.J) {
            return b;
         } else if ($$1 == dpz.w) {
            return c;
         } else if ($$1 == dpz.G) {
            return d;
         } else {
            return $$1 != dpz.z && $$1 != dpz.A ? a : e;
         }
      }
   }
}
