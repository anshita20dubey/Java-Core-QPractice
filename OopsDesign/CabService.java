package OopsDesign;

import java.util.Scanner;

public class CabService {
    String car_type;
    double km;
    double bill;
    CabService(){
        car_type = "";
        km = bill = 0.0;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ac or norac");
        car_type = sc.nextLine();
        System.out.println("km");
        km = sc.nextDouble();
    }
    void calculate(){
        if(car_type.equals("ac")){
            if(km<=5) bill =150;
            else bill = 150+(km-5)*10;
        } else if(car_type.equals("nonac")){
            if(km<=5) bill =120;
            else bill = 120+(km-5)*8;
        } else{
            System.out.println("invalid");
        }
    }
    void display(){
        System.out.println("cartype: "+car_type);
        System.out.println("km travelled: "+km);
        System.out.println("bill: "+bill);
    }
    public static void main(String[] args) {
       CabService obj = new CabService();
       obj.accept();
       obj.calculate();
       obj.display();
    }
}
