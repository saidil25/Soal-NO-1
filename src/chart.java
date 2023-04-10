public class chart {
    String nama;
    int beban;


    public chart (String nama, int beban) {
        this.nama = nama;
        this.beban = beban;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBeban() {
        return beban;
    }

    public void setBeban(int beban) {
        this.beban = beban;
    }

    public double getpersen(){
        if (getBeban() == 5){
            return getBeban() * 5;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "chart{" +
                "nama='" + nama + '\'' +
                ", beban=" + beban +
                '}';
    }
}
