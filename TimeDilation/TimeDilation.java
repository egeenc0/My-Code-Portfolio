/*Simple simulation for calculating time dilation for moving objects according to Einstein's theory of Special Relativity*/

import java.util.Scanner;

public class TimeDilation {
	/*Speed of light in a vacuum,note that this is universal*/
	public static double c = 299792458;
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the velocity of the spaceship you want to travel with(use a fraction of the speed of the light,for example 99 is 0.99c)");
        System.out.print(":%");
        double v = sc.nextDouble()/100.0 * c;
        double t_d = time(v);
        System.out.println("How long you will travel with your spaceship?(Enter in years)");
        /*Due to special relativity,for the stationary observer the moving clock(clock in the spaceship) ticks slower.This means time passes slower in the spaceship(the moving object)*/
        double t = sc.nextDouble();
        System.out.println(t + " years passed for you");
        System.out.println(t/t_d + " years passed on the Earth");
        
	}
	
	/*Calculates time dilation according to
	Special Relativity*/	
	public static double time(double v){
	    return Math.sqrt(1-((v * v)/(c * c)));
	}
}