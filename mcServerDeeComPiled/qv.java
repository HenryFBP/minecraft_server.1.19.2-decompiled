import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class qv extends SimpleChannelInboundHandler<tc<?>> {
   private static final float i = 0.75F;
   private static final Logger j = LogUtils.getLogger();
   public static final Marker a = MarkerFactory.getMarker("NETWORK");
   public static final Marker b = ad.a(MarkerFactory.getMarker("NETWORK_PACKETS"), $$0 -> $$0.add(a));
   public static final Marker c = ad.a(MarkerFactory.getMarker("PACKET_RECEIVED"), $$0 -> $$0.add(b));
   public static final Marker d = ad.a(MarkerFactory.getMarker("PACKET_SENT"), $$0 -> $$0.add(b));
   public static final AttributeKey<qw> e = AttributeKey.valueOf("protocol");
   public static final amd<NioEventLoopGroup> f = new amd(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final amd<EpollEventLoopGroup> g = new amd(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final amd<DefaultEventLoopGroup> h = new amd(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private final td k;
   private final Queue<qv.a> l = Queues.newConcurrentLinkedQueue();
   private Channel m;
   private SocketAddress n;
   private ra o;
   private rq p;
   private boolean q;
   private boolean r;
   private int s;
   private int t;
   private float u;
   private float v;
   private int w;
   private boolean x;

   public qv(td $$0) {
      this.k = $$0;
   }

   public void channelActive(ChannelHandlerContext $$0) throws Exception {
      super.channelActive($$0);
      this.m = $$0.channel();
      this.n = this.m.remoteAddress();

      try {
         this.a(qw.a);
      } catch (Throwable var3) {
         j.error(LogUtils.FATAL_MARKER, "Failed to change protocol to handshake", var3);
      }

   }

   public void a(qw $$0) {
      this.m.attr(e).set($$0);
      this.m.config().setAutoRead(true);
      j.debug("Enabled auto read");
   }

   public void channelInactive(ChannelHandlerContext $$0) {
      this.a(rq.c("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
      if ($$1 instanceof rd) {
         j.debug("Skipping packet due to errors", $$1.getCause());
      } else {
         boolean $$2 = !this.x;
         this.x = true;
         if (this.m.isOpen()) {
            if ($$1 instanceof TimeoutException) {
               j.debug("Timeout", $$1);
               this.a(rq.c("disconnect.timeout"));
            } else {
               rq $$3 = rq.a("disconnect.genericReason", "Internal Exception: " + $$1);
               if ($$2) {
                  j.debug("Failed to sent packet", $$1);
                  qw $$4 = this.p();
                  tc<?> $$5 = (tc<?>)($$4 == qw.d ? new zu($$3) : new uf($$3));
                  this.a($$5, rb.a((Runnable)(() -> this.a($$3))));
                  this.l();
               } else {
                  j.debug("Double fault", $$1);
                  this.a($$3);
               }
            }

         }
      }
   }

   protected void a(ChannelHandlerContext $$0, tc<?> $$1) {
      if (this.m.isOpen()) {
         try {
            a($$1, this.o);
         } catch (abl var4) {
         } catch (RejectedExecutionException var5) {
            this.a(rq.c("multiplayer.disconnect.server_shutdown"));
         } catch (ClassCastException var6) {
            j.error("Received {} that couldn't be processed", $$1.getClass(), var6);
            this.a(rq.c("multiplayer.disconnect.invalid_packet"));
         }

         ++this.s;
      }

   }

   private static <T extends ra> void a(tc<T> $$0, ra $$1) {
      $$0.a((T)$$1);
   }

   public void a(ra $$0) {
      Validate.notNull($$0, "packetListener", new Object[0]);
      this.o = $$0;
   }

   public void a(tc<?> $$0) {
      this.a($$0, null);
   }

   public void a(tc<?> $$0, @Nullable rb $$1) {
      if (this.h()) {
         this.q();
         this.b($$0, $$1);
      } else {
         this.l.add(new qv.a($$0, $$1));
      }

   }

   private void b(tc<?> $$0, @Nullable rb $$1) {
      qw $$2 = qw.a($$0);
      qw $$3 = this.p();
      ++this.t;
      if ($$3 != $$2) {
         j.debug("Disabled auto read");
         this.m.config().setAutoRead(false);
      }

      if (this.m.eventLoop().inEventLoop()) {
         this.a($$0, $$1, $$2, $$3);
      } else {
         this.m.eventLoop().execute(() -> this.a($$0, $$1, $$2, $$3));
      }

   }

   private void a(tc<?> $$0, @Nullable rb $$1, qw $$2, qw $$3) {
      if ($$2 != $$3) {
         this.a($$2);
      }

      ChannelFuture $$4 = this.m.writeAndFlush($$0);
      if ($$1 != null) {
         $$4.addListener($$1x -> {
            if ($$1x.isSuccess()) {
               $$1.a();
            } else {
               tc<?> $$2x = $$1.b();
               if ($$2x != null) {
                  ChannelFuture $$3x = this.m.writeAndFlush($$2x);
                  $$3x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
               }
            }

         });
      }

      $$4.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
   }

   private qw p() {
      return (qw)this.m.attr(e).get();
   }

   private void q() {
      if (this.m != null && this.m.isOpen()) {
         synchronized(this.l) {
            qv.a $$0;
            while(($$0 = (qv.a)this.l.poll()) != null) {
               this.b($$0.a, $$0.b);
            }

         }
      }
   }

   public void a() {
      this.q();
      ra var2 = this.o;
      if (var2 instanceof re $$0) {
         $$0.c();
      }

      if (!this.h() && !this.r) {
         this.m();
      }

      if (this.m != null) {
         this.m.flush();
      }

      if (this.w++ % 20 == 0) {
         this.b();
      }

   }

   protected void b() {
      this.v = ami.i(0.75F, (float)this.t, this.v);
      this.u = ami.i(0.75F, (float)this.s, this.u);
      this.t = 0;
      this.s = 0;
   }

   public SocketAddress c() {
      return this.n;
   }

   public void a(rq $$0) {
      if (this.m.isOpen()) {
         this.m.close().awaitUninterruptibly();
         this.p = $$0;
      }

   }

   public boolean d() {
      return this.m instanceof LocalChannel || this.m instanceof LocalServerChannel;
   }

   public td e() {
      return this.k;
   }

   public td f() {
      return this.k.a();
   }

   public static qv a(InetSocketAddress $$0, boolean $$1) {
      final qv $$2 = new qv(td.b);
      Class<? extends SocketChannel> $$3;
      amd<? extends EventLoopGroup> $$4;
      if (Epoll.isAvailable() && $$1) {
         $$3 = EpollSocketChannel.class;
         $$4 = g;
      } else {
         $$3 = NioSocketChannel.class;
         $$4 = f;
      }

      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)$$4.a()))
               .handler(
                  new ChannelInitializer<Channel>() {
                     protected void initChannel(Channel $$0) {
                        try {
                           $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
                        } catch (ChannelException var3) {
                        }
            
                        $$0.pipeline()
                           .addLast("timeout", new ReadTimeoutHandler(30))
                           .addLast("splitter", new rf())
                           .addLast("decoder", new qy(td.b))
                           .addLast("prepender", new rg())
                           .addLast("encoder", new qz(td.a))
                           .addLast("packet_handler", $$2);
                     }
                  }
               ))
            .channel($$3))
         .connect($$0.getAddress(), $$0.getPort())
         .syncUninterruptibly();
      return $$2;
   }

   public static qv a(SocketAddress $$0) {
      final qv $$1 = new qv(td.b);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)h.a())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            $$0.pipeline().addLast("packet_handler", $$1);
         }
      })).channel(LocalChannel.class)).connect($$0).syncUninterruptibly();
      return $$1;
   }

   public void a(Cipher $$0, Cipher $$1) {
      this.q = true;
      this.m.pipeline().addBefore("splitter", "decrypt", new qr($$0));
      this.m.pipeline().addBefore("prepender", "encrypt", new qs($$1));
   }

   public boolean g() {
      return this.q;
   }

   public boolean h() {
      return this.m != null && this.m.isOpen();
   }

   public boolean i() {
      return this.m == null;
   }

   public ra j() {
      return this.o;
   }

   @Nullable
   public rq k() {
      return this.p;
   }

   public void l() {
      this.m.config().setAutoRead(false);
   }

   public void a(int $$0, boolean $$1) {
      if ($$0 >= 0) {
         if (this.m.pipeline().get("decompress") instanceof qt) {
            ((qt)this.m.pipeline().get("decompress")).a($$0, $$1);
         } else {
            this.m.pipeline().addBefore("decoder", "decompress", new qt($$0, $$1));
         }

         if (this.m.pipeline().get("compress") instanceof qu) {
            ((qu)this.m.pipeline().get("compress")).a($$0);
         } else {
            this.m.pipeline().addBefore("encoder", "compress", new qu($$0));
         }
      } else {
         if (this.m.pipeline().get("decompress") instanceof qt) {
            this.m.pipeline().remove("decompress");
         }

         if (this.m.pipeline().get("compress") instanceof qu) {
            this.m.pipeline().remove("compress");
         }
      }

   }

   public void m() {
      if (this.m != null && !this.m.isOpen()) {
         if (this.r) {
            j.warn("handleDisconnection() called twice");
         } else {
            this.r = true;
            if (this.k() != null) {
               this.j().a(this.k());
            } else if (this.j() != null) {
               this.j().a(rq.c("multiplayer.disconnect.generic"));
            }
         }

      }
   }

   public float n() {
      return this.u;
   }

   public float o() {
      return this.v;
   }

   static class a {
      final tc<?> a;
      @Nullable
      final rb b;

      public a(tc<?> $$0, @Nullable rb $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
