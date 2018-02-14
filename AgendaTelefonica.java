import java.util.HashMap;

/**
 * Clase que representa una guia telefonica muy basica que almacena contactos
 *  y sus numeros de telefono.
 *
 * @author Didac Fernandez Fernandez
 * @version 14/02/2018
 */
public class AgendaTelefonica
{
    private HashMap<String,String> agenda;

    /**
     * Constructor de la clase AgendaTelefonica.
     */
    public AgendaTelefonica()
    {
        this.agenda = new HashMap<>();
    }

    /**
     * Metodo que añade contactos a la agenda telefonica.
     *
     * @param  name  El nombre del contacto telefonico
     * @param  number  El numero del contacto telefonico
     */
    public void enterNumber(String name, String number){
        agenda.put(name,number);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  name  El nombre del contacto telefonico
     * @return    El numero del contacto telefonico
     */
    public String lookupNumber(String name){        
        return agenda.get(name);
    }
    
    /**
     * Imprime todas las claves de la agenda telefonica.
     */
    public void printAllNames(){
        System.out.println(agenda.keySet());
    }
}
