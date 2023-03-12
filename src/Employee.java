public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    String age;

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public Employee(String fullName, String position, String email, String phoneNumber, String age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ПІБ: " + fullName + ". ");
        System.out.println("Посада: " + position + ". ");
        System.out.println("Email: " + email + ". ");
        System.out.println("Номер телефону: " + phoneNumber + ". ");
        System.out.println("Вік: " + age + ". ");
    }

    public static void main(String[] args) {
        var employee = new Employee("Alex Stone", "manager", "alex@gmail.com", "0987654", "35");
        employee.printInfo();
    }
}
