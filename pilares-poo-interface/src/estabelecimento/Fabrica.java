package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional eq = new EquipamentoMultifuncional();

        Impressora imp = eq;
        Digitalizadora dig = eq;
        Copiadora cop = eq;

        imp.imprimir();
        dig.digitalziar();
        cop.copiar();

    }
}
