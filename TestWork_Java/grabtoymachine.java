package TestWork_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;

public class grabtoymachine {
    
    
    //private static Random random = new Random();         

    public static void main(String[] args) {
        
        Croco buildKit = new Croco(1, "BiuldKit", 2);
        Croco babyRobot = new Croco(2, "BabyRobot", 2);
        Croco barbyDoll = new Croco(3, "BarbyDoll", 6);

        //System.out.println(buildKit.toString());
        //System.out.println(babyRobot.toString());
        //System.out.println(barbyDoll.toString());
        
        //List <Croco> list =  new ArrayList<>();
        //list.add(barbyDoll);
        //list.add(babyRobot);
        //list.add(buildKit);
        //Croco [] toys_1 = new Croco[] {buildKit, babyRobot, barbyDoll}; 
        //Croco [] toys_2 = new Croco[10];
        PriorityQueue <Croco> queue = new PriorityQueue<>();
        
        for (int i = 0; i < 10; i++) {
            queue.add(getToy());
          }
        
        /*for (int i = 0; i < toys_2.length; i++) {
            toys_2[i] = getToy();
          }
          for (Croco toy : toys_2){
            System.out.println(toy.toString());
        }*/ 
        Croco current = null;
        
       /*while((current = queue.poll())!= null) { // Retrieves and removes
            System.out.println("--- Grabbed toy: " + current.getName() + " ---");
            System.out.println("   >> Weight: " + current.getWeight());
            System.out.println();
        }*/ 
        
        try {
            File file = new File("file.txt");
            FileWriter writer_a = new FileWriter(file, false);
            writer_a.write(String.format("\n" + "This is working process of  grabToyMachine: "));
            writer_a.write(String.format("\n"));
                     
            while((current = queue.poll())!= null) { // Retrieves and removes
                writer_a.write(String.format("--- Grabbed toy: " + current.getName() + " ---"));
                writer_a.write(String.format("   >> Weight: " + current.getWeight()));
                writer_a.write(String.format("\n"));
            }

            writer_a.close(); 
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    static Croco  getToy() {
        Croco buildKit = new Croco(1, "BuildKit", 2);
        Croco babyRobot = new Croco(2, "BabyRobot", 2);
        Croco barbyDoll = new Croco(3, "BarbyDoll", 6);

        List <Croco> list = new ArrayList<>();
        list.add(buildKit);
        list.add(babyRobot);
        list.add(barbyDoll);
        
        Random rand = new Random();
          
        int randomIndex = rand.nextInt(list.size());
       // Create random element from List <Croco> list - size = 3
                              
            return list.get(randomIndex);
        }
    }
   
    

