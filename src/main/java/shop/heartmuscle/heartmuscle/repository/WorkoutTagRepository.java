package shop.heartmuscle.heartmuscle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.heartmuscle.heartmuscle.domain.WorkoutTag;

public interface WorkoutTagRepository extends JpaRepository<WorkoutTag, Long> {
}
