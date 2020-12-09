package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME,
    MOBILE,
    COMMERCIAL;

    //private final String description;

    //PhoneType(String description) {
    //    this.description = description;
    //}
}
