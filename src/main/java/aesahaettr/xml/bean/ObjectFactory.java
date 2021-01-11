//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.11 à 04:38:41 PM CET 
//


package aesahaettr.xml.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aesahaettr.xml.bean package. 
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

    private final static QName _TypeAppartenance_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "typeAppartenance");
    private final static QName _RefPays_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "refPays");
    private final static QName _Possessions_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "possessions");
    private final static QName _EvenementIds_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "evenementIds");
    private final static QName _TypeRelation_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "typeRelation");
    private final static QName _RefTypeLocalisation_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "refTypeLocalisation");
    private final static QName _Contact_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "contact");
    private final static QName _TypeContact_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "typeContact");
    private final static QName _Relation_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "relation");
    private final static QName _Objets_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "objets");
    private final static QName _RefTypeContact_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "refTypeContact");
    private final static QName _TypeObjet_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "typeObjet");
    private final static QName _Possession_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "possession");
    private final static QName _Adresse_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "adresse");
    private final static QName _Evenements_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "evenements");
    private final static QName _Contacts_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "contacts");
    private final static QName _Evenement_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "evenement");
    private final static QName _Pays_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "pays");
    private final static QName _Relations_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "relations");
    private final static QName _Personnes_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "personnes");
    private final static QName _RefTypeRelation_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "refTypeRelation");
    private final static QName _Adresses_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "adresses");
    private final static QName _RefTypeAppartenance_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "refTypeAppartenance");
    private final static QName _RefTypeObjet_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "refTypeObjet");
    private final static QName _Objet_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "objet");
    private final static QName _Aesahaettr_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "aesahaettr");
    private final static QName _TypeLocalisation_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "typeLocalisation");
    private final static QName _Localisations_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "localisations");
    private final static QName _Personne_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "personne");
    private final static QName _Localisation_QNAME = new QName("http://www.aesahaettr.me/aesahaettr", "localisation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aesahaettr.xml.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeContactList }
     * 
     */
    public TypeContactList createTypeContactList() {
        return new TypeContactList();
    }

    /**
     * Create an instance of {@link TypeObjet }
     * 
     */
    public TypeObjet createTypeObjet() {
        return new TypeObjet();
    }

    /**
     * Create an instance of {@link Possession }
     * 
     */
    public Possession createPossession() {
        return new Possession();
    }

    /**
     * Create an instance of {@link TypeContact }
     * 
     */
    public TypeContact createTypeContact() {
        return new TypeContact();
    }

    /**
     * Create an instance of {@link ObjetList }
     * 
     */
    public ObjetList createObjetList() {
        return new ObjetList();
    }

    /**
     * Create an instance of {@link Relation }
     * 
     */
    public Relation createRelation() {
        return new Relation();
    }

    /**
     * Create an instance of {@link TypeRelation }
     * 
     */
    public TypeRelation createTypeRelation() {
        return new TypeRelation();
    }

    /**
     * Create an instance of {@link PossessionList }
     * 
     */
    public PossessionList createPossessionList() {
        return new PossessionList();
    }

    /**
     * Create an instance of {@link EvenementIdList }
     * 
     */
    public EvenementIdList createEvenementIdList() {
        return new EvenementIdList();
    }

    /**
     * Create an instance of {@link TypeLocalisationList }
     * 
     */
    public TypeLocalisationList createTypeLocalisationList() {
        return new TypeLocalisationList();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link TypeAppartenance }
     * 
     */
    public TypeAppartenance createTypeAppartenance() {
        return new TypeAppartenance();
    }

    /**
     * Create an instance of {@link PaysList }
     * 
     */
    public PaysList createPaysList() {
        return new PaysList();
    }

    /**
     * Create an instance of {@link TypeLocalisation }
     * 
     */
    public TypeLocalisation createTypeLocalisation() {
        return new TypeLocalisation();
    }

    /**
     * Create an instance of {@link LocalisationList }
     * 
     */
    public LocalisationList createLocalisationList() {
        return new LocalisationList();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

    /**
     * Create an instance of {@link Localisation }
     * 
     */
    public Localisation createLocalisation() {
        return new Localisation();
    }

    /**
     * Create an instance of {@link TypeAppartenanceList }
     * 
     */
    public TypeAppartenanceList createTypeAppartenanceList() {
        return new TypeAppartenanceList();
    }

    /**
     * Create an instance of {@link AdresseList }
     * 
     */
    public AdresseList createAdresseList() {
        return new AdresseList();
    }

    /**
     * Create an instance of {@link Objet }
     * 
     */
    public Objet createObjet() {
        return new Objet();
    }

    /**
     * Create an instance of {@link Aesahaettr }
     * 
     */
    public Aesahaettr createAesahaettr() {
        return new Aesahaettr();
    }

    /**
     * Create an instance of {@link TypeObjetList }
     * 
     */
    public TypeObjetList createTypeObjetList() {
        return new TypeObjetList();
    }

    /**
     * Create an instance of {@link TypeRelationList }
     * 
     */
    public TypeRelationList createTypeRelationList() {
        return new TypeRelationList();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link EvenementList }
     * 
     */
    public EvenementList createEvenementList() {
        return new EvenementList();
    }

    /**
     * Create an instance of {@link RelationList }
     * 
     */
    public RelationList createRelationList() {
        return new RelationList();
    }

    /**
     * Create an instance of {@link PersonneList }
     * 
     */
    public PersonneList createPersonneList() {
        return new PersonneList();
    }

    /**
     * Create an instance of {@link ContactList }
     * 
     */
    public ContactList createContactList() {
        return new ContactList();
    }

    /**
     * Create an instance of {@link Evenement }
     * 
     */
    public Evenement createEvenement() {
        return new Evenement();
    }

    /**
     * Create an instance of {@link Pays }
     * 
     */
    public Pays createPays() {
        return new Pays();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeAppartenance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "typeAppartenance")
    public JAXBElement<TypeAppartenance> createTypeAppartenance(TypeAppartenance value) {
        return new JAXBElement<TypeAppartenance>(_TypeAppartenance_QNAME, TypeAppartenance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaysList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "refPays")
    public JAXBElement<PaysList> createRefPays(PaysList value) {
        return new JAXBElement<PaysList>(_RefPays_QNAME, PaysList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossessionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "possessions")
    public JAXBElement<PossessionList> createPossessions(PossessionList value) {
        return new JAXBElement<PossessionList>(_Possessions_QNAME, PossessionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvenementIdList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "evenementIds")
    public JAXBElement<EvenementIdList> createEvenementIds(EvenementIdList value) {
        return new JAXBElement<EvenementIdList>(_EvenementIds_QNAME, EvenementIdList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "typeRelation")
    public JAXBElement<TypeRelation> createTypeRelation(TypeRelation value) {
        return new JAXBElement<TypeRelation>(_TypeRelation_QNAME, TypeRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeLocalisationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "refTypeLocalisation")
    public JAXBElement<TypeLocalisationList> createRefTypeLocalisation(TypeLocalisationList value) {
        return new JAXBElement<TypeLocalisationList>(_RefTypeLocalisation_QNAME, TypeLocalisationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "contact")
    public JAXBElement<Contact> createContact(Contact value) {
        return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "typeContact")
    public JAXBElement<TypeContact> createTypeContact(TypeContact value) {
        return new JAXBElement<TypeContact>(_TypeContact_QNAME, TypeContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Relation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "relation")
    public JAXBElement<Relation> createRelation(Relation value) {
        return new JAXBElement<Relation>(_Relation_QNAME, Relation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "objets")
    public JAXBElement<ObjetList> createObjets(ObjetList value) {
        return new JAXBElement<ObjetList>(_Objets_QNAME, ObjetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeContactList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "refTypeContact")
    public JAXBElement<TypeContactList> createRefTypeContact(TypeContactList value) {
        return new JAXBElement<TypeContactList>(_RefTypeContact_QNAME, TypeContactList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeObjet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "typeObjet")
    public JAXBElement<TypeObjet> createTypeObjet(TypeObjet value) {
        return new JAXBElement<TypeObjet>(_TypeObjet_QNAME, TypeObjet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Possession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "possession")
    public JAXBElement<Possession> createPossession(Possession value) {
        return new JAXBElement<Possession>(_Possession_QNAME, Possession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adresse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "adresse")
    public JAXBElement<Adresse> createAdresse(Adresse value) {
        return new JAXBElement<Adresse>(_Adresse_QNAME, Adresse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvenementList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "evenements")
    public JAXBElement<EvenementList> createEvenements(EvenementList value) {
        return new JAXBElement<EvenementList>(_Evenements_QNAME, EvenementList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "contacts")
    public JAXBElement<ContactList> createContacts(ContactList value) {
        return new JAXBElement<ContactList>(_Contacts_QNAME, ContactList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evenement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "evenement")
    public JAXBElement<Evenement> createEvenement(Evenement value) {
        return new JAXBElement<Evenement>(_Evenement_QNAME, Evenement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pays }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "pays")
    public JAXBElement<Pays> createPays(Pays value) {
        return new JAXBElement<Pays>(_Pays_QNAME, Pays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "relations")
    public JAXBElement<RelationList> createRelations(RelationList value) {
        return new JAXBElement<RelationList>(_Relations_QNAME, RelationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "personnes")
    public JAXBElement<PersonneList> createPersonnes(PersonneList value) {
        return new JAXBElement<PersonneList>(_Personnes_QNAME, PersonneList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeRelationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "refTypeRelation")
    public JAXBElement<TypeRelationList> createRefTypeRelation(TypeRelationList value) {
        return new JAXBElement<TypeRelationList>(_RefTypeRelation_QNAME, TypeRelationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdresseList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "adresses")
    public JAXBElement<AdresseList> createAdresses(AdresseList value) {
        return new JAXBElement<AdresseList>(_Adresses_QNAME, AdresseList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeAppartenanceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "refTypeAppartenance")
    public JAXBElement<TypeAppartenanceList> createRefTypeAppartenance(TypeAppartenanceList value) {
        return new JAXBElement<TypeAppartenanceList>(_RefTypeAppartenance_QNAME, TypeAppartenanceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeObjetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "refTypeObjet")
    public JAXBElement<TypeObjetList> createRefTypeObjet(TypeObjetList value) {
        return new JAXBElement<TypeObjetList>(_RefTypeObjet_QNAME, TypeObjetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Objet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "objet")
    public JAXBElement<Objet> createObjet(Objet value) {
        return new JAXBElement<Objet>(_Objet_QNAME, Objet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aesahaettr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "aesahaettr")
    public JAXBElement<Aesahaettr> createAesahaettr(Aesahaettr value) {
        return new JAXBElement<Aesahaettr>(_Aesahaettr_QNAME, Aesahaettr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeLocalisation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "typeLocalisation")
    public JAXBElement<TypeLocalisation> createTypeLocalisation(TypeLocalisation value) {
        return new JAXBElement<TypeLocalisation>(_TypeLocalisation_QNAME, TypeLocalisation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalisationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "localisations")
    public JAXBElement<LocalisationList> createLocalisations(LocalisationList value) {
        return new JAXBElement<LocalisationList>(_Localisations_QNAME, LocalisationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "personne")
    public JAXBElement<Personne> createPersonne(Personne value) {
        return new JAXBElement<Personne>(_Personne_QNAME, Personne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Localisation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aesahaettr.me/aesahaettr", name = "localisation")
    public JAXBElement<Localisation> createLocalisation(Localisation value) {
        return new JAXBElement<Localisation>(_Localisation_QNAME, Localisation.class, null, value);
    }

}
