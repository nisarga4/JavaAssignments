
package com.xworkz.runner;

import com.xworkz.interfacee.ActionMovie;
import com.xworkz.internal.Movie;
public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new ActionMovie();
        movie.play();
        movie.pause();
        movie.stop();
    }
}