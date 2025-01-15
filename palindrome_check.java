// Create a java class that will check whether a person's name is palindrome or not.
//@Author:Sayatani Saha



class Person {
    private String name;

    // Getter and Setter methods
    public String getName() {
        return this.name;
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
        Person person = new Person();
        person.setName("sayantani");

        // Display whether the person's name is a palindrome
        person.displayPalindromeCheck();
    }
}

