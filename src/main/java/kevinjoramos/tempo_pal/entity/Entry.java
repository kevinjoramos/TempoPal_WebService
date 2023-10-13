package kevinjoramos.tempo_pal.entity;

import jakarta.persistence.*;

@Entity
@Table(name="entries")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entry_id")
    private long id;

    @Column(name = "entry_description")
    private String description;

    @Column(name = "entry_elapsed_time")
    private long elapsedTime;

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "project_id")
    private long project_id;

    @Column(name = "tag_id")
    private long tag_id;

    public Entry() {}

    public Entry(String description, long elapsedTime, long user_id, long project_id, long tag_id) {
        this.description = description;
        this.elapsedTime = elapsedTime;
        this.user_id = user_id;
        this.project_id = project_id;
        this.tag_id = tag_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public long getTag_id() {
        return tag_id;
    }

    public void setTag_id(long tag_id) {
        this.tag_id = tag_id;
    }
}
