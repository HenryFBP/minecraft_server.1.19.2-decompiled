import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ali {
   private static final String g = "AES";
   private static final int h = 128;
   private static final String i = "RSA";
   private static final int j = 1024;
   private static final String k = "ISO_8859_1";
   private static final String l = "SHA-1";
   public static final String a = "SHA256withRSA";
   private static final String m = "-----BEGIN RSA PRIVATE KEY-----";
   private static final String n = "-----END RSA PRIVATE KEY-----";
   public static final String b = "-----BEGIN RSA PUBLIC KEY-----";
   private static final String o = "-----END RSA PUBLIC KEY-----";
   public static final String c = "\n";
   public static final Encoder d = Base64.getMimeEncoder(76, "\n".getBytes(StandardCharsets.UTF_8));
   public static final Codec<PublicKey> e = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(b($$0));
      } catch (alj var2) {
         return DataResult.error(var2.getMessage());
      }
   }, ali::a);
   public static final Codec<PrivateKey> f = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(a($$0));
      } catch (alj var2) {
         return DataResult.error(var2.getMessage());
      }
   }, ali::a);

   public static SecretKey a() throws alj {
      try {
         KeyGenerator $$0 = KeyGenerator.getInstance("AES");
         $$0.init(128);
         return $$0.generateKey();
      } catch (Exception var1) {
         throw new alj(var1);
      }
   }

   public static KeyPair b() throws alj {
      try {
         KeyPairGenerator $$0 = KeyPairGenerator.getInstance("RSA");
         $$0.initialize(1024);
         return $$0.generateKeyPair();
      } catch (Exception var1) {
         throw new alj(var1);
      }
   }

   public static byte[] a(String $$0, PublicKey $$1, SecretKey $$2) throws alj {
      try {
         return a($$0.getBytes("ISO_8859_1"), $$2.getEncoded(), $$1.getEncoded());
      } catch (Exception var4) {
         throw new alj(var4);
      }
   }

   private static byte[] a(byte[]... $$0) throws Exception {
      MessageDigest $$1 = MessageDigest.getInstance("SHA-1");

      for(byte[] $$2 : $$0) {
         $$1.update($$2);
      }

      return $$1.digest();
   }

   private static <T extends Key> T a(String $$0, String $$1, String $$2, ali.a<T> $$3) throws alj {
      int $$4 = $$0.indexOf($$1);
      if ($$4 != -1) {
         $$4 += $$1.length();
         int $$5 = $$0.indexOf($$2, $$4);
         $$0 = $$0.substring($$4, $$5 + 1);
      }

      try {
         return $$3.apply(Base64.getMimeDecoder().decode($$0));
      } catch (IllegalArgumentException var6) {
         throw new alj(var6);
      }
   }

   public static PrivateKey a(String $$0) throws alj {
      return a($$0, "-----BEGIN RSA PRIVATE KEY-----", "-----END RSA PRIVATE KEY-----", ali::b);
   }

   public static PublicKey b(String $$0) throws alj {
      return a($$0, "-----BEGIN RSA PUBLIC KEY-----", "-----END RSA PUBLIC KEY-----", ali::a);
   }

   public static String a(PublicKey $$0) {
      if (!"RSA".equals($$0.getAlgorithm())) {
         throw new IllegalArgumentException("Public key must be RSA");
      } else {
         return "-----BEGIN RSA PUBLIC KEY-----\n" + d.encodeToString($$0.getEncoded()) + "\n-----END RSA PUBLIC KEY-----\n";
      }
   }

   public static String a(PrivateKey $$0) {
      if (!"RSA".equals($$0.getAlgorithm())) {
         throw new IllegalArgumentException("Private key must be RSA");
      } else {
         return "-----BEGIN RSA PRIVATE KEY-----\n" + d.encodeToString($$0.getEncoded()) + "\n-----END RSA PRIVATE KEY-----\n";
      }
   }

   private static PrivateKey b(byte[] $$0) throws alj {
      try {
         EncodedKeySpec $$1 = new PKCS8EncodedKeySpec($$0);
         KeyFactory $$2 = KeyFactory.getInstance("RSA");
         return $$2.generatePrivate($$1);
      } catch (Exception var3) {
         throw new alj(var3);
      }
   }

   public static PublicKey a(byte[] $$0) throws alj {
      try {
         EncodedKeySpec $$1 = new X509EncodedKeySpec($$0);
         KeyFactory $$2 = KeyFactory.getInstance("RSA");
         return $$2.generatePublic($$1);
      } catch (Exception var3) {
         throw new alj(var3);
      }
   }

   public static SecretKey a(PrivateKey $$0, byte[] $$1) throws alj {
      byte[] $$2 = b($$0, $$1);

      try {
         return new SecretKeySpec($$2, "AES");
      } catch (Exception var4) {
         throw new alj(var4);
      }
   }

   public static byte[] a(Key $$0, byte[] $$1) throws alj {
      return a(1, $$0, $$1);
   }

   public static byte[] b(Key $$0, byte[] $$1) throws alj {
      return a(2, $$0, $$1);
   }

   private static byte[] a(int $$0, Key $$1, byte[] $$2) throws alj {
      try {
         return a($$0, $$1.getAlgorithm(), $$1).doFinal($$2);
      } catch (Exception var4) {
         throw new alj(var4);
      }
   }

   private static Cipher a(int $$0, String $$1, Key $$2) throws Exception {
      Cipher $$3 = Cipher.getInstance($$1);
      $$3.init($$0, $$2);
      return $$3;
   }

   public static Cipher a(int $$0, Key $$1) throws alj {
      try {
         Cipher $$2 = Cipher.getInstance("AES/CFB8/NoPadding");
         $$2.init($$0, $$1, new IvParameterSpec($$1.getEncoded()));
         return $$2;
      } catch (Exception var3) {
         throw new alj(var3);
      }
   }

   interface a<T extends Key> {
      T apply(byte[] var1) throws alj;
   }

   public static record b(long b, byte[] c) {
      public static final ali.b a = new ali.b(0L, ByteArrays.EMPTY_ARRAY);

      public b(qx $$0) {
         this($$0.readLong(), $$0.b());
      }

      public boolean a() {
         return this.c.length > 0;
      }

      public static void a(qx $$0, ali.b $$1) {
         $$0.writeLong($$1.b);
         $$0.a($$1.c);
      }

      public byte[] b() {
         return Longs.toByteArray(this.b);
      }

      public long c() {
         return this.b;
      }

      public byte[] d() {
         return this.c;
      }
   }

   public static class c {
      private static final SecureRandom a = new SecureRandom();

      public static long a() {
         return a.nextLong();
      }
   }
}
