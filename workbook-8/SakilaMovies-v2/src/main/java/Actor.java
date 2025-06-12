import java.time.LocalDateTime;

public class Actor {

    // Actor Attributes
    private int actorId;
    private String first_name;
    private String last_name;
    private LocalDateTime last_update;

    // Constructor
    public Actor(int actorId, String first_name, String last_name, LocalDateTime last_update) {
        this.actorId = actorId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;
    }

    public Actor(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    // toString
    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", last_update=" + last_update +
                '}';
    }

    // Getters & Setters

    public int getActorId() {
        return actorId;
    }
    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }
    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }


}
