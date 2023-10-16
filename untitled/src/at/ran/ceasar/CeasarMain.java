package at.ran.ceasar;

public class CeasarMain {
    public static void main(String[] args) {
        String text = "abcd";
        String result = CeasarEncryption.doEncrypt(text);
        System.out.println(result);
    }
}
