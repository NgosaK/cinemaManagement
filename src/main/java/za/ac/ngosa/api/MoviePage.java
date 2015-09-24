package za.ac.ngosa.api;

import za.ac.ngosa.domain.Movie;
import za.ac.ngosa.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by User on 2015/08/22.
 */
@RestController
@RequestMapping(value="/movie/**")
public class MoviePage {

    @Autowired
    private MovieService service;

    //=====================Retrieve All Movies=================
    @RequestMapping(value = "/movies/", method = RequestMethod.GET)
    public ResponseEntity<List<Movie>> listAllSubjects() {
        List<Movie> Subjects = service.getMovie();
        if(Subjects.isEmpty()){
            return new ResponseEntity<List<Movie>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Movie>>(Subjects, HttpStatus.OK);
    }

    //-------------------Retrieve Single Movie--------------------------------------------------------

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> getSubject(@PathVariable("id") long id) {
        System.out.println("Fetching Subject with id " + id);
        Movie Subject = service.getMovieByID(id);
        if (Subject == null) {
            System.out.println("Movie with id " + id + " not found");
            return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Movie>(Subject, HttpStatus.OK);
    }

    //-------------------Create a Movie--------------------------------------------------------

    @RequestMapping(value = "/movie/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createSubject(@RequestBody Movie movie,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating movie " + movie.getTitle());

//     USE THIS IF YOU WANT TO CHECK UNIQUE OBJECT
//      if (SubjectService.isSubjectExist(Subject)) {
//            System.out.println("A Subject with name " + Subject.getName() + " already exist");
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }

        service.addMovie(movie);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/movie/{id}").buildAndExpand(movie.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //------------------- Update a Subject --------------------------------------------------------

    @RequestMapping(value = "/movie/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Movie> updateSubject(@PathVariable("id") long id, @RequestBody Movie movie) {
        System.out.println("Updating movie " + id);

        Movie currentMovie = service.getMovieByID(id);

        if (currentMovie==null) {
            System.out.println("Movie with id " + id + " not found");
            return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
        }

        Movie updatedMovie = new Movie
                .Builder(currentMovie.getId())
                .copy(currentMovie)
                .build();
        service.updateMovie(updatedMovie);
        return new ResponseEntity<Movie>(updatedMovie, HttpStatus.OK);
    }

//------------------- Delete a Movie --------------------------------------------------------

    @RequestMapping(value = "/movie/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Movie> deleteSubject(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting a movie with id " + id);

        Movie movie = service.getMovieByID(id);
        if (movie == null) {
            System.out.println("Unable to delete. Movie with id " + id + " not found");
            return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
        }

        service.removeMovie(movie);
        return new ResponseEntity<Movie>(HttpStatus.NO_CONTENT);
    }

}

