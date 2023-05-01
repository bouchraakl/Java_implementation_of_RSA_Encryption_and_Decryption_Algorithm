/*------------------Package-------------------*/
package org.cryptography;

/*------------------Imports-------------------*/

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;

/*--------------------------------------------*/
public class RSA {

    private static final int KEY_SIZE = 2048;

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

}