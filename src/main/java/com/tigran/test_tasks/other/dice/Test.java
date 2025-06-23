package com.tigran.test_tasks.other.dice;

/**
 * Created by Tigran Melkonyan
 * Date: 5/8/25
 * Time: 9:39 PM
 */
public class Test {
    public static void main(String[] args) {
        DiceS s = new DiceS(6);

        System.out.println(s.coin());
        System.out.println(s.rollX(5));
        
        Dice dice = new Dice(6);

        System.out.println(dice.roll());
        System.out.println(dice.rollMultipleAndSum(3));
        
    }
}
