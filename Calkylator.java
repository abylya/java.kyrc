public class Calkylator{

private int rezylt;

public void add(int ...params){
for(Integer param : params){
     this.rezylt+=param;
}
}

public int getResult(){
    return this.rezylt;
}

public void cleanResult(){
    this.rezylt=0;
}

}