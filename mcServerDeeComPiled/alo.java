import com.google.common.base.Charsets;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class alo implements AutoCloseable {
   public static final String a = "session.lock";
   private final FileChannel b;
   private final FileLock c;
   private static final ByteBuffer d;

   public static alo a(Path $$0) throws IOException {
      Path $$1 = $$0.resolve("session.lock");
      if (!Files.isDirectory($$0, new LinkOption[0])) {
         Files.createDirectories($$0);
      }

      FileChannel $$2 = FileChannel.open($$1, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

      try {
         $$2.write(d.duplicate());
         $$2.force(true);
         FileLock $$3 = $$2.tryLock();
         if ($$3 == null) {
            throw alo.a.a($$1);
         } else {
            return new alo($$2, $$3);
         }
      } catch (IOException var6) {
         try {
            $$2.close();
         } catch (IOException var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }
   }

   private alo(FileChannel $$0, FileLock $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void close() throws IOException {
      try {
         if (this.c.isValid()) {
            this.c.release();
         }
      } finally {
         if (this.b.isOpen()) {
            this.b.close();
         }

      }

   }

   public boolean a() {
      return this.c.isValid();
   }

   public static boolean b(Path $$0) throws IOException {
      Path $$1 = $$0.resolve("session.lock");

      try {
         FileChannel $$2 = FileChannel.open($$1, StandardOpenOption.WRITE);

         boolean var4;
         try {
            FileLock $$3 = $$2.tryLock();

            try {
               var4 = $$3 == null;
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
         } catch (Throwable var9) {
            if ($$2 != null) {
               try {
                  $$2.close();
               } catch (Throwable var6) {
                  var9.addSuppressed(var6);
               }
            }

            throw var9;
         }

         if ($$2 != null) {
            $$2.close();
         }

         return var4;
      } catch (AccessDeniedException var10) {
         return true;
      } catch (NoSuchFileException var11) {
         return false;
      }
   }

   static {
      byte[] $$0 = "☃".getBytes(Charsets.UTF_8);
      d = ByteBuffer.allocateDirect($$0.length);
      d.put($$0);
      d.flip();
   }

   public static class a extends IOException {
      private a(Path $$0, String $$1) {
         super($$0.toAbsolutePath() + ": " + $$1);
      }

      public static alo.a a(Path $$0) {
         return new alo.a($$0, "already locked (possibly by other Minecraft instance?)");
      }
   }
}
