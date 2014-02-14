/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AiExample;

/**
 *
 * @author furkanzumrut
 */
public class AiMethods {
    
    public static void log(String a)
    {
    System.out.println(a);    
        
    }
    
    
    public static int findZero(int n,int table[][]){
        
        
        int count = 0;
        for(int i = 0;i<=n; i++) {
                for(int j = 0;j<=n; j++) {
                    if( table[ i ][ j ] == 0) {
                      count = count+1;
                    }
                }
                
        
        }
        
        return (count);
        
    }
    
    
    
    
    public static int[][] shape1(int i, int j, int table[][] ){
        
       if(table[i][j] == 0 && table[i][j+1] == 0 && table[i+1][j] == 0) { 
        table[i][j] = 1;
        table[i][j+1] = 1;
        table[i+1][j] = 1;
       }
        return table;
    }
    
    public static int[][] shape2(int i, int j, int table[][] ){
       if(table[i][j+1] == 0 && table[i+1][j+1] == 0 && table[i+1][j] == 0) {
        table[i][j+1] = 2;
        table[i+1][j+1] = 2;
        table[i+1][j] = 2;
       }
        return table;   
    }
    
    public static int[][] shape3(int i, int j, int table[][] ){
       if(table[i][j] == 0 && table[i+1][j] == 0 && table[i+1][j+1] == 0){
        table[i][j] = 3;
        table[i+1][j] = 3;
        table[i+1][j+1] = 3;
       }
        return table;   
    }
    
    public static int[][] shape4(int i, int j, int table[][] ){
       if(table[i][j] == 0 && table[i][j+1] == 0 && table[i+1][j+1] == 0){
        table[i][j] = 4;
        table[i][j+1] = 4;
        table[i+1][j+1] = 4;
       }
        return table; 
         
    }
    
    public static int[][] shape5(int i, int j, int table[][] ){
      if(table[i][j] == 0 && table[i][j+1] == 0 && table[i][j+2] == 0) {
        table[i][j] = 5;
        table[i][j+1] = 5;
        table[i][j+2] = 5; 
      }
        return table;   
    }
        
        
    public static int[][] shape6(int i, int j, int table[][] ){
       if(table[i][j] == 0 && table[i+1][j] == 0 && table[i+2][j] == 0){
        table[i][j] = 6;
        table[i+1][j] = 6;
        table[i+2][j] = 6;
       }
        return table;   
    }
    
    public static void resetArray(int n,int table[][]){
    
        for(int i = 0;i<=n; i++) {
                for(int j = 0;j<=n; j++) { 
                    table[i][j] = 0;
                }  
                    
             }
             
    }
    
    public static void printArray(int n,int table[][]){
    
             for(int i = 0;i<=n; i++) {
                        for(int j = 0;j<=n; j++) {
               //                 if(table[i][j] == 0 && table[i+1][j+1] == 0 && table[i+1][j] == 0) {
                //                shape2(2, 2, table);


                                //shape3(i, j, table);
                                //shape4(i, j, table);
                                //shape5(i, j, table);
                                //shape6(i, j, table);
                                //shape1(i, j, table);

                            System.out.print("\t"+table[i][j]+"\t");
                        }  
                            System.out.print(" \n");


            }
    }
    
        public static void printDigits(int n,int table[][]){
        
            for(int i = 0;i<=n; i++) {
              for(int j = 0;j<=n; j++) {

                System.out.print("\t"+table[i][j]+"\t");
              }  
                System.out.print(" \n");
            }     
            
             
                   
        }
    
    



}
