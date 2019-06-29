public class Player {
    private String name;

    public Player() {
        System.out.println("Welcome to Rock Paper Scissors! What is your name?");
    }

    public void setPlayer(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return name;
    }

    public void welcomeMessage() {
        System.out.println("Welcome " + name);
    }
}
