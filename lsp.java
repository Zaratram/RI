public class lsp {
}

class Arquivo
{
    public void gerar() {
        System.out.println("arq");
    };
}

class ArquivoWord extends Arquivo {
    public void gerar() {
        System.out.println("doc");
        // codigo para geracao do arquivo
    }
}

class ArquivoPdf extends Arquivo {
    public void gerar() {
        System.out.println("pdf");
        // codigo para geracao do arquivo
    }
}