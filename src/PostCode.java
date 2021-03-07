public class PostCode {
    public static String postcode (int size){
        String numbers = "0123456789";

        int min = 0;
        int max = numbers.length()-1;

        StringBuilder postcode = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i == 2){
                String c = "-";
                postcode.append(c);
            } else {
                int index = (int) (Math.floor(Math.random()*(max-min+1)+min));
                char c = numbers.charAt(index);
                postcode.append(c);
            }
        }
        return postcode.toString();
    }
}

