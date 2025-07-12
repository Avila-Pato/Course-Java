package javaCourse.Calculadora.java;

public class CalculadoraException extends Exception {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CalculadoraException(String message, String description) {
        super(message);
        this.description = description;
    }

    public CalculadoraException(String message) {
        super(message);
    }
}
