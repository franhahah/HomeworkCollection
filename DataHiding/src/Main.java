public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setUsername("PlayerOne");
        player.setLevel(1);
        player.setExperiencePoints(500);

        // Gain experience points
        player.gainExperience(600);

        player.gainExperience(600);

        player.gainExperience(600);
        player.gainExperience(600);
        player.gainExperience(600);

        System.out.println("Current Experience Points: " + player.getExperiencePoints());
    }
}