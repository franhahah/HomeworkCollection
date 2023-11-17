public class Main {
    public static void main(String[] args) {
        AlienSpecies zorgon = new AlienSpecies("Zorgon", "Zorgon Prime", "Telepathy");
        AlienSpecies xeltron = new AlienSpecies("Xeltron", "Xeltron IX", "Invisibility");

        AlienSpeciesDatabase speciesDatabase = new AlienSpeciesDatabase();
        speciesDatabase.addSpecies("Zorgon", zorgon);
        speciesDatabase.addSpecies("Xeltron", xeltron);


        // Retrieve and display species details
        AlienSpecies retrievedZorgon = speciesDatabase.getSpecies("Zorgon");
        AlienSpecies retrievedXeltron = speciesDatabase.getSpecies("Xeltron");

        System.out.println("Retrieved Zorgon: " + retrievedZorgon.getHomePlanet());
        System.out.println("Retrieved Xeltron: " + retrievedXeltron.getHomePlanet());

        // Remove a species and display remaining species
        speciesDatabase.removeSpecies("Zorgon");

        System.out.println("Species in the database after removing Zorgon:");
        for (Map.Entry<String, AlienSpecies> entry : speciesDatabase.getSpeciesDatabase().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getSpecialAbility());
        }
    }
}