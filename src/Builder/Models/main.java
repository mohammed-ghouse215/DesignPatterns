package Builder.Models;

public class main {
    public static void main(String[] args) throws Exception {
        Student s1 = Student.createHelper()
                .setName("Gouse")
                .setEmail_id("xyz@gmail.com")
                .setMobileNumber("123456")
                .setGraduated_year(2023)
                .setEntrance_Rank(11000)
                .build();
    }
}
