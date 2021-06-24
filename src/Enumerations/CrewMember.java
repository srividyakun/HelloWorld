package Enumerations;

public class CrewMember {
    FlightCrewJob job;

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    CrewMember(FlightCrewJob job, String name){
        this.job = job;
        this.name = name;
    }
}
