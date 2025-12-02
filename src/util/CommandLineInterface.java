package util;

import java.util.Scanner;

public class CommandLineInterface {

    private final Scanner SCANNER;

    public CommandLineInterface() {
        this.SCANNER = new Scanner(System.in);
    }

    public void startApp() {
        PrintCmdMsg.printWelcomeMsg();
        boolean isExit = false;
        while (!isExit) {
            try {
                MenuOption option = MenuOption.fromString(SCANNER.nextLine());
                switch (option) {
                        case MenuOption.E : {
                            PrintCmdMsg.printEnterInputFileMsg();
                            PrintCmdMsg.printEnterOutputFileMsg();
                            PrintCmdMsg.printEnterKeyMsg();
                            break;
                        }
                        case MenuOption.D : {
                            break;
                        }
                        case MenuOption.B : {
                            break;
                        }
                    case MenuOption.H : {
                        PrintCmdMsg.printHelpMsg();
                        break;
                    }
                    case MenuOption.Q : {
                        PrintCmdMsg.printExitMsg();
                        isExit = true;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
