package Enumerations;

public enum FlightCrewJob {
    FLIGHT_ATTENDANT("Flight Attendant"),
    COPILOT("First officer"),
    PILOT("Captain");

    private String title;

    FlightCrewJob(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
