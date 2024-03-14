package com.MovieInfo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name = "moovie")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Moovie {
    @Id
    private int id;
    private String name;
    private String rating;

    private String releaseDate;
    private String duration;
    private String description;
}
