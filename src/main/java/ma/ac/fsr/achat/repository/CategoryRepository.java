package ma.ac.fsr.achat.repository;

import ma.ac.fsr.achat.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
