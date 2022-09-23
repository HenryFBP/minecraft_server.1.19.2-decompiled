public interface amk {
   int a();

   String b();

   default rq c() {
      return rq.c(this.b());
   }
}
