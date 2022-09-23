import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class pp extends pi<qc> {
   private static final int b = 296;
   public static final qe<pp> a = new qe.b<pp>() {
      public pp a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(296L);
         if ($$1 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
         } else {
            byte $$3 = $$0.readByte();
            int $$4 = $$0.readInt();
            if ($$3 == 0 && $$4 > 0) {
               throw new RuntimeException("Missing type on ListTag");
            } else {
               $$2.a(32L * (long)$$4);
               qe<?> $$5 = qf.a($$3);
               List<qc> $$6 = Lists.newArrayListWithCapacity($$4);

               for(int $$7 = 0; $$7 < $$4; ++$$7) {
                  $$6.add($$5.b($$0, $$1 + 1, $$2));
               }

               return new pp($$6, $$3);
            }
         }
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         qe<?> $$2 = qf.a($$0.readByte());
         int $$3 = $$0.readInt();
         switch($$1.a($$2, $$3)) {
            case c:
               return pz.b.c;
            case b:
               $$2.a($$0, $$3);
               return $$1.b();
            default:
               int $$4 = 0;

               while(true) {
                  label45: {
                     if ($$4 < $$3) {
                        switch($$1.b($$2, $$4)) {
                           case d:
                              return pz.b.c;
                           case c:
                              $$2.a($$0);
                              break;
                           case b:
                              $$2.a($$0);
                              break label45;
                           default:
                              switch($$2.a($$0, $$1)) {
                                 case c:
                                    return pz.b.c;
                                 case b:
                                    break;
                                 default:
                                    break label45;
                              }
                        }
                     }

                     int $$5 = $$3 - 1 - $$4;
                     if ($$5 > 0) {
                        $$2.a($$0, $$5);
                     }

                     return $$1.b();
                  }

                  ++$$4;
               }
         }
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         qe<?> $$1 = qf.a($$0.readByte());
         int $$2 = $$0.readInt();
         $$1.a($$0, $$2);
      }

      @Override
      public String a() {
         return "LIST";
      }

      @Override
      public String b() {
         return "TAG_List";
      }
   };
   private final List<qc> c;
   private byte w;

   pp(List<qc> $$0, byte $$1) {
      this.c = $$0;
      this.w = $$1;
   }

   public pp() {
      this(Lists.newArrayList(), (byte)0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      if (this.c.isEmpty()) {
         this.w = 0;
      } else {
         this.w = ((qc)this.c.get(0)).a();
      }

      $$0.writeByte(this.w);
      $$0.writeInt(this.c.size());

      for(qc $$1 : this.c) {
         $$1.a($$0);
      }

   }

   @Override
   public byte a() {
      return 9;
   }

   @Override
   public qe<pp> b() {
      return a;
   }

   @Override
   public String toString() {
      return this.e_();
   }

   private void f() {
      if (this.c.isEmpty()) {
         this.w = 0;
      }

   }

   @Override
   public qc c(int $$0) {
      qc $$1 = (qc)this.c.remove($$0);
      this.f();
      return $$1;
   }

   public boolean isEmpty() {
      return this.c.isEmpty();
   }

   public pj a(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         if ($$1.a() == 10) {
            return (pj)$$1;
         }
      }

      return new pj();
   }

   public pp b(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         if ($$1.a() == 9) {
            return (pp)$$1;
         }
      }

      return new pp();
   }

   public short d(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         if ($$1.a() == 2) {
            return ((px)$$1).g();
         }
      }

      return 0;
   }

   public int e(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         if ($$1.a() == 3) {
            return ((po)$$1).f();
         }
      }

      return 0;
   }

   public int[] f(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         if ($$1.a() == 11) {
            return ((pn)$$1).f();
         }
      }

      return new int[0];
   }

   public long[] g(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         if ($$1.a() == 11) {
            return ((pq)$$1).f();
         }
      }

      return new long[0];
   }

   public double h(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         if ($$1.a() == 6) {
            return ((pk)$$1).i();
         }
      }

      return 0.0;
   }

   public float i(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         if ($$1.a() == 5) {
            return ((pm)$$1).j();
         }
      }

      return 0.0F;
   }

   public String j(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         qc $$1 = (qc)this.c.get($$0);
         return $$1.a() == 8 ? $$1.e_() : $$1.toString();
      } else {
         return "";
      }
   }

   public int size() {
      return this.c.size();
   }

   public qc k(int $$0) {
      return (qc)this.c.get($$0);
   }

   @Override
   public qc d(int $$0, qc $$1) {
      qc $$2 = this.k($$0);
      if (!this.a($$0, $$1)) {
         throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.a(), this.w));
      } else {
         return $$2;
      }
   }

   @Override
   public void c(int $$0, qc $$1) {
      if (!this.b($$0, $$1)) {
         throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.a(), this.w));
      }
   }

   @Override
   public boolean a(int $$0, qc $$1) {
      if (this.a($$1)) {
         this.c.set($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, qc $$1) {
      if (this.a($$1)) {
         this.c.add($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   private boolean a(qc $$0) {
      if ($$0.a() == 0) {
         return false;
      } else if (this.w == 0) {
         this.w = $$0.a();
         return true;
      } else {
         return this.w == $$0.a();
      }
   }

   public pp d() {
      Iterable<qc> $$0 = (Iterable<qc>)(qf.a(this.w).d() ? this.c : Iterables.transform(this.c, qc::c));
      List<qc> $$1 = Lists.newArrayList($$0);
      return new pp($$1, this.w);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof pp && Objects.equals(this.c, ((pp)$$0).c);
      }
   }

   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   @Override
   public byte e() {
      return this.w;
   }

   public void clear() {
      this.c.clear();
      this.w = 0;
   }

   @Override
   public pz.b a(pz $$0) {
      switch($$0.a(qf.a(this.w), this.c.size())) {
         case c:
            return pz.b.c;
         case b:
            return $$0.b();
         default:
            int $$1 = 0;

            while($$1 < this.c.size()) {
               qc $$2 = (qc)this.c.get($$1);
               switch($$0.b($$2.b(), $$1)) {
                  case d:
                     return pz.b.c;
                  case c:
                     return $$0.b();
                  default:
                     switch($$2.a($$0)) {
                        case c:
                           return pz.b.c;
                        case b:
                           return $$0.b();
                     }
                  case b:
                     ++$$1;
               }
            }

            return $$0.b();
      }
   }
}
