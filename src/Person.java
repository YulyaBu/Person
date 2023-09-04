public class Person {

        private String name;

        private String middleName;

        private String familyName;

        private String age;
        private int yearOfBirth;

        public static final int MIN_AGE = 15;
        public int getYearOfBirth() { return yearOfBirth; }

        public Person(String name, String middleName, String familyName, String age, int yearOfBirth) {

            this.name = name;
            this.middleName = middleName;
            this.familyName = familyName;
            this.age = age;
            this.yearOfBirth = yearOfBirth;
        }

        public static int getMinAge() { return MIN_AGE; }

        public String getName() { return name; }

        public void setName(String name) {
            if (!(name.length() ==0 )) {
                this.name = name;
                System.out.println("Имя было изменено");
            }

        }

        public String getMiddleName() { return middleName; }

        public void setMiddleName(String middleName) { this.middleName = middleName; }

        public String getFamilyName() { return familyName; }

        public void setFamilyName(String familyName) { this.familyName = familyName; }

        public String getAge() { return age; }

        public void setAge(String age) { this.age = age; }




        @Override
        public String toString() {
            return "{" + familyName + " " + name +middleName + "}";
        }

        public void printName() {
            System.out.println("Name = " + name);
        }

    }



