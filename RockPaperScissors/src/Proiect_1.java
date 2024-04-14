import java.util.Scanner;
//Piatra Hartie Foarfece
public class Proiect_1 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("Daca nu vrei sa mai joci,doar scrie\"Stop\" ! ");
        System.out.print("Alege miscarea:Piatra,Hartie sau Foarfece!\n");
        String miscareJucator = input.nextLine();

        if(miscareJucator.equals("Stop")){
            System.out.println("Multumesc pentru ca ai jucat!");
            break;
        }
        if (!miscareJucator.equals("Piatra") && !miscareJucator.equals("Hartie") && !miscareJucator.equals("Foarfece")) {
            System.out.println("Te rog alege o miscare");
        } else {
            int random = (int) (Math.random() * 3);
            String miscareOponent = " ";
            if (random == 0) {
                miscareOponent = "Piatra";
            } else if (random == 1) {
                miscareOponent = "Hartie";
            } else if (random == 2) {
                miscareOponent = "Foarfece";
            }
            System.out.println("Calculatorul a ales: " + miscareOponent + "!");

            //castig ?
            if (miscareJucator.equals(miscareOponent)) {
                System.out.println("Egalitate!");
            } else if (miscareJucator.equals("Piatra") && miscareOponent.equals("Foarfece") || miscareJucator.equals("Hartie") && miscareOponent.equals("Piatra") || miscareJucator.equals("Foarfece") && miscareOponent.equals("Hartie")) {
                System.out.println("Jucatorul a castigat!");
            } else {
                System.out.println("Calculatorul a castigat!");
            }
        }
    }




    }

}
