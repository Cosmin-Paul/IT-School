package session_17_equals_hashcode_generics.challenges.Challenge_7;

import java.util.Objects;

public class Entity {
    private int id;
    private String name;
    private long timestamp;

    public Entity(int id, String name, long timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getTimestamp() {
        return timestamp;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Entity that = (Entity) obj;
        return id == that.id && timestamp == that.timestamp && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, timestamp);
    }
}