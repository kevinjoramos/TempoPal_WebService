package kevinjoramos.tempo_pal.entity;

import jakarta.persistence.*;

@Entity
@Table(name="entries")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entry_id")
    private long id;

    @Column(name = "entry_description")
    private String description;

    @Column(name = "entry_elapsed_time")
    private long elapsedTime;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "project_id")
    private long projectId;

    @Column(name = "tag_id")
    private long tagId;

    public Entry() {}

    public Entry(String description, long elapsedTime, long user_id, long project_id, long tag_id) {
        this.description = description;
        this.elapsedTime = elapsedTime;
        this.userId = user_id;
        this.projectId = project_id;
        this.tagId = tag_id;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long project_id) {
        this.projectId = project_id;
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tag_id) {
        this.tagId = tag_id;
    }
}
