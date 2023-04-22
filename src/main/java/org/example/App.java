package org.example;

import org.example.model.Director;
import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Movie.class)
                .addAnnotatedClass(Director.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Director director = session.get(Director.class, 1);//get director from db

//            System.out.println(director.getName());
//            director.getMovies().forEach(System.out::println); get movies of director

//            Movie movie = session.get(Movie.class,10); get movie
//            System.out.println(movie.getName()); get name movie
//            System.out.println(movie.getDirector().getName()); get director movie

//            Movie movieForTarantino = new Movie("some name","2023",director); create new movie
//            director.getMovies().add(movieForTarantino);
//            director.getMovies().forEach(System.out::println);



            //Director newDirector = new Director...
//            Director newDirector = session.get(Director.class,7);
//            Movie newMovie =  new Movie("Brilliant film",2022,newDirector);
//            newDirector.setMovies(new ArrayList<>(Collections.singletonList(newMovie)));
//            session.save(newMovie);



//              set new director
//           Director director = session.get(Director.class,7);
//            Movie movie = session.get(Movie.class,5);
//            movie.getDirector().getMovies().remove(movie);
//            movie.setDirector(director);
//            director.getMovies().add(movie);
//            director.getMovies().forEach(System.out::println);



//            Director director = session.get(Director.class,1);
//            List<Movie> movieList = director.getMovies();
//
//            for (Movie movie :
//                    movieList) {
//                session.remove(movie);
//            }
//            director.getMovies().clear();



            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}