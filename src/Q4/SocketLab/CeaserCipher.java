package Q4.SocketLab;

public class CeaserCipher {
    public static String encrypt(String input, int offset) {
        String cipher = "";
        for (char c : input.toCharArray()) {
            cipher += (char) (c + offset);
        }
        return cipher;
    }

     public static String decrypt(String input, int offset) {
        return encrypt(input, -offset);
     }
}
