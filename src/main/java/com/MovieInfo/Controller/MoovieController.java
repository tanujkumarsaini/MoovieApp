package com.MovieInfo.Controller;

import com.MovieInfo.Entity.Moovie;
import com.MovieInfo.Service.MoovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moovie")
public class MoovieController {

    @Autowired
    private MoovieService moovieService;


    @GetMapping("/getAll")
    public ResponseEntity<List<Moovie>> getAllMoovies(){
        List<Moovie> moovieList = moovieService.getAllMoovieDetails();
        return new ResponseEntity<>(moovieList, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Moovie>> getAllMoovies(@RequestParam(required = false) String name, @RequestParam(required = false) String rating, @RequestParam(required = false) String releaseDate, @RequestParam(required = false) String duration ){

        List<Moovie> moovieList=null;
        if(name!=null){
            moovieList= moovieService.getMooviesByName(name);
        } else if (rating!=null) {
            moovieList=moovieService.getMooviesByRating(rating);
        } else if (releaseDate!=null) {
            moovieList=moovieService.getMooviesByReleaseDate(releaseDate);
        } else if (duration!=null) {
           moovieList= moovieService.getMooviesByDuration(duration);
        }

        return new ResponseEntity<>(moovieList, HttpStatus.OK);
    }


    @GetMapping("/search/{element}")
    public ResponseEntity<List<Moovie>> getAllMoovies(@PathVariable String element ){
        List<Moovie> moovieList = moovieService.getAllByNameOrDescription(element,element);
        return new ResponseEntity<>(moovieList, HttpStatus.OK);
    }

}
