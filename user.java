/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan33_userlogin;

/**
 *
 * @author
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class user {
    private String username = "Syahrun";
    private String password = "123123123";
    private boolean statusAkun;

    private boolean cekAkun(String username, String password){
        if (this.username.equals(username) && this.password.equals(password)){
            statusAkun = true;
    }
        else {
            statusAkun = false;
                    
        }
       
        return statusAkun;
    }
    
    private void hasilLogin(boolean statusAkun, String username){
        this.cekAkun(username, password);
        statusAkun = this.statusAkun;
        if (statusAkun == true){
            System.out.println("*****HALLO " + username.toUpperCase()+"*****");
            System.out.println("Selamat Datang Di Aplikasi Ini");
            }
        else {
            System.out.println("Opppss. Username atau Password Anda Salah");
        }
    }    
    public void pengecekanLogin(String username, String password){
        this.cekAkun(username, password);  
        this.hasilLogin(statusAkun, username);
    }    
    

    
    
}
