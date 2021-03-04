/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import java.io.IOException;
import java.math.BigInteger;
import javax.ejb.EJB;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import org.omnifaces.filter.HttpFilter;
//import org.omnifaces.filter.HttpFilter;
import org.omnifaces.util.Servlets;

/**
 *
 * @author BSUIR
 */
@WebFilter(filterName = "AuthFilter", urlPatterns = {
    "/faces/crud/*",
    "/faces/index.xhtml",
    "/faces/userindex.xhtml",
    "/faces/auth.xhtml",
    "/faces/findflight.xhtml"
})
public class AuthFilter extends HttpFilter {
    
    @EJB
    private sessions.AuthUserLocal userAuth;

    private String guestURL;
    private String userURL;
    private String userFindURL;
    private String adminURL;


    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response
            , FilterChain chain) throws IOException, ServletException {;
        getAddresses(request.getContextPath());
        if(userAuth.getCurrentUser() == null && !request.getRequestURI().equals(guestURL)){
            Servlets.facesRedirect(request, response, guestURL);
        }
        if(userAuth.getCurrentUser() != null) { 
            if(userAuth.getCurrentUser().getUserRole().equals(BigInteger.ZERO) 
                    && !request.getRequestURI().equals(userURL) && !request.getRequestURI().equals(userFindURL)){
                Servlets.facesRedirect(request, response, userURL);
            }
        }
        if(userAuth.getCurrentUser() != null && request.getRequestURI().equals(guestURL)){
            String redirectPath = userAuth.getCurrentUser().getUserRole().equals(BigInteger.ZERO)
                    ? userURL : adminURL;
            Servlets.facesRedirect(request, response, redirectPath);
        } 
        chain.doFilter(request, response); 
    }
    
    private void getAddresses(String basePath) {
        guestURL = basePath + "/faces/auth.xhtml";
        userURL = basePath + "/faces/userindex.xhtml";
        userFindURL = basePath + "/faces/findflight.xhtml";
        adminURL = basePath + "/faces/index.xhtml";        
    }

//    @Override
//    public void doFilter(HttpServletRequest hsr, HttpServletResponse hsr1, HttpSession hs, FilterChain fc) throws ServletException, IOException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
