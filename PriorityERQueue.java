/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityerqueue;
import java.util.*;



public class PriorityERQueue {
   
    public static void main(String[] args) {
        // create 5 patient instances
        Patient er1 = new Patient(4, "Vinnie Pinatino", "Broken Nose");
        Patient er2 = new Patient(1, "Gabe Scholamachia", "Chest Pain");
        Patient er3 = new Patient(3, "Margaret Sinpliny", "Broken Leg");
        Patient er4 = new Patient(5, "Walter Comettenin", "Broken Finger");
        Patient er5 = new Patient(2, "Cynthia Bittonnia", "Shortness of Breath");
        
        //create priority queue using java.util.priorityqueue package
        PriorityQueue<Patient> theER = new PriorityQueue<>();
        
        //add patient to the queue
        theER.add(er1);
        theER.add(er2);
        theER.add(er3);
        theER.add(er4);
        theER.add(er5);
        
        //iterate throught the queue using an inhanced for loop
        //print the queue
        for(Patient iterate: theER){ 
            System.out.println(iterate);
        }
        
        //remove next patient from queue
        System.out.println("Removing " + theER.remove());
        System.out.println("There are " + 
                theER.size() + " patients in queue.");
        
         //print the queue
        for(Patient iterate: theER){ 
            System.out.println(iterate);
        }
    }
    
}
