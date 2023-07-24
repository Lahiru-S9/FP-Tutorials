object CaesarCipher {

  // Function to encrypt a given plaintext with a specified shift
  def encrypt(plainText: String, shift: Int): String = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val n = alphabet.size
    plainText.map { char =>
      if (char.isLetter) {
        val isUpperCase = char.isUpper
        val shiftedChar = alphabet(alphabet.indexOf(char.toUpper) + shift)
        if (isUpperCase) shiftedChar else shiftedChar.toLower
      } else {
        char
      }
    }
  }

  // Function to decrypt a given ciphertext with a specified shift
  def decrypt(cipherText: String, shift: Int): String = {
    encrypt(cipherText, -shift)
  }

  // Function to apply either encryption or decryption based on the provided function
  def cipher(text: String, shift: Int, processFunc: (String, Int) => String): String = {
    processFunc(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "HELLO"
    val shift = 3

    val encryptedText = cipher(plaintext, shift, encrypt)
    val decryptedText = cipher(encryptedText, shift, decrypt)

    println("Original text: " + plaintext)
    println("Encrypted text: " + encryptedText)
    println("Decrypted text: " + decryptedText)
  }
}




