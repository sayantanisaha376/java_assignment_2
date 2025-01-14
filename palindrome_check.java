class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter and Setter 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Method to check if the name is a palindrome
    public boolean isPalindrome() {
        // remove spaces and convert to lowercase
        String finalName = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != ' ') {
                finalName += Character.toLowerCase(c);
            }
        }

        int length = finalName.length();
        for (int i = 0; i < length / 2; i++) {
            if (finalName.charAt(i) != finalName.charAt(length - 1 - i)) {
                return false; // If characters do not match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }

    // Method to display whether the name is a palindrome
    public void displayPalindromeCheck() {
        System.out.println("Name: " + name);
        if (isPalindrome()) {
            System.out.println("Is palindrome: Yes");
        } else {
            System.out.println("Is palindrome: No");
        }
    }
	
	
    public static void main(String[] args) {
        // Create a person object
        Person person = new Person("sayantani");

        // Display whether the person's name is a palindrome
        person.displayPalindromeCheck();
    }
}
