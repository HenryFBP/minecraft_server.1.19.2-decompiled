import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bbm extends bbn {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private static final aaj<Float> d = aam.a(bbm.class, aal.c);
   private static final aaj<Integer> e = aam.a(bbm.class, aal.b);
   private static final aaj<Boolean> f = aam.a(bbm.class, aal.i);
   private static final aaj<im> ao = aam.a(bbm.class, aal.j);
   private static final float ap = 32.0F;
   private ccs aq = ccv.a;
   private final List<bbg> ar = Lists.newArrayList();
   private final Map<bbn, Integer> as = Maps.newHashMap();
   private int at = 600;
   private int au = 20;
   private int av = 20;
   private boolean aw;
   private int ax;
   private float ay;
   private float az;
   @Nullable
   private bcc aA;
   @Nullable
   private UUID aB;

   public bbm(bbr<? extends bbm> $$0, cgx $$1) {
      super($$0, $$1);
      this.Q = true;
      this.a(3.0F);
   }

   public bbm(cgx $$0, double $$1, double $$2, double $$3) {
      this(bbr.c, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected void a_() {
      this.ai().a(e, 0);
      this.ai().a(d, 0.5F);
      this.ai().a(f, false);
      this.ai().a(ao, io.v);
   }

   public void a(float $$0) {
      if (!this.s.y) {
         this.ai().b(d, ami.a($$0, 0.0F, 32.0F));
      }

   }

   @Override
   public void z_() {
      double $$0 = this.df();
      double $$1 = this.dh();
      double $$2 = this.dl();
      super.z_();
      this.e($$0, $$1, $$2);
   }

   public float h() {
      return this.ai().a(d);
   }

   public void a(ccs $$0) {
      this.aq = $$0;
      if (!this.aw) {
         this.w();
      }

   }

   private void w() {
      if (this.aq == ccv.a && this.ar.isEmpty()) {
         this.ai().b(e, 0);
      } else {
         this.ai().b(e, ccu.a(ccu.a(this.aq, this.ar)));
      }

   }

   public void a(bbg $$0) {
      this.ar.add($$0);
      if (!this.aw) {
         this.w();
      }

   }

   public int i() {
      return this.ai().a(e);
   }

   public void a(int $$0) {
      this.aw = true;
      this.ai().b(e, $$0);
   }

   public im j() {
      return this.ai().a(ao);
   }

   public void a(im $$0) {
      this.ai().b(ao, $$0);
   }

   protected void a(boolean $$0) {
      this.ai().b(f, $$0);
   }

   @Override
   public boolean l() {
      return this.ai().a(f);
   }

   public int n() {
      return this.at;
   }

   public void b(int $$0) {
      this.at = $$0;
   }

   @Override
   public void k() {
      super.k();
      boolean $$0 = this.l();
      float $$1 = this.h();
      if (this.s.y) {
         if ($$0 && this.R.h()) {
            return;
         }

         im $$2 = this.j();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = ami.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for(int $$7 = 0; $$7 < $$3; ++$$7) {
            float $$8 = this.R.i() * (float) (Math.PI * 2);
            float $$9 = ami.c(this.R.i()) * $$4;
            double $$10 = this.df() + (double)(ami.b($$8) * $$9);
            double $$11 = this.dh();
            double $$12 = this.dl() + (double)(ami.a($$8) * $$9);
            double $$17;
            double $$18;
            double $$19;
            if ($$2.b() != io.v) {
               if ($$0) {
                  $$17 = 0.0;
                  $$18 = 0.0;
                  $$19 = 0.0;
               } else {
                  $$17 = (0.5 - this.R.j()) * 0.15;
                  $$18 = 0.01F;
                  $$19 = (0.5 - this.R.j()) * 0.15;
               }
            } else {
               int $$13 = $$0 && this.R.h() ? 16777215 : this.i();
               $$17 = (double)((float)($$13 >> 16 & 0xFF) / 255.0F);
               $$18 = (double)((float)($$13 >> 8 & 0xFF) / 255.0F);
               $$19 = (double)((float)($$13 & 0xFF) / 255.0F);
            }

            this.s.b($$2, $$10, $$11, $$12, $$17, $$18, $$19);
         }
      } else {
         if (this.S >= this.au + this.at) {
            this.ah();
            return;
         }

         boolean $$23 = this.S < this.au;
         if ($$0 != $$23) {
            this.a($$23);
         }

         if ($$23) {
            return;
         }

         if (this.az != 0.0F) {
            $$1 += this.az;
            if ($$1 < 0.5F) {
               this.ah();
               return;
            }

            this.a($$1);
         }

         if (this.S % 5 == 0) {
            this.as.entrySet().removeIf($$0x -> this.S >= $$0x.getValue());
            List<bbg> $$24 = Lists.newArrayList();

            for(bbg $$25 : this.aq.a()) {
               $$24.add(new bbg($$25.b(), $$25.c() / 4, $$25.d(), $$25.e(), $$25.f()));
            }

            $$24.addAll(this.ar);
            if ($$24.isEmpty()) {
               this.as.clear();
            } else {
               List<bcc> $$26 = this.s.a(bcc.class, this.cy());
               if (!$$26.isEmpty()) {
                  for(bcc $$27 : $$26) {
                     if (!this.as.containsKey($$27) && $$27.fe()) {
                        double $$28 = $$27.df() - this.df();
                        double $$29 = $$27.dl() - this.dl();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.as.put($$27, this.S + this.av);

                           for(bbg $$31 : $$24) {
                              if ($$31.b().a()) {
                                 $$31.b().a(this, this.t(), $$27, $$31.d(), 0.5);
                              } else {
                                 $$27.b(new bbg($$31), this);
                              }
                           }

                           if (this.ay != 0.0F) {
                              $$1 += this.ay;
                              if ($$1 < 0.5F) {
                                 this.ah();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.ax != 0) {
                              this.at += this.ax;
                              if (this.at <= 0) {
                                 this.ah();
                                 return;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public float o() {
      return this.ay;
   }

   public void b(float $$0) {
      this.ay = $$0;
   }

   public float q() {
      return this.az;
   }

   public void c(float $$0) {
      this.az = $$0;
   }

   public int r() {
      return this.ax;
   }

   public void c(int $$0) {
      this.ax = $$0;
   }

   public int s() {
      return this.au;
   }

   public void d(int $$0) {
      this.au = $$0;
   }

   public void a(@Nullable bcc $$0) {
      this.aA = $$0;
      this.aB = $$0 == null ? null : $$0.co();
   }

   @Nullable
   public bcc t() {
      if (this.aA == null && this.aB != null && this.s instanceof agg) {
         bbn $$0 = ((agg)this.s).a(this.aB);
         if ($$0 instanceof bcc) {
            this.aA = (bcc)$$0;
         }
      }

      return this.aA;
   }

   @Override
   protected void a(pj $$0) {
      this.S = $$0.h("Age");
      this.at = $$0.h("Duration");
      this.au = $$0.h("WaitTime");
      this.av = $$0.h("ReapplicationDelay");
      this.ax = $$0.h("DurationOnUse");
      this.ay = $$0.j("RadiusOnUse");
      this.az = $$0.j("RadiusPerTick");
      this.a($$0.j("Radius"));
      if ($$0.b("Owner")) {
         this.aB = $$0.a("Owner");
      }

      if ($$0.b("Particle", 8)) {
         try {
            this.a(em.b(new StringReader($$0.l("Particle"))));
         } catch (CommandSyntaxException var5) {
            b.warn("Couldn't load custom particle {}", $$0.l("Particle"), var5);
         }
      }

      if ($$0.b("Color", 99)) {
         this.a($$0.h("Color"));
      }

      if ($$0.b("Potion", 8)) {
         this.a(ccu.c($$0));
      }

      if ($$0.b("Effects", 9)) {
         pp $$2 = $$0.c("Effects", 10);
         this.ar.clear();

         for(int $$3 = 0; $$3 < $$2.size(); ++$$3) {
            bbg $$4 = bbg.b($$2.a($$3));
            if ($$4 != null) {
               this.a($$4);
            }
         }
      }

   }

   @Override
   protected void b(pj $$0) {
      $$0.a("Age", this.S);
      $$0.a("Duration", this.at);
      $$0.a("WaitTime", this.au);
      $$0.a("ReapplicationDelay", this.av);
      $$0.a("DurationOnUse", this.ax);
      $$0.a("RadiusOnUse", this.ay);
      $$0.a("RadiusPerTick", this.az);
      $$0.a("Radius", this.h());
      $$0.a("Particle", this.j().a());
      if (this.aB != null) {
         $$0.a("Owner", this.aB);
      }

      if (this.aw) {
         $$0.a("Color", this.i());
      }

      if (this.aq != ccv.a) {
         $$0.a("Potion", hm.Z.b(this.aq).toString());
      }

      if (!this.ar.isEmpty()) {
         pp $$1 = new pp();

         for(bbg $$2 : this.ar) {
            $$1.add($$2.a(new pj()));
         }

         $$0.a("Effects", (qc)$$1);
      }

   }

   @Override
   public void a(aaj<?> $$0) {
      if (d.equals($$0)) {
         this.z_();
      }

      super.a($$0);
   }

   public ccs u() {
      return this.aq;
   }

   @Override
   public dqb c_() {
      return dqb.d;
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }

   @Override
   public bbo a(bco $$0) {
      return bbo.b(this.h() * 2.0F, 0.5F);
   }
}
