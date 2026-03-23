import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resistanceValue1 = sc.nextLine();
        String resistanceValue2 = sc.nextLine();
        String resistanceMultiply = sc.nextLine();

        BigInteger resistance = BigInteger.ZERO;

        switch (resistanceValue1) {
            case "black":
                resistance = resistance.add(BigInteger.valueOf(0));
                break;
            case "brown":
                resistance = resistance.add(BigInteger.valueOf(10));
                break;
            case "red":
                resistance = resistance.add(BigInteger.valueOf(20));
                break;
            case "orange":
                resistance = resistance.add(BigInteger.valueOf(30));
                break;
            case "yellow":
                resistance = resistance.add(BigInteger.valueOf(40));
                break;
            case "green":
                resistance = resistance.add(BigInteger.valueOf(50));
                break;
            case "blue":
                resistance = resistance.add(BigInteger.valueOf(60));
                break;
            case "violet":
                resistance = resistance.add(BigInteger.valueOf(70));
                break;
            case "grey":
                resistance = resistance.add(BigInteger.valueOf(80));
                break;
            case "white":
                resistance = resistance.add(BigInteger.valueOf(90));
        }

        switch (resistanceValue2) {
            case "black":
                break;
            case "brown":
                resistance = resistance.add(BigInteger.valueOf(1));
                break;
            case "red":
                resistance = resistance.add(BigInteger.valueOf(2));
                break;
            case "orange":
                resistance = resistance.add(BigInteger.valueOf(3));
                break;
            case "yellow":
                resistance = resistance.add(BigInteger.valueOf(4));
                break;
            case "green":
                resistance = resistance.add(BigInteger.valueOf(5));
                break;
            case "blue":
                resistance = resistance.add(BigInteger.valueOf(6));
                break;
            case "violet":
                resistance = resistance.add(BigInteger.valueOf(7));
                break;
            case "grey":
                resistance = resistance.add(BigInteger.valueOf(8));
                break;
            case "white":
                resistance = resistance.add(BigInteger.valueOf(9));
        }

        switch (resistanceMultiply) {
            case "black":
                break;
            case "brown":
                resistance = resistance.multiply(BigInteger.valueOf(10));
                break;
            case "red":
                resistance = resistance.multiply(BigInteger.valueOf(100));
                break;
            case "orange":
                resistance = resistance.multiply(BigInteger.valueOf(1000));
                break;
            case "yellow":
                resistance = resistance.multiply(BigInteger.valueOf(10000));
                break;
            case "green":
                resistance = resistance.multiply(BigInteger.valueOf(100000));
                break;
            case "blue":
                resistance = resistance.multiply(BigInteger.valueOf(1000000));
                break;
            case "violet":
                resistance = resistance.multiply(BigInteger.valueOf(10000000));
                break;
            case "grey":
                resistance = resistance.multiply(BigInteger.valueOf(100000000));
                break;
            case "white":
                resistance = resistance.multiply(BigInteger.valueOf(1000000000));
        }

        System.out.println(resistance);
    }
}