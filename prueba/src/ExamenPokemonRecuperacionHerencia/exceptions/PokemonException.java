package ExamenPokemonRecuperacionHerencia.exceptions;

public class PokemonException extends  Exception{
    public PokemonException() {
        super();
    }

    public PokemonException(String message) {
        super(message);
    }

    public PokemonException(String message, Throwable cause) {
        super(message, cause);
    }

    public PokemonException(Throwable cause) {
        super(cause);
    }

    protected PokemonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
