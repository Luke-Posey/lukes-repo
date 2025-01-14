


import java.util.*;
class Movie_List {
    public static void main(String[] args) {
        // scanner for user input
        Scanner scanner = new Scanner(System.in);
        // list for storing data
        List<String> list = new ArrayList<>();
        // user choice
        String end;
        // number to remove in the list under remove
        int number;
        // the loop, states the options and input every time.
        while(true) {
            System.out.println("There are 4 commands.\nAdd, Remove, List, Quit.\nWhat would you like to do?: ");

            end = scanner.nextLine();

            end = end.toLowerCase();
            // to add, get user input and then add it to the list
            if (end.equals("add")) {

                System.out.println("Enter what you would like to add: ");

                end = scanner.nextLine();

                list.add(end);
            }
            // to remove, display the items in the list, and then have the user choose an int that is linked to movie
            else if (end.equals("remove")) {

                int i = 1;
                // print out all values with a number before it
                for(String s : list) {

                    System.out.print(i);

                    System.out.print(" ");

                    System.out.println(s);

                    i++;
                }
                // user input for an int to remove
                System.out.println("Enter the number of the movie you would like to remove; ");

                number = scanner.nextInt();
                scanner.nextLine();
                number = number - 1;

                // if the number is outside list range print error
                if(number < 0 || number >= list.size()) {
                    System.out.println("That is not a valid movie number");
                }
                // otherwise remove
                else {
                    list.remove(number);

                }

            }
            // list the items in the list with a number in front of each using a for loop
            else if (end.equals("list")) {

                int i = 1;

                for (String s : list) {

                    System.out.print(i);

                    System.out.print(" ");

                    System.out.println(s);

                    i++;
                }
            }
            // if user input = "quit", break the loop and then end program.
            else if (end.equals("quit")) {

                break;
            }
            // if none of the above options, make them choose again.
            else{

                System.out.println("That is not a valid command");
            }
        }
    }
}