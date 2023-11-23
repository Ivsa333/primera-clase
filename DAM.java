public class DAM {
    private int notaProgramacion;
    private int notaBaseDatos;
    private int notaLenguajeMarcas;
    private int notaFOL;
    private int notaEntornosDesarrollo;
    private int notaSistemasInformaticos;
    private int notaMedia;
    
    public DAM (int notaDeProgramacion, int notaDeBaseDatos, int notaDeLenguajeMarcas, int notaDeFOL, int notaDeEntornosDesarrollo, int notaDeSistemasInformaticos) {
        notaProgramacion = notaDeProgramacion;
        notaBaseDatos = notaDeBaseDatos;
        notaLenguajeMarcas = notaDeLenguajeMarcas;
        notaFOL = notaDeFOL;
        notaEntornosDesarrollo = notaDeEntornosDesarrollo;
        notaSistemasInformaticos = notaDeSistemasInformaticos;
    }
    public int getNotaMedia () {
        notaMedia = (notaProgramacion + notaBaseDatos + notaLenguajeMarcas + notaFOL + notaEntornosDesarrollo + notaSistemasInformaticos) / 6;
        return notaMedia;
    }
}