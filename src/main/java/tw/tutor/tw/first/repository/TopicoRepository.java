package tw.tutor.tw.first.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.tutor.tw.first.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso);
}
