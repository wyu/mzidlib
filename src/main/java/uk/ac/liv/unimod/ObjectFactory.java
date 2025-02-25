//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.15 at 10:02:01 AM GMT 
//


package uk.ac.liv.unimod;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the unimod package. 
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

    private final static QName _Unimod_QNAME = new QName("http://www.unimod.org/xmlns/schema/unimod_2", "unimod");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: unimod
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XrefT }
     * 
     */
    public XrefT createXrefT() {
        return new XrefT();
    }

    /**
     * Create an instance of {@link BrickT }
     * 
     */
    public BrickT createBrickT() {
        return new BrickT();
    }

    /**
     * Create an instance of {@link NeutralLossT }
     * 
     */
    public NeutralLossT createNeutralLossT() {
        return new NeutralLossT();
    }

    /**
     * Create an instance of {@link ElementsT }
     * 
     */
    public ElementsT createElementsT() {
        return new ElementsT();
    }

    /**
     * Create an instance of {@link ElemT }
     * 
     */
    public ElemT createElemT() {
        return new ElemT();
    }

    /**
     * Create an instance of {@link CompositionT }
     * 
     */
    public CompositionT createCompositionT() {
        return new CompositionT();
    }

    /**
     * Create an instance of {@link SpecificityT }
     * 
     */
    public SpecificityT createSpecificityT() {
        return new SpecificityT();
    }

    /**
     * Create an instance of {@link PepNeutralLossT }
     * 
     */
    public PepNeutralLossT createPepNeutralLossT() {
        return new PepNeutralLossT();
    }

    /**
     * Create an instance of {@link ModT }
     * 
     */
    public ModT createModT() {
        return new ModT();
    }

    /**
     * Create an instance of {@link ModBricksT }
     * 
     */
    public ModBricksT createModBricksT() {
        return new ModBricksT();
    }

    /**
     * Create an instance of {@link AminoAcidsT }
     * 
     */
    public AminoAcidsT createAminoAcidsT() {
        return new AminoAcidsT();
    }

    /**
     * Create an instance of {@link ElemRefT }
     * 
     */
    public ElemRefT createElemRefT() {
        return new ElemRefT();
    }

    /**
     * Create an instance of {@link UnimodT }
     * 
     */
    public UnimodT createUnimodT() {
        return new UnimodT();
    }

    /**
     * Create an instance of {@link AaT }
     * 
     */
    public AaT createAaT() {
        return new AaT();
    }

    /**
     * Create an instance of {@link ModificationsT }
     * 
     */
    public ModificationsT createModificationsT() {
        return new ModificationsT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnimodT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unimod.org/xmlns/schema/unimod_2", name = "unimod")
    public JAXBElement<UnimodT> createUnimod(UnimodT value) {
        return new JAXBElement<UnimodT>(_Unimod_QNAME, UnimodT.class, null, value);
    }

}
