public class cap extends cat {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public cap(int $$0, String $$1, cat.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public abb i() {
      return new abb(this.c);
   }

   public int j() {
      return this.b;
   }
}
