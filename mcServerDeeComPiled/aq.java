import java.util.Collection;

public interface aq {
   aq a = $$0 -> {
      String[][] $$1 = new String[$$0.size()][];
      int $$2 = 0;

      for(String $$3 : $$0) {
         $$1[$$2++] = new String[]{$$3};
      }

      return $$1;
   };
   aq b = $$0 -> new String[][]{(String[])$$0.toArray(new String[0])};

   String[][] createRequirements(Collection<String> var1);
}
