
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calkylator calc = new Calkylator();
            boolean c=true;
            String exit = "";
            String argyment="";

            while (!exit.equals("yes")) {

                System.out.println("Rezult="+calc.getResult()+"\n"+"Exsit :'X'");
                 argyment = reader.next();
                if(argyment.equals("x")||argyment.equals("X")){
                    break;  }



                if (argyment.equals("+") || argyment.equals("-") || argyment.equals("*") || argyment.equals("/")) {
                    String v = argyment;
                    System.out.println("Enter argyment");
                    argyment = reader.next();
                            if(v.equals("/")&&Double.valueOf(argyment)==0){
                                while (c){
                                    System.out.println("Nizya na nuul");
                                    System.out.println("Enter argyment");
                                    argyment=reader.next();
                                    if(Double.valueOf(argyment)>0){break;}
                                }

                            }
                    switch (v) {
                        case "-":
                            calc.minyc(calc.getResult(), Double.valueOf(argyment));
                            break;
                        case "+":
                            calc.add(calc.getResult(), Double.valueOf(argyment));
                            break;
                        case "*":
                            calc.ymnozh(calc.getResult(),Double.valueOf(argyment));
                            break;
                        case "/":
                            calc.delen(calc.getResult(), Double.valueOf(argyment));
                            break;
                    }
                }
                else {
                    calc.setRezylt(Double.valueOf(argyment));
                    System.out.println("Enter operaziya");

                    String v="";
                    while (c){
                        v=reader.next();
                        if(v.equals("+") || v.equals("-") || v.equals("*") || v.equals("/")){
                            break;
                        }
                        System.out.println("Ne pravilnii vvod");

                    }

                    System.out.println("Enter second argyment");
                    argyment=reader.next();

                    if(v.equals("/")){
                        while (c) {
                            if (argyment == "0") {
                                System.out.println("Nizya na nuul");
                                System.out.println("Enter second argyment");
                                argyment=reader.next();
                            }
                            if(Double.valueOf(argyment)>0){
                                c=false;
                            }
                        }
                    }
                    c=true;

                    if (v.equals("+") || v.equals("-") || v.equals("*") || v.equals("/")) {


                        switch (v) {
                            case "-":
                                calc.minyc(calc.getResult(), Double.valueOf(argyment));
                                break;
                            case "+":
                                calc.add(calc.getResult(), Double.valueOf(argyment));
                                break;
                            case "*":
                                calc.ymnozh(calc.getResult(),Double.valueOf(argyment));
                                break;
                            case "/":
                                calc.delen(calc.getResult(), Double.valueOf(argyment));
                                break;
                        }
                    }
                }

            }


        }
        finally {
            reader.close();

        }
    }




}
