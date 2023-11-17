// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//public class Main {
   // public static void main(String[] args) {

        public class Main {
            static final String[] sizes = {"Small", "Medium", "Large"};

            public static void main(String[] args) {
                // Same Customer for all
                String customerName = "John Doe";
                String phoneNumber = "+31612345678";

                // Small pizza
                printOrder((byte) 0, 7.99F, (byte) 6, false, customerName, phoneNumber);

                // Medium pizza
                printOrder((byte) 1, 10.99F, (byte) 8, true, customerName, phoneNumber);

                // Large pizza
                printOrder((byte) 2, 13.99F, (byte) 10, false, customerName, phoneNumber);
            }

            private static void printOrder(byte size, float price, byte slices, boolean isVegetarian, String customerName, String customerPhone) {
                System.out.printf(
                        """
                        Pizza Order Details:
                        Size: %s
                        Price: $%.2f
                        Slices: %d
                        Vegetarian: %s
                        Customer Name: %s
                        Phone Number: %s
                                                
                        """, humanReadableSize(size), price, slices, humanReadableBoolean(isVegetarian), customerName, customerPhone
                );
            }

            public static String humanReadableSize(byte size) {
                byte safeSize = (byte) Math.max(size, 0);
                if (size > sizes.length - 1) {
                    safeSize = (byte) (sizes.length - 1);
                }
                return sizes[safeSize];
            }

            private static String humanReadableBoolean(boolean bool) {
                return bool ? "Yes" : "No";
            }

        }


