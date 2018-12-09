public class isp {
}

class Retangulo {

    private float largura;
    private float altura;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setWidth(float largura) {
        this.largura = largura;
    }

    public float getLargura() {
        return this.largura;
    }

    public float calcArea() {
        return (this.largura * this.altura);
    }

}