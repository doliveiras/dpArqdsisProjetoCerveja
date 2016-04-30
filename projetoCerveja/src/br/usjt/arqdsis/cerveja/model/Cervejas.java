package br.usjt.arqdsis.cerveja.model;




import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.*;

 /**
  * Cervejas Value Object.
  * This class is value object representing database table cervejas
  * This class is intented to be used together with associated Dao object.
  */

 /**
  * This sourcecode has been generated by FREE DaoGen generator version 2.4.1.
  * The usage of generated code is restricted to OpenSource software projects
  * only. DaoGen is available in http://titaniclinux.net/daogen/
  * It has been programmed by Tuomo Lukka, Tuomo.Lukka@iki.fi
  *
  * DaoGen license: The following DaoGen generated source code is licensed
  * under the terms of GNU GPL license. The full text for license is available
  * in GNU project's pages: http://www.gnu.org/copyleft/gpl.html
  *
  * If you wish to use the DaoGen generator to produce code for closed-source
  * commercial applications, you must pay the lisence fee. The price is
  * 5 USD or 5 Eur for each database table, you are generating code for.
  * (That includes unlimited amount of iterations with all supported languages
  * for each database table you are paying for.) Send mail to
  * "Tuomo.Lukka@iki.fi" for more information. Thank you!
  */



public class Cervejas implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int id;
    private String nomeCerveja;
    private String tipo;
    private String fabricante;
    private double pre�o;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public Cervejas () {

    }

    public Cervejas (int idIn) {

          this.id = idIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getId() {
          return this.id;
    }
    public void setId(int idIn) {
          this.id = idIn;
    }

    public String getNomeCerveja() {
          return this.nomeCerveja;
    }
    public void setNomeCerveja(String nomeCervejaIn) {
          this.nomeCerveja = nomeCervejaIn;
    }

    public String getTipo() {
          return this.tipo;
    }
    public void setTipo(String tipoIn) {
          this.tipo = tipoIn;
    }

    public String getFabricante() {
          return this.fabricante;
    }
    public void setFabricante(String fabricanteIn) {
          this.fabricante = fabricanteIn;
    }

    public double getPre�o() {
          return this.pre�o;
    }
    public void setPre�o(double pre�oIn) {
          this.pre�o = pre�oIn;
    }



    /** 
     * setAll allows to set all persistent variables in one method call.
     * This is useful, when all data is available and it is needed to 
     * set the initial state of this object. Note that this method will
     * directly modify instance variales, without going trough the 
     * individual set-methods.
     */

    public void setAll(int idIn,
          String nomeCervejaIn,
          String tipoIn,
          String fabricanteIn,
          double pre�oIn) {
          this.id = idIn;
          this.nomeCerveja = nomeCervejaIn;
          this.tipo = tipoIn;
          this.fabricante = fabricanteIn;
          this.pre�o = pre�oIn;
    }


    /** 
     * hasEqualMapping-method will compare two Cervejas instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(Cervejas valueObject) {

          if (valueObject.getId() != this.id) {
                    return(false);
          }
          if (this.nomeCerveja == null) {
                    if (valueObject.getNomeCerveja() != null)
                           return(false);
          } else if (!this.nomeCerveja.equals(valueObject.getNomeCerveja())) {
                    return(false);
          }
          if (this.tipo == null) {
                    if (valueObject.getTipo() != null)
                           return(false);
          } else if (!this.tipo.equals(valueObject.getTipo())) {
                    return(false);
          }
          if (this.fabricante == null) {
                    if (valueObject.getFabricante() != null)
                           return(false);
          } else if (!this.fabricante.equals(valueObject.getFabricante())) {
                    return(false);
          }
          if (valueObject.getPre�o() != this.pre�o) {
                    return(false);
          }

          return true;
    }



    /**
     * toString will return String object representing the state of this 
     * valueObject. This is useful during application development, and 
     * possibly when application is writing object states in textlog.
     */
    public String toString() {
        StringBuffer out = new StringBuffer(this.getDaogenVersion());
        out.append("\nclass Cervejas, mapping to table cervejas\n");
        out.append("Persistent attributes: \n"); 
        out.append("id = " + this.id + "\n"); 
        out.append("nomeCerveja = " + this.nomeCerveja + "\n"); 
        out.append("tipo = " + this.tipo + "\n"); 
        out.append("fabricante = " + this.fabricante + "\n"); 
        out.append("pre�o = " + this.pre�o + "\n"); 
        return out.toString();
    }


    /**
     * Clone will return identical deep copy of this valueObject.
     * Note, that this method is different than the clone() which
     * is defined in java.lang.Object. Here, the retuned cloned object
     * will also have all its attributes cloned.
     */
    public Object clone() {
        Cervejas cloned = new Cervejas();

        cloned.setId(this.id); 
        if (this.nomeCerveja != null)
             cloned.setNomeCerveja(new String(this.nomeCerveja)); 
        if (this.tipo != null)
             cloned.setTipo(new String(this.tipo)); 
        if (this.fabricante != null)
             cloned.setFabricante(new String(this.fabricante)); 
        cloned.setPre�o(this.pre�o); 
        return cloned;
    }



    /** 
     * getDaogenVersion will return information about
     * generator which created these sources.
     */
    public String getDaogenVersion() {
        return "DaoGen version 2.4.1";
    }

}