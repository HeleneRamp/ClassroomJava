class Wilder {
    private String firstname;
    private boolean aware;

    Wilder(String firstname, boolean aware) {

        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }
    public boolean getIsAware() {
        return aware;
    }

    String whoAmI() {
        return "Je m\'appelle " + this.firstname + (aware ? " et je suis aware." : " et je ne suis pas aware.") ;
    }
}