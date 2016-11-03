/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author athanas1
 */
public class Startup {

    public static void main(String[] args) {
        //Generics version
        List<String> list = new ArrayList();
        Map<String,List<String>> favoriteCars = new HashMap<>();
        
        List favFords = new ArrayList();
        favFords.add("Ford GT");
        favFords.add("Shelby GT350");
        
        List favNissan = new ArrayList();
        favNissan.add("Skyline GT");
        favNissan.add("350Z");
//        favoriteCars.put("Nissan","Skyline GTR");
//        favoriteCars.put("Ford","Ford GT");
        favoriteCars.put("Fords",favFords);
        favoriteCars.put("Nissan",favNissan);
        
        List found = favoriteCars.get("Nissan");
        System.out.println(found);
        
//        String favFord = (String)favoriteCars.get("Ford");
//        System.out.println(favFord);
                }
}
