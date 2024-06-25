package unirider.platform.iam.interfaces.rest.transform;

import unirider.platform.iam.domain.model.entities.Role;
import unirider.platform.iam.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {
    public static RoleResource toResourceFromEntity(Role role) {
        return new RoleResource(role.getId(), role.getStringName());
    }
}

