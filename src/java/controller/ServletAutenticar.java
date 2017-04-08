/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Autenticacion;
import model.ModeloConexion;

/**
 *
 * @author rapid
 */
public class ServletAutenticar extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        //Los pedimos del forlumario web
     String login=   request.getParameter("login");
     String password=request.getParameter("password");
        
        //Creamos el modelos
           
       boolean autenticado=   Autenticacion.autenticar(login, password);
      if(autenticado){
          RequestDispatcher despachador=
                  request.getRequestDispatcher("/bienvenido.html");
          despachador.forward(request, response);
      }  else{
           RequestDispatcher despachador=
                  request.getRequestDispatcher("/error.html"); 
          
      }       
    }
}