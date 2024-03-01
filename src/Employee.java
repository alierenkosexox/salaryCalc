public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    // Constructor Çalışan Methodu
    Employee (String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // vergi Hesabı
    public double tax(){
        double taxAmount = 0.0;
        if(this.salary > 1000 ) {
            taxAmount = this.salary*0.03;
        }
        return taxAmount;
    }

    // Maaş bonusunu hesapla
    public double bonus(){
        double bonusAmount = 0.0;
        if(this.workHours > 40){
            bonusAmount =(this.workHours-40.0)*30.0;
        }
        return bonusAmount;
    }

    // Maaş Artışı hesapşa
    public double raiseSalary(){
        int yearN = 2021;
        double raisedSalary = 0.0;
        if((yearN-hireYear) < 10){
            raisedSalary = (int) ( (this.salary*0.05));
        } else if ((yearN-hireYear) < 9 &&  (yearN-hireYear) < 20) {
            raisedSalary = (int) ((this.salary*0.1));
        } else if ((2021-hireYear) > 19) {
            raisedSalary = (int) ((this.salary*0.15));
        }
        return raisedSalary;
    }

    // Çalışan bilgilerini yazdır
    public void printEmployee(){
        // Maaşları Hesapla
        double salaryTaxBonus = this.salary-tax()+bonus();
        double totalSalary = salaryTaxBonus+raiseSalary();

        // Sonuçları Yazdır
        System.out.println("Name: " + this.name );
        System.out.println("Salary: " + this.salary);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus() );
        System.out.println("Salary Increment: " + raiseSalary() );
        System.out.println("Salary includes tax and bonus: " + salaryTaxBonus);
        System.out.println("Total Salary: " + totalSalary );
    }

}