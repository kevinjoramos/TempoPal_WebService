package kevinjoramos.tempo_pal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

}
