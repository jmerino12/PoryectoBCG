/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Yenis Rebolledo
 */
public class TablaBcg {

    private int id;
    private BigDecimal utilidadGeneral;
    private BigDecimal utilidadCompetidor;

    public TablaBcg() {
    }

    public TablaBcg(int id, BigDecimal utilidadGeneral, BigDecimal utilidadCompetidor) {
        this.id = id;
        this.utilidadGeneral = utilidadGeneral;
        this.utilidadCompetidor = utilidadCompetidor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getUtilidadGeneral() {
        return utilidadGeneral;
    }

    public void setUtilidadGeneral(BigDecimal utilidadGeneral) {
        this.utilidadGeneral = utilidadGeneral;
    }

    public BigDecimal getUtilidadCompetidor() {
        return utilidadCompetidor;
    }

    public void setUtilidadCompetidor(BigDecimal utilidadCompetidor) {
        this.utilidadCompetidor = utilidadCompetidor;
    }

}
