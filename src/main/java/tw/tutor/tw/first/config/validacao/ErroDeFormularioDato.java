package tw.tutor.tw.first.config.validacao;

public class ErroDeFormularioDato {

    private String campo;
    private String erro;

    public ErroDeFormularioDato(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
