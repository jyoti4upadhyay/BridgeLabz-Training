public class CreditCard {
    public static boolean isVisa(String card) {
        return card.matches("[1-9]{16}");
    }

    public static boolean isMasterCard(String card) {
        return card.matches("[1-9]{16}");
    }

    public static void main(String[] args) {
        System.out.println(isVisa("4123456789012345"));    // true
        System.out.println(isMasterCard("5123456789012345")); // true
    }
}