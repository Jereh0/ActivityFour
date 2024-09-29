/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activityfour;

/**
 *
 * @author Administrator
 */
public class ActivityFour {

    public static int display(int n){
            if(n == 0){
            return 0;
            }else{
                System.out.println(n);
                 return display(n-1);
            }
    }
    public static void main(String[] args) {
       display(5);
    }
    
}
