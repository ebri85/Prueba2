package com.ciclo.app.RestApp;

import com.ciclo.servicio.CicloServicio;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class RestApp extends Application {

    private Set<Object> singletons= new HashSet<Object>();

    public RestApp() {
        singletons.add(new CicloServicio());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
