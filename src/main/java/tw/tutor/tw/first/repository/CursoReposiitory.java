package tw.tutor.tw.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.tutor.tw.first.model.Curso;

public interface CursoReposiitory extends JpaRepository<Curso, Long> {
}
