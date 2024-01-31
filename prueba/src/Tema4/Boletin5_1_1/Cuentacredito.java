package Tema4.Boletin5_1_1;

public class Cuentacredito extends Cuenta  {
    public static final double CREDITO_MAXIMO = 300;
    private  double credito;
    private final double limiteCreaditoUsuario;
    public static final double CREDITO_DEFAULT = 100;

    public Cuentacredito (double saldo, double credito) throws cuentacreaditoException{
        super(saldo);
        this.limiteCreaditoUsuario = credito;
        setCredito(credito);
    }

    public Cuentacredito(double credito) throws cuentacreaditoException {
        this.limiteCreaditoUsuario = credito;
        setCredito(credito);
    }
    public Cuentacredito(){
        this.limiteCreaditoUsuario = CREDITO_DEFAULT;
        this.credito = CREDITO_DEFAULT;
    }

    public double getCredito() {
        return credito;
    }

  private void setCredito(double credito)throws cuentacreaditoException {
        if (credito > CREDITO_MAXIMO){
            throw new cuentacreaditoException("Has superado el limite del credito admitido");
        }
        if (credito < 0){
            throw new cuentacreaditoException("No es valido el credito");
        }
        this.credito = credito;
    }

    @Override
    public void ingresarDinero(double dineroAIngresar) throws CuentaExeption {
        double diferenciaCreadito =  limiteCreaditoUsuario - credito;
        if (dineroAIngresar <= 0){
            throw new CuentaExeption("No puedes introducir una catidad negativa");
        }
        if (credito < limiteCreaditoUsuario){
           if (dineroAIngresar >= diferenciaCreadito){
               credito = limiteCreaditoUsuario;
               dineroAIngresar -= diferenciaCreadito;
           }else {
               credito += dineroAIngresar;
               dineroAIngresar = 0;
           }
        }
        if (dineroAIngresar > 0){
            super.ingresarDinero(dineroAIngresar);
        }
    }

    @Override
    public void SacarDinero(double dineroSacar) throws CuentaExeption {
       if(dineroSacar > getSaldo() + getCredito()){
           throw new CuentaExeption("Has llegado a tu limite de credito");
       }
       if (dineroSacar <= getSaldo()){
           super.SacarDinero(dineroSacar);
       }else{
           dineroSacar -= getSaldo();
           super.SacarDinero(getSaldo());
       }

    }
}
