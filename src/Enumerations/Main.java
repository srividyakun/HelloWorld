package Enumerations;
/*
Remember public static final
public- accessed by any class
static - called using enum name
final-- all fileds are constants

 */

public class Main {
    public static void main(String[] args) {
        FlightCrewJob job1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob job2 = FlightCrewJob.COPILOT;
        FlightCrewJob job3 = FlightCrewJob.PILOT;

        if(job1 == FlightCrewJob.FLIGHT_ATTENDANT){
            System.out.println("Job is : "+FlightCrewJob.FLIGHT_ATTENDANT);
        }


        CrewMember geetha = new CrewMember(FlightCrewJob.PILOT,"Geetha");
        CrewMember bob = new CrewMember(FlightCrewJob.PILOT,"Geetha");
        Main main = new Main();
        main.whoIsIncharge(geetha,bob);
    }

     void whoIsIncharge(CrewMember geetha, CrewMember bob) {
        CrewMember theBoss = geetha.getJob().compareTo(bob.getJob())>0?geetha:bob;
         System.out.println(theBoss.getJob().getTitle()+ " "+ theBoss.getName()+" is boss.. ");

    }

    void displayJobResponsibilities(FlightCrewJob job){
        switch (job){
            case PILOT:
                System.out.println("Flies the plane");
                break;
            case FLIGHT_ATTENDANT:
                System.out.println("Assures passengers safety");
                break;
            case COPILOT:
                System.out.println("Assists the pilot");
                break;

        }
    }
}
