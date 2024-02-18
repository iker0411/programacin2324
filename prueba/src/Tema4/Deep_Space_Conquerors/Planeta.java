package Tema4.Deep_Space_Conquerors;


import java.util.Map;

public class Planeta {
    public static final int UNIDADES_PIEDRA= 5;
    public static final int UNIDADES_HIERRO = 4;
    public static final int UNIDADES_COMBUSTIBLE = 2;
    public static final int HABITANTES_PLANETA = 30;
    public static final int NUMERO_MAXIMO_MINAS = 10;

    public static final int EscudoProtector = 20;
    private String nombre;
    private boolean conquistado;
    private String conquistador;
    private int habitantes;
    private int minas;
    private int piedra;
    private int hierro;
    private int combustible;
    private int escudo;

    public Planeta(String nombre,  boolean conquistado, String conquistador,int minas, int habitantes, int piedra, int hierro, int combustible, int escudo) {
        this.nombre = nombre;
        this.conquistado = false;
        this.conquistador = null;
        this.minas= NUMERO_MAXIMO_MINAS;
        this.habitantes = HABITANTES_PLANETA;
        this.piedra = UNIDADES_PIEDRA;
        this.hierro = UNIDADES_HIERRO;
        this.combustible = UNIDADES_COMBUSTIBLE;
        this.escudo = escudo;
    }

    public void setMina(int mina) throws PlanetaEception {
        if (mina > NUMERO_MAXIMO_MINAS ) {
            throw new PlanetaEception("No puede generar mas de 10 minas");
        }
        if (mina < 0){
            throw new PlanetaEception("No puede generar un numero negativo de minas ");

        }

        this.minas = NUMERO_MAXIMO_MINAS;
    }

    public void setPiedra(int piedra) throws PlanetaEception {
        if (piedra < UNIDADES_PIEDRA){
            throw new PlanetaEception("No puede generar menos piedras de lo inicial");
        }
        this.piedra = UNIDADES_PIEDRA;
    }

    public void setHabitantes(int habitantes) throws PlanetaEception {
        if (habitantes < HABITANTES_PLANETA){
            throw new PlanetaEception("No puede generar menos del numero indicado de habitantes por planeta desde el  inicio");
        }

        this.habitantes = HABITANTES_PLANETA;
    }

    public void setHierro(int hierro) throws PlanetaEception {
        if (hierro < UNIDADES_HIERRO){
            throw  new PlanetaEception("No puede generar menos hierro por planeta desde el  inicio ");
        }

        this.hierro = UNIDADES_HIERRO;
    }

    public void setCombustible(int combustible) throws PlanetaEception {
        if (combustible < UNIDADES_COMBUSTIBLE){
            throw new PlanetaEception("Al inicio no puede generarse menos combustible en cada planeta");
        }
        this.combustible = UNIDADES_COMBUSTIBLE;
    }

    public void setEscudo(int escudo) throws PlanetaEception {
        if (escudo == 0 ){
            throw new PlanetaEception("Ha desaparecido el escudo del planeta ");
        }
        if (escudo < 0){
            throw new PlanetaEception("No puede generar un  numero negativo del escudo");
        }
        if ( escudo < EscudoProtector){
            throw new PlanetaEception("No puedes recibir al inicio más puntos de escudo");
        }
        this.escudo = EscudoProtector;
    }


    public void conquitar(String conquistador){
        this.conquistado = true;
        this.conquistador = conquistador;
    }
    public void imprimir(){
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Está conquistado:  " + (conquistado ? "Si" : "No"));
        if (conquistado){
            System.out.println("Conquistado por: " + conquistador);
        }
        System.out.println("Número de habitantes: " + habitantes);
        System.out.println("Materias primas en el planeta: " +  "Piedra: " + piedra + " Hierro: " + hierro + " Combustible: " + combustible);
        System.out.println("Minas actuales: " + minas+ " tiene 10 minas cada turno");
        System.out.println("Escudo protector: " + escudo + " puntos de defensa de restante");
    }
}
