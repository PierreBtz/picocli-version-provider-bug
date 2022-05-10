package eu.pierrebeitz.provider;

import eu.pierrebeitz.svc.VersionService;
import picocli.CommandLine;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyVersionProvider implements CommandLine.IVersionProvider {

    private final VersionService versionService;

    public MyVersionProvider(VersionService versionService) {
        this.versionService = versionService;
    }

    @Override
    public String[] getVersion() {
        return new String[]{versionService.version()};
    }
}
