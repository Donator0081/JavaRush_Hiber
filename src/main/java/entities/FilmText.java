package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "film_text",schema = "movie")
public class FilmText {
    @Id
    @Column(name = "film_id")
    private short filmId;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "description",columnDefinition = "text default null")
    @Type(type = "text")
    private String description;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

}
