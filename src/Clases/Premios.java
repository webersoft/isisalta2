/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Santos
 */
public class Premios {
    private String fechapremio;
    private boolean gano;
    private TipoPremio tipopremio;
    private RubroPremio rubropremio;

    public Premios(String fechapremio, boolean gano, TipoPremio tipopremio, RubroPremio rubropremio) {
        this.fechapremio = fechapremio;
        this.gano = gano;
        this.tipopremio = tipopremio;
        this.rubropremio = rubropremio;
    }

    public String getFechapremio() {
        return fechapremio;
    }

    public void setFechapremio(String fechapremio) {
        this.fechapremio = fechapremio;
    }

    public boolean isGano() {
        return gano;
    }

    public void setGano(boolean gano) {
        this.gano = gano;
    }

    public TipoPremio getTipopremio() {
        return tipopremio;
    }

    public void setTipopremio(TipoPremio tipopremio) {
        this.tipopremio = tipopremio;
    }

    public RubroPremio getRubropremio() {
        return rubropremio;
    }

    public void setRubropremio(RubroPremio rubropremio) {
        this.rubropremio = rubropremio;
    }
    
}
