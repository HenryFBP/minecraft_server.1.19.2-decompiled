public record bni(abb l) {
   public static final bni a = a("tabby", "textures/entity/cat/tabby.png");
   public static final bni b = a("black", "textures/entity/cat/black.png");
   public static final bni c = a("red", "textures/entity/cat/red.png");
   public static final bni d = a("siamese", "textures/entity/cat/siamese.png");
   public static final bni e = a("british_shorthair", "textures/entity/cat/british_shorthair.png");
   public static final bni f = a("calico", "textures/entity/cat/calico.png");
   public static final bni g = a("persian", "textures/entity/cat/persian.png");
   public static final bni h = a("ragdoll", "textures/entity/cat/ragdoll.png");
   public static final bni i = a("white", "textures/entity/cat/white.png");
   public static final bni j = a("jellie", "textures/entity/cat/jellie.png");
   public static final bni k = a("all_black", "textures/entity/cat/all_black.png");

   private static bni a(String $$0, String $$1) {
      return hm.a(hm.bK, $$0, new bni(new abb($$1)));
   }

   public abb a() {
      return this.l;
   }
}
