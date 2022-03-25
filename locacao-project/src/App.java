import enums.TipoEstadoCivil;
import model.Endereco;
import model.Motocicleta;
import model.PessoaFisica;
import model.Reserva;

public class App {
    public static void main(String[] args) throws Exception {
        Motocicleta motinha = new Motocicleta("Yamaha", "MT-03", "15915945", "JCL-2123", 2020, 2019, 16.6, 50.0, 60.0,
                2000.0, true, true, true, true, true, true, true);

        Reserva res = new Reserva(motinha);

        System.out.println(((Motocicleta) res.getVeiculo()).getControl());
    }
}
