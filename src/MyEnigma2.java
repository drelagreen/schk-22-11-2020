import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MyEnigma2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите какой файл хотите зашифровать");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());

        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] arr1 = fileInputStream.readAllBytes();
        fileInputStream.close();

        System.out.println("Введите ключ состоящий из 16 символов");

        String keyLine = scanner.nextLine();
        System.out.println(keyLine);
        Cipher cipher = Cipher.getInstance("AES");

        SecretKeySpec key = new SecretKeySpec(keyLine.getBytes(), "AES");

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encryptedBytes = cipher.doFinal(arr1);

        File file1 = new File("encrypted.txt");
        file1.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(encryptedBytes);
        fileOutputStream.close();

        System.out.println("Хотите расшифровать? yes/no");

        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equals("yes")) {

            System.out.println("Введите ключ:");
            String newKey = scanner.nextLine();
            System.out.println(newKey);

            SecretKeySpec newKeySpec = new SecretKeySpec(newKey.getBytes(), "AES");

            cipher.init(Cipher.DECRYPT_MODE, newKeySpec);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

            File file2 = new File("decrypted.txt");
            FileOutputStream fileOutputDecryptedStream = new FileOutputStream(file2);
            fileOutputDecryptedStream.write(decryptedBytes);
            fileOutputDecryptedStream.close();

        } else {
            System.out.println("Досвидания");
        }


    }
}


