public class Data {
    private byte dia, mes;
    private short ano;
    private String dataCompleta;
    
    public Data (byte dia, byte mes, short ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.dataCompleta = dia + "/" + mes + "/" + ano;
    }

    public byte getDia() {
        return dia;
    }
       
    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getDataCompleta() {
        return dataCompleta;
    }

}