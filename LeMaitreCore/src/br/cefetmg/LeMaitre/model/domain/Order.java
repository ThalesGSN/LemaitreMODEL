/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.LeMaitre.model.domain;

/**
 *
 * @author Thalesgsn
 */
public class Order {
    private Long codIDBill;
    
    private Integer codItem;

    private char idtStatus;

    private Double vlrPrice;

    private String codToken;

    public Order() { }

    public Order(Long codIDBill, Integer codItem, char idtStatus,
            Double vlrPrice, String codToken) {
        this.codIDBill = codIDBill;
        this.codItem = codItem;
        this.idtStatus = idtStatus;
        this.vlrPrice = vlrPrice;
        this.codToken = codToken;
    }



    /**
     * Get the value of codIDBill
     *
     * @return the value of codIDBill
     */
    public Long getCodIDBill() {
        return codIDBill;
    }

    /**
     * Set the value of codIDBill
     *
     * @param codIDBill new value of codIDBill
     */
    public void setCodIDBill(Long codIDBill) {
        this.codIDBill = codIDBill;
    }
    
    /**
     * Get the value of codItem
     *
     * @return the value of codItem
     */
    public Integer getCodItem() {
        return codItem;
    }

    /**
     * Set the value of codItem
     *
     * @param codItem new value of codItem
     */
    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    /**
     * Get the value of idtStatus
     *
     * @return the value of idtStatus
     */
    public char getIdtStatus() {
        return idtStatus;
    }

    /**
     * Set the value of idtStatus
     *
     * @param idtStatus new value of idtStatus
     */
    public void setIdtStatus(char idtStatus) {
        this.idtStatus = idtStatus;
    }
    
    /**
     * Get the value of vlrPrice
     *
     * @return the value of vlrPrice
     */
    public Double getVlrPrice() {
        return vlrPrice;
    }

    /**
     * Set the value of vlrPrice
     *
     * @param vlrPrice new value of vlrPrice
     */
    public void setVlrPrice(Double vlrPrice) {
        this.vlrPrice = vlrPrice;
    }
    
    /**
     * Get the value of codToken
     *
     * @return the value of codToken
     */
    public String getCodToken() {
        return codToken;
    }

    /**
     * Set the value of codToken
     *
     * @param codToken new value of codToken
     */
    public void setCodToken(String codToken) {
        this.codToken = codToken;
    }
}
