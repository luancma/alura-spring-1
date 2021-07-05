package tw.tutor.tw.first.controller.form;

import org.hibernate.validator.constraints.Length;
import tw.tutor.tw.first.model.Topico;
import tw.tutor.tw.first.repository.TopicoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizacaoTopicoForm {
    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String titulo;

    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Topico atualizar(Long id, TopicoRepository topicoRepository){
        Topico topico = topicoRepository.getById(id);

        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);
        return topico;
    }
}
