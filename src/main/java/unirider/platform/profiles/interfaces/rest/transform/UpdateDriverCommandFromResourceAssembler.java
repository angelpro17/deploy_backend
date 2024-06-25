package unirider.platform.profiles.interfaces.rest.transform;

import unirider.platform.profiles.domain.model.commands.UpdateDriverCommand;
import unirider.platform.profiles.interfaces.rest.resources.CreateDriverResource;


public class UpdateDriverCommandFromResourceAssembler {

    public static UpdateDriverCommand toCommandFromResource(CreateDriverResource resource, Long driverId) {
        UpdateDriverCommand command = new UpdateDriverCommand(
                driverId,
                resource.name(),
                resource.email(),
                resource.license(),
                resource.phone(),
                resource.imageProfile(),
                resource.description()
        );
        return command;
    }
}
