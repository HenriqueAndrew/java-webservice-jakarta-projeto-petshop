//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.28 às 11:21:07 AM BRT 
//


package xml.pkg;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the petshopwc1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: petshopwc1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PetShop }
     * 
     */
    public PetShop createPetShop() {
        return new PetShop();
    }

    /**
     * Create an instance of {@link Animal }
     * 
     */
    public Animal createAnimal() {
        return new Animal();
    }

}
