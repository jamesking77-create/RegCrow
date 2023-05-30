package data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BioData {
    @Id
    private Long id;
    private String email;
    private  String password;


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
