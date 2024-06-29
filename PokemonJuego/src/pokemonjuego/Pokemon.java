/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonjuego;

/**
 *
 * @author jeffry.elizondo
 */
public class Pokemon {
    
    private String nombre;
    private String tipo;
    private int vida;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        setAttributes();
    }

    private void setAttributes() {
        switch (tipo) {
            case "Normal":
                this.vida = 150;
                this.ataque = 50;
                this.defensa = 35;
                this.ataqueEspecial = 70;
                this.defensaEspecial = 60;
                break;
            case "Fuego":
                this.vida = 115;
                this.ataque = 70;
                this.defensa = 45;
                this.ataqueEspecial = 80;
                this.defensaEspecial = 60;
                break;
            case "Agua":
                this.vida = 190;
                this.ataque = 55;
                this.defensa = 45;
                this.ataqueEspecial = 75;
                this.defensaEspecial = 65;
                break;
        }
    }

    // Getters para los atributos
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }
    
    
}
