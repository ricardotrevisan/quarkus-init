package br.dev.quant;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import io.quarkus.runtime.StartupEvent;

@Path("/trevis")
public class TrevisResource {
    private Logger LOGGER = Logger.getLogger(TrevisResource.class);
    
    @Inject
    TrevisService service;


    void init(@Observes StartupEvent event){
        LOGGER.info("Iniciando Resource");
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Trevis!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/injection/{message}")
    public String message(@PathParam String message){
        LOGGER.info("apresentando info: " + message);
        LOGGER.infof("apresentando info sobre %s: ", "Trevisan1: " + message);        
        LOGGER.debug("apresentando debug: " + message);
        return service.message(message);
    }
}