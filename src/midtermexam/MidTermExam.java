/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;

/**
 *
 * @author hp
 */
public class MidTermExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          String name =  "Beatrice";
        double height = 1.0;
        double weight = 60.5;
        double getBMI = weight/(height*height);
        
        
        
        while(getBMI<3.0){
             
        System.out.println(getBMI);
        getBMI+=1;
        }
    }


public static double getBMI(){

          
      return 23 ;
    }
 

    
}
