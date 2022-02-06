package one.digitalinnovation.sppoapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConsortiumName {

    INTERSUL("InterSul"),
    INTERNORTE("InterNorte"),
    TRANSCARIOCA("Transcarioca"),
    SANTACRUZ("SantaCruz");

    private final String description;
}
