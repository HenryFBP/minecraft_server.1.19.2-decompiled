public interface bmp {
   bmp a = a("zombie_villager_cured");
   bmp b = a("golem_killed");
   bmp c = a("villager_hurt");
   bmp d = a("villager_killed");
   bmp e = a("trade");

   static bmp a(final String $$0) {
      return new bmp() {
         public String toString() {
            return $$0;
         }
      };
   }
}
