import org.bootcamp.Bootcamp;
import org.bootcamp.exercises.*;

public class Main {
    public static void main(String[] args) {
        // create a new bootcamp
        Bootcamp todaysBootcamp = new Bootcamp();

        // recreate the bootcamp from the example
        ExerciseSet tabata = new ExerciseSet("Tabata");
        tabata.setInstructions("3 or 4 rounds, with 20 second breaks between them:");
        String[] tabataExercises = {"Cross-Over Lunges", "Push-Ups", "Glute Bridge"};
        tabata.setBouts(tabataExercises, 20);

        ExerciseSet circuit = new ExerciseSet("Circuit");

        ExerciseSet allThePlanks = new ExerciseSet("All the Planks");

        ExerciseSet[] theSets = {tabata, circuit, allThePlanks};

        todaysBootcamp.warmingUp = new WarmingUp();
        todaysBootcamp.sets = theSets;
        todaysBootcamp.coolDown = new CoolDown();
    }
}