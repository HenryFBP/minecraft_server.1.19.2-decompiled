public enum cwk implements amw {
   a,
   b;

   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this == a ? "upper" : "lower";
   }
}
