import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks1, marks2, marks3;
    void acceptDetails(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks 1: ");
        marks1 = sc.nextDouble();
        System.out.print("Enter Marks 2: ");
        marks2 = sc.nextDouble();
        System.out.print("Enter Marks 3: ");
        marks3 = sc.nextDouble();
    }
    double calculateTotal() {
        return marks1 + marks2 + marks3;
    }
    double calculatePercentage() {
        return calculateTotal() / 3;
    }
    char calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90)
            return 'P'; // A+
        else if (percentage >= 80)
            return 'A';
        else if (percentage >= 70)
            return 'B';
        else if (percentage >= 60)
            return 'C';
        else if (percentage >= 50)
            return 'D';
        else
            return 'F';
    }
    void displayResult() {
        double total = calculateTotal();
        double percentage = calculatePercentage();
        System.out.println("\n----- Student Result -----");
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Marks 1     : " + marks1);
        System.out.println("Marks 2     : " + marks2);
        System.out.println("Marks 3     : " + marks3);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        double p = percentage;
        if (p >= 90)
            System.out.println("Grade       : A+");
        else if (p >= 80)
            System.out.println("Grade       : A");
        else if (p >= 70)
            System.out.println("Grade       : B");
        else if (p >= 60)
            System.out.println("Grade       : C");
        else if (p >= 50)
            System.out.println("Grade       : D");
        else
            System.out.println("Grade       : F");
    }
}
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Enter details for Student 1:");
        s1.acceptDetails(sc);
        System.out.println("\nEnter details for Student 2:");
        s2.acceptDetails(sc);
        s1.displayResult();
        s2.displayResult();
        sc.close();
    }
}