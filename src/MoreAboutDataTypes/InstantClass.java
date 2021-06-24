package MoreAboutDataTypes;

import java.time.Instant;

public class InstantClass {
    public static void main(String[] args) {
        checkRelationship(Instant.parse("1980-04-09T15:30:45.123Z"));
    }
    static void checkRelationship(Instant otherInstant){
        Instant nowInstant = Instant.now();
        if(otherInstant.compareTo(nowInstant)>0){
            System.out.println("Instant is in the future" +nowInstant);
        }else if(otherInstant.compareTo(nowInstant)<0){
            System.out.println("Instant is in the past");
        }else {
            System.out.println("Instant is now");
        }
    }
}
