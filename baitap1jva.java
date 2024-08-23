/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class JAVACODE {
    public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
        System.out.println("Nhap x:");int x=(int)Input.nextInt();
        System.out.println("Nhap y:");int y=(int)Input.nextInt();
        int Tong=x+y;
        int Hieu=x-y;
        int Chia=x/y;
        int ChiaLayDu=x%y;
        System.out.println("Tong(+):"+Tong);
        System.out.println("Hieu(-):"+Hieu);
        System.out.println("Chia(/):"+Chia);
        System.out.println("ChiaLayDu(%):"+ChiaLayDu);
    }
    
}
