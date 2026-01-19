public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Contact cnt1 = new Contact("Jyoti", "Upadhyay", "MaholiRoad", "Mathura", "UP", "281406", "84452xxxxx", "jyoti123@gmail.com");
        Contact cnt2 = new Contact("Vipul", "Upadhyay", "Township", "Mathura", "UP", "281006", "94562xxxxx", "vipul123@gmail.com");
        AddNewContact addContact = new AddNewContact(cnt1);

        addContact.addContact();
        addContact.display();

        addContact.edit("Jyoti", "Upadhyay", "Shadra", "Agra", "UP", "210421", "9876xxxxx", "jyoti678@gmail.com");
        addContact.display();

        System.out.println("After deletion");
        addContact.deleteContact("Jyoti", "Upadhyay");
        addContact.display();
    }
}
