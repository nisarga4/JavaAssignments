
package com.xworkz.runner;


import com.xworkz.intenal.ActionMovie;
import com.xworkz.interfacee.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new ActionMovie();
        movie.play();
        movie.pause();
        movie.stop();
    }
}
