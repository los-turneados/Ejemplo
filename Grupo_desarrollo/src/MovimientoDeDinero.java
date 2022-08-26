public class MovimientoDeDinero {

    private double monto;
    private double montopositivo;
    private double montonegativo;
    private String conceptoDelMovimiento;
    private String usuario;

    public MovimientoDeDinero(double monto, double montopositivo,double montonegativo, String conceptoDelMovimiento,String usuario){
        this.monto= monto;
        this.montopositivo = montopositivo;
        this.montonegativo = montonegativo;
        this.conceptoDelMovimiento = conceptoDelMovimiento;
        this.usuario = usuario;
    }
    public MovimientoDeDinero(){

    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMontopositivo() {
        return montopositivo;
    }

    public void setMontopositivo(double montopositivo) {
        this.montopositivo = montopositivo;
    }

    public double getMontonegativo() {
        return montonegativo;
    }

    public void setMontonegativo(double montonegativo) {
        this.montonegativo = montonegativo;
    }

    public String getConceptoDelMovimiento() {
        return conceptoDelMovimiento;
    }

    public void setConceptoDelMovimiento(String conceptoDelMovimiento) {
        this.conceptoDelMovimiento = conceptoDelMovimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void RegistrarIngresos(){
        monto = monto + montopositivo;

    }

    public void RegistrarEgresos(){
        monto = monto - montonegativo;
    }

}
