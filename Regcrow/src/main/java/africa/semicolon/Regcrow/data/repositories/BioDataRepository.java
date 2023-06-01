package africa.semicolon.Regcrow.data.repositories;

import africa.semicolon.Regcrow.data.models.BioData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BioDataRepository extends JpaRepository<BioData, Long> {
}
