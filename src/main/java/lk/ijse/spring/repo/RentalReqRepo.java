package lk.ijse.spring.repo;

import lk.ijse.spring.entity.RentalReq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalReqRepo extends JpaRepository<RentalReq, String> {
}
