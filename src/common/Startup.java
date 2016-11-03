/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author athanas1
 */
public class Startup {

    public static void main(String[] args) {
        Movie m1 = new Movie("Titanic", "James Cameron", 12.4122);
        Movie m2 = new Movie("Titanic", "James Cameron", 12.4122);
        Movie m3 = new Movie("Rush Hour ", "Brett Ratner", 7.1411);
        Movie m4 = new Movie("Sausage Party", "Conrad Vernon", 11.9872);

        Map<String, Movie> map = new HashMap();
        map.put("12.4122", m1);
        map.put("12.4122", m2);
        map.put("7.1411", m3);
        map.put("11.9872", m4);

        Movie m = map.get("7.1411");
        System.out.println("Finding " + m);

        System.out.println("\nUsing a keyset, get the movies...");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Movie found = map.get(key);
            System.out.println(found);
        }

        System.out.println("\nUsing a collection of values, get the Movie...");
        Collection<Movie> values = map.values();
        List<Movie> sortedList = new ArrayList<Movie>(values);
        for (Movie mov : sortedList) {
            System.out.println(mov);
        }

        Map<String, Movie> tmap = new TreeMap<String, Movie>();

        tmap.put("12.4122", m1);
        tmap.put("12.4122", m2);
        tmap.put("7.1411", m3);
        tmap.put("11.9872", m4);
        System.out.println("\nUsing a Tree map, get the Movie...");
        Set<String> treekeys = tmap.keySet();

        for (String tkey : treekeys) {
            Movie found = tmap.get(tkey);
            System.out.println(found);
        }
        System.out.println("\n Using a collection default value to get the movie");
        Collection<Movie> treevalues = tmap.values();
        List<Movie> treeSortedList = new ArrayList<Movie>(treevalues);

        Collections.sort(treeSortedList);
        for (Movie mov : treeSortedList) {
            System.out.println(mov);
        }
        System.out.println("\nUsing Comparator value By director to get movie");
        Collection<Movie> treevalues2 = tmap.values();
        List<Movie> treeSortedList2 = new ArrayList<Movie>(treevalues2);
        Collections.sort(treeSortedList2, new MovieByDirector());
        for (Movie mov : treeSortedList2) {
            System.out.println(mov);
        }
        
        System.out.println("\n Using a tree set to sort");
        
        Set<Movie> set = new TreeSet<Movie>();
        
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        
        for(Movie mov : set){
            System.out.println(mov);
        }
    }
    
    
}
