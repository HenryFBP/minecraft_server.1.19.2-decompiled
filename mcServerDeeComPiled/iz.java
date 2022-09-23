import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public interface iz {
   ToIntFunction<String> a = ad.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.put("type", 0);
      $$0.put("parent", 1);
      $$0.defaultReturnValue(2);
   });
   Comparator<String> b = Comparator.comparingInt(a).thenComparing($$0 -> $$0);

   void a(ix var1) throws IOException;

   String a();

   static void a(ix $$0, JsonElement $$1, Path $$2) throws IOException {
      ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
      HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), $$3);
      Writer $$5 = new OutputStreamWriter($$4, StandardCharsets.UTF_8);
      JsonWriter $$6 = new JsonWriter($$5);
      $$6.setSerializeNulls(false);
      $$6.setIndent("  ");
      alz.a($$6, $$1, b);
      $$6.close();
      $$0.writeIfNeeded($$2, $$3.toByteArray(), $$4.hash());
   }
}
