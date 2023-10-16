package at.ran.ceasar;

public class CeasarEncryption {

    public static String doEncrypt(String data){
        char[] inputArray = data.toCharArray();
        char[] outputArray = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            char character = inputArray[i];
            character +=1;
            outputArray[i] = character;

        }
        return new String(outputArray);
    }
}
