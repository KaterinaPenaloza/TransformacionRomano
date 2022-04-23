package modelo;

public class NumeroTrans {
    
    private int numero;

    public NumeroTrans() {
    }

    public NumeroTrans(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "NumeroTrans{" + "numero=" + numero + '}';
    }

    //Transformar a romano
    //Segun la pagina calcuworld.com, los numeros mayores a 3999
    //se les agrega una rayita arriba, cosa que no es posible aquí
    //así que solo transforma hasta el 3999 correctamente
    public static String toRoman(int num){
        int i, m, c, d, u;
        String numRomano = "";
        
        //Obtener la cifra
        m = num/1000;
        c = num/100%10;
        d = num/10%10;
        u = num%10;

        //unidad de millar
        if(m==9){
            numRomano = numRomano + "IX";
        }
        else if(m>=5){
            numRomano = numRomano + "V";
            for(i=6;i<=m;i++){
                numRomano = numRomano + "M";
            }
        }
        else if(m == 4){
            numRomano = numRomano + "IV";
        }
        else{
            for(i=1;i<=m;i++){
            numRomano = numRomano + "M";
            }
        }
        //centenas
        if(c == 9){
            numRomano = numRomano + "CM";
        }
        else if(c >= 5){
            numRomano = numRomano + "D";
            for(i=6;i<=c;i++){
                numRomano = numRomano + "C";
            }
        }
        else if(c == 4){
            numRomano = numRomano + "CD";
        }
        else{
            for(i=1;i<=c;i++){
                numRomano = numRomano + "C";
                  }
        }
        //decenas
        if(d == 9){
           numRomano = numRomano + "XC";
        }
        else if(d >= 5){
            numRomano = numRomano + "L";
            for(i=6;i<=d;i++){
                numRomano = numRomano + "X";
            }
        }
        else if(d == 4){
            numRomano = numRomano + "XL";
        }
        else{
            for(i=1;i<=d;i++){
                numRomano = numRomano + "X";
                    }
        }
        //unidades
        if(u == 9){
            numRomano = numRomano + "IX";
        }
        else if(u >= 5){
            numRomano = numRomano + "V";
            for(i=6;i<=u;i++){
                numRomano = numRomano + "I";
            }
        }
        else if(u == 4){
            numRomano = numRomano + "IV";
        }
        else{
            for(i=1;i<=u;i++){
                numRomano = numRomano + "I";
            }
        }
        return numRomano;
    }
}
