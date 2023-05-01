/*------------------Package-------------------*/
package org.cryptography;

/*------------------Imports-------------------*/

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

/*--------------------------------------------*/
public class RSA {

    private static final int KEY_SIZE = 2048;

    public static void main(String[] args) throws Exception {
        KeyPair keyPair = generateKeyPair();

        String originalMessage = "Mensagem original para ser criptografada.";
        byte[] encryptedMessage = criptografar(originalMessage, keyPair.getPublic());
        String dycriptedMessage = descriptografar(encryptedMessage, keyPair.getPrivate());

        System.out.println("Mensagem original: " + originalMessage);
        System.out.println("Mensagem criptografada: " + new String(encryptedMessage, "UTF-8"));
        System.out.println("Mensagem descriptografada: " + dycriptedMessage);

    }


    private static KeyPair generateKeyPair() throws Exception {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(KEY_SIZE);

        return keyPairGenerator.generateKeyPair();

    }

    private static byte[] criptografar(String message, PublicKey publicKey) throws Exception {

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        return cipher.doFinal(message.getBytes());

    }

    private static String descriptografar(byte[] messageEncripted, PrivateKey privateKey) throws Exception {

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        byte[] bytesDescripted = cipher.doFinal(messageEncripted);

        return new String(bytesDescripted);
    }

}