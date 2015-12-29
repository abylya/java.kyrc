import java.util.Scanner;

public class InteractRunar {
     
    public static void main(String[] arg){
 
         Scanner reader=new Scanner(System.in);

                try{

                      Calkylator calc=new Calkylator();
                        String exit="no";
                           while(!exit.equals("yes")){

                             System.out.println("Enter first argyment");
                              String first=reader.next();
                               System.out.println("Enter second argyment");
                                 String second=reader.next();
                               
                              calc.add(Integer.valueOf(first),Integer.valueOf(second));
                              System.out.println("Rezylt= "+calc.getResult());
                              calc.cleanResult ();
                              
                                 System.out.println("Exsit : yes/no");
                                 exit=reader.next();
                               }

                        } 
                            finally{
                               reader.close();
                             }

}

}