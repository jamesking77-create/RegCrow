package africa.semicolon.Regcrow.data.repositories;

import africa.semicolon.Regcrow.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
