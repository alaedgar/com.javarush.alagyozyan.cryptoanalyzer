package util;

public enum MenuOption {

    E,
    D,
    B,
    H,
    Q;

    private static final String EXCEPTION_MSG =
            "Exception: Non valid Menu option entered: ";
    private static final String TRY_AGAIN_MSG =
            "\nPlease try again or enter [ H ] to see Help menu.";

    public static MenuOption fromString(String option) {
        return switch (option) {
            case "E" -> E;
            case "D" -> D;
            case "B" -> B;
            case "H" -> H;
            case "Q" -> Q;
            default ->
                    throw new IllegalArgumentException(EXCEPTION_MSG + option
                            + TRY_AGAIN_MSG);
        };
    }
}
