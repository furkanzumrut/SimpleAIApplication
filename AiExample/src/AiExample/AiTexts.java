/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AiExample;

/**
 *
 * @author furkanzumrut
 */
public class AiTexts {
    
        public static void play() throws InterruptedException{
    
        System.out.println("-----------------(COMPUTER IS PLAYING THE GAME)--------------------");  
        Thread.sleep(500);
    }
    
    
    public static void stop(int gameCount) throws InterruptedException{
    
        Thread.sleep(500);
        
        System.out.println("-----------("+gameCount+" TIMES PLAYED BY COMPUTER)-----------");
        Thread.sleep(500);
        System.out.println("-----------------------(GAME STOP !!)------------------");


    }
    
    
    public static void Digits() throws InterruptedException{

            System.out.println("-----------------(LOADING DIGITS..)--------------------");
            Thread.sleep(1000);
            System.out.println("-----------------(....LOADED..)--------------------");

    }
    
    
}
