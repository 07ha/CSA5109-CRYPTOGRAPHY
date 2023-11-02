public class caesarcipher {
    public static String caesarcipher(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (Character.isLetter(character)) {
                char base = (Character.isLowerCase(character)) ? 'a' : 'A';
                char shiftedChar = (char)(((character - base + shift) % 26) + base);
                result.append(shiftedChar);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String plaintext = "hari!";
        int shift = 3;  // You can change the value of 'shift' to any number from 0 to 25 for different shifts.
        String cipherText = caesarcipher(plaintext, shift);
        
        System.out.println("Original Text: " + plaintext);
        System.out.println("Cipher Text: " + cipherText);
    }
}
