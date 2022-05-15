package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] token=sc.nextLine().split("\\s+");
        List<Birthable> birthables=new ArrayList<>();

        while (!token[0].equals("End")){


            if (token.length==5&&token[0].equals("Citizen")){
                Citizen citizen=new Citizen(token[1],Integer.parseInt(token[2]),token[3],token[4]);
                birthables.add(citizen);

            }else if(token.length==3&&token[0].equals("Pet")){
                Pet pet=new Pet(token[1],token[2]);
                birthables.add(pet);

            }else if (token.length==3&&token[0].equals("Robot")) {
                Robot robot = new Robot(token[1], token[2]);
            }
            token=sc.nextLine().split("\\s+");
        }

        String year=sc.nextLine();

        for (Birthable el:birthables) {
            if (el.getBirthDate().endsWith(year)){
                System.out.println(el.getBirthDate());
            }
        }


    }

}
