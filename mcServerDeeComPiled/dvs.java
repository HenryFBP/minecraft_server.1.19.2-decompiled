public interface dvs extends dse {
   float b(dsd var1);

   default int a(dsd $$0) {
      return Math.round(this.b($$0));
   }

   dvr a();
}
