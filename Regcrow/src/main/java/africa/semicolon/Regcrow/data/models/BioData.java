package africa.semicolon.Regcrow.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BioData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private  String password;





    // TODO: 5/30/2023 review the UUID methods to generate unique id...

//    public static void main(String[] args) {
//        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid);
//        UUID uuid2 = UUID.nameUUIDFromBytes("abcdefg...".getBytes());
//        System.out.println(uuid2);
//    }

    // TODO: 5/30/2023 review the overridden difference between equals and hashcode below..

//    @Override
//    public boolean equals(Object object){
//        if (object == null) return false;
//        if (this.getClass() != object.getClass()) return false;
//        BioData other = ((BioData) object);
//        if (this.email!= null&& other.getEmail() == null) return false;
//        assert this.email != null;
//        return this.email.equals(other.getEmail());
//    }
//
//    @Override
//    public int hashCode(){
//        return Objects.hash(this.email);
//    }
}
