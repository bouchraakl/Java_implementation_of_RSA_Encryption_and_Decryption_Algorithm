# Java_implementation_of_RSA_Encryption_and_Decryption_Algorithm

This repository contains a Java implementation of the RSA encryption and decryption algorithm using the Java cryptography libraries.

The code generates a public and private key pair, encrypts a message using the public key, and decrypts the message using the private key.

## Usage:
To use the code, simply run the main method of the RSA class. This will generate a key pair, encrypt a message, and decrypt the message. The original message, encrypted message, and decrypted message will be printed to the console.

## Dependencies:

Java 1.8 or higher
Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files (download and installation instructions can be found on Oracle's website)
Description:
The RSA encryption algorithm is a widely used public-key cryptography algorithm that is used to secure data transmission over the internet. In the RSA algorithm, each user has a public key and a private key. The public key is used to encrypt data, while the private key is used to decrypt the data.

This implementation of the RSA algorithm uses the Java cryptography libraries to generate a public and private key pair, encrypt a message using the public key, and decrypt the message using the private key. The code uses the KeyPairGenerator class to generate the key pair and the Cipher class to create the encryption and decryption objects.

