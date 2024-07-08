package jour07.job00;

public class Person {
    public String name;
    public String lastname;

    protected String birthDate;
    protected String birthPlace;

    private String phoneNumber;
    private String address;

    // Les attribut en privés ne sont pas accessibles en dehors de la classe
    // Les attributs en protected sont accessibles par les classes filles
    // Les attributs en public sont accessibles partout

    // Les attributs privés et protected devraient être accessibles via des getters et setters
}
