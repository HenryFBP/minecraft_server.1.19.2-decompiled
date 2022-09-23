import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.slf4j.Logger;

public class qz extends MessageToByteEncoder<tc<?>> {
   private static final Logger a = LogUtils.getLogger();
   private final td b;

   public qz(td $$0) {
      this.b = $$0;
   }

   protected void a(ChannelHandlerContext $$0, tc<?> $$1, ByteBuf $$2) throws Exception {
      qw $$3 = (qw)$$0.channel().attr(qv.e).get();
      if ($$3 == null) {
         throw new RuntimeException("ConnectionProtocol unknown: " + $$1);
      } else {
         Integer $$4 = $$3.a(this.b, $$1);
         if (a.isDebugEnabled()) {
            a.debug(qv.d, "OUT: [{}:{}] {}", new Object[]{$$0.channel().attr(qv.e).get(), $$4, $$1.getClass().getName()});
         }

         if ($$4 == null) {
            throw new IOException("Can't serialize unregistered packet");
         } else {
            qx $$5 = new qx($$2);
            $$5.d($$4);

            try {
               int $$6 = $$5.writerIndex();
               $$1.a($$5);
               int $$7 = $$5.writerIndex() - $$6;
               if ($$7 > 8388608) {
                  throw new IllegalArgumentException("Packet too big (is " + $$7 + ", should be less than 8388608): " + $$1);
               } else {
                  int $$8 = ((qw)$$0.channel().attr(qv.e).get()).a();
                  axf.e.b($$8, $$4, $$0.channel().remoteAddress(), $$7);
               }
            } catch (Throwable var10) {
               a.error("Error receiving packet {}", $$4, var10);
               if ($$1.a()) {
                  throw new rd(var10);
               } else {
                  throw var10;
               }
            }
         }
      }
   }
}
