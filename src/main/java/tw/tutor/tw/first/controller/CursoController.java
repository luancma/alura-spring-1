package tw.tutor.tw.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.tutor.tw.first.model.Curso;
import tw.tutor.tw.first.repository.CursoRepository;

import java.util.List;

        @RestController
        public class CursoController {

            @Autowired
            private CursoRepository cursoRepository;

            @RequestMapping("/cursos")
            public List<Curso> lista() {
                List<Curso> cursos = cursoRepository.findAll();
                return cursos;
    }
}
