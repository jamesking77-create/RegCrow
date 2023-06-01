package africa.semicolon.Regcrow.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private BioData bioData;

    private String firstname;

    private String  lastname;

    @OneToOne
    private BankAccount bankAccount;

    private String profileImage;

    private LocalDateTime createdAt;
}
