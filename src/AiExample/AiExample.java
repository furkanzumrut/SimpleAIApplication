package AiExample;

import java.util.Scanner;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author furkanzumrut
 */
public class AiExample {        
    
    @SuppressWarnings("empty-statement")  
    public static void main(String[] args) throws InterruptedException {      
        
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter an integer of n for 2^n // 2^n "); 
        int n = s.nextInt();
        
       
        int omega = 0;
        int gameCount = 0;
        int table[][] = new int[n+4][n+4];
        AiMethods.resetArray(n,table);
        
            
            AiTexts.Digits();
            AiMethods.printDigits(n,table);   
            
            AiTexts.play();
            do{ 
               for(int i = 0;i<=n; i++) {
                for(int j = 0;j<=n; j++) {     
                    int cd = (int) (1 + Math.random() * 6);
                    try {
                        switch(cd) {
                        case 1:
                            AiMethods.shape1(i, j, table);
                        break;
                        case 2: 
                            AiMethods.shape2(i, j, table);
                        break;
                        case 3:               
                            AiMethods.shape3(i, j, table);
                        break;
                        case 4:
                            AiMethods.shape4(i, j, table);
                        break;
                        case 5:
                            AiMethods.shape5(i, j, table);
                        break;
                        case 6:
                            AiMethods.shape6(i, j, table);
                        break;

                        }      
                        
                    } catch (Exception e) {}
         
          }       
        
        }
         
        if(AiMethods.findZero(n,table) == 1) {
            omega = 1;
        }else{
            AiMethods.resetArray(n,table);
        }
       
        gameCount++;            
        }while(omega == 0);     

        
        AiMethods.printArray(n,table);
        AiTexts.stop(gameCount);


    
    
    }
}