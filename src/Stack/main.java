/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Scanner;

/**
 *
 * @author Nahdya
 */
public class main {
    public static void main(String[] args) { 
        int pilihan;
        int data;
        Stack result= new Stack(); //memanggil dari class stack
        //pilihan
        System.out.println("1,PUSH");
        System.out.println("2,POP ITEM");
        do{ //perulangan
            Scanner input=new Scanner(System.in);
            System.out.print("pilih data:\t");
            pilihan=input.nextInt(); //metode pilihan yang diinput oleh user
            if(pilihan==1){ //jika pilihan user adalah 1
                System.out.print("data yang ditambahkan adalah:\t");
                data=input.nextInt(); //user memasukkan data
                result.push(data);//memnanggil metode push dari class stack
                result.display(); //memanggil metode display dari class stack untuk menampilkan data
            }
            else if(pilihan==2){ //jika pilihan user adalah 2
                result.pop(); //memanggil metode popmdari class stack
                result.display(); //memanggil metode display dari metode stack
            }else{ //jika user memilih angka lain
                System.out.println("pilihan tidak ada"); //output yang diberikan
                System.exit(0); //runner berhenti
            }
        }while (pilihan!=0); //perulangan dilakukan sampai pilihan bukan 0
        
    }
    
}

