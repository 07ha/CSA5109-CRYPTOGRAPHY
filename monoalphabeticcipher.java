public class monoalphabeticcipher {
        public static String monoalphabeticCipher(String plaintext, String key) {
            StringBuilder ciphertext = new StringBuilder();
    
            for (int i = 0; i < plaintext.length(); i++) {
                char character = plaintext.charAt(i);
    
                if (Character.isLetter(character)) {
                    char base = Character.isLowerCase(character) ? 'a' : 'A';
                    int index = Character.toUpperCase(character) - 'A';
                    char substitutedChar = key.charAt(index);
    
                    if (Character.isLowerCase(character)) {
                        ciphertext.append(Character.toLowerCase(substitutedChar));
                    } else {
                        ciphertext.append(substitutedChar);
                    }
                } else {
                    ciphertext.append(character);
                }
            }
    
            return ciphertext.toString();
        }
    
        public static void main(String[] args) {
            String plaintext = "Hello, World!";
            String cipherKey = "QWERTYUIOPASDFGHJKLZXCVBNM"; // You can use any permutation of the alphabet.
            String ciphertext = monoalphabeticCipher(plaintext, cipherKey);
            
            System.out.println("Original Text: " + plaintext);
            System.out.println("Cipher Text: " + ciphertext);
        }
    }
    
    

