package dat3.securityDemo.repository;

import dat3.securityDemo.SpecialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialUserRepository extends JpaRepository<SpecialUser, String> {
}

