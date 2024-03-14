package com.MovieInfo.Repository;

import com.MovieInfo.Entity.Moovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoovieRepository extends JpaRepository<Moovie, Integer> {

    List<Moovie> findAllByName(String name);
    List<Moovie> findAllByRating(String rating);
    List<Moovie> findAllByReleaseDate(String releaseDate);

    List<Moovie> findAllByDuration(String duration);

    List<Moovie> findAllByNameOrDescriptionContaining(String name,String description);


}
