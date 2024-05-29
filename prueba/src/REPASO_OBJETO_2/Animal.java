package REPASO_OBJETO_2;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private static int contId = 1;
    private int idAnimal;
    private Tanimales tipoAnimales;
    private int edad;
    private List<Alimentacion> alimentacion;
    private List<ChequeoSalud> chequeoSalud;

    public Animal(Tanimales tipoAnimales, int edad) throws AnimalException {
        this.idAnimal = contId++;
        this.tipoAnimales = tipoAnimales;
        setEdad(edad);
        this.alimentacion = new ArrayList<>();
        this.chequeoSalud = new ArrayList<>();
    }

    public int getEdad() {
        return edad;
    }

    public Tanimales getTipoAnimales() {
        return tipoAnimales;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void registroAlimentacion(Alimentacion.TipoAlimentacion a) {
        alimentacion.add(new Alimentacion(a));
    }

    public void registroChequeoSalud(ChequeoSalud.EstadoSalud salud) {
        chequeoSalud.add(new ChequeoSalud(salud));
    }

    public void setEdad(int edad) throws AnimalException {
        if (edad < 0) {
            throw new AnimalException("Edad incorrecta");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("edad=").append(edad);
        sb.append(", tipoAnimales=").append(tipoAnimales);
        sb.append(", idAnimal=").append(idAnimal);
        sb.append('}');
        return sb.toString();
    }
}
