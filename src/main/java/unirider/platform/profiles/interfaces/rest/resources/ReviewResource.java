package unirider.platform.profiles.interfaces.rest.resources;

public record ReviewResource(Long id, Long driverId, Long passengerId, int rating, String comments) {
}
