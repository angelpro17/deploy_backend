package unirider.platform.profiles.interfaces.rest.transform;

import unirider.platform.profiles.domain.model.aggregates.Passenger;
import unirider.platform.profiles.interfaces.rest.resources.PassengerResource;


public class PassengerResourceFromEntityAssembler {

    public static PassengerResource toResourceFromEntity(Passenger passenger){
        return new PassengerResource(
                passenger.getId(),
                passenger.getName(),
                passenger.getEmail(),
                passenger.getDNI(),
                passenger.getPhone(),
                passenger.getPhoto()
        );
    }
}
