public static void main(String[] args) {
        // URL of the Gettysburg address text file
        String url = "http://cs.armstrong.edu/liang/data/Lincoln.txt";

        try {

        URL addressUrl = new URL;
        BufferedReader reader = new BufferedReader;

        String line;
        int wordCount = 0;


        while ((line = reader.readLine()) != null) {

        String[] words = line.split(" ");

        wordCount += words.length;
        }

        reader.close();

        System.out.println("The Gettysburg Address has " + wordCount + " words.");

        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        System.exit(1);
        }
        }
        }