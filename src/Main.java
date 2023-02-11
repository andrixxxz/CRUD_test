import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<String> todos = new ArrayList<>();


    // create - c
    public void create(String todo) {todos.add(todo);
    }

    // read - r
    public void read() {
        for (String todo : todos) {
            System.out.println(todo);
        }
    }

    // update - u
    public void update(int index, String newTodo) {
        todos.set(index, newTodo);
    }

    // delete - d
    public void delete(int index) {
        todos.remove(index);
    }


    public static void main(String[] args) {

        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        main.todos.add("bungas");
        main.create("kokle");
        main.todos.add("klavieres");
        System.out.println("Welcome");
        boolean turpinat = true;
        while (turpinat == true){


            System.out.println("Kādu funkciju vēlies veikt?: c = create, r = read, d = delete, u = update)");
            System.out.println("Lai beigtu darbu izvēlies e = exit");
            String usr_izvēle = scan.nextLine();


            switch (usr_izvēle) {
                case "c":
                    System.out.println("Ka Tu gribi ievadīt");
                    String usr_todo = scan.nextLine();
                    main.create(usr_todo);
                    break;
                case "r":
                    main.read();
                    break;
                case "u":
                    System.out.print("Kuru vārdu vēlies aizvietot?: ");
                    int usr_upd = scan.nextInt();
                    System.out.print("Ievadi jauno vārdu" );
                    String usr_upd2 = scan.next();
                    main.update(usr_upd,usr_upd2);
                    System.out.println("Vārds nomainīts");
                    break;
                case "d":
                    System.out.println("Kuru vārdu vēlies izdzēst?");
                    int usr_del = scan.nextInt();
                    main.delete(usr_del);
                    System.out.println("Vārds izdzēsts");
                    break;
                default:
                    System.out.println("Nepareiza izvēle");
            }
            //end loop
            if (usr_izvēle.equals("e"))turpinat = false;



        }
        System.out.println("Bye Bye");

    }



}