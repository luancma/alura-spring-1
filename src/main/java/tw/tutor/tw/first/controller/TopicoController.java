package tw.tutor.tw.first.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.tutor.tw.first.controller.dto.TopicoDto;
import tw.tutor.tw.first.model.Topico;
import tw.tutor.tw.first.repository.TopicoRepository;

@Controller
public class TopicoController {

	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	@ResponseBody
	public List<TopicoDto> lista(String nomeCurso) {
		System.out.println(nomeCurso);
		if (nomeCurso == null) {
			List<Topico> topicos = topicoRepository.findAll();
			return TopicoDto.converter(topicos);
		}

		else {
			List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
			return TopicoDto.converter(topicos);
		}
	}

}
