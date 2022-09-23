public enum td {
   a,
   b;

   public td a() {
      return this == b ? a : b;
   }
}
