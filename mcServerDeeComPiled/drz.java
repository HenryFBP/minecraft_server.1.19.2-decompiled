import com.google.gson.GsonBuilder;

public class drz {
   public static GsonBuilder a() {
      return new GsonBuilder()
         .registerTypeAdapter(dsb.class, new dsb.c())
         .registerTypeHierarchyAdapter(dvs.class, dvt.a())
         .registerTypeHierarchyAdapter(dux.class, duz.a())
         .registerTypeHierarchyAdapter(dwa.class, dwb.a())
         .registerTypeHierarchyAdapter(dsd.c.class, new dsd.c.a());
   }

   public static GsonBuilder b() {
      return a()
         .registerTypeHierarchyAdapter(dsv.class, dst.a())
         .registerTypeHierarchyAdapter(dto.class, dtq.a())
         .registerTypeHierarchyAdapter(dvl.class, dvm.a());
   }

   public static GsonBuilder c() {
      return b().registerTypeAdapter(dsf.class, new dsf.b()).registerTypeAdapter(dsg.class, new dsg.b());
   }
}
