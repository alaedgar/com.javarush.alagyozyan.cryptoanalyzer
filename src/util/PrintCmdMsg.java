package util;

import service.Cipher;

public class PrintCmdMsg {
    private static final String HELP_MSG = """
            usage: CaesarCypher [ E ]  [ D ]  [ B ] [ H ] [ Q ]
            These are all CaesarCypher application menu options :\n
            E   Encrypt text from file
            D   Decrypt text from file
            B   Encrypt text from file (Using brute force method)
            H   Show this help message
            Q   Exit from the application""";
    private static final String WELCOME_MSG = """
            \n****************************************************
            *** Welcome to the 'Caesar Cypher' application ! ***
            ****************************************************\n
            Please enter [ H ] to see all available menu options.""";
    private static final String EXIT_MSG = "Exiting...";
    private static final String ENTER_INPUT_FILE_MSG = "Please Enter input file path: ";
    private static final String ENTER_OUTPUT_FILE_MSG = "Please Enter output file path: ";
    private static final String ENTER_KEY_VALUE_MSG = """
            Please provide encryption key. 
            NOTE 1: For Russian text, key value must be in 1 - """ +
            " " + (Cipher.rusAlphabetLength - 1) + " " + """
             range.\nNOTE 2: For English text, key value must be in 1 - """ +
            " " + (Cipher.engAlphabetLength - 1) + " " + """
             range.
             Please enter encryption key:""";

        private static final String START_ENCRYPTING_MSG = "Starting ";


    public static void printHelpMsg() {
        System.out.println(HELP_MSG);
    }

    public static void printWelcomeMsg() {
        System.out.println(WELCOME_MSG);
    }

    public static void printExitMsg() {
        System.out.println(EXIT_MSG);
    }

    public static void printEnterInputFileMsg() {
        System.out.print(ENTER_INPUT_FILE_MSG);
    }

    public static void printEnterOutputFileMsg() {
        System.out.print(ENTER_OUTPUT_FILE_MSG);
    }

    public static void printEnterKeyMsg() {
        System.out.print(ENTER_KEY_VALUE_MSG);
    }
}
