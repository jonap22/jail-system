
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junio
 */
public class PresoCumpliendoCondena extends Preso{
    //Variables
    private String carcelAnterior;
    private String motivo;    
    
    //Métodos
    public String reasignacionCarcel(String carcelAnterior,String motivo){
    return "El preso se encontraba en la carcel "+carcelAnterior+" pero se lo va a reasignar a otro centro por el siguiente motivo:"+motivo;
    }
    
    //Get
    public String getCarcelanterior() {
        return carcelAnterior;
    }
    
    //Set
    public void setCarcelanterior(String carcelanterior) {
        this.carcelAnterior = carcelanterior;
    }

    @Override
    protected String arresto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    //Constructor clase padre
    public PresoCumpliendoCondena(String nombre, String apellido, 
            String nacionalidad, int documentoDeIdentidad, 
            Date fechaDeNacimiento, Date fechaDeIngreso, 
            boolean reincidencia, boolean estadoDeSentencia, 
            int nivelDePeligrosidad, String delito) {
        super(nombre, apellido, nacionalidad, documentoDeIdentidad, 
                fechaDeNacimiento, fechaDeIngreso, reincidencia, 
                estadoDeSentencia, nivelDePeligrosidad, delito);
    }
    
    //Constructor con datos
    public PresoCumpliendoCondena(String carcelAnterior, String motivo, 
            String nombre, String apellido, String nacionalidad, 
            int documentoDeIdentidad, Date fechaDeNacimiento, 
            Date fechaDeIngreso, boolean reincidencia,
            boolean estadoDeSentencia, int nivelDePeligrosidad,
            String delito) {
        
        super(nombre, apellido, nacionalidad, documentoDeIdentidad, 
                fechaDeNacimiento, fechaDeIngreso, 
                reincidencia, estadoDeSentencia, 
                nivelDePeligrosidad, delito);
        
        this.carcelAnterior = carcelAnterior;
        this.motivo = motivo;
    }
    
    //toString

    @Override
    public String toString() {
        return "PresoCumpliendoCondena{" + "carcelAnterior=" + carcelAnterior 
                + ", motivo=" + motivo + '}';
    }
    
}
