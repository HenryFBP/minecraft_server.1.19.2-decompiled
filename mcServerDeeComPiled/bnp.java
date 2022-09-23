public record bnp(abb d) {
   public static final bnp a = a("temperate", "textures/entity/frog/temperate_frog.png");
   public static final bnp b = a("warm", "textures/entity/frog/warm_frog.png");
   public static final bnp c = a("cold", "textures/entity/frog/cold_frog.png");

   private static bnp a(String $$0, String $$1) {
      return hm.a(hm.bM, $$0, new bnp(new abb($$1)));
   }

   public abb a() {
      return this.d;
   }
}
