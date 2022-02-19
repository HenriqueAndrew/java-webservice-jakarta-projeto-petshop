//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.28 às 11:21:07 AM BRT 
//


package xml.pkg;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="especie" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="raca" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="genero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dt_nasc" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Animal")
public class Animal {

    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "nome")
    protected String nome;
    @XmlAttribute(name = "especie")
    protected String especie;
    @XmlAttribute(name = "raca")
    protected String raca;
    @XmlAttribute(name = "genero")
    protected String genero;
    @XmlAttribute(name = "dt_nasc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtNasc;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade especie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Define o valor da propriedade especie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecie(String value) {
        this.especie = value;
    }

    /**
     * Obtém o valor da propriedade raca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaca() {
        return raca;
    }

    /**
     * Define o valor da propriedade raca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaca(String value) {
        this.raca = value;
    }

    /**
     * Obtém o valor da propriedade genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o valor da propriedade genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtém o valor da propriedade dtNasc.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtNasc() {
        return dtNasc;
    }

    /**
     * Define o valor da propriedade dtNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtNasc(XMLGregorianCalendar value) {
        this.dtNasc = value;
    }

    public void setDtNasc(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
