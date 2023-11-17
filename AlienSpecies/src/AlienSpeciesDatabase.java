import java.util.HashMap;
import java.util.Map;

class AlienSpeciesDatabase {
    private Map<String, AlienSpecies> speciesDatabase;

    public AlienSpeciesDatabase() {
        speciesDatabase = new HashMap<>();
    }

    public void addSpecies(String speciesName, AlienSpecies species) {
        speciesDatabase.put(speciesName, species);
    }

    public AlienSpecies getSpecies(String speciesName) {
        return speciesDatabase.get(speciesName);
    }

    public void removeSpecies(String speciesName) {
        speciesDatabase.remove(speciesName);
    }
}