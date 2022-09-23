import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class pj implements qc {
   public static final Codec<pj> a = Codec.PASSTHROUGH.comapFlatMap($$0 -> {
      qc $$1 = (qc)$$0.convert(pu.a).getValue();
      return $$1 instanceof pj ? DataResult.success((pj)$$1) : DataResult.error("Not a compound tag: " + $$1);
   }, $$0 -> new Dynamic(pu.a, $$0));
   private static final int c = 384;
   private static final int w = 256;
   public static final qe<pj> b = new qe.b<pj>() {
      public pj a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(384L);
         if ($$1 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
         } else {
            Map<String, qc> $$3 = Maps.newHashMap();

            byte $$4;
            while(($$4 = pj.a($$0, $$2)) != 0) {
               String $$5 = pj.b($$0, $$2);
               $$2.a((long)(224 + 16 * $$5.length()));
               qc $$6 = pj.a(qf.a($$4), $$5, $$0, $$1 + 1, $$2);
               if ($$3.put($$5, $$6) != null) {
                  $$2.a(288L);
               }
            }

            return new pj($$3);
         }
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         byte $$2;
         label34:
         while(($$2 = $$0.readByte()) != 0) {
            qe<?> $$3 = qf.a($$2);
            switch($$1.a($$3)) {
               case d:
                  return pz.b.c;
               case c:
                  qa.a($$0);
                  $$3.a($$0);
                  break label34;
               case b:
                  qa.a($$0);
                  $$3.a($$0);
                  break;
               default:
                  String $$4 = $$0.readUTF();
                  switch($$1.a($$3, $$4)) {
                     case d:
                        return pz.b.c;
                     case c:
                        $$3.a($$0);
                        break label34;
                     case b:
                        $$3.a($$0);
                        break;
                     default:
                        switch($$3.a($$0, $$1)) {
                           case c:
                              return pz.b.c;
                           case b:
                        }
                  }
            }
         }

         if ($$2 != 0) {
            while(($$2 = $$0.readByte()) != 0) {
               qa.a($$0);
               qf.a($$2).a($$0);
            }
         }

         return $$1.b();
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         byte $$1;
         while(($$1 = $$0.readByte()) != 0) {
            qa.a($$0);
            qf.a($$1).a($$0);
         }

      }

      @Override
      public String a() {
         return "COMPOUND";
      }

      @Override
      public String b() {
         return "TAG_Compound";
      }
   };
   private final Map<String, qc> x;

   protected pj(Map<String, qc> $$0) {
      this.x = $$0;
   }

   public pj() {
      this(Maps.newHashMap());
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      for(String $$1 : this.x.keySet()) {
         qc $$2 = (qc)this.x.get($$1);
         a($$1, $$2, $$0);
      }

      $$0.writeByte(0);
   }

   public Set<String> d() {
      return this.x.keySet();
   }

   @Override
   public byte a() {
      return 10;
   }

   @Override
   public qe<pj> b() {
      return b;
   }

   public int e() {
      return this.x.size();
   }

   @Nullable
   public qc a(String $$0, qc $$1) {
      return (qc)this.x.put($$0, $$1);
   }

   public void a(String $$0, byte $$1) {
      this.x.put($$0, ph.a($$1));
   }

   public void a(String $$0, short $$1) {
      this.x.put($$0, px.a($$1));
   }

   public void a(String $$0, int $$1) {
      this.x.put($$0, po.a($$1));
   }

   public void a(String $$0, long $$1) {
      this.x.put($$0, pr.a($$1));
   }

   public void a(String $$0, UUID $$1) {
      this.x.put($$0, pv.a($$1));
   }

   public UUID a(String $$0) {
      return pv.a(this.c($$0));
   }

   public boolean b(String $$0) {
      qc $$1 = this.c($$0);
      return $$1 != null && $$1.b() == pn.a && ((pn)$$1).f().length == 4;
   }

   public void a(String $$0, float $$1) {
      this.x.put($$0, pm.a($$1));
   }

   public void a(String $$0, double $$1) {
      this.x.put($$0, pk.a($$1));
   }

   public void a(String $$0, String $$1) {
      this.x.put($$0, qa.a($$1));
   }

   public void a(String $$0, byte[] $$1) {
      this.x.put($$0, new pg($$1));
   }

   public void a(String $$0, List<Byte> $$1) {
      this.x.put($$0, new pg($$1));
   }

   public void a(String $$0, int[] $$1) {
      this.x.put($$0, new pn($$1));
   }

   public void b(String $$0, List<Integer> $$1) {
      this.x.put($$0, new pn($$1));
   }

   public void a(String $$0, long[] $$1) {
      this.x.put($$0, new pq($$1));
   }

   public void c(String $$0, List<Long> $$1) {
      this.x.put($$0, new pq($$1));
   }

   public void a(String $$0, boolean $$1) {
      this.x.put($$0, ph.a($$1));
   }

   @Nullable
   public qc c(String $$0) {
      return (qc)this.x.get($$0);
   }

   public byte d(String $$0) {
      qc $$1 = (qc)this.x.get($$0);
      return $$1 == null ? 0 : $$1.a();
   }

   public boolean e(String $$0) {
      return this.x.containsKey($$0);
   }

   public boolean b(String $$0, int $$1) {
      int $$2 = this.d($$0);
      if ($$2 == $$1) {
         return true;
      } else if ($$1 != 99) {
         return false;
      } else {
         return $$2 == 1 || $$2 == 2 || $$2 == 3 || $$2 == 4 || $$2 == 5 || $$2 == 6;
      }
   }

   public byte f(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((pw)this.x.get($$0)).h();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public short g(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((pw)this.x.get($$0)).g();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public int h(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((pw)this.x.get($$0)).f();
         }
      } catch (ClassCastException var3) {
      }

      return 0;
   }

   public long i(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((pw)this.x.get($$0)).e();
         }
      } catch (ClassCastException var3) {
      }

      return 0L;
   }

   public float j(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((pw)this.x.get($$0)).j();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0F;
   }

   public double k(String $$0) {
      try {
         if (this.b($$0, 99)) {
            return ((pw)this.x.get($$0)).i();
         }
      } catch (ClassCastException var3) {
      }

      return 0.0;
   }

   public String l(String $$0) {
      try {
         if (this.b($$0, 8)) {
            return ((qc)this.x.get($$0)).e_();
         }
      } catch (ClassCastException var3) {
      }

      return "";
   }

   public byte[] m(String $$0) {
      try {
         if (this.b($$0, 7)) {
            return ((pg)this.x.get($$0)).d();
         }
      } catch (ClassCastException var3) {
         throw new z(this.a($$0, pg.a, var3));
      }

      return new byte[0];
   }

   public int[] n(String $$0) {
      try {
         if (this.b($$0, 11)) {
            return ((pn)this.x.get($$0)).f();
         }
      } catch (ClassCastException var3) {
         throw new z(this.a($$0, pn.a, var3));
      }

      return new int[0];
   }

   public long[] o(String $$0) {
      try {
         if (this.b($$0, 12)) {
            return ((pq)this.x.get($$0)).f();
         }
      } catch (ClassCastException var3) {
         throw new z(this.a($$0, pq.a, var3));
      }

      return new long[0];
   }

   public pj p(String $$0) {
      try {
         if (this.b($$0, 10)) {
            return (pj)this.x.get($$0);
         }
      } catch (ClassCastException var3) {
         throw new z(this.a($$0, b, var3));
      }

      return new pj();
   }

   public pp c(String $$0, int $$1) {
      try {
         if (this.d($$0) == 9) {
            pp $$2 = (pp)this.x.get($$0);
            if (!$$2.isEmpty() && $$2.e() != $$1) {
               return new pp();
            }

            return $$2;
         }
      } catch (ClassCastException var4) {
         throw new z(this.a($$0, pp.a, var4));
      }

      return new pp();
   }

   public boolean q(String $$0) {
      return this.f($$0) != 0;
   }

   public void r(String $$0) {
      this.x.remove($$0);
   }

   @Override
   public String toString() {
      return this.e_();
   }

   public boolean f() {
      return this.x.isEmpty();
   }

   private q a(String $$0, qe<?> $$1, ClassCastException $$2) {
      q $$3 = q.a($$2, "Reading NBT data");
      r $$4 = $$3.a("Corrupt NBT tag", 1);
      $$4.a("Tag type found", (s<String>)(() -> ((qc)this.x.get($$0)).b().a()));
      $$4.a("Tag type expected", $$1::a);
      $$4.a("Tag name", $$0);
      return $$3;
   }

   public pj g() {
      Map<String, qc> $$0 = Maps.newHashMap(Maps.transformValues(this.x, qc::c));
      return new pj($$0);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof pj && Objects.equals(this.x, ((pj)$$0).x);
      }
   }

   public int hashCode() {
      return this.x.hashCode();
   }

   private static void a(String $$0, qc $$1, DataOutput $$2) throws IOException {
      $$2.writeByte($$1.a());
      if ($$1.a() != 0) {
         $$2.writeUTF($$0);
         $$1.a($$2);
      }
   }

   static byte a(DataInput $$0, ps $$1) throws IOException {
      return $$0.readByte();
   }

   static String b(DataInput $$0, ps $$1) throws IOException {
      return $$0.readUTF();
   }

   static qc a(qe<?> $$0, String $$1, DataInput $$2, int $$3, ps $$4) {
      try {
         return $$0.b($$2, $$3, $$4);
      } catch (IOException var8) {
         q $$6 = q.a(var8, "Loading NBT data");
         r $$7 = $$6.a("NBT Tag");
         $$7.a("Tag name", $$1);
         $$7.a("Tag type", $$0.a());
         throw new z($$6);
      }
   }

   public pj a(pj $$0) {
      for(String $$1 : $$0.x.keySet()) {
         qc $$2 = (qc)$$0.x.get($$1);
         if ($$2.a() == 10) {
            if (this.b($$1, 10)) {
               pj $$3 = this.p($$1);
               $$3.a((pj)$$2);
            } else {
               this.a($$1, $$2.c());
            }
         } else {
            this.a($$1, $$2.c());
         }
      }

      return this;
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   protected Map<String, qc> h() {
      return Collections.unmodifiableMap(this.x);
   }

   @Override
   public pz.b a(pz $$0) {
      for(Entry<String, qc> $$1 : this.x.entrySet()) {
         qc $$2 = (qc)$$1.getValue();
         qe<?> $$3 = $$2.b();
         pz.a $$4 = $$0.a($$3);
         switch($$4) {
            case d:
               return pz.b.c;
            case c:
               return $$0.b();
            case b:
               break;
            default:
               $$4 = $$0.a($$3, (String)$$1.getKey());
               switch($$4) {
                  case d:
                     return pz.b.c;
                  case c:
                     return $$0.b();
                  case b:
                     break;
                  default:
                     pz.b $$5 = $$2.a($$0);
                     switch($$5) {
                        case c:
                           return pz.b.c;
                        case b:
                           return $$0.b();
                     }
               }
         }
      }

      return $$0.b();
   }
}
