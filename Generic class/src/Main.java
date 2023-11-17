// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

        public class Main {
            public static void main(String[] args) {
                // Create a repository for integers
                DataRepository<Integer> intRepository = new DataRepository<>();
                intRepository.setData(42);
                int intData = intRepository.getData();
                System.out.println("Integer Data: " + intData);

                // Create a repository for strings
                DataRepository<String> stringRepository = new DataRepository<>();
                stringRepository.setData("Hello, Generics!");
                String stringData = stringRepository.getData();
                System.out.println("String Data: " + stringData);
            }
        }


