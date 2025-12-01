package util;

public class PrintMenu {
    private static final String HELP_MSG = """
            usage: CaesarCipher [ E ]  [ D ]  [ B ] [ H ] [ Q ]\n
            These are all CaesarCipher commands :
            E   Encrypt text from file
            D   Decrypt text from file
            B   Encrypt text from file (Using brute force method)
            H   Show this help message
            Q   Exit from the application\n
            """;

    public static void PrintHelpMsg() {
        System.out.println(HELP_MSG);
    }
}
