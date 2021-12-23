//Input 256.123.254.1
//Output Invalid

import java.util.Scanner;

public class IPAddressIdentification{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine().replace(".", " ");
        String[] ip = address.split("\\s+");
        sc.close();

        for (String section : ip){
            if(Integer.parseInt(section) < 0 || Integer.parseInt(section) > 255){
                System.out.print("Invalid");
                return;
            }
        }
        System.out.print("Valid");

    }
}