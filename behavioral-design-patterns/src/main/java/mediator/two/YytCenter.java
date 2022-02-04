package mediator.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class YytCenter implements AirTrafficControlMediator {
    private List<Aircraft> aircraftUnderGuidance = new ArrayList<Aircraft>();

    @Override
    public void receiveAircraftLocation(Aircraft reportingAircraft) {
        for (Aircraft currentAircraftUnderGuidance : aircraftUnderGuidance.stream()
                .filter(x -> !x.equals(reportingAircraft)).collect(Collectors.toList())) {
            if (Math.abs(currentAircraftUnderGuidance.getCurrentAltitude()
                    - reportingAircraft.getCurrentAltitude()) < 1000) {
                reportingAircraft.climb(1000);
                currentAircraftUnderGuidance.warnOfAirspaceIntrusionBy(reportingAircraft);
            }
        }
    }

    @Override
    public void registerAircraftUnderGuidance(Aircraft aircraft) {
        if (!aircraftUnderGuidance.contains(aircraft)) {
            aircraftUnderGuidance.add(aircraft);
        }
    }
}
