import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class dwh<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final dwh<MinecraftServer> a = new dwh<MinecraftServer>().a(new dwe.a()).a(new dwf.a());
   private final Map<abb, dwg.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, dwg.a<C, ?>> d = Maps.newHashMap();

   public dwh<C> a(dwg.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends dwg<C>> dwg.a<C, T> a(Class<?> $$0) {
      return (dwg.a<C, T>)this.d.get($$0);
   }

   public <T extends dwg<C>> pj a(T $$0) {
      dwg.a<C, T> $$1 = this.a($$0.getClass());
      pj $$2 = new pj();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public dwg<C> a(pj $$0) {
      abb $$1 = abb.a($$0.l("Type"));
      dwg.a<C, ?> $$2 = (dwg.a)this.c.get($$1);
      if ($$2 == null) {
         b.error("Failed to deserialize timer callback: {}", $$0);
         return null;
      } else {
         try {
            return $$2.b($$0);
         } catch (Exception var5) {
            b.error("Failed to deserialize timer callback: {}", $$0, var5);
            return null;
         }
      }
   }
}
