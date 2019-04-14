/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author bijay
 */
public class PersonTest {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("All task are Submitted");
        try{
            
            ExecutorService executor = Executors.newFixedThreadPool(3);
            
            executor.submit(new Thread(new Person("Fuba","Lama")));
            executor.submit(new Thread(new Person("Alex","Aexa")));
            executor.submit(new Thread(new Person("Rikey ","Ponting")));
            executor.submit(new Thread(new Person("Mike","Alpha")));
            executor.awaitTermination(10, TimeUnit.SECONDS);
            
            executor.shutdown();
        
        }
        catch(InterruptedException ex){
        }
                
       System.out.println("All task are Done");

    }
    
}
