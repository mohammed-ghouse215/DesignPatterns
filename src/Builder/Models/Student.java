package Builder.Models;

import Builder.ExceptionHandling.InvalidNameException;

public class Student {
    private String name;
    private String mobileNumber;
    private String email_id;
    private int graduated_year;
    private int Entrance_Rank;
    /*
     usecase
     Student name,email,mobilenumber should not be null;
     Student graduated_year should be between 2022 and 2025;
     Student entrance_Rank between 10000 and 25000;
     Builder helps you to make this checks without creating objects
     by using a helper class
     step1 : create a static method in main class which creates builder object
     step2 : create a static class with same main class attributes
     step3 : make setter assign and return same object in setter
     step4 : create build method which validate all the required attributes and after returns
            a main class object
     */
     public static Helper createHelper(){
         return new Helper();
     }
    static class Helper{
        private String name;
        private String mobileNumber;
        private String email_id;
        private int graduated_year;
        private int Entrance_Rank;

        public Helper setName(String name) {
            this.name = name;
            return this;
        }

        public Helper setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Helper setEmail_id(String email_id) {
            this.email_id = email_id;
            return this;
        }

        public Helper setGraduated_year(int graduated_year) {
            this.graduated_year = graduated_year;
            return this;
        }

        public Helper setEntrance_Rank(int entrance_Rank) {
            Entrance_Rank = entrance_Rank;
            return this;
        }

        public String validate() throws Exception{
            if((this.name==null)||(this.name.equals(""))){
                throw new InvalidNameException("Student's name should not be null");
            }
            if((this.email_id==null)||(this.email_id.equals(""))){
                throw new InvalidNameException("Student's Email should not be null");
            }
            if((this.mobileNumber==null)||(this.mobileNumber.equals(""))){
                throw new InvalidNameException("Student's Mobile number should not be null");
            }
            if((this.graduated_year<=2021)){
                throw new InvalidNameException("Student's GradYear should be after 2021");
            }
            if((this.Entrance_Rank<=10000)||(this.Entrance_Rank>=25000)){
                throw new InvalidNameException("Student's Entrance Rank should be  between 10000 and 25000");
            }
            return "all good";
        }
        public Student build() throws Exception{
            if(this.validate().equals("all good")){
                return new Student();
            }
            return null;
        }

    }
}
