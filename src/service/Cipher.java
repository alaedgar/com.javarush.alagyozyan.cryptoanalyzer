package service;

public class Cipher {

    private static final char[] RU_ALPHABET = {
            'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к',
            'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
            'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я'
    };
    private static final char[] EN_ALPHABET = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z'
    };

    private static final char[] SYMBOLS_ALPHABET = {
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            '.', ',', '«', '»', '"', ':', '!', '?', ';', '-',
            '>', '<', '@', '$', '%', '&', ')', '(', ' ', '\'',
    } ;

    public static int rusAlphabetLength = RU_ALPHABET.length;
    public static int engAlphabetLength = EN_ALPHABET.length;

    public String encrypt(String text, int shift) {
        // Логика шифрования
        return null;
    }

    public String decrypt(String encryptedText, int shift) {
        // Логика расшифровки
        return null;
    }
}

