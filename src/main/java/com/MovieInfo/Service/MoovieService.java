package com.MovieInfo.Service;

import com.MovieInfo.Entity.Moovie;
import com.MovieInfo.Repository.MoovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoovieService {
    @Autowired
    private MoovieRepository moovieRepository;

    public List<Moovie> getAllMoovieDetails(){
        return moovieRepository.findAll();
    }
    public List<Moovie> getMooviesByName(String name){
        return moovieRepository.findAllByName(name);
    }

    public List<Moovie> getMooviesByRating(String rating){
        return moovieRepository.findAllByRating(rating);
    }
    public List<Moovie> getMooviesByReleaseDate(String releaseDate){
        return moovieRepository.findAllByReleaseDate(releaseDate);
    }
    public List<Moovie> getMooviesByDuration(String duration){
        return moovieRepository.findAllByDuration(duration);
    }


    public List<Moovie> getAllByNameOrDescription(String name, String description){
       return moovieRepository.findAllByNameOrDescriptionContaining(name,description);
    }




}
