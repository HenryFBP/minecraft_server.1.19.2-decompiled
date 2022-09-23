import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;

public class pt {
   public static pj a(File $$0) throws IOException {
      InputStream $$1 = new FileInputStream($$0);

      pj var2;
      try {
         var2 = a($$1);
      } catch (Throwable var5) {
         try {
            $$1.close();
         } catch (Throwable var4) {
            var5.addSuppressed(var4);
         }

         throw var5;
      }

      $$1.close();
      return var2;
   }

   private static DataInputStream b(InputStream $$0) throws IOException {
      return new DataInputStream(new alr(new GZIPInputStream($$0)));
   }

   public static pj a(InputStream $$0) throws IOException {
      DataInputStream $$1 = b($$0);

      pj var2;
      try {
         var2 = a($$1, ps.a);
      } catch (Throwable var5) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if ($$1 != null) {
         $$1.close();
      }

      return var2;
   }

   public static void a(File $$0, pz $$1) throws IOException {
      InputStream $$2 = new FileInputStream($$0);

      try {
         a($$2, $$1);
      } catch (Throwable var6) {
         try {
            $$2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      $$2.close();
   }

   public static void a(InputStream $$0, pz $$1) throws IOException {
      DataInputStream $$2 = b($$0);

      try {
         a($$2, $$1);
      } catch (Throwable var6) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if ($$2 != null) {
         $$2.close();
      }

   }

   public static void a(pj $$0, File $$1) throws IOException {
      OutputStream $$2 = new FileOutputStream($$1);

      try {
         a($$0, $$2);
      } catch (Throwable var6) {
         try {
            $$2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      $$2.close();
   }

   public static void a(pj $$0, OutputStream $$1) throws IOException {
      DataOutputStream $$2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$1)));

      try {
         a($$0, $$2);
      } catch (Throwable var6) {
         try {
            $$2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      $$2.close();
   }

   public static void b(pj $$0, File $$1) throws IOException {
      FileOutputStream $$2 = new FileOutputStream($$1);

      try {
         DataOutputStream $$3 = new DataOutputStream($$2);

         try {
            a($$0, $$3);
         } catch (Throwable var8) {
            try {
               $$3.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }

            throw var8;
         }

         $$3.close();
      } catch (Throwable var9) {
         try {
            $$2.close();
         } catch (Throwable var6) {
            var9.addSuppressed(var6);
         }

         throw var9;
      }

      $$2.close();
   }

   @Nullable
   public static pj b(File $$0) throws IOException {
      if (!$$0.exists()) {
         return null;
      } else {
         FileInputStream $$1 = new FileInputStream($$0);

         pj var3;
         try {
            DataInputStream $$2 = new DataInputStream($$1);

            try {
               var3 = a($$2, ps.a);
            } catch (Throwable var7) {
               try {
                  $$2.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }

               throw var7;
            }

            $$2.close();
         } catch (Throwable var8) {
            try {
               $$1.close();
            } catch (Throwable var5) {
               var8.addSuppressed(var5);
            }

            throw var8;
         }

         $$1.close();
         return var3;
      }
   }

   public static pj a(DataInput $$0) throws IOException {
      return a($$0, ps.a);
   }

   public static pj a(DataInput $$0, ps $$1) throws IOException {
      qc $$2 = a($$0, 0, $$1);
      if ($$2 instanceof pj) {
         return (pj)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(pj $$0, DataOutput $$1) throws IOException {
      a((qc)$$0, $$1);
   }

   public static void a(DataInput $$0, pz $$1) throws IOException {
      qe<?> $$2 = qf.a($$0.readByte());
      if ($$2 == pl.a) {
         if ($$1.b(pl.a) == pz.b.a) {
            $$1.a();
         }

      } else {
         switch($$1.b($$2)) {
            case c:
            default:
               break;
            case b:
               qa.a($$0);
               $$2.a($$0);
               break;
            case a:
               qa.a($$0);
               $$2.a($$0, $$1);
         }

      }
   }

   public static void a(qc $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.a());
      if ($$0.a() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   private static qc a(DataInput $$0, int $$1, ps $$2) throws IOException {
      byte $$3 = $$0.readByte();
      if ($$3 == 0) {
         return pl.b;
      } else {
         qa.a($$0);

         try {
            return qf.a($$3).b($$0, $$1, $$2);
         } catch (IOException var7) {
            q $$5 = q.a(var7, "Loading NBT data");
            r $$6 = $$5.a("NBT Tag");
            $$6.a("Tag type", $$3);
            throw new z($$5);
         }
      }
   }
}
