public class Question7 {
    public static void main(String[] args) {
        String fileName = "Heba.txt";
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File " + fileName + " created.");
            }

        }
        for (int i = 0; i < 100; i++) {
            int randomInt = (int) (Math.random() * 1000); // Generate random integer between 0 and 999
            writer.write(Integer.toString(randomInt));
        }
        writer.close();
        System.out.println("100 integers written to " + fileName + ".");

