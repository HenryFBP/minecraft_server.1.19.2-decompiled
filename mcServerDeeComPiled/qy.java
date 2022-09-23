import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;

public class qy extends ByteToMessageDecoder {
   private static final Logger a = LogUtils.getLogger();
   private final td b;

   public qy(td $$0) {
      this.b = $$0;
   }

   protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
      int $$3 = $$1.readableBytes();
      if ($$3 != 0) {
         qx $$4 = new qx($$1);
         int $$5 = $$4.k();
         tc<?> $$6 = ((qw)$$0.channel().attr(qv.e).get()).a(this.b, $$5, $$4);
         if ($$6 == null) {
            throw new IOException("Bad packet id " + $$5);
         } else {
            int $$7 = ((qw)$$0.channel().attr(qv.e).get()).a();
            axf.e.a($$7, $$5, $$0.channel().remoteAddress(), $$3);
            if ($$4.readableBytes() > 0) {
               throw new IOException(
                  "Packet "
                     + ((qw)$$0.channel().attr(qv.e).get()).a()
                     + "/"
                     + $$5
                     + " ("
                     + $$6.getClass().getSimpleName()
                     + ") was larger than I expected, found "
                     + $$4.readableBytes()
                     + " bytes extra whilst reading packet "
                     + $$5
               );
            } else {
               $$2.add($$6);
               if (a.isDebugEnabled()) {
                  a.debug(qv.c, " IN: [{}:{}] {}", new Object[]{$$0.channel().attr(qv.e).get(), $$5, $$6.getClass().getName()});
               }

            }
         }
      }
   }
}
