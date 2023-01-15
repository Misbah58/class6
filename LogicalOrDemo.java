package Class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {
        // We use ignore case to avoid case-sensitive
        System.out.println("please enter day");
        Scanner scanner=new Scanner(System.in);
        String day= scanner.nextLine();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("friday")){
            System.out.println("No class today");
        }else if(day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday")){
            System.out.println("java class enjoy");
        }else if(day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")){
            System.out.println("Manual testing class");

        }else if(day.equalsIgnoreCase("thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("wrong day entered");
        }

    }
}
