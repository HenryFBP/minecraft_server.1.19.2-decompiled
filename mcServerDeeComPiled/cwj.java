public enum cwj implements amw {
   a,
   b;

   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this == a ? "left" : "right";
   }
}
