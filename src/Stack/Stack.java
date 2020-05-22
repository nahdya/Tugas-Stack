/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Nahdya
 */
public class Stack {

    private boolean empty, full;
    private int pos;
    private int max_data = 3;
    private int item[] = new int[max_data];

    public void Stack() {
        full = false;
        empty = true;
        pos = 0;
    }

    public boolean isFull() {
        return (full);
    }

    public boolean isEmpty() {
        return (empty);
    }

    public void push(int data) { //penambahan data
        if (!isFull()) { //jika data tidak penuh
            item[pos++] = data; //item pos yang bertambah merupakan data
            empty = false; 
            if (pos == max_data) { //jika pos samadengan maxumal data
                full = true; //menyatakan full is true
            }
            System.out.println("data sudah ditambahkan"); //output yang ditampilkan
        } else { //jika data sudah penuh
            System.out.println("data sudah penuh"); //output yang ditampilkan
        }
        return;
    }

    public int pop() { //pengurangan data
        int x = 0;
        if (!isEmpty()) { //jika data tidak kosong
            x = item[--pos]; //x merpupakan item pos dicrement
            full = false; //menyatakan full is false
            System.out.println("data yang di pop dalah:\t" + item[pos]); //menampilkan data yang dikurangi
            item[pos] = 0;
            if (pos == 0) { //jika data sudah tidak ada
                System.out.println("Stack adalah kosong"); //output yang ditampilkan
            } else { //jika data masih ada
                System.out.println("data sudah diambil"); //output yang ditampilkan
            }
        } else {
            System.out.println("stack masih kosong! \n");
        }
        return (x);
    }

    public void display() { //menampilkan data
        System.out.print("isi stack adalah:\t");
        for (int i = 0; i < pos; i++) {
            System.out.print("" + item[i] + ",");
        }
        System.out.println("\n");

    }
}
