package de.hbrs.team89.se1_starter_repo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "level2Servlet", value = "/level2-servlet")
public class Level2Servlet extends ParkhausServlet {

    @Override
    String NAME(){
        return "Level2";
    }

    @Override
    int MAX(){ // maximum number of parking slots on level 2
        return 14;
    }

    @Override
    String config(){
        return "14,0,24,100,10"; // use new config
        // Config Format is "Max, open_from, open_to, delay, simulation_speed"
        // e.g. return this.MAX() + ",0,24,100,10";  // TODO replace by your own parameters
    }


}