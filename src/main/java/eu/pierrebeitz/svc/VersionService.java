package eu.pierrebeitz.svc;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VersionService {

    public String version() {
        return "1.2.3";
    }
}
