import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import javax.annotation.Nullable;

public class cyp {
   private static final Int2ObjectMap<cyp> d = new Int2ObjectOpenHashMap();
   public static final cyp a = a(new cyp(1, $$0 -> new alr(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final cyp b = a(new cyp(2, $$0 -> new alr(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0))));
   public static final cyp c = a(new cyp(3, $$0 -> $$0, $$0 -> $$0));
   private final int e;
   private final cyp.a<InputStream> f;
   private final cyp.a<OutputStream> g;

   private cyp(int $$0, cyp.a<InputStream> $$1, cyp.a<OutputStream> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   private static cyp a(cyp $$0) {
      d.put($$0.e, $$0);
      return $$0;
   }

   @Nullable
   public static cyp a(int $$0) {
      return (cyp)d.get($$0);
   }

   public static boolean b(int $$0) {
      return d.containsKey($$0);
   }

   public int a() {
      return this.e;
   }

   public OutputStream a(OutputStream $$0) throws IOException {
      return (OutputStream)this.g.wrap($$0);
   }

   public InputStream a(InputStream $$0) throws IOException {
      return (InputStream)this.f.wrap($$0);
   }

   @FunctionalInterface
   interface a<O> {
      O wrap(O var1) throws IOException;
   }
}
