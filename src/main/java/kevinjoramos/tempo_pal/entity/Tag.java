package kevinjoramos.tempo_pal.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private long id;

    @Column(name = "tag_name")
    private String name;

    @Column(name = "user_id")
    private long userId;

    public Tag() {}

    public Tag(String name, long userId) {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
