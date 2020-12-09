package one.digitalinnovation.personapi.entity;

import lombok.*;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // obriga a criar o campo
    private PhoneType type;

    @Column(nullable = false) // obriga a criar o campo
    private String number;
}
