public class exercicio01 {
    public static void main(String[] args){
        double sb = 1000;
        double sbH = sb/160;
        int numHorasExtra = 10;
        double HorasExtra = numHorasExtra * sbH;
        double SalaroComHoraExtra = sb + (numHorasExtra * sbH);

        System.out.println("Salário base : " + sb);
        System.out.println("Salário Hora : " + sbH);
        System.out.println("Horas extras  : " + HorasExtra);
        System.out.println("Salario Horas extras : " + SalaroComHoraExtra);

    }
}
