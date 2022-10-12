package utils;

import characters.Character;
import characters.Elf;
import characters.Hobbit;

public class GameManager {
    public static void fight(Character char1, Character char2){
        int round = 1;
        String char1Name = char1.getClass().getSimpleName();
        String char2Name = char2.getClass().getSimpleName();

        print_fire();
        System.out.println("First character: " + char1Name);
        System.out.println("Second character: " + char2Name);
        if (char1 instanceof Hobbit && char2 instanceof Hobbit) {
            System.out.println("(Плак Плак Плак)^\u221E");
            print_fire();
            return;
        }
        while (char1.isAlive() && char2.isAlive()) {
            print_fire();
            System.out.println("Round"+round+"\n");
            System.out.println(char1Name + " kicks "+ char2Name);
            char1.kick(char2);
            if (char2.isAlive()) {
                System.out.println(char2Name + " kicks "+ char1Name);
                char2.kick(char1);
            }
            else break;
            print_fire();
            System.out.println("Round results");
            System.out.println("First character: " + char1);
            System.out.println("Second character: " + char2);
            round++;
            print_fire();
        }
        if (char1.isAlive())
            System.out.println(char1Name + " won");
        else
            System.out.println(char2Name + " won");
        print_fire();
    }

    public static void print_fire(){
        System.out.println("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25");
    }
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character first = factory.createCharacter();
        Character second = factory.createCharacter();
        fight(first, second);
    }
}
