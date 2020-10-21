import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        int id;
        String name;
        double fees;
        boolean isScholar;

        // ---------------------------Taking value from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student Information");

        System.out.print("id: ");
        id = scanner.nextInt();


        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Fees: ");
        fees = scanner.nextDouble();

        System.out.print("isScholar: ");
        isScholar = scanner.nextBoolean();
        //-----------------------------------------------------

        Student stu1 = new Student(4, "Rehan", 5000, true);
        Student stu2 = new Student(id, name, fees, isScholar);

        //----------------------------------------

//        stu1.displayStudent();
//
//        System.out.println("Student information after updating his fees");
//
//        stu1.setFees(2000);
//        stu1.displayStudent();
        //------------------------------------

        System.out.println("Enter Student Information:");

        if(stu1.getFees()> stu2.getFees())
        {
            System.out.println(stu1.toString());

        }
        else if(stu1.getFees()==stu2.getFees())
        {

            System.out.println(stu1.toString());
            System.out.println(stu2.toString());


        }else{
            System.out.println(stu2.toString());
        }






    }
}
