package exceptions;

public class StringNuloOrVacioException extends Exception {
    public StringNuloOrVacioException(String s) {
        super (s);
    }

    public StringNuloOrVacioException() {
        super ();
    }
}
