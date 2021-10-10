/*
Question :

Find Itinerary from a given list of tickets

Given a list of tickets, find itinerary in order using the given list.

Input:
"Chennai" -> "Banglore"
"Bombay" -> "Delhi"
"Goa"    -> "Chennai"
"Delhi"  -> "Goa"

Output:
Bombay->Delhi, Delhi->Goa, Goa->Chennai, Chennai->Banglore,

 */

package com.company.JavaDaily;

import java.util.HashMap;
import java.util.Map;

public class ticketProblem {
    public static void ticket() {
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("CHE", "BAN");
        data.put("BOM", "DEL");
        data.put("GOA", "CHE");
        data.put("DEL", "GOA");
        HashMap<String, String> reverseData = new HashMap<String, String>();
        data.forEach((h, k) -> {
            reverseData.put(k, h);
        });
        String start = null;
        for (Map.Entry<String, String> e : data.entrySet()) {
            if (!reverseData.containsKey(e.getKey())) {
                start = e.getKey();
            }
        }
        String to = data.get(start);
        for(Map.Entry<String,String> e: data.entrySet()){
            while (to!=null){
                System.out.print(start+ " -> "+to+" ,");
                start = to;
                to = data.get(start);
            }
        }

    }

    public static void main(String[] args) {
        ticket();
    }
}
