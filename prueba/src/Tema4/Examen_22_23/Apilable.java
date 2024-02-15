package Tema4.Examen_22_23;

public interface Apilable {
    public default void apilar(Juguete juguete) throws JugueteException{
        if (!(juguete instanceof  Apilable)){
            throw new JugueteException("El juguete no es apilable");
        }
        if (juguete == this){
            throw new JugueteException("No te puedes aplar contigo mismo");

        }
        if (juguete.getClass() != this.getClass()){
            throw new JugueteException("No puedo apilar un juguete de tipo " + juguete.getClass().getSimpleName() + " con un juguete de tipo " + this.getClass().getSimpleName());
        }
    }
}
