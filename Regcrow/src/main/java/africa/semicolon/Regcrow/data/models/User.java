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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private BioData bioData;

    private String firstname;

    private String  lastname;

    private String profileImage;

    private LocalDateTime createdAt;

}
