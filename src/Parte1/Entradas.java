package Parte1;

import javax.swing.*;

public interface Entradas {
    static String alfanumerica(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(mensaje);
            if (entrada == null) {
                System.exit(0);
            }
            try {
                return entrada;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, revise el valor ingresado");
            }
        }
    }

    static Integer enteroPositivo(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null) {
                    System.exit(0);
                }
                int entrada = Integer.parseInt(input);
                if (entrada < 0) {
                    JOptionPane.showMessageDialog(null, "Error, el valor ingresado no puede ser negativo");
                    continue;
                }
                return entrada;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, el valor ingresado no es un número válido");
            }
        }
    }

    static Integer entero(String mensaje) {
        while (true) {
            try {
                Integer entrada = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if (entrada == null) {
                    System.exit(0);
                }
                return entrada;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, el valor ingresado no es un número válido");
            }
        }
    }

    static float flotantePositivo(String mensaje) {
        while (true) {
            try {
                Float entrada = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
                if (entrada == null) {
                    System.exit(0);
                }
                if (entrada < 0) {
                    JOptionPane.showMessageDialog(null, "Error, el valor ingresado no puede ser negativo");
                    continue;
                }
                return entrada;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, el valor ingresado no es un número válido");
            }
        }
    }
    static float flotante(String mensaje) {
        while (true) {
            try {
                Float entrada = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
                if (entrada == null) {
                    System.exit(0);
                }
                return entrada;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, el valor ingresado no es un número válido");
            }
        }
    }
}
