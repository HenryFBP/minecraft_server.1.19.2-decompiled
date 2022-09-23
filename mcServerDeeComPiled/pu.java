import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.PeekingIterator;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class pu implements DynamicOps<qc> {
   public static final pu a = new pu();

   protected pu() {
   }

   public qc a() {
      return pl.b;
   }

   public <U> U a(DynamicOps<U> $$0, qc $$1) {
      switch($$1.a()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((pw)$$1).h());
         case 2:
            return (U)$$0.createShort(((pw)$$1).g());
         case 3:
            return (U)$$0.createInt(((pw)$$1).f());
         case 4:
            return (U)$$0.createLong(((pw)$$1).e());
         case 5:
            return (U)$$0.createFloat(((pw)$$1).j());
         case 6:
            return (U)$$0.createDouble(((pw)$$1).i());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((pg)$$1).d()));
         case 8:
            return (U)$$0.createString($$1.e_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((pn)$$1).f()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((pq)$$1).f()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(qc $$0) {
      return $$0 instanceof pw ? DataResult.success(((pw)$$0).k()) : DataResult.error("Not a number");
   }

   public qc a(Number $$0) {
      return pk.a($$0.doubleValue());
   }

   public qc a(byte $$0) {
      return ph.a($$0);
   }

   public qc a(short $$0) {
      return px.a($$0);
   }

   public qc a(int $$0) {
      return po.a($$0);
   }

   public qc a(long $$0) {
      return pr.a($$0);
   }

   public qc a(float $$0) {
      return pm.a($$0);
   }

   public qc a(double $$0) {
      return pk.a($$0);
   }

   public qc a(boolean $$0) {
      return ph.a($$0);
   }

   public DataResult<String> b(qc $$0) {
      return $$0 instanceof qa ? DataResult.success($$0.e_()) : DataResult.error("Not a string");
   }

   public qc a(String $$0) {
      return qa.a($$0);
   }

   private static pi<?> a(byte $$0, byte $$1) {
      if (a($$0, $$1, (byte)4)) {
         return new pq(new long[0]);
      } else if (a($$0, $$1, (byte)1)) {
         return new pg(new byte[0]);
      } else {
         return (pi<?>)(a($$0, $$1, (byte)3) ? new pn(new int[0]) : new pp());
      }
   }

   private static boolean a(byte $$0, byte $$1, byte $$2) {
      return $$0 == $$2 && ($$1 == $$2 || $$1 == 0);
   }

   private static <T extends qc> void a(pi<T> $$0, qc $$1, qc $$2) {
      if ($$1 instanceof pi $$3) {
         $$3.forEach($$1x -> $$0.add($$1x));
      }

      $$0.add($$2);
   }

   private static <T extends qc> void a(pi<T> $$0, qc $$1, List<qc> $$2) {
      if ($$1 instanceof pi $$3) {
         $$3.forEach($$1x -> $$0.add($$1x));
      }

      $$2.forEach($$1x -> $$0.add($$1x));
   }

   public DataResult<qc> a(qc $$0, qc $$1) {
      if (!($$0 instanceof pi) && !($$0 instanceof pl)) {
         return DataResult.error("mergeToList called with not a list: " + $$0, $$0);
      } else {
         pi<?> $$2 = a($$0 instanceof pi ? ((pi)$$0).e() : 0, $$1.a());
         a($$2, $$0, $$1);
         return DataResult.success($$2);
      }
   }

   public DataResult<qc> a(qc $$0, List<qc> $$1) {
      if (!($$0 instanceof pi) && !($$0 instanceof pl)) {
         return DataResult.error("mergeToList called with not a list: " + $$0, $$0);
      } else {
         pi<?> $$2 = a($$0 instanceof pi ? ((pi)$$0).e() : 0, $$1.stream().findFirst().map(qc::a).orElse((byte)0));
         a($$2, $$0, $$1);
         return DataResult.success($$2);
      }
   }

   public DataResult<qc> a(qc $$0, qc $$1, qc $$2) {
      if (!($$0 instanceof pj) && !($$0 instanceof pl)) {
         return DataResult.error("mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof qa)) {
         return DataResult.error("key is not a string: " + $$1, $$0);
      } else {
         pj $$3 = new pj();
         if ($$0 instanceof pj $$4) {
            $$4.d().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.e_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<qc> a(qc $$0, MapLike<qc> $$1) {
      if (!($$0 instanceof pj) && !($$0 instanceof pl)) {
         return DataResult.error("mergeToMap called with not a map: " + $$0, $$0);
      } else {
         pj $$2 = new pj();
         if ($$0 instanceof pj $$3) {
            $$3.d().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<qc> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            qc $$3 = (qc)$$2x.getFirst();
            if (!($$3 instanceof qa)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.e_(), (qc)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error("some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<qc, qc>>> c(qc $$0) {
      if (!($$0 instanceof pj)) {
         return DataResult.error("Not a map: " + $$0);
      } else {
         pj $$1 = (pj)$$0;
         return DataResult.success($$1.d().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))));
      }
   }

   public DataResult<Consumer<BiConsumer<qc, qc>>> d(qc $$0) {
      if (!($$0 instanceof pj)) {
         return DataResult.error("Not a map: " + $$0);
      } else {
         pj $$1 = (pj)$$0;
         return DataResult.success((Consumer)$$1x -> $$1.d().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))));
      }
   }

   public DataResult<MapLike<qc>> e(qc $$0) {
      if (!($$0 instanceof pj)) {
         return DataResult.error("Not a map: " + $$0);
      } else {
         final pj $$1 = (pj)$$0;
         return DataResult.success(new MapLike<qc>() {
            @Nullable
            public qc a(qc $$0) {
               return $$1.c($$0.e_());
            }

            @Nullable
            public qc a(String $$0) {
               return $$1.c($$0);
            }

            public Stream<Pair<qc, qc>> entries() {
               return $$1.d().stream().map($$1xx -> Pair.of(pu.this.a($$1xx), $$1.c($$1xx)));
            }

            public String toString() {
               return "MapLike[" + $$1 + "]";
            }
         });
      }
   }

   public qc a(Stream<Pair<qc, qc>> $$0) {
      pj $$1 = new pj();
      $$0.forEach($$1x -> $$1.a(((qc)$$1x.getFirst()).e_(), (qc)$$1x.getSecond()));
      return $$1;
   }

   public DataResult<Stream<qc>> f(qc $$0) {
      return $$0 instanceof pi ? DataResult.success(((pi)$$0).stream().map($$0x -> $$0x)) : DataResult.error("Not a list");
   }

   public DataResult<Consumer<Consumer<qc>>> g(qc $$0) {
      return $$0 instanceof pi $$1 ? DataResult.success($$1::forEach) : DataResult.error("Not a list: " + $$0);
   }

   public DataResult<ByteBuffer> h(qc $$0) {
      return $$0 instanceof pg ? DataResult.success(ByteBuffer.wrap(((pg)$$0).d())) : super.getByteBuffer($$0);
   }

   public qc a(ByteBuffer $$0) {
      return new pg(DataFixUtils.toArray($$0));
   }

   public DataResult<IntStream> i(qc $$0) {
      return $$0 instanceof pn ? DataResult.success(Arrays.stream(((pn)$$0).f())) : super.getIntStream($$0);
   }

   public qc a(IntStream $$0) {
      return new pn($$0.toArray());
   }

   public DataResult<LongStream> j(qc $$0) {
      return $$0 instanceof pq ? DataResult.success(Arrays.stream(((pq)$$0).f())) : super.getLongStream($$0);
   }

   public qc a(LongStream $$0) {
      return new pq($$0.toArray());
   }

   public qc b(Stream<qc> $$0) {
      PeekingIterator<qc> $$1 = Iterators.peekingIterator($$0.iterator());
      if (!$$1.hasNext()) {
         return new pp();
      } else {
         qc $$2 = (qc)$$1.peek();
         if ($$2 instanceof ph) {
            List<Byte> $$3 = Lists.newArrayList(Iterators.transform($$1, $$0x -> ((ph)$$0x).h()));
            return new pg($$3);
         } else if ($$2 instanceof po) {
            List<Integer> $$4 = Lists.newArrayList(Iterators.transform($$1, $$0x -> ((po)$$0x).f()));
            return new pn($$4);
         } else if ($$2 instanceof pr) {
            List<Long> $$5 = Lists.newArrayList(Iterators.transform($$1, $$0x -> ((pr)$$0x).e()));
            return new pq($$5);
         } else {
            pp $$6 = new pp();

            while($$1.hasNext()) {
               qc $$7 = (qc)$$1.next();
               if (!($$7 instanceof pl)) {
                  $$6.add($$7);
               }
            }

            return $$6;
         }
      }
   }

   public qc a(qc $$0, String $$1) {
      if ($$0 instanceof pj $$2) {
         pj $$3 = new pj();
         $$2.d().stream().filter($$1x -> !Objects.equals($$1x, $$1)).forEach($$2x -> $$3.a($$2x, $$2.c($$2x)));
         return $$3;
      } else {
         return $$0;
      }
   }

   public String toString() {
      return "NBT";
   }

   public RecordBuilder<qc> mapBuilder() {
      return new pu.a();
   }

   class a extends AbstractStringBuilder<qc, pj> {
      protected a() {
         super(pu.this);
      }

      protected pj a() {
         return new pj();
      }

      protected pj a(String $$0, qc $$1, pj $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<qc> a(pj $$0, qc $$1) {
         if ($$1 == null || $$1 == pl.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof pj)) {
            return DataResult.error("mergeToMap called with not a map: " + $$1, $$1);
         } else {
            pj $$2 = new pj(Maps.newHashMap(((pj)$$1).h()));

            for(Entry<String, qc> $$3 : $$0.h().entrySet()) {
               $$2.a((String)$$3.getKey(), (qc)$$3.getValue());
            }

            return DataResult.success($$2);
         }
      }
   }
}
