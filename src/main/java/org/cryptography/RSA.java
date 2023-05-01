/*------------------Package-------------------*/
package org.cryptography;

/*------------------Imports-------------------*/

import java.security.KeyPair;
import java.security.KeyPairGenerator;

/*--------------------------------------------*/
public class RSA {

    private static final int KEY_SIZE = 2048;

    private static KeyPair generateKeyPair() throws Exception {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(KEY_SIZE);

        return keyPairGenerator.generateKeyPair();

    }
}