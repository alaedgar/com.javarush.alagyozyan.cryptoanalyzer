package util;

public class Cipher {

    private static final char[] ALPHABET_RUS = {'а', 'б', 'в', 'г', 'д',
            'е', 'ё', 'ж', 'з', 'и', 'й','к', 'л', 'м', 'н', 'о', 'п', 'р',
            'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь',
            'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '
    };
    private static final char[] ALPHABET_ENG = {'a', 'b', 'c', 'd', 'e',
            'f', 'g', 'h', 'i', 'j', 'k','l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '«',
            '»', '"', '\'', ':', '!', '?', ' '
    };

    public String encrypt(String text, int shift) {
        // Логика шифрования
        return null;
    }

    public String decrypt(String encryptedText, int shift) {
        // Логика расшифровки
        return null;
    }
}

