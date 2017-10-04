/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author mengjinglu
 * got some information fromhttp://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/07/compute-pi.html
 */
public class HW5 {

   
    public static void main(String[] args) {
        int numOfdots = 0;
        int dotInside = 0;
        double x,y;
        for(int i = 0; i<4000000000L;i++){
            x = Math.random();
            y = Math.random();
            numOfdots++;
            if(x*x+y*y<=1){
                dotInside++;
            }
           
        }
         System.out.println("pi/4 = "+ ((double)dotInside)/numOfdots);
        System.out.println("pi = " + 4 * ((double)dotInside)/numOfdots);
    }
    
}
