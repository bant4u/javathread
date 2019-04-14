/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bijay
 */
public class Person implements Runnable{
    
    String first_name;
    String last_name ;
   
    public Person(String fname, String lname) {
		first_name = fname;
                last_name= lname;
	}
    
    public void setfirstname(String first_name) {
    this.first_name = first_name;
    }

    public String getfirstname() {
        return this.first_name;
    }
        public void setlastname(String last_name) {
    this.last_name = last_name;
    }

    public String getlastname() {
        return this.last_name;
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(first_name+" "+last_name+" has Started work");
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(first_name+" "+last_name+" has completed work");
    }
    
    public static void main(String[] args){
        Thread t1 =new Thread(new Person("Fuba","Lama"));
        t1.start();
   
    }
    
}
