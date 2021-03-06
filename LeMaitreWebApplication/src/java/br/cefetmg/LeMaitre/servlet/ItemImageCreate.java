/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.LeMaitre.servlet;

import br.cefetmg.LeMaitre.model.dao.ItemImageDAO;
import br.cefetmg.LeMaitre.model.dao.ItemImageDAOImpl;
import br.cefetmg.LeMaitre.model.domain.ItemImage;
import br.cefetmg.LeMaitre.model.exception.BusinessException;
import br.cefetmg.LeMaitre.model.exception.PersistenceException;
import br.cefetmg.LeMaitre.model.service.ItemImageManagement;
import br.cefetmg.LeMaitre.model.service.ItemImageManagementImpl;
import br.cefetmg.LeMaitre.util.Result;
import br.cefetmg.LeMaitre.util.ServletUtil;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thalesgsn
 * url: http://localhost:8080/LeMaitreWebApplication/ItemImageCreate
 */
@WebServlet(name = "ItemImageCreate", urlPatterns = {"/ItemImageCreate"})
public class ItemImageCreate extends HttpServlet { 

    private ItemImageManagement itemImageManagement;
    private Result result;
    private ServletUtil util;
    private Gson gson;
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
        
        result = new Result();
        util = new ServletUtil();
        gson = new Gson();
        
        try {
            
            String payload = util.getJson(request);
            ItemImage itemImage = this.itemImageFromJson(payload);
            
            itemImageManagement = new ItemImageManagementImpl(ItemImageDAOImpl.getInstance());
            
            if(itemImageManagement.itemImageInsert(itemImage)){
                result.setStatusOK();
                result.setContent(itemImage);
            }
            
        } catch (BusinessException | PersistenceException ex) {
            result.setContent(ex.getMessage());
            result.setStatusBADREQUEST();
        }
        
        finally {
            PrintWriter writer = response.getWriter();
            writer.println(gson.toJson(result));
        }
    }
    
    private ItemImage itemImageFromJson(String str) {
        gson = new Gson();
        ItemImage itemImage = gson.fromJson(str, ItemImage.class);
        return itemImage;
    }
    
}