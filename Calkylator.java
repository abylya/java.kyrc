public class Calkylator {

    private double rezylt=0;

        public void add(double a,double b){
           rezylt=a+b;
        }
        public void minyc(double a,double b){
          rezylt=a-b;
        }

        public void ymnozh(double a,double b){

            rezylt=a*b;
        }

        public void delen(double a,double b){
            rezylt=a/b;

        }

    public void setRezylt(double rezylt) {
        this.rezylt = rezylt;
    }

    public  double getResult(){
            return this.rezylt;
        }

        public void cleanResult(){
            this.rezylt=0;
        }



    }
