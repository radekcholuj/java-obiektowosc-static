public class Generator {

    public static String text(int size){
        String chars = "abcdasdfasjajkldfalsdfefgahsdfasdfijklmnopqrstz";

        int min = 0;
        int max = chars.length()-1;

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < size; i++) {

            // losowanie znaku
            int index = (int)(Math.random()*(max-min)) + min;
            char c = chars.charAt(index);

            text.append(c);
        }

        return text.toString();

    }
}
