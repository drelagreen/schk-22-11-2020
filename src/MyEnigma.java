import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MyEnigma {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        System.out.println("Введите какую строку хотите зашифровать:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);

        System.out.println("Введите ключ состоящий из 16 символов");

        Scanner scan = new Scanner(System.in);
        String keyLine = scan.nextLine();
        System.out.println(keyLine);
        Cipher cipher = Cipher.getInstance("AES");

        SecretKeySpec key = new SecretKeySpec(keyLine.getBytes(), "AES");

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encryptedBytes = cipher.doFinal(line.getBytes());

        System.out.println(new String(encryptedBytes));

        System.out.println("Хотите расшифровать? yes/no");

        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equals("yes")) {

            System.out.println("Введите ключ:");
            String newKey = scan.nextLine();
            System.out.println(newKey);

            SecretKeySpec newKeySpec = new SecretKeySpec(newKey.getBytes(), "AES");

            cipher.init(Cipher.DECRYPT_MODE, newKeySpec);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

            System.out.println(new String(decryptedBytes));

        } else {
            System.out.println("Досвидания");
        }


    }
}


