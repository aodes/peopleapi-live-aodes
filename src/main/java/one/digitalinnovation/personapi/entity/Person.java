package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // obriga a criar o campo
    private String firstName;

    @Column(nullable = false) // obriga a criar o campo
    private String lastName;

    @Column(nullable = false , unique = true) // obriga a criar o campo // tranforma o campo com dado unico, não sendo possível duplicar um CPF
    private String cpf;

    private LocalDate birthDate;

    @Column(nullable = false) // obriga a criar o campo
    @OneToMany(fetch = FetchType.LAZY , cascade = {CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE})
    private List<Phone> phones;
}
