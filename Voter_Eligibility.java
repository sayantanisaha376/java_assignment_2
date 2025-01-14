//Create a class to check where a student is elligible 2 vote in an election by checking age.


class Student {
    private String name;
    private int age;

    // Constructor
	
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Method to check if the student is eligible to vote
    public boolean isEligibleToVote() {
        return age >= 18;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Eligible to vote: " + (isEligibleToVote() ? "Yes" : "No"));
    }
	
	
	public static void main(String[] args) {
        // Create a student object
        Student student = new Student("Sayantani", 21);

        // Display student details and voting eligibility
        student.displayDetails();
    }
}


