class InvalidInvoiceFormatException extends Exception {
    public InvalidInvoiceFormatException(String message) {
        super(message);
    }
}


public class InvoiceGenerator {

    // Parse Invoice String
    public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        if (!input.contains("-")) {
            throw new InvalidInvoiceFormatException("Invalid format: Missing '-'");
        }

        String[] items = input.split(",");

        for (String item : items) {
            if (!item.contains("-")) {
                throw new InvalidInvoiceFormatException("Invalid item format: " + item);
            }
        }
        return items;
    }

    // Calculate Total Amount
    public static int getTotAmount(String[] tasks) throws InvalidInvoiceFormatException {
        int total = 0;

        for (String task : tasks) {
            String[] flag= task.split("-");

            if (flag.length < 2) {
                throw new InvalidInvoiceFormatException("Invalid task format: " + task);
            }

            String amountPart =flag[1].replaceAll("[^0-9]", "").trim();

            if (amountPart.isEmpty()) {
                throw new InvalidInvoiceFormatException("Amount missing in: " + task);
            }

            total += Integer.parseInt(amountPart);
        }
        return total;
    }

    // Main Method
    public static void main(String[] args) {
        String input = "Logo Design - 400 INR, Web Page - 459 INR";

        try {
            String[] tasks = parseInvoice(input);
            int totAmount = getTotAmount(tasks);

            System.out.println("Total Invoice Amount: " + totAmount + " INR");
        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
