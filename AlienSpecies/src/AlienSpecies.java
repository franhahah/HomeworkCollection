class AlienSpecies {
    private String name;
    private String homePlanet;
    private String specialAbility;

    public AlienSpecies(String name, String homePlanet, String specialAbility) {
        this.name = name;
        this.homePlanet = homePlanet;
        this.specialAbility = specialAbility;
    }
    public String getName() {
        return name;
    }

    public String getHomePlanet(){
        return homePlanet;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    // Getters for properties done!
}