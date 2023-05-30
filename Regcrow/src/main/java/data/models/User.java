package data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User {
    private BioData bioData;
    private String firstname;
    private String  lastname;
    private String profileImage;
    private LocalDateTime createdAt;

}
