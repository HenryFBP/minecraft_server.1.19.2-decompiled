public class dro {
   public static final dro a = new dro("advancements");
   public static final dro b = new dro("stats");
   public static final dro c = new dro("playerdata");
   public static final dro d = new dro("players");
   public static final dro e = new dro("level.dat");
   public static final dro f = new dro("level.dat_old");
   public static final dro g = new dro("icon.png");
   public static final dro h = new dro("session.lock");
   public static final dro i = new dro("generated");
   public static final dro j = new dro("datapacks");
   public static final dro k = new dro("resources.zip");
   public static final dro l = new dro(".");
   private final String m;

   private dro(String $$0) {
      this.m = $$0;
   }

   public String a() {
      return this.m;
   }

   public String toString() {
      return "/" + this.m;
   }
}
