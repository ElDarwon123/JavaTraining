package modulo3.Seguridad;

import java.util.Random;

public class Password {
    private int longitud;
    private String password;

    public Password(int longitud) {
        this.longitud = longitud;
        this.password = generar();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.password = generar();
    }

    public String getPassword() {
        return password;
    }

    public String generar() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int tipo = rand.nextInt(3);
            char ch;

            switch (tipo) {
                case 0:
                // minusculas
                    ch = (char) (rand.nextInt(26) + 97);
                    break;
                case 1:
                //  mayusculas
                    ch = (char) (rand.nextInt(26) + 65);
                    break;
                case 2:
                // numeros
                    ch = (char) (rand.nextInt(10) + 40);
                    break;
                default:
                    ch = ' ';
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public boolean validar() {
        int countMayus = 0, countMinus = 0, countNumeros = 0;

        for (char ch : password.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                countMinus++;
            } else if (ch >= 'A' && ch <= 'Z') {
                countMayus++;
            } else if (ch >= '0' && ch <= '9') {
                countNumeros++;
            }
        }

        return countNumeros >= 5 && countMinus >= 1 && countMayus >= 2;
    }

    public void imprimirValidacion() {
        if (validar()) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }
    
}
