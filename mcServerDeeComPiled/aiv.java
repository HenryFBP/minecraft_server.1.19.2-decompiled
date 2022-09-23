import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aiv {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 1000;
   private static final int c = 1;
   private static boolean d;
   private final Map<String, aiv.a> e = Maps.newConcurrentMap();
   private final Map<UUID, aiv.a> f = Maps.newConcurrentMap();
   private final Map<String, CompletableFuture<Optional<GameProfile>>> g = Maps.newConcurrentMap();
   private final GameProfileRepository h;
   private final Gson i = new GsonBuilder().create();
   private final File j;
   private final AtomicLong k = new AtomicLong();
   @Nullable
   private Executor l;

   public aiv(GameProfileRepository $$0, File $$1) {
      this.h = $$0;
      this.j = $$1;
      Lists.reverse(this.b()).forEach(this::a);
   }

   private void a(aiv.a $$0) {
      GameProfile $$1 = $$0.a();
      $$0.a(this.e());
      String $$2 = $$1.getName();
      if ($$2 != null) {
         this.e.put($$2.toLowerCase(Locale.ROOT), $$0);
      }

      UUID $$3 = $$1.getId();
      if ($$3 != null) {
         this.f.put($$3, $$0);
      }

   }

   private static Optional<GameProfile> a(GameProfileRepository $$0, String $$1) {
      final AtomicReference<GameProfile> $$2 = new AtomicReference();
      ProfileLookupCallback $$3 = new ProfileLookupCallback() {
         public void onProfileLookupSucceeded(GameProfile $$0) {
            $$2.set($$0);
         }

         public void onProfileLookupFailed(GameProfile $$0, Exception $$1) {
            $$2.set(null);
         }
      };
      $$0.findProfilesByNames(new String[]{$$1}, Agent.MINECRAFT, $$3);
      GameProfile $$4 = (GameProfile)$$2.get();
      if (!d() && $$4 == null) {
         UUID $$5 = hr.a(new GameProfile(null, $$1));
         return Optional.of(new GameProfile($$5, $$1));
      } else {
         return Optional.ofNullable($$4);
      }
   }

   public static void a(boolean $$0) {
      d = $$0;
   }

   private static boolean d() {
      return d;
   }

   public void a(GameProfile $$0) {
      Calendar $$1 = Calendar.getInstance();
      $$1.setTime(new Date());
      $$1.add(2, 1);
      Date $$2 = $$1.getTime();
      aiv.a $$3 = new aiv.a($$0, $$2);
      this.a($$3);
      this.c();
   }

   private long e() {
      return this.k.incrementAndGet();
   }

   public Optional<GameProfile> a(String $$0) {
      String $$1 = $$0.toLowerCase(Locale.ROOT);
      aiv.a $$2 = (aiv.a)this.e.get($$1);
      boolean $$3 = false;
      if ($$2 != null && new Date().getTime() >= $$2.b.getTime()) {
         this.f.remove($$2.a().getId());
         this.e.remove($$2.a().getName().toLowerCase(Locale.ROOT));
         $$3 = true;
         $$2 = null;
      }

      Optional<GameProfile> $$4;
      if ($$2 != null) {
         $$2.a(this.e());
         $$4 = Optional.of($$2.a());
      } else {
         $$4 = a(this.h, $$1);
         if ($$4.isPresent()) {
            this.a((GameProfile)$$4.get());
            $$3 = false;
         }
      }

      if ($$3) {
         this.c();
      }

      return $$4;
   }

   public void a(String $$0, Consumer<Optional<GameProfile>> $$1) {
      if (this.l == null) {
         throw new IllegalStateException("No executor");
      } else {
         CompletableFuture<Optional<GameProfile>> $$2 = (CompletableFuture)this.g.get($$0);
         if ($$2 != null) {
            this.g.put($$0, $$2.whenCompleteAsync(($$1x, $$2x) -> $$1.accept($$1x), this.l));
         } else {
            this.g
               .put(
                  $$0,
                  CompletableFuture.supplyAsync(() -> this.a($$0), ad.g())
                     .whenCompleteAsync(($$1x, $$2x) -> this.g.remove($$0), this.l)
                     .whenCompleteAsync(($$1x, $$2x) -> $$1.accept($$1x), this.l)
               );
         }

      }
   }

   public Optional<GameProfile> a(UUID $$0) {
      aiv.a $$1 = (aiv.a)this.f.get($$0);
      if ($$1 == null) {
         return Optional.empty();
      } else {
         $$1.a(this.e());
         return Optional.of($$1.a());
      }
   }

   public void a(Executor $$0) {
      this.l = $$0;
   }

   public void a() {
      this.l = null;
   }

   private static DateFormat f() {
      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
   }

   public List<aiv.a> b() {
      List<aiv.a> $$0 = Lists.newArrayList();

      try {
         Reader $$1 = Files.newReader(this.j, StandardCharsets.UTF_8);

         Object var9;
         label61: {
            try {
               JsonArray $$2 = (JsonArray)this.i.fromJson($$1, JsonArray.class);
               if ($$2 == null) {
                  var9 = $$0;
                  break label61;
               }

               DateFormat $$3 = f();
               $$2.forEach($$2x -> a($$2x, $$3).ifPresent($$0::add));
            } catch (Throwable var6) {
               if ($$1 != null) {
                  try {
                     $$1.close();
                  } catch (Throwable var5) {
                     var6.addSuppressed(var5);
                  }
               }

               throw var6;
            }

            if ($$1 != null) {
               $$1.close();
            }

            return $$0;
         }

         if ($$1 != null) {
            $$1.close();
         }

         return (List<aiv.a>)var9;
      } catch (FileNotFoundException var7) {
      } catch (JsonParseException | IOException var8) {
         a.warn("Failed to load profile cache {}", this.j, var8);
      }

      return $$0;
   }

   public void c() {
      JsonArray $$0 = new JsonArray();
      DateFormat $$1 = f();
      this.a(1000).forEach($$2x -> $$0.add(a($$2x, $$1)));
      String $$2 = this.i.toJson($$0);

      try {
         Writer $$3 = Files.newWriter(this.j, StandardCharsets.UTF_8);

         try {
            $$3.write($$2);
         } catch (Throwable var8) {
            if ($$3 != null) {
               try {
                  $$3.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if ($$3 != null) {
            $$3.close();
         }
      } catch (IOException var9) {
      }

   }

   private Stream<aiv.a> a(int $$0) {
      return ImmutableList.copyOf(this.f.values()).stream().sorted(Comparator.comparing(aiv.a::c).reversed()).limit((long)$$0);
   }

   private static JsonElement a(aiv.a $$0, DateFormat $$1) {
      JsonObject $$2 = new JsonObject();
      $$2.addProperty("name", $$0.a().getName());
      UUID $$3 = $$0.a().getId();
      $$2.addProperty("uuid", $$3 == null ? "" : $$3.toString());
      $$2.addProperty("expiresOn", $$1.format($$0.b()));
      return $$2;
   }

   private static Optional<aiv.a> a(JsonElement $$0, DateFormat $$1) {
      if ($$0.isJsonObject()) {
         JsonObject $$2 = $$0.getAsJsonObject();
         JsonElement $$3 = $$2.get("name");
         JsonElement $$4 = $$2.get("uuid");
         JsonElement $$5 = $$2.get("expiresOn");
         if ($$3 != null && $$4 != null) {
            String $$6 = $$4.getAsString();
            String $$7 = $$3.getAsString();
            Date $$8 = null;
            if ($$5 != null) {
               try {
                  $$8 = $$1.parse($$5.getAsString());
               } catch (ParseException var12) {
               }
            }

            if ($$7 != null && $$6 != null && $$8 != null) {
               UUID $$9;
               try {
                  $$9 = UUID.fromString($$6);
               } catch (Throwable var11) {
                  return Optional.empty();
               }

               return Optional.of(new aiv.a(new GameProfile($$9, $$7), $$8));
            } else {
               return Optional.empty();
            }
         } else {
            return Optional.empty();
         }
      } else {
         return Optional.empty();
      }
   }

   static class a {
      private final GameProfile a;
      final Date b;
      private volatile long c;

      a(GameProfile $$0, Date $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public GameProfile a() {
         return this.a;
      }

      public Date b() {
         return this.b;
      }

      public void a(long $$0) {
         this.c = $$0;
      }

      public long c() {
         return this.c;
      }
   }
}
