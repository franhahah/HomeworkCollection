public class Player {
    private String username;
    private int level;
    private int experiencePoints;

    public void gainExperience(int experience) {
        // this.experiencePoints = this.experiencePoints + experience;
        this.experiencePoints += experience;
        maybeLevelUp();
    }

    public boolean canLevelUp() {
        return this.experiencePoints > 1000;
    }

    private void maybeLevelUp() {
        while (canLevelUp()) {
            levelUp();
        }
    }

    private void levelUp() {
        if (canLevelUp()) {
            this.level += 1;
            this.experiencePoints -= 1000;
            System.out.println("Level Up! New Level: " + this.level);
        }
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoints() {
        return this.experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}







