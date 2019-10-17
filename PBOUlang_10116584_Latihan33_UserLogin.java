/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan33_userlogin;

import java.util.Scanner;

/**
 *
 * @author
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan33_UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        user login = new user();
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukan User Name\t:");
        String user = scan.next();
        System.out.print("Masukan Password\t:");
        String password = scan.next();
        System.out.println("");
        
        login.pengecekanLogin(user, password);
    }
    
}
